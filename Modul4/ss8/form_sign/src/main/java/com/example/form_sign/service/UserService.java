package com.example.form_sign.service;

import com.example.form_sign.model.User;
import com.example.form_sign.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{
    @Autowired
    private IUserRepository userRepository;

    @Override
    public void signUser(User user) {
        userRepository.save(user);
    }

}