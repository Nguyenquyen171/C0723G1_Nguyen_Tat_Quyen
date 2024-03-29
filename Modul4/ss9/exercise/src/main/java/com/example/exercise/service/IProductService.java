package com.example.exercise.service;


import com.example.exercise.model.Product;

import java.util.Optional;
public interface IProductService {
    Iterable<Product> findAll();
    void saveProduct(Product product);
    Optional<Product> findById(Long id);
}