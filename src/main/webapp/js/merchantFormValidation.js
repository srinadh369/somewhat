function isvalidmerchant()

{
	


	var flag=true;
	var kin = document.getElementById("pass").value;
		
	if(!isProperEmail()){
		
		flag = false;
		document.getElementById("email_err").innerHTML = "*Please enter valid email_Id";
	}	
	else
		document.getElementById("email_err").innerHTML = "";
		
	
	if(kin==""||kin==null){
		
		flag = false;
		document.getElementById("pass_err").innerHTML = "*Please enter valid password";
	}
	else
		document.getElementById("pass_err").innerHTML = "";
			 
	
	return flag;	
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



