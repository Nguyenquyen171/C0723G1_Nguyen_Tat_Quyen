package com.example.product.service.impl;


import com.example.product.model.CustomerType;
import com.example.product.repository.ICustomerTypeRepository;
import com.example.product.repository.impl.CustomerTypeRepository;
import com.example.product.service.ICustomerTypeService;

import java.util.List;

public class CustomerTypeService implements ICustomerTypeService {

    private static ICustomerTypeRepository customerTypeRepository = new CustomerTypeRepository();
    @Override
    public void insert(CustomerType customerType) {
        customerTypeRepository.insert(customerType);
    }

    @Override
    public CustomerType select(String id) {
        return customerTypeRepository.selectUser(id)                    ;
    }

    @Override
    public List<CustomerType> selectAll() {
        return customerTypeRepository.displayAll();
    }

    @Override
    public boolean update(CustomerType quanLyChatLieu) {
        return customerTypeRepository.update(quanLyChatLieu);
    }

    @Override
    public List<CustomerType> selectAllByName(String name) {
        return customerTypeRepository.selectAllByName(name);
    }

    @Override
    public int getIdByCode(String code) {
        return customerTypeRepository.getIdByCode(code);
    }

    @Override
    public List<String> getAllName() {
        return customerTypeRepository.getAllName();
    }

    @Override
    public boolean delete(int id) {
        return customerTypeRepository.delete(id);
    }

}
