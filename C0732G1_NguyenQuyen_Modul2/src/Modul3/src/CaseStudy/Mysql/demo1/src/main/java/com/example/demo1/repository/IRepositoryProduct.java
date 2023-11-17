package com.example.demo1.repository;

import com.example.demo1.modal.User;

import java.util.List;

public interface IRepositoryProduct {
    List<User> getListProduct();
    boolean updateUser(User user);
    boolean deleteUser(int id);
    User selectUser(int id);
    void insertUser(User user);
}
