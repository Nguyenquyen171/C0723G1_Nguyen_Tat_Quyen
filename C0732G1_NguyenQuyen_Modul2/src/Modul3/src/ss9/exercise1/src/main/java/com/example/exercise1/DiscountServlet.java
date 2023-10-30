package com.example.exercise1;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String description = req.getParameter("description");
        double price = Double.parseDouble(req.getParameter("price"));
        double percent = Double.parseDouble(req.getParameter("percent"));
        double discountAmount = price*percent*0.01;
        double priceAfterDiscount = price-discountAmount;
        req.setAttribute("description",description);
        req.setAttribute("price",price);
        req.setAttribute("percent",percent);
        req.setAttribute("discountAmount",discountAmount);
        req.setAttribute("priceAfterDiscount",priceAfterDiscount);

        RequestDispatcher requestDispatcher =  req.getRequestDispatcher("/display-discount.jsp");
        requestDispatcher.forward(req,resp);
    }
}