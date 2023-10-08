<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>

	<form action="regForm" method="post">
	
		Name : <input type="text" name="name"> <br/><br/>
		Email : <input type="email" name="email"> <br/><br/>
		Password : <input type="password" name="password"> <br/><br/>	
		Gender : <input type="radio" name="gender" value="male"/> Male
		<input type="radio" name="gender"/ value="female"> Female
		<br/><br/>
		City :
		 <select>
			<option>Select City<option/>
			<option>Delhi<option/>
			<option>Mumbai<option/>
			<option>Pune<option/>
			<option>Bengaluru<option/>
		
		</select> <br/><br/>
		<input type="submit" value="Register"/>
	</form>
</body>
</html>