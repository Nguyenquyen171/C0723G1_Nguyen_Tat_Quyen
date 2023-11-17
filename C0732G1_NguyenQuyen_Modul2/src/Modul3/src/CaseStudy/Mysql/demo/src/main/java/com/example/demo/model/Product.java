package com.example.demo.model;

public class Product {
    private int id;
    private String code;
    private String name;
    private String describe;

    public Product(int id, String code, String name, String describe) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.describe = describe;
    }

    public Product(int id, String name, String describe) {
        this.id = id;
        this.name = name;
        this.describe = describe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
