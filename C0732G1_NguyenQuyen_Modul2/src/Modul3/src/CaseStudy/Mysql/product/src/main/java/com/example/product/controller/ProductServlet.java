package com.example.product.controller;

import com.example.product.model.ProductType;
import com.example.product.service.IServiceProduct;
import com.example.product.service.impl.ServiceProduct;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/product_type")
public class ProductServlet extends HttpServlet {
    private final IServiceProduct serviceProduct = new ServiceProduct();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case"create":
                showNewForm(req,resp);
                break;
            case "edit":
                showEditProductType(req,resp);
                break;
            default:
                showListProductType(req,resp);
                break;
        }
    }


    private void showListProductType(HttpServletRequest request,HttpServletResponse response){
        List<ProductType> productTypeList=  serviceProduct.selectAllProduct();
        request.setAttribute("productTypeList", productTypeList);
        RequestDispatcher requestDispatcher= request.getRequestDispatcher("view/product_type/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void showNewForm(HttpServletRequest request,HttpServletResponse response){
        RequestDispatcher requestDispatcher =request.getRequestDispatcher("view/product_type/create.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void showEditProductType(HttpServletRequest request,HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        ProductType productType = serviceProduct.selectProductType(id);
        if (productType != null) {
            request.setAttribute("productType", productType);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/product_type/edit.jsp");
            try {
                requestDispatcher.forward(request, response);
            } catch (ServletException | IOException e) {
                throw new RuntimeException(e);
            }
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
                addProductType(req,resp);
                break;
            case "edit":
                updateProductType(req,resp);
                break;
        }
    }
    private void addProductType(HttpServletRequest request,HttpServletResponse response){
        String  productCode =request.getParameter("productCode") ;
       String typeName =request.getParameter("typeName") ;
       String describe =request.getParameter("describe") ;
      serviceProduct.insertProduct(new ProductType(productCode,typeName,describe));
      showListProductType(request,response);
    }
    private void updateProductType(HttpServletRequest request,HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        String typeName =request.getParameter("typeName") ;
        String describe =request.getParameter("describe") ;
        if (serviceProduct.updateProductType(new ProductType(id,typeName,describe))){
            showListProductType(request,response);

        }
    }
}
