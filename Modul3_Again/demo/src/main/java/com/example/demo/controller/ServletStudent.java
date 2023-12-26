package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.IServiceClass;
import com.example.demo.service.IServiceStudent;
import com.example.demo.service.impl.ServiceClass;
import com.example.demo.service.impl.ServiceStudent;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletStudent", value = "")
public class ServletStudent  extends HttpServlet {
    private IServiceStudent serviceStudent= new ServiceStudent();
    private IServiceClass serviceClass =new ServiceClass();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action= req.getParameter("action");
        if (action==null){
            action="";
        }
        switch (action){
            default:
                listStudent(req,resp);
                break;
        }
    }

    private void listStudent(HttpServletRequest req, HttpServletResponse resp) {
        List<Student> studentList= serviceStudent.studentList();
        req.setAttribute("studentList",studentList );
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("index.jsp");
        try {
            requestDispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String action = req.getParameter("action");
        if (action== null){
            action= "";
        }
        switch (action){
            case "delete":
                deleteStudent(req,resp);
                break;
        }
    }

    private void deleteStudent(HttpServletRequest req, HttpServletResponse resp) {
        int id =Integer.parseInt(req.getParameter("idDel"));
        serviceStudent.deleteStudent(id);
        req.setAttribute("id", id);
        try {
            resp.sendRedirect("/");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
