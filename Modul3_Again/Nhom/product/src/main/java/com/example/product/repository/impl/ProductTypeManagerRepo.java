package com.example.product.repository.impl;

import com.example.product.model.ProductTypeManager;
import com.example.product.repository.IProductTypeManagerRepo;
import com.example.product.utils.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductTypeManagerRepo implements IProductTypeManagerRepo {
    private final static  String INSERT= "insert into loai_san_pham(ma_loai_sp, ten_loai, mo_ta) values(?,?,?);";
    private final static String SELECT = "SELECT * FROM loai_san_pham;";
    private final static String FINDBYID = "SELECT * FROM loai_san_pham WHERE id = ?;";
    private final static String UPDATE = "UPDATE loai_san_pham SET  ten_loai = ?, mo_ta= ? WHERE id = ?;";
    @Override
    public List<ProductTypeManager> findByName(String name) {
        return null;
    }

    @Override
    public ProductTypeManager selectProductType(int id) {
        Connection connection = Util.getConnectDB();
        ProductTypeManager productType = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(FINDBYID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                productType = new ProductTypeManager(resultSet.getInt("id"),
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
    public List<ProductTypeManager> selectAllProduct() {
        Connection connection = Util.getConnectDB();
        List<ProductTypeManager> productList= new ArrayList<>();
        ProductTypeManager product;
        try {
            Statement statement= connection.createStatement();
            ResultSet resultSet= statement.executeQuery(SELECT);
            while (resultSet.next()){
                int id= resultSet.getInt("id");
                String typeName= resultSet.getString("ten_loai");
                String describe= resultSet.getString("mo_ta");
                product = new ProductTypeManager(id,typeName,describe);
                productList.add(product);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productList;
    }


    @Override
    public void insertProduct(ProductTypeManager product) {
        Connection connection = Util.getConnectDB();
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
    public boolean updateProductType(ProductTypeManager productType) {
        if (selectProductType(productType.getId()) == null) {
            return false;
        }
        Connection connection = Util.getConnectDB();
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
