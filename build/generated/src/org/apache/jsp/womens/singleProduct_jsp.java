package org.apache.jsp.womens;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import Connection.Connect;
import java.sql.Connection;

public final class singleProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <title>Women's Fashion a Ecommerce Online Shopping</title>\n");
      out.write("        <!-- for-mobile-apps -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Women's Fashion Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("            function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <!-- //for-mobile-apps -->\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href=\"css/fasthover.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("        <!-- js -->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <!-- //js -->\n");
      out.write("        <!-- cart -->\n");
      out.write("        <script src=\"js/simpleCart.min.js\"></script>\n");
      out.write("        <!-- cart -->\n");
      out.write("        <!-- for bootstrap working -->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap-3.1.1.min.js\"></script>\n");
      out.write("        <!-- //for bootstrap working -->\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Glegoo:400,700' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>\n");
      out.write("        <!-- start-smooth-scrolling -->\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            jQuery(document).ready(function ($) {\n");
      out.write("                $(\".scroll\").click(function (event) {\n");
      out.write("                    event.preventDefault();\n");
      out.write("                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!-- //end-smooth-scrolling -->\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!-- header -->\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <!--header-->\n");
      out.write("            <!-- banner -->\n");
      out.write("            <div class=\"banner10\" id=\"home1\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h2>Single Page</h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- //banner -->\n");
      out.write("\n");
      out.write("            <!-- breadcrumbs -->\n");
      out.write("            <div class=\"breadcrumb_dress\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"index.jsp\"><span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span> Home</a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- //breadcrumbs -->\n");
      out.write("\n");
      out.write("            <!-- single -->   ");

                String itemId = request.getParameter("itemId");
                String pin=request.getParameter("pin");
                System.out.println(pin);
                Connection cn = new Connect().getConnection();
                PreparedStatement ps = cn.prepareStatement("select * from items where itemId=?");
                ps.setString(1, itemId);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {

        
      out.write("\n");
      out.write("        <div class=\"single\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                 <form action=\"../Cart\" method=\"post\">\n");
      out.write("                    \n");
      out.write("                <div class=\"col-md-4 single-left\">\n");
      out.write("                    <div class=\"flexslider\">\n");
      out.write("                        <ul class=\"slides\">\n");
      out.write("                            <li data-thumb=\"../admin/images/");
      out.print(rs.getString("itemImage"));
      out.write("\">\n");
      out.write("                                <div class=\"thumb-image\"> <img src=\"../admin/images/");
      out.print(rs.getString("itemImage"));
      out.write("\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- flixslider -->\n");
      out.write("                    <script defer src=\"js/jquery.flexslider.js\"></script>\n");
      out.write("                    <link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("                    <script>\n");
      out.write("// Can also be used with $(document).ready()\n");
      out.write("$(window).load(function () {\n");
      out.write("$('.flexslider').flexslider({\n");
      out.write("animation: \"slide\",\n");
      out.write("controlNav: \"thumbnails\"\n");
      out.write("});\n");
      out.write("});\n");
      out.write("                    </script>\n");
      out.write("                    <!-- flixslider -->\n");
      out.write("                    <!-- zooming-effect -->\n");
      out.write("                    <script src=\"js/imagezoom.js\"></script>\n");
      out.write("                    <!-- //zooming-effect -->\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"col-md-8 single-right\">\n");
      out.write("                    <h3>");
      out.print(rs.getString("itemName"));
      out.write("</h3>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"description\">\n");
      out.write("                        <h5><i>Description</i></h5>\n");
      out.write("                        <p>");
      out.print(rs.getString("ItemDes"));
      out.write("</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"color-quality\">\n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                        <div class=\"color-quality-left\">\n");
      out.write("                             \n");
      out.write("                            <h5>Quantity :</h5>\n");
      out.write("                            <input type=\"number\" name=\"qwe\" value=\"1\" min=\"1\" max=\"100\" >\n");
      out.write("                            <!--quantity-->\n");
      out.write("                            <script>\n");
      out.write("$('.value-plus1').on('click', function () {\n");
      out.write("var divUpd = $(this).parent().find('.value1'), newVal = parseInt(divUpd.text(), 10) + 1;\n");
      out.write("divUpd.text(newVal);\n");
      out.write("});\n");
      out.write("\n");
      out.write("$('.value-minus1').on('click', function () {\n");
      out.write("var divUpd = $(this).parent().find('.value1'), newVal = parseInt(divUpd.text(), 10) - 1;\n");
      out.write("if (newVal >= 1)\n");
      out.write("divUpd.text(newVal);\n");
      out.write("});\n");
      out.write("                            </script>\n");
      out.write("                            <!--quantity-->\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"simpleCart_shelfItem\">\n");
      out.write("\n");
      out.write("                        ");


                            int p = Integer.parseInt(rs.getString("itemPrice"));
                            int d = Integer.parseInt(rs.getString("discount"));
                            int m = p * d / 100;
                            int amount = p - m;

                        
      out.write("\n");
      out.write("                        <p><span> &#8377 ");
      out.print(rs.getString("itemPrice"));
      out.write("</span> <i class=\"item_price\"> &#8377 ");
      out.print(amount);
      out.write("</i></p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("                        ");

                            if (session.getAttribute("userEmail") == null) {
                        
      out.write("\n");
      out.write("                        <p><a class=\"item_add\" href=\"userlogin2.jsp?itemId=");
      out.print(rs.getString("itemId"));
      out.write("&pin=");
      out.print(pin);
      out.write("\">Add To Cart</a></p>\n");
      out.write("                        ");
} 
                         else {
                                
                        
      out.write("\n");
      out.write("                        <p>\n");
      out.write("                       \n");
      out.write("                            <input type=\"hidden\" name=\"itemId\" value=\"");
      out.print(rs.getString("itemId"));
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"itemName\" value=\"");
      out.print(rs.getString("itemName"));
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"discount\" value=\"");
      out.print(rs.getString("discount"));
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"itemImage\" value=\"");
      out.print(rs.getString("itemImage"));
      out.write("\">\n");
      out.write("                             <input type=\"hidden\" name=\"itemPrice\" value=\"");
      out.print(rs.getString("itemPrice"));
      out.write("\">\n");
      out.write("                            \n");
      out.write("                            <input type=\"hidden\" name=\"pin\" value=\"");
      out.print(pin);
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"userEmail\" value=\"");
      out.print(session.getAttribute("userEmail"));
      out.write("\">\n");
      out.write("                           <input type=\"submit\" value=\"Add To Cart\" class=\"btn btn-round btn-warning btn-lg\">\n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"clearfix\"> </div>\n");
      out.write("                 </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- //single -->\n");
      out.write("       \n");
      out.write("        <!-- footer -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        <!-- //footer -->\n");
      out.write("    </body>\n");
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
