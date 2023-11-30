package com.example.ss11.repository.impl;

import com.example.ss11.model.Book;
import com.example.ss11.repository.BaseRepository;
import com.example.ss11.repository.IRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RepositoryBook implements IRepository {
    private final String SELECT_ALL= "select * from book;";
    private final String CREATE=" insert into book(title,page_size,author,category) values (?,?,?,?);";
    private  final String DELETE = "delete from book where id = ?;";
    @Override
    public List<Book> showListBook() {
        Connection connection= BaseRepository.getConnection();
        List<Book> bookList = new ArrayList<>();
        Book book = null;
        try {
            Statement statement= connection.createStatement();
            ResultSet resultSet= statement.executeQuery(SELECT_ALL);
            while (resultSet.next()){
                int id= resultSet.getInt("id");
                String title= resultSet.getString("title");
                int pageSize= resultSet.getInt("page_size");
                String author= resultSet.getString("author");
                String category= resultSet.getString("category");
                book= new Book(id,title,pageSize,author,category);
                bookList.add(book);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return bookList;
    }

    @Override
    public void createBook(Book book) {
        Connection connection= BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(CREATE);
            preparedStatement.setString(1,book.getTitle());
            preparedStatement.setInt(2,book.getPageSize());
            preparedStatement.setString(3,book.getAuthor());
            preparedStatement.setString(4,book.getCategory());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteBook(int id) {
        Connection connection= BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement= connection.prepareStatement(DELETE);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
