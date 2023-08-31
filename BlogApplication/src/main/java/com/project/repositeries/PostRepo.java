package com.project.repositeries;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.Category;
import com.project.model.Post;
import com.project.model.User;

public interface PostRepo extends JpaRepository<Post, Integer>{

	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	
}
