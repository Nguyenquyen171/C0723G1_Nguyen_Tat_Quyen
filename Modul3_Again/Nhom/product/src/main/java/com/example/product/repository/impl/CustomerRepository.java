package com.example.product.repository.impl;

import com.example.product.model.CustomerAllDTO;
import com.example.product.repository.BaseRepository;
import com.example.product.repository.ICustomerRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String SELECT_ALL_CUSTOMER = "select kh.id as id_khach_hang, kh.*,lk.*,tk.* from khach_hang kh join loai_khach lk on lk.id = kh.loai_khach join tai_khoan tk on tk.id = kh.id_tai_khoan;";
    private static final String SELECT_CUSTOMER_BY_CODE = "select kh.id as id_khach_hang, kh.*,lk.*,tk.* from khach_hang kh join loai_khach lk on lk.id = kh.loai_khach join tai_khoan tk on tk.id = kh.id_tai_khoan where kh.ma_khach_hang = ?;";
    private static final String INSERT_USER_NAME = "insert into tai_khoan(user_name,pass_word,id_loai_tai_khoan) value(?,?,?);";
    private static final String INSERT_CUSTOMER = "insert into khach_hang(ma_khach_hang,ho_ten,email,so_dien_thoai,dia_chi,gioi_tinh,id_tai_khoan,loai_khach) value(?,?,?,?,?,?,?,1);";
    private static final String SELECT_ID_BY_USER_NAME = "select id from tai_khoan where user_name = ?;";

    @Override
    public List<CustomerAllDTO> findAllCustomer() {
        List<CustomerAllDTO> customerAllDTOList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id_khach_hang");
                String customerCode = resultSet.getString("ma_khach_hang");
                String name = resultSet.getString("ho_ten");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("so_dien_thoai");
                String address = resultSet.getString("dia_chi");
                String gender = resultSet.getString("gioi_tinh");
                String userName = resultSet.getString("user_name");
                String password = resultSet.getString("pass_word");
                String customerType = resultSet.getString("ten_loai_khach");
                customerAllDTOList.add(new CustomerAllDTO(id, customerCode, name, email, phone, address, gender, userName, password, customerType));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return customerAllDTOList;
    }

    @Override
    public CustomerAllDTO getCustomerByCode(String code) {
        Connection connection = BaseRepository.getConnectDB();
        CustomerAllDTO customerAllDTO = new CustomerAllDTO();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_BY_CODE);
            preparedStatement.setString(1, code);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id_khach_hang");
                String customerCode = resultSet.getString("ma_khach_hang");
                String name = resultSet.getString("ho_ten");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("so_dien_thoai");
                String address = resultSet.getString("dia_chi");
                String gender = resultSet.getString("gioi_tinh");
                String userName = resultSet.getString("user_name");
                String password = resultSet.getString("pass_word");
                String customerType = resultSet.getString("ten_loai_khach");
                customerAllDTO = new CustomerAllDTO(id, customerCode, name, email, phone, address, gender, userName, password, customerType);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return customerAllDTO;
    }

    @Override
    public void insertCustomer(CustomerAllDTO customerAllDTO) {
        Connection connection = BaseRepository.getConnectDB();
        //create tai khoan
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER_NAME);
            preparedStatement.setString(1, customerAllDTO.getUserName());
            preparedStatement.setString(2, customerAllDTO.getPassword());
            preparedStatement.setInt(3, 1);
            preparedStatement.executeUpdate();

            PreparedStatement preparedStatement1 = connection.prepareStatement(INSERT_CUSTOMER);
            preparedStatement1.setString(1, customerAllDTO.getCustomerCode());
            preparedStatement1.setString(2, customerAllDTO.getName());
            preparedStatement1.setString(3, customerAllDTO.getEmail());
            preparedStatement1.setString(4, customerAllDTO.getPhone());
            preparedStatement1.setString(5, customerAllDTO.getAddress());
            preparedStatement1.setString(6, customerAllDTO.getGender());
            preparedStatement1.setInt(7, getIdByUserName(customerAllDTO.getUserName()));
            preparedStatement1.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int getIdByUserName(String userName) {
        Connection connection = BaseRepository.getConnectDB();
        int id;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ID_BY_USER_NAME);
            preparedStatement.setString(1, userName);
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
}
