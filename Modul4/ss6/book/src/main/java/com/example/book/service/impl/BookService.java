package com.example.book.service.impl;



import com.example.book.model.Book;
import com.example.book.repository.IBookRepository;
import com.example.book.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {
    @Autowired
    private IBookRepository bookRepository;

    @Override
    public List<Book> getAllBook() {

        return bookRepository.findAll();
    }

    @Override
    public void create(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void delete(Integer id) {
//        bookRepository.delete(id);
    }

    @Override
    public void update(Book book) {
        bookRepository.save(book);

    }

    @Override
    public Book getBook(Integer id) {
        return bookRepository.findById(id).get();
    }
}
