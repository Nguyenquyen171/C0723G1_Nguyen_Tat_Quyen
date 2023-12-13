package com.example.ss12.service;

import com.example.ss12.model.Book;

import java.util.List;

public interface IServiceBook {
    List<Book> listBook();
    void createBook(Book book);
    void deleteBook(int id);
}
