package org.apache.jsp.womens;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import Connection.Connect;
import java.sql.Connection;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Women's Fashion a Ecommerce Online Shopping Category Flat Bootstrap Responsive Website Template | Home :: w3layouts</title>\n");
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
      out.write("<!-- countdown -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/jquery.countdown.css\" />\n");
      out.write("<!-- //countdown -->\n");
      out.write("<!-- cart -->\n");
      out.write("<script src=\"js/simpleCart.min.js\"></script>\n");
      out.write("<!-- cart -->\n");
      out.write("<!-- for bootstrap working -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap-3.1.1.min.js\"></script>\n");
      out.write("<!-- //for bootstrap working -->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Glegoo:400,700' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>\n");
      out.write("<!-- start-smooth-scrolling -->\n");
      out.write("\n");
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
      out.write("\t\n");
      out.write("\t\t<div class=\"col-md-12\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "banner.jsp", out, false);
      out.write("\n");
      out.write("</div><br><br>\n");
      out.write("\t\n");
      out.write("<!-- //banner -->\n");
      out.write("\n");
      out.write("<!-- banner-bottom -->\n");
      out.write("\t<div class=\"banner-bottom\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"col-md-5 wthree_banner_bottom_left\">\n");
      out.write("\t\t\t\t<div class=\"video-img\">\n");
      out.write("\t\t\t\t\t<a class=\"play-icon popup-with-zoom-anim\" href=\"#small-dialog\">\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-expand\" aria-hidden=\"true\"></span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- pop-up-box -->    \n");
      out.write("\t\t\t\t\t\t<link href=\"css/popuo-box.css\" rel=\"stylesheet\" type=\"text/css\" property=\"\" media=\"all\" />\n");
      out.write("\t\t\t\t\t\t<script src=\"js/jquery.magnific-popup.js\" type=\"text/javascript\"></script>\n");
      out.write("\t\t\t\t\t<!--//pop-up-box -->\n");
      out.write("\t\t\t\t\t<div id=\"small-dialog\" class=\"mfp-hide\">\n");
      out.write("\t\t\t\t\t\t<iframe src=\"https://player.vimeo.com/video/23259282?title=0&byline=0&portrait=0\"></iframe>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<script>\n");
      out.write("\t\t\t\t\t\t$(document).ready(function() {\n");
      out.write("\t\t\t\t\t\t$('.popup-with-zoom-anim').magnificPopup({\n");
      out.write("\t\t\t\t\t\t\ttype: 'inline',\n");
      out.write("\t\t\t\t\t\t\tfixedContentPos: false,\n");
      out.write("\t\t\t\t\t\t\tfixedBgPos: true,\n");
      out.write("\t\t\t\t\t\t\toverflowY: 'auto',\n");
      out.write("\t\t\t\t\t\t\tcloseBtnInside: true,\n");
      out.write("\t\t\t\t\t\t\tpreloader: false,\n");
      out.write("\t\t\t\t\t\t\tmidClick: true,\n");
      out.write("\t\t\t\t\t\t\tremovalDelay: 300,\n");
      out.write("\t\t\t\t\t\t\tmainClass: 'my-mfp-zoom-in'\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t</script>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-7 wthree_banner_bottom_right\">\n");
      out.write("\t\t\t\t<div class=\"bs-example bs-example-tabs\" role=\"tabpanel\" data-example-id=\"togglable-tabs\">\n");
      out.write("                                    \n");
      out.write("\t\t\t\t\t\n");
      out.write("                                        \n");
      out.write("\t\t\t\t\t<div id=\"myTabContent\" class=\"tab-content\">\n");
      out.write("\t\t\t\t\t\t<div role=\"tabpanel\" class=\"tab-pane fade active in\" id=\"home\" aria-labelledby=\"home-tab\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"agile_ecommerce_tabs\">\n");
      out.write("                                                             ");

                                                                                Connection cn=new Connect().getConnection();
                                                                                PreparedStatement ps1=cn.prepareStatement("select * from items where itemPrice<1000 and itemStatus='active' limit 3");
                                                                                ResultSet rs1=ps1.executeQuery();
                                                                                while(rs1.next())
                                                                                {
                                                                            
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-4 agile_ecommerce_tab_left\">\n");
      out.write("                                                                   \n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"hs-wrapper\">\n");
      out.write("                                                                            \n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/");
      out.print(rs1.getString("itemImage"));
      out.write("\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"w3_hs_bottom\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"single.jsp?itemId=");
      out.print(rs1.getString("itemId"));
      out.write("\" data-target=\"#myModal\"><span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                               \n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                        ");

                                                        int p = Integer.parseInt(rs1.getString("itemPrice"));
                                                        int d = Integer.parseInt(rs1.getString("discount"));
                                                        int m = p * d / 100;
                                                        int amount = p - m;
                                                        
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5><a href=\"single.jsp?itemId=");
      out.print(rs1.getString("itemId"));
      out.write('"');
      out.write('>');
      out.print(rs1.getString("itemName"));
      out.write("</a></h5>\n");
      out.write("\t\t\t\t\t\t<div class=\"simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t\t\t\t<p><span>&#8377 ");
      out.print(rs1.getString("itemPrice"));
      out.write("</span> <i class=\"item_price\">&#8377 ");
      out.print(amount);
      out.write("</i></p>\n");
      out.write("                                                        ");

                                                        if(session.getAttribute("userEmail")==null)
                                                        {
                                                        
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<p><a class=\"item_add\" href=\"userlogin3.jsp?itemId=");
      out.print(rs1.getString("itemId"));
      out.write("\">Add to cart</a></p>\n");
      out.write("                                                        ");

                                                        }
                                                        else
                                                        {
                                                        
      out.write("\n");
      out.write("                                                        <p><a class=\"item_add\" href=\"single.jsp?itemId=");
      out.print(rs1.getString("itemId"));
      out.write("\">Add to cart</a></p>\n");
      out.write("                                                        ");

                                                                }
                                                        
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t");

                                                                                }
                                                                
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!--modal-video-->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- //banner-bottom -->\n");
      out.write("\n");
      out.write("<!-- banner-bottom1 -->\n");
      out.write("\t<div class=\"banner-bottom1\">\n");
      out.write("\t\t<div class=\"agileinfo_banner_bottom1_grids\">\n");
      out.write("\t\t\t<div class=\"col-md-7 agileinfo_banner_bottom1_grid_left\">\n");
      out.write("\t\t\t\t<h3>Grand Opening Event With flat<span>20% <i>Discount</i></span></h3>\n");
      out.write("\t\t\t\t<a href=\"products3.jsp\">Shop Now</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-5 agileinfo_banner_bottom1_grid_right\">\n");
      out.write("                            <a href=\"products4.jsp\"><h4>hot deal</h4></a>\n");
      out.write("\t\t\t\t<div class=\"timer_wrap\">\n");
      out.write("\t\t\t\t\t<div id=\"counter\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<script src=\"js/jquery.countdown.js\"></script>\n");
      out.write("\t\t\t\t<script src=\"js/script.js\"></script>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- //banner-bottom1 -->\n");
      out.write("\n");
      out.write("<!-- special-deals -->\n");
      out.write("\t<div class=\"special-deals\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h2>Special Deals</h2>\n");
      out.write("\t\t\t<div class=\"w3agile_special_deals_grids\">\n");
      out.write("\t\t\t\t<div class=\"col-md-7 w3agile_special_deals_grid_left\">\n");
      out.write("\t\t\t\t\t<div class=\"w3agile_special_deals_grid_left_grid\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/26.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t<div class=\"w3agile_special_deals_grid_left_grid_pos1\">\n");
      out.write("                                                    <a href=\"products5.jsp\"><h5>30%<span>Off/-</span></h5></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"w3agile_special_deals_grid_left_grid_pos\">\n");
      out.write("\t\t\t\t\t\t\t<h4>We Offer <span>Best Products</span></h4>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                    <div class=\"w3agile_special_deals_grid_left_grid\" >\n");
      out.write("\t\t\t\t\t\t<img src=\"images/73.jpg\" alt=\" \" class=\"img-responsive\" style=\"height:280px;\"/>\n");
      out.write("\t\t\t\t\t\t<div class=\"w3agile_special_deals_grid_left_grid_pos1\">\n");
      out.write("                                                    <a href=\"products5.jsp\"><h5>40%<span>Off/-</span></h5></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<script src=\"js/jquery.wmuSlider.js\"></script> \n");
      out.write("\t\t\t\t\t\t<script>\n");
      out.write("\t\t\t\t\t\t\t$('.example1').wmuSlider();         \n");
      out.write("\t\t\t\t\t\t</script> \n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-5 w3agile_special_deals_grid_right\">\n");
      out.write("\t\t\t\t\t<img src=\"images/25.jpg\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t<div class=\"w3agile_special_deals_grid_right_pos\">\n");
      out.write("\t\t\t\t\t\t<h4>Women's <span>Special</span></h4>\n");
      out.write("\t\t\t\t\t\t<h5>save up <span>to</span> 30%</h5>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- //special-deals -->\n");
      out.write("<!-- new-products -->\n");
      out.write("\t<div class=\"new-products\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h3>New Products</h3>\n");
      out.write("\t\t\t<div class=\"agileinfo_new_products_grids\">\n");
      out.write("\t\t\t\t");

                                     
                                      PreparedStatement ps=cn.prepareStatement("select * from items order by itemId desc limit 4");
                                      ResultSet rs=ps.executeQuery();
                                      while(rs.next())
                                      {
                                
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-md-3 agileinfo_new_products_grid\">\n");
      out.write("\t\t\t\t\t<div class=\"agile_ecommerce_tab_left agileinfo_new_products_grid1\">\n");
      out.write("\t\t\t\t\t\t<div class=\"hs-wrapper hs-wrapper1\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"../admin/images/");
      out.print(rs.getString("itemImage"));
      out.write("\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"w3_hs_bottom w3_hs_bottom_sub\">\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"single.jsp?itemId=");
      out.print(rs.getString("itemId"));
      out.write("\" data-target=\"#myModal1\"><span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                        ");

                                                        int p = Integer.parseInt(rs.getString("itemPrice"));
                                                        int d = Integer.parseInt(rs.getString("discount"));
                                                        int m = p * d / 100;
                                                        int amount = p - m;
                                                        
      out.write("\n");
      out.write("\t\t\t\t\t\t<h5><a href=\"single.jsp?itemId=");
      out.print(rs.getString("itemId"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("itemName"));
      out.write("</a></h5>\n");
      out.write("\t\t\t\t\t\t<div class=\"simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t\t\t\t<p><span>&#8377 ");
      out.print(rs.getString("itemPrice"));
      out.write("</span> <i class=\"item_price\">&#8377 ");
      out.print(amount);
      out.write("</i></p>\n");
      out.write("                                                        ");

                                                        if(session.getAttribute("userEmail")==null)
                                                        {
                                                        
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<p><a class=\"item_add\" href=\"userlogin3.jsp?itemId=");
      out.print(rs.getString("itemId"));
      out.write("\">Add to cart</a></p>\n");
      out.write("                                                        ");

                                                        }
                                                        else
                                                        {
                                                        
      out.write("\n");
      out.write("                                                        <p><a class=\"item_add\" href=\"single.jsp?itemId=");
      out.print(rs.getString("itemId"));
      out.write("\">Add to cart</a></p>\n");
      out.write("                                                        ");

                                                                }
                                                        
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                                ");

                                      }
                                
      out.write("\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("<!-- //new-products -->\n");
      out.write("<!-- top-brands -->\n");
      out.write("\t\n");
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
