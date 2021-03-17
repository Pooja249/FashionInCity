package org.apache.jsp.womens;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import Connection.Connect;
import java.sql.Connection;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <!-- for-mobile-apps -->\n");
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
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tjQuery(document).ready(function($) {\n");
      out.write("\t\t$(\".scroll\").click(function(event){\t\t\n");
      out.write("\t\t\tevent.preventDefault();\n");
      out.write("\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("<!-- //end-smooth-scrolling -->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            if(session.getAttribute("userEmail")==null)
            {
        
      out.write("\n");
      out.write("        <div class=\"header\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"w3l_login\">\n");
      out.write("\t\t\t\t<a href=\"userlogin.jsp\" data-target=\"#myModal88\"><span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"w3l_logo\">\n");
      out.write("\t\t\t\t<h1><a href=\"home.jsp\">Women's Fashion<span>For Fashion Lovers</span></a></h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"search\">\n");
      out.write("\t\t\t\t<input class=\"search_box\" type=\"checkbox\" id=\"search_box\">\n");
      out.write("\t\t\t\t<label class=\"icon-search\" for=\"search_box\"><span class=\"glyphicon glyphicon-search\" aria-hidden=\"true\"></span></label>\n");
      out.write("\t\t\t\t<div class=\"search_form\">\n");
      out.write("\t\t\t\t\t<form action=\"#\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"Search\" placeholder=\"Search...\">\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Send\">\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"cart box_1\">\n");
      out.write("\t\t\t\t<a href=\"cart.jsp\">\n");
      out.write("\t\t\t\t\t<div class=\"total\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<img src=\"images/bag.png\" alt=\"\" /> \n");
      out.write("                                        </div>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\t\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"navigation\" style=\"margin-left: 15%;\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<nav class=\"navbar navbar-default\">\n");
      out.write("\t\t\t\t<!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t\t\t\t<div class=\"navbar-header nav_2\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed navbar-toggle1\" data-toggle=\"collapse\" data-target=\"#bs-megadropdown-tabs\">\n");
      out.write("\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t</div> \n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-megadropdown-tabs\">\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"home.jsp\" class=\"act\">Home</a></li>\t\n");
      out.write("\t\t\t\t\t\t<!-- Mega Menu -->\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"products.jsp\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Products <b class=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu multi-column columns-3\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("                                                                   ");

                                                                                            Connection cn=new Connect().getConnection();
                                                                                            PreparedStatement ps=cn.prepareStatement("select * from categorytable where categoryStatus='active'");
                                                                                            ResultSet rs=ps.executeQuery();
                                                                                             while(rs.next())
                                                                                             {
                                                                                      
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("                                                                            \n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("                                                                                      \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h6>");
      out.print(rs.getString("categoryName"));
      out.write("</h6>\n");
      out.write("                                                                                    \n");
      out.write("                                                                                    ");

                                                                                         String categoryId=request.getParameter("categoryId");   
                                                                                         PreparedStatement ps1=cn.prepareStatement("Select * from subcategorytable where categoryId=? and subCategoryStatus='active'");
                                                                                         ps1.setString(1, rs.getString("categoryId"));
                                                                                         ResultSet rs1=ps1.executeQuery();
                                                                                         while(rs1.next())
                                                                                         {
                                                                                    
      out.write(" \n");
      out.write("                                                                                        \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp?subCategoryId=");
      out.print(rs1.getString("subCategoryId"));
      out.write('"');
      out.write('>');
      out.print(rs1.getString("subCategoryName"));
      out.write("</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("                                                                              \n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t                                ");

                                                                                             
                                                                              }
                                                                          
      out.write(" \t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"aboutus.jsp\">About Us</a></li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<li><a href=\"mail.jsp\">Mail Us</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("        ");

            }
         else
          { 
        
      out.write("\n");
      out.write("        <div class=\"header\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"w3l_logo\">\n");
      out.write("\t\t\t\t<h1><a href=\"home.jsp\">Women's Fashion<span>For Fashion Lovers</span></a></h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"search\">\n");
      out.write("\t\t\t\t<input class=\"search_box\" type=\"checkbox\" id=\"search_box\">\n");
      out.write("\t\t\t\t<label class=\"icon-search\" for=\"search_box\"><span class=\"glyphicon glyphicon-search\" aria-hidden=\"true\"></span></label>\n");
      out.write("\t\t\t\t<div class=\"search_form\">\n");
      out.write("\t\t\t\t\t<form action=\"#\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"Search\" placeholder=\"Search...\">\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Send\">\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"cart box_1\">\n");
      out.write("\t\t\t\t<a href=\"cart.jsp\">\n");
      out.write("\t\t\t\t\t<div class=\"total\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<img src=\"images/bag.png\" alt=\"\" />\n");
      out.write("                                        </div>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\t\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"navigation\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<nav class=\"navbar navbar-default\">\n");
      out.write("\t\t\t\t<!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t\t\t\t<div class=\"navbar-header nav_2\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed navbar-toggle1\" data-toggle=\"collapse\" data-target=\"#bs-megadropdown-tabs\">\n");
      out.write("\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t</div> \n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-megadropdown-tabs\">\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"home.jsp\" class=\"act\">Home</a></li>\t\n");
      out.write("\t\t\t\t\t\t<!-- Mega Menu -->\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"products.jsp\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Products <b class=\"caret\"></b></a>\n");
      out.write("                                                        \n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu multi-column columns-3\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("                                                                    ");

                                                                                            Connection cn=new Connect().getConnection();
                                                                                            PreparedStatement ps=cn.prepareStatement("select * from categorytable where categoryStatus='active'");
                                                                                            ResultSet rs=ps.executeQuery();
                                                                                             while(rs.next())
                                                                                             {
                                                                                      
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("                                                                            \n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"multi-column-dropdown\">\n");
      out.write("                                                                                      \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h6>");
      out.print(rs.getString("categoryName"));
      out.write("</h6>\n");
      out.write("                                                                                    \n");
      out.write("                                                                                    ");

                                                                                         String categoryId=request.getParameter("categoryId");   
                                                                                         PreparedStatement ps1=cn.prepareStatement("Select * from subcategorytable where categoryId=? and subCategoryStatus='active'");
                                                                                         ps1.setString(1, rs.getString("categoryId"));
                                                                                         ResultSet rs1=ps1.executeQuery();
                                                                                         while(rs1.next())
                                                                                         {
                                                                                    
      out.write(" \n");
      out.write("                                                                                        \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"products.jsp?subCategoryId=");
      out.print(rs1.getString("subCategoryId"));
      out.write('"');
      out.write('>');
      out.print(rs1.getString("subCategoryName"));
      out.write("</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");

                                                                                         }
                                                                                        
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("                                                                              \n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t                                ");

                                                                                             
                                                                              }
                                                                          
      out.write(" \t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                                        \n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"aboutus.jsp\">About Us</a></li>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<li><a href=\"mail.jsp\">Mail Us</a></li>\n");
      out.write("                                                ");

                                                    String userEmail=session.getAttribute("userEmail").toString();
                                                   
                                                    PreparedStatement ps2=cn.prepareStatement("select * from usertable where userEmail=?");
                                                    ps2.setString(1, userEmail);
                                                    ResultSet rs2=ps2.executeQuery();
                                                    if(rs2.next())
                                                    {
                                                
      out.write("\n");
      out.write("                                                <li class=\"dropdown\" style=\"margin-left:120px;\">\n");
      out.write("                                                    <a href=\"userProfile.jsp\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><h5><b>Hii, ");
      out.print(rs2.getString("userName"));
      out.write("</b><b class=\"caret\"></b></h5></a>\n");
      out.write("                                                <ul class=\"dropdown-menu pull-right\">\n");
      out.write("                                                   <div class=\"col-md-3\">\n");
      out.write("                                                    <li><a href=\"userDashboard.jsp\" class=\"btn btn-default\">Dashboard</a></li>\n");
      out.write("                                                    \n");
      out.write("                                                   <li><a href=\"logout.jsp\" class=\"btn btn-default\">Logout</a></li>\n");
      out.write("                                                   </div>\n");
      out.write("                                                </ul>\n");
      out.write("                                                </li>\n");
      out.write("                                                ");

                                                    }
                                                
      out.write("\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("                                    \n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
