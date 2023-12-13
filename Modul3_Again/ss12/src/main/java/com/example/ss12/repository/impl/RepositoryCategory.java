package com.example.ss12.repository.impl;

import com.example.ss12.model.Category;
import com.example.ss12.repository.BaseRepository;
import com.example.ss12.repository.IRepositoryCategory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RepositoryCategory implements IRepositoryCategory {

    public static final String SELECT = "select * from category";

    @Override
    public List<Category> listCategory() {
        List<Category> categoryList = new ArrayList<>();
        Connection connection = BaseRepository.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                categoryList.add(new Category(id, name));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return categoryList;
    }


}
