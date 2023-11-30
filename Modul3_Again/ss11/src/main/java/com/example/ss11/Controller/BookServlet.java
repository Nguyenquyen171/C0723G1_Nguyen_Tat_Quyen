package com.example.ss11.controller;

import com.example.ss11.model.Book;
import com.example.ss11.repository.BaseRepository;
import com.example.ss11.service.IServiceBook;
import com.example.ss11.service.ServiceBook;

import javax.servlet.Filter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "BookServlet", value = "/book")
public class BookServlet extends HttpServlet {
    private final IServiceBook serviceBook = new ServiceBook();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createBook(req, resp);
                break;
            default:
                listBook(req, resp);
                break;
        }
    }

    private void createBook(HttpServletRequest req, HttpServletResponse resp) {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("create.jsp");
        try {
            requestDispatcher.forward(req, resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void listBook(HttpServletRequest req, HttpServletResponse resp) {
        List<Book> bookList = serviceBook.showListBook();
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
        String action= req.getParameter("action");
        if (action==null){
            action="";
        }
        switch (action){
            case "create":
            addBook(req,resp);
                break;
            default:
                listBook(req, resp);
                break;
        }
    }

    private void addBook(HttpServletRequest req, HttpServletResponse resp) {
        String tittle= req.getParameter("title");
        int pageSize= Integer.parseInt(req.getParameter("page_size"));
        String author= req.getParameter("author");
        String category= req.getParameter("category");
        Book book= new Book(tittle,pageSize,author,category);
        serviceBook.createBook(book);
        listBook(req,resp);
    }
}
