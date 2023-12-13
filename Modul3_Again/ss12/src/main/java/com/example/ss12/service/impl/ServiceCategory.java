package com.example.ss12.service.impl;

import com.example.ss12.model.Category;
import com.example.ss12.repository.IRepositoryCategory;
import com.example.ss12.repository.impl.RepositoryCategory;
import com.example.ss12.service.IServiceCategory;

import java.util.List;

public class ServiceCategory implements IServiceCategory {
    private final IRepositoryCategory serviceCategory= new RepositoryCategory() {
    };

    @Override
    public List<Category> listCategory() {
        return serviceCategory.listCategory();
    }

}
