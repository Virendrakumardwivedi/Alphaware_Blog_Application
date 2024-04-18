package com.virendra.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virendra.models.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
