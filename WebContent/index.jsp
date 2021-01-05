<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>/*Bank Name*/</title>
</head>
<body>
<form action="./logdata" method="post">
<p>Enter User Name</p>
<input type="text" name="userName">
<p>Enter Password</p>
<input type="password" name="password">
<p>${message }</p>
<br/>
<input type="submit" value="login">
</form>
<br/><br/>
<a href="register.jsp">Sign Up</a>
</body>
</html>	