package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class addjob_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("<title>WELCOME ADMIN! </title>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<br/>\n");
      out.write("<form name=\"myForms\"  method=\"post\">\n");
      out.write("<input type=\"text\" name=\"mytext\" />\n");
      out.write("<input type=\"submit\" name=\"Submit\" value=\"Submit name\" />\n");
      out.write("</form>\n");
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
      out.write("            <form action=\"myForm\" name=\"myForms1\" >\n");
      out.write("                <label>Job Description:</label> <input type=\"text\" name=\"desp\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <br/><br/>\n");
      out.write("                <label>Company Name:</label> <input type=\"text\" name=\"company_name\"/>\n");
      out.write("                <br/><br/>\n");
      out.write("                <label>Job Location:</label> <input type=\"text\" name=\"job_location\"/>\n");
      out.write("                <br /><br/>\n");
      out.write("                <label>Minimum Experience Required:</label> <input type=\"text\" name=\"exp_reqd\"/>\n");
      out.write("                <br /> <br /> \n");
      out.write("                <label>Salary Insights:</label> <input type=\"text\" name=\"salary\"/>\n");
      out.write("                <br /> <br /> \n");
      out.write("                <label>Last Date to Apply:</label> <input type=\"text\" name=\"deadline\" placeholder=\"DD/MM/YYYY\" />\n");
      out.write("                <br /> <br /> \n");
      out.write("                <label>Link to Apply:</label> <input type=\"text\" name=\"link_apply\"/>\n");
      out.write("                <br/><br/>\n");
      out.write("                <input type=\"submit\" class=\"btn btn-default\" value=\"Post Job\" name=\"btn_add_job\"/>\n");
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
