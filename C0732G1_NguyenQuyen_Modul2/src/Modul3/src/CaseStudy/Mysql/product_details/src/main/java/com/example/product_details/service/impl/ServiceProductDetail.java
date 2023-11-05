package com.example.product_details.service.impl;

import com.example.product_details.model.ProductDetail;
import com.example.product_details.repository.IRepositoryProductDetail;
import com.example.product_details.repository.impl.RepositoryProductDetail;
import com.example.product_details.service.IServiceProductDetail;

import java.util.List;

public class ServiceProductDetail implements IServiceProductDetail {
    private final IRepositoryProductDetail repositoryProductDetail=  new  RepositoryProductDetail();

    @Override
    public List<ProductDetail> selectAllProductDetail() {
        return repositoryProductDetail.selectAllProductDetail();
    }
}
