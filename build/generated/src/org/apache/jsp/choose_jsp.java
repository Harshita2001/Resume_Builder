package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class choose_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
    Statement stmt1=conn.createStatement();

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>CHOOSE TEMPLATE</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("           .top-container {\n");
      out.write("    grid-area: 1 / -3 / 1 / 3;\n");
      out.write("    margin: 0 0 2em 0;\n");
      out.write("\n");
      out.write("}\n");
      out.write("nav .menu-item.highlight:hover ~ #sub-menu-container #sub-menu-holder { opacity: 1; }\n");
      out.write("#navbar {\n");
      out.write(" \n");
      out.write("  padding: 20px 10px;\n");
      out.write("  position: absolute;\n");
      out.write("  width: 100%;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("#navbar a {\n");
      out.write("  float:left;\n");
      out.write("  text-decoration: none;}\n");
      out.write("\n");
      out.write("#navbar #logo {\n");
      out.write(" padding: 20px;} \n");
      out.write("        iframe\n");
      out.write("        {\n");
      out.write("            width: 800px;\n");
      out.write("            height: 1000px;\n");
      out.write("            resize: both;\n");
      out.write("        }\n");
      out.write("        h1 {\n");
      out.write("            text-align: center;\n");
      out.write("            text-transform: uppercase;\n");
      out.write("            color: black;\n");
      out.write("        }\n");
      out.write("        h2{\n");
      out.write("            font-size: 1.4rem;\n");
      out.write("            text-align: center;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            position: relative;\n");
      out.write("            font-weight: 700;\n");
      out.write("            font-family: \"Euclid Circular B\", sans-serif;\n");
      out.write("        }\n");
      out.write("        button \n");
      out.write("        {\n");
      out.write("            background-color: #4CAF50;\n");
      out.write("            border: none;\n");
      out.write("            color: white;\n");
      out.write("            text-align: center;\n");
      out.write("            text-decoration: none;\n");
      out.write("            display: inline-block;\n");
      out.write("            font-size: 16px;\n");
      out.write("            margin: 4px 2px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            border-radius: 12px;\n");
      out.write("            align-items: center;\n");
      out.write("            align-self: center;\n");
      out.write("            height: 40px;\n");
      out.write("            width: 250px;\n");
      out.write("            background-color: white;\n");
      out.write("            color: black;\n");
      out.write("            border: 2px solid #e7e7e7;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button:hover \n");
      out.write("        {\n");
      out.write("            background-color: #4CAF50;\n");
      out.write("            box-shadow: 0 12px 16px 0 rgba(0,0,0,1.0), 0 17px 50px 0 rgba(0,0,0,1.0);\n");
      out.write("        }\n");
      out.write("        .split \n");
      out.write("        {\n");
      out.write("            height: 100%;\n");
      out.write("            width: 50%;\n");
      out.write("            position: absolute;\n");
      out.write("            z-index: 1;\n");
      out.write("            /*top: 0;*/\n");
      out.write("            overflow-x: hidden;\n");
      out.write("            /*padding-top: 20px;*/\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .left \n");
      out.write("        {\n");
      out.write("            left: 0;\n");
      out.write("        }\n");
      out.write("        .right \n");
      out.write("        {\n");
      out.write("            right: 0;\n");
      out.write("        }\n");
      out.write("        .centered \n");
      out.write("        {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 35%;\n");
      out.write("            left: 50%;\n");
      out.write("            transform: translate(-50%, -50%);\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            div.foo{\n");
      out.write("  width: 100%;\n");
      out.write("  margin: 0 auto;\n");
      out.write("  text-align: left;\n");
      out.write("}\n");
      out.write(".letter{\n");
      out.write("   letter-spacing: 1px;\n");
      out.write("   font-weight: 900;\n");
      out.write("  font-size: 4em;\n");
      out.write("  margin: 0.0em;\n");
      out.write("  position: relative;\n");
      out.write("  color:#3b5998;\n");
      out.write("  transform-style: preserve-3d;\n");
      out.write("  perspective: 800;\n");
      out.write("  z-index: 1;\n");
      out.write("}\n");
      out.write(".letter:before, .letter:after{\n");
      out.write("  position:absolute;\n");
      out.write("  content: attr(data-letter);\n");
      out.write("  transform-origin: top left;\n");
      out.write("  top:0;\n");
      out.write("  left:0;\n");
      out.write("}\n");
      out.write(".letter, .letter:before, .letter:after{\n");
      out.write("  transition: all 0.3s ease-in-out;\n");
      out.write("}\n");
      out.write(".letter:before{\n");
      out.write("  color: #fff;\n");
      out.write("  text-shadow: \n");
      out.write("    -1px 0px 1px rgba(255,255,255,.8),\n");
      out.write("    1px 0px 1px rgba(0,0,0,.8);\n");
      out.write("  z-index: 3;\n");
      out.write("  transform:\n");
      out.write("    rotateX(0deg)\n");
      out.write("    rotateY(-15deg)\n");
      out.write("    rotateZ(0deg);\n");
      out.write("}\n");
      out.write(".letter:after{\n");
      out.write("  color: rgba(0,0,0,.11);\n");
      out.write("  z-index:2;\n");
      out.write("  transform:\n");
      out.write("    scale(1.08,1)\n");
      out.write("    rotateX(0deg)\n");
      out.write("    rotateY(0deg)\n");
      out.write("    rotateZ(0deg)\n");
      out.write("    skew(0deg,1deg);\n");
      out.write("}\n");
      out.write(".letter:hover:before{\n");
      out.write("  color: #fafafa;\n");
      out.write("  transform:\n");
      out.write("    rotateX(0deg)\n");
      out.write("    rotateY(-40deg)\n");
      out.write("    rotateZ(0deg);\n");
      out.write("}\n");
      out.write(".letter:hover:after{\n");
      out.write("  transform:\n");
      out.write("    scale(1.08,1)\n");
      out.write("    rotateX(0deg)\n");
      out.write("    rotateY(40deg)\n");
      out.write("    rotateZ(0deg)\n");
      out.write("    skew(0deg,22deg);\n");
      out.write("}  \n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write(".column {\n");
      out.write(" float: left;\n");
      out.write("  width: 30%;\n");
      out.write("  padding-left:100px;\n");
      out.write("  height: 200px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("   \n");
      out.write("        \n");
      out.write("        <div style=\"height: 150vh;\n");
      out.write("  \tbackground-image: \n");
      out.write("\t  linear-gradient(to right bottom, \n");
      out.write("     rgba(76, 210, 255, 0.6),\n");
      out.write("     rgba(30, 100, 200, 0.6)),\n");
      out.write("     url('bg.svg');\n");
      out.write("  \tbackground-size: cover;\n");
      out.write("  \tbackground-position: top;\n");
      out.write("  \tposition: relative;\n");
      out.write("\n");
      out.write("  \tclip-path: polygon(0 0, 100% 0, 100% 150vh, 0 100%);\"> \n");
      out.write("           \n");
      out.write("              <div class=\"foo\">\n");
      out.write("    <span class=\"letter\" data-letter=\"R\">R</span><span class=\"letter\" data-letter=\"B\">B</span>\n");
      out.write("     <a href=\"profile.jsp\" style=\"font-family:sans-serif;color:#2b0c62;padding-left: 10px;\">ResumeBuilder</a>\n");
      out.write(" \n");
      out.write("     <h1>Select Resume Template</h1>\n");
      out.write("            <h2>Choose a template that suits your profile!</h2>\n");
      out.write("          \n");
      out.write("              </div> \n");
      out.write("   \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"split left\">\n");
      out.write("            <div class=\"centered\">\n");
      out.write("\n");
      out.write("            \n");
      out.write("            ");
        
                try
                {
                    String query1="Select NAME, FILE from TEMPLATE" ;
                    ResultSet rs=stmt1.executeQuery(query1);
                    while(rs.next())
                    {
                        String s = rs.getString("NAME");
                        String link = rs.getString("FILE");
                        out.print("<center>");
                        out.print( "<button class='button' id="+link+"  >"+s+"</button><br/>" );  
                        out.print("<br/></center>");
                    }
                }
                catch(Exception ex)
                {
                    ex.printStackTrace();
                }                  
            
      out.write("\n");
      out.write("            \n");
      out.write("             </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"split right\">\n");
      out.write("            <div class=\"centered\">\n");
      out.write("            <iframe class=\"frm\" style=\"width:500px; height:500px;\"   src=\"\"></iframe> \n");
      out.write("            <a type='button' id=\"\" href=\"\" target='_blank' class='btn_temp btn btn-danger use' >Use this template</a>\n");
      out.write("            <!--<button>USE THIS TEMPLATE</button>-->\n");
      out.write("              <br/><br/><br/>  \n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("          <br/><br/><br/>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("            <br/><br/><br/>\n");
      out.write("        <script>\n");
      out.write("                        \n");
      out.write("                        $(document).ready(function(){\n");
      out.write("                            $('.button').click(function(){\n");
      out.write("                                var id = $(this).attr('id');\n");
      out.write("                                $('#show-data').html(id);\n");
      out.write("                                $(\".frm\").attr('src',id);\n");
      out.write("                                $(\".btn_temp\").attr('href',id);\n");
      out.write("                                   $(\".btn_temp\").attr('id',id);\n");
      out.write("        $(\".result\").attr('id',id);\n");
      out.write("                                 $(\"a#manual\").on(\"click\", function(){\n");
      out.write("         $.post(id, function(data){\n");
      out.write("\n");
      out.write("    $(\"#myModalDiv\").html(data).fadeIn();\n");
      out.write("\n");
      out.write("});\n");
      out.write("        \n");
      out.write("\n");
      out.write("    });\n");
      out.write("                                });\n");
      out.write("  \n");
      out.write("                                    });\n");
      out.write("                                    \n");
      out.write("                           \n");
      out.write("                    </script>\n");
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
