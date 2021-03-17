package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import Connection.Connect;
import java.sql.Connection;

public final class viewPin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t<!-- Meta, title, CSS, favicons, etc. -->\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("\t<title>Admin Panel | </title>\n");
      out.write("\n");
      out.write("\t<!-- Bootstrap core CSS -->\n");
      out.write("\n");
      out.write("\t<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\t<link href=\"fonts/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"css/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\t<!-- Custom styling plus plugins -->\n");
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
      out.write("\t<!--[if lt IE 9]>\n");
      out.write("\t<script src=\"../assets/js/ie8-responsive-file-warning.js\"></script>\n");
      out.write("\t<![endif]-->\n");
      out.write("\n");
      out.write("\t<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("\t<!--[if lt IE 9]>\n");
      out.write("\t<script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("\t<script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("\t<![endif]-->\n");
      out.write("        <script> \n");
      out.write("function fileValidation(){\n");
      out.write("    var fileInput = document.getElementById('file');\n");
      out.write("    var filePath = fileInput.value;\n");
      out.write("    var allowedExtensions = /(\\.jpg|\\.jpeg|\\.png|\\.gif)$/i;\n");
      out.write("    if(!allowedExtensions.exec(filePath)){\n");
      out.write("        alert('Please upload file having extensions .jpeg/.jpg/.png/.gif only.');\n");
      out.write("        fileInput.value = '';\n");
      out.write("        return false;\n");
      out.write("    }else{\n");
      out.write("        //Image preview\n");
      out.write("        if (fileInput.files && fileInput.files[0]) {\n");
      out.write("            var reader = new FileReader();\n");
      out.write("            reader.onload = function(e) {\n");
      out.write("                document.getElementById('imagePreview').innerHTML = '<img src=\"'+e.target.result+'\"/>';\n");
      out.write("            };\n");
      out.write("            reader.readAsDataURL(fileInput.files[0]);\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");

    if(session.getAttribute("email")==null)
    {
        response.sendRedirect("index.jsp");
    }
    else
    {

      out.write("\n");
      out.write("\n");
      out.write("<body class=\"nav-md\">\n");
      out.write("\n");
      out.write("\t<div class=\"container body\">\n");
      out.write("\t\t<div class=\"main_container\">\n");
      out.write("\t\t\t<div class=\"col-md-3 left_col\">\n");
      out.write("\t\t\t\t<div class=\"left_col scroll-view\">\n");
      out.write("                                      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- sidebar menu -->\n");
      out.write("\t\t\t\t\t ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/sidebar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- /sidebar menu -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- /menu footer buttons -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- /menu footer buttons -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<!-- top navigation -->\n");
      out.write("\t\t\t\t\t ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/nav.jsp", out, false);
      out.write("\n");
      out.write("\t\t\t<!-- /top navigation -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<!-- page content -->\n");
      out.write("\t\t\t<div class=\"right_col\" role=\"main\">\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t<div class=\"dashboard_graph\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row x_title\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("                                                                    <h3>Admin Panel <small><a href=\"AddPin.jsp\"><button class=\"btn-lg btn btn-outline btn-success\">Add Pin</button></a></small></h3>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("            \n");
      out.write("                                                      <div class=\"x_panel\">\n");
      out.write("                <div class=\"x_title\">\n");
      out.write("                  <h2>General Information</h2>\n");
      out.write("                  <ul class=\"nav navbar-right panel_toolbox\">\n");
      out.write("                    <li><a class=\"collapse-link\"><i class=\"fa fa-chevron-up\"></i></a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li><a class=\"close-link\"><i class=\"fa fa-close\"></i></a>\n");
      out.write("                    </li>\n");
      out.write("                  </ul>\n");
      out.write("                  <div class=\"clearfix\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"x_content\">\n");
      out.write("\n");
      out.write("                 <table id=\"datatable\" class=\"table table-striped table-bordered\">\n");
      out.write("                    <thead>\n");
      out.write("                      <tr>\n");
      out.write("                          <th>Pin</th>\n");
      out.write("                          <th>Edit</th>\n");
      out.write("                          <th>Delete</th>\n");
      out.write("                      </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");

                            Connection cn=new Connect().getConnection();
                            PreparedStatement ps=cn.prepareStatement("select * from pintable");
                            ResultSet rs=ps.executeQuery();
                            while(rs.next())
                            {
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(rs.getString("pin"));
      out.write("</td>\n");
      out.write("                            <td><a href=\"editPin.jsp?pinId=");
      out.print(rs.getString("pinId"));
      out.write("&pin=");
      out.print(rs.getString("pin"));
      out.write("\" class=\"btn btn-info btn-xs\"><i class=\"fa fa-pencil\"></i> Edit </a></td>\n");
      out.write("                            <td><a href=\"../DeletePin?pinId=");
      out.print(rs.getString("pinId"));
      out.write("\" class=\"btn btn-danger btn-xs\" onclick=\"if(confirm('Sure Want?')){return true;} else{return false;};\"><i class=\"fa  fa-trash-o\"></i> Delete </a></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                 </table>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("                                                    \n");
      out.write("                                                    \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function() {\n");
      out.write("              $('#birthday').daterangepicker({\n");
      out.write("                singleDatePicker: true,\n");
      out.write("                calender_style: \"picker_4\"\n");
      out.write("              }, function(start, end, label) {\n");
      out.write("                console.log(start.toISOString(), end.toISOString(), label);\n");
      out.write("              });\n");
      out.write("            });\n");
      out.write("          </script>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("                                                       \n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<br />\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- footer content -->\n");
      out.write("                                   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- /footer content -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- /page content -->\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div id=\"custom_notifications\" class=\"custom-notifications dsp_none\">\n");
      out.write("\t\t<ul class=\"list-unstyled notifications clearfix\" data-tabbed_notifications=\"notif-group\">\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t<div id=\"notif-group\" class=\"tabbed_notifications\"></div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- bootstrap progress js -->\n");
      out.write("  <script src=\"js/progressbar/bootstrap-progressbar.min.js\"></script>\n");
      out.write("  <script src=\"js/nicescroll/jquery.nicescroll.min.js\"></script>\n");
      out.write("  <!-- icheck -->\n");
      out.write("  <script src=\"js/icheck/icheck.min.js\"></script>\n");
      out.write("  <!-- pace -->\n");
      out.write("  <script src=\"js/pace/pace.min.js\"></script>\n");
      out.write("  <script src=\"js/custom.js\"></script>\n");
      out.write("  <!-- form validation -->\n");
      out.write("  <script src=\"js/validator/validator.js\"></script>\n");
      out.write("  <script>\n");
      out.write("    // initialize the validator function\n");
      out.write("    validator.message['date'] = 'not a real date';\n");
      out.write("\n");
      out.write("    // validate a field on \"blur\" event, a 'select' on 'change' event & a '.reuired' classed multifield on 'keyup':\n");
      out.write("    $('form')\n");
      out.write("      .on('blur', 'input[required], input.optional, select.required', validator.checkField)\n");
      out.write("      .on('change', 'select.required', validator.checkField)\n");
      out.write("      .on('keypress', 'input[required][pattern]', validator.keypress);\n");
      out.write("\n");
      out.write("    $('.multi.required')\n");
      out.write("      .on('keyup blur', 'input', function() {\n");
      out.write("        validator.checkField.apply($(this).siblings().last()[0]);\n");
      out.write("      });\n");
      out.write("\n");
      out.write("    // bind the validation to the form submit event\n");
      out.write("    //$('#send').click('submit');//.prop('disabled', true);\n");
      out.write("\n");
      out.write("    $('form').submit(function(e) {\n");
      out.write("      e.preventDefault();\n");
      out.write("      var submit = true;\n");
      out.write("      // evaluate the form using generic validaing\n");
      out.write("      if (!validator.checkAll($(this))) {\n");
      out.write("        submit = false;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      if (submit)\n");
      out.write("        this.submit();\n");
      out.write("      return false;\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    /* FOR DEMO ONLY */\n");
      out.write("    $('#vfields').change(function() {\n");
      out.write("      $('form').toggleClass('mode2');\n");
      out.write("    }).prop('checked', false);\n");
      out.write("\n");
      out.write("    $('#alerts').change(function() {\n");
      out.write("      validator.defaults.alerts = (this.checked) ? false : true;\n");
      out.write("      if (this.checked)\n");
      out.write("        $('form .alert').remove();\n");
      out.write("    }).prop('checked', false);\n");
      out.write("  </script>\n");
      out.write("\t<!-- /datepicker -->\n");
      out.write("\t<!-- /footer content -->\n");
      out.write("         <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- gauge js -->\n");
      out.write("\t\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/datepicker/daterangepicker.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");

    }

      out.write("\n");
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
