package com.example.ss11.service;

import com.example.ss11.model.Book;
import com.example.ss11.repository.IRepository;
import com.example.ss11.repository.impl.RepositoryBook;

import java.util.List;

public class ServiceBook implements  IServiceBook{
    private final IRepository repository= new RepositoryBook();

    @Override
    public List<Book> showListBook() {
        return repository.showListBook();
    }

    @Override
    public void createBook(Book book) {
        repository.createBook(book);
    }

    @Override
    public void deleteBook(int id) {
        repository.deleteBook(id);
    }
}
