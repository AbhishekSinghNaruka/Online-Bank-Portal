<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TITLE</title>
</head>
<body>
<h1>Welcome to home page</h1>
<form action="./Withdraw" method="post">
<button id="withdraw" type="button">withdraw</button>
<div class="addInputFeild1"></div>
</form>

<form action="./Deposit" method="post">
<button id="deposit" type="button">Deposit</button>
<div class="addInputFeild2"></div>
</form>

<div class="balance">
<button class="Balance" type="button">Check Balance</button>
</div>

<a href="edit.jsp">Edit your account details</a>
<br/>
${message }

<script>
console.log("in script");
var withdButton=document.getElementById("withdraw");
var depButton=document.getElementById("deposit");
var addInput1=document.querySelector(".addInputFeild1");
var addInput2=document.querySelector(".addInputFeild2");
var isFeildAdded=false;
console.log("withdButton: "+withdButton);
console.log("depButton: "+depButton);
console.log("addInput1:"+addInput1);
console.log("addInput2: "+addInput2);

withdButton.addEventListener("click", function (){
	if(isFeildAdded==true)
	{
		addInput2.removeChild(document.querySelector(".added"));
		console.log("in if widthButton event");
	}
		addInput1.innerHTML=`<div class="added"><input type="text" name="amount"><input type="submit" value="submit"></div>`;
		isFeildAdded=true;
	
});

depButton.addEventListener("click",function(){
	if(isFeildAdded==true)
	{
		addInput1.removeChild(document.querySelector(".added"));
		console.log("in if widthButton event");
	}
		addInput2.innerHTML=`<div class="added"><input type="text" name="amount"><input type="submit" value="submit"></div>`;
		console.log("in else widthButton event");
		isFeildAdded=true;
	
});

</script>
</body>
</html>