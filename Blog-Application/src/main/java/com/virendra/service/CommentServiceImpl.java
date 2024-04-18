package com.virendra.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.virendra.exceptions.CommentException;
import com.virendra.models.Comment;
import com.virendra.models.Post;
import com.virendra.repo.CommentRepo;
import com.virendra.repo.PostRepo;

@Service
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	private CommentRepo commentRepo;
	@Autowired
	private PostRepo postRepo;
	

	@Override
	public Comment addComment(Comment comment) throws CommentException {
		 return commentRepo.save(comment);
	}

	@Override
	public Comment getCommentById(int id) throws CommentException {
		return commentRepo.findById(id).orElse(null);
	}

	@Override
	public List<Comment> getAllComments() throws CommentException {
		return commentRepo.findAll();
	}

	@Override
	public Comment updateComment(int id, Comment updatedComment) throws CommentException {
		 Comment existingComment = commentRepo.findById(id).orElse(null);
	        if (existingComment != null) {
	            existingComment.setContent(updatedComment.getContent());
	            return commentRepo.save(existingComment);
	        }
	        return null; // O
	}

	@Override
	public void deleteComment(int id) throws CommentException {
		commentRepo.deleteById(id);
		
	}

	 @Override
	    public Comment createComment(Integer postId, Comment comment)  throws CommentException{
		 
	        Optional<Post> optionalPost = postRepo.findById(postId);
	        if (optionalPost.isPresent()) {
	            Post post = optionalPost.get();
	            // Step 2: Set the retrieved post for the comment
	            comment.setPost(post);
	            // Step 3: Save the comment to the database
	            return commentRepo.save(comment);
	        } else {
	            throw new CommentException();
	        }
	    }

}
