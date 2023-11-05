package com.example.product_details.repository.impl;

import com.example.product_details.model.ProductDetail;
import com.example.product_details.repository.DatabaseRepository;
import com.example.product_details.repository.IRepositoryProductDetail;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RepositoryProductDetail implements IRepositoryProductDetail {
    private final String SELECT = "SELECT sp.ma_san_pham, sp.ten_san_pham, sp.gia, sp.so_luong, cl.ten, s.mo_ta  FROM san_pham sp\n" +
            "    join chat_lieu cl on cl.id = sp.id_chat_lieu\n" +
            "    join size s on s.id= sp.id_size;";

    @Override
    public List<ProductDetail> selectAllProductDetail() {
        Connection connection = DatabaseRepository.getConnection();
        List<ProductDetail> productDetailList = new ArrayList<>();
        ProductDetail productDetail;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT);
            while (resultSet.next()) {
                String id = resultSet.getString("ma_san_pham");
                String nameProduct= resultSet.getString("ten_san_pham");
                float price=resultSet.getFloat("gia");
                int quantity= resultSet.getInt("so_luong");
                String material= resultSet.getString("ten");
                String detail= resultSet.getString("mo_ta");
                productDetail=new ProductDetail(id,nameProduct,price,quantity,material,detail);
                productDetailList.add(productDetail);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
