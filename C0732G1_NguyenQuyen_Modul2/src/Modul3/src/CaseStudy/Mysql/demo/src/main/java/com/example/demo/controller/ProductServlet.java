package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.IServiceProduct;
import com.example.demo.service.ServiceProduct;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet (name = "ProductServlet",value = "/product")
public class ProductServlet extends HttpServlet {
    private final IServiceProduct serviceProduct= new ServiceProduct();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action=req.getParameter("action");
        if (action==null){
            action="";
        }
        switch (action){
            default:
                displayListProduct(req,resp);
                break;
        }
    }
    public void displayListProduct(HttpServletRequest request,HttpServletResponse response){
        List< Product> productList= serviceProduct.productList();
        request.setAttribute("productList", productList);
        RequestDispatcher requestDispatcher= request.getRequestDispatcher("list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
