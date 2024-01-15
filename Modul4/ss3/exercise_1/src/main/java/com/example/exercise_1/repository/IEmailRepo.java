package com.example.exercise_1.repository;

import com.example.exercise_1.model.Email;

public interface IEmailRepo {
    Email showEmail();

    Email findById(int id);

    void update(int id, Email email);

}
