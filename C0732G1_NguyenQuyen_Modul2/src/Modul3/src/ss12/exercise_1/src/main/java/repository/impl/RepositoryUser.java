package repository.impl;

import model.User;
import repository.DatabaseRepository;
import repository.IRepositoryUser;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RepositoryUser implements IRepositoryUser {

    private final static String SELECT = "SELECT * FROM users ORDER BY name_user;";
    private final static String SELECT_BY_COUNTRY = "SELECT * FROM users WHERE country = ?;";
    private final static String INSERT = "insert into users(name_user, email, country) values(?,?,?);";
    private final static String FINDBYID = "SELECT * FROM users WHERE id = ?;";
    private final static String UPDATE = "UPDATE users SET name_user = ?, email = ?, country= ? WHERE id = ?;";
    private final static String DELETE = "DELETE FROM users WHERE id = ?;";


    @Override
    public void insertUser(User user) {

        Connection connection = DatabaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public User selectUser(int id) {
        Connection connection = DatabaseRepository.getConnection();
        User user = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(FINDBYID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                user = new User(resultSet.getInt("id"),
                        resultSet.getString("name_user"),
                        resultSet.getString("email"),
                        resultSet.getString("country"));
            }
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    @Override
    public List<User> selectAllUsers() {
        Connection connection = DatabaseRepository.getConnection();
        List<User> userList = new ArrayList<>();
        User user;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name_user");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                user = new User(id, name, email, country);
                userList.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return userList;
    }

    @Override
    public boolean deleteUser(int id) {
        if (selectUser(id) == null) {
            return false;
        }
        Connection connection = DatabaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return true;
    }

    @Override
    public boolean updateUser(User user) {
        if (selectUser(user.getId()) == null) {
            return false;
        }
        Connection connection = DatabaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE);
            preparedStatement.setInt(1, user.getId());
            preparedStatement.setString(2, user.getName());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getCountry());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    @Override
    public List<User> findByCountry(String country) {
        Connection connection = DatabaseRepository.getConnection();
        List<User> userList = new ArrayList<>();
        User user;
        try {
            PreparedStatement preparedStatement= connection.prepareStatement(SELECT_BY_COUNTRY);
            preparedStatement.setString(1,country);
            ResultSet resultSet= preparedStatement.executeQuery();
            while (resultSet.next()){
                int id= resultSet.getInt("id");
                String name= resultSet.getString("name_user");
                String email= resultSet.getString("email");
                String countryFind= resultSet.getString("country");
                user=new User(id,name,email,countryFind);
                userList.add(user);
            }
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return userList;
    }
}
