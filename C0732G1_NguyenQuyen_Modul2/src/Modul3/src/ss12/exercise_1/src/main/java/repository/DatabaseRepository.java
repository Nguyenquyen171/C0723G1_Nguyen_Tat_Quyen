package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseRepository {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/demo";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "12345678";

    public DatabaseRepository(){
    }
    public static Connection getConnection(){
        Connection connection= null;
        try {
            connection= DriverManager.getConnection(JDBC_URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;

    }
}