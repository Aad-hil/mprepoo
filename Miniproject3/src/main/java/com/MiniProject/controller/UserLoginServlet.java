package com.MiniProject.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.MiniProject.miniproject_3.dao.UserDAO;

public class UserLoginServlet extends HttpServlet {
	private UserDAO userDAO = new UserDAO();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (userDAO.validateUser(username, password)) {
			HttpSession session = request.getSession();
			session.setAttribute("user", username);
			response.sendRedirect("jsp/user/quizList.jsp");
		} else {
			response.sendRedirect("jsp/user/login.jsp?error=Invalid credentials");
		}
	}
}
