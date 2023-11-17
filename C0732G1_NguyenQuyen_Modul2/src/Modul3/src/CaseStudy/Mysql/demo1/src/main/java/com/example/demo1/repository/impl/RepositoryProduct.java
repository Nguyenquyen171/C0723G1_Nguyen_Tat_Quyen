package com.example.demo1.repository.impl;

import com.example.demo1.modal.User;
import com.example.demo1.repository.IRepositoryProduct;

import java.util.List;

public class RepositoryProduct implements IRepositoryProduct {
    private final static String SELECT = "SELECT * FROM users ORDER BY name_user;";
    @Override
    public List<User> getListProduct() {
        return null;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public boolean deleteUser(int id) {
        return false;
    }

    @Override
    public User selectUser(int id) {
        return null;
    }

    @Override
    public void insertUser(User user) {

    }
}
