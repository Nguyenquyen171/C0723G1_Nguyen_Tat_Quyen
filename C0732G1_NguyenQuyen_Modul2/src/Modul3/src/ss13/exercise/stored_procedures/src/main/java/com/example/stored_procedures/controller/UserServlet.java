package com.example.stored_procedures.controller;

import com.example.stored_procedures.model.User;
import com.example.stored_procedures.service.IUserService;
import com.example.stored_procedures.service.impl.ServiceUser;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "userServlet", value = "/user-servlet")
public class UserServlet extends HttpServlet {
    private final IUserService userService = new ServiceUser();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createForm(request, response);
                break;
            case "edit":
                editForm(request, response);
                break;
            case "view":
                displayUser(request, response);
                break;
            case "delete":
                delete(request, response);
                break;
            case "search":
                searchByCountryForm(request, response);
                break;
            default:
                displayUserList(request, response);

        }
    }

    private void editForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        RequestDispatcher requestDispatcher = null;
//        User user = userService.findById(id);
        User user = userService.getUserById(id);
        if (user == null) {
            requestDispatcher = request.getRequestDispatcher("/error.jsp");
        } else {
            request.setAttribute("user", user);
            requestDispatcher = request.getRequestDispatcher("/edit_user.jsp");
        }
        requestDispatcher.forward(request, response);

    }

    private void createForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/create_user.jsp");
        requestDispatcher.forward(request, response);
    }

    private void searchByCountryForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String country = request.getParameter("country");
        User user = userService.findByCountry(country);
        request.setAttribute("user", user);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/findbycountry.jsp");
        requestDispatcher.forward(request, response);
    }

    private void displayUser(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
//      User user = userService.findById(id);
        User user = userService.getUserById(id);
        request.setAttribute("user", user);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view.jsp");
        requestDispatcher.forward(request, response);
    }

    private void displayUserList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//      List<User> userList = userService.displayUserList();
        List<User> userList = userService.displayUserProcedure();
        request.setAttribute("userList", userList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/user_list.jsp");
        requestDispatcher.forward(request, response);
    }

    private void delete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
//        userService.deleteUser(id);
        User user = userService.findById(id);
        RequestDispatcher requestDispatcher = null;
        if (user == null) {
            requestDispatcher = request.getRequestDispatcher("/error.jsp");
            requestDispatcher.forward(request, response);
        } else {
            userService.deleteUserProcedure(id);
            response.sendRedirect("user-servlet");
        }
    }

    private void testTransaction(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        userService.insertUpdateUseTransaction();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                insertUser(request, response);
                break;
            case "edit":
                edit(request, response);
                break;
            case "search":
                searchByCountryForm(request, response);
                break;
            default:
                break;
        }
    }

    private void create(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User(name, email, country);
        userService.createUser(user);
        response.sendRedirect("user-servlet");
    }

    private void edit(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
//        User user = userService.findById(id);
        User user = userService.getUserById(id);
        user.setName(name);
        user.setEmail(email);
        user.setCountry(country);
//        userService.editUser(id, user);
        userService.editUserProcedure(id, user);
        response.sendRedirect("user-servlet");
    }

    private void insertUser(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User(name, email, country);
        userService.insertUserStore(user);
        response.sendRedirect("user-servlet");
    }


}