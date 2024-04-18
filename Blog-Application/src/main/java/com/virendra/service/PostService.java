package com.virendra.service;

import java.util.List;
import java.util.Optional;
import com.virendra.exceptions.PostException;
import com.virendra.models.Post;

public interface PostService {
	
    public Post getPostById(Integer id) throws PostException;

	List<Post> findAll()throws PostException;
	Post save(Post post)throws PostException;
	public String delete(Integer id) throws PostException;
	 public Post updatePost(Integer id, Post updatedPost) throws PostException;
	




}
