package com.example.exercise.service;

import com.example.exercise.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> showList();
    void create(Product product);
    void update(int id, Product product);
    void remove(int id);
    Product findById(int id);
    List<Product> searchByName(String nameProduct);
}
