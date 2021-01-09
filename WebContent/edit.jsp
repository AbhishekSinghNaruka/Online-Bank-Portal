<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.model.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="CSS/editStyle.css">
		<link rel="preconnect" href="https://fonts.gstatic.com">
		<link href="https://fonts.googleapis.com/css2?family=Roboto+Slab&display=swap" rel="stylesheet">
	</head>
	<body>
	<%
	Customer customer= (Customer) session.getAttribute("customer");
	%>
		<div class="box">
			<div class="heading">Edit Details</div>
			<form action="./Edit" method="post">
				<div class="feild">
					<div class="feildDiscription">Enter name</div>
					<div class="feildInput"><input type="text" name="name" value="<%=customer.getName() %>"/></div>
				</div>
				<div class="feild">
					<div class="feildDiscription">Enter user name</div>
					<div class="feildInput"><input type="text" name="uname" value="<%=customer.getUname() %>"/></div>
				</div>
				<div class="feild">
					<div class="feildDiscription">Enter new Login password</div>
					<div class="feildInput"><input type="text" name="pass" value="<%= customer.getLoginPass() %>"/></div>
				</div>
				<div class="message"></div>
				<div class="submitButton"><input type="submit" value="save changes"/></div>
			</form>
		</div>
	</body>
</html>