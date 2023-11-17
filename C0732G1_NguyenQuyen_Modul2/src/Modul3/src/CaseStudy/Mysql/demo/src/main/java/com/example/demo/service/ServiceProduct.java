package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.IRepositoryProduct;
import com.example.demo.repository.impl.RepositoryProduct;

import java.util.List;

public class ServiceProduct  implements IServiceProduct{
    private final IRepositoryProduct repositoryProduct= new RepositoryProduct();

    @Override
    public List<Product> productList() {
        return repositoryProduct.productList();
    }

    @Override
    public void insertProduct(Product product) {
        repositoryProduct.insertProduct(product);
    }
}
