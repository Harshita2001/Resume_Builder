package org.apache.jsp.Template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.security.interfaces.RSAKey;
import java.sql.*;
import java.io.*;

public final class Resume3_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
    Statement stmt1=conn.createStatement();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"http://yui.yahooapis.com/2.7.0/build/reset-fonts-grids/reset-fonts-grids.css\" media=\"all\" /> \r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"resume.css\" media=\"all\" />\r\n");
      out.write("\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.9.2/html2pdf.bundle.js\"></script> \r\n");
      out.write("         <script src=\"https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.9.2/html2pdf.bundle.js\"></script>\r\n");
      out.write("         <style>\r\n");
      out.write("         .button {\r\n");
      out.write("  background-color: #4CAF50;\r\n");
      out.write("  border: none;\r\n");
      out.write("  color: white;\r\n");
      out.write("  padding: 15px 32px;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  font-size: 16px;\r\n");
      out.write("  margin: 4px 2px;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("         </style>\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("  font-family: Arial;\r\n");
      out.write("  color: white;\r\n");
      out.write("   max-width: 500px;\r\n");
      out.write("  height: 100px;\r\n");
      out.write("}\r\n");
      out.write("h2 {\r\n");
      out.write("    font-size: 2rem;\r\n");
      out.write("  text-transform: capitalize;\r\n");
      out.write("  color: brown;\r\n");
      out.write("  font-family: serif;\r\n");
      out.write("}\r\n");
      out.write(".split {\r\n");
      out.write("  height: 100%;\r\n");
      out.write("  width: 34%;\r\n");
      out.write("  position: fixed;\r\n");
      out.write("  z-index: 1;\r\n");
      out.write("  top: 0;\r\n");
      out.write("  overflow-x: hidden;\r\n");
      out.write("  padding-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".left {\r\n");
      out.write("  left: 0;\r\n");
      out.write("  background-color: #A1A6B2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".right {\r\n");
      out.write("  right: 0;\r\n");
      out.write("  height: 100%;\r\n");
      out.write("  width: 66%;\r\n");
      out.write("  position: fixed;\r\n");
      out.write("  z-index: 1;\r\n");
      out.write("  top: 0;\r\n");
      out.write("  overflow-x: hidden;\r\n");
      out.write("  color: #000;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".centered {\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  top: 50%;\r\n");
      out.write("  left: 50%;\r\n");
      out.write("  transform: translate(-50%, -50%);\r\n");
      out.write("  text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\" max-width: 400px; height: 100px;\">\r\n");
      out.write("    <br/><br/>\r\n");
      out.write("    <button id=\"download\" class=\"button\" style=\"color: blue; background:white;\"><i class=\"fa fa-download\" style=\"color: blue\"></i>&nbsp;&nbsp;DOWNLOAD</button>\r\n");
      out.write(" <input type=\"submit\" formtarget=\"../resume_det.jsp\" onclick=\"window.location.href='../resume_det.jsp'\" name=\"submit2\" value=\"edit details\" class=\"button button-primary float-right\" />\r\n");
      out.write("    \r\n");

                        
                    try
                        {
                            String mail = session.getAttribute("userId").toString();
        
                            String query1="Select * from PERSONAL where UEMAIL='"+mail+"' " ;
                            ResultSet rs=stmt1.executeQuery(query1);
                            
                            while(rs.next()==true)
                            {
                               
      out.write("\r\n");
      out.write("        \r\n");
      out.write(" <div id=\"inout\">\r\n");
      out.write("\t<div id=\"inner\" class=\"split left\">\r\n");
      out.write("            \r\n");
      out.write("\t\t<div id=\"hd\"><center>\r\n");
      out.write("\t\t\t<div class=\"yui-gc\">\r\n");
      out.write("\t\t\t\t<div class=\"yui-u first\">\r\n");
      out.write("                                    <h1 style=\" font-family: Pristinia; font-size: 40px;\">");
      out.print(rs.getString("UFNAME") );
      out.write("&nbsp;&nbsp; ");
      out.print(rs.getString("ULNAME") );
      out.write("</h1>\r\n");
      out.write("\t\t<i class=\"fas fa-home\"></i>  &nbsp;&nbsp");
      out.print(rs.getString("UADDRESS") );
      out.write(" &nbsp;&nbsp;");
      out.print(rs.getString("UZIPCODE") );
      out.write("&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t");
      out.print(rs.getString("UCOUNTRY") );
      out.write("<br/><br/>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"yui-u\">\r\n");
      out.write("\t\t\t\t\t<div class=\"contact-info\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-envelope\"></i> &nbsp;&nbsp");
      out.print(rs.getString("UEMAIL") );
      out.write("<br/><br/>\r\n");
      out.write("                                                <i class=\"fas fa-phone\"></i> &nbsp;&nbsp");
      out.print(rs.getString("UCONTACT") );
      out.write("\r\n");
      out.write("\t\t\t\t\t</div><!--// .contact-info -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div><!--// .yui-gc -->\r\n");
      out.write("                        </center>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"bd\">\r\n");
      out.write("\t\t\t<div id=\"yui-main\">\r\n");
      out.write("\t\t\t\t<div class=\"yui-b\">\r\n");
      out.write("                                    \r\n");
      out.write("\t\t\t\t\t<div class=\"yui-gf\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"yui-u first\">\r\n");
      out.write("                                                    &nbsp;&nbsp;&nbsp;<h2>&nbsp;&nbsp;&nbsp;Profile</h2>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("                                            <center>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"yui-u\">\r\n");
      out.write("                                                    <p class=\"enlarge\" style=\"width: 500px;\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(rs.getString("USUM") );
      out.write("\r\n");
      out.write("                                                        </p>\r\n");
      out.write("                                                </div></center>\r\n");
      out.write("\t\t\t\t\t</div><!--// .yui-gf --> \r\n");
      out.write("\r\n");
      out.write("                                </div></div></div>\r\n");
      out.write("                  ");
 }
                            int l = 0;
                            String query5="Select * from SKILLS  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query5);
                             if(rs.next()==true){ 
                                                                        
      out.write("\r\n");
      out.write("                                 <div class=\"yui-gf\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"yui-u first\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>&nbsp;&nbsp;&nbsp;Skills</h2>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("                                      \r\n");
      out.write("\t\t\t\t\t\t<div class=\"yui-u\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"talent\">\r\n");
      out.write("                                                                    <li>&nbsp;&nbsp;&nbsp;&nbsp;");
      out.print(rs.getString("SK") );
      out.write("</li>\r\n");
      out.write("                            \r\n");
      out.write("                                 ");

                            while(rs.next()==true)
                            {
                                
      out.write("\r\n");
      out.write("                                     \r\n");
      out.write("                                <li>&nbsp;&nbsp;&nbsp;&nbsp;");
      out.print(rs.getString("SK") );
      out.write("</li>\r\n");
      out.write("\r\n");
      out.write("                                      \r\n");
      out.write("                                        ");

                           l++;
                            } 
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\t\t\t\t\t</div><!--// .yui-gf -->\r\n");
      out.write("                </div></div><!--// hd -->\r\n");
      out.write("                                ");
 }

      out.write("\r\n");
      out.write("                                \r\n");
      out.write("<div class=\"split right\" id=\"df1\">\t\t\r\n");
      out.write("          \r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("                           \r\n");
      out.write("  ");
  
                                       
                            
                            int i = 0;
                            String query2="Select * from WORKEX  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query2);
                              if(rs.next()==true){ 
                                
      out.write("\r\n");
      out.write("                         <div class=\"yui-gf\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"yui-u first\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>&nbsp;&nbsp;&nbsp;Experience</h2>\r\n");
      out.write("\t\t\t\t\t\t</div><!--// .yui-u -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"yui-u\">\r\n");
      out.write("                                                      <div class=\"job\">\r\n");
      out.write("                \r\n");
      out.write("                  <h3>&nbsp;&nbsp;&nbsp;&nbsp;");
      out.print(rs.getString("UPOSITION") );
      out.write("</h3>\r\n");
      out.write("                 <h3>&nbsp;&nbsp;&nbsp;&nbsp;");
      out.print(rs.getString("UCOMPANY") );
      out.write("</h3>\r\n");
      out.write("                 <h4>&nbsp;&nbsp;&nbsp;&nbsp;Start Date - End Date:&nbsp;&nbsp; ");
      out.print(rs.getString("USTART") );
      out.write(" - ");
      out.print(rs.getString("UEND") );
      out.write("</h4> \r\n");
      out.write("                   \r\n");
      out.write("                    <p>\r\n");
      out.write("                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("\r\n");
      out.write("                    </p>\r\n");
      out.write("<br/></div>\r\n");
      out.write("                          ");
  while(rs.next()==true)
                            {


      out.write("\r\n");
      out.write("                <div class=\"job\">\r\n");
      out.write("                \r\n");
      out.write("            <h3>&nbsp;&nbsp;&nbsp;&nbsp;");
      out.print(rs.getString("UPOSITION") );
      out.write("</h3>\r\n");
      out.write("                 <h3>&nbsp;&nbsp;&nbsp;&nbsp;");
      out.print(rs.getString("UCOMPANY") );
      out.write("</h3>\r\n");
      out.write("                 <h4>&nbsp;&nbsp;&nbsp;&nbsp;Start Date - End Date:&nbsp;&nbsp;");
      out.print(rs.getString("USTART") );
      out.write(" - ");
      out.print(rs.getString("UEND") );
      out.write("</h4> \r\n");
      out.write("                   \r\n");
      out.write("                    <p>\r\n");
      out.write("                      &nbsp;&nbsp;&nbsp;&nbsp;  ");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("\r\n");
      out.write("                    </p>\r\n");
      out.write("<br/></div>\r\n");
      out.write("                  \r\n");
      out.write("        ");
 
                                 i++;
                            }
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div> </center>\r\n");
      out.write("\t\t\t\t\t</div>  \r\n");
      out.write("  ");
 
                              }  
                            
                            int ll = 0;
                            String queryl="Select * from PROJECT  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(queryl);
                             if(rs.next()==true){ 
                                
      out.write("\r\n");
      out.write("                                <hr style=\"width: 90%;\">   <div class=\"yui-gf\"><div class=\"yui-u first\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>&nbsp;&nbsp;&nbsp;Projects</h2>\r\n");
      out.write("\t\t\t\t\t\t</div><!--// .yui-u -->\r\n");
      out.write("                                                <div class=\"yui-u\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"job\">\r\n");
      out.write("                                                               \r\n");
      out.write("                                                             <h3>&nbsp;&nbsp;&nbsp;&nbsp;");
      out.print(rs.getString("PNAME") );
      out.write("</h3>\r\n");
      out.write("                 <h4>&nbsp;&nbsp;&nbsp;&nbsp;");
      out.print(rs.getString("USTART") );
      out.write(" - ");
      out.print(rs.getString("UEND") );
      out.write("</h4> \r\n");
      out.write("                   \r\n");
      out.write("                    <p>\r\n");
      out.write("                      &nbsp;&nbsp;&nbsp;&nbsp;  ");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("\r\n");
      out.write("                    </p>\r\n");
      out.write("<br/>\r\n");
      out.write("                           ");
 while(rs.next()==true)
                            {


      out.write("\r\n");
      out.write("                \r\n");
      out.write("                    <h3>&nbsp;&nbsp;&nbsp;&nbsp;");
      out.print(rs.getString("PNAME") );
      out.write("</h3>\r\n");
      out.write("                 <h4>&nbsp;&nbsp;&nbsp;&nbsp;Start Date - End Date:&nbsp;&nbsp;");
      out.print(rs.getString("USTART") );
      out.write(" - ");
      out.print(rs.getString("UEND") );
      out.write("</h4> \r\n");
      out.write("                   \r\n");
      out.write("                    <p>\r\n");
      out.write("                       &nbsp;&nbsp;&nbsp;&nbsp; ");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("\r\n");
      out.write("                    </p>\r\n");
      out.write("<br/>\r\n");
      out.write("                  \r\n");
      out.write("        ");
 
                                 ll++;
                            }
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div></div> \r\n");
      out.write("                                </div></hr>\r\n");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                                                ");

                         int k = 0;
                            String query4="Select * from EDUCATION  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query4);
                             if(rs.next()==true){ 
                                
      out.write("\r\n");
      out.write("                            <hr style=\"width: 90%;\">     <div class=\"yui-gf\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"yui-u first\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>&nbsp;&nbsp;&nbsp;Education</h2>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"yui-u\">\r\n");
      out.write("                                                     <h3> &nbsp;&nbsp;&nbsp;&nbsp;");
      out.print(rs.getString("UPROGRAM") );
      out.write("</h3>\r\n");
      out.write("                        <h3> &nbsp;&nbsp;&nbsp;&nbsp;");
      out.print(rs.getString("UINSTITUTE") );
      out.write("</h3>\r\n");
      out.write("                         &nbsp;&nbsp;&nbsp;&nbsp;Start Date: ");
      out.print(rs.getString("USTART") );
      out.write("\r\n");
      out.write("                             &nbsp;&nbsp;&nbsp;&nbsp;End Date:     ");
      out.print(rs.getString("UEND") );
      out.write("<br/><br/>\r\n");
      out.write("                          &nbsp;&nbsp;&nbsp;&nbsp;Marks:        ");
      out.print(rs.getString("UCGPA") );
      out.write("<br/>\r\n");
      out.write("                         \r\n");
      out.write("                                ");
 
                            while(rs.next()==true)
                            {
                                
      out.write("\r\n");
      out.write("                       \r\n");
      out.write("                        &nbsp;&nbsp;&nbsp;&nbsp; <h3>&nbsp;&nbsp;&nbsp;&nbsp;");
      out.print(rs.getString("UPROGRAM") );
      out.write("</h3>\r\n");
      out.write("                         <h3>&nbsp;&nbsp;&nbsp;&nbsp;");
      out.print(rs.getString("UINSTITUTE") );
      out.write("</h3>\r\n");
      out.write("                        &nbsp;&nbsp;&nbsp;&nbsp; Start Date: ");
      out.print(rs.getString("USTART") );
      out.write("\r\n");
      out.write("                          &nbsp;&nbsp;&nbsp;&nbsp;   End Date:     ");
      out.print(rs.getString("UEND") );
      out.write("<br/><br/>\r\n");
      out.write("                        &nbsp;&nbsp;&nbsp;&nbsp;  Marks:        ");
      out.print(rs.getString("UCGPA") );
      out.write("<br/>\r\n");
      out.write("                         ");

                           k++;
                            }
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div> \r\n");
      out.write("                            </div> \r\n");
      out.write("                            ");
 } 
      out.write("\r\n");
      out.write("                            <br/>\r\n");
      out.write("                           <hr style=\"width: 90%;\">\r\n");
      out.write("                             <section id=\"professional-experience3\">\r\n");
      out.write("          <h2>&nbsp;&nbsp;&nbsp;Certifications</h2>\r\n");
      out.write("          ");
  
                 int j = 0;
                            String queryj="Select * from CERTIFICATE  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(queryj);
                              if(rs.next()==true){ 
                                
      out.write("\r\n");
      out.write("                                \r\n");
      out.write("          <section\r\n");
      out.write("            itemprop=\"memberOf\"\r\n");
      out.write("            itemscope\r\n");
      out.write("            itemtype=\"http://schema.org/Organization\"\r\n");
      out.write("            class=\"position reactjs html css javascript kotlin a11y less api\"\r\n");
      out.write("          >\r\n");
      out.write("            <h3>\r\n");
      out.write("              <span itemprop=\"name\">&nbsp;&nbsp;&nbsp;");
      out.print(rs.getString("UCERTI") );
      out.write("</span>\r\n");
      out.write("              </h3>\r\n");
      out.write("            \r\n");
      out.write("              <p>\r\n");
      out.write("                &nbsp;&nbsp;&nbsp;");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("\r\n");
      out.write("              </p>\r\n");
      out.write("             \r\n");
      out.write("                          ");
  while(rs.next()==true)
                            {


      out.write("\r\n");
      out.write("  <h3>\r\n");
      out.write("              <span itemprop=\"name\">&nbsp;&nbsp;&nbsp;");
      out.print(rs.getString("UCERTI") );
      out.write("</span>\r\n");
      out.write("              </h3>\r\n");
      out.write("            \r\n");
      out.write("              <p>\r\n");
      out.write("                  &nbsp;&nbsp;&nbsp;");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("</p>\r\n");
      out.write("              \r\n");
      out.write("                ");
 
                                 j++;
                            }
      out.write("\r\n");
      out.write("                          \r\n");
      out.write("          </section>\r\n");
 }

      out.write("</section>\r\n");
      out.write(" ");
  
                                       
                         int M = 0;
                            String query6="Select * from LANGUAGE  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query6);
                              if(rs.next()==true){ 
                                
      out.write("\r\n");
      out.write("                         <hr style=\"width: 90%;\">     <div class=\"yui-gf\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"yui-u first\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>&nbsp;&nbsp;&nbsp;Languages</h2>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("                                 \r\n");
      out.write("\t\t\t\t\t\t<div class=\"yui-u\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"talent\">\r\n");
      out.write("                                                            <li>&nbsp;&nbsp;&nbsp;&nbsp;");
      out.print(rs.getString("ULANGUAGE") );
      out.write("</li>\r\n");
      out.write("                       ");
   while(rs.next()==true)
                            {
                                
      out.write("\r\n");
      out.write("                                     \r\n");
      out.write("\t\t\t\t\t\t\t\t<li>&nbsp;&nbsp;&nbsp;&nbsp;");
      out.print(rs.getString("ULANGUAGE") );
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t\t\t ");

                           M++;
                            }
                                                         
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("                                                </div> \r\n");
      out.write("\t\t\t\t\t</div><!--// .yui-gf-->\r\n");
      out.write("                            ");
 }
                              
                         int jp = 0;
                            String query3="Select * from UHOBBY  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query3);
                             if(rs.next()==true){ 
                                
      out.write("\r\n");
      out.write("                               <br/> <hr style=\"width: 90%;\">   <div class=\"yui-gf last\">\r\n");
      out.write("                    <h2>&nbsp;&nbsp;&nbsp;Hobbies</h2>\r\n");
      out.write("                   <ul> <div class=\"yui-u\">\r\n");
      out.write("                                <li> &nbsp;&nbsp;&nbsp;</i> &nbsp;&nbsp;&nbsp;");
      out.print(rs.getString("UINTREST") );
      out.write(" </li>\r\n");
      out.write("                        </div>\r\n");
      out.write("                          ");
 
                          while(rs.next()==true)
                            {
                                
      out.write("\r\n");
      out.write("                                 <div class=\"yui-u\">\r\n");
      out.write("                                <li> &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;");
      out.print(rs.getString("UINTREST") );
      out.write(" </li>\r\n");
      out.write("                        </div>\r\n");
      out.write("                   \r\n");
      out.write("                                ");

                           jp++;
                            }
      out.write("\r\n");
      out.write("</ul>\r\n");
      out.write("                               </div>\r\n");
 } 
      out.write("\r\n");
      out.write("  <br/><hr style=\"width: 90%;\">  </div><!--// .yui-b -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("  \r\n");
      out.write("    ");

                        }
                        catch(Exception ex)
                        {
                            ex.printStackTrace();
                        }
                  
                    
      out.write("\r\n");
      out.write(" </div>              \r\n");
      out.write("  <script>\r\n");
      out.write("    window.onload = function () {\r\n");
      out.write("    document.getElementById(\"download\")\r\n");
      out.write("        .addEventListener(\"click\", () => {\r\n");
      out.write("            const row1 = this.document.getElementById(\"inout\");\r\n");
      out.write("            console.log(row1);\r\n");
      out.write("            console.log(window);\r\n");
      out.write("            \r\n");
      out.write("            html2pdf().from(row1).save();\r\n");
      out.write("        })\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>                                \r\n");
      out.write("</body>\r\n");
      out.write("</html> \r\n");
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
