<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>






<!-- ********************************************************************************** -->
<!-- Bootstrap style -->


<link id="callcss" rel="stylesheet" href="css/bootstrap.min.css"	media="screen" />
<link href="css/base.css" rel="stylesheet" media="screen" />
<!-- ********************************************************************************** -->

<!-- Bootstrap style responsive -->


<link href="css/bootstrap-responsive.min.css" rel="stylesheet" />
<link href="css/font-awesome.css" rel="stylesheet" type="text/css">



<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/myStyle.css">




 <script type="text/javascript" src="js/customerRegisterFormValidation.js"></script> 


<!-- ********************************************************************************** -->
<!--Java Script -->

<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script> 
$(function() {
$("#includedContent").load("FeatureProduct.jsp"); 
}); 
</script>
</script>

</head>
<style>
.errMsg{
	color:red;
	font-size:14 px;
	font-weight: bold;
}

</style>

<body >



		<div>
	
	 <form:form action="saveCustomer" method="post" commandName="customer" name="saveform" onsubmit="return isvalidcustomer()">

		
	
	<div id="logo"> <img src="images/Logo.png" class="img-rounded" alt="Cinque Terre" width="200" height="110" align="left"> </div>
	  <div id="logo"> 
	   <font style="color: #00264d; font-weight: bold;"> 
		<center>
	 		<h1>CAP STORE</h1>
	 		<small><i>Worlds Largest Online Super Market</i></small>
		</center>
		</font>
		</div>

	
	<h1 align="center">You have Successfully Registered !!</h1>
	<br><br><br>
	<li color="red" align="center" font-weight="bold" ><a href="login">Click Here to Log in</a></li>
	
</form:form>

<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>


	<!-- ********************************************************************************** -->

			<!-- Footer Section -->

			<div id="footer">
				<center>Copyright © Capstore.com</center>

				<center>
					<a href="#">|24X7 Customer Support|</a> <a href="#">Contact Us|</a>
					<a href="#">Home|</a> <a href="#">About Us|</a> <a href="#">Admin/Merchant
						Login|</a> <a href="#">Return Goods|</a> <a href="#">Feedback|</a>
				</center>
			</div>

	<!-- ********************************************************************************** -->
	






		</form>
	</div>


</body>
</html> 