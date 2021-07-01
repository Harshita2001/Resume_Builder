package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.security.interfaces.RSAKey;
import java.sql.*;
import java.io.*;

public final class Template6_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
    Statement stmt1=conn.createStatement();

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("          <meta charset=\"utf-8\" />\n");
      out.write("    <meta\n");
      out.write("      name=\"viewport\" content=\"width=device-width,initial-scale=1,shrink-to-fit=no\"/>\n");
      out.write("    <title>Resume</title>\n");
      out.write("        <style>\n");
      out.write("            * {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  transition: 0.35s ease;\n");
      out.write("}\n");
      out.write(".rela-block {\n");
      out.write("  display: block;\n");
      out.write("  position: relative;\n");
      out.write("  margin: auto;\n");
      out.write("  top: ;\n");
      out.write("  left: ;\n");
      out.write("  right: ;\n");
      out.write("  bottom: ;\n");
      out.write("}\n");
      out.write(".rela-inline {\n");
      out.write("  display: inline-block;\n");
      out.write("  position: relative;\n");
      out.write("  margin: auto;\n");
      out.write("  top: ;\n");
      out.write("  left: ;\n");
      out.write("  right: ;\n");
      out.write("  bottom: ;\n");
      out.write("}\n");
      out.write(".floated {\n");
      out.write("  display: inline-block;\n");
      out.write("  position: relative;\n");
      out.write("  margin: false;\n");
      out.write("  top: ;\n");
      out.write("  left: ;\n");
      out.write("  right: ;\n");
      out.write("  bottom: ;\n");
      out.write("  float: left;\n");
      out.write("}\n");
      out.write(".abs-center {\n");
      out.write("  display: false;\n");
      out.write("  position: absolute;\n");
      out.write("  margin: false;\n");
      out.write("  top: 50%;\n");
      out.write("  left: 50%;\n");
      out.write("  right: false;\n");
      out.write("  bottom: false;\n");
      out.write("  transform: translate(-50%, -50%);\n");
      out.write("  text-align: center;\n");
      out.write("  width: 88%;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("  font-family: 'Open Sans';\n");
      out.write("  font-size: 18px;\n");
      out.write("  letter-spacing: 0px;\n");
      out.write("  font-weight: 400;\n");
      out.write("  line-height: 28px;\n");
      out.write("  background: url(\"http://kingofwallpapers.com/leaves/leaves-016.jpg\") right no-repeat;\n");
      out.write("  background-size: cover;\n");
      out.write("}\n");
      out.write("body:before {\n");
      out.write("  content: \"\";\n");
      out.write("  display: false;\n");
      out.write("  position: fixed;\n");
      out.write("  margin: 0;\n");
      out.write("  top: 0;\n");
      out.write("  left: 0;\n");
      out.write("  right: 0;\n");
      out.write("  bottom: 0;\n");
      out.write("  background-color: rgba(255,255,255,0.92);\n");
      out.write("}\n");
      out.write(".caps {\n");
      out.write("  text-transform: uppercase;\n");
      out.write("}\n");
      out.write(".justified {\n");
      out.write("  text-align: justify;\n");
      out.write("}\n");
      out.write("p.light {\n");
      out.write("  color: #777;\n");
      out.write("}\n");
      out.write("h2 {\n");
      out.write("  font-family: 'Open Sans';\n");
      out.write("  font-size: 30px;\n");
      out.write("  letter-spacing: 5px;\n");
      out.write("  font-weight: 600;\n");
      out.write("  line-height: 40px;\n");
      out.write("  color: #000;\n");
      out.write("}\n");
      out.write("h3 {\n");
      out.write("  font-family: 'Open Sans';\n");
      out.write("  font-size: 21px;\n");
      out.write("  letter-spacing: 1px;\n");
      out.write("  font-weight: 600;\n");
      out.write("  line-height: 28px;\n");
      out.write("  color: #000;\n");
      out.write("}\n");
      out.write(".page {\n");
      out.write("  width: 90%;\n");
      out.write("  max-width: 1200px;\n");
      out.write("  margin: 80px auto;\n");
      out.write("  background-color: #fff;\n");
      out.write("  box-shadow: 6px 10px 28px 0px rgba(0,0,0,0.4);\n");
      out.write("}\n");
      out.write(".top-bar {\n");
      out.write("  height: 220px;\n");
      out.write("  background-color: #848484;\n");
      out.write("  color: #fff;\n");
      out.write("}\n");
      out.write(".name {\n");
      out.write("  display: false;\n");
      out.write("  position: absolute;\n");
      out.write("  margin: false;\n");
      out.write("  top: false;\n");
      out.write("  left: calc(350px + 5%);\n");
      out.write("  right: 0;\n");
      out.write("  bottom: 0;\n");
      out.write("  height: 120px;\n");
      out.write("  text-align: center;\n");
      out.write("  font-family: 'Raleway';\n");
      out.write("  font-size: 58px;\n");
      out.write("  letter-spacing: 8px;\n");
      out.write("  font-weight: 100;\n");
      out.write("  line-height: 60px;\n");
      out.write("}\n");
      out.write(".name div {\n");
      out.write("  width: 94%;\n");
      out.write("}\n");
      out.write(".side-bar {\n");
      out.write("  display: false;\n");
      out.write("  position: absolute;\n");
      out.write("  margin: false;\n");
      out.write("  top: 60px;\n");
      out.write("  left: 5%;\n");
      out.write("  right: false;\n");
      out.write("  bottom: 0;\n");
      out.write("  width: 350px;\n");
      out.write("  background-color: #f7e0c1;\n");
      out.write("  padding: 320px 30px 50px;\n");
      out.write("}\n");
      out.write(".mugshot {\n");
      out.write("  display: false;\n");
      out.write("  position: absolute;\n");
      out.write("  margin: false;\n");
      out.write("  top: 50px;\n");
      out.write("  left: 70px;\n");
      out.write("  right: false;\n");
      out.write("  bottom: false;\n");
      out.write("  height: 210px;\n");
      out.write("  width: 210px;\n");
      out.write("}\n");
      out.write(".mugshot .logo {\n");
      out.write("  margin: -23px;\n");
      out.write("}\n");
      out.write(".logo {\n");
      out.write("  display: false;\n");
      out.write("  position: absolute;\n");
      out.write("  margin: false;\n");
      out.write("  top: 0;\n");
      out.write("  left: 0;\n");
      out.write("  right: false;\n");
      out.write("  bottom: false;\n");
      out.write("  z-index: 100;\n");
      out.write("  margin: 0;\n");
      out.write("  color: #000;\n");
      out.write("  height: 250px;\n");
      out.write("  width: 250px;\n");
      out.write("}\n");
      out.write(".logo .logo-svg {\n");
      out.write("  height: 100%;\n");
      out.write("  width: 100%;\n");
      out.write("  stroke: #000;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write(".logo .logo-text {\n");
      out.write("  display: false;\n");
      out.write("  position: absolute;\n");
      out.write("  margin: false;\n");
      out.write("  top: 58%;\n");
      out.write("  right: 16%;\n");
      out.write("  cursor: pointer;\n");
      out.write("  font-family: \"Montserrat\";\n");
      out.write("  font-size: 55px;\n");
      out.write("  letter-spacing: 0px;\n");
      out.write("  font-weight: 400;\n");
      out.write("  line-height: 58.333333333333336px;\n");
      out.write("}\n");
      out.write(".social {\n");
      out.write("  padding-left: 60px;\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write(".social:before {\n");
      out.write("  content: \"\";\n");
      out.write("  display: false;\n");
      out.write("  position: absolute;\n");
      out.write("  margin: false;\n");
      out.write("  top: -4px;\n");
      out.write("  left: 10px;\n");
      out.write("  right: false;\n");
      out.write("  bottom: false;\n");
      out.write("  height: 35px;\n");
      out.write("  width: 35px;\n");
      out.write("  background-size: cover !important;\n");
      out.write("}\n");
      out.write(".social.twitter:before {\n");
      out.write("  background: url(\"https://cdn3.iconfinder.com/data/icons/social-media-2026/60/Socialmedia_icons_Twitter-07-128.png\") center no-repeat;\n");
      out.write("}\n");
      out.write(".social.pinterest:before {\n");
      out.write("  background: url(\"https://cdn3.iconfinder.com/data/icons/social-media-2026/60/Socialmedia_icons_Pinterest-23-128.png\") center no-repeat;\n");
      out.write("}\n");
      out.write(".social.linked-in:before {\n");
      out.write("  background: url(\"https://cdn3.iconfinder.com/data/icons/social-media-2026/60/Socialmedia_icons_LinkedIn-128.png\") center no-repeat;\n");
      out.write("}\n");
      out.write(".side-header {\n");
      out.write("  font-family: 'Open Sans';\n");
      out.write("  font-size: 18px;\n");
      out.write("  letter-spacing: 4px;\n");
      out.write("  font-weight: 600;\n");
      out.write("  line-height: 28px;\n");
      out.write("  margin: 60px auto 10px;\n");
      out.write("  padding-bottom: 5px;\n");
      out.write("  border-bottom: 1px solid #888;\n");
      out.write("}\n");
      out.write(".list-thing {\n");
      out.write("  padding-left: 25px;\n");
      out.write("  margin-bottom: 10px;\n");
      out.write("}\n");
      out.write(".content-container {\n");
      out.write("  margin-right: 0;\n");
      out.write("  width: calc(95% - 350px);\n");
      out.write("  padding: 25px 40px 50px;\n");
      out.write("}\n");
      out.write(".content-container > * {\n");
      out.write("  margin: 0 auto 25px;\n");
      out.write("}\n");
      out.write(".content-container > h3 {\n");
      out.write("  margin: 0 auto 5px;\n");
      out.write("}\n");
      out.write(".content-container > p.long-margin {\n");
      out.write("  margin: 0 auto 50px;\n");
      out.write("}\n");
      out.write(".title {\n");
      out.write("  width: 80%;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write(".separator {\n");
      out.write("  width: 240px;\n");
      out.write("  height: 2px;\n");
      out.write("  background-color: #999;\n");
      out.write("}\n");
      out.write(".greyed {\n");
      out.write("  background-color: #ddd;\n");
      out.write("  width: 100%;\n");
      out.write("  max-width: 580px;\n");
      out.write("  text-align: center;\n");
      out.write("  font-family: 'Open Sans';\n");
      out.write("  font-size: 18px;\n");
      out.write("  letter-spacing: 6px;\n");
      out.write("  font-weight: 600;\n");
      out.write("  line-height: 28px;\n");
      out.write("}\n");
      out.write("@media screen and (max-width: 1150px) {\n");
      out.write("  .name {\n");
      out.write("    color: #fff;\n");
      out.write("    font-family: 'Raleway';\n");
      out.write("    font-size: 38px;\n");
      out.write("    letter-spacing: 6px;\n");
      out.write("    font-weight: 100;\n");
      out.write("    line-height: 48px;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- FONTS -->\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Open+Sans:300,400,600' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Raleway:100' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("<!-- PAGE STUFF -->\n");
      out.write("<div class=\"rela-block page\">\n");
      out.write("     ");

                        
                    try
                        {
                            String mail = session.getAttribute("userId").toString();
        
                            String query1="Select * from PERSONAL where UEMAIL='"+mail+"' " ;
                            ResultSet rs=stmt1.executeQuery(query1);
                            
                            while(rs.next()==true)
                            {
                               
      out.write("\n");
      out.write("    <div class=\"rela-block top-bar\">\n");
      out.write("        <div class=\"caps name\"><div class=\"abs-center\">");
      out.print(rs.getString("UFNAME") );
      out.write("&nbsp;&nbsp; ");
      out.print(rs.getString("ULNAME") );
      out.write("</div></div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"side-bar\">\n");
      out.write("        <div class=\"mugshot\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <svg viewbox=\"0 0 80 80\" class=\"rela-block logo-svg\">\n");
      out.write("                    <path d=\"M 10 10 L 52 10 L 72 30 L 72 70 L 30 70 L 10 50 Z\" stroke-width=\"2.5\" fill=\"none\"/>\n");
      out.write("                </svg>\n");
      out.write("                <p class=\"logo-text\">kj</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <p>");
      out.print(rs.getString("UADDRESS") );
      out.write("</p>\n");
      out.write("        <p>");
      out.print(rs.getString("UZIPCODE") );
      out.write("&nbsp;&nbsp;");
      out.print(rs.getString("UCOUNTRY") );
      out.write("</p>\n");
      out.write("        <p>");
      out.print(rs.getString("UCONTACT") );
      out.write("</p>\n");
      out.write("        <p>");
      out.print(rs.getString("UEMAIL") );
      out.write("</p><br>\n");
      out.write("        ");
 }

      out.write('\n');
   int l = 0;
                            String query5="Select * from SKILLS  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query5);
                             if(rs.next()==true){ 
                     
      out.write("\n");
      out.write("        <p class=\"rela-block caps side-header\">Expertise</p>\n");
      out.write("        <p class=\"rela-block list-thing\">");
      out.print(rs.getString("SK") );
      out.write("</p>\n");
      out.write("        ");

                            while(rs.next()==true)
                            {
                                
      out.write("\n");
      out.write("        <p class=\"rela-block list-thing\">");
      out.print(rs.getString("SK") );
      out.write("</p>\n");
      out.write("         ");

                           l++;
                            } 
      out.write("\n");
      out.write("   \n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("         ");

                         int k = 0;
                            String query4="Select * from EDUCATION  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query4);
                             if(rs.next()==true){ 
                                
      out.write("\n");
      out.write("        <p class=\"rela-block caps side-header\">Education</p>\n");
      out.write("        <h4 class=\"rela-block list-thing\">");
      out.print(rs.getString("UPROGRAM") );
      out.write("</h4>\n");
      out.write("        <h5 class=\"rela-block list-thing\">");
      out.print(rs.getString("UINSTITUTE") );
      out.write("</h5>\n");
      out.write("        <h5 class=\"rela-block list-thing\">");
      out.print(rs.getString("USTART") );
      out.write(" - ");
      out.print(rs.getString("UEND") );
      out.write("</h5>\n");
      out.write("        <h5 class=\"rela-block list-thing\">Marks:        ");
      out.print(rs.getString("UCGPA") );
      out.write("</h5>\n");
      out.write("        ");

                            while(rs.next()==true)
                            {
                                
      out.write("\n");
      out.write("        <h4 class=\"rela-block list-thing\">");
      out.print(rs.getString("UPROGRAM") );
      out.write("</h4>\n");
      out.write("        <h5 class=\"rela-block list-thing\">");
      out.print(rs.getString("UINSTITUTE") );
      out.write("</h5>\n");
      out.write("        <h5 class=\"rela-block list-thing\">");
      out.print(rs.getString("USTART") );
      out.write(" - ");
      out.print(rs.getString("UEND") );
      out.write("</h5>\n");
      out.write("        <h5 class=\"rela-block list-thing\">Marks:        ");
      out.print(rs.getString("UCGPA") );
      out.write("</h5>\n");
      out.write("         ");

                           l++;
                            } 
      out.write("\n");
      out.write("   \n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"rela-block content-container\">\n");
      out.write("          ");

                        
                   String queryp="Select * from PERSONAL where UEMAIL='"+mail+"' " ;
                           rs=stmt1.executeQuery(queryp);
                            
                            while(rs.next()==true)
                            {
                               
      out.write("\n");
      out.write("        <div class=\"rela-block caps greyed\">Profile</div>\n");
      out.write("        <p class=\"long-margin\">");
      out.print(rs.getString("USUM") );
      out.write(" </p>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        \n");
      out.write("       ");
  
                        int i = 0;
                            String query2="Select * from WORKEX  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query2);
                              if(rs.next()==true){ 
                                
      out.write("\n");
      out.write("                                <div class=\"rela-block caps greyed\">Experience</div>\n");
      out.write("        <h3>");
      out.print(rs.getString("UPOSITION") );
      out.write("</h3>\n");
      out.write("        <h4>");
      out.print(rs.getString("UCOMPANY") );
      out.write("</h4>\n");
      out.write("        <p class=\"light\">");
      out.print(rs.getString("USTART") );
      out.write("\n");
      out.write("                -");
      out.print(rs.getString("UEND") );
      out.write("</p>\n");
      out.write("        <p class=\"justified\">");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("</p>\n");
      out.write("     ");
  while(rs.next()==true)
                            {


      out.write("\n");
      out.write(" <h3>");
      out.print(rs.getString("UPOSITION") );
      out.write("</h3>\n");
      out.write("        <h4>");
      out.print(rs.getString("UCOMPANY") );
      out.write("</h4>\n");
      out.write("        <p class=\"light\">");
      out.print(rs.getString("USTART") );
      out.write("\n");
      out.write("                -");
      out.print(rs.getString("UEND") );
      out.write("</p>\n");
      out.write("        <p class=\"justified\">");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("</p>\n");
      out.write("        \n");
      out.write("             ");
 
                                 i++;
                            }
      out.write("\n");
      out.write("                          \n");
      out.write(" \n");
 }

      out.write("\n");
      out.write(" \n");
      out.write("        \n");
      out.write("        ");
  
                           int ll = 0;
                            String queryl="Select * from PROJECT  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(queryl);
                             if(rs.next()==true){ 
                                
                                
      out.write("\n");
      out.write("                                <div class=\"rela-block caps greyed\">Projects</div>\n");
      out.write("        <h3>");
      out.print(rs.getString("PNAME") );
      out.write("</h3>\n");
      out.write("        <p class=\"light\">");
      out.print(rs.getString("USTART") );
      out.write("\n");
      out.write("                -");
      out.print(rs.getString("UEND") );
      out.write("</p>\n");
      out.write("        <p class=\"justified\">");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("</p>\n");
      out.write("     ");
  while(rs.next()==true)
                            {


      out.write("\n");
      out.write("<h3>");
      out.print(rs.getString("PNAME") );
      out.write("</h3>\n");
      out.write("        <p class=\"light\">");
      out.print(rs.getString("USTART") );
      out.write("\n");
      out.write("                -");
      out.print(rs.getString("UEND") );
      out.write("</p>\n");
      out.write("        <p class=\"justified\">");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("</p>\n");
      out.write("        \n");
      out.write("             ");
 
                                 ll++;
                            }
      out.write("\n");
      out.write("                          \n");
      out.write(" \n");
 }

      out.write("\n");
      out.write("         ");
  
                 int j = 0;
                            String queryj="Select * from CERTIFICATE  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(queryj);
                              if(rs.next()==true){ 
                                
      out.write("\n");
      out.write("                                <div class=\"rela-block caps greyed\">Certifications</div>\n");
      out.write("        <h3>");
      out.print(rs.getString("UCERTI") );
      out.write("</h3>\n");
      out.write("        <p class=\"light\">Description</p>\n");
      out.write("        <p class=\"justified\">");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("</p>\n");
      out.write("     ");
  while(rs.next()==true)
                            {


      out.write("\n");
      out.write("<h3>");
      out.print(rs.getString("UCERTI") );
      out.write("</h3>\n");
      out.write("        <p class=\"light\">Description</p>\n");
      out.write("        <p class=\"justified\">");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("</p>\n");
      out.write("        \n");
      out.write("             ");
 
                                 j++;
                            }
      out.write("\n");
      out.write("                          \n");
      out.write(" \n");
 }

      out.write("\n");
      out.write("      ");

                         int jp = 0;
                            String query3="Select * from UHOBBY  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query3);
                             if(rs.next()==true){ 
                                
      out.write("\n");
      out.write("                                <div class=\"rela-block caps greyed\">Hobbies</div>\n");
      out.write("        <p class=\"rela-block list-thing\">");
      out.print(rs.getString("UINTREST") );
      out.write("</p>\n");
      out.write("        ");

                            while(rs.next()==true)
                            {
                                
      out.write("\n");
      out.write("        <p class=\"rela-block list-thing\">");
      out.print(rs.getString("UINTREST") );
      out.write("</p>\n");
      out.write("         ");

                           jp++;
                            } 
      out.write("\n");
      out.write("   \n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("         ");
  
                      int M = 0;
                            String query6="Select * from LANGUAGE  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query6);
                              if(rs.next()==true){ 
                                
      out.write("\n");
      out.write("        <div class=\"rela-block caps greyed\">Language</div>\n");
      out.write("        <p class=\"rela-block list-thing\">");
      out.print(rs.getString("ULANGUAGE") );
      out.write("</p>\n");
      out.write("        ");

                            while(rs.next()==true)
                            {
                                
      out.write("\n");
      out.write("        <p class=\"rela-block list-thing\">");
      out.print(rs.getString("ULANGUAGE") );
      out.write("</p>\n");
      out.write("         ");

                           M++;
                            } 
      out.write("\n");
      out.write("   \n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("         ");

                        }
                        catch(Exception ex)
                        {
                            ex.printStackTrace();
                        }
                  
                    
      out.write("\n");
      out.write("                    \n");
      out.write("</div>\n");
      out.write("        \n");
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
