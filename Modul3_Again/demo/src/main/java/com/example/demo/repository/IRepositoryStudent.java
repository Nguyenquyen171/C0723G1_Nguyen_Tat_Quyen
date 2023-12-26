package com.example.demo.repository;

import com.example.demo.model.Student;

import java.awt.print.Book;
import java.util.List;

public interface IRepositoryStudent {
    List<Student> studentList();
    void createStudent(Student student);
    void deleteStudent(int id);
}
