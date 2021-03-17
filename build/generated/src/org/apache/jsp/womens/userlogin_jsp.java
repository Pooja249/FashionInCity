package org.apache.jsp.womens;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Women's Fashion a Ecommerce Online Shopping Category Flat Bootstrap Responsive Website Template | Home :: w3layouts</title>\n");
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
      out.write("        <div class=\"modal fade\" id=\"myModal88\" tabindex=\"-1\"\n");
      out.write("\t\taria-hidden=\"true\">\n");
      out.write("\t\t<div class=\"modal-dialog modal-lg\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\" id=\"myModalLabel\">\n");
      out.write("\t\t\t\t\t\tDon't Wait, Login now!</h4>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-body modal-body-sub\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-8 modal_body_left modal_body_left1\" style=\"border-right: 1px dotted #C2C2C2;padding-right:3em;\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"sap_tabs\">\t\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"horizontalTab\" style=\"display: block; width: 100%; margin: 0px;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"resp-tab-item\" aria-controls=\"tab_item-0\"><span>Sign in</span></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"resp-tab-item\" aria-controls=\"tab_item-1\"><span>Sign up</span></li>\n");
      out.write("                                                                                <li class=\"resp-tab-item\" aria-controls=\"tab-item-2\"><span>Forgot Password</span></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"tab-1 resp-tab-content\" aria-labelledby=\"tab_item-0\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"facts\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"register\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<form action=\"../UserLogin\" method=\"post\">\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"userEmail\" pattern=\"[a-z][a-zA-Z0-9.+@]+@[a-zA-Z.]+\\.[a-z]{2,3}\" placeholder=\"Email Address\" type=\"text\" required=\"\">\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"userPassword\" placeholder=\"Password\" type=\"password\" required=\"\">\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"sign-up\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Sign in\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"tab-2 resp-tab-content\" aria-labelledby=\"tab_item-1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"facts\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"register\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<form action=\"../UserRegistration\" method=\"post\" enctype=\"multipart/form-data\">\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input placeholder=\"Name\" pattern=\"([A-Za-z .])+\" name=\"userName\" type=\"text\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input placeholder=\"Email Address\" pattern=\"[a-z][a-zA-Z0-9.+@]+@[a-zA-Z.]+\\.[a-z]{2,3}\" name=\"userEmail\" type=\"email\" required=\"\">\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input placeholder=\"Password\" name=\"userPassword\" type=\"password\" required=\"\">\t\n");
      out.write("                                                                                                      \n");
      out.write("                                                                                                        <input placeholder=\"Mobile\" name=\"userMobile\" type=\"text\" required=\"\">\n");
      out.write("                                                                                                        <input type=\"file\" name=\"userImage\" required=\"\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"sign-up\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Create Account\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div> \t\n");
      out.write("                                                                    <div class=\"tab-3 resp-tab-content\" aria-labelledby=\"tab_item-2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"facts\">\n");
      out.write("                                                                                    <div class=\"register\">\n");
      out.write("                                                                                        <form action=\"../ForgotUserPass\" method=\"post\">\n");
      out.write("                                                                                            <input name=\"userEmail\" placeholder=\"Email Address\" type=\"text\" required=\"\">\n");
      out.write("                                                                                            \n");
      out.write("                                                                                            <div class=\"sign-up\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Submit\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                                        </form>\n");
      out.write("                                                                                    </div>\n");
      out.write("                                                                                </div>\n");
      out.write("                                                                    </div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<script src=\"js/easyResponsiveTabs.js\" type=\"text/javascript\"></script>\n");
      out.write("\t\t\t\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\t\t\t\t$(document).ready(function () {\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#horizontalTab').easyResponsiveTabs({\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype: 'default', //Types: default, vertical, accordion           \n");
      out.write("\t\t\t\t\t\t\t\t\t\twidth: 'auto', //auto or any width like 600px\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfit: true   // 100% fit in a container\n");
      out.write("\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t\t\t\t<div id=\"OR\" class=\"hidden-xs\">\n");
      out.write("\t\t\t\t\t\t\t\tOR</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4 modal_body_right modal_body_right1\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row text-center sign-with\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3 class=\"other-nw\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\tSign in with</h3>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"social\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"social_facebook\"><a href=\"#\" class=\"entypo-facebook\"></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"social_dribbble\"><a href=\"#\" class=\"entypo-dribbble\"></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"social_twitter\"><a href=\"#\" class=\"entypo-twitter\"></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li class=\"social_behance\"><a href=\"#\" class=\"entypo-behance\"></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("        <script>\n");
      out.write("\t\t$('#myModal88').modal('show');\n");
      out.write("\t</script>\n");
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
