package com.example.product.model;

public class CustomerAllDTO {
    private int id;
    private String customerCode;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String gender;
    private String userName;
    private String password;
    private String customerType;

    public CustomerAllDTO(int id, String customerCode, String name, String email, String phone, String address, String gender, String userName, String password, String customerType) {
        this.id = id;
        this.customerCode = customerCode;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.userName = userName;
        this.password = password;
        this.customerType = customerType;
    }

    public CustomerAllDTO(String customerCode, String name, String email, String phone, String address, String gender, String userName, String password, String customerType) {
        this.customerCode = customerCode;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.userName = userName;
        this.password = password;
        this.customerType = customerType;
    }

    public CustomerAllDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
}
