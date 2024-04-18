package com.virendra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.virendra.exceptions.PostException;
import com.virendra.models.Post;
import com.virendra.models.UserInfo;
import com.virendra.repo.UserInfoRepository;
import com.virendra.service.PostService;

@Controller
@RequestMapping("/api/posts")
public class PostController {
	
	@Autowired
	private PostService poService;
	@Autowired
	private UserInfoRepository userService;
	
	
//	@PostMapping
//	public ResponseEntity<Post> registerPost(@RequestBody Post post)throws PostException{
//		Post addPost = poService.save(post);
//		return new ResponseEntity<Post>(addPost,HttpStatus.CREATED);	
//	}
	
	@PostMapping
	public ResponseEntity<Post> registerPost(@RequestBody Post post) {
	    try {
	        // Save the UserInfo first if it's not already saved
	        if (post.getUser() != null && post.getUser().getId() == null) {
	            UserInfo savedUser = userService.save(post.getUser());
	            post.setUser(savedUser);
	        }

	        Post savedPost = poService.save(post);
	        
	        return ResponseEntity.ok(savedPost);
	    } catch (Exception e) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	    }
	}
	
	
	@GetMapping
	public ResponseEntity<List<Post>> getAllPosts() throws PostException{	
		List<Post> posts = poService.findAll();
		return new ResponseEntity<List<Post>>(posts,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Post> findPostById(@PathVariable("id")Integer id)throws PostException{
		Post pro = poService.getPostById(id);
		return new ResponseEntity<Post>(pro,HttpStatus.OK);
	}
	
	
	 
	 @DeleteMapping("/{id}")
		public ResponseEntity<String> deleteProduct(@PathVariable("id") Integer id) throws  PostException{
		 
			String post = poService.delete(id);
			
			return new ResponseEntity<String>(post,HttpStatus.OK);
		}
	 
	 @PutMapping("/{id}")
	    public ResponseEntity<Post> updatePost(@PathVariable("id") Integer id, @RequestBody Post updatedPost) {
	        try {
	            Post updated = poService.updatePost(id, updatedPost);
	            return new ResponseEntity<>(updated, HttpStatus.OK);
	        } catch (PostException e) {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	
	

}

