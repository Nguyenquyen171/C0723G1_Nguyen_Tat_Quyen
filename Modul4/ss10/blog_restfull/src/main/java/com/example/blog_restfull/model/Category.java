package com.example.blog_restfull.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "category_blog")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @JsonManagedReference
    @OneToMany(mappedBy = "category")
    private Set<Blog> blog;

    public Category() {
    }

    public Category(Integer id, String name, Set<Blog> blog) {
        this.id = id;
        this.name = name;
        this.blog = blog;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Blog> getBlog() {
        return blog;
    }

    public void setBlog(Set<Blog> blog) {
        this.blog = blog;
    }
}