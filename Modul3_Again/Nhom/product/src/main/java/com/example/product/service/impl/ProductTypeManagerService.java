package com.example.product.service.impl;

import com.example.product.model.ProductTypeManager;
import com.example.product.repository.IProductTypeManagerRepo;
import com.example.product.repository.impl.ProductTypeManagerRepo;
import com.example.product.service.IProductTypeManagerService;

import java.util.List;

public class ProductTypeManagerService implements IProductTypeManagerService {
    private final IProductTypeManagerRepo productTypeManagerRepo = new ProductTypeManagerRepo();
    @Override
    public List<ProductTypeManager> findByName(String name) {
        return productTypeManagerRepo.findByName(name);
    }

    @Override
    public List<ProductTypeManager> selectAllProduct() {
        return productTypeManagerRepo.selectAllProduct();
    }

    @Override
    public void insertProduct(ProductTypeManager product) {
        productTypeManagerRepo.insertProduct(product);
    }

    @Override
    public boolean updateProductType(ProductTypeManager productType) {
        return productTypeManagerRepo.updateProductType(productType);
    }

    @Override
    public ProductTypeManager selectProductType(int id) {
        return productTypeManagerRepo.selectProductType(id);
    }
}
