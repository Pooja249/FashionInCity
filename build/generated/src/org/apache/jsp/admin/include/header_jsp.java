package org.apache.jsp.admin.include;

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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div class=\"navbar nav_title\" style=\"border: 0;\">\n");
      out.write("\t\t\t\t\t\t<a href=\"dashboard.jsp\" class=\"site_title\"><i class=\"fa fa-paw\"></i> <span>Admin Panel</span></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- menu prile quick info -->\n");
      out.write("\t\t\t\t\t<div class=\"profile\">\n");
      out.write("                                             ");

                                                 Connection cn=new Connect().getConnection();
                                                 PreparedStatement ps=cn.prepareStatement("select * from admintable");
                                                 ResultSet rs=ps.executeQuery();
                                                 if(rs.next())
                                                  {
                                                    
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"profile_pic\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/");
      out.print(rs.getString("image"));
      out.write("\" alt=\"...\" class=\"img-circle profile_img\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                               \n");
      out.write("\t\t\t\t\t\t<div class=\"profile_info\">\n");
      out.write("\t\t\t\t\t\t\t<span>Welcome,</span>\n");
      out.write("\t\t\t\t\t\t\t<h2>");
      out.print(rs.getString("name"));
      out.write("</h2>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                ");

                                                    }
                                                
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- /menu prile quick info -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<br />\n");
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
