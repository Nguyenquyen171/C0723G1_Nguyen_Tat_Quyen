package com.example.managerproduct.controller;


import com.example.managerproduct.model.Product;
import com.example.managerproduct.service.IProductService;
import com.example.managerproduct.service.impl.ProductSeriveImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductController", value = "/product-controller")
public class ProductController extends HttpServlet {
    private final IProductService productService = new ProductSeriveImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch(action) {
            case "list":
                displayList(request, response);
                break;
            case "fill":
                fillForm(request, response);
                break;
            case "delete":
                deleteProduct(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                addProduct(request, response);
                break;
            case "findId":
                findById(request, response);
                break;
            case "edit":
                editProduct(request, response);
                break;
        }
    }
    private void displayList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> productList = productService.displayList();
        request.setAttribute("productList", productList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/product-list.jsp");
        requestDispatcher.forward(request, response);
    }
    private void addProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String description = request.getParameter("description");
        String manufacturer = request.getParameter("manufacturer");
        Product product = new Product(name, price, description, manufacturer);
        productService.addProduct(product);
        List<Product> productList = productService.displayList();
        request.setAttribute("productList", productList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/product-list.jsp");
        requestDispatcher.forward(request, response);
    }
    private void fillForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Product product = productService.findById(Integer.parseInt(request.getParameter("productId")));
        request.setAttribute("product", product);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("edit-product.jsp");
        requestDispatcher.forward(request, response);
    }
    private void findById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Product product = productService.findById(Integer.parseInt(request.getParameter("idToFind")));
        String notFound = "No product found!";
        if (product != null) {
            request.setAttribute("result", product);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/find-id.jsp");
            requestDispatcher.forward(request, response);
        } else {
            List<Product> productList = productService.displayList();
            request.setAttribute("productList", productList);
            request.setAttribute("result", notFound);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/product-list.jsp");
            requestDispatcher.forward(request, response);
        }
    }
    private void editProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String description = request.getParameter("description");
        String manufacturer = request.getParameter("manufacturer");
        Product product = new Product(id, name, price, manufacturer, description);
        productService.editProduct(product);
        List<Product> productList = productService.displayList();
        request.setAttribute("productList", productList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/product-list.jsp");
        requestDispatcher.forward(request, response);
    }
    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String listEmpty = "The list cannot be empty! Please try to edit the product instead";
        List<Product> productList = productService.displayList();
        if (productList.size() == 1) {
//            productService.addProduct(new Product(-1, "placeholder", -1,"placeholder","placeholder"));
            request.setAttribute("listEmpty" ,listEmpty);
            request.setAttribute("productList", productList);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/product-list.jsp");
            requestDispatcher.forward(request, response);
        } else {
            productService.deleteProduct(Integer.parseInt(request.getParameter("productId")));
            request.setAttribute("productList", productList);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/product-list.jsp");
            requestDispatcher.forward(request, response);
        }
    }
    private void searchProductByName(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        List<Product> productList = this.productService.findByName(name);
        RequestDispatcher requestDispatcher;
        if(productList == null){
            requestDispatcher = request.getRequestDispatcher("error-404.jsp");
        }else {
            request.setAttribute("name",name);
            request.setAttribute("productList",productList);
            requestDispatcher = request.getRequestDispatcher("view/search.jsp");
        }
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}