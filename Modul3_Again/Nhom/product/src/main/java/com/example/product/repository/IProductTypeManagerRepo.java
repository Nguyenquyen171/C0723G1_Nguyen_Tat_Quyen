package com.example.product.repository;

import com.example.product.model.ProductTypeManager;

import java.util.List;

public interface IProductTypeManagerRepo {
    List<ProductTypeManager> findByName(String name);
    List<ProductTypeManager> selectAllProduct();
    void insertProduct( ProductTypeManager product);
    ProductTypeManager selectProductType(int id );
    boolean updateProductType(ProductTypeManager productType);
}
