<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%!
	
		int a = 10;
		String name = "deepak";
		int square(){
			return a*a;
		}
	
	%>


	<%
		out.println("a : "+a);
		out.println("Name : "+name);
		int b = 10;
		
		if(b<100){
			out.println("prem");
		}
		
		
	%>
	<form method="post" action="profile.jsp">
		<input type="text" name="email" placeholder="Enter email">
		<input type="password" name="password" placeholder="Enter Password">
		<input type="submit" value="Login">
	</form>
	
	
</body>
</html>