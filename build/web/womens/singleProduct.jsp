<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Connection.Connect"%>
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
        <title>Women's Fashion a Ecommerce Online Shopping</title>
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
            jQuery(document).ready(function ($) {
                $(".scroll").click(function (event) {
                    event.preventDefault();
                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
                });
            });
        </script>
        <!-- //end-smooth-scrolling -->
    </head>

    <body>
        <!-- header -->

        <jsp:include page="header.jsp"></jsp:include>

            <!--header-->
            <!-- banner -->
            <div class="banner10" id="home1">
                <div class="container">
                    <h2>Single Page</h2>
                </div>
            </div>
            <!-- //banner -->

            <!-- breadcrumbs -->
            <div class="breadcrumb_dress">
                <div class="container">
                    <ul>
                        <li><a href="index.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Home</a></li>

                    </ul>
                </div>
            </div>
            <!-- //breadcrumbs -->

            <!-- single -->   <%
                String itemId = request.getParameter("itemId");
                String pin=request.getParameter("pin");
                System.out.println(pin);
                Connection cn = new Connect().getConnection();
                PreparedStatement ps = cn.prepareStatement("select * from items where itemId=?");
                ps.setString(1, itemId);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {

        %>
        <div class="single">
            <div class="container">
                 <form action="../Cart" method="post">
                    
                <div class="col-md-4 single-left">
                    <div class="flexslider">
                        <ul class="slides">
                            <li data-thumb="../admin/images/<%=rs.getString("itemImage")%>">
                                <div class="thumb-image"> <img src="../admin/images/<%=rs.getString("itemImage")%>" data-imagezoom="true" class="img-responsive"> </div>
                            </li>

                        </ul>
                    </div>
                    <!-- flixslider -->
                    <script defer src="js/jquery.flexslider.js"></script>
                    <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />
                    <script>
// Can also be used with $(document).ready()
$(window).load(function () {
$('.flexslider').flexslider({
animation: "slide",
controlNav: "thumbnails"
});
});
                    </script>
                    <!-- flixslider -->
                    <!-- zooming-effect -->
                    <script src="js/imagezoom.js"></script>
                    <!-- //zooming-effect -->
                </div>


                <div class="col-md-8 single-right">
                    <h3><%=rs.getString("itemName")%></h3>


                    <div class="description">
                        <h5><i>Description</i></h5>
                        <p><%=rs.getString("ItemDes")%></p>
                    </div>
                    <div class="color-quality">
                       
                       
                        <div class="color-quality-left">
                             
                            <h5>Quantity :</h5>
                            <input type="number" name="qwe" value="1" min="1" max="100" >
                            <!--quantity-->
                            <script>
$('.value-plus1').on('click', function () {
var divUpd = $(this).parent().find('.value1'), newVal = parseInt(divUpd.text(), 10) + 1;
divUpd.text(newVal);
});

$('.value-minus1').on('click', function () {
var divUpd = $(this).parent().find('.value1'), newVal = parseInt(divUpd.text(), 10) - 1;
if (newVal >= 1)
divUpd.text(newVal);
});
                            </script>
                            <!--quantity-->

                        </div>
                        <div class="clearfix"> </div>
                    </div>

                    <div class="simpleCart_shelfItem">

                        <%

                            int p = Integer.parseInt(rs.getString("itemPrice"));
                            int d = Integer.parseInt(rs.getString("discount"));
                            int m = p * d / 100;
                            int amount = p - m;

                        %>
                        <p><span> &#8377 <%=rs.getString("itemPrice")%></span> <i class="item_price"> &#8377 <%=amount%></i></p>


                       
                        
                        <%
                            if (session.getAttribute("userEmail") == null) {
                        %>
                        <p><a class="item_add" href="userlogin2.jsp?itemId=<%=rs.getString("itemId")%>&pin=<%=pin%>">Add To Cart</a></p>
                        <%} 
                         else {
                                
                        %>
                        <p>
                       
                            <input type="hidden" name="itemId" value="<%=rs.getString("itemId")%>">
                            <input type="hidden" name="itemName" value="<%=rs.getString("itemName")%>">
                            <input type="hidden" name="discount" value="<%=rs.getString("discount")%>">
                            <input type="hidden" name="itemImage" value="<%=rs.getString("itemImage")%>">
                             <input type="hidden" name="itemPrice" value="<%=rs.getString("itemPrice")%>">
                            
                            <input type="hidden" name="pin" value="<%=pin%>">
                            <input type="hidden" name="userEmail" value="<%=session.getAttribute("userEmail")%>">
                           <input type="submit" value="Add To Cart" class="btn btn-round btn-warning btn-lg">
                       
                        
                        <%}%>
                    </div>

                </div>

                <div class="clearfix"> </div>
                 </form>
            </div>
        </div>
        <%}%>


        <!-- //single -->
       
        <!-- footer -->
        <jsp:include page="footer.jsp"></jsp:include>
        <!-- //footer -->
    </body>
</html>