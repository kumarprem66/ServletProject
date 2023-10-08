package com.revision;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		if(username.equalsIgnoreCase("prem") && password.equals("kumar")) {
//			writer.println("Login sucess");
//			response.sendRedirect("http://www.tcs.com");
			writer.println("<a href='http://www.facebook.com'>Click here to get facebook</a>");
//			RequestDispatcher dispatcher = request.getRequestDispatcher("success.html");
//			dispatcher.forward(request, response);
		}else {
//			writer.println("Login Fail");
//			response.sendError(808,"Login fail try with valid data");
			RequestDispatcher dispatcher = request.getRequestDispatcher("fail.html");
			dispatcher.forward(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
