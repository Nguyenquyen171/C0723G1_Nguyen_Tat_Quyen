package com.example.product.service;


import com.example.product.model.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    void insert(CustomerType quanLyChatLieu);
    CustomerType select(String id);

    List<CustomerType> selectAll();

    boolean update(CustomerType quanLyChatLieu);

    List<CustomerType> selectAllByName(String name);

    int getIdByCode(String code);

    List<String> getAllName();

    boolean delete(int  id);

}
