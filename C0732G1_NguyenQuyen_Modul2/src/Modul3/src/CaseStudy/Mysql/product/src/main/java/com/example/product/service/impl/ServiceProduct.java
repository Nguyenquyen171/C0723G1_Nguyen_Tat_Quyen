package com.example.product.service.impl;

import com.example.product.model.ProductType;
import com.example.product.repository.IRepositoryProduct;
import com.example.product.repository.impl.RepositoryProduct;
import com.example.product.service.IServiceProduct;

import java.util.List;

public class ServiceProduct implements IServiceProduct {

    private final IRepositoryProduct repositoryProduct= new  RepositoryProduct();

    @Override
    public List<ProductType> findByName(String name) {
        return repositoryProduct.findByName(name);
    }

    @Override
    public List<ProductType> selectAllProduct() {
        return repositoryProduct.selectAllProduct();
    }

    @Override
    public void insertProduct(ProductType product) {
        repositoryProduct.insertProduct(product);
    }

    @Override
    public boolean updateProductType(ProductType productType) {
        return repositoryProduct.updateProductType(productType);
    }

    @Override
    public ProductType selectProductType(int id) {
        return repositoryProduct.selectProductType(id);
    }
}
