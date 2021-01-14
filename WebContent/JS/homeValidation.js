function withdrawValidateForm(){
	var pin=document.forms["withdraw"]["pin"].value;
	var amount=document.forms["withdraw"]["amount"].value;
	if(pin=="")
	{
		alert("pin must be filled out");
		return false;
	}
	else if(!Number.isInteger(Number(pin)))
	{
		alert("pin must be integer");
		return false;
	}
	if(amount=="")
	{
		alert("amount must be filled out");
		return false;
	}
	else if(isNaN(amount))
	{
		alert("amount must be numeric");
		return false;
	}
}

function depositValidateForm(){
	var pin=document.forms["deposit"]["pin"].value;
	var amount=document.forms["deposit"]["amount"].value;
	if(pin=="")
	{
		alert("pin must be filled out");
		return false;
	}
	else if(!Number.isInteger(Number(pin)))
	{
		alert("pin must be integer");
		return false;
	}
	if(amount=="")
	{
		alert("amount must be filled out");
		return false;
	}
	else if(isNaN(amount))
	{
		alert("amount must be numeric");
		return false;
	}
}