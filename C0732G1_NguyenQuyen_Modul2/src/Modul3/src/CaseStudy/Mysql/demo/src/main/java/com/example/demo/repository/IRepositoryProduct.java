package com.example.demo.repository;

import com.example.demo.model.Product;

import java.util.List;

public interface IRepositoryProduct {
    List<Product> productList();
    void insertProduct(Product product);

}
