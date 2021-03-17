package org.apache.jsp.womens;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import Connection.Connect;
import java.sql.Connection;

public final class banner_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title></title>\n");
      out.write("</head>\n");
      out.write("<body style=\"padding:0px; margin:0px; background-color:#fff;font-family:arial,helvetica,sans-serif,verdana,'Open Sans'\">\n");
      out.write("\n");
      out.write("    <!-- #region Jssor Slider Begin -->\n");
      out.write("    <!-- Generator: Jssor Slider Maker -->\n");
      out.write("    <!-- Source: https://www.jssor.com -->\n");
      out.write("    <script src=\"js/jssor.slider.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        jssor_1_slider_init = function() {\n");
      out.write("\n");
      out.write("            var jssor_1_SlideoTransitions = [\n");
      out.write("              [{b:0,d:600,y:-290,e:{y:27}}],\n");
      out.write("              [{b:0,d:1000,y:185},{b:1000,d:500,o:-1},{b:1500,d:500,o:1},{b:2000,d:1500,r:360},{b:3500,d:1000,rX:30},{b:4500,d:500,rX:-30},{b:5000,d:1000,rY:30},{b:6000,d:500,rY:-30},{b:6500,d:500,sX:1},{b:7000,d:500,sX:-1},{b:7500,d:500,sY:1},{b:8000,d:500,sY:-1},{b:8500,d:500,kX:30},{b:9000,d:500,kX:-30},{b:9500,d:500,kY:30},{b:10000,d:500,kY:-30},{b:10500,d:500,c:{x:125.00,t:-125.00}},{b:11000,d:500,c:{x:-125.00,t:125.00}}],\n");
      out.write("              [{b:0,d:600,x:535,e:{x:27}}],\n");
      out.write("              [{b:-1,d:1,o:-1},{b:0,d:600,o:1,e:{o:5}}],\n");
      out.write("              [{b:-1,d:1,c:{x:250.0,t:-250.0}},{b:0,d:800,c:{x:-250.0,t:250.0},e:{c:{x:7,t:7}}}],\n");
      out.write("              [{b:-1,d:1,o:-1},{b:0,d:600,x:-570,o:1,e:{x:6}}],\n");
      out.write("              [{b:-1,d:1,o:-1,r:-180},{b:0,d:800,o:1,r:180,e:{r:7}}],\n");
      out.write("              [{b:0,d:1000,y:80,e:{y:24}},{b:1000,d:1100,x:570,y:170,o:-1,r:30,sX:9,sY:9,e:{x:2,y:6,r:1,sX:5,sY:5}}],\n");
      out.write("              [{b:2000,d:600,rY:30}],\n");
      out.write("              [{b:0,d:500,x:-105},{b:500,d:500,x:230},{b:1000,d:500,y:-120},{b:1500,d:500,x:-70,y:120},{b:2600,d:500,y:-80},{b:3100,d:900,y:160,e:{y:24}}],\n");
      out.write("              [{b:0,d:1000,o:-0.4,rX:2,rY:1},{b:1000,d:1000,rY:1},{b:2000,d:1000,rX:-1},{b:3000,d:1000,rY:-1},{b:4000,d:1000,o:0.4,rX:-1,rY:-1}]\n");
      out.write("            ];\n");
      out.write("\n");
      out.write("            var jssor_1_options = {\n");
      out.write("              $AutoPlay: 1,\n");
      out.write("              $Idle: 2000,\n");
      out.write("              $CaptionSliderOptions: {\n");
      out.write("                $Class: $JssorCaptionSlideo$,\n");
      out.write("                $Transitions: jssor_1_SlideoTransitions,\n");
      out.write("                $Breaks: [\n");
      out.write("                  [{d:2000,b:1000}]\n");
      out.write("                ]\n");
      out.write("              },\n");
      out.write("              $ArrowNavigatorOptions: {\n");
      out.write("                $Class: $JssorArrowNavigator$\n");
      out.write("              },\n");
      out.write("              $BulletNavigatorOptions: {\n");
      out.write("                $Class: $JssorBulletNavigator$\n");
      out.write("              }\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            var jssor_1_slider = new $JssorSlider$(\"jssor_1\", jssor_1_options);\n");
      out.write("\n");
      out.write("            /*#region responsive code begin*/\n");
      out.write("\n");
      out.write("            var MAX_WIDTH = 2000;\n");
      out.write("\n");
      out.write("            function ScaleSlider() {\n");
      out.write("                var containerElement = jssor_1_slider.$Elmt.parentNode;\n");
      out.write("                var containerWidth = containerElement.clientWidth;\n");
      out.write("\n");
      out.write("                if (containerWidth) {\n");
      out.write("\n");
      out.write("                    var expectedWidth = Math.min(MAX_WIDTH || containerWidth, containerWidth);\n");
      out.write("\n");
      out.write("                    jssor_1_slider.$ScaleWidth(expectedWidth);\n");
      out.write("                }\n");
      out.write("                else {\n");
      out.write("                    window.setTimeout(ScaleSlider, 30);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            ScaleSlider();\n");
      out.write("\n");
      out.write("            $Jssor$.$AddEvent(window, \"load\", ScaleSlider);\n");
      out.write("            $Jssor$.$AddEvent(window, \"resize\", ScaleSlider);\n");
      out.write("            $Jssor$.$AddEvent(window, \"orientationchange\", ScaleSlider);\n");
      out.write("            /*#endregion responsive code end*/\n");
      out.write("        };\n");
      out.write("    </script>\n");
      out.write("    <link href=\"//fonts.googleapis.com/css?family=Oswald:200,300,regular,500,600,700&subset=latin-ext,vietnamese,latin,cyrillic\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    <style>\n");
      out.write("        /*jssor slider loading skin spin css*/\n");
      out.write("        .jssorl-009-spin img {\n");
      out.write("            animation-name: jssorl-009-spin;\n");
      out.write("            animation-duration: 1.6s;\n");
      out.write("            animation-iteration-count: infinite;\n");
      out.write("            animation-timing-function: linear;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @keyframes jssorl-009-spin {\n");
      out.write("            from { transform: rotate(0deg); }\n");
      out.write("            to { transform: rotate(360deg); }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /*jssor slider bullet skin 052 css*/\n");
      out.write("        .jssorb052 .i {position:absolute;cursor:pointer;}\n");
      out.write("        .jssorb052 .i .b {fill:#000;fill-opacity:0.3;}\n");
      out.write("        .jssorb052 .i:hover .b {fill-opacity:.7;}\n");
      out.write("        .jssorb052 .iav .b {fill-opacity: 1;}\n");
      out.write("        .jssorb052 .i.idn {opacity:.3;}\n");
      out.write("\n");
      out.write("        /*jssor slider arrow skin 053 css*/\n");
      out.write("        .jssora053 {display:block;position:absolute;cursor:pointer;}\n");
      out.write("        .jssora053 .a {fill:none;stroke:#fff;stroke-width:640;stroke-miterlimit:10;}\n");
      out.write("        .jssora053:hover {opacity:.8;}\n");
      out.write("        .jssora053.jssora053dn {opacity:.5;}\n");
      out.write("        .jssora053.jssora053ds {opacity:.3;pointer-events:none;}\n");
      out.write("    </style>\n");
      out.write("    <div id=\"jssor_1\" style=\"position:relative;margin:0 auto;top:0px;left:0px;width:2000px;height:500px;overflow:hidden;visibility:hidden;\">\n");
      out.write("        <!-- Loading Screen -->\n");
      out.write("        <div data-u=\"loading\" class=\"jssorl-009-spin\" style=\"position:absolute;top:0px;left:0px;width:100%;height:100%;text-align:center;background-color:rgba(0,0,0,0.7);\">\n");
      out.write("            <img style=\"margin-top:-19px;position:relative;top:50%;width:38px;height:38px;\" src=\"img/spin.svg\" />\n");
      out.write("        </div>\n");
      out.write("        <div data-u=\"slides\" style=\"cursor:default;top:0px;left:0px;width:2000px;height:500px;\">\n");
      out.write("            ");

                Connection cn=new Connect().getConnection();
                PreparedStatement ps=cn.prepareStatement("select * from banner");
                ResultSet rs=ps.executeQuery();
                while(rs.next())
                {
            
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <img data-u=\"image\" src=\"../admin/images/");
      out.print(rs.getString("bannerName"));
      out.write("\" />\n");
      out.write("            </div>\n");
      out.write("           ");

               }
           
      out.write("\n");
      out.write("           \n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("        <!-- Bullet Navigator -->\n");
      out.write("        <div data-u=\"navigator\" class=\"jssorb052\" style=\"position:absolute;bottom:12px;right:12px;\" data-autocenter=\"1\" data-scale=\"0.5\" data-scale-bottom=\"0.75\">\n");
      out.write("            <div data-u=\"prototype\" class=\"i\" style=\"width:16px;height:16px;\">\n");
      out.write("                <svg viewbox=\"0 0 16000 16000\" style=\"position:absolute;top:0;left:0;width:100%;height:100%;\">\n");
      out.write("                    <circle class=\"b\" cx=\"8000\" cy=\"8000\" r=\"5800\"></circle>\n");
      out.write("                </svg>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Arrow Navigator -->\n");
      out.write("        <div data-u=\"arrowleft\" class=\"jssora053\" style=\"width:55px;height:55px;top:0px;left:25px;\" data-autocenter=\"2\" data-scale=\"0.75\" data-scale-left=\"0.75\">\n");
      out.write("            <svg viewbox=\"0 0 16000 16000\" style=\"position:absolute;top:0;left:0;width:100%;height:100%;\">\n");
      out.write("                <polyline class=\"a\" points=\"11040,1920 4960,8000 11040,14080 \"></polyline>\n");
      out.write("            </svg>\n");
      out.write("        </div>\n");
      out.write("        <div data-u=\"arrowright\" class=\"jssora053\" style=\"width:55px;height:55px;top:0px;right:25px;\" data-autocenter=\"2\" data-scale=\"0.75\" data-scale-right=\"0.75\">\n");
      out.write("            <svg viewbox=\"0 0 16000 16000\" style=\"position:absolute;top:0;left:0;width:100%;height:100%;\">\n");
      out.write("                <polyline class=\"a\" points=\"4960,1920 11040,8000 4960,14080 \"></polyline>\n");
      out.write("            </svg>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script type=\"text/javascript\">jssor_1_slider_init();</script>\n");
      out.write("    <!-- #endregion Jssor Slider End -->\n");
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
