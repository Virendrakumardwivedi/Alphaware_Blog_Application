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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.virendra.exceptions.CategoryException;
import com.virendra.models.Category;
import com.virendra.service.CategoryService;

@Controller
@RequestMapping("/api/category")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	
	@PostMapping
	public ResponseEntity<Category> registerNewCategory(@RequestBody Category category)throws CategoryException{
		Category addCategory = categoryService.save(category);
		return new ResponseEntity<Category>(addCategory,HttpStatus.CREATED);	
	}
	
	
	@GetMapping
	public ResponseEntity<List<Category>> getAllPosts() throws CategoryException{	
		List<Category> Categorys = categoryService.findAllCategorys();
		return new ResponseEntity<List<Category>>(Categorys,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Category> findPostById(@PathVariable("id")Integer id)throws CategoryException{
		Category ca = categoryService.getCategoryById(id);
		return new ResponseEntity<Category>(ca,HttpStatus.OK);
	}
	
	
	 
	    @DeleteMapping("/{id}")
		public ResponseEntity<String> deleteProduct(@PathVariable("id") Integer id) throws  CategoryException{
		 
			String cat = categoryService.delete(id);
			
			return new ResponseEntity<String>(cat,HttpStatus.OK);
		}
	
	

}
