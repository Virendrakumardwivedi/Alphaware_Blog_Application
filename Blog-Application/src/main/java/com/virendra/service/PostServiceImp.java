package com.virendra.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virendra.exceptions.PostException;
import com.virendra.models.Post;
import com.virendra.repo.PostRepo;

@Service
public class PostServiceImp implements PostService {
	
	@Autowired
	private PostRepo postRepo;

	

	@Override
	public List<Post> findAll() throws PostException {
		List<Post> list = postRepo.findAll();
		if(list.size()==0) {
			throw new PostException("post is not present..!");
			
		}
		return list;
	}

	@Override
	public Post save(Post post) throws PostException {
		return postRepo.save(post);
	}

	@Override
	public String delete(Integer id) throws PostException {
		String message= " Product not found";
		Optional<Post> opt = postRepo.findById(id);
		
		if(opt.isPresent()) {
			Post po = opt.get();
			postRepo.delete(po);
			message = "Post is  deleted";
			
		}else {
			throw new PostException("post not exixt");
		}
		return message;
		
	}

	@Override
	public Post getPostById(Integer id) throws PostException {
		Optional<Post> opt = postRepo.findById(id);
		if(opt.isPresent()) {
			Post p= opt.get();
			return p;
		}else {
			throw new PostException("Post not exist in this id "+id);
		}
	}

	public Post updatePost(Integer id, Post updatedPost) throws PostException {
        Optional<Post> optionalPost = postRepo.findById(id);
        
        // Check if the post exists
        if (optionalPost.isPresent()) {
            Post postToUpdate = optionalPost.get();
            postToUpdate.setTitle(updatedPost.getTitle());
            postToUpdate.setContent(updatedPost.getContent());
            postToUpdate.setImageName(updatedPost.getImageName());
            return postRepo.save(postToUpdate);
        } else {
            throw new PostException("Post not found with id: " + id);
        }
    }
	
	
	

}
