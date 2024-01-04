package com.example.product.controller;


import com.example.product.model.CustomerType;
import com.example.product.service.IAccountService;
import com.example.product.service.impl.AccountService;
import com.example.product.service.impl.CustomerTypeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "QuanLyChatLieuController", urlPatterns = "/customerType")
public class CustomerTypeServlet extends HttpServlet {
    private final CustomerTypeService customerService = new CustomerTypeService();
    private IAccountService accountService = new AccountService();


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                insert(req, resp);
                break;
            case "edit":
                update(req, resp);
                break;

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        String user = (String) session.getAttribute("account");
        if(user != null && !user.equals("") && accountService.getAccType(user) == 2
        ) {
            String action = request.getParameter("action");
            if (action == null) {
                action = "";
            }
            switch (action) {
                case "add":
                    showNewForm(request, response);
                    break;
                case "edit":
                    showEditForm(request, response);
                    break;
                case "search":
                    search(request, response);
                    break;
                case "delete":
                    delete(request, response);
                default:
                    displayAll(request, response);
                    break;
            }
        }
        else {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("troll/troll.jsp");
            requestDispatcher.forward(request, response);
        }
    }

    public void insert(HttpServletRequest request, HttpServletResponse response) throws SecurityException, ServletException, IOException {
        String nameId = request.getParameter("nameId");
        String nameType = request.getParameter("nameType");
        int describe = Integer.parseInt(request.getParameter("describe"));
        CustomerType customerType = new CustomerType(nameId, nameType, describe);
        customerService.insert(customerType);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer_type/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String code = request.getParameter("nameId");
        String nameType = request.getParameter("nameType");
        int describe = Integer.parseInt(request.getParameter("describe"));
        int id =  customerService.getIdByCode(code);
        CustomerType customerType = new CustomerType(id, code, nameType, describe);
        customerService.update(customerType);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer_type/edit.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void displayAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<CustomerType> customerTypes = customerService.selectAll();
        List<String> listName = customerService.getAllName();
        request.setAttribute("listName",listName);
        request.setAttribute("list", customerTypes);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer_type/display.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void delete(HttpServletRequest request,HttpServletResponse response){
        String code = request.getParameter("id");
        int id = customerService.getIdByCode(code);
        customerService.delete(id);
        try {
            displayAll(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String word = request.getParameter("nameSize");
        List<CustomerType> customerTypes = customerService.selectAllByName(word);
        List<String> listName = customerService.getAllName();
        request.setAttribute("listName",listName);
        request.setAttribute("list", customerTypes);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer_type/display.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer_type/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        CustomerType customerType = customerService.select(id);
        request.setAttribute("QuanLyChatLieu", customerType);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer_type/edit.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

