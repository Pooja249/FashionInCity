<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Connection.Connect"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
<title>Women's Fashion a Ecommerce Online Shopping Category Flat Bootstrap Responsive Website Template | Mail Us :: w3layouts</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Women's Fashion Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/fasthover.css" rel="stylesheet" type="text/css" media="all" />
<!-- js -->
<script src="js/jquery.min.js"></script>
<!-- //js -->
<!-- cart -->
<script src="js/simpleCart.min.js"></script>
<!-- cart -->
<!-- for bootstrap working -->
<script type="text/javascript" src="js/bootstrap-3.1.1.min.js"></script>
<!-- //for bootstrap working -->
<link href='//fonts.googleapis.com/css?family=Glegoo:400,700' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
<!-- start-smooth-scrolling -->
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script>
<!-- //end-smooth-scrolling -->
</head>
	
<body>
<!-- header -->
<jsp:include page="header.jsp"></jsp:include> 
<!-- //header -->
<!-- banner -->
	<div class="banner10" id="home1">
		<div class="container">
			<h2>Mail Us</h2>
		</div>
	</div>
<!-- //banner -->

<!-- breadcrumbs -->
	<div class="breadcrumb_dress">
		<div class="container">
			<ul>
				<li><a href="index.html"><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Home</a> <i>/</i></li>
				<li>Mail Us</li>
			</ul>
		</div>
	</div>
<!-- //breadcrumbs -->

<!-- mail -->
	<div class="mail">
		<div class="container">
                    <%
                                        Connection cn=new Connect().getConnection();
                                        PreparedStatement ps=cn.prepareStatement("select * from contactdetails");
                                        ResultSet rs=ps.executeQuery();
                                        if(rs.next())
                                        {
                                    %>
			<h3>Mail Us</h3>
			<div class="agile_mail_grids">
				<div class="col-md-5 contact-left">
                                    
					<h4>Address</h4>
					<p><%=rs.getString("address")%>
						
					<ul>
						
						<li>Mobile : <%=rs.getString("mobile")%></li>
                                                <li>Phone : <%=rs.getString("phone")%></li>
                                                <li>Facebook :<a href="#"> <%=rs.getString("facebook")%></a></li>
						<li><a href="mailto:info@example.com"> <%=rs.getString("email")%></a></li>
					</ul>
                                        
				</div>
				<div class="col-md-7 contact-left">
					<h4>Contact Form</h4>
					<form action="../Contact" method="post">
                                            
						<input type="text" name="userName" placeholder="Name" onfocus="this.value = '';" onblur="if (this.value === '') {this.value = 'Name';}" required="">
						<input type="email" name="userEmail" placeholder="Email" onfocus="this.value = '';" onblur="if (this.value === '') {this.value = 'Email';}" required="">
						<input type="text" name="userMobile" placeholder="Mobile" onfocus="this.value = '';" onblur="if (this.value === '') {this.value = 'Telephone';}" required="">
						<textarea name="message" placeholder="Message" onfocus="this.value = '';" onblur="if (this.value === '') {this.value = 'Message...';}" required="">Message...</textarea>
						<input type="submit" value="Submit" >
                                               
					</form>
				</div>
				<div class="clearfix"> </div>
			</div>

			<div class="contact-bottom">
                            <%=rs.getString("map")%>
			</div>
                        <%
                                        }
                        %>
		</div>
	</div>
<!-- //mail -->

<!-- footer -->
<jsp:include page="footer.jsp"></jsp:include>
<!-- //footer -->
</body>
</html>