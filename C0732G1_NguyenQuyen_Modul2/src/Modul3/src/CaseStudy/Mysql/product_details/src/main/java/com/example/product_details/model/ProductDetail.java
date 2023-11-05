package com.example.product_details.model;

public class ProductDetail {
//    SELECT sp.ma_san_pham, sp.ten_san_pham, sp.gia, sp.so_luong, cl.ten, s.mo_ta  FROM san_pham sp
//    join chat_lieu cl on cl.id = sp.id_chat_lieu
//    join size s on s.id= sp.id_size;
    private String id;
    private String nameProduct;
    private float price;
    private int quantity;
    private String material;
    private String detail;

    public ProductDetail(String id, String nameProduct, float price, int quantity, String material, String detail) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.quantity = quantity;
        this.material = material;
        this.detail = detail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
