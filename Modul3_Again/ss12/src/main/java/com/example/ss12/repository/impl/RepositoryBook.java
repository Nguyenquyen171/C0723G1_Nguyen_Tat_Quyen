package com.example.ss12.repository.impl;

import com.example.ss12.model.Book;
import com.example.ss12.model.Category;
import com.example.ss12.repository.BaseRepository;
import com.example.ss12.repository.IRepositoryBook;
import com.example.ss12.repository.IRepositoryCategory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RepositoryBook implements IRepositoryBook {
    public static final String SELECT_ALL = "SELECT b.id, b.title, b.page_size, c.name FROM book b JOIN category c ON b.id_category = c.id;";
    public static final String CREATE = "insert into book (title,page_size,id_category) value (?,?,?);";

    private static final String DELETE = "delete from book where id = ?;";
    private final IRepositoryCategory listCategory = new RepositoryCategory();

    @Override
    public List<Book> listBook() {
        Connection connection = BaseRepository.getConnection();
        List<Book> bookList = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_ALL);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                int pageSize = resultSet.getInt("page_size");
//                Category category = listCategory.findById(resultSet.getInt("id"));
                String categoryName= resultSet.getString("name");
                Category category=new Category(categoryName);
                bookList.add(new Book(id, title, pageSize, category));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return bookList;
    }

    @Override
    public void createBook(Book book) {
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(CREATE);
            preparedStatement.setString(1, book.getTitle());
            preparedStatement.setInt(2, book.getPageSize());
            preparedStatement.setInt(3, book.getCategory().getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteBook(int id) {
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateBook(Book book) {
//        Connection connection = BaseRepository.getConnection();
//        PreparedStatement
    }
}
