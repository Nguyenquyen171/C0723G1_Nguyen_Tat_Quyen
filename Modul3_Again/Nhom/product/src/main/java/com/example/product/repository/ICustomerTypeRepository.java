package com.example.product.repository;


import com.example.product.model.CustomerType;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerTypeRepository {
    void insert(CustomerType quanLyChatLieu);
    CustomerType selectUser(String id);

    boolean update(CustomerType quanLyChatLieu);

    List<CustomerType> displayAll();

    List<CustomerType> search(String word) throws SQLException;

    List<CustomerType> selectAllByName(String word);

    int getIdByCode(String code);

    List<String> getAllName();

    boolean delete(int  id);
}
