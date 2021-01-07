<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="CSS/loginStyle.css">
	<link rel="preconnect" href="https://fonts.gstatic.com">
	<link href="https://fonts.googleapis.com/css2?family=Heebo:wght@300&display=swap" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css2?family=Comfortaa:wght@600&display=swap" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css2?family=Roboto+Slab&display=swap" rel="stylesheet">
	<title>/*Bank Name*/</title>
	</head>
	<body>
		<div class="box">
			<form action="./logdata" method="post">
				<div class="heading">Login</div>
				<div class="feild">
					<div class="feildDiscription">Enter User Name</div>
					<div class="feildInput"><input type="text" name="userName"></div>
				</div>
				<div class="feild">
					<div class="feildDiscription">Enter Password</div>
					<div class="feildInput"><input type="password" name="password"></div>
				</div>
				<div class="message">${message }</div>
				<div class="submitButton"><input type="submit" value="login"></div>
			</form>
			<div class="link">Don't have an account?<br/><a href="register.jsp">Sign Up here</a></div>
		</div>
	</body>
</html>	