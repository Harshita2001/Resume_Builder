package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.security.interfaces.RSAKey;
import java.sql.*;
import java.io.*;

public final class Template4_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta\n");
      out.write("      name=\"viewport\"\n");
      out.write("      content=\"width=device-width,initial-scale=1,shrink-to-fit=no\"\n");
      out.write("    />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"http://yui.yahooapis.com/2.7.0/build/reset-fonts-grids/reset-fonts-grids.css\" media=\"all\" /> \n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"resume.css\" media=\"all\" />\n");
      out.write("\n");
      out.write("    <title>Resume</title>\n");
      out.write("  \n");
      out.write("    <style>\n");
      out.write("      @import url(\"https://fonts.googleapis.com/css?family=Quicksand:400,700\");\n");
      out.write("\n");
      out.write("      html,\n");
      out.write("      body {\n");
      out.write("        background: #ccc;\n");
      out.write("        font-family: Quicksand, Arial, Verdana, sans-serif;\n");
      out.write("        font-size: 14px;\n");
      out.write("        color: #444;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      main {\n");
      out.write("        background: #fff;\n");
      out.write("        box-sizing: border-box;\n");
      out.write("        box-shadow: 0 3px 10px rgba(0, 0, 0, 0.25);\n");
      out.write("        margin: 2rem auto;\n");
      out.write("        padding: 2.75rem;\n");
      out.write("        position: relative;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      h1 {\n");
      out.write("        margin: 0;\n");
      out.write("        font-size: 2.5rem;\n");
      out.write("        line-height: 2rem;\n");
      out.write("        font-weight: normal;\n");
      out.write("        color: #000;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      h2 {\n");
      out.write("        color: #47a;\n");
      out.write("        font-size: 1rem;\n");
      out.write("        font-weight: bold;\n");
      out.write("        margin: 0;\n");
      out.write("        margin-top: 1.5rem;\n");
      out.write("        text-transform: uppercase;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      h3 {\n");
      out.write("        color: #111;\n");
      out.write("        font-size: 1.25rem;\n");
      out.write("        margin-top: 0rem;\n");
      out.write("        margin: 0;\n");
      out.write("        font-weight: normal;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      h3 span.dept {\n");
      out.write("        color: #aaa;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      h3 span.dept::before {\n");
      out.write("        content: \"\";\n");
      out.write("        border-left: 1px solid #ccc;\n");
      out.write("        padding-left: 0.4rem;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      h4 {\n");
      out.write("        margin: 0;\n");
      out.write("        font-weight: normal;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      h4 span.dates {\n");
      out.write("        color: #888;\n");
      out.write("        display: inline-block;\n");
      out.write("        float: right;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      p {\n");
      out.write("        font-size: 1rem;\n");
      out.write("        margin-top: 0.5rem;\n");
      out.write("        margin-bottom: 0;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      a {\n");
      out.write("        color: #369;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("     \n");
      out.write("\n");
      out.write("      time {\n");
      out.write("        display: inline-block;\n");
      out.write("        min-width: 2rem;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      address {\n");
      out.write("        font-style: normal;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .normal {\n");
      out.write("        font-weight: normal;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .position {\n");
      out.write("        margin-top: 0.75rem;\n");
      out.write("        transition: opacity 0.7s;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .no-bullets,\n");
      out.write("      .no-bullets ul {\n");
      out.write("        list-style: none;\n");
      out.write("        margin-left: 0;\n");
      out.write("        padding-left: 0;\n");
      out.write("        color: #000;\n");
      out.write("        font-weight: bold;\n");
      out.write("      }\n");
      out.write("      .no-bullets ul {\n");
      out.write("        font-weight: normal;\n");
      out.write("      }\n");
      out.write("      .no-bullets span {\n");
      out.write("        color: #666;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      #contact {\n");
      out.write("        text-align: right;\n");
      out.write("        font-size: 0.9rem;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      #phone {\n");
      out.write("        font-size: 1.25rem;\n");
      out.write("        font-weight: bold;\n");
      out.write("        text-decoration: none !important;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      #location {\n");
      out.write("        font-size: 1.1rem;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      #languages {\n");
      out.write("        column-count: 4;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      a,\n");
      out.write("      a:visited,\n");
      out.write("      a:link,\n");
      out.write("      a:active,\n");
      out.write("      a:focus,\n");
      out.write("      #languages label {\n");
      out.write("        color: #395;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      #professional-experience {\n");
      out.write("        position: relative;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      main input {\n");
      out.write("        position: absolute;\n");
      out.write("        left: -10000px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .educert {\n");
      out.write("        display: flex;\n");
      out.write("      }\n");
      out.write("      .educert li {\n");
      out.write("        flex: 1;\n");
      out.write("        align-items: start;\n");
      out.write("        justify-content: start;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      #filters {\n");
      out.write("        position: absolute;\n");
      out.write("        top: 0;\n");
      out.write("        right: 0;\n");
      out.write("        z-index: 1;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      #filters > ul {\n");
      out.write("        list-style: none;\n");
      out.write("        padding-left: 0;\n");
      out.write("        margin: -0.5rem;\n");
      out.write("        padding: 0.5rem;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      #filters > ul > li > h3 {\n");
      out.write("        margin: 0;\n");
      out.write("        display: block;\n");
      out.write("        text-align: right;\n");
      out.write("        font-weight: bold;\n");
      out.write("        font-size: 1rem;\n");
      out.write("        color: #395;\n");
      out.write("        text-transform: uppercase;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      #filters > ul > li > h3::before {\n");
      out.write("        content: \"\\2610 \";\n");
      out.write("        font-size: 1.2rem;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      input:checked ~ div #filters > ul > li > h3::before {\n");
      out.write("        content: \"\\2611 \";\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      #filters > ul:hover {\n");
      out.write("        background: white;\n");
      out.write("        box-shadow: 0 2px 8px rgba(0, 0, 0, 0.2);\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      #filters > ul:hover ul {\n");
      out.write("        list-style: none;\n");
      out.write("        padding-left: 0;\n");
      out.write("        display: block;\n");
      out.write("        column-count: 4;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      #filters > ul > li > ul {\n");
      out.write("        position: relative;\n");
      out.write("        top: 0;\n");
      out.write("        right: 0;\n");
      out.write("        display: none;\n");
      out.write("        padding: 1rem;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      label {\n");
      out.write("        cursor: pointer;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      input:checked ~ div section.position,\n");
      out.write("      input:checked ~ div #languages label {\n");
      out.write("        opacity: 0.25;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("\n");
      out.write("      #contact-mini {\n");
      out.write("        display: flex;\n");
      out.write("        margin-top: 1rem;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      #contact-mini > div {\n");
      out.write("        font-size: 0.75rem;\n");
      out.write("        flex: 1;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      #contact-mini > div:nth-child(2) {\n");
      out.write("        text-align: center;\n");
      out.write("        flex: 2;\n");
      out.write("      }\n");
      out.write("      #contact-mini > div:last-child {\n");
      out.write("        text-align: right;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      input:checked ~ div #languages label[for]::before,\n");
      out.write("      input:not(:checked) ~ div #languages label[for]::before {\n");
      out.write("        content: \"\";\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      #contact {\n");
      out.write("        display: none;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      @media all and (min-width: 630px) {\n");
      out.write("        main {\n");
      out.write("          max-width: 600px;\n");
      out.write("        }\n");
      out.write("        #contact-mini > div {\n");
      out.write("          font-size: 1rem;\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      @media all and (min-width: 1000px) {\n");
      out.write("        html,\n");
      out.write("        body {\n");
      out.write("          font-size: 16px;\n");
      out.write("        }\n");
      out.write("        main {\n");
      out.write("          max-width: 920px;\n");
      out.write("          display: flex;\n");
      out.write("        }\n");
      out.write("        main > div:first-child {\n");
      out.write("          flex: 1;\n");
      out.write("        }\n");
      out.write("        main > div:last-child {\n");
      out.write("          width: 21%;\n");
      out.write("          margin-left: 4%;\n");
      out.write("        }\n");
      out.write("        #languages {\n");
      out.write("          column-count: 1;\n");
      out.write("        }\n");
      out.write("        .educert {\n");
      out.write("          display: block;\n");
      out.write("        }\n");
      out.write("        .educert > li:nth-child(n + 2) {\n");
      out.write("          margin-top: 0.75rem;\n");
      out.write("        }\n");
      out.write("        #contact-mini {\n");
      out.write("          display: none;\n");
      out.write("        }\n");
      out.write("        #contact {\n");
      out.write("          display: block;\n");
      out.write("        }\n");
      out.write("        #email,\n");
      out.write("        #website {\n");
      out.write("          font-size: 0.9em;\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      @media all and (min-width: 1200px) {\n");
      out.write("        html,\n");
      out.write("        body {\n");
      out.write("          font-size: 18px;\n");
      out.write("        }\n");
      out.write("        main {\n");
      out.write("          max-width: 1120px;\n");
      out.write("        }\n");
      out.write("        #email,\n");
      out.write("        #website {\n");
      out.write("          font-size: 1em !important;\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      @media print {\n");
      out.write("        @page {\n");
      out.write("          size: 900px;\n");
      out.write("        }\n");
      out.write("        html,\n");
      out.write("        body {\n");
      out.write("          background: #fff;\n");
      out.write("          font-size: 16px;\n");
      out.write("          width: 900px;\n");
      out.write("        }\n");
      out.write("        a,\n");
      out.write("        a:visited,\n");
      out.write("        a:link,\n");
      out.write("        a:active,\n");
      out.write("        a:focus,\n");
      out.write("        #languages label {\n");
      out.write("          text-decoration: none;\n");
      out.write("          color: #000;\n");
      out.write("        }\n");
      out.write("        main {\n");
      out.write("          margin: 0;\n");
      out.write("          max-width: 920px;\n");
      out.write("          display: flex;\n");
      out.write("          box-shadow: none;\n");
      out.write("        }\n");
      out.write("        main > div:first-child {\n");
      out.write("          flex: 1;\n");
      out.write("        }\n");
      out.write("        main > div:last-child {\n");
      out.write("          width: 21%;\n");
      out.write("          margin-left: 4%;\n");
      out.write("        }\n");
      out.write("        #filters {\n");
      out.write("          display: none;\n");
      out.write("        }\n");
      out.write("        #languages {\n");
      out.write("          column-count: 1;\n");
      out.write("        }\n");
      out.write("        .educert {\n");
      out.write("          display: block;\n");
      out.write("        }\n");
      out.write("        .educert > li:nth-child(n + 2) {\n");
      out.write("          margin-top: 0.75rem;\n");
      out.write("        }\n");
      out.write("        .position {\n");
      out.write("          opacity: 1 !important;\n");
      out.write("        }\n");
      out.write("        #contact-mini {\n");
      out.write("          display: none;\n");
      out.write("        }\n");
      out.write("        #contact {\n");
      out.write("          display: block;\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <main id=\"resume\" itemscope itemtype=\"http://schema.org/Person\">\n");
      out.write("      <div>\n");
      out.write("        <header>\n");
      out.write("            <button id=\"download\" style=\"color: blue;border-radius: 25px;background:black; width:250px\"><i class=\"fa fa-download\" style=\"color: blue\"></i>DOWNLOAD</button>\n");
      out.write("\n");
      out.write("            ");

                        
                    try
                        {
                            String mail = session.getAttribute("userId").toString();
        
                            String query1="Select * from PERSONAL where UEMAIL='"+mail+"' " ;
                            ResultSet rs=stmt1.executeQuery(query1);
                            
                            while(rs.next()==true)
                            {
                               
      out.write("\n");
      out.write("          <h1 itemprop=\"name\">");
      out.print(rs.getString("UFNAME") );
      out.write("&nbsp;&nbsp; ");
      out.print(rs.getString("ULNAME") );
      out.write("</h1>\n");
      out.write("          <p id=\"objective\" itemprop=\"description\">\n");
      out.write("            <span itemprop=\"jobTitle\">&nbsp;&nbsp");
      out.print(rs.getString("UADDRESS") );
      out.write(" &nbsp;&nbsp;");
      out.print(rs.getString("UZIPCODE") );
      out.write("&nbsp;&nbsp;\n");
      out.write("                ");
      out.print(rs.getString("UCOUNTRY") );
      out.write("<br/></span>\n");
      out.write("                <span itemprop=\"jobTitle\">");
      out.print(rs.getString("USUM") );
      out.write("<br/><br/></span>\n");
      out.write("           \n");
      out.write("          </p>\n");
      out.write("          <address id=\"contact-mini\">\n");
      out.write("            <div itemprop=\"email\">\n");
      out.write("                <a href=\"\">\n");
      out.write("                    ");
      out.print(rs.getString("UEMAIL") );
      out.write("</a>\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("              <a href=\"\">\n");
      out.write("               <span itemprop=\"telephone\">");
      out.print(rs.getString("UCONTACT") );
      out.write("</span></a>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("          </address>   ");
 }

      out.write("\n");
      out.write("        </header>\n");
      out.write("        <section id=\"professional-experience\">\n");
      out.write("          <h2>Experience</h2>\n");
      out.write("          ");
  
                        int i = 0;
                            String query2="Select * from WORKEX  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query2);
                              if(rs.next()==true){ 
                                
      out.write("\n");
      out.write("                                \n");
      out.write("          <section\n");
      out.write("            itemprop=\"memberOf\"\n");
      out.write("            itemscope\n");
      out.write("            itemtype=\"http://schema.org/Organization\"\n");
      out.write("            class=\"position reactjs html css javascript kotlin a11y less api\"\n");
      out.write("          >\n");
      out.write("            <h3>\n");
      out.write("              <span itemprop=\"name\">");
      out.print(rs.getString("UPOSITION") );
      out.write("</span>\n");
      out.write("              </h3>\n");
      out.write("            <h4\n");
      out.write("              itemprop=\"member\"\n");
      out.write("              itemscope\n");
      out.write("              itemtype=\"http://schema.org/OrganizationRole\"\n");
      out.write("            >\n");
      out.write("              <span itemprop=\"roleName\">");
      out.print(rs.getString("UCOMPANY") );
      out.write("</span>\n");
      out.write("              <span class=\"dates\">\n");
      out.write("                <time itemprop=\"startDate\">");
      out.print(rs.getString("USTART") );
      out.write("</time>\n");
      out.write("                -\n");
      out.write("                <time itemprop=\"endDate\">");
      out.print(rs.getString("UEND") );
      out.write("</time>\n");
      out.write("              </span>\n");
      out.write("            </h4>\n");
      out.write("            <ul itemprop=\"description\">\n");
      out.write("              <li>\n");
      out.write("                ");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("\n");
      out.write("              </li></ul>\n");
      out.write("             \n");
      out.write("                          ");
  while(rs.next()==true)
                            {


      out.write("\n");
      out.write("<h3>\n");
      out.write("              <span itemprop=\"name\">");
      out.print(rs.getString("UPOSITION") );
      out.write("</span>\n");
      out.write("              </h3>\n");
      out.write("            <h4\n");
      out.write("              itemprop=\"member\"\n");
      out.write("              itemscope\n");
      out.write("              itemtype=\"http://schema.org/OrganizationRole\"\n");
      out.write("            >\n");
      out.write("              <span itemprop=\"roleName\">");
      out.print(rs.getString("UCOMPANY") );
      out.write("</span>\n");
      out.write("              <span class=\"dates\">\n");
      out.write("                <time itemprop=\"startDate\">");
      out.print(rs.getString("USTART") );
      out.write("</time>\n");
      out.write("                -\n");
      out.write("                <time itemprop=\"endDate\">");
      out.print(rs.getString("UEND") );
      out.write("</time>\n");
      out.write("              </span>\n");
      out.write("            </h4>\n");
      out.write("            <ul itemprop=\"description\">\n");
      out.write("              <li>\n");
      out.write("                ");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("                ");
 
                                 i++;
                            }
      out.write("\n");
      out.write("                          ");
 }

      out.write("\n");
      out.write("          </section>\n");
      out.write("\n");
      out.write("         \n");
      out.write("\n");
      out.write("         \n");
      out.write("\n");
      out.write(" \n");
      out.write("        </section>\n");
      out.write("          \n");
      out.write("         \n");
      out.write("      <section id=\"professional-experience\">\n");
      out.write("          <h2>Projects</h2>\n");
      out.write("          ");
  
                           int ll = 0;
                            String queryl="Select * from PROJECT  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(queryl);
                             if(rs.next()==true){ 
                                
                                
      out.write("\n");
      out.write("                            \n");
      out.write("          <section\n");
      out.write("            itemprop=\"memberOf\"\n");
      out.write("            itemscope\n");
      out.write("            itemtype=\"http://schema.org/Organization\"\n");
      out.write("            class=\"position reactjs html css javascript kotlin a11y less api\"\n");
      out.write("          >\n");
      out.write("            <h3>\n");
      out.write("              <span itemprop=\"name\">");
      out.print(rs.getString("PNAME") );
      out.write("</span>\n");
      out.write("              </h3>\n");
      out.write("            <h4\n");
      out.write("              itemprop=\"member\"\n");
      out.write("              itemscope\n");
      out.write("              itemtype=\"http://schema.org/OrganizationRole\"\n");
      out.write("            >\n");
      out.write("              <span class=\"dates\">\n");
      out.write("                <time itemprop=\"startDate\">");
      out.print(rs.getString("USTART") );
      out.write("</time>\n");
      out.write("                -\n");
      out.write("                <time itemprop=\"endDate\">");
      out.print(rs.getString("UEND") );
      out.write("</time>\n");
      out.write("              </span>\n");
      out.write("            </h4>\n");
      out.write("            <ul itemprop=\"description\">\n");
      out.write("              <li>\n");
      out.write("                ");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("\n");
      out.write("              </li></ul>\n");
      out.write("             \n");
      out.write("                          ");
  while(rs.next()==true)
                            {


      out.write("\n");
      out.write("<h3>\n");
      out.write("              <span itemprop=\"name\">");
      out.print(rs.getString("PNAME") );
      out.write("</span>\n");
      out.write("              </h3>\n");
      out.write("            <h4\n");
      out.write("              itemprop=\"member\"\n");
      out.write("              itemscope\n");
      out.write("              itemtype=\"http://schema.org/OrganizationRole\"\n");
      out.write("            >\n");
      out.write("              <span class=\"dates\">\n");
      out.write("                <time itemprop=\"startDate\">");
      out.print(rs.getString("USTART") );
      out.write("</time>\n");
      out.write("                -\n");
      out.write("                <time itemprop=\"endDate\">");
      out.print(rs.getString("UEND") );
      out.write("</time>\n");
      out.write("              </span>\n");
      out.write("            </h4>\n");
      out.write("            <ul itemprop=\"description\">\n");
      out.write("              <li>\n");
      out.write("                ");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("                ");
 
                                 ll++;
                            }
      out.write("\n");
      out.write("                          ");
 }

      out.write("\n");
      out.write("          </section>\n");
      out.write("</section>\n");
      out.write("          \n");
      out.write("          <section id=\"professional-experience3\">\n");
      out.write("          <h2>Certifications</h2>\n");
      out.write("          ");
  
                 int j = 0;
                            String queryj="Select * from CERTIFICATE  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(queryj);
                              if(rs.next()==true){ 
                                
      out.write("\n");
      out.write("                                \n");
      out.write("          <section\n");
      out.write("            itemprop=\"memberOf\"\n");
      out.write("            itemscope\n");
      out.write("            itemtype=\"http://schema.org/Organization\"\n");
      out.write("            class=\"position reactjs html css javascript kotlin a11y less api\"\n");
      out.write("          >\n");
      out.write("            <h3>\n");
      out.write("              <span itemprop=\"name\">");
      out.print(rs.getString("UCERTI") );
      out.write("</span>\n");
      out.write("              </h3>\n");
      out.write("            \n");
      out.write("              <p>\n");
      out.write("                ");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("\n");
      out.write("              </p>\n");
      out.write("             \n");
      out.write("                          ");
  while(rs.next()==true)
                            {


      out.write("\n");
      out.write("  <h3>\n");
      out.write("              <span itemprop=\"name\">");
      out.print(rs.getString("UCERTI") );
      out.write("</span>\n");
      out.write("              </h3>\n");
      out.write("            \n");
      out.write("              <p>\n");
      out.write("                  ");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("</p>\n");
      out.write("              \n");
      out.write("                ");
 
                                 j++;
                            }
      out.write("\n");
      out.write("                          \n");
      out.write("          </section>\n");
 }

      out.write("\n");
      out.write("         \n");
      out.write("\n");
      out.write("       </section>\n");
      out.write("      </div>\n");
      out.write("      <div>\n");
      out.write("           ");

                        
                   String queryp="Select * from PERSONAL where UEMAIL='"+mail+"' " ;
                           rs=stmt1.executeQuery(queryp);
                            
                            while(rs.next()==true)
                            {
                               
      out.write("\n");
      out.write("        <address id=\"contact\" class=\"contact-2\">\n");
      out.write("          <div\n");
      out.write("            id=\"location\"\n");
      out.write("            itemprop=\"address\"\n");
      out.write("            itemscope\n");
      out.write("            itemtype=\"http://schema.org/PostalAddress\"\n");
      out.write("          >\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("          <a href=\"\" id=\"phone\">");
      out.print(rs.getString("UCONTACT") );
      out.write("</a>\n");
      out.write("          <div>\n");
      out.write("            <a href=\"\" id=\"email\"\n");
      out.write("              >");
      out.print(rs.getString("UEMAIL") );
      out.write("</a\n");
      out.write("            >\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("        </address>\n");
 } 
      out.write("\n");
      out.write("        <section>\n");
      out.write("          <h2>Programming Languages</h2>\n");
      out.write("            \n");
      out.write("        ");
   int l = 0;
                            String query5="Select * from SKILLS  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query5);
                             if(rs.next()==true){ 
                     
      out.write("\n");
      out.write("          <ul class=\"no-bullets\" id=\"languages\">\n");
      out.write("           \n");
      out.write("            <li><label for=\"html\" itemprop=\"knowsAbout\">");
      out.print(rs.getString("SK") );
      out.write("</label></li>\n");
      out.write("            ");

                            while(rs.next()==true)
                            {
                                
      out.write("\n");
      out.write("            <li><label for=\"html\" itemprop=\"knowsAbout\">");
      out.print(rs.getString("SK") );
      out.write("</label></li>\n");
      out.write("           \n");
      out.write("                                    \n");
      out.write("             ");

                           l++;
                            } 
      out.write("\n");
      out.write("        </ul> </section>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("        <section>\n");
      out.write("          <h2>Education</h2>\n");
      out.write("            ");

                         int k = 0;
                            String query4="Select * from EDUCATION  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query4);
                             if(rs.next()==true){ 
                                
      out.write("\n");
      out.write("          <ul class=\"no-bullets educert\">\n");
      out.write("            <li\n");
      out.write("              itemprop=\"alumniOf\"\n");
      out.write("              itemscope\n");
      out.write("              itemtype=\"http://schema.org/EducationalOrganization\"\n");
      out.write("            >\n");
      out.write("                 <span itemprop=\"name\">");
      out.print(rs.getString("UPROGRAM") );
      out.write("</span>\n");
      out.write("              <ul>\n");
      out.write("                <li itemprop=\"award\">");
      out.print(rs.getString("UINSTITUTE") );
      out.write("</li>\n");
      out.write("                <li itemprop=\"award\">");
      out.print(rs.getString("USTART") );
      out.write(" - ");
      out.print(rs.getString("UEND") );
      out.write("</li>\n");
      out.write("              <li itemprop=\"award\"> Marks:        ");
      out.print(rs.getString("UCGPA") );
      out.write("</li>\n");
      out.write("              \n");
      out.write("              </ul><br/>\n");
      out.write("                                ");
 
                            while(rs.next()==true)
                            {
                                
      out.write("\n");
      out.write("                       \n");
      out.write("                        <span itemprop=\"name\">");
      out.print(rs.getString("UPROGRAM") );
      out.write("</span>\n");
      out.write("              <ul>\n");
      out.write("                <li itemprop=\"award\">");
      out.print(rs.getString("UINSTITUTE") );
      out.write("</li>\n");
      out.write("                <li itemprop=\"award\">");
      out.print(rs.getString("USTART") );
      out.write(" - ");
      out.print(rs.getString("UEND") );
      out.write("</li>\n");
      out.write("              <li itemprop=\"award\"> Marks:        ");
      out.print(rs.getString("UCGPA") );
      out.write("</li>\n");
      out.write("              \n");
      out.write("              </ul><br/>\n");
      out.write("                         ");

                           k++;
                            }
      out.write("\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                          \n");
      out.write("                            ");
 } 
      out.write("\n");
      out.write("              \n");
      out.write("      \n");
      out.write("     \n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <section>\n");
      out.write("          <h2>Hobbies</h2>\n");
      out.write("            ");

                         int jp = 0;
                            String query3="Select * from UHOBBY  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query3);
                             if(rs.next()==true){ 
                                
      out.write("\n");
      out.write("          <ul class=\"no-bullets\">\n");
      out.write("            <li>\n");
      out.write("              <span>");
      out.print(rs.getString("UINTREST") );
      out.write("</span></li>\n");
      out.write("             ");
 
                          while(rs.next()==true)
                            {
                                
      out.write("\n");
      out.write("                             <li>   <span>");
      out.print(rs.getString("UINTREST") );
      out.write("</span></li>\n");
      out.write("                                  ");

                           jp++;
                            }
      out.write("\n");
      out.write("                                \n");
      out.write("            \n");
      out.write("          </ul>");
 } 
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <section>\n");
      out.write("          <h2>Languages</h2>\n");
      out.write("            ");
  
                                       
                         int M = 0;
                            String query6="Select * from LANGUAGE  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query6);
                              if(rs.next()==true){ 
                                
      out.write("\n");
      out.write("          <ul class=\"no-bullets educert\">\n");
      out.write("            <li>\n");
      out.write("             \n");
      out.write("              <ul>\n");
      out.write("                <li>");
      out.print(rs.getString("ULANGUAGE") );
      out.write("</li>\n");
      out.write("                 ");
   while(rs.next()==true)
                            {
                                
      out.write("\n");
      out.write("                                     \n");
      out.write("\t\t\t<li>");
      out.print(rs.getString("ULANGUAGE") );
      out.write("</li>\n");
      out.write("\t\t\t\t\t\t\t ");

                           M++;
                            }
                                                         
      out.write("\t\n");
      out.write("                \n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("           \n");
      out.write("            \n");
      out.write("          </ul>");
 } 
      out.write("\n");
      out.write("        </section>\n");
      out.write("      </div>\n");
      out.write("           ");

                        }
                        catch(Exception ex)
                        {
                            ex.printStackTrace();
                        }
                  
                    
      out.write("\n");
      out.write("                    \n");
      out.write("    </main>\n");
      out.write("  </body>\n");
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
