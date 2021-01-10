<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="CSS/homeStyle.css">
		<link rel="preconnect" href="https://fonts.gstatic.com">
		<link href="https://fonts.googleapis.com/css2?family=Roboto+Slab&display=swap" rel="stylesheet">
		<link href="https://fonts.googleapis.com/css2?family=Goldman&display=swap" rel="stylesheet">
		<title>TITLE</title>
	</head>
	<body>
		<div class="content">
			<div class="heading">Welcome to home page</div>
			<div class="option">
				<form action="./Withdraw" method="post">
					<button id="withdraw" class="btn" type="button">withdraw</button>
					<div class="addInputFeild1"></div>
				</form>
			</div>
			
			<div class="option">
				<form action="./Deposit" method="post">
					<button id="deposit" class="btn" type="button">Deposit</button>
					<div class="addInputFeild2"></div>
				</form>
			</div>
			
			<div class="option">
				<button class="btn" type="button">Check Balance</button>
			</div>
		
			<div class="option"><a href="edit.jsp"><button class="btn">Edit your account details</button></a></div>
			
			<div class="option"><a href="Logout"><button class="btn">Logout</button></a></div>
			
			<div class="message">${message }</div>
		</div>
		<script src="JS/homeScript.js"></script>
		<script src="JS/preventBackward.js"></script>
	</body>
</html>