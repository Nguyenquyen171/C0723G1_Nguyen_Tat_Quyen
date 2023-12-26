package com.example.demo.service.impl;

import com.example.demo.controller.ServletStudent;
import com.example.demo.model.Student;
import com.example.demo.repository.IRepositoryStudent;
import com.example.demo.repository.impl.RepositoryStudent;
import com.example.demo.service.IServiceStudent;

import java.util.List;

public class ServiceStudent implements IServiceStudent {

    @Override
    public List<Student> studentList() {
        return serviceStudent.studentList();
    }

    @Override
    public void createStudent(Student student) {
        serviceStudent.createStudent(student);
    }

    @Override
    public void deleteStudent(int id) {
        serviceStudent.deleteStudent(id);
    }

    private IRepositoryStudent serviceStudent= new RepositoryStudent();

}
