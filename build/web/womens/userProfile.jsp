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
			<h2>User Profile</h2>
		</div>
	</div>
        
        <div class="breadcrumb_dress">
		<div class="container">
			<ul>
				<li><a href="home.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Home</a> <i>/</i></li>
				<li>User Profile</li>
			</ul>
		</div>
        </div><br><br>
        <div class="user-profile">
            <div class="container">
                <h2 style="text-align: center;">User Profile</h2>
                <div class="col-md-12">
                    <table class="table table-bordered">
                        <%
                            String userEmail=session.getAttribute("userEmail").toString();
                            Connection cn=new Connect().getConnection();
                            PreparedStatement ps=cn.prepareStatement("select * from usertable where userEmail=?");
                            ps.setString(1, userEmail);
                            ResultSet rs=ps.executeQuery();
                            if(rs.next())
                            {
                        %>
                        <tr>
                            <th><h4>Name</h4></th>
                            <td><h5><%=rs.getString("userName")%></h5></td>
                        </tr>
                        <tr>
                            <th><h4>Profile Pic</h4></th>
                            <td><img src="images/<%=rs.getString("userImage")%>" name="userImage" style="width:100px;height:100px;"/></td>
                        </tr>
                        <tr>
                            <th><h4>Email</h4></th>
                            <td><h5><%=rs.getString("userEmail")%></h5></td>
                        </tr>
                        <tr>
                            <th><h4>Mobile</h4></th>
                            <td><h5><%=rs.getString("userMobile")%></h5></td>
                        </tr>
                        <tr>
                            <th></th>
                            <td><a href="editUser.jsp?userId=<%=rs.getString("userId")%>&userName=<%=rs.getString("userName")%>&userEmail=<%=rs.getString("userEmail")%>&userMobile=<%=rs.getString("userMobile")%>" class="btn btn-success">Edit Profile</a>
                                <a href="changeUserPass.jsp?userId=<%=rs.getString("userId")%>" class="btn btn-primary">Change Password</a></td>
                        </tr>
                        <%
                            }
                        %>
                    </table>
                    
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
