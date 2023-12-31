package com.example.stored_procedures.service.impl;

import com.example.stored_procedures.model.User;
import com.example.stored_procedures.repository.IUserRepo;
import com.example.stored_procedures.repository.impl.UserRepoImpl;
import com.example.stored_procedures.service.IUserService;

import java.util.List;

public class ServiceUser implements IUserService {
    private final IUserRepo userRepo = new UserRepoImpl();

    @Override
    public List<User> displayUserList() {
        return userRepo.displayUserList();
    }

    @Override
    public void createUser(User user) {
        userRepo.createUser(user);
    }

    @Override
    public void editUser(int id, User user) {
        if (findById(id) == null) {
            try {
                throw new Exception("User is not found");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            userRepo.editUser(id, user);
        }
    }

    @Override
    public User findById(int id) {
        return userRepo.findById(id);
    }

    @Override
    public void deleteUser(int id) {
        if (findById(id) == null) {
            try {
                throw new Exception("User is not found");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            userRepo.deleteUser(id);
        }
    }

    @Override
    public User findByCountry(String country) {
        return userRepo.findByCountry(country);
    }

    @Override
    public User getUserById(int id) {
        return userRepo.getUserById(id);
    }

    @Override
    public void insertUserStore(User user) {
        userRepo.insertUserStore(user);
    }

    @Override
    public List<User> displayUserProcedure() {
        return userRepo.displayUserProcedure();
    }

    @Override
    public void editUserProcedure(int id, User user) {
        userRepo.editUserProcedure(id, user);
    }

    @Override
    public void deleteUserProcedure(int id) {
        userRepo.deleteUserProcedure(id);
    }

    @Override
    public void addUserTransaction(User user) {

    }

    @Override
    public void insertUpdateUseTransaction() {
        userRepo.insertUpdateUseTransaction();
    }
}
