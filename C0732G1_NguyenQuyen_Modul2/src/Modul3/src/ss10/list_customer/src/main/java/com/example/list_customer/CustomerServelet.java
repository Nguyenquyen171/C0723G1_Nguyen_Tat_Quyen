package com.example.list_customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Discount Product", urlPatterns = "customer")
public class CustomerServelet extends HttpServlet {
    private static final List<Customer> customerList;

    static {
        customerList = new ArrayList<>();
        customerList.add(new Customer(1, "Nguyen Quyen", "17/01/2002", "Ha Noi", "x"));
        customerList.add(new Customer(2, "Tran Linh Giang", "17/01/2002", "Vung tau", "https://photocross.net/wp-content/uploads/2020/03/anh-chan-dung.jpg"));
        customerList.add(new Customer(3, "Phan van toai", "20/10/2003", "Sai Gon", "https://www.paratime.vn/wp-content/uploads/2020/02/TIME-Studio-headshot-3-elements.jpg"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("customerList",customerList);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}