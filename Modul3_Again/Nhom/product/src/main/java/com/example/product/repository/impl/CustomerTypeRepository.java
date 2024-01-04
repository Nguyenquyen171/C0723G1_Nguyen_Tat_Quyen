package com.example.product.repository.impl;


import com.example.product.model.CustomerType;
import com.example.product.repository.BaseRepository;
import com.example.product.repository.ICustomerTypeRepository;
import com.example.product.utils.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeRepository implements ICustomerTypeRepository {
    private static final String SELECT_USER_BY_ID = "select * from loai_khach where ma_loai_khach_hang = ? ";
    private static final String ADD = "insert into loai_khach (id,ma_loai_khach_hang,ten_loai_khach,phan_tram_uu_dai) values(?,?,?,?);";
    private static final String UPDATE_USERS = "call update_all_member(?,?,?,?)";
    private static final String DISPLAY_ALL_USERS = "call display_all_member()";
    private static final String SEARCH_SIZE_BY_NAME = "select ma_loai_khach_hang,ten_loai_khach,phan_tram_uu_dai from loai_khach where 1 = 1 and ten_loai_khach != 'not found' ";

    private static final String SELECT_ID_BY_CODE = "select id from loai_khach where ma_loai_khach_hang = ?";
    private static final String SEARCH_USERS_SQL = "select ten_loai_khach from loai_khach where ten_loai_khach != 'not found'";
    private static final String UPDATE_CUSTOMER_TYPE_BY_ID = "update loai_khach set ten_loai_khach = 'not found', phan_tram_uu_dai = 0 where id = ?;";

    @Override
    public void insert(CustomerType customerType) {
        System.out.println(ADD);
        try {
            Connection connection = Util.getConnectDB();
            PreparedStatement preparedStatement = connection.prepareStatement(ADD);
            preparedStatement.setInt(1, customerType.getId());
            preparedStatement.setString(2, customerType.getCode());
            preparedStatement.setString(3, customerType.getName());
            preparedStatement.setInt(4, customerType.getEndow());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public CustomerType selectUser(String id) {
        CustomerType customerTypes = null;
        try (Connection connection = Util.getConnectDB();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
            preparedStatement.setString(1, id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int idChatLieu = rs.getInt("id");
                String nameId = rs.getString("ma_loai_khach_hang");
                String nameType = rs.getString("ten_loai_khach");
                int describe = Integer.parseInt(rs.getString("phan_tram_uu_dai"));
                customerTypes = new CustomerType(idChatLieu, nameId, nameType, describe);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return customerTypes;
    }

    @Override
    public boolean update(CustomerType customerType) {
        boolean rowUpdated;
        try (Connection connection = Util.getConnectDB(); PreparedStatement statement = connection.prepareStatement(UPDATE_USERS);) {
            statement.setInt(1, customerType.getId());
            statement.setString(2, customerType.getCode());
            statement.setString(3, customerType.getName());
            statement.setInt(4, customerType.getEndow());
            rowUpdated = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rowUpdated;
    }


    @Override
    public List<CustomerType> displayAll() {
        List<CustomerType> customerTypes = new ArrayList<>();
        try (Connection connection = Util.getConnectDB();
             CallableStatement callableStatement = connection.prepareCall(DISPLAY_ALL_USERS);) {
            ResultSet rs = callableStatement.executeQuery();
            while (rs.next()) {
                String nameId = rs.getString("ma_loai_khach_hang");
                String nameType = rs.getString("ten_loai_khach");
                int describe = Integer.parseInt(rs.getString("phan_tram_uu_dai"));
                customerTypes.add(new CustomerType(nameId, nameType, describe));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return customerTypes;
    }

    @Override
    public List<CustomerType> search(String word) throws SQLException {
        return null;
    }

    @Override
    public List<CustomerType> selectAllByName(String word) {
        List<CustomerType> customerTypes = new ArrayList<>();
        ResultSet resultSet;
        try {
            Connection connection = Util.getConnectDB();
            if (word.equals("all")) {
                PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_SIZE_BY_NAME);
                resultSet = preparedStatement.executeQuery();
            } else {
                String sqlQuery = SEARCH_SIZE_BY_NAME + " and ten_loai_khach = '" + word + "'" + " and ten_loai_khach != '" + "not found" + "'";
                PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
                resultSet = preparedStatement.executeQuery();
            }
            while (resultSet.next()) {
                String nameId = resultSet.getString("ma_loai_khach_hang");
                String nameValue = resultSet.getString("ten_loai_khach");
                int describe = Integer.parseInt(resultSet.getString("phan_tram_uu_dai"));
                customerTypes.add(new CustomerType(nameId, nameValue, describe));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return customerTypes;
    }


    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }

    @Override
    public int getIdByCode(String code) {
        Connection connection = Util.getConnectDB();
        int id;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ID_BY_CODE);
            preparedStatement.setString(1, code);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                id = resultSet.getInt("id");

            } else {
                id = -1;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    @Override
    public List<String> getAllName() {
        List<String> stringList = new ArrayList<>();
        Connection connection = Util.getConnectDB();
        try {
            String name;
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_USERS_SQL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                name = resultSet.getString("ten_loai_khach");
                stringList.add(name);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return stringList;
    }

    @Override
    public boolean delete(int id) {
        Boolean rowDelete;
        Connection connection = Util.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CUSTOMER_TYPE_BY_ID);
            preparedStatement.setInt(1, id);
            rowDelete = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rowDelete;
    }
}

