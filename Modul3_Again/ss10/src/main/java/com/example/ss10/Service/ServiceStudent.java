package com.example.ss10.Service;

import com.example.ss10.model.Student;
import com.example.ss10.repository.IRepositoryStudent;
import com.example.ss10.repository.impl.RepositoryStudent;

import java.util.List;

public class ServiceStudent implements IServiceStudent{
    private IRepositoryStudent repositoryStudent= new RepositoryStudent();

    @Override
    public List<Student> listStudent() {
        return repositoryStudent.listStudent();
    }
}
