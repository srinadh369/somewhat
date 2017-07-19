function validate(){
	var username = document.getElementById("userid").value;
	var password = document.getElementById("password").value;

	if((username!="") && (password!=""))
	{
		var json={"credentials": [
	      {"user": "pratz", "pass": "pass@123"},
	      {"user": "sri", "pass": "pass@123"},
	      {"user": "anandhi", "pass": "pass@123"},
	      {"user": "darshini", "pass": "pass@123"},
	      {"user": "shravan", "pass": "pass@123"}       
	    ]
	  }
	  for(var i=0;i<json.credentials.length;i++){
	         if((username==json.credentials[i].user) && (password==json.credentials[i].pass)){
	            window.open ('C:/Users/srayala/Desktop/Login/homepage.html'); //redirecting to other page
	            return false;
	            break;
	        	}
	        }
    }
    else{
    	alert('Please enter the credentials');
    }


}