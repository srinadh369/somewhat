<!DOCTYPE html>
<html lang="en">
<head>



<link id="callcss" rel="stylesheet" href="../css/bootstrap.min.css"	media="screen" />
<link href="../css/base.css" rel="stylesheet" media="screen" />





<link href="../css/bootstrap-responsive.min.css" rel="stylesheet" />
<link href="../css/font-awesome.css" rel="stylesheet" type="text/css">

<title>Cap Store</title>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/myStyle.css">




<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script> 
$(function() {
$("#includedContent").load("FeatureProduct.jsp"); 
}); 
</script>

</head>



<body>
	<div>
	 <form name="CapStore">

	
		
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




	


	<div id="menu" class="btn-group">
	  <ul class="nav nav-tabs" role="tablist">
			<li><a class="more" href="#">Home</a></li>
			<li><a class="more" href="#">Electronics</a></li>
			<li><a class="more" href="#">Furniture</a></li>
			<li><a class="more" href="#">Clothing</a></li>
			<li><input type="search" size=30 class="form-control"id="search" placeholder="Search"></li>
			<li><button type="button" class="btn btn-info">
			<span class="glyphicon glyphicon-search"></span> Search </button></li>
			<!-- <li><a class="more" href="login">Login</a></li> -->
			
  <li><button class="btn more btn-info" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    Login <span class="glyphicon"></span>
  </button>
  <ul class="dropdown-menu">
    <li><a href="login">Customer Login</a></li>
    <li><a href="merchantlogin">Merchant Login</a></li>

  </ul></li>


			
			<!-- <li><a class="more" href="#">Register</a></li> -->
			 <li><button class="btn more btn-info" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    Register <span class="glyphicon"></span>
  </button>
  <ul class="dropdown-menu">
    <li><a href="customer">Customer Registration</a></li>
    <li><a href="merchant">Merchant Registration</a></li>

  </ul></li>
			
			<li><a class="more" href="#">Items in cart</a></li>
	 </ul>
	 </div>

	

	
	
		<div class="container">
			<br>
			<div id="myCarousel" class="carousel slide" data-ride="carousel">
			
				
				
					<ol class="carousel-indicators">
						<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
						<li data-target="#myCarousel" data-slide-to="1"></li>
						<li data-target="#myCarousel" data-slide-to="2"></li>
						<li data-target="#myCarousel" data-slide-to="3"></li>
					</ol>

					<!-- Wrapper for slides -->
					<center>
						<div class="carousel-inner" role="listbox">

							<div class="item active">
								<img src="images/furniture1.jpg" alt="Chania" width="400px"
									height="350px">
								<div class="carousel-caption"></div>
							</div>

							<div class="item">
								<img src="images/furniture2.jpg" alt="Chania" width="400px"
									height="350px">
								<div class="carousel-caption"></div>
							</div>

							<div class="item">
								<img src="images/furniture3.jpg" alt="Flower" width="400px"
									height="350px">
								<div class="carousel-caption"></div>
							</div>

							<div class="item">
								<img src="images/furniture4.jpg" alt="Flower" width="400px"
									height="350px">
								<div class="carousel-caption"></div>
							</div>

							<div class="item">
								<img src="images/furniture6.jpg" alt="Flower" width="400px"
									height="350px">
								<div class="carousel-caption"></div>
							</div>

							<div class="item">
								<img src="images/furniture4.jpg" alt="Flower" width="400px"
									height="350px">
								<div class="carousel-caption"></div>
							</div>

							<div class="item">
								<img src="images/furniture7.jpg" alt="Flower" width="400px"
									height="350px">
								<div class="carousel-caption"></div>
							</div>

							<div class="item">
								<img src="images/furniture8.jpg" alt="Flower" width="400px"
									height="350px">
								<div class="carousel-caption"></div>

							</div>

						</div>
					</center>

					
					<a class="left carousel-control" href="#myCarousel" role="button"
						data-slide="prev"> <span
						class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
						<span class="sr-only">Previous</span>
					</a> <a class="right carousel-control" href="#myCarousel" role="button"
						data-slide="next"> <span
						class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
						<span class="sr-only">Next</span>
					</a>
				</div>
			</div>
			<hr>
			

			

			<div id="FeatureHeader" style="float: left;">

				<h2>Featured Products</h2>

			</div>
			

			


			<div id="list">

				<table border="2" width=100% cellspacing=10>
					<tr>
						<th>

							<h6>List Of Items</h6>
							<div>
								<ul>Furniture							</ul>
								<li><a href="#">Furniture 1</a></li>
								<li><a href="#">Furniture 2</a></li>
								<li><a href="#">Furniture 3</a></li>

							</div> <!-- Clothing List  -->

							<div>
								<ul>Clothing
								</ul>
								<li><a href="#">Furniture 1</a></li>
								<li><a href="#">Furniture 2</a></li>
								<li><a href="#">Furniture 3</a></li>
							</div> <!-- Electronics List  -->

							<div>
								<ul>Electronics
								</ul>
								<li><a href="#">Furniture 1</a></li>
								<li><a href="#">Furniture 2</a></li>
								<li><a href="#">Furniture 3</a></li>
							</div>

						</th>

						<th>
							<div id="includedContent"></div>
						</th>
					</tr>

				</table>
			</div>





			

			

			<div id="footer">
				<center>Copyright © Capstore.com</center>

				<center>
					<a href="#">|24X7 Customer Support|</a> <a href="#">Contact Us|</a>
					<a href="#">Home|</a> <a href="#">About Us|</a> <a href="#">Admin/Merchant
						Login|</a> <a href="#">Return Goods|</a> <a href="#">Feedback|</a>
				</center>
			</div>

	









		</form>
	</div>
</body>
</html>
