package com.example.managerproduct.service;

import com.example.managerproduct.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> displayList();
    void addProduct(Product product);
    Product findById(int id);
    void editProduct(Product product);
    void deleteProduct(int id);

    List<Product> findByName(String name);

}
