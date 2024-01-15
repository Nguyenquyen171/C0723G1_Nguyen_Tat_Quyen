package com.example.exercise_1.service;

import com.example.exercise_1.model.Email;

public interface IEmailService {
    Email showEmail();

    Email findById(int id);

    void update(int id, Email email);
}
