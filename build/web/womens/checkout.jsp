<%-- 
    Document   : userProfile
    Created on : 6 May, 2019, 11:00:10 AM
    Author     : Diction Technology
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
        <jsp:include page="header.jsp"></jsp:include>
        <div class="banner10" id="home1">
		<div class="container">
			<h2>Checkout Page</h2>
		</div>
	</div>
        
        <div class="breadcrumb_dress">
		<div class="container">
			<ul>
				<li><a href="home.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Home</a> <i>/</i></li>
				<li>Checkout Page</li>
			</ul>
		</div>
        </div><br><br>
        <div class="user-profile">
            <div class="container">
                <h2 style="text-align: center;">Checkout Page</h2>
                <form action="../Checkout" method="post">
                    <%
                        String userEmail=session.getAttribute("userEmail").toString();
                        
                        Connection cn=new Connect().getConnection();
                        PreparedStatement ps=cn.prepareStatement("select * from usertable where userEmail=?");
                        ps.setString(1, userEmail);
                        ResultSet rs=ps.executeQuery();
                        if(rs.next())
                        {
                    %>
                <div class="col-md-12">
                    <table class="table table-bordered">
                        
                        <tr>
                            <th>Name</th>
                            <td><input type="text" name="userName" value="<%=rs.getString("userName")%>" class="form-control"></td>
                        </tr>
                        <tr>
                            <th>Email</th>
                            <td><input type="text" name="userEmail" value="<%=rs.getString("userEmail")%>" readonly="true" class="form-control"></td>
                        </tr>
                        <tr>
                            <th>Mobile</th>
                            <td><input type="text" name="userMobile" value="<%=rs.getString("userMobile")%>" class="form-control"></td>
                        </tr>
                        <tr>
                            <th>Address</th>
                            <td><textarea name="address" class="form-control"></textarea></td>
                        </tr>
                        <tr>
                            <th>Country</th>
                            <td><input type="text" name="country" class="form-control"></td>
                        </tr>
                        <tr>
                            <th>City</th>
                            <td><input type="text" name="city" class="form-control"></td>
                        </tr>
                        <tr>
                            <th>State</th>
                            <td><input type="text" name="state" class="form-control"></td>
                        </tr>
                        <tr>
                            <%
                            
                               PreparedStatement ps1=cn.prepareStatement("select * from cart where userEmail=?");
                               ps1.setString(1, userEmail);
                               ResultSet rs1=ps1.executeQuery();
                               if(rs1.next())
                               {
                                   
                            %>
                           
                            <th>Pin</th>
                            <td><input type="text" name="pin" value="<%=rs1.getString("pin")%>" class="form-control"></td>
                            <%
                               }
                            %>
                        </tr>
                        <tr>
                            <th></th>
                            <td><input type="submit" value="Submit" class="btn btn-success"></td>
                        </tr>
                    </table>
                    
                </div>
                <%
                        }
                %>
                </form>
            </div>
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
