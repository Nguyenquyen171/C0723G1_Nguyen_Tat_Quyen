package service;

import model.User;

import java.util.List;

public interface IServiceUser{
    void insertUser(User user);

    User selectUser(int id);

    List<User> selectAllUsers();

    boolean deleteUser(int id);

    boolean updateUser(User user);
    List<User> findByCountry(String country);
}
