package com.revision;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet2 extends GenericServlet {
	
	private static final long serialVersionUID = 1L;
       
    
    public MyServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }


	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("hello this first servlet application");
	}

}
