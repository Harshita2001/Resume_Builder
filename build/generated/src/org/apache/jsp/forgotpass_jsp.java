package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.security.interfaces.RSAKey;
import java.sql.*;
import java.io.*;

public final class forgotpass_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
    Statement stmt1=conn.createStatement();

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("<title>Bootstrap Thumbnail Carousel</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,700\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("    .bg\n");
      out.write("    {\n");
      out.write("        background-color: #555;\n");
      out.write("    }\n");
      out.write("body {\n");
      out.write("\tbackground: #ebebeb;\n");
      out.write("}\n");
      out.write("h2 {\n");
      out.write("\tcolor: #696969;\n");
      out.write("\tfont-size: 15px;\n");
      out.write("\tfont-weight: 300;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tposition: relative;\n");
      out.write("\t/*margin: 40px 70px;*/\n");
      out.write("\ttext-transform: uppercase;\n");
      out.write("\tfont-family: 'Open Sans', sans-serif;\n");
      out.write("        color: #f0ae12;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1\n");
      out.write("{\n");
      out.write("    color: #696969;\n");
      out.write("\tfont-size: 26px;\n");
      out.write("\tfont-weight: 300;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tposition: relative;\n");
      out.write("\t/*margin: 40px 70px;*/\n");
      out.write("\ttext-transform: uppercase;\n");
      out.write("\tfont-family: 'Open Sans', sans-serif;\n");
      out.write("        color: #ffffff;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(".carousel {\t\n");
      out.write("\tmargin: 0 auto;\n");
      out.write("\tpadding: 0 150px;\n");
      out.write("        width: 120%;\n");
      out.write("}\n");
      out.write(".carousel .carousel-item {\n");
      out.write("\ttext-align: center;\n");
      out.write("\toverflow: hidden;\n");
      out.write("\theight: auto;\n");
      out.write("}\n");
      out.write(".carousel .carousel-item .img-box {\n");
      out.write("\tbackground: #fff;\n");
      out.write("\tpadding: 40px;\n");
      out.write("\tbox-shadow: 0 6px 20px -6px rgba(0,0,0,0.4);\n");
      out.write("        display: block;\n");
      out.write("        width: 100%;\n");
      out.write("/*        margin-right: 30px;*/\n");
      out.write("}\n");
      out.write(".carousel .carousel-item img {\n");
      out.write("\tmargin: 0 auto;\n");
      out.write("}\n");
      out.write(".carousel-control-prev, .carousel-control-next {\n");
      out.write("\twidth: 0px;\n");
      out.write("\t/*background-color: yellow;*/\n");
      out.write("}\n");
      out.write(".carousel-control-prev i {\n");
      out.write("\tbackground: #FFF;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 100em;\n");
      out.write("    width: 50px;\n");
      out.write("    height: 50px;\n");
      out.write("    box-shadow: 0px 3px 6px rgb(0 0 0 / 16%);\n");
      out.write("    position: absolute;\n");
      out.write("    top: 50%;\n");
      out.write("    margin-top: -32px;\n");
      out.write("    font-size: 18px;\n");
      out.write("    display: flex;\n");
      out.write("    align-items: center;\n");
      out.write("    justify-content: center;\n");
      out.write("    color: black;\n");
      out.write("    margin-left: -50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".carousel-control-next i {\n");
      out.write("    background: #FFF;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 100em;\n");
      out.write("    width: 50px;\n");
      out.write("    height: 50px;\n");
      out.write("    box-shadow: 0px 3px 6px rgb(0 0 0 / 16%);\n");
      out.write("    position: absolute;\n");
      out.write("    top: 50%;\n");
      out.write("    margin-top: -32px;\n");
      out.write("    font-size: 18px;\n");
      out.write("    display: flex;\n");
      out.write("    align-items: center;\n");
      out.write("    justify-content: center;\n");
      out.write("    color: black;\n");
      out.write("/*    margin-right: -50px;*/\n");
      out.write("   \n");
      out.write("}\n");
      out.write("\n");
      out.write(".carousel-control-next i:hover\n");
      out.write("{\n");
      out.write("    color: #ffffff;\n");
      out.write("    background: #f0ae12;\n");
      out.write("    height: 50px;\n");
      out.write("    width: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".carousel-control-prev i:hover\n");
      out.write("{\n");
      out.write("    color: #ffffff;\n");
      out.write("    background: #f0ae12;\n");
      out.write("    height: 50px;\n");
      out.write("    width: 50px;\n");
      out.write("}\n");
      out.write(".carousel-indicators {\n");
      out.write("\tbottom: -40px;\n");
      out.write("}\n");
      out.write(".carousel-indicators li, .carousel-indicators li.active {\n");
      out.write("\twidth: 10px;\n");
      out.write("\theight: 10px;\n");
      out.write("\tborder: none;\n");
      out.write("\tborder-radius: 50%;\n");
      out.write("\tmargin: 1px 4px;\n");
      out.write("\tbox-shadow: inset 0 2px 1px rgba(0,0,0,2.0);\n");
      out.write("}\n");
      out.write(".carousel-indicators li {\t\n");
      out.write("\tbackground: #999;\n");
      out.write("\tborder-color: transparent;\n");
      out.write("}\n");
      out.write(".carousel-indicators li.active {\n");
      out.write("\tbackground: #555;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"bg\">\n");
      out.write("        <br/>\n");
      out.write("<div class=\"container-xl\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"col-md-9  mx-auto\">\n");
      out.write("                    <h2> <b>Recruiters love lucidity of data</b></h2>\n");
      out.write("                    <h1> <b>Unique Resume Examples</b></h1><br/>\n");
      out.write("\t\t\t<div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\" data-interval=\"0\">\n");
      out.write("\t\t\t\t<!-- Carousel indicators -->\n");
      out.write("\t\t\t\t<ol class=\"carousel-indicators\">\n");
      out.write("\t\t\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("<!--\t\t\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("                                        <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("                                        <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>-->\n");
      out.write("<!--                                        <li data-target=\"#myCarousel\" data-slide-to=\"4\"></li>\n");
      out.write("\t\t\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"5\"></li>\n");
      out.write("                                        <li data-target=\"#myCarousel\" data-slide-to=\"6\"></li>\n");
      out.write("                                        <li data-target=\"#myCarousel\" data-slide-to=\"7\"></li>-->\n");
      out.write("\t\t\t\n");
      out.write("                                        \n");
      out.write("\t\t\t\t</ol>   \n");
      out.write("\t\t\t\t<!-- Wrapper for carousel items -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                   ");

                        
                    try
                        {
                            int i = 0;
                            String query1="Select NAME, FILE from TEMPLATE" ;
                            
                            ResultSet rs=stmt1.executeQuery(query1);
                            
                            while(rs.next())
                            {
                                String s = rs.getString("NAME");
                                String link = rs.getString("FILE");
                                i++;
                                out.print("<center>");
                                out.print( "<ol class='carousel-indicators'>");
					out.print( "<li data-target='#myCarousel' data-slide-to='0' class='active'></li>");
				out.print( "</ol>");
                             out.print( "<button class='button' type='button' data-toggle='modal' data-target='#myModal' id="+link+"  >"+s+"</button><br/>" );  
                             out.print("<div class='carousel-inne'>");   
                             out.print("<div class='carousel-item active'>");
				out.print("<div class='row'>");
out.print("<div class='col-sm-6'>");
out.print("<div class='img-box'>");
out.print("<iframe class='frm' width='100%' height='100%' src=''></iframe></div></div>");
		//out.print("<a type='button' id='' href='' target='_blank' class='btn_temp btn btn-danger use' >Use this template</a>");
                     			 
						out.print("</div>");
                                                out.print("</div>");
					out.print("</div>");
                                out.print("<center>");
                               
                 }
                        }
                        catch(Exception ex)
                        {
                            ex.printStackTrace();
                        }
                  
                    
      out.write("   \n");
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
      out.write("                     <script>\n");
      out.write("                        \n");
      out.write("                        $(document).ready(function(){\n");
      out.write("                            $('.button').click(function(){\n");
      out.write("                                var id = $(this).attr('id');\n");
      out.write("//                                $('#show-data').html(id);\n");
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
      out.write("        //Put the code from above here.\n");
      out.write("\n");
      out.write("    });\n");
      out.write("                                \n");
      out.write("  });\n");
      out.write("                                    });\n");
      out.write("                                    \n");
      out.write("                           \n");
      out.write("                    </script>\n");
      out.write("        \n");
      out.write("</body>\n");
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
