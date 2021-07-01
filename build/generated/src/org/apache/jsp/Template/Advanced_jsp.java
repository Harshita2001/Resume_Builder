package org.apache.jsp.Template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.security.interfaces.RSAKey;
import java.sql.*;
import java.io.*;

public final class Advanced_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("    <link href=\"./css/custom.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\r\n");
      out.write("    <script src=\"https://kit.fontawesome.com/d9973f5636.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <link\r\n");
      out.write("        href=\"https://fonts.googleapis.com/css2?family=Work+Sans:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap\"\r\n");
      out.write("        rel=\"stylesheet\">\r\n");
      out.write("      <script src=\"https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.9.2/html2pdf.bundle.js\"></script> \r\n");
      out.write("         <script src=\"https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.9.2/html2pdf.bundle.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <center>\r\n");
      out.write("        \r\n");
      out.write("        <br>\r\n");
      out.write("        <button id=\"download\" style=\"color: blue;border-radius: 25px;background:black; width:250px\"><i class=\"fa fa-download\" style=\"color: blue\"></i>DOWNLOAD</button>\r\n");
      out.write("        <input type=\"submit\" formtarget=\"../resume_det.jsp\" onclick=\"window.location.href='../resume_det.jsp'\" name=\"submit2\" value=\"edit details\" class=\"button-primary float-right\" />\r\n");
      out.write("    \r\n");
      out.write("    </center>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("         ");

                        
                    try
                        {
                            String mail = session.getAttribute("userId").toString();
        
                            String query1="Select * from PERSONAL where UEMAIL='"+mail+"' " ;
                            ResultSet rs=stmt1.executeQuery(query1);
                            
                            while(rs.next()==true)
                            {
                               
      out.write("\r\n");
      out.write("        <div class=\"row\" id=\"row1\">\r\n");
      out.write("            <div class=\"col-12 col-sm-12 col-md-12 col-lg-5 gray\" \r\n");
      out.write("            style=\"\">\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"ProfileContainer\">\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"ProfileIMG\">\r\n");
      out.write("                    <div class=\"SmallCircle\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"LeftSideContainer \">\r\n");
      out.write("                    <div class=\"contact LeftHeader \">\r\n");
      out.write("\r\n");
      out.write("                        <h2>Contact</h2>\r\n");
      out.write("                        <i class=\"fas fa-phone-alt\"></i> <a href=\"\">");
      out.print(rs.getString("UCONTACT") );
      out.write("</a><br>\r\n");
      out.write("                        <i class=\"fas fa-envelope\"></i> <a\r\n");
      out.write("                            href=\"\">");
      out.print(rs.getString("UEMAIL") );
      out.write("</a><br>\r\n");
      out.write("                         <i id=\"pinIcon\" class=\"fas fa-thumbtack\"></i> ");
      out.print(rs.getString("UFNAME") );
      out.write("&nbsp;&nbsp; ");
      out.print(rs.getString("ULNAME") );
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"Education LeftHeader \">\r\n");
      out.write(" ");

                         int k = 0;
                            String query4="Select * from EDUCATION  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query4);
                             if(rs.next()==true){ 
                                
      out.write("\r\n");
      out.write("                        <h2>Education</h2>\r\n");
      out.write("                        <span class=\"GoldenBadge\">");
      out.print(rs.getString("USTART") );
      out.write(" - ");
      out.print(rs.getString("UEND") );
      out.write("</span><br>\r\n");
      out.write("                        <h5>");
      out.print(rs.getString("UPROGRAM") );
      out.write("</h5>\r\n");
      out.write("                        <h6>");
      out.print(rs.getString("UINSTITUTE") );
      out.write("</h6>\r\n");
      out.write("                        <span>Marks: ");
      out.print(rs.getString("UCGPA") );
      out.write("</span><br>\r\n");
      out.write(" \r\n");
      out.write(" ");
 
                            while(rs.next()==true)
                            {
                                
      out.write("\r\n");
      out.write("                      <span class=\"GoldenBadge\">");
      out.print(rs.getString("USTART") );
      out.write(" - ");
      out.print(rs.getString("UEND") );
      out.write("</span><br>\r\n");
      out.write("                        <h5>");
      out.print(rs.getString("UPROGRAM") );
      out.write("</h5>\r\n");
      out.write("                        <h6>");
      out.print(rs.getString("UINSTITUTE") );
      out.write("</h6>  \r\n");
      out.write(" <span>Marks: ");
      out.print(rs.getString("UCGPA") );
      out.write("</span><br>\r\n");
      out.write("                      \r\n");
      out.write("  ");

                           k++;
                            }
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("                          \r\n");
      out.write("                            ");
 } 
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"skills LeftHeader \">\r\n");
      out.write("                        \r\n");
      out.write(" ");
   int l = 0;
                            String query5="Select * from SKILLS  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query5);
                             if(rs.next()==true){ 
                     
      out.write("\r\n");
      out.write("                     <h2>Skills</h2>\r\n");
      out.write("                      <div class=\"rowCont\">\r\n");
      out.write("                                <div> <i class=\"fas fa-circle\"></i> ");
      out.print(rs.getString("SK") );
      out.write("</div></div>\r\n");
      out.write(" ");

                            while(rs.next()==true)
                            {
                                
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"rowCont\">\r\n");
      out.write("    <div> <i class=\"fas fa-circle\"></i>");
      out.print(rs.getString("SK") );
      out.write("</div></div>\r\n");
      out.write("                     \r\n");
      out.write(" ");

                           l++;
                            } 
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("        <div class=\"Hobies RightHeader\">\r\n");
      out.write("                   \r\n");
      out.write("                     ");
  
                                       
                         int M = 0;
                            String query6="Select * from LANGUAGE  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query6);
                              if(rs.next()==true){ 
                                
      out.write("\r\n");
      out.write("                                 <h2>Languages</h2>\r\n");
      out.write("                     ");
      out.print(rs.getString("ULANGUAGE") );
      out.write("<br/>\r\n");
      out.write("                         ");
 
                          while(rs.next()==true)
                            {
                                
      out.write("\r\n");
      out.write("                          ");
      out.print(rs.getString("ULANGUAGE") );
      out.write("<br/>\r\n");
      out.write("                         ");

                           M++;
                            }
      out.write("\r\n");
      out.write("                   \r\n");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write(" </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("          \r\n");
      out.write("            <div class=\"col-12 col-sm-12 col-md-12 col-lg-7 RightSideContainer\">\r\n");
      out.write("               ");

                        
                   String queryp="Select * from PERSONAL where UEMAIL='"+mail+"' " ;
                           rs=stmt1.executeQuery(queryp);
                            
                            while(rs.next()==true)
                            {
                               
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"about RightHeader\">\r\n");
      out.write("                    <h2>About</h2>\r\n");
      out.write("                    <p>");
      out.print(rs.getString("USUM") );
      out.write("\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
 } 
      out.write("\r\n");
      out.write("                <div class=\"WorkExperience RightHeader \">\r\n");
      out.write("\r\n");
      out.write("                   \r\n");
      out.write(" ");
  
                        int i = 0;
                            String query2="Select * from WORKEX  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query2);
                              if(rs.next()==true){ 
                                
      out.write("\r\n");
      out.write("                                 <h2>Work Experience</h2>\r\n");
      out.write("                    <h5>");
      out.print(rs.getString("UPOSITION") );
      out.write("</h5>\r\n");
      out.write("                    <span class=\"GoldenBadge\">");
      out.print(rs.getString("USTART") );
      out.write(" - ");
      out.print(rs.getString("UEND") );
      out.write("</span> <span>");
      out.print(rs.getString("UCOMPANY") );
      out.write("</span>\r\n");
      out.write("                    <p>");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write(" ");
  while(rs.next()==true)
                            {


      out.write("\r\n");
      out.write(" <h5>");
      out.print(rs.getString("UPOSITION") );
      out.write("</h5>\r\n");
      out.write("                    <span class=\"GoldenBadge\">");
      out.print(rs.getString("USTART") );
      out.write(" - ");
      out.print(rs.getString("UEND") );
      out.write("</span> <span>");
      out.print(rs.getString("UCOMPANY") );
      out.write("</span>\r\n");
      out.write("                    <p>");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("</p>\r\n");
      out.write("                    ");
 
                                 i++;
                            }
      out.write("\r\n");
      out.write("                          ");
 }

      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"WorkExperience RightHeader \">\r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write(" ");
  
                           int ll = 0;
                            String queryl="Select * from PROJECT  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(queryl);
                             if(rs.next()==true){ 
                                
                                
      out.write("\r\n");
      out.write("                                <h2>Projects</h2>\r\n");
      out.write("                    <h5>");
      out.print(rs.getString("PNAME") );
      out.write("</h5>\r\n");
      out.write("                    <span class=\"GoldenBadge\">");
      out.print(rs.getString("USTART") );
      out.write(" - ");
      out.print(rs.getString("UEND") );
      out.write("</span>\r\n");
      out.write("                    <p>");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write(" ");
  while(rs.next()==true)
                            {


      out.write("\r\n");
      out.write(" <h5>");
      out.print(rs.getString("PNAME") );
      out.write("</h5>\r\n");
      out.write("                    <span class=\"GoldenBadge\">");
      out.print(rs.getString("USTART") );
      out.write(" - ");
      out.print(rs.getString("UEND") );
      out.write("</span>\r\n");
      out.write("                    <p>");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("</p>\r\n");
      out.write("                    ");
 
                                 ll++;
                            }
      out.write("\r\n");
      out.write("                          ");
 }

      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"WorkExperience RightHeader \">\r\n");
      out.write("\r\n");
      out.write("                   \r\n");
      out.write("  ");
  
                 int j = 0;
                            String queryj="Select * from CERTIFICATE  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(queryj);
                              if(rs.next()==true){ 
                                
      out.write("\r\n");
      out.write("                                 <h2>Certifications</h2>\r\n");
      out.write("                    <h5>");
      out.print(rs.getString("UCERTI") );
      out.write("</h5>\r\n");
      out.write("                    <p>");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write(" ");
  while(rs.next()==true)
                            {


      out.write("\r\n");
      out.write(" <h5>");
      out.print(rs.getString("UCERTI") );
      out.write("</h5>\r\n");
      out.write("                   <p>");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("</p>\r\n");
      out.write("                    ");
 
                                 j++;
                            }
      out.write("\r\n");
      out.write("                          ");
 }

      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"Hobies RightHeader\">\r\n");
      out.write("                   \r\n");
      out.write("                     ");

                         int jp = 0;
                            String query3="Select * from UHOBBY  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query3);
                             if(rs.next()==true){ 
                                
      out.write("\r\n");
      out.write("                                 <h2>Hobbies</h2>\r\n");
      out.write("                     ");
      out.print(rs.getString("UINTREST") );
      out.write("<br/>\r\n");
      out.write("                         ");
 
                          while(rs.next()==true)
                            {
                                
      out.write("\r\n");
      out.write("                         ");
      out.print(rs.getString("UINTREST") );
      out.write("<br/>\r\n");
      out.write("                         ");

                           jp++;
                            }
      out.write("\r\n");
      out.write("                   \r\n");
 } 
      out.write("\r\n");
      out.write("       \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div></div>\r\n");
      out.write(" ");

                        }
                        catch(Exception ex)
                        {
                            ex.printStackTrace();
                        }
                  
                    
      out.write("\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("   \r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
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
      out.write("</script>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("body * {\r\n");
      out.write("    font-family: 'Work Sans', sans-serif;\r\n");
      out.write("    color:#363636;\r\n");
      out.write("}\r\n");
      out.write(".ProfileContainer \r\n");
      out.write("{\r\n");
      out.write("    background-color: #f0ae12;\r\n");
      out.write("  border-radius: 50%;\r\n");
      out.write("  height: 300px;\r\n");
      out.write("  width: 300px;\r\n");
      out.write("  left:-50px;\r\n");
      out.write("  top:-50px;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  z-index: 0;\r\n");
      out.write("}\r\n");
      out.write(".ProfileIMG {\r\n");
      out.write("    width: 250px;\r\n");
      out.write("    height: 250px;\r\n");
      out.write("    background-image: url('https://sawacrow.github.io/DesignerResumeCV/imgs/pexelstuan.jpg');\r\n");
      out.write("    background-size: contain;\r\n");
      out.write("    border-radius: 50%;\r\n");
      out.write("    border:10px solid #ffffff;\r\n");
      out.write("    margin-left:70px;\r\n");
      out.write("    margin-top:70px;\r\n");
      out.write("    position: relative;\r\n");
      out.write("    z-index: 1;\r\n");
      out.write(" \r\n");
      out.write("}\r\n");
      out.write(".gray{\r\n");
      out.write("    background-color:#f3f4f5;\r\n");
      out.write("}\r\n");
      out.write(".SmallCircle\r\n");
      out.write(" {\r\n");
      out.write("    background-color: #f0ae12;\r\n");
      out.write("    opacity: 0.8;\r\n");
      out.write("    border-radius: 50%;\r\n");
      out.write("    height: 90px;\r\n");
      out.write("    width: 90px;\r\n");
      out.write("    left:160px;\r\n");
      out.write("    top:-20px;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    z-index: 0;\r\n");
      out.write(" }\r\n");
      out.write(" h2 {\r\n");
      out.write("    color:#464646;\r\n");
      out.write("    margin-bottom:30px;\r\n");
      out.write("    font-weight: 500;\r\n");
      out.write("\r\n");
      out.write(" }\r\n");
      out.write(" .LeftSideContainer\r\n");
      out.write(" {\r\n");
      out.write("     margin-left:100px;\r\n");
      out.write("     \r\n");
      out.write(" }\r\n");
      out.write(" i {\r\n");
      out.write("     color:#f0ae12;\r\n");
      out.write("     padding-right:10px;\r\n");
      out.write(" }\r\n");
      out.write(" a {\r\n");
      out.write("     text-decoration: none;\r\n");
      out.write("     color:#464646;\r\n");
      out.write("    }\r\n");
      out.write(".LeftHeader,\r\n");
      out.write(".RightHeader{\r\n");
      out.write("    margin-top:30px;\r\n");
      out.write("    margin-bottom:100px;\r\n");
      out.write("   \r\n");
      out.write("}\r\n");
      out.write(".GoldenBadge {\r\n");
      out.write("    background-color: #f0ae12;\r\n");
      out.write("    padding:5px 10px;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    font-weight: 500;\r\n");
      out.write("}\r\n");
      out.write(".Education  .GoldenBadge {\r\n");
      out.write("    margin-top:20px;\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write(".skills{\r\n");
      out.write("    font-weight: 500;\r\n");
      out.write("    max-width: 360px;\r\n");
      out.write("    min-width: 310px !important;\r\n");
      out.write("     \r\n");
      out.write("    line-height: 32px;\r\n");
      out.write("}\r\n");
      out.write(".GrayDot{\r\n");
      out.write("    color:#e1e1e1;\r\n");
      out.write("}\r\n");
      out.write("h1 {\r\n");
      out.write("    margin-top:130px;\r\n");
      out.write("    font-weight: 600;\r\n");
      out.write("    font-size:60px;\r\n");
      out.write("}\r\n");
      out.write(".RightSideContainer {\r\n");
      out.write("    margin-left:100px;\r\n");
      out.write("    width: fit-content;\r\n");
      out.write("   \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".surname {\r\n");
      out.write("    color:#f0ae12;;\r\n");
      out.write("}\r\n");
      out.write(".about,\r\n");
      out.write(".RightSideContainer {\r\n");
      out.write("    margin-top:108px;\r\n");
      out.write("    max-width: 600px;\r\n");
      out.write("}\r\n");
      out.write(".WorkExperience h5 {\r\n");
      out.write("    margin-top:20px;\r\n");
      out.write("}\r\n");
      out.write(".Hobies .rowCont {\r\n");
      out.write("   margin-top:30px;\r\n");
      out.write("   display: flex;\r\n");
      out.write("      flex-direction: row;\r\n");
      out.write("   justify-content: space-between;\r\n");
      out.write("   max-width: 400px;\r\n");
      out.write("}\r\n");
      out.write(".Hobies .rowCont div {\r\n");
      out.write("    width: 50%;\r\n");
      out.write("}\r\n");
      out.write(".skills i {\r\n");
      out.write("    padding:1px;\r\n");
      out.write("}\r\n");
      out.write("@media only screen and (max-width: 1217px) {\r\n");
      out.write("  .LeftSideContainer,\r\n");
      out.write("  .RightSideContainer  {\r\n");
      out.write("      margin-left: 10px;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .skills {\r\n");
      out.write("      padding-right:15px;\r\n");
      out.write("  }\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  @media only screen and (max-width: 374px) {\r\n");
      out.write("      .ProfileIMG {\r\n");
      out.write("          margin-left:30px;\r\n");
      out.write("      }\r\n");
      out.write("      .LeftSideContainer,\r\n");
      out.write("      .RightSideContainer  {\r\n");
      out.write("          margin-left: 3px;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("  }\r\n");
      out.write("  #pinIcon {\r\n");
      out.write("    padding-left: 2px;\r\n");
      out.write("    padding-right: 12px;\r\n");
      out.write("     \r\n");
      out.write("  }\r\n");
      out.write("  .skills .float-end {\r\n");
      out.write("    padding-right: 8px;\r\n");
      out.write("    \r\n");
      out.write("  }\r\n");
      out.write("</style>");
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
