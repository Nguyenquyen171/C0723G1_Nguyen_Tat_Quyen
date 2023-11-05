package com.example.product_details.controller;

import com.example.product_details.model.ProductDetail;
import com.example.product_details.service.IServiceProductDetail;
import com.example.product_details.service.impl.ServiceProductDetail;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet (name = "ProductDetailServlet", value = "/product_detail")
public class ProductDetailServlet extends HttpServlet {
    private final IServiceProductDetail serviceProductDetail= new ServiceProductDetail();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String action = req.getParameter("action");
      if (action== null){
          action="";
      }
      switch (action){
          default:
              showListProductDetail(req,resp);

      }
    }
    private void showListProductDetail(HttpServletRequest request,HttpServletResponse response){
        List<ProductDetail> productDetailList= serviceProductDetail.selectAllProductDetail();
        request.setAttribute("productDetailList",productDetailList);
        RequestDispatcher requestDispatcher= request.getRequestDispatcher("product_detail/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
