package com.example.product.model;

public class ProductType {
    private int id;
    private String  productCode ;
    private String typeName;
    private String describe;

    public ProductType(int id, String productCode, String typeName, String describe) {
        this.id = id;
        this.productCode = productCode;
        this.typeName = typeName;
        this.describe = describe;
    }
    public ProductType(String productCode, String typeName, String describe) {
        this.productCode = productCode;
        this.typeName = typeName;
        this.describe = describe;
    }
    public ProductType(int id, String typeName, String describe) {
        this.id = id;
        this.typeName = typeName;
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

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
