<%-- 
    Document   : editUser
    Created on : 6 May, 2019, 11:32:08 AM
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
        <jsp:include page="userNav.jsp"></jsp:include>
        
        <div class="breadcrumb_dress">
		<div class="container">
			<ul>
				<li><a href="home.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Home</a> <i>/</i></li>
				<li>Edit Profile</li>
			</ul>
		</div>
        </div><br><br>
         <div class="user-profile">
            <div class="container">
                <h2 style="text-align: center;"> Edit Profile</h2>
                <div class="col-md-12">
                    <form action="../EditUser" method="post" enctype="multipart/form-data">
                    <table class="table table-bordered">
                        <%
                            String userEmail=request.getParameter("userEmail");
                            Connection cn=new Connect().getConnection();
                            PreparedStatement ps=cn.prepareStatement("select * from usertable where userEmail=?");
                            ps.setString(1, userEmail);
                            ResultSet rs=ps.executeQuery();
                            if(rs.next())
                            {
                        %>
                        <input type="hidden" name="userId" value="<%=rs.getString("userId")%>"/>
                        <tr>
                            <th>Name</th>
                            <td><input type="text" name="userName" value="<%=rs.getString("userName")%>" class="form-control"/></td>
                        </tr>
                        <tr>
                            <th>Profile Pic</th>
                            <td><img src="images/<%=rs.getString("userImage")%>" name="userImage" style="width:100px;height:100px;"/><br>
                                <input type="file" name="userImage" value="<%=rs.getString("userImage")%>"/></td>
                        </tr>
                        <tr>
                            <th>Email</th>
                            <td><input type="text" name="userEmail" value="<%=rs.getString("userEmail")%>" class="form-control" readonly="true"/></td>
                        </tr>
                        <tr>
                            <th>Mobile</th>
                            <td><input type="text" name="userMobile" value="<%=rs.getString("userMobile")%>" class="form-control"/></td>
                        </tr>
                        <tr>
                            <th></th>
                            <td><input type="submit" class="btn btn-success" value="Submit"/></td>
                        </tr>
                        <%
                            }
                        %>
                    </table>
                    </form> 
                </div>
            </div>
         </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
