package com.example.product.repository;

import com.example.product.model.ProductType;

import java.util.List;

public interface IRepositoryProduct {
    List<ProductType> findByName(String name);
    List<ProductType> selectAllProduct();
    void insertProduct( ProductType product);
    ProductType selectProductType(int id );
    boolean updateProductType(ProductType productType);

}
