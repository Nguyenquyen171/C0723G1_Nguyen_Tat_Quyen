package com.example.demo1.controller;

import com.example.demo1.service.account.IServiceAccount;
import com.example.demo1.service.account.ServiceAccount;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = {
        "/login",
        "/logout",
        "/error-access",
})
public class LoginServlet extends HttpServlet {
    private final IServiceAccount serviceAccount= new ServiceAccount();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String url = req.getRequestURI();
        if (url.endsWith("/login")) {
            showLogInForm(req, resp);
        } else if (url.endsWith("/logout")) {
            logOut(req, resp);
        } else if (url.endsWith("/error-access")) {
            errorAccess(req, resp);
        }
    }

    private void errorAccess(HttpServletRequest req, HttpServletResponse resp) {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/error-access.jsp");
        try {
            dispatcher.forward(req, resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void logOut(HttpServletRequest req, HttpServletResponse resp) {
        HttpSession session= req.getSession();
        session.invalidate();
        try {
            resp.sendRedirect("login_1-1/login.jsp");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showLogInForm(HttpServletRequest req, HttpServletResponse resp) {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/login_1-1/login.jsp");
        try {
            dispatcher.forward(req, resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
