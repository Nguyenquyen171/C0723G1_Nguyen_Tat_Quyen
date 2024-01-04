package com.example.product.controller;


import com.example.product.model.ThongTinTaiKhoan;
import com.example.product.service.IThongTinTaiKhoanService;
import com.example.product.service.impl.ThongTinTaiKhoanService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "QuanLyChatLieubfdbController", urlPatterns = "/thong_tin_tai_khoan")
public class ThongTinTaiKhoanController extends HttpServlet {

    private static IThongTinTaiKhoanService thongTinTaiKhoanService = new ThongTinTaiKhoanService();

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
                update(req, resp);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String user = (String) session.getAttribute("account");

        if(user != null && !user.equals("")) {
            request.setCharacterEncoding("UTF-8");
            String action = request.getParameter("action");
            if (action == null) {
                action = "";
            }
            switch (action) {
                case "edit":
                    showEditForm(request, response);
                    break;
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

    public void displayAll(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("account");
        ThongTinTaiKhoan thongTinTaiKhoans = thongTinTaiKhoanService.selectAll(username);
        request.setAttribute("listNgu", thongTinTaiKhoans);
        RequestDispatcher dispatcher = request.getRequestDispatcher("info/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(HttpServletRequest request, HttpServletResponse response) {
        String userName = request.getParameter("userName");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("phone");
        String address = request.getParameter("address");
        String gender = request.getParameter("gender");
        int id = thongTinTaiKhoanService.getIdByCode(userName);
        String passWord = request.getParameter("conFirmPassword");
        if (thongTinTaiKhoanService.getPassWord(userName).equals(passWord)) {
            thongTinTaiKhoanService.update(name, email, phoneNumber, address, gender,userName, id);
            try {
                response.sendRedirect("/thong_tin_tai_khoan");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("info/edit.jsp");
            try {
                dispatcher.forward(request,response);
            } catch (ServletException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        String userName = request.getParameter("username");
        ThongTinTaiKhoan thongTinTaiKhoan = thongTinTaiKhoanService.selectAll(userName);
        request.setAttribute("name", thongTinTaiKhoan.getName());
        request.setAttribute("email", thongTinTaiKhoan.getEmail());
        request.setAttribute("phone", thongTinTaiKhoan.getPhoneNumber());
        request.setAttribute("address", thongTinTaiKhoan.getAddress());
        request.setAttribute("gender", thongTinTaiKhoan.getGender());
        request.setAttribute("userName", thongTinTaiKhoan.getUserName());
        RequestDispatcher dispatcher = request.getRequestDispatcher("info/edit.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
