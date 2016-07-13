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

 <script type="text/javascript" src="js/merchantRegisterFormValidation.js"></script>
 
<!-- ********************************************************************************** -->
<!--Java Script -->

<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script> 
$(function() {
$("#includedContent").load("FeatureProduct.jsp"); 
}); 
</script>







</head>


<style>
.errMsg{
	color:red;
	font-size:14 px;
	font-weight: bold;
}

</style>

<body>



		<div>
	 <%-- <form name="CapStore"> --%>
	 <form:form action="saveMerchant" method="post" commandName="merchant" onsubmit="return isvalidmerchant()">


	<div id="logo"> <img src="images/Logo.png" class="img-rounded" alt="Cinque Terre" width="200" height="110" align="left"> </div>
	  <div id="logo"> 
	   <font style="color: #00264d; font-weight: bold;"> 
		<center>
	 		<h1>CAP STORE</h1>
	 		<small><i>Worlds Largest Online Super Market</i></small>
		</center>
		</font>
		</div>


	<h1 align="center">Merchant Registration Form</h1>
	
	<table>
		<tr>
			<td>First Name:</td>
			<td><form:input path="first_name" id="fname"/></td>
			<td>
				<div id="firstname_err" class="errMsg"></div>
			</td>
		</tr>
		
		<tr>
			<td>Last Name:</td>
			<td><form:input path="last_name" id="lname"/></td>
			<td>
				<div id="lastname_err" class="errMsg"></div>
			</td>
		</tr>
		
		<tr>
			<td>Company Name:</td>
			<td><form:input path="company_name" id="companyname"/></td>
			<td>
				<div id="companyname_err" class="errMsg"></div>
			</td>
		</tr>
		
		<tr>
			<td>Company Display Name:</td>
			<td><form:input path="company_display_name" id="displayname"/></td>
			<td>
				<div id="displayname_err" class="errMsg"></div>
			</td>
		</tr>
		
		<tr>
			<td>Mobile Phone:</td>
			<td><form:input path="mobile_no" id="mobile"/></td>
			<td>
				<div id="mobile_err" class="errMsg"></div>
			</td>
		</tr>
		
			<tr>
			<td>Address:</td>
			<td><form:input path="address" id="address"/></td>
			<td>
				<div id="address_err" class="errMsg"></div>
			</td>
		</tr>
		
			<tr>
			<td>City:</td>
			<td><form:input path="city" id="city"/></td>
			<td>
				<div id="cityname_err" class="errMsg"></div>
			</td>
		</tr>
		
			<tr>
			<td>State:</td>
			<td><form:input path="state" id="state"/></td>
			<td>
				<div id="statename_err" class="errMsg"></div>
			</td>
		</tr>
		
			<tr>
			<td>Pin Code:</td>
			<td><form:input path="zip" id="pincode"/></td>
			<td>
				<div id="pincode_err" class="errMsg"></div>
			</td>
		</tr>
		
		<tr>
			<td>Password:</td>
			<td><form:input path="password" type="password" id="password"/></td>
			<td>
				<div id="password_err" class="errMsg"></div>
			</td>
		</tr>
		
		<tr>
			<td>Email - Address:</td>
			<td><form:input path="email_id" id="email"/></td>
			<td>
				<div id="email_err" class="errMsg"></div>
			</td>
		</tr>
		
		<tr>
			<td>Pan Card No:</td>
			<td><form:input path="pancard_no" id="pancard"/></td>
			<td>
				<div id="pancard_err" class="errMsg"></div>
			</td>
		</tr>
		
			<tr>
			<td>Trade License No:</td>
			<td><form:input path="trade_license" id="tradelicense"/></td>
			<td>
				<div id="tradelicense_err" class="errMsg"></div>
			</td>
		</tr>
		
		<tr>
			<td>Merchant Type:</td>
			<td>
				<form:select path="merchant_type">
					<c:if test="${!empty merchanttype }">
						<c:forEach items="${merchanttype}" var="mtype">
							<form:option value="${mtype}">${mtype}</form:option>
						</c:forEach>
					
					</c:if>
				
				</form:select>
			</td>
			<td>
			
			</td>
		</tr>
		
		<tr>
			<td></td>
			<td>
				<input type="submit" value="Submit"/>
				<input type="reset"	value="Cancel"></input>
			</td>
			<td>
			
			</td>
		</tr>
		
	</table>
	<div>
	
		<form:errors path="*" cssClass="errMsg"></form:errors>
	</div>
	

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