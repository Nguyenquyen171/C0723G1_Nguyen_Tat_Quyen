package com.example.product_details.repository;

import com.example.product_details.model.ProductDetail;

import java.util.List;

public interface IRepositoryProductDetail {
    List<ProductDetail> selectAllProductDetail();
}
