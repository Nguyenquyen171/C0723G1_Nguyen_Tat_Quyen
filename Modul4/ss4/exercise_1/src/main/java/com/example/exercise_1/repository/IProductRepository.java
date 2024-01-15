package com.example.exercise_1.repository;

import com.example.exercise_1.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> showList();
    void create(Product product);
    void update(int id, Product product);
    void remove(int id);
    Product findById(int id);
    List<Product> searchByName(String nameProduct);

}
