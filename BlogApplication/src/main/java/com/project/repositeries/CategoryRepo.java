package com.project.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
