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
    private final String SELECT_ALL = "select id,name,gender,point,classification from hoc_vien";

    @Override
    public List<Student> listStudent() {
        Connection connection = BaseRepository.getConnection();
        List<Student> studentList = new ArrayList<>();
        Student student = null;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_ALL);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String gender = resultSet.getString("gender");
                int point = resultSet.getInt("point");
                String classification = resultSet.getString("classification");
                student = new Student(id,name,gender,point,classification);
                studentList.add(student);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return studentList;
    }
}
