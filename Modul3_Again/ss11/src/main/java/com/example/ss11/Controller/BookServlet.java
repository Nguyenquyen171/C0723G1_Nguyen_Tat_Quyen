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

@WebServlet(name = "BookServlet",value = "/book")
public class BookServlet extends HttpServlet {
    private final IServiceBook serviceBook= new ServiceBook();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action==null){
            action="";
        }
        switch (action){
            default:
                listBook(req,resp);
                break;
        }
    }

    private void listBook(HttpServletRequest req, HttpServletResponse resp) {
        List<Book> bookList= serviceBook.showListBook();
        req.setAttribute("bookList",bookList);
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
