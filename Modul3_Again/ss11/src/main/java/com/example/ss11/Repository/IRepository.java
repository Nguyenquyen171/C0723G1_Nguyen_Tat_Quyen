package com.example.ss11.repository;

import com.example.ss11.model.Book;

import java.util.List;

public interface IRepository {
    List<Book> showListBook();
    void createBook(Book book);
    void deleteBook(int id );
}
