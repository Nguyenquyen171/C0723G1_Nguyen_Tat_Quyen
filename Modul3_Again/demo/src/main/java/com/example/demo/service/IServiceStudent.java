package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface IServiceStudent {
    List<Student> studentList();
    void createStudent(Student student);
    void deleteStudent(int id);
}
