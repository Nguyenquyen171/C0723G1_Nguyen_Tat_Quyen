package com.example.ss12.service.impl;

import com.example.ss12.model.Book;
import com.example.ss12.repository.IRepositoryBook;
import com.example.ss12.repository.impl.RepositoryBook;
import com.example.ss12.service.IServiceBook;

import java.util.List;

public class ServiceBook implements IServiceBook {
    private  final IRepositoryBook serviceBook= new RepositoryBook();

    @Override
    public List<Book> listBook() {
        return serviceBook.listBook();
    }

    @Override
    public void createBook(Book book) {
        serviceBook.createBook(book);
    }

    @Override
    public void deleteBook(int id) {
        serviceBook.deleteBook(id);
    }
}
