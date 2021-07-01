package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class showtemplate2_002dcopy_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>SHOW TEMPLATES</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"page.css\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"showtemplate2.css\">\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/gif/png\" href=\"rb.png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.6.3/css/all.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br/>\n");
      out.write("        <hr>\n");
      out.write("        <br/>\n");
      out.write("       <center><h1 class=\"heading\">SAMPLE TEMPLATES</h1></center>\n");
      out.write("        <section>\n");
      out.write("\n");
      out.write("            <center><h1 class=\"heading\">PROFESSIONAL RESUME TEMPLATES</h1></center>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                \n");
      out.write("                <h3 class=\"heading\">Choose a template that suits your profile</h3>\n");
      out.write("             \n");
      out.write("                <hr>\n");
      out.write("                <div class=\"card-wrapper\">\n");
      out.write("                    <div class=\"card\" data-tilt>\n");
      out.write("                        <img src=\"templare2.jpeg\" class=\"card-img\">\n");
      out.write("                        <h1>WINDSER</h1>\n");
      out.write("                        <a href=\"windser.html\" class=\"btn\">VIEW</a>\n");
      out.write("                         <ul class=\"soial-media\">\n");
      out.write("                         <center>  <li><i class=\"fa fa-eye\" title=\"NO OF VIEWS\" aria-hidden=\"true\" style=\"color: cadetblue;\"></i></li></center>\n");
      out.write("                   \n");
      out.write("                        </ul>\n");
      out.write("                    \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                   \n");
      out.write("\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <img src=\"template2.png\" class=\"card-img\">\n");
      out.write("                        <h1>ELEGANT</h1>\n");
      out.write("                        <a href=\"template2.png\" class=\"btn\">VIEW</a>\n");
      out.write("                        <ul class=\"soial-media\" >\n");
      out.write("                            <center>  <li><i class=\"fa fa-eye\" title=\"NO OF VIEWS\" aria-hidden=\"true\" style=\"color: cadetblue;\"></i></li></center>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                  >\n");
      out.write("            </div>\n");
      out.write("            <br/>\n");
      out.write("            <nav  class=\"navbar\">\n");
      out.write("                <ul class=\"pagination justify-content-center fixed-bottom mb-5\">\n");
      out.write("                    <li class=\"page-item\" title=\"previous\">\n");
      out.write("                        <a href=\"showtemplate2.jsp\" class=\"page-link rounded-circle m-1\"><i class=\"fas fa-chevron-left text-primary\"></i></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"page-item\"><a href=\"showtemplate2.jsp\" class=\"page-link rounded-circle m-1\">1</a></li>\n");
      out.write("                    <li class=\"page-item  active\"><a href=\"showtemplate2-copy.jsp\" class=\"page-link rounded-circle m-1\">2</a></li>\n");
      out.write("                    <li class=\"page-item\" title=\"next\">\n");
      out.write("                        <a href=\"showtemplate2-copy.jsp\" class=\"page-link rounded-circle m-1\"><i class=\"fas fa-chevron-right text-primary\"></i></a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("    \n");
      out.write("        </section>\n");
      out.write("        <script type=\"text/javascript\" src=\"vanilla-tilt.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            VanillaTilt.init(document.querySelector(\".card\"), {\n");
      out.write("                max: 25,\n");
      out.write("                speed: 400\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            //It also supports NodeList\n");
      out.write("            VanillaTilt.init(document.querySelectorAll(\".card\"));\n");
      out.write("        </script>        \n");
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
