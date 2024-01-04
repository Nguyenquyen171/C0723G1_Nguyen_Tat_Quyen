package com.example.product.repository;

import com.example.product.model.CustomerAllDTO;

import java.util.List;

public interface ICustomerRepository {
    List<CustomerAllDTO> findAllCustomer();

    CustomerAllDTO getCustomerByCode(String code);

    void insertCustomer(CustomerAllDTO customerAllDTO);

    int getIdByUserName(String userName);
}
