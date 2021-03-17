package org.apache.jsp.womens;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import Connection.Connect;
import java.sql.Connection;

public final class products_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--\n");
      out.write("Author: W3layouts\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Women's Fashion a Ecommerce Online Shopping Category Flat Bootstrap Responsive Website Template | Products :: w3layouts</title>\n");
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
      out.write("\t<div class=\"banner8\" id=\"home1\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h2>Women Cosmetics<span>up to</span> Flat 40% <i>Discount</i></h2>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- //banner -->\n");
      out.write("\n");
      out.write("<!-- breadcrumbs -->\n");
      out.write("\t<div class=\"breadcrumb_dress\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"home\"><span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span> Home</a> <i>/</i></li>\n");
      out.write("\t\t\t\t<li>Products</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- //breadcrumbs -->\n");
      out.write("\n");
      out.write("<!-- dresses -->\n");
      out.write("\t<div class=\"dresses\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"w3ls_dresses_grids\">\n");
      out.write("\t\t\t\t<div class=\"col-md-4 w3ls_dresses_grid_left\">\n");
      out.write("\t\t\t\t\t<div class=\"w3ls_dresses_grid_left_grid\">\n");
      out.write("\t\t\t\t\t\t<h3>Categories</h3>\n");
      out.write("\t\t\t\t\t\t<div class=\"w3ls_dresses_grid_left_grid_sub\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-group\" id=\"accordion\" role=\"tablist\" aria-multiselectable=\"true\">\n");
      out.write("                                                            ");

                                                                                            Connection cn=new Connect().getConnection();
                                                                                            PreparedStatement ps1=cn.prepareStatement("select * from categorytable where categoryStatus='active'");
                                                                                            ResultSet rs1=ps1.executeQuery();
                                                                                             while(rs1.next())
                                                                                             {
                                                                                      
      out.write("\n");
      out.write("\t\t\t\t\t\t\t  \n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"collapseOne\" class=\"panel-collapse collapse in\" role=\"tabpanel\" aria-labelledby=\"headingOne\">\n");
      out.write("\t\t\t\t\t\t\t\t  <div class=\"panel-body panel_text\">\n");
      out.write("                                                                       \n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"products1.jsp?categoryId=");
      out.print(rs1.getString("categoryId"));
      out.write('"');
      out.write('>');
      out.print(rs1.getString("categoryName"));
      out.write("</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("                                                                        \n");
      out.write("\t\t\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t\t\t  ");

                                                          }
                                                          
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"panel_bottom\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"products2.jsp\">Shop</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"dresses.html\">New In Clothing</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"sandals.html\">New In Shoes</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"products.html\">Latest Watches</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-8 w3ls_dresses_grid_right\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"w3ls_dresses_grid_right_grid2\">\n");
      out.write("\t\t\t\t\t\t<div class=\"w3ls_dresses_grid_right_grid2_left\">\n");
      out.write("\t\t\t\t\t\t\t<h3>Showing Results: 0-1</h3>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"w3ls_dresses_grid_right_grid2_right\">\n");
      out.write("\t\t\t\t\t\t\t<select name=\"select_item\" class=\"select_item\">\n");
      out.write("\t\t\t\t\t\t\t\t<option selected=\"selected\">Default sorting</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option>Sort by popularity</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option>Sort by average rating</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option>Sort by newness</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option>Sort by price: low to high</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option>Sort by price: high to low</option>\n");
      out.write("\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"w3ls_dresses_grid_right_grid3\">\n");
      out.write("\t\t\t\t\t\t");

                                                    
                                                  
                                                       
                                                        String subCategoryId=request.getParameter("subCategoryId");
                                                        PreparedStatement ps=cn.prepareStatement("select * from items where subCategoryId=? and itemStatus='active'");
                                                        ps.setString(1, subCategoryId);
                                                        ResultSet rs=ps.executeQuery();
                                                        while(rs.next())
                                                        {
                                                            
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4 agileinfo_new_products_grid agileinfo_new_products_grid_dresses\">\n");
      out.write("                                                  \n");
      out.write("                                                    \n");
      out.write("\t\t\t\t\t\t\t<div class=\"agile_ecommerce_tab_left dresses_grid\">\n");
      out.write("                                                          \n");
      out.write("                                                            \n");
      out.write("                                                            \n");
      out.write("                                                            <input type=\"hidden\" name=\"subCategoryId\" value=\"");
      out.print(rs.getString("subCategoryId"));
      out.write("\"/>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"hs-wrapper hs-wrapper2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"../admin/images/");
      out.print(rs.getString("itemImage"));
      out.write("\" alt=\" \" class=\"img-responsive\" style=\"width:210px;height:250px;\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"w3_hs_bottom w3_hs_bottom_sub1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"single.jsp?itemId=");
      out.print(rs.getString("itemId"));
      out.write("\" data-target=\"#myModal4\"><span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                                        ");


                                                                       int p = Integer.parseInt(rs.getString("itemPrice"));
                                                                       int d = Integer.parseInt(rs.getString("discount"));
                                                                       int m = p * d / 100;
                                                                       int amount = p - m;

                                                                                     
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<h5><a href=\"single.jsp?itemId=");
      out.print(rs.getString("itemId"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("itemName"));
      out.write("</a></h5>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><span>&#8377 ");
      out.print(rs.getString("itemPrice"));
      out.write("/-</span> <i class=\"item_price\">&#8377 ");
      out.print(amount);
      out.write("/-</i></p>\n");
      out.write("                                                                        ");

                                                                         if (session.getAttribute("userEmail") == null) 
                                                                         {
                                                                        
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a class=\"item_add\" href=\"userlogin3.jsp?itemId=");
      out.print(rs.getString("itemId"));
      out.write("\">Add to cart</a></p>\n");
      out.write("                                                                        ");

                                                                         }
                                                                         else
                                                                         {
                                                                        
      out.write("\n");
      out.write("                                                                        <p><a href=\"single.jsp?itemId=");
      out.print(rs.getString("itemId"));
      out.write("\">Add to Cart</a></p>\n");
      out.write("                                                                          ");
          
                                                                         }
                                                                        
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                           \n");
      out.write("                                                            \n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                     \n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                ");

                                                        }
                                                     
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<div class=\"w3l_related_products\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h3>Related Products</h3>\n");
      out.write("\t\t\t<ul id=\"flexiselDemo2\">\t\t\t\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<div class=\"w3l_related_products_grid\">\n");
      out.write("\t\t\t\t\t\t<div class=\"agile_ecommerce_tab_left dresses_grid\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"hs-wrapper hs-wrapper3\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/51.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/41.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/27.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/28.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/37.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/30.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/36.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/38.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"w3_hs_bottom\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"flex_ecommerce\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal6\"><span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<h5><a href=\"single.html\">Long Purple Skirts</a></h5>\n");
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
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/36.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/41.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/27.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/28.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/37.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/30.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/36.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/38.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"w3_hs_bottom\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"flex_ecommerce\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal6\"><span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<h5><a href=\"single.html\">Black Shorts</a></h5>\n");
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
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/38.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/37.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/27.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/28.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/37.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/30.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/36.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/38.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"w3_hs_bottom\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"flex_ecommerce\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal6\"><span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<h5><a href=\"single.html\">White Skirts</a></h5>\n");
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
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/37.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/41.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/27.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/28.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/37.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/30.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/36.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/38.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"w3_hs_bottom\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"flex_ecommerce\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal6\"><span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<h5><a href=\"single.html\">Long Skirts</a></h5>\n");
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
      out.write("<!-- //dresses -->\n");
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
