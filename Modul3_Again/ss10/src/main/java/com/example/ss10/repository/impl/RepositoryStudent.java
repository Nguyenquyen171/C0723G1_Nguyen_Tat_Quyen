package com.example.ss10.repository.impl;

import com.example.ss10.model.Student;
import com.example.ss10.repository.BaseRepository;
import com.example.ss10.repository.IRepositoryStudent;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RepositoryStudent implements IRepositoryStudent {
    @Override
    public List<Student> listStudent() {
        Connection connection= BaseRepository.getConnection();
        List<Student> studentList= new ArrayList<>();
        Student student= null;
        try {
            Statement statement= connection.createStatement();
            ResultSet resultSet= statement.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return null;
    }
}
