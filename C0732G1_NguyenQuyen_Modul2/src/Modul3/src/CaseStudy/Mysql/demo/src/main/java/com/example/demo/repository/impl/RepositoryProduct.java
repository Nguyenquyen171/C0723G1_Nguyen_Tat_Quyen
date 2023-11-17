package com.example.demo.repository.impl;

import com.example.demo.model.Product;
import com.example.demo.repository.DatabaseRepository;
import com.example.demo.repository.IRepositoryProduct;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RepositoryProduct implements IRepositoryProduct {
    private final static String SELECT = "SELECT * FROM loai_san_pham;";
    private final static  String INSERT= "insert into loai_san_pham(ma_loai_sp, ten_loai, mo_ta) values(?,?,?);";
    @Override
    public List<Product> productList() {
        Connection connection= DatabaseRepository.getConnection();
        List<Product> productList=new ArrayList<>();
        Product product;
        try {
            Statement statement= connection.createStatement();
            ResultSet resultSet= statement.executeQuery(SELECT);
            while (resultSet.next()){
               int id= resultSet.getInt("id");
               String name= resultSet.getString("ten_loai");
               String describe= resultSet.getString("mo_ta");
               product= new Product(id,name,describe);
               productList.add(product);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productList;
    }

    @Override
    public void insertProduct(Product product) {
        Connection connection= DatabaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement= connection.prepareStatement(INSERT);
            preparedStatement.setString(1, product.getCode());
            preparedStatement.setString(2, product.getName());
            preparedStatement.setString(3, product.getDescribe());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
