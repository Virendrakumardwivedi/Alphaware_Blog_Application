package com.virendra.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virendra.exceptions.CategoryException;
import com.virendra.models.Category;
import com.virendra.repo.CategoryRepo;

@Service
public class CategoryImp implements CategoryService{
	
	@Autowired
	private CategoryRepo categoryRepo;

	@Override
	public Category save(Category category) throws CategoryException {
		// TODO Auto-generated method stub
		return categoryRepo.save(category);
	}

	@Override
	public Category getCategoryById(Integer id) throws CategoryException {
		Optional<Category> opt = categoryRepo.findById(id);
		if(opt.isPresent()) {
			Category c= opt.get();
			return c;
		}else {
			throw new CategoryException("category not exist in this id "+id);
		}
	}

	@Override
	public List<Category> findAllCategorys() throws CategoryException {
		
		List<Category> list = categoryRepo.findAll();
		if(list.size()==0) {
			throw new CategoryException("Category is not present..!");	
		}
		return list;
	}

	@Override
	public String delete(Integer id) throws CategoryException {
		
		
		String message= " Catogry not found";
		Optional<Category> opt = categoryRepo.findById(id);
		
		if(opt.isPresent()) {
			Category ca = opt.get();
			categoryRepo.delete(ca);
			message = "category is deleted ";
			
		}else {
			throw new CategoryException("category not exixt");
		}
		return message;
	}

}
