package com.example.exercise_2.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;

@Repository
public class DicRepository implements  IDicRepository {
    private static final Map<String, String> dictionary ;
    static {
        dictionary=new HashMap<>();
        dictionary.put("hello", "xin chao");
        dictionary.put("hi", "xin chao");
        dictionary.put("Good morning", "Chào buổi sáng");
        dictionary.put("Good Afternoon", "Chào buổi chiều");
        dictionary.put("Good Evening", " Chào buổi tối.");

    }

    @Override
    public String displayResultDic(String englishLetter) {
        return dictionary.getOrDefault(englishLetter, "BẠN DỐT VÃI L**");
    }
}
