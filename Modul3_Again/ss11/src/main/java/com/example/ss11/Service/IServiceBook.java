package com.example.ss11.service;

import com.example.ss11.model.Book;

import java.util.List;

public interface IServiceBook {
    List<Book> showListBook();
    void createBook(Book book);
    void deleteBook(int id );
}
