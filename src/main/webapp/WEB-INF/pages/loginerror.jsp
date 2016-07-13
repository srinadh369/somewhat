<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>






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

<!-- ********************************************************************************** -->
<!--Java Script -->

<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script> 
$(function() {
$("#includedContent").load("FeatureProduct.jsp"); 
}); 
</script>



<script type="text/javascript" src="js/customerFormValidation.js"></script>



</head>
<style>
.errMsg{
	
	color: red;
	font-size: 14px;
	font-weight: bold;
}
</style>
<body>



		<div>
	 <%-- <form name="CapStore"> --%>
	 <%--<form:form action="saveCustomer" method="post" commandName="customer">--%>

	<!-- Head Section -->

		
	<font color="white">
	
	 <div id="head">

		<h4 style="float: right;"> 	Welcome <label name="userName">User</label> </h4>
		
	 </div>
	 
	</font>



	<!-- ********************************************************************************** -->
	<!-- Section 2 Logo-->
	
	
		<!-- Head Section -->

		
	<font color="white">
	
	 <div id="head">

		<h4 style="float: right;"> 	Welcome <label name="userName">User</label> </h4>
		
	 </div>
	 
	</font>
	
	
	<div id="logo"> <img src="images/Logo.png" class="img-rounded" alt="Cinque Terre" width="200" height="110" align="left"> </div>
	  <div id="logo"> 
	   <font style="color: #00264d; font-weight: bold;"> 
		<center>
	 		<h1>CAP STORE</h1>
	 		<small><i>Worlds Largest Online Super Market</i></small>
		</center>
		</font>
		</div>




<form:form action="userlogin" method="post" commandName="login"  name="loginForm" onsubmit="return isvalidcustomer()" >  
<h3 align="center"><font color="red">Enter Valid E-MailId & Password</font></h3>
    	<table align="center">
    	<tr><td>E-MailId</td>
    		<td></td>
    		<td><form:input path="email_id" id="email"/></td>
    		<td><div id="email_err" class="errMsg"></div></td>
    	</tr>
    	<tr>
    		<td>Password</td>
    		<td></td>
    	    <td><form:input path="password" type="password" id="pass"/></td>
    	    <td><div id="pass_err" class="errMsg"></div></td>
    	</tr> 
    	</tr>
    	<tr>
    		
    		<td></td>
    		<td></td>
    		
    	    <td> <a href="#">Forgot password?</a></td>
    	</tr> 
    	
    	
    	
    	<tr>
    		<td></td>
    		<td></td>
    		</br>
    		</tr>
    		<td><input type="submit" value="Submit" ><input type="button" value="Cancel"></td>
    	</tr>
    	</table>
    	</form:form>






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
		
		
		
	

	
	





