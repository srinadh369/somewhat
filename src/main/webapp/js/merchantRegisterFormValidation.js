function isvalidmerchant()

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
	
if(!isProperCompanyName()){
		
		flag = false;
		document.getElementById("companyname_err").innerHTML = "*Company Name must be in correct format(Ex-XYZ Company)";
	}	
	else
		document.getElementById("companyname_err").innerHTML = "";

if(!isProperDisplayName()){
	
	flag = false;
	document.getElementById("displayname_err").innerHTML = "*Company Display Name must be in correct format(Ex-XYZ Company)";
}	
else
	document.getElementById("displayname_err").innerHTML = "";
	


if(!isProperMobileNumber()){
		
		flag = false;
		document.getElementById("mobile_err").innerHTML = "*Phone Number should be of 10 digits and should start with 7,8 or 9";
	}	
	else
		document.getElementById("mobile_err").innerHTML = "";

if(!isProperCityName()){
	
	flag = false;
	document.getElementById("cityname_err").innerHTML = "*City Name must be in correct format(Ex-Pune) and should contain only alphabets";
}	
else
	document.getElementById("cityname_err").innerHTML = "";

if(!isProperStateName()){
	
	flag = false;
	document.getElementById("statename_err").innerHTML = "*State Name must be in correct format(Ex-Punjab) and should contain only alphabets";
}	
else
	document.getElementById("statename_err").innerHTML = "";





if(!isProperPincode()){
	
	flag = false;
	document.getElementById("pincode_err").innerHTML = "*Pin Code should be of 6 digits";
}	
else
	document.getElementById("pincode_err").innerHTML = "";

if(!isProperAddress()){
	
	flag = false;
	document.getElementById("address_err").innerHTML = "*Address cannot be blank";
}	
else
	document.getElementById("adress_err").innerHTML = "";



if(!isProperPassword()){
	
	flag = false;
	document.getElementById("password_err").innerHTML = "*Password must be 8 characters and it should contain at least one special character(@,!,#)";
}	
else
	document.getElementById("password_err").innerHTML = "";


	
if(!isProperEmail()){
		
		flag = false;
		document.getElementById("email_err").innerHTML = "*Please enter valid Email-Id";
	}	
	else
		document.getElementById("email_err").innerHTML = "";

if(!isProperPanCard()){
	
	flag = false;
	document.getElementById("pancard_err").innerHTML = "*Please enter valid Pan-Card";
}	
else
	document.getElementById("pancard_err").innerHTML = "";


if(!isProperTradeLicense()){
	
	flag = false;
	document.getElementById("tradelicense_err").innerHTML = "*Please enter valid Trade-License";
}	
else
	document.getElementById("tradelicense_err").innerHTML = "";





	
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

function isProperCompanyName(){
	
	var kin = document.getElementById("companyname").value;
	
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


function isProperDisplayName(){
	
	var kin = document.getElementById("displayname").value;
	
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

function isProperCityName(){
	
	var kin = document.getElementById("city").value;
	
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

function isProperStateName(){
	
	var kin = document.getElementById("state").value;
	
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

function isProperPincode(){
	
	var kin = document.getElementById("pincode").value;
	
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

function isProperAddress(){
	
	var kin = document.getElementById("address").value;
	
	if(kin=="")
		return false;
	
	else{
		
		var regex = /^$|\s+/;
		
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
	
function isProperPanCard(){
	
	var kin = document.getElementById("pancard").value;
	
	if(kin=="")
		return false;
	
	else{
		
	
		var regex = /(1|2|3|4|5|6|7|8|9)\d{5}/;
		
		if (!regex.test(kin)) 
			return false;
		
		else
			return true;
			
	}
}


function isProperTradeLicense(){
	
	var kin = document.getElementById("tradelicense").value;
	
	if(kin=="")
		return false;
	
	else{
		
		var regex = /^[/sa-zA-Z0-9]+$/;
		
		if (!regex.test(kin)) 
			return false;
		
		else
			return true;
			
	}
}

