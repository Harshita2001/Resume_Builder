package org.apache.jsp.Template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.security.interfaces.RSAKey;
import java.sql.*;
import java.io.*;

public final class temp2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\t<title>Your Resume</title>\r\n");
      out.write("\t<meta http-equiv=\"content-type\" content=\"text/html;\" charset=\"utf-8\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("\t<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("\t<meta name=\"description\" content=\"\" />\r\n");
      out.write(" <script src=\"https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.9.2/html2pdf.bundle.js\"></script> \r\n");
      out.write("         <script src=\"https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.9.2/html2pdf.bundle.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"http://yui.yahooapis.com/2.7.0/build/reset-fonts-grids/reset-fonts-grids.css\" media=\"all\" /> \r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"resume.css\" media=\"all\" />\r\n");
      out.write("<style>\r\n");
      out.write(" \r\n");
      out.write(".msg { padding: 10px; background: #222; position: relative; }\r\n");
      out.write(".msg h1 { color: #fff;  }\r\n");
      out.write("\r\n");
      out.write("/* //-- yui-grids style overrides -- */\r\n");
      out.write("body { font-family: Georgia; color: #444; }\r\n");
      out.write("#inner { padding: 10px 80px; margin: 80px auto; background: #f5f5f5; border: solid #666; border-width: 8px 0 2px 0; }\r\n");
      out.write(".yui-gf { margin-bottom: 2em; padding-bottom: 2em; border-bottom: 1px solid #ccc; }\r\n");
      out.write("\r\n");
      out.write("/* //-- header, body, footer -- */\r\n");
      out.write("#hd { margin: 2.5em 0 3em 0; padding-bottom: 1.5em; border-bottom: 1px solid #ccc }\r\n");
      out.write("#hd h2 { text-transform: uppercase; letter-spacing: 2px; }\r\n");
      out.write("#bd, #ft { margin-bottom: 2em; }\r\n");
      out.write("\r\n");
      out.write("/* //-- footer -- */\r\n");
      out.write("#ft { padding: 1em 0 5em 0; font-size: 92%; border-top: 1px solid #ccc; text-align: center; }\r\n");
      out.write("#ft p { margin-bottom: 0; text-align: center;   }\r\n");
      out.write("\r\n");
      out.write("/* //-- core typography and style -- */\r\n");
      out.write("#hd h1 { font-size: 48px; text-transform: uppercase; letter-spacing: 3px; }\r\n");
      out.write("h2 { font-size: 152% }\r\n");
      out.write("h3, h4 { font-size: 122%; }\r\n");
      out.write("h1, h2, h3, h4 { color: #333; }\r\n");
      out.write("p { font-size: 100%; line-height: 18px; padding-right: 3em; }\r\n");
      out.write("strong { font-weight: bold; }\r\n");
      out.write("li { line-height: 24px; border-bottom: 1px solid #ccc; }\r\n");
      out.write("p.enlarge { font-size: 144%; padding-right: 6.5em; line-height: 24px; }\r\n");
      out.write("p.enlarge span { color: #000 }\r\n");
      out.write(".contact-info { margin-top: 7px; }\r\n");
      out.write(".first h2 { font-style: italic; }\r\n");
      out.write(".last { border-bottom: 0 }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".job { position: relative; margin-bottom: 1em; padding-bottom: 1em; border-bottom: 1px solid #ccc; }\r\n");
      out.write(".job h4 { position: absolute; top: 0.35em; right: 0 }\r\n");
      out.write(".job p { margin: 0.75em 0 3em 0; }\r\n");
      out.write("\r\n");
      out.write(".last { border: none; }\r\n");
      out.write(".skills-list {  }\r\n");
      out.write(".skills-list ul { margin: 0; }\r\n");
      out.write(".skills-list li { margin: 3px 0; padding: 3px 0; }\r\n");
      out.write(".skills-list li span { font-size: 152%; display: block; margin-bottom: -2px; padding: 0 }\r\n");
      out.write(".talent { width: 32%; float: left }\r\n");
      out.write(".talent h2 { margin-bottom: 6px; }\r\n");
      out.write("\r\n");
      out.write("#srt-ttab { margin-bottom: 100px; text-align: center;  }\r\n");
      out.write("#srt-ttab img.last { margin-top: 20px }\r\n");
      out.write("\r\n");
      out.write("/* --// override to force 1/8th width grids -- */\r\n");
      out.write(".yui-gf .yui-u{width:80.2%;}\r\n");
      out.write(".yui-gf div.first{width:12.3%;}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("    <style>\r\n");
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
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("<!-- REMOVE -->\r\n");
      out.write("<br/><br/>\r\n");
      out.write(" <button id=\"download\" class=\"button\" style=\"color: blue; background:white;\"><i class=\"fa fa-download\" style=\"color: blue\"></i>&nbsp;&nbsp;DOWNLOAD</button>\r\n");
      out.write(" <input type=\"submit\" formtarget=\"../resume_det.jsp\" onclick=\"window.location.href='../resume_det.jsp'\" name=\"submit2\" value=\"edit details\" class=\"button button-primary float-right\" />\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<div id=\"doc2\" class=\"yui-t\">\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\t\r\n");

                        
                    try
                        {
                            String mail = session.getAttribute("userId").toString();
        
                            String query1="Select * from PERSONAL where UEMAIL='"+mail+"' " ;
                            ResultSet rs=stmt1.executeQuery(query1);
                            
                            while(rs.next()==true)
                            {
                               
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"inner\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div id=\"hd\">\r\n");
      out.write("\t\t\t<div class=\"yui-gc\">\r\n");
      out.write("\t\t\t\t<div class=\"yui-u first\">\r\n");
      out.write("                                    <h1>");
      out.print(rs.getString("UFNAME") );
      out.write("&nbsp;&nbsp; ");
      out.print(rs.getString("ULNAME") );
      out.write("</h1>\r\n");
      out.write("\t\t\t\t\t<h4>");
      out.print(rs.getString("UADDRESS") );
      out.write(" &nbsp;&nbsp;");
      out.print(rs.getString("UZIPCODE") );
      out.write("</h4>\r\n");
      out.write("\t\t\t\t<h5>");
      out.print(rs.getString("UCOUNTRY") );
      out.write("</h5>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"yui-u\">\r\n");
      out.write("\t\t\t\t\t<div class=\"contact-info\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-envelope\"></i><h3><a href=\"\">");
      out.print(rs.getString("UEMAIL") );
      out.write("</h3>\r\n");
      out.write("                                                <i class=\"fas fa-phone-alt\"></i><h3>");
      out.print(rs.getString("UCONTACT") );
      out.write("</h3>\r\n");
      out.write("\t\t\t\t\t</div><!--// .contact-info -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div><!--// .yui-gc -->\r\n");
      out.write("\t\t</div><!--// hd -->\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"bd\">\r\n");
      out.write("\t\t\t<div id=\"yui-main\">\r\n");
      out.write("\t\t\t\t<div class=\"yui-b\">\r\n");
      out.write("                                     ");
 if(rs.getString("USUM")!=" "){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"yui-gf\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"yui-u first\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Profile</h2>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"yui-u\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"enlarge\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(rs.getString("USUM") );
      out.write("\r\n");
      out.write("                                                        </p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div><!--// .yui-gf --> ");
 } 
      out.write('\r');
      out.write('\n');
 }

      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

                         int l = 0;
                            String query5="Select SK from SKILLS  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query5);
                             if(rs.next()==true){ 
                                                                        
      out.write("\r\n");
      out.write("                                 <div class=\"yui-gf\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"yui-u first\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Skills</h2>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"yui-u\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("                                                                    <div>");
      out.print(rs.getString("SK") );
      out.write("</div><br/>\r\n");
      out.write("                            \r\n");
      out.write("                                 ");

                            while(rs.next()==true)
                            {
                                
      out.write("\r\n");
      out.write("                                     \r\n");
      out.write("                                <div>");
      out.print(rs.getString("SK") );
      out.write("</div><br/>\r\n");
      out.write("\r\n");
      out.write("                                      \r\n");
      out.write("                                        ");

                           l++;
                            } 
      out.write("\r\n");
      out.write("                           \r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div><!--// .yui-gf -->\r\n");
      out.write("\r\n");
      out.write("                            ");
  }
                                        
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                                                     ");

                         int M = 0;
                            String query6="Select * from LANGUAGE  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query6);
                              if(rs.next()==true){ 
                                
      out.write("\r\n");
      out.write("                             <div class=\"yui-gf\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"yui-u first\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Languages</h2>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"yui-u\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("                                                            <div>");
      out.print(rs.getString("ULANGUAGE") );
      out.write("</div><br/>\r\n");
      out.write("                       ");
   while(rs.next()==true)
                            {
                                
      out.write("\r\n");
      out.write("                                     \r\n");
      out.write("\t\t\t\t\t\t\t\t<div>");
      out.print(rs.getString("ULANGUAGE") );
      out.write("</div><br/>\r\n");
      out.write("\t\t\t\t\t\t\t ");

                           M++;
                            }
                                                         
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div><!--// .yui-gf-->\r\n");
      out.write("  ");
  }
                                        
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("                                        ");

                            
                            int i = 0;
                            String query2="Select * from WORKEX  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query2);
                              if(rs.next()==true){ 
                                
      out.write("\r\n");
      out.write("                             <div class=\"yui-gf\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"yui-u first\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Experience</h2>\r\n");
      out.write("\t\t\t\t\t\t</div><!--// .yui-u -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"yui-u\">\r\n");
      out.write("                                                    <div class=\"job\">\r\n");
      out.write("                \r\n");
      out.write("                 <i class=\"fas fa-circle\"></i>   <h2> ");
      out.print(rs.getString("UPOSITION") );
      out.write("</h2><br/>\r\n");
      out.write("                 <h3> ");
      out.print(rs.getString("UCOMPANY") );
      out.write("</h4>\r\n");
      out.write("                 <h4>");
      out.print(rs.getString("USTART") );
      out.write(" - ");
      out.print(rs.getString("UEND") );
      out.write("</h4> \r\n");
      out.write("                   \r\n");
      out.write("                    <p>\r\n");
      out.write("                        ");
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
      out.write("                 <i class=\"fas fa-circle\"></i>   <h2> ");
      out.print(rs.getString("UPOSITION") );
      out.write("</h2><br/>\r\n");
      out.write("                 <h3> ");
      out.print(rs.getString("UCOMPANY") );
      out.write("</h4>\r\n");
      out.write("                 <h4>");
      out.print(rs.getString("USTART") );
      out.write(" - ");
      out.print(rs.getString("UEND") );
      out.write("</h4> \r\n");
      out.write("                   \r\n");
      out.write("                    <p>\r\n");
      out.write("                        ");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("\r\n");
      out.write("                    </p>\r\n");
      out.write("<br/></div>\r\n");
      out.write("                  \r\n");
      out.write("        ");
 
                                 i++;
                            }
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>  ");
 }  
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                                        ");

                            
                            int ll = 0;
                            String queryl="Select * from PROJECT  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(queryl);
                             if(rs.next()==true){ 
                                
      out.write("\r\n");
      out.write("                                <div class=\"yui-gf\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"yui-u first\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Projects</h2>\r\n");
      out.write("\t\t\t\t\t\t</div><!--// .yui-u -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"yui-u\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"job\">\r\n");
      out.write("                                                             <i class=\"fas fa-circle\"></i>   <h2> ");
      out.print(rs.getString("PNAME") );
      out.write("</h2><br/>\r\n");
      out.write("                 <h4>");
      out.print(rs.getString("USTART") );
      out.write(" - ");
      out.print(rs.getString("UEND") );
      out.write("</h4> \r\n");
      out.write("                   \r\n");
      out.write("                    <p>\r\n");
      out.write("                        ");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <br/></div>\r\n");
      out.write("                           ");
 while(rs.next()==true)
                            {


      out.write("\r\n");
      out.write("               <div class=\"job\"> \r\n");
      out.write("                 <i class=\"fas fa-circle\"></i>   <h2> ");
      out.print(rs.getString("PNAME") );
      out.write("</h2><br/>\r\n");
      out.write("                 <h4>");
      out.print(rs.getString("USTART") );
      out.write(" - ");
      out.print(rs.getString("UEND") );
      out.write("</h4> \r\n");
      out.write("                   \r\n");
      out.write("                    <p>\r\n");
      out.write("                        ");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("\r\n");
      out.write("                    </p>\r\n");
      out.write("<br/>\r\n");
      out.write("                  \r\n");
      out.write("        ");
 
                                 ll++;
                            }
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                                                ");

                         int k = 0;
                            String query4="Select * from EDUCATION  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query4);
                             if(rs.next()==true){ 
                                
      out.write("\r\n");
      out.write("                                <div class=\"yui-gf\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"yui-u first\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Education</h2>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"yui-u\">\r\n");
      out.write("                                                     <h2>");
      out.print(rs.getString("UPROGRAM") );
      out.write("</h2>\r\n");
      out.write("                        <h3>");
      out.print(rs.getString("UINSTITUTE") );
      out.write("</h3>\r\n");
      out.write("                        Start Date: ");
      out.print(rs.getString("USTART") );
      out.write("\r\n");
      out.write("                        &nbsp;&nbsp; End Date:     ");
      out.print(rs.getString("UEND") );
      out.write("<br/>\r\n");
      out.write("                         Marks:        ");
      out.print(rs.getString("UCGPA") );
      out.write("<br/><br/>\r\n");
      out.write("                        \r\n");
      out.write("                                ");
 
                            while(rs.next()==true)
                            {
                                
      out.write("\r\n");
      out.write("                       \r\n");
      out.write("                        <h2>");
      out.print(rs.getString("UPROGRAM") );
      out.write("</h2>\r\n");
      out.write("                        <h3>");
      out.print(rs.getString("UINSTITUTE") );
      out.write("</h3>\r\n");
      out.write("                        Start Date: ");
      out.print(rs.getString("USTART") );
      out.write("\r\n");
      out.write("                            &nbsp;&nbsp;End Date:     ");
      out.print(rs.getString("UEND") );
      out.write("<br/>\r\n");
      out.write("                         Marks:        ");
      out.print(rs.getString("UCGPA") );
      out.write("<br/><br/>\r\n");
      out.write("                        \r\n");
      out.write("                         ");

                           k++;
                            }
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div><!--// .yui-gf --> ");
 } 
      out.write("\r\n");
      out.write("      ");

                         int kk = 0;
                            String query7="Select * from CERTIFICATE  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query7);
                             if(rs.next()==true){ 
                                
      out.write("\r\n");
      out.write("                                <div class=\"yui-gf\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"yui-u first\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Certification</h2>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"yui-u\">\r\n");
      out.write("                                                     <h2>");
      out.print(rs.getString("UCERTI") );
      out.write("</h2>\r\n");
      out.write("                        <h3>");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("</h3>\r\n");
      out.write("                       \r\n");
      out.write("                        \r\n");
      out.write("                                ");
 
                            while(rs.next()==true)
                            {
                                
      out.write("\r\n");
      out.write("                       \r\n");
      out.write("                        <h2>");
      out.print(rs.getString("UCERTI") );
      out.write("</h2>\r\n");
      out.write("                        <h3>");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("</h3>\r\n");
      out.write("                        \r\n");
      out.write("                         ");

                           kk++;
                            }
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div><!--// .yui-gf --> ");
 } 
      out.write("\r\n");
      out.write("   \r\n");
      out.write("                                        \r\n");
      out.write("                                        \r\n");
      out.write("                            ");

                         int j = 0;
                            String query3="Select * from UHOBBY  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query3);
                             if(rs.next()==true){ 
                                
      out.write("\r\n");
      out.write("                                 <div class=\"yui-gf last\">\r\n");
      out.write("                    <h2>Hobbies</h2>\r\n");
      out.write("                    <div class=\"yui-u\">\r\n");
      out.write("                                <div> <i class=\"fas fa-circle\"></i> &nbsp;&nbsp;&nbsp;");
      out.print(rs.getString("UINTREST") );
      out.write(" </div><br/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                          ");
  while(rs.next()==true)
                            {
                                
      out.write("\r\n");
      out.write("                                 <div class=\"yui-u\">\r\n");
      out.write("                                <div> <i class=\"fas fa-circle\"></i> &nbsp;&nbsp;&nbsp;");
      out.print(rs.getString("UINTREST") );
      out.write(" </div><br/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                   \r\n");
      out.write("                                ");

                           j++;
                            }
      out.write("\r\n");
      out.write("                             \r\n");
      out.write("</div>\r\n");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t</div><!--// .yui-b -->\r\n");
      out.write("\t\t\t</div><!--// yui-main -->\r\n");
      out.write("\t\t</div><!--// bd -->\r\n");
      out.write("</div><!-- // inner -->\r\n");
      out.write("</div><!--// doc -->\r\n");
      out.write(" ");

                        }
                        catch(Exception ex)
                        {
                            ex.printStackTrace();
                        }
                  
                    
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    window.onload = function () {\r\n");
      out.write("    document.getElementById(\"download\")\r\n");
      out.write("        .addEventListener(\"click\", () => {\r\n");
      out.write("            const row1 = this.document.getElementById(\"doc2\");\r\n");
      out.write("            console.log(row1);\r\n");
      out.write("            console.log(window);\r\n");
      out.write("            \r\n");
      out.write("            html2pdf().from(row1).save();\r\n");
      out.write("        })\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
