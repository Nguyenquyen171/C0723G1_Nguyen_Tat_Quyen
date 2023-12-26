package com.example.demo.service.impl;

import com.example.demo.model.StudentClass;
import com.example.demo.repository.IRepositoryClass;
import com.example.demo.repository.impl.RepositoryClass;
import com.example.demo.service.IServiceClass;

import java.util.List;

public class ServiceClass implements IServiceClass {
    private final IRepositoryClass repositoryClass= new RepositoryClass();

    @Override
    public List<StudentClass> classList() {
        return repositoryClass.classList();
    }
}
