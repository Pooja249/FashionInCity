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
<title>Women's Fashion a Ecommerce Online Shopping Category Flat Bootstrap Responsive Website Template | Home :: w3layouts</title>
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
<!-- header -->
<jsp:include page="header.jsp"></jsp:include>
<!-- //header -->
<!-- banner -->
	
		<div class="col-md-12">
                <jsp:include page="banner.jsp"></jsp:include>
</div><br><br>
	
<!-- //banner -->

<!-- banner-bottom -->
	<div class="banner-bottom">
		<div class="container">
			<div class="col-md-5 wthree_banner_bottom_left">
				<div class="video-img">
					<a class="play-icon popup-with-zoom-anim" href="#small-dialog">
						<span class="glyphicon glyphicon-expand" aria-hidden="true"></span>
					</a>
				</div>
				<!-- pop-up-box -->    
						<link href="css/popuo-box.css" rel="stylesheet" type="text/css" property="" media="all" />
						<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
					<!--//pop-up-box -->
					<div id="small-dialog" class="mfp-hide">
						<iframe src="https://player.vimeo.com/video/23259282?title=0&byline=0&portrait=0"></iframe>
					</div>
					<script>
						$(document).ready(function() {
						$('.popup-with-zoom-anim').magnificPopup({
							type: 'inline',
							fixedContentPos: false,
							fixedBgPos: true,
							overflowY: 'auto',
							closeBtnInside: true,
							preloader: false,
							midClick: true,
							removalDelay: 300,
							mainClass: 'my-mfp-zoom-in'
						});
																						
						});
					</script>
			</div>
			<div class="col-md-7 wthree_banner_bottom_right">
				<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
                                    
					
                                        
					<div id="myTabContent" class="tab-content">
						<div role="tabpanel" class="tab-pane fade active in" id="home" aria-labelledby="home-tab">
							<div class="agile_ecommerce_tabs">
                                                             <%
                                                                                Connection cn=new Connect().getConnection();
                                                                                PreparedStatement ps1=cn.prepareStatement("select * from items where itemPrice<1000 and itemStatus='active' limit 3");
                                                                                ResultSet rs1=ps1.executeQuery();
                                                                                while(rs1.next())
                                                                                {
                                                                            %>
								<div class="col-md-4 agile_ecommerce_tab_left">
                                                                   
									<div class="hs-wrapper">
                                                                            
										<img src="images/<%=rs1.getString("itemImage")%>" alt=" " class="img-responsive" />
										
										<div class="w3_hs_bottom">
											<ul>
												<li>
													<a href="single.jsp?itemId=<%=rs1.getString("itemId")%>" data-target="#myModal"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span></a>
												</li>
											</ul>
										</div>
                                                                               
									</div>
                                                                        <%
                                                        int p = Integer.parseInt(rs1.getString("itemPrice"));
                                                        int d = Integer.parseInt(rs1.getString("discount"));
                                                        int m = p * d / 100;
                                                        int amount = p - m;
                                                        %>
									<h5><a href="single.jsp?itemId=<%=rs1.getString("itemId")%>"><%=rs1.getString("itemName")%></a></h5>
						<div class="simpleCart_shelfItem">
							<p><span>&#8377 <%=rs1.getString("itemPrice")%></span> <i class="item_price">&#8377 <%=amount%></i></p>
                                                        <%
                                                        if(session.getAttribute("userEmail")==null)
                                                        {
                                                        %>
							<p><a class="item_add" href="userlogin3.jsp?itemId=<%=rs1.getString("itemId")%>">Add to cart</a></p>
                                                        <%
                                                        }
                                                        else
                                                        {
                                                        %>
                                                        <p><a class="item_add" href="single.jsp?itemId=<%=rs1.getString("itemId")%>">Add to cart</a></p>
                                                        <%
                                                                }
                                                        %>
						</div>
								</div>
								<%
                                                                                }
                                                                %>
								<div class="clearfix"> </div>
							</div>
						</div>
						
					</div>
				</div>
					<!--modal-video-->
				
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
<!-- //banner-bottom -->

<!-- banner-bottom1 -->
	<div class="banner-bottom1">
		<div class="agileinfo_banner_bottom1_grids">
			<div class="col-md-7 agileinfo_banner_bottom1_grid_left">
				<h3>Grand Opening Event With flat<span>20% <i>Discount</i></span></h3>
				<a href="products3.jsp">Shop Now</a>
			</div>
			<div class="col-md-5 agileinfo_banner_bottom1_grid_right">
                            <a href="products4.jsp"><h4>hot deal</h4></a>
				<div class="timer_wrap">
					<div id="counter"> </div>
				</div>
				<script src="js/jquery.countdown.js"></script>
				<script src="js/script.js"></script>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
<!-- //banner-bottom1 -->

<!-- special-deals -->
	<div class="special-deals">
		<div class="container">
			<h2>Special Deals</h2>
			<div class="w3agile_special_deals_grids">
				<div class="col-md-7 w3agile_special_deals_grid_left">
					<div class="w3agile_special_deals_grid_left_grid">
						<img src="images/26.jpg" alt=" " class="img-responsive" />
						<div class="w3agile_special_deals_grid_left_grid_pos1">
                                                    <a href="products5.jsp"><h5>30%<span>Off/-</span></h5></a>
						</div>
						<div class="w3agile_special_deals_grid_left_grid_pos">
							<h4>We Offer <span>Best Products</span></h4>
						</div>
					</div>
                                    <div class="w3agile_special_deals_grid_left_grid" >
						<img src="images/73.jpg" alt=" " class="img-responsive" style="height:280px;"/>
						<div class="w3agile_special_deals_grid_left_grid_pos1">
                                                    <a href="products5.jsp"><h5>40%<span>Off/-</span></h5></a>
						</div>
						
					</div>
					
						<script src="js/jquery.wmuSlider.js"></script> 
						<script>
							$('.example1').wmuSlider();         
						</script> 
				</div>
				<div class="col-md-5 w3agile_special_deals_grid_right">
					<img src="images/25.jpg" alt=" " class="img-responsive" />
					<div class="w3agile_special_deals_grid_right_pos">
						<h4>Women's <span>Special</span></h4>
						<h5>save up <span>to</span> 30%</h5>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
<!-- //special-deals -->
<!-- new-products -->
	<div class="new-products">
		<div class="container">
			<h3>New Products</h3>
			<div class="agileinfo_new_products_grids">
				<%
                                     
                                      PreparedStatement ps=cn.prepareStatement("select * from items order by itemId desc limit 4");
                                      ResultSet rs=ps.executeQuery();
                                      while(rs.next())
                                      {
                                %>
				<div class="col-md-3 agileinfo_new_products_grid">
					<div class="agile_ecommerce_tab_left agileinfo_new_products_grid1">
						<div class="hs-wrapper hs-wrapper1">
							<img src="../admin/images/<%=rs.getString("itemImage")%>" alt=" " class="img-responsive" />
							
							<div class="w3_hs_bottom w3_hs_bottom_sub">
								<ul>
									<li>
										<a href="single.jsp?itemId=<%=rs.getString("itemId")%>" data-target="#myModal1"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span></a>
									</li>
								</ul>
							</div>
						</div>
                                                        <%
                                                        int p = Integer.parseInt(rs.getString("itemPrice"));
                                                        int d = Integer.parseInt(rs.getString("discount"));
                                                        int m = p * d / 100;
                                                        int amount = p - m;
                                                        %>
						<h5><a href="single.jsp?itemId=<%=rs.getString("itemId")%>"><%=rs.getString("itemName")%></a></h5>
						<div class="simpleCart_shelfItem">
							<p><span>&#8377 <%=rs.getString("itemPrice")%></span> <i class="item_price">&#8377 <%=amount%></i></p>
                                                        <%
                                                        if(session.getAttribute("userEmail")==null)
                                                        {
                                                        %>
							<p><a class="item_add" href="userlogin3.jsp?itemId=<%=rs.getString("itemId")%>">Add to cart</a></p>
                                                        <%
                                                        }
                                                        else
                                                        {
                                                        %>
                                                        <p><a class="item_add" href="single.jsp?itemId=<%=rs.getString("itemId")%>">Add to cart</a></p>
                                                        <%
                                                                }
                                                        %>
						</div>
					</div>
				</div>
                                <%
                                      }
                                %>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>

<!-- //new-products -->
<!-- top-brands -->
	
<!-- footer -->
<jsp:include page="footer.jsp"></jsp:include>
<!-- //footer -->
</body>
</html>