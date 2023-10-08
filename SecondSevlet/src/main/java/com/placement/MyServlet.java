package com.placement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/search")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		response.setContentType("text/html");
//		response.getWriter().println("prem kumar");
		
		
//		String mySearch = request.getParameter("data");
//		response.sendRedirect("https:www.google.com/search?q="+mySearch);
		
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("something");
		RequestDispatcher rd = request.getRequestDispatcher("/index.html");
		rd.forward(request, response);
		rd.include(request, response); //will include both out and index.html
		
		
	}



}
