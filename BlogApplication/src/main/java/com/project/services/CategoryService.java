package com.project.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.payloads.CategoryDto;

public interface CategoryService {

	CategoryDto createCategory(CategoryDto categoryDto);
	CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
	void deleteCategory(Integer categoryId);
	List<CategoryDto> getAllCategories();
	CategoryDto getCategoryById(Integer categoryId);
	
}
