package com.example.product.controller;

import com.example.product.model.ProductTypeManager;
import com.example.product.service.IAccountService;
import com.example.product.service.IProductTypeManagerService;
import com.example.product.service.impl.AccountService;
import com.example.product.service.impl.ProductTypeManagerService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ooo", urlPatterns = "/product_type_manager")
public class ProductTypeManagerController extends HttpServlet {
    private IAccountService accountService = new AccountService();
    private final IProductTypeManagerService productTypeManagerService = new ProductTypeManagerService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String user = (String) session.getAttribute("account");
        if(user != null && !user.equals("") && accountService.getAccType(user) == 2 ){
            String action = req.getParameter("action");
            if (action == null) {
                action = "";
            }
            switch (action) {
                case "create":
                    showNewForm(req, resp);
                    break;
                case "edit":
                    showEditProductType(req, resp);
                    break;
                default:
                    showListProductType(req, resp);
                    break;
            }
        }
        else {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("troll/troll.jsp");
            requestDispatcher.forward(req, resp);
        }
    }


    private void showListProductType(HttpServletRequest request,HttpServletResponse response){
        List<ProductTypeManager> productTypeList=  productTypeManagerService.selectAllProduct();
        request.setAttribute("productTypeList", productTypeList);
        RequestDispatcher requestDispatcher= request.getRequestDispatcher("product_type/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void showNewForm(HttpServletRequest request,HttpServletResponse response){
        RequestDispatcher requestDispatcher =request.getRequestDispatcher("product_type/create.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void showEditProductType(HttpServletRequest request,HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        ProductTypeManager productType = productTypeManagerService.selectProductType(id);
        if (productType != null) {
            request.setAttribute("productType", productType);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("product_type/edit.jsp");
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
        productTypeManagerService.insertProduct(new ProductTypeManager(productCode,typeName,describe));
        showListProductType(request,response);
    }
    private void updateProductType(HttpServletRequest request,HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        String typeName =request.getParameter("typeName") ;
        String describe =request.getParameter("describe") ;
        if (productTypeManagerService.updateProductType(new ProductTypeManager(id,typeName,describe))){
            showListProductType(request,response);
        }
    }
}
