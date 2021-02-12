<%-- 
    Document   : footer
    Created on : 3 May, 2019, 3:23:20 PM
    Author     : Cuteepoo_pc
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Connection.Connect"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
<!-- countdown -->
<link rel="stylesheet" href="css/jquery.countdown.css" />
<!-- //countdown -->
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
        <!-- footer -->
	<div class="footer">
		<div class="container">
			<div class="w3_footer_grids">
				<div class="col-md-3 w3_footer_grid">
                                    <%
                                        Connection cn=new Connect().getConnection();
                                        PreparedStatement ps1=cn.prepareStatement("select * from contactdetails");
                                        ResultSet rs1=ps1.executeQuery();
                                        while(rs1.next())
                                        {
                                    %>
					<h3>Contact</h3>
					
					<ul class="address">
                                            <li><i class="glyphicon glyphicon-map-marker" aria-hidden="true"></i><%=rs1.getString("address")%></li>
						<li><i class="glyphicon glyphicon-envelope" aria-hidden="true"></i><a href="mailto:info@example.com"><%=rs1.getString("email")%></a></li>
						<li><i class="glyphicon glyphicon-earphone" aria-hidden="true"></i><%=rs1.getString("phone")%></li>
					</ul>
                                    <%
                                        }
                                    %>
				</div>
				<div class="col-md-3 w3_footer_grid">
					<h3>Information</h3>
					<ul class="info"> 
						<li><a href="aboutus.jsp">About Us</a></li>
						<li><a href="mail.jsp">Contact Us</a></li>
						
						<li><a href="faq.jsp">FAQ's</a></li>
						<li><a href="products4.jsp">Special Products</a></li>
					</ul>
				</div>
				<div class="col-md-3 w3_footer_grid">
					<h3>Category</h3>
                                         <%
                                                                                            
                                                                                            PreparedStatement ps=cn.prepareStatement("select * from categorytable where categoryStatus='active'");
                                                                                            ResultSet rs=ps.executeQuery();
                                                                                             while(rs.next())
                                                                                             {
                                                                                      %>
					<ul class="info"> 
						<li><a href="products1.jsp?categoryId=<%=rs.getString("categoryId")%>"><%=rs.getString("categoryName")%></a></li>
						
					</ul>
                                        <%
                                                                                             }
                                        %>
				</div>
				<div class="col-md-3 w3_footer_grid">
					<h3>Profile</h3>
					<ul class="info"> 
						<li><a href="products2.jsp">Store</a></li>
						<li><a href="cart.jsp">My Cart</a></li>
					</ul>
					<h4>Follow Us</h4>
					<div class="agileits_social_button">
                                            <%
                                        
                                        PreparedStatement ps2=cn.prepareStatement("select * from contactdetails");
                                        ResultSet rs2=ps2.executeQuery();
                                        while(rs2.next())
                                        {
                                    %>
						<ul>
							<li><a href="<%=rs2.getString("facebook")%>" class="facebook"> </a></li>
							<li><a href="<%=rs2.getString("twitter")%>" class="twitter"> </a></li>
							<li><a href="<%=rs2.getString("google")%>" class="google"> </a></li>
							<li><a href="<%=rs2.getString("pinterest")%>" class="pinterest"> </a></li>
						</ul>
                                                <%
                                        }
                                                %>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		<div class="footer-copy">
			<div class="footer-copy1">
				<div class="footer-copy-pos">
					<a href="#home1" class="scroll"><img src="images/arrow.png" alt=" " class="img-responsive" /></a>
				</div>
			</div>
			<div class="container">
				<p>&copy; 2016 Women's Fashion. All rights reserved </p>
			</div>
		</div>
	</div>
<!-- //footer -->
    </body>
</html>
