package com.placement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String username = request.getParameter("email");
		String password = request.getParameter("password");
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		if(username.equalsIgnoreCase("prem") && password.equals("kumar")) {
			
			
//			request.setAttribute("name_key", "prem kumar");  // this data can only be fetched in index.hmtl to overcome this we session
			
			
			HttpSession session = request.getSession();
			session.setAttribute("name_key", "prem kumar");
			
			
			
			
			jakarta.servlet.RequestDispatcher rd = request.getRequestDispatcher("/profile.jsp");
			rd.forward(request, response);
		}else {

			writer.print("Email and password did not match");
			jakarta.servlet.RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response); // include both writer and index.html
		}
		
	}

	


}
