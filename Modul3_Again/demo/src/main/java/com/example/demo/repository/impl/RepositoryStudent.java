package com.example.demo.repository.impl;

import com.example.demo.model.StudentClass;
import com.example.demo.model.Student;
import com.example.demo.repository.BaseRepository;
import com.example.demo.repository.IRepositoryStudent;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RepositoryStudent implements IRepositoryStudent {
    private final String SELECT_ALL = "select s.id_student,s.name_student,s.teacher,c.name_class from student s join class c on c.id_class= s.id_student";
    private final String DELETE="DELETE FROM student where id= ? ";

    @Override
    public List<Student> studentList() {
        Connection connection = BaseRepository.getConnection();
        List<Student> studentList = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_ALL);
            while (resultSet.next()) {
                int id = resultSet.getInt("id_student");
                String name = resultSet.getString("name_student");
                String teacher = resultSet.getString("teacher");
                String nameClass = resultSet.getString("name_class");
                StudentClass aClass = new StudentClass(nameClass);
                studentList.add(new Student(id, name, teacher, aClass));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return studentList;
    }

    @Override
    public void createStudent(Student student) {


    }

    @Override
    public void deleteStudent(int id) {
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement= connection.prepareStatement(DELETE);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
