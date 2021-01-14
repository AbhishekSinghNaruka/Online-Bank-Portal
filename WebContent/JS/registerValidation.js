function regValidateForm()
	{
		var name=document.forms["register"]["name"].value;
		var uname=document.forms["register"]["uname"].value;
		var pin=document.forms["register"]["pin"].value;
		if(name=="")
		{
			alert("name must be filled out");
			return false;
		}
		if(uname=="")
		{
			alert("emailID must be filled out");
			return false;
		}
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
		else if(pin.length!=6)
		{
			alert("pin must be of 6 digit");
			return false;
		}
	}