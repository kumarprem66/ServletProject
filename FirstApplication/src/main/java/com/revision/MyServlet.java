package com.revision;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class MyServlet implements Servlet {

  
    public MyServlet() {
        // TODO Auto-generated constructor stub
    }

	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}


	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("hello this first servlet application");
	}

}
