package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.project.entity.Message;

public final class login_005fpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script type = \"text/javascript\" >  \n");
      out.write("    function preventBack() { window.history.forward(); }  \n");
      out.write("    setTimeout(\"preventBack()\", 0);  \n");
      out.write("    window.onunload = function () { null };  \n");
      out.write("</script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login Paqe</title>\n");
      out.write("\n");
      out.write("        <!--css-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <style>\n");
      out.write("            .banner-background{\n");
      out.write("                \n");
      out.write("                height: 100vh;\n");
      out.write("      background-image: \n");
      out.write("          \n");
      out.write("\t linear-gradient(to right bottom, \n");
      out.write("     rgba(30, 210, 255, 0.6),\n");
      out.write("     rgba(30, 210, 200, 0.8)),url(images/b.jpg);background-size: cover;background-position: top;\n");
      out.write("                   clip-path: ellipse(800px 800px at 30% 50%);\n");
      out.write("            }\n");
      out.write("               .primary-background{\n");
      out.write("                \n");
      out.write("                   background-color:#00bcd4;\n");
      out.write("     \n");
      out.write("               }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("       <main class=\" primary-background banner-background\"> <br><br><br>\n");
      out.write("           \n");
      out.write("            &nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; \n");
      out.write("            <a class=\"navbar-brand\" href=\"index.jsp\" style=\" margin-left: -40px; margin-top:-40px;color: whitesmoke; font-size: 60px; text-shadow: 0 5px 5px rgba(0,0,0,0.5);\"><span><b>RB</b></span></a>\n");
      out.write("            <br/><a class=\"navbar-brand\" href=\"getstarted.jsp\" style=\" margin-left: 10px; margin-top:-40px;color: whitesmoke; font-size: 20px; text-shadow: 0 5px 5px rgba(0,0,0,0.5);\"><span><b>Login as Admin?</b></span></a>\n");
      out.write("          \n");
      out.write("            <br>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-4 offset-md-3\">\n");
      out.write("\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-header primary-background text-white text-center\">\n");
      out.write("                                <span class=\"fa fa-user-plus fa-3x\"></span>\n");
      out.write("                                <br>\n");
      out.write("                                <p>Login here</p>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            ");

                                Message m = (Message) session.getAttribute("msg");
                                if (m != null) {
                            
      out.write("\n");
      out.write("                            <div class=\"alert ");
      out.print( m.getCssClass() );
      out.write("\" role=\"alert\">\n");
      out.write("                                ");
      out.print( m.getContent() );
      out.write("\n");
      out.write("                            </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("                            ");
        
                                    session.removeAttribute("msg");
                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <form action=\"LoginServlet\" method=\"post\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"exampleInputEmail1\">Email address</label>\n");
      out.write("                                        <input name=\"email\" required type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter email\">\n");
      out.write("                                        <small id=\"emailHelp\" class=\"form-text text-muted\">We'll never share your email with anyone else.</small>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"exampleInputPassword1\">Password</label>\n");
      out.write("                                        <input name=\"password\" required type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Password\">\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("             \n");
      out.write("                                    <a href=\"forgot.jsp\" id=\"fps\" style=\"float:right;\">Forgot Password?</a>\n");
      out.write("                                    <br><br>\n");
      out.write("                                    <div class=\"container text-center\">\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary\" style=\"background-color:#00bcd4;\">Submit</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </main>\n");
      out.write(" <script>\n");
      out.write("           \n");
      out.write("                    $.ajax({\n");
      out.write("                        url: \"Forgotpass\",\n");
      out.write("                        type: 'POST',\n");
      out.write("                        data: form,\n");
      out.write("                        success: function (data, textStatus, jqXHR) {\n");
      out.write("                            console.log(data)\n");
      out.write("                            $(\"#fps\").show();\n");
      out.write("                            if (data.trim() === 'done')\n");
      out.write("                            {\n");
      out.write("                                swal(\"Password changed!\")\n");
      out.write("                                        .then((value) => {\n");
      out.write("                                            window.location = \"index.jsp\"\n");
      out.write("                                        });\n");
      out.write("                            } else\n");
      out.write("                            {\n");
      out.write("                                swal(data);\n");
      out.write("                            }\n");
      out.write("                        },\n");
      out.write("                        error: function (jqXHR, textStatus, errorThrown) {\n");
      out.write("                            $(\"#fps\").show();\n");
      out.write("                            swal(\"something went wrong..try again\");\n");
      out.write("                        },\n");
      out.write("                        processData: false,\n");
      out.write("                        contentType: false\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--javascripts-->\n");
      out.write("        <script\n");
      out.write("            src=\"https://code.jquery.com/jquery-3.4.1.min.js\"\n");
      out.write("            integrity=\"sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/myjs.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
