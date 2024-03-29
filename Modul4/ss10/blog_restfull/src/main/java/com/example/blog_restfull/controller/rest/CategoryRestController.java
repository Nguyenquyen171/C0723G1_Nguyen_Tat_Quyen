package com.example.blog_restfull.controller.rest;

import com.example.blog_restfull.model.Blog;
import com.example.blog_restfull.model.Category;
import com.example.blog_restfull.service.IBlogService;
import com.example.blog_restfull.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryRestController {
    @Autowired
    private ICategoryService categoryService;

    @Autowired
    private IBlogService blogService;

    // Find All Category
    @GetMapping
    public ResponseEntity<List<Category>> findAllCategory(){
        List<Category> categories = categoryService.findAllCategory();
        if (categories.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categories,HttpStatus.OK);
    }

    // Get Blogs By Category
    @GetMapping("/{id}")
    public ResponseEntity<List<Blog>> findAllBlogByCategoryId(@PathVariable Integer id){
        List<Blog> blogs = blogService.getBlogByCategoryId(id);
        if (blogs.isEmpty()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(blogs,HttpStatus.OK);
    }
}