package com.example.demo.service;

import com.example.demo.model.Product;

import java.util.List;

public interface IServiceProduct {
    List<Product> productList();
    void insertProduct(Product product);
}
