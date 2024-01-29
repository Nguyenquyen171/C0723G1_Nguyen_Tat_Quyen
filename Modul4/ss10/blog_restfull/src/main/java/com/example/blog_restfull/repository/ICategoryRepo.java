package com.example.blog_restfull.repository;



import com.example.blog_restfull.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepo extends JpaRepository<Category,Integer> {
}