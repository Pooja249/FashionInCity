<%-- 
    Document   : userNav
    Created on : 16 May, 2019, 4:33:35 PM
    Author     : Angel_pc
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
         <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link href="https://fonts.googleapis.com/css?family=Lato:100,300,400,700,900" rel="stylesheet">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/gh/lykmapipo/themify-icons@0.1.2/css/themify-icons.css">
<link href="css/style1.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="row">
  <div class="col-md-12">
    <div class="profile-bar" >
      <div class="contents">
         <%
              String userEmail=session.getAttribute("userEmail").toString();
              Connection cn=new Connect().getConnection();
              PreparedStatement p1=cn.prepareStatement("select * from usertable where userEmail=?");
              p1.setString(1, userEmail);
              ResultSet rs0=p1.executeQuery();
              if(rs0.next())
              {
          %> 
        <img src="images/<%=rs0.getString("userImage")%>" alt="UserAvatar" style="width:100px;height:100px;">
      <p class="profile-name">Hello, <%=rs0.getString("userName")%>!</p>
        <p class="profile-description">Welcome to Womens Fashion!</p>
        <div class="buttons">
          <ul>
              <li>
              <a href="userDashboard.jsp"><i class="ti-user"></i><span> Profile</span></a>
            </li>
              <li>
                  <a href="review.jsp"><i class="ti-thumb-up"></i><span>Review</span></a>
              </li>
            
            <li>
                <a href="changeUserPass.jsp"><i class="ti-key"></i><span>Change Password</span></a>
            </li>
            <li>
                <a href="cart.jsp"><i class="ti-shopping-cart"></i><span>My Cart</span></a>
            </li>
            <li>
                <a href="orderHistory.jsp"><i class="ti-truck"></i><span>Order History</span></a>
            </li>
            
            <li style="margin-left: 40%;">
              <a href="logout.jsp"><i class="ti-power-off"></i><span> Logout</span></a>
            </li>
          </ul>
          
        </div>
        <%
              }
        %>
      </div>
      
    </div>
  </div>
  </div>
    </body>
</html>
