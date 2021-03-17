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
<title>Women's Fashion a Ecommerce Online Shopping Category Flat Bootstrap Responsive Website Template | Single :: w3layouts</title>
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
<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />
<link href="css/rating.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
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
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link href="https://fonts.googleapis.com/css?family=Lato:100,300,400,700,900" rel="stylesheet">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/gh/lykmapipo/themify-icons@0.1.2/css/themify-icons.css">
<link href="css/style1.css" rel="stylesheet" type="text/css"/>
</head>
	
<body>
<!-- header -->
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="userNav.jsp"></jsp:include>
<!-- //header -->
<!-- banner -->
	
<!-- //banner -->

<!-- breadcrumbs -->
<%
              String userEmail=session.getAttribute("userEmail").toString();
              Connection cn=new Connect().getConnection();
              PreparedStatement p1=cn.prepareStatement("select * from usertable where userEmail=?");
              p1.setString(1, userEmail);
              ResultSet rs0=p1.executeQuery();
              if(rs0.next())
              {
          %>

   
	<div class="breadcrumb_dress">
		<div class="container">
			<ul>
				<li><a href="home.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Home</a> <i>/</i></li>
				<li>Review Page</li>
			</ul>
		</div>
	</div>

<!-- //breadcrumbs -->

<!-- review -->
<div class="single">
    <div class="container">

        <div class="col-sm-3"></div>
        <div class="col-sm-6">
            <h2 style="text-align: center;">Review</h2><br>
          <form action="../Review" method="post">
                                
                                
                                <input type="hidden" name="userImage" value="<%=rs0.getString("userImage")%>">
						<div class="form-group ">
							<label for="name" class="sr-only">Name</label>
							<input id="name" readOnly="true" name="userName" value="<%=rs0.getString("userName")%>" class="form-control" placeholder="Name" type="text"required="required">
						</div>
						<div class="form-group ">
							<label for="email" class="sr-only">Email</label>
							<input id="email" name="userEmail" readOnly="true" class="form-control" value="<%=rs0.getString("userEmail")%>" placeholder="Email"  type="email"required="required">
						</div>
                                                
						<div class="form-group" id="rating-ability-wrapper">
          <label class="control-label" for="rating">
	    <span class="field-label-header">How would you like to rate Us?*</span><br>
	    <span class="field-label-info"></span>
            
            </lable>
  <div class="stars" >

   
    <input class="star star-1" id="star-1" type="radio" value="5" name="selected_rating"/>
    <label class="star star-1" for="star-1"></label>

    <input class="star star-2" id="star-2" type="radio" value="4" name="selected_rating"/>

    <label class="star star-2" for="star-2"></label>

    <input class="star star-3" id="star-3" type="radio" value="3" name="selected_rating"/>

    <label class="star star-3" for="star-3"></label>

    <input class="star star-4" id="star-4" type="radio" value="2" name="selected_rating"/>

    <label class="star star-4" for="star-4"></label>

    <input class="star star-5" id="star-5" type="radio" value="1" name="selected_rating"/>

    <label class="star star-5" for="star-5"></label>


</div>


	    
	   
	</div>
						
                             <div class="form-group">
                                                   <label for="email" class="sr-only">Review</label>
                                                    <div>
                                                        <textarea class="form-control" rows="10" name="review" placeholder="Enter the Review Here"></textarea>
                                                    </div>  
                                                        </div>

							
						
						<div class="form-group ">
							<input class="btn btn-warning justify-center" value="SUBMIT" type="submit">
						</div>
                                
            </form>
        </div>
</div> 
</div>

<%
                                    }
%>	
	
<!-- footer -->
<jsp:include page="footer.jsp"></jsp:include>
<!-- //footer -->
</body>
</html>