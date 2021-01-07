<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Customer customer= (Customer) session.getAttribute("customer");
%>

<form action="./Edit" method="post">
<h3>Enter name</h3>
<input type="text" name="name" value="<%=customer.getName() %>"/>
<br/>
<h3>Enter user name</h3>
<input type="text" name="uname" value="<%=customer.getUname() %>"/>
<br/>
<h3>Enter new Login password</h3>
<input type="text" name="pass" value="<%= customer.getLoginPass() %>"/>
<br/>
<input type="submit" value="save changes"/>
</form>
</body>
</html>