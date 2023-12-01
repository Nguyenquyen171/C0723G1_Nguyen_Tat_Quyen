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
    private final static String FINDBYID = "SELECT * FROM book WHERE id = ?;";
    private final static String UPDATE = "UPDATE book SET title = ?, page_size = ?, author= ?, category= ? WHERE id = ?;";
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

    @Override
    public Book selectBook(int id) {
        Connection connection = BaseRepository.getConnection();
        Book book = null;
        try {
            PreparedStatement preparedStatement= connection.prepareStatement(FINDBYID);
            preparedStatement.setInt(1,id);
            ResultSet resultSet= preparedStatement.executeQuery();
            if (resultSet.next()){
                book= new Book(resultSet.getInt("id"),
                        resultSet.getString("title"),
                        resultSet.getInt("page_size"),
                        resultSet.getString("author"),
                        resultSet.getString("category"));}
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return book;
    }

    @Override
    public boolean updateBook(Book book) {
        if (selectBook(book.getId())==null){
            return false;
        }
        Connection connection= BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement= connection.prepareStatement(UPDATE);
            preparedStatement.setInt(1, book.getId());
            preparedStatement.setString(2, book.getTitle());
            preparedStatement.setInt(3,book.getPageSize());
            preparedStatement.setString(4,book.getAuthor());
            preparedStatement.setString(5,book.getCategory());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }
}
