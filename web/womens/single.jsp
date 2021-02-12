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
			<h2>Single Page</h2>
		</div>
	</div>
<!-- //banner -->

<!-- breadcrumbs -->
	<div class="breadcrumb_dress">
		<div class="container">
			<ul>
				<li><a href="home.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Home</a> <i>/</i></li>
				<li>Single Page</li>
			</ul>
		</div>
	</div>
<!-- //breadcrumbs -->

<!-- single -->

                           
	<div class="single">
		<div class="container">
                    <%
                                String itemId=request.getParameter("itemId");
                                Connection cn=new Connect().getConnection();
                                PreparedStatement ps=cn.prepareStatement("select * from items where itemId=?");
                                ps.setString(1, itemId);
                                ResultSet rs=ps.executeQuery();
                                if(rs.next())
                                {
                            %>
                            <input type="hidden" name="itemId" value="<%=rs.getString("itemId")%>"/>
			<div class="col-md-4 single-left">
                            
				<div class="flexslider">
					<ul class="slides">
						<li data-thumb="../admin/images/<%=rs.getString("itemImage")%>">
							<div class="thumb-image"> <img src="../admin/images/<%=rs.getString("itemImage")%>" data-imagezoom="true" class="img-responsive" style="height:400px;"> </div>
						</li>
						
					</ul>
				</div>
                                
				<!-- flixslider -->
					<script defer src="js/jquery.flexslider.js"></script>
					<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />
					<script>
					// Can also be used with $(document).ready()
					$(window).load(function() {
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
						<h5><i>DESCRIPTION</i></h5>
						<p><%=rs.getString("itemDes")%></p>
					</div>
					                                <%

                                                                       int p = Integer.parseInt(rs.getString("itemPrice"));
                                                                       int d = Integer.parseInt(rs.getString("discount"));
                                                                       int m = p * d / 100;
                                                                       int amount = p - m;

                                                                                     %>
					
					<div class="simpleCart_shelfItem">
							<p><span>&#8377 <%=rs.getString("itemPrice")%>/-</span> <i class="item_price">&#8377 <%=amount%>/-</i></p>
                                                        <form action="../CheckPin" method="post"> 
                                                          <input type="hidden" name="itemId" value="<%=rs.getString("itemId")%>"/>
                                                            <p style="color:gray;">Enter Pin:</p>
                                                            <input type="text" name="pin" class="form-control"/><br>
                                                           <input type="submit" value="Check Pin" class="btn btn-warning"/>
                                                        </form>
						</div>
                                               
			</div>
			<div class="clearfix"> </div>
                    <%
                                }
                    %>    
		</div>
	</div>

	
	<div class="w3l_related_products">
		<div class="container">
			<h3>Related Products</h3>
			<ul id="flexiselDemo2">			
				<li>
					<div class="w3l_related_products_grid">
						<div class="agile_ecommerce_tab_left dresses_grid">
							<div class="hs-wrapper hs-wrapper3">
								<img src="images/ss1.jpg" alt=" " class="img-responsive">
								<img src="images/ss2.jpg" alt=" " class="img-responsive">
								<img src="images/ss3.jpg" alt=" " class="img-responsive">
								<img src="images/ss4.jpg" alt=" " class="img-responsive">
								<img src="images/ss5.jpg" alt=" " class="img-responsive">
								<img src="images/ss6.jpg" alt=" " class="img-responsive">
								<img src="images/ss7.jpg" alt=" " class="img-responsive">
								<img src="images/ss8.jpg" alt=" " class="img-responsive">
								<div class="w3_hs_bottom">
									<div class="flex_ecommerce">
										<a href="#" data-toggle="modal" data-target="#myModal6"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span></a>
									</div>
								</div>
							</div>
							<h5><a href="single.html">Pink Flared Skirt</a></h5>
							<div class="simpleCart_shelfItem">
								<p class="flexisel_ecommerce_cart"><span>$312</span> <i class="item_price">$212</i></p>
								<p><a class="item_add" href="#">Add to cart</a></p>
							</div>
						</div>
					</div>
				</li>
				<li>
					<div class="w3l_related_products_grid">
						<div class="agile_ecommerce_tab_left dresses_grid">
							<div class="hs-wrapper hs-wrapper3">
								<img src="images/ss2.jpg" alt=" " class="img-responsive">
								<img src="images/ss3.jpg" alt=" " class="img-responsive">
								<img src="images/ss4.jpg" alt=" " class="img-responsive">
								<img src="images/ss5.jpg" alt=" " class="img-responsive">
								<img src="images/ss6.jpg" alt=" " class="img-responsive">
								<img src="images/ss9.jpg" alt=" " class="img-responsive">
								<img src="images/ss7.jpg" alt=" " class="img-responsive">
								<img src="images/ss8.jpg" alt=" " class="img-responsive">
								<div class="w3_hs_bottom">
									<div class="flex_ecommerce">
										<a href="#" data-toggle="modal" data-target="#myModal6"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span></a>
									</div>
								</div>
							</div>
							<h5><a href="single.html">Red Pencil Skirt</a></h5>
							<div class="simpleCart_shelfItem">
								<p class="flexisel_ecommerce_cart"><span>$432</span> <i class="item_price">$323</i></p>
								<p><a class="item_add" href="#">Add to cart</a></p>
							</div>
						</div>
					</div>
				</li>
				<li>
					<div class="w3l_related_products_grid">
						<div class="agile_ecommerce_tab_left dresses_grid">
							<div class="hs-wrapper hs-wrapper3">
								<img src="images/ss3.jpg" alt=" " class="img-responsive">
								<img src="images/ss4.jpg" alt=" " class="img-responsive">
								<img src="images/ss5.jpg" alt=" " class="img-responsive">
								<img src="images/ss6.jpg" alt=" " class="img-responsive">
								<img src="images/ss7.jpg" alt=" " class="img-responsive">
								<img src="images/ss8.jpg" alt=" " class="img-responsive">
								<img src="images/ss9.jpg" alt=" " class="img-responsive">
								<img src="images/ss1.jpg" alt=" " class="img-responsive">
								<div class="w3_hs_bottom">
									<div class="flex_ecommerce">
										<a href="#" data-toggle="modal" data-target="#myModal6"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span></a>
									</div>
								</div>
							</div>
							<h5><a href="single.html">Yellow Cotton Skirt</a></h5>
							<div class="simpleCart_shelfItem">
								<p class="flexisel_ecommerce_cart"><span>$323</span> <i class="item_price">$310</i></p>
								<p><a class="item_add" href="#">Add to cart</a></p>
							</div>
						</div>
					</div>
				</li>
				<li>
					<div class="w3l_related_products_grid">
						<div class="agile_ecommerce_tab_left dresses_grid">
							<div class="hs-wrapper hs-wrapper3">
								<img src="images/ss4.jpg" alt=" " class="img-responsive">
								<img src="images/ss5.jpg" alt=" " class="img-responsive">
								<img src="images/ss6.jpg" alt=" " class="img-responsive">
								<img src="images/ss7.jpg" alt=" " class="img-responsive">
								<img src="images/ss8.jpg" alt=" " class="img-responsive">
								<img src="images/ss9.jpg" alt=" " class="img-responsive">
								<img src="images/ss1.jpg" alt=" " class="img-responsive">
								<img src="images/ss2.jpg" alt=" " class="img-responsive">
								<div class="w3_hs_bottom">
									<div class="flex_ecommerce">
										<a href="#" data-toggle="modal" data-target="#myModal6"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span></a>
									</div>
								</div>
							</div>
							<h5><a href="single.html">Black Short</a></h5>
							<div class="simpleCart_shelfItem">
								<p class="flexisel_ecommerce_cart"><span>$256</span> <i class="item_price">$200</i></p>
								<p><a class="item_add" href="#">Add to cart</a></p>
							</div>
						</div>
					</div>
				</li>
			</ul>
				<script type="text/javascript">
					$(window).load(function() {
						$("#flexiselDemo2").flexisel({
							visibleItems:4,
							animationSpeed: 1000,
							autoPlay: true,
							autoPlaySpeed: 3000,    		
							pauseOnHover: true,
							enableResponsiveBreakpoints: true,
							responsiveBreakpoints: { 
								portrait: { 
									changePoint:480,
									visibleItems: 1
								}, 
								landscape: { 
									changePoint:640,
									visibleItems:2
								},
								tablet: { 
									changePoint:768,
									visibleItems: 3
								}
							}
						});
						
					});
				</script>
				<script type="text/javascript" src="js/jquery.flexisel.js"></script>
		</div>
	</div>
	<div class="modal video-modal fade" id="myModal6" tabindex="-1" role="dialog" aria-labelledby="myModal6">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>						
				</div>
				<section>
					<div class="modal-body">
						<div class="col-md-5 modal_body_left">
							<img src="images/39.jpg" alt=" " class="img-responsive" />
						</div>
						<div class="col-md-7 modal_body_right">
							<h4>a good look women's Long Skirt</h4>
							<p>Ut enim ad minim veniam, quis nostrud 
								exercitation ullamco laboris nisi ut aliquip ex ea 
								commodo consequat.Duis aute irure dolor in 
								reprehenderit in voluptate velit esse cillum dolore 
								eu fugiat nulla pariatur. Excepteur sint occaecat 
								cupidatat non proident, sunt in culpa qui officia 
								deserunt mollit anim id est laborum.</p>
							<div class="rating">
								<div class="rating-left">
									<img src="images/star-.png" alt=" " class="img-responsive" />
								</div>
								<div class="rating-left">
									<img src="images/star-.png" alt=" " class="img-responsive" />
								</div>
								<div class="rating-left">
									<img src="images/star-.png" alt=" " class="img-responsive" />
								</div>
								<div class="rating-left">
									<img src="images/star.png" alt=" " class="img-responsive" />
								</div>
								<div class="rating-left">
									<img src="images/star.png" alt=" " class="img-responsive" />
								</div>
								<div class="clearfix"> </div>
							</div>
							<div class="modal_body_right_cart simpleCart_shelfItem">
								<p><span>$320</span> <i class="item_price">$250</i></p>
								<p><a class="item_add" href="#">Add to cart</a></p>
							</div>
							<h5>Color</h5>
							<div class="color-quality">
								<ul>
									<li><a href="#"><span></span>Red</a></li>
									<li><a href="#" class="brown"><span></span>Yellow</a></li>
									<li><a href="#" class="purple"><span></span>Purple</a></li>
									<li><a href="#" class="gray"><span></span>Violet</a></li>
								</ul>
							</div>
						</div>
						<div class="clearfix"> </div>
					</div>
				</section>
			</div>
		</div>
	</div>
<!-- //single -->

<!-- footer -->
<jsp:include page="footer.jsp"></jsp:include>
<!-- //footer -->
</body>
</html>