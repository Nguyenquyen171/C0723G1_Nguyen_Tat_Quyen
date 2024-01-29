package com.example.blog_restfull.service;


import com.example.blog_restfull.model.Blog;
import com.example.blog_restfull.model.Category;
import com.example.blog_restfull.repository.ICategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private ICategoryRepo categoryRepo;
    @Override
    public List<Category> findAllCategory() {
        return categoryRepo.findAll();
    }

    @Override
    public Page<Category> findAllCategory(Pageable pageable) {
        return categoryRepo.findAll(pageable);
    }

    @Override
    public void createCategory(Category category) {
        categoryRepo.save(category);
    }

    @Override
    public void updateCategory(Category category) {
        categoryRepo.save(category);
    }

    @Override
    public void deleteCategory(Integer id) {
        categoryRepo.delete(findCategoryById(id));
    }

    @Override
    public Category findCategoryById(Integer id) {
        return categoryRepo.findById(id).get();
    }
}