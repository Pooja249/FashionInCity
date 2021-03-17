package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <!-- Meta, title, CSS, favicons, etc. -->\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("  <title>Admin Panel</title>\n");
      out.write("\n");
      out.write("  <!-- Bootstrap core CSS -->\n");
      out.write("\n");
      out.write("  <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <link href=\"fonts/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"css/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Custom styling plus plugins -->\n");
      out.write("  <link href=\"css/custom.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"css/icheck/flat/green.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("  <script src=\"js/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("  <!--[if lt IE 9]>\n");
      out.write("        <script src=\"../assets/js/ie8-responsive-file-warning.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("  <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("  <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\t<style>\tbody {\n");
      out.write("    background-image: url(\"images/bg.jpg\");\n");
      out.write("    background-repeat: repeat-y;\n");
      out.write("} </style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body id=\"particle\" >\n");
      out.write("\n");
      out.write("  <div class=\"\">\n");
      out.write("    <a class=\"hiddenanchor\" id=\"toregister\"></a>\n");
      out.write("    <a class=\"hiddenanchor\" id=\"tologin\"></a>\n");
      out.write("\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("      <div id=\"login\" class=\"animate form\">\n");
      out.write("\t  <img src=\"images/Logo.png\" class=\"responsive\" style=\"width:90%; padding-left:60px;\"/>\n");
      out.write("        <section class=\"login_content\">\n");
      out.write("            <form action=\"../Login\" method=\"post\">\n");
      out.write("\t\t     \n");
      out.write("            <h1><strong>Admin Login Form</strong></h1>\n");
      out.write("            <div>\n");
      out.write("              <input type=\"text\" pattern=\"[a-z][a-zA-Z0-9.+@]+@[a-zA-Z.]+\\.[a-z]{2,3}\" class=\"form-control\" name=\"email\" placeholder=\"email\" required=\"\" />\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("              <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Password\" required=\"\" />\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            <button class=\"btn btn-info btn-lg\" style=\"background-color:#000033;\" type=\"submit\" name=\"submit\">Log in</button>\n");
      out.write("              <a class=\"reset_pass\" style=\"color:#000033; font-weight: normal; font-size:15px;\" href=\"#toregister\"><strong>Lost your password?</strong></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("            <div class=\"separator\">\n");
      out.write("\n");
      out.write("             \n");
      out.write("              </p>\n");
      out.write("              <div class=\"clearfix\"></div>\n");
      out.write("              <br />\n");
      out.write("              <div>\n");
      out.write("                <h1><i class=\"fa fa-toggle-right\" style=\"font-size: 26px;\"></i> Diction Technology</h1>\n");
      out.write("\n");
      out.write("                <strong>Â©2018-19 Diction Technology, Noida </strong>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("          <!-- form -->\n");
      out.write("        </section>\n");
      out.write("        <!-- content -->\n");
      out.write("      </div>\n");
      out.write("      <div id=\"register\" class=\"animate form\">\n");
      out.write("\t  <img src=\"images/Logo.png\" class=\"responsive\" style=\"width:90%; padding-left:60px;\"/>\n");
      out.write("        <section class=\"login_content\">\n");
      out.write("            <form action=\"../ForgotPassword\" method=\"post\">\n");
      out.write("            <h1>Forget Password</h1>\n");
      out.write("            \n");
      out.write("            <div>\n");
      out.write("              <input type=\"text\" pattern=\"[a-z][a-zA-Z0-9.+@]+@[a-zA-Z.]+\\.[a-z]{2,3}\" class=\"form-control\" name=\"email\" placeholder=\"Email\" required=\"\" />\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("              <button type=\"submit\" class=\"btn btn-info btn-lg\" style=\"background-color:#000033;\">Submit</button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("            <div class=\"separator\">\n");
      out.write("\n");
      out.write("              <a class=\"change_link\" style=\"color:#000033; font-weight: normal; font-size:15px;\"><strong>Got valid details? </strong>\n");
      out.write("                <a href=\"#tologin\" class=\"to_register\" style=\"color:#000033; font-weight: normal; font-size:15px;\"><strong>Log In Here</strong></a>\n");
      out.write("              </p>\n");
      out.write("              <div class=\"clearfix\"></div>\n");
      out.write("              <br/>\n");
      out.write("              <div>\n");
      out.write("                <h1><i class=\"fa fa-toggle-right\" style=\"font-size: 26px;\"></i> Diction Technology</h1>\n");
      out.write("\n");
      out.write("                <strong>Â©2018-19 Diction Technology, Noida </strong>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("          <!-- form -->\n");
      out.write("        </section>\n");
      out.write("        <!-- content -->\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("<script src=\"js/particles.js\"></script>\n");
      out.write("<script src=\"js/app.js\"></script>\n");
      out.write("</body>\n");
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
