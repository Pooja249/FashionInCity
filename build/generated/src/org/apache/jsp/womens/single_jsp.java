package org.apache.jsp.womens;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import Connection.Connect;
import java.sql.Connection;
import java.sql.Connection;

public final class single_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--\n");
      out.write("Author: W3layouts\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Women's Fashion a Ecommerce Online Shopping Category Flat Bootstrap Responsive Website Template | Single :: w3layouts</title>\n");
      out.write("<!-- for-mobile-apps -->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Women's Fashion Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("\t\tfunction hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- //for-mobile-apps -->\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/fasthover.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("<!-- js -->\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<!-- //js -->\n");
      out.write("<!-- cart -->\n");
      out.write("<script src=\"js/simpleCart.min.js\"></script>\n");
      out.write("<!-- cart -->\n");
      out.write("<!-- for bootstrap working -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap-3.1.1.min.js\"></script>\n");
      out.write("<!-- //for bootstrap working -->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Glegoo:400,700' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>\n");
      out.write("<!-- start-smooth-scrolling -->\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tjQuery(document).ready(function($) {\n");
      out.write("\t\t$(\".scroll\").click(function(event){\t\t\n");
      out.write("\t\t\tevent.preventDefault();\n");
      out.write("\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("<!-- //end-smooth-scrolling -->\n");
      out.write("</head>\n");
      out.write("\t\n");
      out.write("<body>\n");
      out.write("<!-- header -->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("<!-- //header -->\n");
      out.write("<!-- banner -->\n");
      out.write("\t<div class=\"banner10\" id=\"home1\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h2>Single Page</h2>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- //banner -->\n");
      out.write("\n");
      out.write("<!-- breadcrumbs -->\n");
      out.write("\t<div class=\"breadcrumb_dress\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"home.jsp\"><span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span> Home</a> <i>/</i></li>\n");
      out.write("\t\t\t\t<li>Single Page</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- //breadcrumbs -->\n");
      out.write("\n");
      out.write("<!-- single -->\n");
      out.write("\n");
      out.write("                           \n");
      out.write("\t<div class=\"single\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("                    ");

                                String itemId=request.getParameter("itemId");
                                Connection cn=new Connect().getConnection();
                                PreparedStatement ps=cn.prepareStatement("select * from items where itemId=?");
                                ps.setString(1, itemId);
                                ResultSet rs=ps.executeQuery();
                                if(rs.next())
                                {
                            
      out.write("\n");
      out.write("                            <input type=\"hidden\" name=\"itemId\" value=\"");
      out.print(rs.getString("itemId"));
      out.write("\"/>\n");
      out.write("\t\t\t<div class=\"col-md-4 single-left\">\n");
      out.write("                            \n");
      out.write("\t\t\t\t<div class=\"flexslider\">\n");
      out.write("\t\t\t\t\t<ul class=\"slides\">\n");
      out.write("\t\t\t\t\t\t<li data-thumb=\"../admin/images/");
      out.print(rs.getString("itemImage"));
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"thumb-image\"> <img src=\"../admin/images/");
      out.print(rs.getString("itemImage"));
      out.write("\" data-imagezoom=\"true\" class=\"img-responsive\" style=\"height:400px;\"> </div>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                                \n");
      out.write("\t\t\t\t<!-- flixslider -->\n");
      out.write("\t\t\t\t\t<script defer src=\"js/jquery.flexslider.js\"></script>\n");
      out.write("\t\t\t\t\t<link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("\t\t\t\t\t<script>\n");
      out.write("\t\t\t\t\t// Can also be used with $(document).ready()\n");
      out.write("\t\t\t\t\t$(window).load(function() {\n");
      out.write("\t\t\t\t\t  $('.flexslider').flexslider({\n");
      out.write("\t\t\t\t\t\tanimation: \"slide\",\n");
      out.write("\t\t\t\t\t\tcontrolNav: \"thumbnails\"\n");
      out.write("\t\t\t\t\t  });\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t<!-- flixslider -->\n");
      out.write("\t\t\t\t<!-- zooming-effect -->\n");
      out.write("\t\t\t\t\t<script src=\"js/imagezoom.js\"></script>\n");
      out.write("\t\t\t\t<!-- //zooming-effect -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-8 single-right\">\n");
      out.write("\t\t\t\t<h3>");
      out.print(rs.getString("itemName"));
      out.write("</h3>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"description\">\n");
      out.write("\t\t\t\t\t\t<h5><i>DESCRIPTION</i></h5>\n");
      out.write("\t\t\t\t\t\t<p>");
      out.print(rs.getString("itemDes"));
      out.write("</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t                                ");


                                                                       int p = Integer.parseInt(rs.getString("itemPrice"));
                                                                       int d = Integer.parseInt(rs.getString("discount"));
                                                                       int m = p * d / 100;
                                                                       int amount = p - m;

                                                                                     
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t\t\t\t<p><span>&#8377 ");
      out.print(rs.getString("itemPrice"));
      out.write("/-</span> <i class=\"item_price\">&#8377 ");
      out.print(amount);
      out.write("/-</i></p>\n");
      out.write("                                                        <form action=\"../CheckPin\" method=\"post\"> \n");
      out.write("                                                          <input type=\"hidden\" name=\"itemId\" value=\"");
      out.print(rs.getString("itemId"));
      out.write("\"/>\n");
      out.write("                                                            <p style=\"color:gray;\">Enter Pin:</p>\n");
      out.write("                                                            <input type=\"text\" name=\"pin\" class=\"form-control\"/><br>\n");
      out.write("                                                           <input type=\"submit\" value=\"Check Pin\" class=\"btn btn-warning\"/>\n");
      out.write("                                                        </form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                               \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("                    ");

                                }
                    
      out.write("    \n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<div class=\"w3l_related_products\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h3>Related Products</h3>\n");
      out.write("\t\t\t<ul id=\"flexiselDemo2\">\t\t\t\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<div class=\"w3l_related_products_grid\">\n");
      out.write("\t\t\t\t\t\t<div class=\"agile_ecommerce_tab_left dresses_grid\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"hs-wrapper hs-wrapper3\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss1.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss2.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss3.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss4.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss5.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss6.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss7.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss8.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"w3_hs_bottom\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"flex_ecommerce\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal6\"><span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<h5><a href=\"single.html\">Pink Flared Skirt</a></h5>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"flexisel_ecommerce_cart\"><span>$312</span> <i class=\"item_price\">$212</i></p>\n");
      out.write("\t\t\t\t\t\t\t\t<p><a class=\"item_add\" href=\"#\">Add to cart</a></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<div class=\"w3l_related_products_grid\">\n");
      out.write("\t\t\t\t\t\t<div class=\"agile_ecommerce_tab_left dresses_grid\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"hs-wrapper hs-wrapper3\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss2.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss3.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss4.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss5.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss6.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss9.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss7.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss8.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"w3_hs_bottom\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"flex_ecommerce\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal6\"><span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<h5><a href=\"single.html\">Red Pencil Skirt</a></h5>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"flexisel_ecommerce_cart\"><span>$432</span> <i class=\"item_price\">$323</i></p>\n");
      out.write("\t\t\t\t\t\t\t\t<p><a class=\"item_add\" href=\"#\">Add to cart</a></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<div class=\"w3l_related_products_grid\">\n");
      out.write("\t\t\t\t\t\t<div class=\"agile_ecommerce_tab_left dresses_grid\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"hs-wrapper hs-wrapper3\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss3.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss4.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss5.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss6.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss7.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss8.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss9.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss1.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"w3_hs_bottom\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"flex_ecommerce\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal6\"><span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<h5><a href=\"single.html\">Yellow Cotton Skirt</a></h5>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"flexisel_ecommerce_cart\"><span>$323</span> <i class=\"item_price\">$310</i></p>\n");
      out.write("\t\t\t\t\t\t\t\t<p><a class=\"item_add\" href=\"#\">Add to cart</a></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<div class=\"w3l_related_products_grid\">\n");
      out.write("\t\t\t\t\t\t<div class=\"agile_ecommerce_tab_left dresses_grid\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"hs-wrapper hs-wrapper3\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss4.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss5.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss6.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss7.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss8.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss9.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss1.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/ss2.jpg\" alt=\" \" class=\"img-responsive\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"w3_hs_bottom\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"flex_ecommerce\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal6\"><span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<h5><a href=\"single.html\">Black Short</a></h5>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"flexisel_ecommerce_cart\"><span>$256</span> <i class=\"item_price\">$200</i></p>\n");
      out.write("\t\t\t\t\t\t\t\t<p><a class=\"item_add\" href=\"#\">Add to cart</a></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\t$(window).load(function() {\n");
      out.write("\t\t\t\t\t\t$(\"#flexiselDemo2\").flexisel({\n");
      out.write("\t\t\t\t\t\t\tvisibleItems:4,\n");
      out.write("\t\t\t\t\t\t\tanimationSpeed: 1000,\n");
      out.write("\t\t\t\t\t\t\tautoPlay: true,\n");
      out.write("\t\t\t\t\t\t\tautoPlaySpeed: 3000,    \t\t\n");
      out.write("\t\t\t\t\t\t\tpauseOnHover: true,\n");
      out.write("\t\t\t\t\t\t\tenableResponsiveBreakpoints: true,\n");
      out.write("\t\t\t\t\t\t\tresponsiveBreakpoints: { \n");
      out.write("\t\t\t\t\t\t\t\tportrait: { \n");
      out.write("\t\t\t\t\t\t\t\t\tchangePoint:480,\n");
      out.write("\t\t\t\t\t\t\t\t\tvisibleItems: 1\n");
      out.write("\t\t\t\t\t\t\t\t}, \n");
      out.write("\t\t\t\t\t\t\t\tlandscape: { \n");
      out.write("\t\t\t\t\t\t\t\t\tchangePoint:640,\n");
      out.write("\t\t\t\t\t\t\t\t\tvisibleItems:2\n");
      out.write("\t\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\t\ttablet: { \n");
      out.write("\t\t\t\t\t\t\t\t\tchangePoint:768,\n");
      out.write("\t\t\t\t\t\t\t\t\tvisibleItems: 3\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t</script>\n");
      out.write("\t\t\t\t<script type=\"text/javascript\" src=\"js/jquery.flexisel.js\"></script>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"modal video-modal fade\" id=\"myModal6\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModal6\">\n");
      out.write("\t\t<div class=\"modal-dialog\" role=\"document\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<section>\n");
      out.write("\t\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-5 modal_body_left\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/39.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-7 modal_body_right\">\n");
      out.write("\t\t\t\t\t\t\t<h4>a good look women's Long Skirt</h4>\n");
      out.write("\t\t\t\t\t\t\t<p>Ut enim ad minim veniam, quis nostrud \n");
      out.write("\t\t\t\t\t\t\t\texercitation ullamco laboris nisi ut aliquip ex ea \n");
      out.write("\t\t\t\t\t\t\t\tcommodo consequat.Duis aute irure dolor in \n");
      out.write("\t\t\t\t\t\t\t\treprehenderit in voluptate velit esse cillum dolore \n");
      out.write("\t\t\t\t\t\t\t\teu fugiat nulla pariatur. Excepteur sint occaecat \n");
      out.write("\t\t\t\t\t\t\t\tcupidatat non proident, sunt in culpa qui officia \n");
      out.write("\t\t\t\t\t\t\t\tdeserunt mollit anim id est laborum.</p>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"rating\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"rating-left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/star-.png\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"rating-left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/star-.png\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"rating-left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/star-.png\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"rating-left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/star.png\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"rating-left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"images/star.png\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"modal_body_right_cart simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t\t\t\t\t<p><span>$320</span> <i class=\"item_price\">$250</i></p>\n");
      out.write("\t\t\t\t\t\t\t\t<p><a class=\"item_add\" href=\"#\">Add to cart</a></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<h5>Color</h5>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"color-quality\">\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><span></span>Red</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"brown\"><span></span>Yellow</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"purple\"><span></span>Purple</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"gray\"><span></span>Violet</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</section>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- //single -->\n");
      out.write("\n");
      out.write("<!-- footer -->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("<!-- //footer -->\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
