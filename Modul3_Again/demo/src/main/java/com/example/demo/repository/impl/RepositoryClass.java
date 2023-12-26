package com.example.demo.repository.impl;

import com.example.demo.model.StudentClass;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.IRepositoryClass;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RepositoryClass implements IRepositoryClass {
public static final String SELECT="select *  from class";

    @Override
    public List<StudentClass> classList() {
        Connection connection= BaseRepository.getConnection();
        List<StudentClass> classList= new ArrayList<>();
        try {
            Statement statement= connection.createStatement();
            ResultSet resultSet= statement.executeQuery("SELECT");
            while (resultSet.next()){
                int id= resultSet.getInt("id_class");
                String name= resultSet.getString("name_class");
                classList.add(new StudentClass(id,name));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return classList;
    }
}
