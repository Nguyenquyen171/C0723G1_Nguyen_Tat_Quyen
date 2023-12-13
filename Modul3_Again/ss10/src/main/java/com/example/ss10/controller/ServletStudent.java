package com.example.ss10.controller;

import com.example.ss10.Service.IServiceStudent;
import com.example.ss10.Service.ServiceStudent;
import com.example.ss10.model.Student;
import com.example.ss10.repository.impl.RepositoryStudent;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet (name="ServletStudent", value = "/student")
public class ServletStudent  extends HttpServlet {
    private final IServiceStudent serviceStudent= new ServiceStudent();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action= req.getParameter("action");
        if (action==null){
            action="";
        }
        switch (action){
            default:
                showListStudent(req,resp);
                break;
        }

    }

    private void showListStudent(HttpServletRequest req, HttpServletResponse resp) {
        List<Student> studentList= serviceStudent.listStudent();
        req.setAttribute("studentList",studentList);
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("index.jsp");
        try {
            requestDispatcher.forward(req, resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
