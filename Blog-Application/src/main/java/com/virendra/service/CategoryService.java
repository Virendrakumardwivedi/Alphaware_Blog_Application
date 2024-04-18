package com.virendra.service;

import java.util.List;

import com.virendra.exceptions.CategoryException;
import com.virendra.exceptions.PostException;
import com.virendra.models.Category;
import com.virendra.models.Post;

public interface CategoryService {
	
	
	Category save(Category category)throws CategoryException;
	public Category getCategoryById(Integer id) throws CategoryException;
	List<Category> findAllCategorys()throws CategoryException;
	public String delete(Integer id) throws CategoryException;


	

}
