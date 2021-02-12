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
			<h2>Order Page</h2>
		</div>
	</div>
        
        <div class="breadcrumb_dress">
		<div class="container">
			<ul>
				<li><a href="home.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Home</a> <i>/</i></li>
				<li>Order Page</li>
			</ul>
		</div>
        </div><br><br>
        <div class="user-profile">
            <div class="container">
                <h2 style="text-align: center;"><u>Order Page</u></h2><br><br>
                <div class="col-sm-1"></div>
                <div class="col-sm-3">
                    <div class="col-md-5">
                        <br><br>
                        <h1>Address</h1>
                    </div>
                    
                </div>
                <div class="col-sm-8">
                    <form action="../Order" method="post">
                        <%
                            String userEmail=session.getAttribute("userEmail").toString();
                            Connection cn=new Connect().getConnection();
                            PreparedStatement ps=cn.prepareStatement("select * from checkout where userEmail=?");
                            ps.setString(1, userEmail);
                            ResultSet rs=ps.executeQuery();
                            if(rs.next())
                            {
                                
                            
                        %>
                        <table class="table table-responsive">
                            <input type="hidden" name="userName" value="<%=rs.getString("userName")%>">
                            <input type="hidden" name="userEmail" value="<%=rs.getString("userEmail")%>">
                            <input type="hidden" name="userMobile" value="<%=rs.getString("userMobile")%>">
                            <tr>
                                <th>Address:</th>
                                <td><input type="text" name="address" value="<%=rs.getString("address")%>" class="form-control"></td>
                            </tr>
                            <tr>
                                <th>Country:</th>
                                <td><input type="text" name="country" value="<%=rs.getString("country")%>" class="form-control"></td>
                            </tr>
                            <tr>
                                <th>State:</th>
                                <td><input type="text" name="state" value="<%=rs.getString("state")%>" class="form-control"></td>
                            </tr>
                            <tr>
                                <th>City:</th>
                                <td><input type="text" name="city" value="<%=rs.getString("city")%>" class="form-control"></td>
                            </tr>
                            <tr>
                                <th>Pin:</th>
                                <td><input type="text" name="pin" value="<%=rs.getString("pin")%>" class="form-control"></td>
                            </tr>
                            <br><br>
                            <%
                            }
                               int total=0; 
                               int totalPrice=0;
                               PreparedStatement ps1=cn.prepareStatement("select * from cart where userEmail=?");
                               ps1.setString(1, userEmail);
                               ResultSet rs1=ps1.executeQuery();
                               while(rs1.next())
                               {
                                 
                                 int price=Integer.parseInt(rs1.getString("itemPrice"));
                                 int discount=Integer.parseInt(rs1.getString("discount"));
                                 int a=price*discount/100;
                                 totalPrice=price-a;
                                                            
                                 int qt=Integer.parseInt(rs1.getString("itemQuantity"));
                                 int finalPrice=totalPrice*qt;
                                 total=total+finalPrice;  
                               
                            %>
                            
                            <input type="hidden" name="itemId" value="<%=rs1.getString("itemId")%>">
                            <input type="hidden" name="itemName" value="<%=rs1.getString("itemName")%>">
                            <input type="hidden" name="ip" value="<%=rs1.getString("itemPrice")%>">
                            <input type="hidden" name="itemQuantity" value="<%=rs1.getString("itemQuantity")%>">
                           <input type="hidden" name="discount" value="<%=rs1.getString("discount")%>">
                            <input type="hidden" name="totalPrice" value="<%=totalPrice%>">
                            <input type="hidden" name="finalPrice" value="<%=finalPrice%>">
                             
                          
                            <%
                               }
                            %>
                           <input type="hidden" name="total" value="<%=total%>">
                          
                            
                            <tr>
                                <th>Cash On Delivery:</th>
                                <td><input type="radio" checked=""></td>
                            </tr>
                            <tr>
                                
                                <td><input type="submit" value="Place Your Order" class="btn btn-warning"></td>
                            </tr>
                        </table>
                       
                    </form>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
