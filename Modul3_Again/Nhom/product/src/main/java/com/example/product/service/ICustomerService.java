package com.example.product.service;

import com.example.product.model.CustomerAllDTO;

import java.util.List;

public interface ICustomerService {
    List<CustomerAllDTO> findAllCustomer();
    CustomerAllDTO getCustomerByCode(String code);
    void insertCustomer(CustomerAllDTO customerAllDTO);

    int getIdByUserName(String userName);
}
