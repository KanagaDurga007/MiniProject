package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name= "LoginPage",
urlPatterns= {"/LoginPage"})
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String struser = request.getParameter("uname");
		String strpwd = request.getParameter("pass");
		
		if(struser == "Mani" && strpwd == "Kd"){
			response.sendRedirect("WelcomPage.jsp");
		}
	}

}
