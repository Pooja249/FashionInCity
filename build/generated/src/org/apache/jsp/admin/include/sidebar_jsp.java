package org.apache.jsp.admin.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import Connection.Connect;
import java.sql.Connection;

public final class sidebar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <div id=\"sidebar-menu\" class=\"main_menu_side hidden-print main_menu\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"menu_section\">\n");
      out.write("\t\t\t\t\t\t\t<h3>General</h3>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav side-menu\">\n");
      out.write("                                                            <li><a><i class=\"fa fa-user\"></i> Admin Profile <span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav child_menu\" style=\"display: none\">\n");
      out.write("                                                                            ");

                          Connection cn=new Connect().getConnection();
                          PreparedStatement ps=cn.prepareStatement("select * from admintable");
                          ResultSet rs=ps.executeQuery();
                          if(rs.next())
                          {
                      
      out.write("\n");
      out.write("                                                                            <li><a href=\"edit_profile.jsp?adminId=");
      out.print(rs.getString("adminId"));
      out.write("&name=");
      out.print(rs.getString("name"));
      out.write("&email=");
      out.print(rs.getString("email"));
      out.write("&website=");
      out.print(rs.getString("website"));
      out.write("&designation=");
      out.print(rs.getString("designation"));
      out.write("&mobile=");
      out.print(rs.getString("mobile"));
      out.write("\">Edit Profile</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"change_Password.jsp\">Change Password</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("                                                                                ");

                                                                                    }
                                                                                
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("                                                                \n");
      out.write("\t\t\t\t\t\t\t\t<li><a><i class=\"fa fa-file-image-o\"></i> Banner <span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav child_menu\" style=\"display: none\">\n");
      out.write("                                                                            <li><a href=\"Add_Banner.jsp\">Add Banner</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"view_Banner.jsp\">View Banner</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("                                                                <li><a><i class=\"fa fa-file-image-o\"></i> Gallery <span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav child_menu\" style=\"display: none\">\n");
      out.write("                                                                            <li><a href=\"Add_Gallery.jsp\">Add Gallery</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"view_Gallery.jsp\">View Gallery</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("                                                                \n");
      out.write("                                                                <li><a><i class=\"fa fa-bars\"></i> Category <span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav child_menu\" style=\"display: none\">\n");
      out.write("                                                                            <li><a href=\"Add_Category.jsp\">Add Category</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"view_Category.jsp\">View Category</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("                                                                                <li><a href=\"Add_SubCategory.jsp\">Add Sub-Category</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("                                                                                <li><a href=\"view_SubCategory.jsp\">View Sub-Category</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("                                                                                <li><a href=\"Add_Item.jsp\">Add Item</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("                                                                                <li><a href=\"view_Item.jsp\">View Item</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a><i class=\"glyphicon glyphicon-heart-empty\"></i> Testimonial <span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav child_menu\" style=\"display: none\">\n");
      out.write("                                                                            <li><a href=\"Testimonial.jsp\">View Testimonial</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("                                                                <li><a><i class=\"fa fa-question\"></i> FAQ'S <span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav child_menu\" style=\"display: none\">\n");
      out.write("                                                                            <li><a href=\"ADD_FAQ.jsp\">Add FAQ</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t <li><a href=\"View_FAQ.jsp\">View FAQ</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("                                                                <li><a><i class=\"fa fa-edit\"></i> Pages <span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav child_menu\" style=\"display: none\">\n");
      out.write("                                                                            <li><a href=\"Addaboutus.jsp\">Update About Us</a></li>\n");
      out.write("                                                                            <li><a href=\"PrivacyPolicy.jsp\">Update Privacy Policy</a> </li>\n");
      out.write("\t\t\t\t\t\t\t\t            <li><a href=\"Term_Condition.jsp\">Update Terms & Conditions</a>\n");
      out.write("\t\t\t\t\t\t                           </li>\n");
      out.write("                                                                           <li><a href=\"Add_team.jsp\">Add Team</a>\n");
      out.write("\t\t\t\t\t\t                           </li>\n");
      out.write("                                                                           <li><a href=\"View_team.jsp\">View Team</a>\n");
      out.write("\t\t\t\t\t\t                           </li>\n");
      out.write("                                                                           \n");
      out.write("                              \t\t\t\t\t         </ul>\n");
      out.write("                                                                </li>\n");
      out.write("                                                                 <li><a><i class=\"fa fa-question\"></i>Query<span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav child_menu\" style=\"display: none\">\n");
      out.write("                                                                            <li><a href=\"contact_Query.jsp\">Contact Query</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t <li><a href=\"service_Query.jsp\">Service Query</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("                                                                <li><a><i class=\"fa fa-pin\"></i> Pin <span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav child_menu\" style=\"display: none\">\n");
      out.write("                                                                            <li><a href=\"AddPin.jsp\">Add Pin</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t <li><a href=\"viewPin.jsp\">View Pin</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("                                                                \n");
      out.write("                                                                 <li><a><i class=\"fa fa-cart-plus\"></i>Orders<span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav child_menu\" style=\"display: none\">\n");
      out.write("                                                                            <li><a href=\"manage_order.jsp\">Manage Orders</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t <li><a href=\"order_History.jsp\">Order History</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                                            </li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("                                                                 <li><a><i class=\"fa fa-user\"></i>Manage Accounts<span class=\"fa fa-chevron-down\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav child_menu\" style=\"display: none\">\n");
      out.write("                                                                            <li><a href=\"add_subadmin.jsp\">Add Sub-Admin</a> </li>\n");
      out.write("                                                                             <li><a href=\"view_subadmin.jsp\">View Sub-Admin</a> </li>\n");
      out.write("\t\t\t\t\t\t\t\t\t   <li><a href=\"view_Vendor.jsp\">View Vendor</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                                            </li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("                                                                \n");
      out.write("                                                                    \n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>   \n");
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
