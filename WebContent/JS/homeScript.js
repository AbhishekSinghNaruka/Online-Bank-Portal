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
		addInput1.innerHTML=`<div class="added">Pin<input type="password" name="pin">Amount<input type="text" name="amount"><input type="submit" value="submit"></div>`;
		isFeildAdded=true;
	
});

depButton.addEventListener("click",function(){
	if(isFeildAdded==true)
	{
		addInput1.removeChild(document.querySelector(".added"));
		console.log("in if widthButton event");
	}
		addInput2.innerHTML=`<div class="added">Pin<input type="password" name="pin">Amount<input type="text" name="amount"><input type="submit" value="submit"></div>`;
		console.log("in else widthButton event");
		isFeildAdded=true;
	
});

