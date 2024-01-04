package com.example.product.controller;

import com.example.product.model.CustomerAllDTO;
import com.example.product.service.IAccountService;
import com.example.product.service.ICustomerService;
import com.example.product.service.impl.AccountService;
import com.example.product.service.impl.CustomerService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Random;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    private ICustomerService customerService = new CustomerService();
    private IAccountService accountService = new AccountService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String user = (String) session.getAttribute("account");
        if(user != null && !user.equals("") && accountService.getAccType(user) == 2
        ) {

            String action = request.getParameter("action");
            if (action == null) {
                action = "";
            }

            switch (action) {
                case "detail":
                    detailCustomer(request, response);
                    break;
                case "create":
                    showFormCreateCustomer(request, response);
                    break;
                default:
                    listCustomer(request, response);
                    break;
            }
        }
        else {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("troll/troll.jsp");
            requestDispatcher.forward(request, response);
        }
    }

    private void showFormCreateCustomer(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/create.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void detailCustomer(HttpServletRequest request, HttpServletResponse response) {
        String customerCode = request.getParameter("id");
        CustomerAllDTO customerAllDTO = customerService.getCustomerByCode(customerCode);
        request.setAttribute("customerAllDTO", customerAllDTO);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/detail.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void listCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<CustomerAllDTO> customerAllDTOList = customerService.findAllCustomer();
        request.setAttribute("customerAllDTOList", customerAllDTOList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {

            case "create":
                insertCustomer(request, response);
                break;
        }
    }

    private void insertCustomer(HttpServletRequest request, HttpServletResponse response) {
        Random random = new Random();
        String customerCode = "KH-" + random.nextInt(10000);
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String gender;
        String genderInput = request.getParameter("inlineRadioOptions");
        if (genderInput.equalsIgnoreCase("option1")) {
            gender = "Nam";
        } else {
            gender = "Nữ";
        }
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        String customerType = "Member";
        CustomerAllDTO customerAllDTO = new CustomerAllDTO(customerCode, name, email, phone, address, gender, userName, password, customerType);
        customerService.insertCustomer(customerAllDTO);
        try {
            response.sendRedirect("/customer");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
