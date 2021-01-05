<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<form action="./regdata" method="post">
<p>Enter your Name</p>
<input type="text" name="name">
<br/>
<p>Enter your user name</p>
<input type="text" name="uname">
<br/>
<p>Enter your login password</p>
<input type="password" name="loginPass">
<br/>
<p>Enter your pin</p>
<input type="password" name="pin">
<input type="submit" value="register">
</form>
<a href="index.jsp">LogIn</a>
</body>
</html>