package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("     <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@10.10.1/dist/sweetalert2.all.min.js\"></script>\n");
      out.write("        <link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/sweetalert2@10.10.1/dist/sweetalert2.min.css'>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("<title>WELCOME ADMIN! </title>\n");
      out.write("<style>\n");
      out.write("form { width: 500px; }\n");
      out.write("input[type=text] { float:left ; width: 200px; }\n");
      out.write("input[type=file] { float:left ; width: 200px; }\n");
      out.write("label { float: left; width: 300px; }\n");
      out.write(".clear { clear: both; height: 0; line-height: 0; }\n");
      out.write(".floatright { float: right; }\n");
      out.write("table, th, td {\n");
      out.write("            border: 2px solid black;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("        }\n");
      out.write("        th, td {\n");
      out.write("            padding: 15px;\n");
      out.write("        }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write(".button {\n");
      out.write("  background-color: #4CAF50; /* Green */\n");
      out.write("  border: none;\n");
      out.write("  color: white;\n");
      out.write("  padding: 15px 32px;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: inline-block;\n");
      out.write("  font-size: 16px;\n");
      out.write("  border-radius: 12px;\n");
      out.write("  padding: 14px 40px;\n");
      out.write("  display: block;\n");
      out.write("  width: 40%;\n");
      out.write("}\n");
      out.write(".button:hover {\n");
      out.write("  box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("  background-image: url(images/w.jpeg);\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  background-position: center;\n");
      out.write("   background-size:100% 100%;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write(" <script type = \"text/javascript\" >  \n");
      out.write("    function preventBack() { window.history.forward(); }  \n");
      out.write("    setTimeout(\"preventBack()\", 0);  \n");
      out.write("    window.onunload = function () { null };  \n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("        \n");
      out.write("    <div style=\"text-align: center;  font-size: 40px; color: #2b0c62; padding-top: 60px;\">\n");
      out.write("        <div style=\"font-weight: normal; font-family: 'Ultra', sans-serif; font-size: 32px; line-height: 42px; \n");
      out.write("             text-transform: uppercase; text-align: center;\">\n");
      out.write("            <b>WELCOME ADMIN!</b>\n");
      out.write("            <div style=\"float:right; margin-top: -60px; font-size: 20px; text-shadow: 0 5px 5px rgba(0,0,0,0.2); color: black;\">\n");
      out.write("      \n");
      out.write("                    <div>\n");
      out.write("                        <a class=\"nav-link\" href=\"getstarted.jsp\" style=\"color:black;\"> <span class=\"fa fa-user-plus \" ></span> Logout</a>\n");
      out.write("                   \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("    </div> \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    <center>\n");
      out.write("        <p style=\"padding-top: 10px; color: #2b0c62; font-size: 20px; font-family: serif; font-weight: bold; \">\n");
      out.write("            <b>Choose any of the following options</b></p> \n");
      out.write("\n");
      out.write("\n");
      out.write("        <br> <br> \n");
      out.write("    <input type=\"submit\" class=\"button\" data-toggle=\"modal\" data-target=\"#myModaladdtemplate\" value=\"ADD TEMPLATE\" id=\"btn_addtemplate\"/>\n");
      out.write("\n");
      out.write("    <div class=\"modal fade\" id=\"myModaladdtemplate\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("       Modal content\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <h4 class=\"modal-title\"><b>ADD TEMPLATE</b></h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("            <form action=\"Add_Template_Servlet\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("                <label for=\"txtname\">Template Name:</label> <input type=\"text\" name=\"txtname\"/>\n");
      out.write("                <br/> <br />\n");
      out.write("                <label for=\"img\">Upload Template:</label> <input type=\"file\" name=\"img\"/>\n");
      out.write("                <br /> <br />\n");
      out.write("                <input type=\"submit\" class=\"btn btn-default\" value=\"Add Template\" name=\"btn_add\" />\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("    <input type=\"submit\" class=\"button\" data-toggle=\"modal\" data-target=\"#myModalviewdeltemplate\" value=\"VIEW / DELETE TEMPLATE\" id=\"btn_view_del_template\"/>\n");
      out.write("    \n");
      out.write("    <div class=\"modal fade\" id=\"myModalviewdeltemplate\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("       Modal content\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <h4 class=\"modal-title\"><b>VIEW / DELETE TEMPLATE</b></h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("            ");

        try{
    
                    
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
        Statement stmt1=conn.createStatement();
        ResultSet rs=stmt1.executeQuery("select NAME from TEMPLATE");
       
      out.write("\n");
      out.write("        \n");
      out.write("       <table>\n");
      out.write("        <br>\n");
      out.write("        <tr><td><b>TEMPLATE NAME</b></td><td><b>VIEW TEMPLATE</b></td><td><b>DELETE TEMPLATE</b></td></tr>\n");
      out.write("\t");

        while(rs.next())
        {
            out.print("<tr>");
            out.print("<td>"+rs.getString(1) +"</td>");
            out.print("<td><a href='View.jsp?NAME="+rs.getString(1)+"'>View Template</a></td>");
            out.println("<td><a href='Delete.jsp?NAME="+rs.getString(1)+"'>Delete Template</a></td>");
            out.print("</tr>");
                    
        }  
}
  catch(Exception ex){
          out.println(ex);
    }
        
      out.write("  </table>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("        \n");
      out.write("    <br>    \n");
      out.write("\n");
      out.write("    <input type=\"submit\" class=\"button\" data-toggle=\"modal\" data-target=\"#myModalviewusers\" value=\"VIEW USERS\" id=\"btn_view_users\" />\n");
      out.write("        \n");
      out.write("    <div class=\"modal fade\" id=\"myModalviewusers\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("     \n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <h4 class=\"modal-title\"><b>VIEW USERS</b></h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("            \n");
      out.write("        \n");
      out.write("        ");

    try
    {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery("select EMAIL, NAME from USER1");
        out.print("<center>");
        out.print("<table>");
        out.print("<tr>");
        out.print("<td><b>EMAIL ID</b></td><td><b>NAME</b></td>" );
        out.print("</tr>");
        while(rs.next())
        {

            out.print("<tr>");
            out.print("<td>"+ rs.getString(1)+ "</td><td>" + rs.getString(2)+ "</td>" );
            out.print("</tr>");

        }
        out.print("</table>");
        out.print("</center>");
        conn.close();
        
    }
    catch(Exception ex)
        {ex.printStackTrace();}

      out.write("\n");
      out.write("       \n");
      out.write("\t\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("   \n");
      out.write("<br>\n");
      out.write("\n");
      out.write("    <input type=\"submit\" class=\"button\" data-toggle=\"modal\" data-target=\"#myModaladdjob\" value=\"ADD JOB\" id=\"btn_addjob\"/>\n");
      out.write("\n");
      out.write("    <div class=\"modal fade\" id=\"myModaladdjob\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("       Modal content\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <h4 class=\"modal-title\"><b>ADD JOB</b></h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("            <form action=\"myForm\" id=\"fmjob\">\n");
      out.write("                <label>Job Description:</label> <input type=\"text\" name=\"desp\">\n");
      out.write("          <br/><br/>\n");
      out.write("                <label>Company Name:</label> <input type=\"text\" name=\"company_name\">\n");
      out.write("                <br/><br/>\n");
      out.write("                <label>Job Location:</label> <input type=\"text\" name=\"job_location\">\n");
      out.write("                <br /><br/>\n");
      out.write("                <label>Minimum Experience Required:</label> <input type=\"text\" name=\"exp_reqd\">\n");
      out.write("                <br /> <br /> \n");
      out.write("                <label>Salary Insights:</label> <input type=\"text\" name=\"salary\">\n");
      out.write("                <br /> <br /> \n");
      out.write("                <label>Last Date to Apply:</label> <input type=\"text\" name=\"deadline\" placeholder=\"DD/MM/YYYY\" >\n");
      out.write("                <br /> <br /> \n");
      out.write("                <label>Link to Apply:</label> <input type=\"text\" name=\"link_apply\">\n");
      out.write("                <br/><br/>\n");
      out.write("                <input type=\"submit\" class=\"btn btn-default\" value=\"Post Job\" name=\"btn_add_job\">\n");
      out.write("                <br />\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("    <input type=\"submit\" class=\"button\" data-toggle=\"modal\" data-target=\"#myModalviewdeljob\" value=\"VIEW / DELETE JOB\" id=\"btn_view_del_job\"/>\n");
      out.write("\n");
      out.write("   <div class=\"modal fade\" id=\"myModalviewdeljob\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("       Modal content\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <h4 class=\"modal-title\"><b>JOB DETAILS</b></h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("            ");

                try
                {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata"); 
                    PreparedStatement pst = conn.prepareStatement("select JOB_ID, JOB_DESCRIPTION, DEADLINE  from JOB ") ; 
                    ResultSet rst = pst.executeQuery();
                    out.print("<table>");
                    out.print("<tr><td><b>JOB DESCRIPTION</b></td><td><b>DEADLINE</b></td><td><b>DELETE JOB</b></td></tr>");
                    while(rst.next())
                    {
                        out.print("<tr>");
                        out.print("<td>"+rst.getString(2) +"</td>");
                        out.print("<td>"+rst.getString(3) +"</td>");
                        String JID = String.valueOf(rst.getInt(1));
                        out.println("<td><a href='DeleteJob.jsp?ID="+JID+" '>Delete</a></td>");
                        out.print("</tr>");
                    }
                    out.print("</table>");
                    conn.close();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                     
                
            
      out.write("\n");
      out.write("          \n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("            \n");
      out.write("             <br>\n");
      out.write("\n");
      out.write("<input type=\"submit\" class=\"button\" data-toggle=\"modal\" data-target=\"#myModalviewquery\" value=\"VIEW QUERIES\" id=\"btn_view_queries\"/>\n");
      out.write("    \n");
      out.write("    <div class=\"modal fade\" id=\"myModalviewquery\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("       Modal content\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <h4 class=\"modal-title\"><b>VIEW QUERIES</b></h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("            ");

                try
                {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata"); 
                    PreparedStatement pst = conn.prepareStatement("select EMAIL, MESSAGE  from GET_IN_TOUCH ") ; 
                    ResultSet rst = pst.executeQuery();
                    out.print("<html><body>");
                    out.print("<table>");
                    out.print("<tr><td><b>EMAIL ID</b></td><td><b>QUERY</b></td></tr>");
                    while(rst.next())
                    {
                        out.print("<tr>");
                        out.print("<td>"+rst.getString(1) +"</td>");
                        out.print("<td>"+rst.getString(2) +"</td>");
                        out.print("</tr>");
                    }
                    out.print("</table>");
                    out.print("</body></html>");
                    conn.close();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                     
                
            
      out.write("\n");
      out.write("          \n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</center>\n");
      out.write("        \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write(" \n");
      out.write("    \n");
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
