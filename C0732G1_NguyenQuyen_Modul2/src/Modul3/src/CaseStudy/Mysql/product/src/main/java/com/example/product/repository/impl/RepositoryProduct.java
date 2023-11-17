package com.example.product.repository.impl;

import com.example.product.model.ProductType;
import com.example.product.repository.DatabaseRepository;
import com.example.product.repository.IRepositoryProduct;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RepositoryProduct implements IRepositoryProduct {
    private final static  String INSERT= "insert into loai_san_pham(ma_loai_sp, ten_loai, mo_ta) values(?,?,?);";
    private final static String SELECT = "SELECT * FROM loai_san_pham;";
    private final static String FINDBYID = "SELECT * FROM loai_san_pham WHERE id = ?;";
    private final static String FINDBYNAME = "SELECT * FROM loai_san_pham WHERE id = ?;";
    private final static String UPDATE = "UPDATE loai_san_pham SET  ten_loai = ?, mo_ta= ? WHERE id = ?;";
    @Override
    public List<ProductType> findByName(String name) {
        Connection connection = DatabaseRepository.getConnection();
        List<ProductType> productTypeList=new ArrayList<>();
        ProductType productType;
        try {
            PreparedStatement preparedStatement= connection.prepareStatement(FINDBYID);
            preparedStatement.setString(1,name);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public ProductType selectProductType(int id) {
        Connection connection = DatabaseRepository.getConnection();
        ProductType productType = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(FINDBYID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                productType = new ProductType(resultSet.getInt("id"),
                        resultSet.getString("ma_loai_sp"),
                        resultSet.getString("ten_loai"),
                        resultSet.getString("mo_ta"));
            }
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productType;
    }


    @Override
    public List<ProductType> selectAllProduct() {
        Connection connection = DatabaseRepository.getConnection();
        List<ProductType> productList= new ArrayList<>();
        ProductType product;
            try {
                Statement statement= connection.createStatement();
                ResultSet resultSet= statement.executeQuery(SELECT);
                while (resultSet.next()){
                    int id= resultSet.getInt("id");
                    String typeName= resultSet.getString("ten_loai");
                    String describe= resultSet.getString("mo_ta");
                    product = new ProductType(id,typeName,describe);
                    productList.add(product);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return productList;
        }


    @Override
    public void insertProduct(ProductType product) {
        Connection connection = DatabaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement= connection.prepareStatement(INSERT);
            preparedStatement.setString(1, product.getProductCode());
            preparedStatement.setString(2, product.getTypeName());
            preparedStatement.setString(3, product.getDescribe());
            preparedStatement.executeUpdate();
            preparedStatement.close();
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

    @Override
    public boolean updateProductType(ProductType productType) {
        if (selectProductType(productType.getId()) == null) {
            return false;
        }
        Connection connection = DatabaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE);
            preparedStatement.setInt(3, productType.getId());
            preparedStatement.setString(1, productType.getTypeName());
            preparedStatement.setString(2, productType.getDescribe());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }
}
