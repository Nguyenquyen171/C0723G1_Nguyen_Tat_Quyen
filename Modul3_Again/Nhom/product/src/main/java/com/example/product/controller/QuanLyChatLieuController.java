package com.example.product.controller;



import com.example.product.model.QuanLyChatLieu;
import com.example.product.service.IAccountService;
import com.example.product.service.impl.AccountService;
import com.example.product.service.impl.QuanLyChatLieuService;

import javax.print.attribute.standard.Severity;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "shshs", urlPatterns = "/quan_ly_chat_lieu")
public class QuanLyChatLieuController extends HttpServlet {
    private IAccountService accountService = new AccountService();
    private final QuanLyChatLieuService quanLyChatLieuService = new QuanLyChatLieuService();


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
        HttpSession session = request.getSession();
        String user = (String) session.getAttribute("account");
        if(user != null && !user.equals("") && accountService.getAccType(user) == 2 ){
            request.setCharacterEncoding("UTF-8");
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
        String describe = request.getParameter("describe");
        QuanLyChatLieu quanLyChatLieu = new QuanLyChatLieu(nameId, nameType, describe);
        quanLyChatLieuService.insert(quanLyChatLieu);
        RequestDispatcher dispatcher = request.getRequestDispatcher("material/add.jsp");
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
        String describe = request.getParameter("describe");
        int id =  quanLyChatLieuService.getIdByCode(code);
        QuanLyChatLieu quanLyChatLieu = new QuanLyChatLieu(id, code, nameType, describe);
        quanLyChatLieuService.update(quanLyChatLieu);
        RequestDispatcher dispatcher = request.getRequestDispatcher("material/edit.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void displayAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<QuanLyChatLieu> quanLyChatLieuList = quanLyChatLieuService.selectAll();
        List<String> listName = quanLyChatLieuService.getAllName();
        request.setAttribute("listName",listName);
        request.setAttribute("list", quanLyChatLieuList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("material/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String word = request.getParameter("word");
        List<QuanLyChatLieu> quanLyChatLieuList = quanLyChatLieuService.selectAllByName(word);
        request.setAttribute("list", quanLyChatLieuList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("material/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("material/add.jsp");
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
        QuanLyChatLieu quanLyChatLieu = quanLyChatLieuService.select(id);
        request.setAttribute("QuanLyChatLieu", quanLyChatLieu);
        RequestDispatcher dispatcher = request.getRequestDispatcher("material/edit.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

