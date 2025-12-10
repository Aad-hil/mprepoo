package com.MiniProject.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.MiniProject.miniproject_3.dao.AdminDAO;

public class AdminLoginServlet extends HttpServlet {
    private AdminDAO adminDAO = new AdminDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (adminDAO.validateAdmin(username, password)) {
            HttpSession session = request.getSession();
            session.setAttribute("admin", username);
            response.sendRedirect("jsp/admin/dashboard.jsp");
        } else {
            response.sendRedirect("jsp/admin/login.jsp?error=Invalid credentials");
        }
    }
}
