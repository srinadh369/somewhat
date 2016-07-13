function isvalidcustomer()

{
	

	
	var flag=true;
	
	


	if(!isProperFirstName()){
		
		flag = false;
		document.getElementById("firstname_err").innerHTML = "*First Name must be in correct format(Ex-Ram)";
	}	
	else
		document.getElementById("firstname_err").innerHTML = "";
		

	if(!isProperLastName()){
		
		flag = false;
		document.getElementById("lastname_err").innerHTML = "*Last Name must be in correct format(Ex-Kumar)";
	}	
	else
		document.getElementById("lastname_err").innerHTML = "";
	
if(!isProperEmail()){
		
		flag = false;
		document.getElementById("email_err").innerHTML = "*Please enter valid Email-Id";
	}	
	else
		document.getElementById("email_err").innerHTML = "";
	
	
if(!isProperMobileNumber()){
		
		flag = false;
		document.getElementById("mobile_err").innerHTML = "*Phone Number should be of 10 digits and should start with 7,8 or 9";
	}	
	else
		document.getElementById("mobile_err").innerHTML = "";


if(!isProperPassword()){
	
	flag = false;
	document.getElementById("password_err").innerHTML = "*Password must be 8 characters and it should contain at least one special character(@,!,#)";
}	
else
	document.getElementById("password_err").innerHTML = "";


if(!isProperAnswer()){
	
	flag = false;
	document.getElementById("securityanswer_err").innerHTML = "*Answer field should contain only characters";
}	
else
	document.getElementById("securityanswer_err").innerHTML = "";



	
	return flag;	
	
	
	
}


/*<---------------------------------------validation--------------------------------------------->*/


function isProperFirstName(){
	
	var kin = document.getElementById("fname").value;
	
	if(kin=="")
		return false;
	
	else{
		
		var regex = /^([A-Za-z. ]+)$/;
		
		if (!regex.test(kin)) 
			return false;
		
		else
			return true;
			
	}
}

function isProperLastName(){
	
	var kin = document.getElementById("lname").value;
	
	if(kin=="")
		return false;
	
	else{
		
		var regex = /^([A-Za-z. ]+)$/;
		
		if (!regex.test(kin)) 
			return false;
		
		else
			return true;
			
	}
}


function isProperEmail(){
	
	var kin = document.getElementById("email").value;
	
	if(kin=="")
		return false;
	
	else{
		
		var regex = /^([a-z]+[a-z0-9_.]+[@][a-z]+[.][a-z]{2,3})$/;
		
		if (!regex.test(kin)) 
			return false;
		
		else
			return true;
			
	}
}
	
function isProperMobileNumber(){
	
	var kin = document.getElementById("mobile").value;
	
	if(kin=="")
		return false;
	
	else{
		
		var regex = /(7|8|9)\d{9}/;
		
		if (!regex.test(kin)) 
			return false;
		
		else
			return true;
			
	}
}

function isProperPassword(){
	
	var kin = document.getElementById("password").value;
	
	if(kin=="")
		return false;
	
	else{
		
		var regex = /^([A-Za-z!0-9@#$%^&|]{8})$/;
		
		if (!regex.test(kin)) 
			return false;
		
		else
			return true;
			
	}
}
	
function isProperAnswer(){
	
	var kin = document.getElementById("securityanswer").value;
	
	if(kin=="")
		return false;
	
	else{
		
		var regex = /^([a-zA-Z. ]+)$/;
		
		if (!regex.test(kin)) 
			return false;
		
		else
			return true;
			
	}
}
	

	