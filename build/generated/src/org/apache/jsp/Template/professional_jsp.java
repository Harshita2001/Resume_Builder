package org.apache.jsp.Template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.security.interfaces.RSAKey;
import java.sql.*;
import java.io.*;

public final class professional_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/d9973f5636.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    \r\n");
      out.write("          <meta charset=\"utf-8\" />\r\n");
      out.write("    <meta\r\n");
      out.write("      name=\"viewport\" content=\"width=device-width,initial-scale=1,shrink-to-fit=no\"/>\r\n");
      out.write("   <script src=\"https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.9.2/html2pdf.bundle.js\"></script> \r\n");
      out.write("         <script src=\"https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.9.2/html2pdf.bundle.js\"></script>\r\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Open+Sans:300,400,600' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Raleway:100' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet' type='text/css'>\r\n");
      out.write("\r\n");
      out.write("    <title>Resume</title>\r\n");
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
      out.write("        <style>\r\n");
      out.write("            * {\r\n");
      out.write("  box-sizing: border-box;\r\n");
      out.write("  transition: 0.35s ease;\r\n");
      out.write("}\r\n");
      out.write(".rela-block {\r\n");
      out.write("  display: block;\r\n");
      out.write("  position: relative;\r\n");
      out.write("  margin: auto;\r\n");
      out.write("  top: ;\r\n");
      out.write("  left: ;\r\n");
      out.write("  right: ;\r\n");
      out.write("  bottom: ;\r\n");
      out.write("}\r\n");
      out.write(".rela-inline {\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  position: relative;\r\n");
      out.write("  margin: auto;\r\n");
      out.write("  top: ;\r\n");
      out.write("  left: ;\r\n");
      out.write("  right: ;\r\n");
      out.write("  bottom: ;\r\n");
      out.write("}\r\n");
      out.write(".floated {\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  position: relative;\r\n");
      out.write("  margin: false;\r\n");
      out.write("  top: ;\r\n");
      out.write("  left: ;\r\n");
      out.write("  right: ;\r\n");
      out.write("  bottom: ;\r\n");
      out.write("  float: left;\r\n");
      out.write("}\r\n");
      out.write(".abs-center {\r\n");
      out.write("  display: false;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  margin: false;\r\n");
      out.write("  top: 50%;\r\n");
      out.write("  left: 50%;\r\n");
      out.write("  right: false;\r\n");
      out.write("  bottom: false;\r\n");
      out.write("  transform: translate(-50%, -50%);\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  width: 88%;\r\n");
      out.write("}\r\n");
      out.write("body {\r\n");
      out.write("  font-family: 'Open Sans';\r\n");
      out.write("  font-size: 18px;\r\n");
      out.write("  letter-spacing: 0px;\r\n");
      out.write("  font-weight: 400;\r\n");
      out.write("  line-height: 28px;\r\n");
      out.write("  background: url(\"http://kingofwallpapers.com/leaves/leaves-016.jpg\") right no-repeat;\r\n");
      out.write("  background-size: cover;\r\n");
      out.write("}\r\n");
      out.write("body:before {\r\n");
      out.write("  content: \"\";\r\n");
      out.write("  display: false;\r\n");
      out.write("  position: fixed;\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  top: 0;\r\n");
      out.write("  left: 0;\r\n");
      out.write("  right: 0;\r\n");
      out.write("  bottom: 0;\r\n");
      out.write("  background-color: rgba(255,255,255,0.92);\r\n");
      out.write("}\r\n");
      out.write(".caps {\r\n");
      out.write("  text-transform: uppercase;\r\n");
      out.write("}\r\n");
      out.write(".justified {\r\n");
      out.write("  text-align: justify;\r\n");
      out.write("}\r\n");
      out.write("p.light {\r\n");
      out.write("  color: #777;\r\n");
      out.write("}\r\n");
      out.write("h2 {\r\n");
      out.write("  font-family: 'Open Sans';\r\n");
      out.write("  font-size: 30px;\r\n");
      out.write("  letter-spacing: 5px;\r\n");
      out.write("  font-weight: 600;\r\n");
      out.write("  line-height: 40px;\r\n");
      out.write("  color: #000;\r\n");
      out.write("}\r\n");
      out.write("h3 {\r\n");
      out.write("  font-family: 'Open Sans';\r\n");
      out.write("  font-size: 21px;\r\n");
      out.write("  letter-spacing: 1px;\r\n");
      out.write("  font-weight: 600;\r\n");
      out.write("  line-height: 28px;\r\n");
      out.write("  color: #000;\r\n");
      out.write("}\r\n");
      out.write(".page {\r\n");
      out.write("  width: 90%;\r\n");
      out.write("  max-width: 1200px;\r\n");
      out.write("  margin: 80px auto;\r\n");
      out.write("  background-color: #fff;\r\n");
      out.write("  box-shadow: 6px 10px 28px 0px rgba(0,0,0,0.4);\r\n");
      out.write("}\r\n");
      out.write(".top-bar {\r\n");
      out.write("  height: 220px;\r\n");
      out.write("  background-color: #848484;\r\n");
      out.write("  color: #fff;\r\n");
      out.write("}\r\n");
      out.write(".name {\r\n");
      out.write("  display: false;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  margin: false;\r\n");
      out.write("  top: false;\r\n");
      out.write("  left: calc(350px + 5%);\r\n");
      out.write("  right: 0;\r\n");
      out.write("  bottom: 0;\r\n");
      out.write("  height: 120px;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  font-family: 'Raleway';\r\n");
      out.write("  font-size: 58px;\r\n");
      out.write("  letter-spacing: 8px;\r\n");
      out.write("  font-weight: 100;\r\n");
      out.write("  line-height: 60px;\r\n");
      out.write("}\r\n");
      out.write(".name div {\r\n");
      out.write("  width: 94%;\r\n");
      out.write("}\r\n");
      out.write(".side-bar {\r\n");
      out.write("  display: false;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  margin: false;\r\n");
      out.write("  top: 60px;\r\n");
      out.write("  left: 5%;\r\n");
      out.write("  right: false;\r\n");
      out.write("  bottom: 0;\r\n");
      out.write("  width: 350px;\r\n");
      out.write("  background-color: #f7e0c1;\r\n");
      out.write("  padding: 320px 30px 50px;\r\n");
      out.write("}\r\n");
      out.write(".mugshot {\r\n");
      out.write("  display: false;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  margin: false;\r\n");
      out.write("  top: 50px;\r\n");
      out.write("  left: 70px;\r\n");
      out.write("  right: false;\r\n");
      out.write("  bottom: false;\r\n");
      out.write("  height: 210px;\r\n");
      out.write("  width: 210px;\r\n");
      out.write("}\r\n");
      out.write(".mugshot .logo {\r\n");
      out.write("  margin: -23px;\r\n");
      out.write("}\r\n");
      out.write(".logo {\r\n");
      out.write("  display: false;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  margin: false;\r\n");
      out.write("  top: 0;\r\n");
      out.write("  left: 0;\r\n");
      out.write("  right: false;\r\n");
      out.write("  bottom: false;\r\n");
      out.write("  z-index: 100;\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  color: #000;\r\n");
      out.write("  height: 250px;\r\n");
      out.write("  width: 250px;\r\n");
      out.write("}\r\n");
      out.write(".logo .logo-svg {\r\n");
      out.write("  height: 100%;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  stroke: #000;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write(".logo .logo-text {\r\n");
      out.write("  display: false;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  margin: false;\r\n");
      out.write("  top: 58%;\r\n");
      out.write("  right: 16%;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  font-family: \"Montserrat\";\r\n");
      out.write("  font-size: 55px;\r\n");
      out.write("  letter-spacing: 0px;\r\n");
      out.write("  font-weight: 400;\r\n");
      out.write("  line-height: 58.333333333333336px;\r\n");
      out.write("}\r\n");
      out.write(".social {\r\n");
      out.write("  padding-left: 60px;\r\n");
      out.write("  margin-bottom: 20px;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write(".social:before {\r\n");
      out.write("  content: \"\";\r\n");
      out.write("  display: false;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  margin: false;\r\n");
      out.write("  top: -4px;\r\n");
      out.write("  left: 10px;\r\n");
      out.write("  right: false;\r\n");
      out.write("  bottom: false;\r\n");
      out.write("  height: 35px;\r\n");
      out.write("  width: 35px;\r\n");
      out.write("  background-size: cover !important;\r\n");
      out.write("}\r\n");
      out.write(".social.twitter:before {\r\n");
      out.write("  background: url(\"https://cdn3.iconfinder.com/data/icons/social-media-2026/60/Socialmedia_icons_Twitter-07-128.png\") center no-repeat;\r\n");
      out.write("}\r\n");
      out.write(".social.pinterest:before {\r\n");
      out.write("  background: url(\"https://cdn3.iconfinder.com/data/icons/social-media-2026/60/Socialmedia_icons_Pinterest-23-128.png\") center no-repeat;\r\n");
      out.write("}\r\n");
      out.write(".social.linked-in:before {\r\n");
      out.write("  background: url(\"https://cdn3.iconfinder.com/data/icons/social-media-2026/60/Socialmedia_icons_LinkedIn-128.png\") center no-repeat;\r\n");
      out.write("}\r\n");
      out.write(".side-header {\r\n");
      out.write("  font-family: 'Open Sans';\r\n");
      out.write("  font-size: 18px;\r\n");
      out.write("  letter-spacing: 4px;\r\n");
      out.write("  font-weight: 600;\r\n");
      out.write("  line-height: 28px;\r\n");
      out.write("  margin: 60px auto 10px;\r\n");
      out.write("  padding-bottom: 5px;\r\n");
      out.write("  border-bottom: 1px solid #888;\r\n");
      out.write("}\r\n");
      out.write(".list-thing {\r\n");
      out.write("  padding-left: 25px;\r\n");
      out.write("  margin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write(".content-container {\r\n");
      out.write("  margin-right: 0;\r\n");
      out.write("  width: calc(95% - 350px);\r\n");
      out.write("  padding: 25px 40px 50px;\r\n");
      out.write("}\r\n");
      out.write(".content-container > * {\r\n");
      out.write("  margin: 0 auto 25px;\r\n");
      out.write("}\r\n");
      out.write(".content-container > h3 {\r\n");
      out.write("  margin: 0 auto 5px;\r\n");
      out.write("}\r\n");
      out.write(".content-container > p.long-margin {\r\n");
      out.write("  margin: 0 auto 50px;\r\n");
      out.write("}\r\n");
      out.write(".title {\r\n");
      out.write("  width: 80%;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("}\r\n");
      out.write(".separator {\r\n");
      out.write("  width: 240px;\r\n");
      out.write("  height: 2px;\r\n");
      out.write("  background-color: #999;\r\n");
      out.write("}\r\n");
      out.write(".greyed {\r\n");
      out.write("  background-color: #ddd;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  max-width: 580px;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  font-family: 'Open Sans';\r\n");
      out.write("  font-size: 18px;\r\n");
      out.write("  letter-spacing: 6px;\r\n");
      out.write("  font-weight: 600;\r\n");
      out.write("  line-height: 28px;\r\n");
      out.write("}\r\n");
      out.write("@media screen and (max-width: 1150px) {\r\n");
      out.write("  .name {\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    font-family: 'Raleway';\r\n");
      out.write("    font-size: 38px;\r\n");
      out.write("    letter-spacing: 6px;\r\n");
      out.write("    font-weight: 100;\r\n");
      out.write("    line-height: 48px;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- FONTS -->\r\n");
      out.write("\r\n");
      out.write("<!-- PAGE STUFF -->\r\n");
      out.write(" \r\n");
      out.write(" <div id=\"row1\" class=\"rela-block page\">\r\n");
      out.write("    <button id=\"download\" class=\"button\"><i class=\"fa fa-download\" style=\"color: white\"></i>DOWNLOAD</button>\r\n");
      out.write("        <input type=\"submit\" formtarget=\"../resume_det.jsp\" onclick=\"window.location.href='../resume_det.jsp'\" name=\"submit2\" value=\"edit details\" class=\"button button-primary float-right\" />\r\n");
      out.write("    \r\n");
      out.write("     ");

                        
                    try
                        {
                            String mail = session.getAttribute("userId").toString();
        
                            String query1="Select * from PERSONAL where UEMAIL='"+mail+"' " ;
                            ResultSet rs=stmt1.executeQuery(query1);
                            
                            while(rs.next()==true)
                            {
                               
      out.write("\r\n");
      out.write("    <div class=\"rela-block top-bar\">\r\n");
      out.write("        <div class=\"caps name\"><div class=\"abs-center\">");
      out.print(rs.getString("UFNAME") );
      out.write("&nbsp;&nbsp; ");
      out.print(rs.getString("ULNAME") );
      out.write("</div></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"side-bar\">\r\n");
      out.write("       \r\n");
      out.write("        <p>");
      out.print(rs.getString("UADDRESS") );
      out.write("</p>\r\n");
      out.write("        <p>");
      out.print(rs.getString("UZIPCODE") );
      out.write("&nbsp;&nbsp;");
      out.print(rs.getString("UCOUNTRY") );
      out.write("</p>\r\n");
      out.write("        <p>");
      out.print(rs.getString("UCONTACT") );
      out.write("</p>\r\n");
      out.write("        <p>");
      out.print(rs.getString("UEMAIL") );
      out.write("</p><br>\r\n");
      out.write("        ");
 }

      out.write('\r');
      out.write('\n');
   int l = 0;
                            String query5="Select * from SKILLS  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query5);
                             if(rs.next()==true){ 
                     
      out.write("\r\n");
      out.write("        <p class=\"rela-block caps side-header\">Expertise</p>\r\n");
      out.write("        <p class=\"rela-block list-thing\">");
      out.print(rs.getString("SK") );
      out.write("</p>\r\n");
      out.write("        ");

                            while(rs.next()==true)
                            {
                                
      out.write("\r\n");
      out.write("        <p class=\"rela-block list-thing\">");
      out.print(rs.getString("SK") );
      out.write("</p>\r\n");
      out.write("         ");

                           l++;
                            } 
      out.write("\r\n");
      out.write("   \r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("         ");

                         int k = 0;
                            String query4="Select * from EDUCATION  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query4);
                             if(rs.next()==true){ 
                                
      out.write("\r\n");
      out.write("        <p class=\"rela-block caps side-header\">Education</p>\r\n");
      out.write("        <h4 class=\"rela-block list-thing\">");
      out.print(rs.getString("UPROGRAM") );
      out.write("</h4>\r\n");
      out.write("        <h5 class=\"rela-block list-thing\">");
      out.print(rs.getString("UINSTITUTE") );
      out.write("</h5>\r\n");
      out.write("        <h5 class=\"rela-block list-thing\">");
      out.print(rs.getString("USTART") );
      out.write(" - ");
      out.print(rs.getString("UEND") );
      out.write("</h5>\r\n");
      out.write("        <h5 class=\"rela-block list-thing\">Marks:        ");
      out.print(rs.getString("UCGPA") );
      out.write("</h5>\r\n");
      out.write("        ");

                            while(rs.next()==true)
                            {
                                
      out.write("\r\n");
      out.write("        <h4 class=\"rela-block list-thing\">");
      out.print(rs.getString("UPROGRAM") );
      out.write("</h4>\r\n");
      out.write("        <h5 class=\"rela-block list-thing\">");
      out.print(rs.getString("UINSTITUTE") );
      out.write("</h5>\r\n");
      out.write("        <h5 class=\"rela-block list-thing\">");
      out.print(rs.getString("USTART") );
      out.write(" - ");
      out.print(rs.getString("UEND") );
      out.write("</h5>\r\n");
      out.write("        <h5 class=\"rela-block list-thing\">Marks:        ");
      out.print(rs.getString("UCGPA") );
      out.write("</h5>\r\n");
      out.write("         ");

                           l++;
                            } 
      out.write("\r\n");
      out.write("   \r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"rela-block content-container\">\r\n");
      out.write("          ");

                        
                   String queryp="Select * from PERSONAL where UEMAIL='"+mail+"' " ;
                           rs=stmt1.executeQuery(queryp);
                            
                            while(rs.next()==true)
                            {
                               
      out.write("\r\n");
      out.write("        <div class=\"rela-block caps greyed\">Profile</div>\r\n");
      out.write("        <p class=\"long-margin\">");
      out.print(rs.getString("USUM") );
      out.write(" </p>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("        \r\n");
      out.write("       ");
  
                        int i = 0;
                            String query2="Select * from WORKEX  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query2);
                              if(rs.next()==true){ 
                                
      out.write("\r\n");
      out.write("                                <div class=\"rela-block caps greyed\">Experience</div>\r\n");
      out.write("        <h3>");
      out.print(rs.getString("UPOSITION") );
      out.write("</h3>\r\n");
      out.write("        <h4>");
      out.print(rs.getString("UCOMPANY") );
      out.write("</h4>\r\n");
      out.write("        <p class=\"light\">");
      out.print(rs.getString("USTART") );
      out.write("\r\n");
      out.write("                -");
      out.print(rs.getString("UEND") );
      out.write("</p>\r\n");
      out.write("        <p class=\"justified\">");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("</p>\r\n");
      out.write("     ");
  while(rs.next()==true)
                            {


      out.write("\r\n");
      out.write(" <h3>");
      out.print(rs.getString("UPOSITION") );
      out.write("</h3>\r\n");
      out.write("        <h4>");
      out.print(rs.getString("UCOMPANY") );
      out.write("</h4>\r\n");
      out.write("        <p class=\"light\">");
      out.print(rs.getString("USTART") );
      out.write("\r\n");
      out.write("                -");
      out.print(rs.getString("UEND") );
      out.write("</p>\r\n");
      out.write("        <p class=\"justified\">");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("</p>\r\n");
      out.write("        \r\n");
      out.write("             ");
 
                                 i++;
                            }
      out.write("\r\n");
      out.write("                          \r\n");
      out.write(" \r\n");
 }

      out.write("\r\n");
      out.write(" \r\n");
      out.write("        \r\n");
      out.write("        ");
  
                           int ll = 0;
                            String queryl="Select * from PROJECT  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(queryl);
                             if(rs.next()==true){ 
                                
                                
      out.write("\r\n");
      out.write("                                <div class=\"rela-block caps greyed\">Projects</div>\r\n");
      out.write("        <h3>");
      out.print(rs.getString("PNAME") );
      out.write("</h3>\r\n");
      out.write("        <p class=\"light\">");
      out.print(rs.getString("USTART") );
      out.write("\r\n");
      out.write("                -");
      out.print(rs.getString("UEND") );
      out.write("</p>\r\n");
      out.write("        <p class=\"justified\">");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("</p>\r\n");
      out.write("     ");
  while(rs.next()==true)
                            {


      out.write("\r\n");
      out.write("<h3>");
      out.print(rs.getString("PNAME") );
      out.write("</h3>\r\n");
      out.write("        <p class=\"light\">");
      out.print(rs.getString("USTART") );
      out.write("\r\n");
      out.write("                -");
      out.print(rs.getString("UEND") );
      out.write("</p>\r\n");
      out.write("        <p class=\"justified\">");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("</p>\r\n");
      out.write("        \r\n");
      out.write("             ");
 
                                 ll++;
                            }
      out.write("\r\n");
      out.write("                          \r\n");
      out.write(" \r\n");
 }

      out.write("\r\n");
      out.write("         ");
  
                 int j = 0;
                            String queryj="Select * from CERTIFICATE  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(queryj);
                              if(rs.next()==true){ 
                                
      out.write("\r\n");
      out.write("                                <div class=\"rela-block caps greyed\">Certifications</div>\r\n");
      out.write("        <h3>");
      out.print(rs.getString("UCERTI") );
      out.write("</h3>\r\n");
      out.write("        <p class=\"light\">Description</p>\r\n");
      out.write("        <p class=\"justified\">");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("</p>\r\n");
      out.write("     ");
  while(rs.next()==true)
                            {


      out.write("\r\n");
      out.write("<h3>");
      out.print(rs.getString("UCERTI") );
      out.write("</h3>\r\n");
      out.write("        <p class=\"light\">Description</p>\r\n");
      out.write("        <p class=\"justified\">");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("</p>\r\n");
      out.write("        \r\n");
      out.write("             ");
 
                                 j++;
                            }
      out.write("\r\n");
      out.write("                          \r\n");
      out.write(" \r\n");
 }

      out.write("\r\n");
      out.write("      ");

                         int jp = 0;
                            String query3="Select * from UHOBBY  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query3);
                             if(rs.next()==true){ 
                                
      out.write("\r\n");
      out.write("                                <div class=\"rela-block caps greyed\">Hobbies</div>\r\n");
      out.write("        <p class=\"rela-block list-thing\">");
      out.print(rs.getString("UINTREST") );
      out.write("</p>\r\n");
      out.write("        ");

                            while(rs.next()==true)
                            {
                                
      out.write("\r\n");
      out.write("        <p class=\"rela-block list-thing\">");
      out.print(rs.getString("UINTREST") );
      out.write("</p>\r\n");
      out.write("         ");

                           jp++;
                            } 
      out.write("\r\n");
      out.write("   \r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("         ");
  
                      int M = 0;
                            String query6="Select * from LANGUAGE  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query6);
                              if(rs.next()==true){ 
                                
      out.write("\r\n");
      out.write("        <div class=\"rela-block caps greyed\">Language</div>\r\n");
      out.write("        <p class=\"rela-block list-thing\">");
      out.print(rs.getString("ULANGUAGE") );
      out.write("</p>\r\n");
      out.write("        ");

                            while(rs.next()==true)
                            {
                                
      out.write("\r\n");
      out.write("        <p class=\"rela-block list-thing\">");
      out.print(rs.getString("ULANGUAGE") );
      out.write("</p>\r\n");
      out.write("         ");

                           M++;
                            } 
      out.write("\r\n");
      out.write("   \r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("         ");

                        }
                        catch(Exception ex)
                        {
                            ex.printStackTrace();
                        }
                  
                    
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("</div>\r\n");
      out.write("       \r\n");
      out.write("                      <script>\r\n");
      out.write("    window.onload = function () {\r\n");
      out.write("    document.getElementById(\"download\")\r\n");
      out.write("        .addEventListener(\"click\", () => {\r\n");
      out.write("            const row1 = this.document.getElementById(\"row1\");\r\n");
      out.write("            console.log(row1);\r\n");
      out.write("            console.log(window);\r\n");
      out.write("            \r\n");
      out.write("            html2pdf().from(row1).save();\r\n");
      out.write("        })\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script> \r\n");
      out.write("    </body>\r\n");
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
