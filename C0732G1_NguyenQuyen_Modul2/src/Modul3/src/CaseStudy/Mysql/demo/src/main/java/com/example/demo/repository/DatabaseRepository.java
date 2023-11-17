package com.example.demo.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseRepository {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/quan_ly_ban_hang";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "12345678";

    public DatabaseRepository(){
    }
    public static Connection getConnection(){
        Connection connection= null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection(JDBC_URL,USERNAME,PASSWORD);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;

    }
}
