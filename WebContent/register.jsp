<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="CSS/registerStyle.css">
		<link rel="preconnect" href="https://fonts.gstatic.com">
		<link href="https://fonts.googleapis.com/css2?family=Heebo:wght@300&display=swap" rel="stylesheet">
		<link href="https://fonts.googleapis.com/css2?family=Comfortaa:wght@600&display=swap" rel="stylesheet">
		<link href="https://fonts.googleapis.com/css2?family=Roboto+Slab&display=swap" rel="stylesheet">
		<title>Register</title>
	</head>
	<body>
		<div class="box">
			<form name="register" action="./regdata" onsubmit="return regValidateForm()" method="post">
				<div class="heading">SignUp</div>
				<div class="feild">
					<div class="feildDiscription">Enter your Name</div>
					<div class="feildInput"><input type="text" name="name"></div>
				</div>
				<div class="feild">
					<div class="feildDiscription">Enter your emailID</div>
					<div class="feildInput"><input type="text" name="uname"></div>
				</div>
				<div class="feild">
					<div class="feildDiscription">Enter your login password</div>
					<div class="feildInput"><input type="password" name="loginPass"></div>
				</div>
				<div class="feild">
					<div class="feildDiscription">Enter your 6 digit pin</div>
					<div class="feildInput"><input type="password" name="pin"></div>
				</div>
				<div class="message">${message }</div>
				<div class="submitButton"><input type="submit" value="register"></div>
			</form>
			<div class="link">OR<br/><a href="index.jsp">LogIn</a></div>
		</div>
	<script src="JS/registerValidation.js"></script>
	</body>
</html>