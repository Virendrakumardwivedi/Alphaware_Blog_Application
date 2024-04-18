package com.virendra.service;

import java.util.List;

import com.virendra.exceptions.CommentException;
import com.virendra.models.Comment;
import com.virendra.models.Post;

public interface CommentService {
	
	
    Comment addComment(Comment comment) throws CommentException;
    Comment getCommentById(int id)throws CommentException;
    List<Comment> getAllComments()throws CommentException;    
    Comment updateComment(int id, Comment updatedComment)throws CommentException;
    void deleteComment(int id)throws CommentException;

    
    Comment createComment(Integer postId, Comment comment)throws CommentException;
}
