package com.example.ss12.controller;

import com.example.ss12.model.Book;
import com.example.ss12.model.Category;
import com.example.ss12.service.IServiceBook;
import com.example.ss12.service.IServiceCategory;
import com.example.ss12.service.impl.ServiceBook;
import com.example.ss12.service.impl.ServiceCategory;

import javax.servlet.Filter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "BookServlet", value = "")
public class BookServlet extends HttpServlet {
    private IServiceCategory serviceCategory = new ServiceCategory();
    private IServiceBook serviceBook = new ServiceBook();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "createForm":
                createForm(req,resp);
                break;
            default:
                showListBook(req, resp);
                break;
        }
    }

    private void createForm(HttpServletRequest req, HttpServletResponse resp) {
        List<Category> categoryList = serviceCategory.listCategory();
        req.setAttribute("categoryList",categoryList);
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("create.jsp");
        try {
            requestDispatcher.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void showListBook(HttpServletRequest req, HttpServletResponse resp) {
        List<Book> bookList = serviceBook.listBook();
        req.setAttribute("bookList", bookList);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
        try {
            requestDispatcher.forward(req, resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "delete":
                deleteBook(req, resp);
                break;
            case "create":
                createBook(req,resp);
                break;
        }
    }

    private void createBook(HttpServletRequest req, HttpServletResponse resp) {
        String title= req.getParameter("title");
        int pageSize= Integer.parseInt(req.getParameter("page_size"));
        int category= Integer.parseInt(req.getParameter("id"));
        Book book= new Book(title,pageSize,new Category(category));
        serviceBook.createBook(book);
        try {
            resp.sendRedirect("/");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void deleteBook(HttpServletRequest req, HttpServletResponse resp) {
        int id= Integer.parseInt(req.getParameter("idDel"));
        serviceBook.deleteBook(id);
        req.setAttribute("id",id);
        try {
            resp.sendRedirect("/");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
