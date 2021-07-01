package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class showtemplate2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>VIEW SAMPLE RESUMES</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,700\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("/*        body {\n");
      out.write("            background-image: url('bv.svg');\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("        }*/\n");
      out.write("        .bg\n");
      out.write("        {\n");
      out.write("            background-color: #555;\n");
      out.write("        }\n");
      out.write("        #example1 {\n");
      out.write("            \n");
      out.write("            background: url(Resumebg.jpeg);\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            height: 100%;\n");
      out.write("            position: relative;\n");
      out.write("            overflow: hidden;\n");
      out.write("          }\n");
      out.write("        h1 {\n");
      out.write("            font-size: 2.0rem;\n");
      out.write("            text-align: center;\n");
      out.write("            font-weight: 700;\n");
      out.write("            font-family: \"Euclid Circular B\", sans-serif;\n");
      out.write("        }\n");
      out.write("        h1::before,\n");
      out.write("        h1::after {\n");
      out.write("            display: inline-block;\n");
      out.write("            content: \"\";\n");
      out.write("            border-top: .3rem solid black;\n");
      out.write("            width: 4rem;\n");
      out.write("            margin: 0 1rem;\n");
      out.write("            transform: translateY(-0.3rem);\n");
      out.write("        } \n");
      out.write("        span {\n");
      out.write("            background-color: #ffffff;\n");
      out.write("        }\n");
      out.write("        h2{\n");
      out.write("            font-size: 1.4rem;\n");
      out.write("            text-align: center;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            position: relative;\n");
      out.write("            font-weight: 700;\n");
      out.write("            font-family: \"Euclid Circular B\", sans-serif;\n");
      out.write("        }\n");
      out.write("        p\n");
      out.write("        {\n");
      out.write("            color: white;\n");
      out.write("            font-family: \"Lucida Console\", \"Courier New\", monospace;\n");
      out.write("            margin-left: 1em;\n");
      out.write("            line-height: 1.6;\n");
      out.write("            font-size: 1.8em;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("        }\n");
      out.write("        carousel \n");
      out.write("        {\t\n");
      out.write("/*\tmargin: 0 auto;\n");
      out.write("\tpadding: 0 100px;\n");
      out.write("        width: 100%;*/\n");
      out.write("        \n");
      out.write("            margin: 50px;\n");
      out.write("            /*padding: 0 100px;*/\n");
      out.write("            width: 100%;\n");
      out.write("            horizontal-align:middle;\n");
      out.write("        }\n");
      out.write("        carousel carousel-item {\n");
      out.write("                text-align: center;\n");
      out.write("                overflow: hidden;\n");
      out.write("                height: auto;\n");
      out.write("        }\n");
      out.write("        carousel carousel-item img-box {\n");
      out.write("                background: #fff;\n");
      out.write("                padding: 40px;\n");
      out.write("                box-shadow: 0 6px 20px -6px rgba(0,0,0,0.4);\n");
      out.write("                display: block;\n");
      out.write("                width: 100%;\n");
      out.write("        /*        margin-right: 30px;*/\n");
      out.write("        }\n");
      out.write("        carousel carousel-item img {\n");
      out.write("                margin: 0 auto;\n");
      out.write("        }\n");
      out.write("        carousel-control-prev, carousel-control-next {\n");
      out.write("                width: 0px;\n");
      out.write("                /*background-color: yellow;*/\n");
      out.write("        }\n");
      out.write("        .carousel-control-prev i {\n");
      out.write("                background: #FFF;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 100em;\n");
      out.write("            width: 50px;\n");
      out.write("            height: 50px;\n");
      out.write("            box-shadow: 0px 3px 6px rgb(0 0 0 / 16%);\n");
      out.write("            position: absolute;\n");
      out.write("            top: 50%;\n");
      out.write("            margin-top: -32px;\n");
      out.write("            font-size: 18px;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: center;\n");
      out.write("            color: black;\n");
      out.write("            margin-left: -2px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .carousel-control-next i {\n");
      out.write("            background: #FFF;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 100em;\n");
      out.write("            width: 50px;\n");
      out.write("            height: 50px;\n");
      out.write("            box-shadow: 0px 3px 6px rgb(0 0 0 / 16%);\n");
      out.write("            position: absolute;\n");
      out.write("            top: 50%;\n");
      out.write("            margin-top: -32px;\n");
      out.write("            font-size: 18px;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: center;\n");
      out.write("            color: black;\n");
      out.write("            margin-right: -2px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .carousel-control-next i:hover\n");
      out.write("        {\n");
      out.write("            color: #ffffff;\n");
      out.write("            background: #f0ae12;\n");
      out.write("            height: 50px;\n");
      out.write("            width: 50px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .carousel-control-prev i:hover\n");
      out.write("        {\n");
      out.write("            color: #ffffff;\n");
      out.write("            background: #f0ae12;\n");
      out.write("            height: 50px;\n");
      out.write("            width: 50px;\n");
      out.write("        }\n");
      out.write("        .carousel-indicators {\n");
      out.write("                bottom: -40px;\n");
      out.write("        }\n");
      out.write("        .carousel-indicators li, .carousel-indicators li.active {\n");
      out.write("                width: 10px;\n");
      out.write("                height: 10px;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                margin: 1px 4px;\n");
      out.write("                box-shadow: inset 0 2px 1px rgba(0,0,0,2.0);\n");
      out.write("        }\n");
      out.write("        .carousel-indicators li \n");
      out.write("        {\t\n");
      out.write("                background: #999;\n");
      out.write("                border-color: transparent;\n");
      out.write("        }\n");
      out.write("        .carousel-indicators li.active {\n");
      out.write("                background: #555;\n");
      out.write("        }\n");
      out.write("        h4 {\n");
      out.write("\tcolor: #696969;\n");
      out.write("\tfont-size: 40px;\n");
      out.write("\tfont-weight: 300;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tposition: relative;\n");
      out.write("\t/*margin: 40px 70px;*/\n");
      out.write("\t/*text-transform: uppercase;*/\n");
      out.write("\tfont-family: 'Open Sans', sans-serif;\n");
      out.write("        color: #f0ae12;\n");
      out.write("        \n");
      out.write("        }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div style=\"height: 100vh;\n");
      out.write("  \tbackground-image: \n");
      out.write("\t  linear-gradient(to right bottom, \n");
      out.write("     rgba(76, 210, 255, 0.6),\n");
      out.write("     rgba(30, 100, 200, 0.6)),\n");
      out.write("     url('bg.svg');\n");
      out.write("  \tbackground-size: cover;\n");
      out.write("  \tbackground-position: top;\n");
      out.write("  \tposition: relative;\n");
      out.write("\n");
      out.write("  \tclip-path: polygon(0 0, 100% 0, 100% 100vh, 0 100%);\"> \n");
      out.write("       \n");
      out.write("            <br/>\n");
      out.write("        <h1><span>Resume Examples with Pre-filled Content for your Profile</span></h1>\n");
      out.write("        <h2><span>Start your journey towards a successful career!</span></h2>\n");
      out.write("                \n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"width: 50%;\">\n");
      out.write("                    <p>When it comes to getting a job, your resume is your calling card: \n");
      out.write("        a strong resume will get you through the door, and a weak one can result in a lost opportunity. \n");
      out.write("        To create a compelling resume, you need to have a well-organized, easy-to-read document, \n");
      out.write("        showcasing your most marketable, relevant talents and accomplishments.</p>\n");
      out.write("                </td>\n");
      out.write("                <td style=\"width: 50%;\">\n");
      out.write("                    <img src=\"BgImage.svg\" style=\"width:100%; height: 300px;\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        <br/>\n");
      out.write("        <h2 style=\"font-size: 2em; color: #009f78;\">Resume Samples for Your 2021 Job Application</h2><br/>\n");
      out.write("        \n");
      out.write("        <div class=\"bg\">\n");
      out.write("        <br/>\n");
      out.write("<div class=\"container-xl\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"col-md-9  mx-auto\">\n");
      out.write("                    <!--<h3> <b>Recruiters love lucidity of data</b></h3>-->\n");
      out.write("                    <h4> <b>Recruiters love lucidity of data</b></h4><br/>\n");
      out.write("\t\t\t<div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\" data-interval=\"0\">\n");
      out.write("\t\t\t\t<!-- Carousel indicators -->\n");
      out.write("\t\t\t\t<ol class=\"carousel-indicators\">\n");
      out.write("\t\t\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("\t\t\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("                                        <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("                                        <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\n");
      out.write("                                        <li data-target=\"#myCarousel\" data-slide-to=\"4\"></li>\n");
      out.write("\t\t\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"5\"></li>\n");
      out.write("                                        <li data-target=\"#myCarousel\" data-slide-to=\"6\"></li>\n");
      out.write("                                        <li data-target=\"#myCarousel\" data-slide-to=\"7\"></li>\n");
      out.write("\t\t\t\n");
      out.write("                                        \n");
      out.write("\t\t\t\t</ol>   \n");
      out.write("\t\t\t\t<!-- Wrapper for carousel items -->\n");
      out.write("\t\t\t\t<div class=\"carousel-inner\">\n");
      out.write("\t\t\t\t\t<div class=\"carousel-item active\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-6\" style=\"left: 25%\"><div class=\"img-box\"><img src=\"Resume1.png\" class=\"img-fluid\" alt=\"\"></div></div>\n");
      out.write("\t\t\t\t\t\t\t <!--<div class=\"col-sm-6\"><div class=\"img-box\"><img src=\"Resume2.png\" class=\"img-fluid\" alt=\"\"></div></div>-->\n");
      out.write("\t\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"carousel-item\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("                                                        <div class=\"col-sm-6\" style=\"left: 25%\"><div class=\"img-box\"><img src=\"Resume2.png\" class=\"img-fluid\" alt=\"\"></div></div>\n");
      out.write("\t\t\t\t\t\t\t<!--<div class=\"col-sm-6\"><div class=\"img-box\"><img src=\"Resume4.png\" class=\"img-fluid\" alt=\"\"></div></div>-->\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                        <div class=\"carousel-item\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("                                                        <div class=\"col-sm-6\" style=\"left: 25%\"><div class=\"img-box\"><img src=\"Resume3.png\" class=\"img-fluid\" alt=\"\"></div></div>\n");
      out.write("\t\t\t\t\t\t\t<!--<div class=\"col-sm-6\"><div class=\"img-box\"><img src=\"Resume5.png\" class=\"img-fluid\" alt=\"\"></div></div>-->\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                         <div class=\"carousel-item\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("                                                        <div class=\"col-sm-6\" style=\"left: 25%\"><div class=\"img-box\"><img src=\"Resume4.png\" class=\"img-fluid\" alt=\"\"></div></div>\n");
      out.write("\t\t\t\t\t\t\t <!--<div class=\"col-sm-6\"><div class=\"img-box\"><img src=\"Resume8.png\" class=\"img-fluid\" alt=\"\"></div></div>-->\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                        <div class=\"carousel-item\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-6\" style=\"left: 25%\"><div class=\"img-box\"><img src=\"Resume5.png\" class=\"img-fluid\" alt=\"\"></div></div>\n");
      out.write("\t\t\t\t\t\t\t <!--<div class=\"col-sm-6\"><div class=\"img-box\"><img src=\"Resume2.png\" class=\"img-fluid\" alt=\"\"></div></div>-->\n");
      out.write("\t\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                        <div class=\"carousel-item\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-6\" style=\"left: 25%\"><div class=\"img-box\"><img src=\"Resume6.png\" class=\"img-fluid\" alt=\"\"></div></div>\n");
      out.write("\t\t\t\t\t\t\t <!--<div class=\"col-sm-6\"><div class=\"img-box\"><img src=\"Resume2.png\" class=\"img-fluid\" alt=\"\"></div></div>-->\n");
      out.write("\t\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                        <div class=\"carousel-item\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-6\" style=\"left: 25%\"><div class=\"img-box\"><img src=\"Resume7.png\" class=\"img-fluid\" alt=\"\"></div></div>\n");
      out.write("\t\t\t\t\t\t\t <!--<div class=\"col-sm-6\"><div class=\"img-box\"><img src=\"Resume2.png\" class=\"img-fluid\" alt=\"\"></div></div>-->\n");
      out.write("\t\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                        <div class=\"carousel-item\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-6\" style=\"left: 25%\"><div class=\"img-box\"><img src=\"Resume8.png\" class=\"img-fluid\" alt=\"\"></div></div>\n");
      out.write("\t\t\t\t\t\t\t <!--<div class=\"col-sm-6\"><div class=\"img-box\"><img src=\"Resume2.png\" class=\"img-fluid\" alt=\"\"></div></div>-->\n");
      out.write("\t\t\t\t\t\t\t \n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                     \n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- Carousel controls -->\n");
      out.write("\t\t\t\t<a class=\"carousel-control-prev\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-chevron-left\"></i>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t<a class=\"carousel-control-next\" href=\"#myCarousel\" data-slide=\"next\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-chevron-right\"></i>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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