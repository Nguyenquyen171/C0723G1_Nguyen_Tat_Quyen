package com.example.book.service;

import com.example.book.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> getAllBook();
    void create (Book book);
    void delete(Integer id );
    void update(Book book);
    Book getBook(Integer id);


}
