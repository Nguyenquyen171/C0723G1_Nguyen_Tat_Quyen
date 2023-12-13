package com.example.ss12.repository;

import com.example.ss12.model.Book;

import java.util.List;

public interface IRepositoryBook {
    List<Book> listBook();
    void createBook(Book book);
    void deleteBook(int id);
    void updateBook (Book book);
}
