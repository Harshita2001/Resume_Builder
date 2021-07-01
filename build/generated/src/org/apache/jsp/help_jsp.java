package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.security.interfaces.RSAKey;
import java.sql.*;
import java.io.*;

public final class help_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src =\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js\">\n");
      out.write("        </script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"TemplateCSS.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("  <script>\n");
      out.write("      <script type=\"text/javascript\">\n");
      out.write("  $(document).ready(function () {\n");
      out.write("  $(\".modal-dialog\").css(\"width\", \"90%\");\n");
      out.write("  });\n");
      out.write("  </script>\n");
      out.write("        <style>\n");
      out.write("            iframe{\n");
      out.write("                width: 500px;\n");
      out.write("                height: 768px;\n");
      out.write("                resize: both;\n");
      out.write("            }\n");
      out.write("        table, th, td {\n");
      out.write("            /*border: px solid black;*/\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            margin-left: auto;\n");
      out.write("            margin-right: auto;\n");
      out.write("            align-content: center;\n");
      out.write("        }\n");
      out.write("        th, td {\n");
      out.write("            padding: 15px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .button {\n");
      out.write("            background-color: #4CAF50;\n");
      out.write("            border: none;\n");
      out.write("            color: white;\n");
      out.write("            padding: 15px 32px;\n");
      out.write("            text-align: center;\n");
      out.write("            text-decoration: none;\n");
      out.write("            display: inline-block;\n");
      out.write("            font-size: 16px;\n");
      out.write("            margin: 4px 2px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            border-radius: 12px;\n");
      out.write("            align-items: center;\n");
      out.write("            align-self: center;\n");
      out.write("            height: 60px;\n");
      out.write("            width: 300px;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .button {\n");
      out.write("        background-color: white;\n");
      out.write("        color: black;\n");
      out.write("        border: 2px solid #e7e7e7;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .button:hover \n");
      out.write("      {\n");
      out.write("          background-color: #4CAF50;\n");
      out.write("          box-shadow: 0 12px 16px 0 rgba(0,0,0,1.0), 0 17px 50px 0 rgba(0,0,0,1.0);\n");
      out.write("      }\n");
      out.write("      body {background-color:#0E9FC1;}\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      </style>\n");
      out.write("      \n");
      out.write("     <script>\n");
      out.write("  function resizeIframe(obj) {\n");
      out.write("    obj.style.height = obj.contentWindow.document.documentElement.scrollHeight + 'px';\n");
      out.write("  }\n");
      out.write("</script>   \n");
      out.write("        <title>VIEW TEMPLATE</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("  \n");
      out.write("      \n");
      out.write("            \n");
      out.write("        <div class=\"page-header text-center\">\n");
      out.write("            <div class=\"pick-cv-container\">\n");
      out.write("              <h1><span>Select Resume Template</span></h1>\n");
      out.write("              <p><b>Choose a template that suits your profile</b></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("                 <div class='modal' height=\"100%\"  id='myModal' >\n");
      out.write("                  <div class='modal-dialog'  >\n");
      out.write("                  <div class='modal-content' >\n");
      out.write("                      <div class='modal-header' id=\"show-data\" > \n");
      out.write("                                \n");
      out.write("                    <h4 class='modal-title' ></h4>\n");
      out.write("                  <button type='button' class='close' data-dismiss='modal'>&times;</button>\n");
      out.write("                         </div> \n");
      out.write("                       <div class='modal-body'> \n");
      out.write("                           <center>\n");
      out.write("                        <label>\n");
      out.write("                            <iframe class=\"frm\" width=\"100%\" height=\"100%\"   src=\"\"></iframe>\n");
      out.write("<!--                            <a class=\"manual\" href=\"\" id=\"manual\">click me</a>-->\n");
      out.write("                       </label>\n");
      out.write("                      <div class='modal-footer'>\n");
      out.write("                          <span class=\"result\" style=\"font-size:15px; padding-bottom: 20px;float: right;padding:3px;-webkit-background-clip: text;\n");
      out.write("  -webkit-text-fill-color: black;\">&nbsp; </span>\n");
      out.write("                     <a type='button' class='btn_temp' href=\"\" target=\"_blank\" class='btn btn-danger use' >Use this template</a>\n");
      out.write("                     \n");
      out.write("                     <button type='button' class='btn btn-danger'  data-dismiss='modal'>Close</button>\n");
      out.write("                      </div> </center>\n");
      out.write("                      </div>\n");
      out.write("               </div>\n");
      out.write("                   </div>\n");
      out.write("                  \n");
      out.write("                 </div>           \n");
      out.write("                \n");
      out.write("            \n");
      out.write("                ");

                        
                    try
                        {
                            int i = 0;
                            String query1="Select NAME, FILE from TEMPLATE" ;
                            
                            ResultSet rs=stmt1.executeQuery(query1);
                            
                            while(rs.next())
                            {
                                out.print("<tr>");
                                String s = rs.getString("NAME");
                                String link = rs.getString("FILE");
                                i++;
                                out.print("<center>");
                                out.print( "<button class='button' type='button' data-toggle='modal' data-target='#myModal' id="+link+"  >"+s+"</button><br/>" );  
                                out.print("<center>");
                               
                 }
                        }
                        catch(Exception ex)
                        {
                            ex.printStackTrace();
                        }
                  
                    
      out.write("\n");
      out.write("                        \n");
      out.write("   \n");
      out.write("                    <script>\n");
      out.write("                        \n");
      out.write("                        $(document).ready(function(){\n");
      out.write("                            $('.button').click(function(){\n");
      out.write("                                var id = $(this).attr('id');\n");
      out.write("                                $('#show-data').html(id);\n");
      out.write("                                $(\".frm\").attr('src',id);\n");
      out.write("                                $(\".btn_temp\").attr('href',id);\n");
      out.write("                                $(\".result\").attr('id',id);\n");
      out.write("                                 $(\"a#manual\").on(\"click\", function(){\n");
      out.write("         $.post(id, function(data){\n");
      out.write("\n");
      out.write("    $(\"#myModalDiv\").html(data).fadeIn();\n");
      out.write("\n");
      out.write("});\n");
      out.write("        //Put the code from above here.\n");
      out.write("\n");
      out.write("    });\n");
      out.write("                                });\n");
      out.write("  \n");
      out.write("                                    });\n");
      out.write("                                    \n");
      out.write("                           \n");
      out.write("                    </script>\n");
      out.write("        \n");
      out.write("                          \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    <script>\n");
      out.write("function clickCounter() {\n");
      out.write("  if (typeof(Storage) !== \"undefined\") {\n");
      out.write("    if (localStorage.clickcount) {\n");
      out.write("      localStorage.clickcount = Number(localStorage.clickcount)+1;\n");
      out.write("    } else {\n");
      out.write("      localStorage.clickcount = 1;\n");
      out.write("    }\n");
      out.write("       document.getElementByClassName(\"button\").onclick = GFG_click;\n");
      out.write("            \n");
      out.write("              \n");
      out.write("            function GFG_click() {\n");
      out.write("             \n");
      out.write(" \n");
      out.write("            document.getElementByTagName(\"span\").id = this.id;\n");
      out.write("            $('#id').find('span').each(function(){\n");
      out.write("    var innerDivId = $(this).attr('id');\n");
      out.write("});\n");
      out.write("document.getElementByTagName(\"span\").innerHTML = localStorage.clickcount;\n");
      out.write(" \n");
      out.write("        }\n");
      out.write("    \n");
      out.write("    document.getElementByTagName(\"span\").innerHTML = localStorage.clickcount;\n");
      out.write("  } else {\n");
      out.write("    document.getElementById(\"span\").innerHTML = \"Sorry, your browser does not support web storage...\";\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</script>\n");
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
