package com.example.managerproduct.repository;

import com.example.managerproduct.model.Product;
import java.util.List;

public interface IProductRepo {
    List<Product> displayList();
    void addProduct(Product product);
    Product findById(int id);
    void editProduct(Product product);
    void deleteProduct(int id);
}
