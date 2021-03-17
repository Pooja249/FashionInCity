<%-- 
    Document   : header
    Created on : 3 May, 2019, 3:17:52 PM
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
        <%
            if(session.getAttribute("userEmail")==null)
            {
        %>
        <div class="header">
		<div class="container">
			<div class="w3l_login">
				<a href="userlogin.jsp" data-target="#myModal88"><span class="glyphicon glyphicon-user" aria-hidden="true"></span></a>
			</div>
			<div class="w3l_logo">
				<h1><a href="home.jsp">Women's Fashion<span>For Fashion Lovers</span></a></h1>
			</div>
			<div class="search">
				<input class="search_box" type="checkbox" id="search_box">
				<label class="icon-search" for="search_box"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></label>
				<div class="search_form">
					<form action="#" method="post">
						<input type="text" name="Search" placeholder="Search...">
						<input type="submit" value="Send">
					</form>
				</div>
			</div>
			<div class="cart box_1">
				<a href="cart.jsp">
					<div class="total">
					
					<img src="images/bag.png" alt="" /> 
                                        </div>
				</a>
				
				<div class="clearfix"> </div>
			</div>	
			<div class="clearfix"> </div>
		</div>
	</div>
	<div class="navigation" style="margin-left: 15%;">
		<div class="container">
			<nav class="navbar navbar-default">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header nav_2">
					<button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
				</div> 
				<div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
					<ul class="nav navbar-nav">
						<li class="active"><a href="home.jsp" class="act">Home</a></li>	
						<!-- Mega Menu -->
						<li class="dropdown">
							<a href="products.jsp" class="dropdown-toggle" data-toggle="dropdown">Products <b class="caret"></b></a>
							<ul class="dropdown-menu multi-column columns-3">
								<div class="row">
                                                                   <%
                                                                                            Connection cn=new Connect().getConnection();
                                                                                            PreparedStatement ps=cn.prepareStatement("select * from categorytable where categoryStatus='active'");
                                                                                            ResultSet rs=ps.executeQuery();
                                                                                             while(rs.next())
                                                                                             {
                                                                                      %>
									<div class="col-sm-3">
                                                                            
										<ul class="multi-column-dropdown">
                                                                                      
											<h6><%=rs.getString("categoryName")%></h6>
                                                                                    
                                                                                    <%
                                                                                         String categoryId=request.getParameter("categoryId");   
                                                                                         PreparedStatement ps1=cn.prepareStatement("Select * from subcategorytable where categoryId=? and subCategoryStatus='active'");
                                                                                         ps1.setString(1, rs.getString("categoryId"));
                                                                                         ResultSet rs1=ps1.executeQuery();
                                                                                         while(rs1.next())
                                                                                         {
                                                                                    %> 
                                                                                        
											<li><a href="products.jsp?subCategoryId=<%=rs1.getString("subCategoryId")%>"><%=rs1.getString("subCategoryName")%></a></li>
											<%}%>
											
										</ul>
                                                                              
									</div>
					                                <%
                                                                                             
                                                                              }
                                                                          %> 				
									 
							
								</div>
							</ul>
						</li>
						<li><a href="aboutus.jsp">About Us</a></li>
					
						<li><a href="mail.jsp">Mail Us</a></li>
					</ul>
				</div>
			</nav>
		</div>
	</div>
        <%
            }
         else
          { 
        %>
        <div class="header">
		<div class="container">
			
			<div class="w3l_logo">
				<h1><a href="home.jsp">Women's Fashion<span>For Fashion Lovers</span></a></h1>
			</div>
			<div class="search">
				<input class="search_box" type="checkbox" id="search_box">
				<label class="icon-search" for="search_box"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></label>
				<div class="search_form">
					<form action="#" method="post">
						<input type="text" name="Search" placeholder="Search...">
						<input type="submit" value="Send">
					</form>
				</div>
			</div>
			<div class="cart box_1">
				<a href="cart.jsp">
					<div class="total">
					
					<img src="images/bag.png" alt="" />
                                        </div>
				</a>
				
				<div class="clearfix"> </div>
			</div>	
			<div class="clearfix"> </div>
		</div>
	</div>
	<div class="navigation">
		<div class="container">
			<nav class="navbar navbar-default">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header nav_2">
					<button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
				</div> 
				<div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
					<ul class="nav navbar-nav">
						<li class="active"><a href="home.jsp" class="act">Home</a></li>	
						<!-- Mega Menu -->
						<li class="dropdown">
							<a href="products.jsp" class="dropdown-toggle" data-toggle="dropdown">Products <b class="caret"></b></a>
                                                        
							<ul class="dropdown-menu multi-column columns-3">
								<div class="row">
                                                                    <%
                                                                                            Connection cn=new Connect().getConnection();
                                                                                            PreparedStatement ps=cn.prepareStatement("select * from categorytable where categoryStatus='active'");
                                                                                            ResultSet rs=ps.executeQuery();
                                                                                             while(rs.next())
                                                                                             {
                                                                                      %>
									<div class="col-sm-3">
                                                                            
										<ul class="multi-column-dropdown">
                                                                                      
											<h6><%=rs.getString("categoryName")%></h6>
                                                                                    
                                                                                    <%
                                                                                         String categoryId=request.getParameter("categoryId");   
                                                                                         PreparedStatement ps1=cn.prepareStatement("Select * from subcategorytable where categoryId=? and subCategoryStatus='active'");
                                                                                         ps1.setString(1, rs.getString("categoryId"));
                                                                                         ResultSet rs1=ps1.executeQuery();
                                                                                         while(rs1.next())
                                                                                         {
                                                                                    %> 
                                                                                        
											<li><a href="products.jsp?subCategoryId=<%=rs1.getString("subCategoryId")%>"><%=rs1.getString("subCategoryName")%></a></li>
											<%
                                                                                         }
                                                                                        %>
											
										</ul>
                                                                              
									</div>
					                                <%
                                                                                             
                                                                              }
                                                                          %> 				
									
									
                                                                        
								</div>
							</ul>
						</li>
						<li><a href="aboutus.jsp">About Us</a></li>
						
						<li><a href="mail.jsp">Mail Us</a></li>
                                                <%
                                                    String userEmail=session.getAttribute("userEmail").toString();
                                                   
                                                    PreparedStatement ps2=cn.prepareStatement("select * from usertable where userEmail=?");
                                                    ps2.setString(1, userEmail);
                                                    ResultSet rs2=ps2.executeQuery();
                                                    if(rs2.next())
                                                    {
                                                %>
                                                <li class="dropdown" style="margin-left:120px;">
                                                    <a href="userProfile.jsp" class="dropdown-toggle" data-toggle="dropdown"><h5><b>Hii, <%=rs2.getString("userName")%></b><b class="caret"></b></h5></a>
                                                <ul class="dropdown-menu pull-right">
                                                   <div class="col-md-3">
                                                    <li><a href="userDashboard.jsp" class="btn btn-default">Dashboard</a></li>
                                                    
                                                   <li><a href="logout.jsp" class="btn btn-default">Logout</a></li>
                                                   </div>
                                                </ul>
                                                </li>
                                                <%
                                                    }
                                                %>
					</ul>
                                    
				</div>
			</nav>
		</div>
	</div>
        <%
            }
        %>
    </body>
</html>
