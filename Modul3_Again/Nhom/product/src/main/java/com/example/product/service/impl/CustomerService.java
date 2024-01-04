package com.example.product.service.impl;

import com.example.product.model.CustomerAllDTO;
import com.example.product.repository.ICustomerRepository;
import com.example.product.repository.impl.CustomerRepository;
import com.example.product.service.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    private ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public List<CustomerAllDTO> findAllCustomer() {
        return customerRepository.findAllCustomer();
    }

    @Override
    public CustomerAllDTO getCustomerByCode(String code) {
        return customerRepository.getCustomerByCode(code);
    }

    @Override
    public void insertCustomer(CustomerAllDTO customerAllDTO) {
        customerRepository.insertCustomer(customerAllDTO);
    }

    @Override
    public int getIdByUserName(String userName) {
        return customerRepository.getIdByUserName(userName);
    }
}
