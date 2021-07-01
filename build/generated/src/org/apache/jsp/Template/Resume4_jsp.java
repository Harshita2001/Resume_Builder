package org.apache.jsp.Template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.security.interfaces.RSAKey;
import java.sql.*;
import java.io.*;

public final class Resume4_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <meta\r\n");
      out.write("      name=\"viewport\"\r\n");
      out.write("      content=\"width=device-width,initial-scale=1,shrink-to-fit=no\"\r\n");
      out.write("    />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"http://yui.yahooapis.com/2.7.0/build/reset-fonts-grids/reset-fonts-grids.css\" media=\"all\" /> \r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\r\n");
      out.write("\t\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"resume.css\" media=\"all\" />\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.9.2/html2pdf.bundle.js\"></script> \r\n");
      out.write("         <script src=\"https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.9.2/html2pdf.bundle.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <title>Resume</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        #main{\r\n");
      out.write("             height: 50px;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <style>\r\n");
      out.write("      @import url(\"https://fonts.googleapis.com/css?family=Quicksand:400,700\");\r\n");
      out.write("\r\n");
      out.write("      html,\r\n");
      out.write("      body {\r\n");
      out.write("        background: #ccc;\r\n");
      out.write("        font-family: Quicksand, Arial, Verdana, sans-serif;\r\n");
      out.write("        font-size: 14px;\r\n");
      out.write("        color: #444;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      main {\r\n");
      out.write("        background: #fff;\r\n");
      out.write("        box-sizing: border-box;\r\n");
      out.write("        box-shadow: 0 3px 10px rgba(0, 0, 0, 0.25);\r\n");
      out.write("        margin: 2rem auto;\r\n");
      out.write("        padding: 2.75rem;\r\n");
      out.write("        position: relative;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      h1 {\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        font-size: 2.5rem;\r\n");
      out.write("        line-height: 2rem;\r\n");
      out.write("        font-weight: normal;\r\n");
      out.write("        color: #000;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      h2 {\r\n");
      out.write("        color: #47a;\r\n");
      out.write("        font-size: 1rem;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        margin-top: 1.5rem;\r\n");
      out.write("        text-transform: uppercase;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      h3 {\r\n");
      out.write("        color: #111;\r\n");
      out.write("        font-size: 1.25rem;\r\n");
      out.write("        margin-top: 0rem;\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        font-weight: normal;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      h3 span.dept {\r\n");
      out.write("        color: #aaa;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      h3 span.dept::before {\r\n");
      out.write("        content: \"\";\r\n");
      out.write("        border-left: 1px solid #ccc;\r\n");
      out.write("        padding-left: 0.4rem;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      h4 {\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        font-weight: normal;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      h4 span.dates {\r\n");
      out.write("        color: #888;\r\n");
      out.write("        display: inline-block;\r\n");
      out.write("        float: right;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      p {\r\n");
      out.write("        font-size: 1rem;\r\n");
      out.write("        margin-top: 0.5rem;\r\n");
      out.write("        margin-bottom: 0;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      a {\r\n");
      out.write("        color: #369;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write("      time {\r\n");
      out.write("        display: inline-block;\r\n");
      out.write("        min-width: 2rem;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      address {\r\n");
      out.write("        font-style: normal;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .normal {\r\n");
      out.write("        font-weight: normal;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .position {\r\n");
      out.write("        margin-top: 0.75rem;\r\n");
      out.write("        transition: opacity 0.7s;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .no-bullets,\r\n");
      out.write("      .no-bullets ul {\r\n");
      out.write("        list-style: none;\r\n");
      out.write("        margin-left: 0;\r\n");
      out.write("        padding-left: 0;\r\n");
      out.write("        color: #000;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("      }\r\n");
      out.write("      .no-bullets ul {\r\n");
      out.write("        font-weight: normal;\r\n");
      out.write("      }\r\n");
      out.write("      .no-bullets span {\r\n");
      out.write("        color: #666;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      #contact {\r\n");
      out.write("        text-align: right;\r\n");
      out.write("        font-size: 0.9rem;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      #phone {\r\n");
      out.write("        font-size: 1.25rem;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("        text-decoration: none !important;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      #location {\r\n");
      out.write("        font-size: 1.1rem;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      #languages {\r\n");
      out.write("        column-count: 4;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      a,\r\n");
      out.write("      a:visited,\r\n");
      out.write("      a:link,\r\n");
      out.write("      a:active,\r\n");
      out.write("      a:focus,\r\n");
      out.write("      #languages label {\r\n");
      out.write("        color: #395;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      #professional-experience {\r\n");
      out.write("        position: relative;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      main input {\r\n");
      out.write("        position: absolute;\r\n");
      out.write("        left: -10000px;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .educert {\r\n");
      out.write("        display: flex;\r\n");
      out.write("      }\r\n");
      out.write("      .educert li {\r\n");
      out.write("        flex: 1;\r\n");
      out.write("        align-items: start;\r\n");
      out.write("        justify-content: start;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      #filters {\r\n");
      out.write("        position: absolute;\r\n");
      out.write("        top: 0;\r\n");
      out.write("        right: 0;\r\n");
      out.write("        z-index: 1;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      #filters > ul {\r\n");
      out.write("        list-style: none;\r\n");
      out.write("        padding-left: 0;\r\n");
      out.write("        margin: -0.5rem;\r\n");
      out.write("        padding: 0.5rem;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      #filters > ul > li > h3 {\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        display: block;\r\n");
      out.write("        text-align: right;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("        font-size: 1rem;\r\n");
      out.write("        color: #395;\r\n");
      out.write("        text-transform: uppercase;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      #filters > ul > li > h3::before {\r\n");
      out.write("        content: \"\\2610 \";\r\n");
      out.write("        font-size: 1.2rem;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      input:checked ~ div #filters > ul > li > h3::before {\r\n");
      out.write("        content: \"\\2611 \";\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      #filters > ul:hover {\r\n");
      out.write("        background: white;\r\n");
      out.write("        box-shadow: 0 2px 8px rgba(0, 0, 0, 0.2);\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      #filters > ul:hover ul {\r\n");
      out.write("        list-style: none;\r\n");
      out.write("        padding-left: 0;\r\n");
      out.write("        display: block;\r\n");
      out.write("        column-count: 4;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      #filters > ul > li > ul {\r\n");
      out.write("        position: relative;\r\n");
      out.write("        top: 0;\r\n");
      out.write("        right: 0;\r\n");
      out.write("        display: none;\r\n");
      out.write("        padding: 1rem;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      label {\r\n");
      out.write("        cursor: pointer;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      input:checked ~ div section.position,\r\n");
      out.write("      input:checked ~ div #languages label {\r\n");
      out.write("        opacity: 0.25;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      #contact-mini {\r\n");
      out.write("        display: flex;\r\n");
      out.write("        margin-top: 1rem;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      #contact-mini > div {\r\n");
      out.write("        font-size: 0.75rem;\r\n");
      out.write("        flex: 1;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      #contact-mini > div:nth-child(2) {\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        flex: 2;\r\n");
      out.write("      }\r\n");
      out.write("      #contact-mini > div:last-child {\r\n");
      out.write("        text-align: right;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      input:checked ~ div #languages label[for]::before,\r\n");
      out.write("      input:not(:checked) ~ div #languages label[for]::before {\r\n");
      out.write("        content: \"\";\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      #contact {\r\n");
      out.write("        display: none;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      @media all and (min-width: 630px) {\r\n");
      out.write("        main {\r\n");
      out.write("          max-width: 600px;\r\n");
      out.write("        }\r\n");
      out.write("        #contact-mini > div {\r\n");
      out.write("          font-size: 1rem;\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      @media all and (min-width: 1000px) {\r\n");
      out.write("        html,\r\n");
      out.write("        body {\r\n");
      out.write("          font-size: 16px;\r\n");
      out.write("        }\r\n");
      out.write("        main {\r\n");
      out.write("          max-width: 920px;\r\n");
      out.write("          display: flex;\r\n");
      out.write("        }\r\n");
      out.write("        main > div:first-child {\r\n");
      out.write("          flex: 1;\r\n");
      out.write("        }\r\n");
      out.write("        main > div:last-child {\r\n");
      out.write("          width: 21%;\r\n");
      out.write("          margin-left: 4%;\r\n");
      out.write("        }\r\n");
      out.write("        #languages {\r\n");
      out.write("          column-count: 1;\r\n");
      out.write("        }\r\n");
      out.write("        .educert {\r\n");
      out.write("          display: block;\r\n");
      out.write("        }\r\n");
      out.write("        .educert > li:nth-child(n + 2) {\r\n");
      out.write("          margin-top: 0.75rem;\r\n");
      out.write("        }\r\n");
      out.write("        #contact-mini {\r\n");
      out.write("          display: none;\r\n");
      out.write("        }\r\n");
      out.write("        #contact {\r\n");
      out.write("          display: block;\r\n");
      out.write("        }\r\n");
      out.write("        #email,\r\n");
      out.write("        #website {\r\n");
      out.write("          font-size: 0.9em;\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      @media all and (min-width: 1200px) {\r\n");
      out.write("        html,\r\n");
      out.write("        body {\r\n");
      out.write("          font-size: 18px;\r\n");
      out.write("        }\r\n");
      out.write("        main {\r\n");
      out.write("          max-width: 1120px;\r\n");
      out.write("        }\r\n");
      out.write("        #email,\r\n");
      out.write("        #website {\r\n");
      out.write("          font-size: 1em !important;\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      @media print {\r\n");
      out.write("        @page {\r\n");
      out.write("          size: 900px;\r\n");
      out.write("        }\r\n");
      out.write("        html,\r\n");
      out.write("        body {\r\n");
      out.write("          background: #fff;\r\n");
      out.write("          font-size: 16px;\r\n");
      out.write("          width: 900px;\r\n");
      out.write("        }\r\n");
      out.write("        a,\r\n");
      out.write("        a:visited,\r\n");
      out.write("        a:link,\r\n");
      out.write("        a:active,\r\n");
      out.write("        a:focus,\r\n");
      out.write("        #languages label {\r\n");
      out.write("          text-decoration: none;\r\n");
      out.write("          color: #000;\r\n");
      out.write("        }\r\n");
      out.write("        main {\r\n");
      out.write("          margin: 0;\r\n");
      out.write("          max-width: 920px;\r\n");
      out.write("          display: flex;\r\n");
      out.write("          box-shadow: none;\r\n");
      out.write("        }\r\n");
      out.write("        main > div:first-child {\r\n");
      out.write("          flex: 1;\r\n");
      out.write("        }\r\n");
      out.write("        main > div:last-child {\r\n");
      out.write("          width: 21%;\r\n");
      out.write("          margin-left: 4%;\r\n");
      out.write("        }\r\n");
      out.write("        #filters {\r\n");
      out.write("          display: none;\r\n");
      out.write("        }\r\n");
      out.write("        #languages {\r\n");
      out.write("          column-count: 1;\r\n");
      out.write("        }\r\n");
      out.write("        .educert {\r\n");
      out.write("          display: block;\r\n");
      out.write("        }\r\n");
      out.write("        .educert > li:nth-child(n + 2) {\r\n");
      out.write("          margin-top: 0.75rem;\r\n");
      out.write("        }\r\n");
      out.write("        .position {\r\n");
      out.write("          opacity: 1 !important;\r\n");
      out.write("        }\r\n");
      out.write("        #contact-mini {\r\n");
      out.write("          display: none;\r\n");
      out.write("        }\r\n");
      out.write("        #contact {\r\n");
      out.write("          display: block;\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
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
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("        <button id=\"download\" class=\"button\" style=\"color: blue; background:white;\"><i class=\"fa fa-download\" style=\"color: blue\"></i>&nbsp;&nbsp;DOWNLOAD</button>\r\n");
      out.write("<input type=\"submit\" formtarget=\"../resume_det.jsp\" onclick=\"window.location.href='../resume_det.jsp'\" name=\"submit2\" value=\"edit details\" class=\"button button-primary float-right\" />\r\n");
      out.write("  \r\n");
      out.write("    <main id=\"resume\" itemscope itemtype=\"http://schema.org/Person\">\r\n");
      out.write("      <div>\r\n");
      out.write("        <header>\r\n");
      out.write("          ");

                        
                    try
                        {
                            String mail = session.getAttribute("userId").toString();
        
                            String query1="Select * from PERSONAL where UEMAIL='"+mail+"' " ;
                            ResultSet rs=stmt1.executeQuery(query1);
                            
                            while(rs.next()==true)
                            {
                               
      out.write("\r\n");
      out.write("          <h1 itemprop=\"name\">");
      out.print(rs.getString("UFNAME") );
      out.write("&nbsp;&nbsp; ");
      out.print(rs.getString("ULNAME") );
      out.write("</h1>\r\n");
      out.write("          <p id=\"objective\" itemprop=\"description\">\r\n");
      out.write("            <span itemprop=\"jobTitle\">&nbsp;&nbsp");
      out.print(rs.getString("UADDRESS") );
      out.write(" &nbsp;&nbsp;");
      out.print(rs.getString("UZIPCODE") );
      out.write("&nbsp;&nbsp;\r\n");
      out.write("                ");
      out.print(rs.getString("UCOUNTRY") );
      out.write("<br/></span>\r\n");
      out.write("                <span itemprop=\"jobTitle\">");
      out.print(rs.getString("USUM") );
      out.write("<br/><br/></span>\r\n");
      out.write("           \r\n");
      out.write("          </p>\r\n");
      out.write("          <address id=\"contact-mini\">\r\n");
      out.write("            <div itemprop=\"email\">\r\n");
      out.write("                <a href=\"\">\r\n");
      out.write("                    ");
      out.print(rs.getString("UEMAIL") );
      out.write("</a>\r\n");
      out.write("              \r\n");
      out.write("            </div>\r\n");
      out.write("              <a href=\"\">\r\n");
      out.write("               <span itemprop=\"telephone\">");
      out.print(rs.getString("UCONTACT") );
      out.write("</span></a>\r\n");
      out.write("            \r\n");
      out.write("           \r\n");
      out.write("          </address>   ");
 }

      out.write("\r\n");
      out.write("        </header>\r\n");
      out.write("        <section id=\"professional-experience\">\r\n");
      out.write("          <h2>Experience</h2>\r\n");
      out.write("          ");
  
                        int i = 0;
                            String query2="Select * from WORKEX  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query2);
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
      out.write("              <span itemprop=\"name\">");
      out.print(rs.getString("UPOSITION") );
      out.write("</span>\r\n");
      out.write("              </h3>\r\n");
      out.write("            <h4\r\n");
      out.write("              itemprop=\"member\"\r\n");
      out.write("              itemscope\r\n");
      out.write("              itemtype=\"http://schema.org/OrganizationRole\"\r\n");
      out.write("            >\r\n");
      out.write("              <span itemprop=\"roleName\">");
      out.print(rs.getString("UCOMPANY") );
      out.write("</span>\r\n");
      out.write("              <span class=\"dates\">\r\n");
      out.write("                <time itemprop=\"startDate\">");
      out.print(rs.getString("USTART") );
      out.write("</time>\r\n");
      out.write("                -\r\n");
      out.write("                <time itemprop=\"endDate\">");
      out.print(rs.getString("UEND") );
      out.write("</time>\r\n");
      out.write("              </span>\r\n");
      out.write("            </h4>\r\n");
      out.write("            <ul itemprop=\"description\">\r\n");
      out.write("              <li>\r\n");
      out.write("                ");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("\r\n");
      out.write("              </li></ul>\r\n");
      out.write("             \r\n");
      out.write("                          ");
  while(rs.next()==true)
                            {


      out.write("\r\n");
      out.write("<h3>\r\n");
      out.write("              <span itemprop=\"name\">");
      out.print(rs.getString("UPOSITION") );
      out.write("</span>\r\n");
      out.write("              </h3>\r\n");
      out.write("            <h4\r\n");
      out.write("              itemprop=\"member\"\r\n");
      out.write("              itemscope\r\n");
      out.write("              itemtype=\"http://schema.org/OrganizationRole\"\r\n");
      out.write("            >\r\n");
      out.write("              <span itemprop=\"roleName\">");
      out.print(rs.getString("UCOMPANY") );
      out.write("</span>\r\n");
      out.write("              <span class=\"dates\">\r\n");
      out.write("                <time itemprop=\"startDate\">");
      out.print(rs.getString("USTART") );
      out.write("</time>\r\n");
      out.write("                -\r\n");
      out.write("                <time itemprop=\"endDate\">");
      out.print(rs.getString("UEND") );
      out.write("</time>\r\n");
      out.write("              </span>\r\n");
      out.write("            </h4>\r\n");
      out.write("            <ul itemprop=\"description\">\r\n");
      out.write("              <li>\r\n");
      out.write("                ");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("\r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("                ");
 
                                 i++;
                            }
      out.write("\r\n");
      out.write("                          ");
 }

      out.write("\r\n");
      out.write("          </section>\r\n");
      out.write("\r\n");
      out.write("         \r\n");
      out.write("\r\n");
      out.write("         \r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("        </section>\r\n");
      out.write("          \r\n");
      out.write("         \r\n");
      out.write("      <section id=\"professional-experience\">\r\n");
      out.write("          <h2>Projects</h2>\r\n");
      out.write("          ");
  
                           int ll = 0;
                            String queryl="Select * from PROJECT  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(queryl);
                             if(rs.next()==true){ 
                                
                                
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("          <section\r\n");
      out.write("            itemprop=\"memberOf\"\r\n");
      out.write("            itemscope\r\n");
      out.write("            itemtype=\"http://schema.org/Organization\"\r\n");
      out.write("            class=\"position reactjs html css javascript kotlin a11y less api\"\r\n");
      out.write("          >\r\n");
      out.write("            <h3>\r\n");
      out.write("              <span itemprop=\"name\">");
      out.print(rs.getString("PNAME") );
      out.write("</span>\r\n");
      out.write("              </h3>\r\n");
      out.write("            <h4\r\n");
      out.write("              itemprop=\"member\"\r\n");
      out.write("              itemscope\r\n");
      out.write("              itemtype=\"http://schema.org/OrganizationRole\"\r\n");
      out.write("            >\r\n");
      out.write("              <span class=\"dates\">\r\n");
      out.write("                <time itemprop=\"startDate\">");
      out.print(rs.getString("USTART") );
      out.write("</time>\r\n");
      out.write("                -\r\n");
      out.write("                <time itemprop=\"endDate\">");
      out.print(rs.getString("UEND") );
      out.write("</time>\r\n");
      out.write("              </span>\r\n");
      out.write("            </h4>\r\n");
      out.write("            <ul itemprop=\"description\">\r\n");
      out.write("              <li>\r\n");
      out.write("                ");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("\r\n");
      out.write("              </li></ul>\r\n");
      out.write("             \r\n");
      out.write("                          ");
  while(rs.next()==true)
                            {


      out.write("\r\n");
      out.write("<h3>\r\n");
      out.write("              <span itemprop=\"name\">");
      out.print(rs.getString("PNAME") );
      out.write("</span>\r\n");
      out.write("              </h3>\r\n");
      out.write("            <h4\r\n");
      out.write("              itemprop=\"member\"\r\n");
      out.write("              itemscope\r\n");
      out.write("              itemtype=\"http://schema.org/OrganizationRole\"\r\n");
      out.write("            >\r\n");
      out.write("              <span class=\"dates\">\r\n");
      out.write("                <time itemprop=\"startDate\">");
      out.print(rs.getString("USTART") );
      out.write("</time>\r\n");
      out.write("                -\r\n");
      out.write("                <time itemprop=\"endDate\">");
      out.print(rs.getString("UEND") );
      out.write("</time>\r\n");
      out.write("              </span>\r\n");
      out.write("            </h4>\r\n");
      out.write("            <ul itemprop=\"description\">\r\n");
      out.write("              <li>\r\n");
      out.write("                ");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("\r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("                ");
 
                                 ll++;
                            }
      out.write("\r\n");
      out.write("                          ");
 }

      out.write("\r\n");
      out.write("          </section>\r\n");
      out.write("</section>\r\n");
      out.write("          \r\n");
      out.write("          <section id=\"professional-experience3\">\r\n");
      out.write("          <h2>Certifications</h2>\r\n");
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
      out.write("              <span itemprop=\"name\">");
      out.print(rs.getString("UCERTI") );
      out.write("</span>\r\n");
      out.write("              </h3>\r\n");
      out.write("            \r\n");
      out.write("              <p>\r\n");
      out.write("                ");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("\r\n");
      out.write("              </p>\r\n");
      out.write("             \r\n");
      out.write("                          ");
  while(rs.next()==true)
                            {


      out.write("\r\n");
      out.write("  <h3>\r\n");
      out.write("              <span itemprop=\"name\">");
      out.print(rs.getString("UCERTI") );
      out.write("</span>\r\n");
      out.write("              </h3>\r\n");
      out.write("            \r\n");
      out.write("              <p>\r\n");
      out.write("                  ");
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

      out.write("\r\n");
      out.write("         \r\n");
      out.write("\r\n");
      out.write("       </section>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div>\r\n");
      out.write("           ");

                        
                   String queryp="Select * from PERSONAL where UEMAIL='"+mail+"' " ;
                           rs=stmt1.executeQuery(queryp);
                            
                            while(rs.next()==true)
                            {
                               
      out.write("\r\n");
      out.write("        <address id=\"contact\" class=\"contact-2\">\r\n");
      out.write("          <div\r\n");
      out.write("            id=\"location\"\r\n");
      out.write("            itemprop=\"address\"\r\n");
      out.write("            itemscope\r\n");
      out.write("            itemtype=\"http://schema.org/PostalAddress\"\r\n");
      out.write("          >\r\n");
      out.write("            \r\n");
      out.write("          </div>\r\n");
      out.write("          <a href=\"\" id=\"phone\">");
      out.print(rs.getString("UCONTACT") );
      out.write("</a>\r\n");
      out.write("          <div>\r\n");
      out.write("            <a href=\"\" id=\"email\"\r\n");
      out.write("              >");
      out.print(rs.getString("UEMAIL") );
      out.write("</a\r\n");
      out.write("            >\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("        </address>\r\n");
 } 
      out.write("\r\n");
      out.write("        <section>\r\n");
      out.write("          <h2>Programming Languages</h2>\r\n");
      out.write("            \r\n");
      out.write("        ");
   int l = 0;
                            String query5="Select * from SKILLS  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query5);
                             if(rs.next()==true){ 
                     
      out.write("\r\n");
      out.write("          <ul class=\"no-bullets\" id=\"languages\">\r\n");
      out.write("           \r\n");
      out.write("            <li><label for=\"html\" itemprop=\"knowsAbout\">");
      out.print(rs.getString("SK") );
      out.write("</label></li>\r\n");
      out.write("            ");

                            while(rs.next()==true)
                            {
                                
      out.write("\r\n");
      out.write("            <li><label for=\"html\" itemprop=\"knowsAbout\">");
      out.print(rs.getString("SK") );
      out.write("</label></li>\r\n");
      out.write("           \r\n");
      out.write("                                    \r\n");
      out.write("             ");

                           l++;
                            } 
      out.write("\r\n");
      out.write("        </ul> </section>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <section>\r\n");
      out.write("          <h2>Education</h2>\r\n");
      out.write("            ");

                         int k = 0;
                            String query4="Select * from EDUCATION  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query4);
                             if(rs.next()==true){ 
                                
      out.write("\r\n");
      out.write("          <ul class=\"no-bullets educert\">\r\n");
      out.write("            <li\r\n");
      out.write("              itemprop=\"alumniOf\"\r\n");
      out.write("              itemscope\r\n");
      out.write("              itemtype=\"http://schema.org/EducationalOrganization\"\r\n");
      out.write("            >\r\n");
      out.write("                 <span itemprop=\"name\">");
      out.print(rs.getString("UPROGRAM") );
      out.write("</span>\r\n");
      out.write("              <ul>\r\n");
      out.write("                <li itemprop=\"award\">");
      out.print(rs.getString("UINSTITUTE") );
      out.write("</li>\r\n");
      out.write("                <li itemprop=\"award\">");
      out.print(rs.getString("USTART") );
      out.write(" - ");
      out.print(rs.getString("UEND") );
      out.write("</li>\r\n");
      out.write("              <li itemprop=\"award\"> Marks:        ");
      out.print(rs.getString("UCGPA") );
      out.write("</li>\r\n");
      out.write("              \r\n");
      out.write("              </ul><br/>\r\n");
      out.write("                                ");
 
                            while(rs.next()==true)
                            {
                                
      out.write("\r\n");
      out.write("                       \r\n");
      out.write("                        <span itemprop=\"name\">");
      out.print(rs.getString("UPROGRAM") );
      out.write("</span>\r\n");
      out.write("              <ul>\r\n");
      out.write("                <li itemprop=\"award\">");
      out.print(rs.getString("UINSTITUTE") );
      out.write("</li>\r\n");
      out.write("                <li itemprop=\"award\">");
      out.print(rs.getString("USTART") );
      out.write(" - ");
      out.print(rs.getString("UEND") );
      out.write("</li>\r\n");
      out.write("              <li itemprop=\"award\"> Marks:        ");
      out.print(rs.getString("UCGPA") );
      out.write("</li>\r\n");
      out.write("              \r\n");
      out.write("              </ul><br/>\r\n");
      out.write("                         ");

                           k++;
                            }
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("                          \r\n");
      out.write("                            ");
 } 
      out.write("\r\n");
      out.write("              \r\n");
      out.write("      \r\n");
      out.write("     \r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <section>\r\n");
      out.write("          <h2>Hobbies</h2>\r\n");
      out.write("            ");

                         int jp = 0;
                            String query3="Select * from UHOBBY  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query3);
                             if(rs.next()==true){ 
                                
      out.write("\r\n");
      out.write("          <ul class=\"no-bullets\">\r\n");
      out.write("            <li>\r\n");
      out.write("              <span>");
      out.print(rs.getString("UINTREST") );
      out.write("</span></li>\r\n");
      out.write("             ");
 
                          while(rs.next()==true)
                            {
                                
      out.write("\r\n");
      out.write("                             <li>   <span>");
      out.print(rs.getString("UINTREST") );
      out.write("</span></li>\r\n");
      out.write("                                  ");

                           jp++;
                            }
      out.write("\r\n");
      out.write("                                \r\n");
      out.write("            \r\n");
      out.write("          </ul>");
 } 
      out.write("\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <section>\r\n");
      out.write("          <h2>Languages</h2>\r\n");
      out.write("            ");
  
                                       
                         int M = 0;
                            String query6="Select * from LANGUAGE  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query6);
                              if(rs.next()==true){ 
                                
      out.write("\r\n");
      out.write("          <ul class=\"no-bullets educert\">\r\n");
      out.write("            <li>\r\n");
      out.write("             \r\n");
      out.write("              <ul>\r\n");
      out.write("                <li>");
      out.print(rs.getString("ULANGUAGE") );
      out.write("</li>\r\n");
      out.write("                 ");
   while(rs.next()==true)
                            {
                                
      out.write("\r\n");
      out.write("                                     \r\n");
      out.write("\t\t\t<li>");
      out.print(rs.getString("ULANGUAGE") );
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t\t\t ");

                           M++;
                            }
                                                         
      out.write("\t\r\n");
      out.write("                \r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("           \r\n");
      out.write("            \r\n");
      out.write("          </ul>");
 } 
      out.write("\r\n");
      out.write("        </section>\r\n");
      out.write("      </div>\r\n");
      out.write("           ");

                        }
                        catch(Exception ex)
                        {
                            ex.printStackTrace();
                        }
                  
                    
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("    </main>\r\n");
      out.write("                     <script>\r\n");
      out.write("    window.onload = function () {\r\n");
      out.write("    document.getElementById(\"download\")\r\n");
      out.write("        .addEventListener(\"click\", () => {\r\n");
      out.write("            const resume = this.document.getElementById(\"resume\");\r\n");
      out.write("            console.log(resume);\r\n");
      out.write("            console.log(window);\r\n");
      out.write("            \r\n");
      out.write("            html2pdf().from(resume).save();\r\n");
      out.write("        })\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script> \r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
