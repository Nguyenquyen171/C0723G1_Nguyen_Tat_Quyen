package com.example.product.model;

import java.util.List;

public class Product {
    private int id;
    private String productCode;
    private String productName;
    private String material;
    private String productType;
    private String size;
    private int quantity;
    private int price;
    private String describe;

    public Product() {
    }

    public Product(int id, String productCode, String productName, String material, String productType, String size, int quantity, int price, String describe) {
        this.id = id;
        this.productCode = productCode;
        this.productName = productName;
        this.material = material;
        this.productType = productType;
        this.size = size;
        this.quantity = quantity;
        this.price = price;
        this.describe = describe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
