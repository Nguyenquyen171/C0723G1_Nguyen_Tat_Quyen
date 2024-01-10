package com.example.exercise_2.service;

import com.example.exercise_2.repository.IDicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceDic implements IDicService{
    @Autowired
    private IDicRepository dicRepository;

    @Override
    public String displayResultDic(String englishLetter) {
        return dicRepository.displayResultDic(englishLetter);
    }
}
