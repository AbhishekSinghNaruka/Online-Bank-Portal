function loginValidateForm()
	{
		var x=document.forms["login"]["userName"].value;
		console.log(x);
		if(x=="")
		{
			alert("emailID must be filled out");
			return false;
		}
	}