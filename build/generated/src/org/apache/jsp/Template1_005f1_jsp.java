package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.security.interfaces.RSAKey;
import java.sql.*;
import java.io.*;

public final class Template1_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
    Statement stmt1=conn.createStatement();

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Document</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    <link href=\"./css/custom.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("    <script src=\"https://kit.fontawesome.com/d9973f5636.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <link\n");
      out.write("        href=\"https://fonts.googleapis.com/css2?family=Work+Sans:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap\"\n");
      out.write("        rel=\"stylesheet\">\n");
      out.write("   \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <center>\n");
      out.write("        <br>\n");
      out.write("        <button id=\"download\" style=\"color: blue;border-radius: 25px;background:black; width:250px\">\n");
      out.write("            <i class=\"fa fa-download\" style=\"color: blue\"></i>DOWNLOAD</button>\n");
      out.write("       Guru Downloading File<a href=\"download\">Download here!!!</a>\n");
      out.write("    </center>\n");
      out.write("    \n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("         ");

                        
                    try
                        {
                            String mail = session.getAttribute("userId").toString();
        
                            String query1="Select * from PERSONAL where UEMAIL='"+mail+"' " ;
                            ResultSet rs=stmt1.executeQuery(query1);
                            
                            while(rs.next()==true)
                            {
                               
      out.write("\n");
      out.write("        <div class=\"row\" id=\"row1\">\n");
      out.write("            <div class=\"col-12 col-sm-12 col-md-12 col-lg-5 gray\" \n");
      out.write("            style=\"\">\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"ProfileContainer\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"ProfileIMG\">\n");
      out.write("                    <div class=\"SmallCircle\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"LeftSideContainer \">\n");
      out.write("                    <div class=\"contact LeftHeader \">\n");
      out.write("\n");
      out.write("                        <h2>Contact</h2>\n");
      out.write("                        <i class=\"fas fa-phone-alt\"></i> <a href=\"\">");
      out.print(rs.getString("UCONTACT") );
      out.write("</a><br>\n");
      out.write("                        <i class=\"fas fa-envelope\"></i> <a\n");
      out.write("                            href=\"\">");
      out.print(rs.getString("UEMAIL") );
      out.write("</a><br>\n");
      out.write("                         <i id=\"pinIcon\" class=\"fas fa-thumbtack\"></i> ");
      out.print(rs.getString("UFNAME") );
      out.write("&nbsp;&nbsp; ");
      out.print(rs.getString("ULNAME") );
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
 } 
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"Education LeftHeader \">\n");
      out.write(" ");

                         int k = 0;
                            String query4="Select * from EDUCATION  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query4);
                             if(rs.next()==true){ 
                                
      out.write("\n");
      out.write("                        <h2>Education</h2>\n");
      out.write("                        <span class=\"GoldenBadge\">");
      out.print(rs.getString("USTART") );
      out.write(" - ");
      out.print(rs.getString("UEND") );
      out.write("</span><br>\n");
      out.write("                        <h5>");
      out.print(rs.getString("UPROGRAM") );
      out.write("</h5>\n");
      out.write("                        <h6>");
      out.print(rs.getString("UINSTITUTE") );
      out.write("</h6>\n");
      out.write("                        <span>Marks: ");
      out.print(rs.getString("UCGPA") );
      out.write("</span><br>\n");
      out.write(" \n");
      out.write(" ");
 
                            while(rs.next()==true)
                            {
                                
      out.write("\n");
      out.write("                      <span class=\"GoldenBadge\">");
      out.print(rs.getString("USTART") );
      out.write(" - ");
      out.print(rs.getString("UEND") );
      out.write("</span><br>\n");
      out.write("                        <h5>");
      out.print(rs.getString("UPROGRAM") );
      out.write("</h5>\n");
      out.write("                        <h6>");
      out.print(rs.getString("UINSTITUTE") );
      out.write("</h6>  \n");
      out.write(" <span>Marks: ");
      out.print(rs.getString("UCGPA") );
      out.write("</span><br>\n");
      out.write("                      \n");
      out.write("  ");

                           k++;
                            }
      out.write("\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                          \n");
      out.write("                            ");
 } 
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"skills LeftHeader \">\n");
      out.write("                        \n");
      out.write(" ");
   int l = 0;
                            String query5="Select * from SKILLS  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query5);
                             if(rs.next()==true){ 
                     
      out.write("\n");
      out.write("                     <h2>Skills</h2>\n");
      out.write("                      <div class=\"rowCont\">\n");
      out.write("                                <div> <i class=\"fas fa-circle\"></i> ");
      out.print(rs.getString("SK") );
      out.write("</div></div>\n");
      out.write(" ");

                            while(rs.next()==true)
                            {
                                
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"rowCont\">\n");
      out.write("    <div> <i class=\"fas fa-circle\"></i>");
      out.print(rs.getString("SK") );
      out.write("</div></div>\n");
      out.write("                     \n");
      out.write(" ");

                           l++;
                            } 
      out.write("\n");
      out.write("        \n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        <div class=\"Hobies RightHeader\">\n");
      out.write("                   \n");
      out.write("                     ");
  
                                       
                         int M = 0;
                            String query6="Select * from LANGUAGE  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query6);
                              if(rs.next()==true){ 
                                
      out.write("\n");
      out.write("                                 <h2>Languages</h2>\n");
      out.write("                     ");
      out.print(rs.getString("ULANGUAGE") );
      out.write("<br/>\n");
      out.write("                         ");
 
                          while(rs.next()==true)
                            {
                                
      out.write("\n");
      out.write("                          ");
      out.print(rs.getString("ULANGUAGE") );
      out.write("<br/>\n");
      out.write("                         ");

                           M++;
                            }
      out.write("\n");
      out.write("                   \n");
 } 
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write(" </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("            <div class=\"col-12 col-sm-12 col-md-12 col-lg-7 RightSideContainer\">\n");
      out.write("               ");

                        
                   String queryp="Select * from PERSONAL where UEMAIL='"+mail+"' " ;
                           rs=stmt1.executeQuery(queryp);
                            
                            while(rs.next()==true)
                            {
                               
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"about RightHeader\">\n");
      out.write("                    <h2>About</h2>\n");
      out.write("                    <p>");
      out.print(rs.getString("USUM") );
      out.write("\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
 } 
      out.write("\n");
      out.write("                <div class=\"WorkExperience RightHeader \">\n");
      out.write("\n");
      out.write("                   \n");
      out.write(" ");
  
                        int i = 0;
                            String query2="Select * from WORKEX  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query2);
                              if(rs.next()==true){ 
                                
      out.write("\n");
      out.write("                                 <h2>Work Experience</h2>\n");
      out.write("                    <h5>");
      out.print(rs.getString("UPOSITION") );
      out.write("</h5>\n");
      out.write("                    <span class=\"GoldenBadge\">");
      out.print(rs.getString("USTART") );
      out.write(" - ");
      out.print(rs.getString("UEND") );
      out.write("</span> <span>");
      out.print(rs.getString("UCOMPANY") );
      out.write("</span>\n");
      out.write("                    <p>");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("</p>\n");
      out.write("\n");
      out.write(" ");
  while(rs.next()==true)
                            {


      out.write("\n");
      out.write(" <h5>");
      out.print(rs.getString("UPOSITION") );
      out.write("</h5>\n");
      out.write("                    <span class=\"GoldenBadge\">");
      out.print(rs.getString("USTART") );
      out.write(" - ");
      out.print(rs.getString("UEND") );
      out.write("</span> <span>");
      out.print(rs.getString("UCOMPANY") );
      out.write("</span>\n");
      out.write("                    <p>");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("</p>\n");
      out.write("                    ");
 
                                 i++;
                            }
      out.write("\n");
      out.write("                          ");
 }

      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"WorkExperience RightHeader \">\n");
      out.write("\n");
      out.write("                    \n");
      out.write(" ");
  
                           int ll = 0;
                            String queryl="Select * from PROJECT  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(queryl);
                             if(rs.next()==true){ 
                                
                                
      out.write("\n");
      out.write("                                <h2>Projects</h2>\n");
      out.write("                    <h5>");
      out.print(rs.getString("PNAME") );
      out.write("</h5>\n");
      out.write("                    <span class=\"GoldenBadge\">");
      out.print(rs.getString("USTART") );
      out.write(" - ");
      out.print(rs.getString("UEND") );
      out.write("</span>\n");
      out.write("                    <p>");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("</p>\n");
      out.write("\n");
      out.write(" ");
  while(rs.next()==true)
                            {


      out.write("\n");
      out.write(" <h5>");
      out.print(rs.getString("PNAME") );
      out.write("</h5>\n");
      out.write("                    <span class=\"GoldenBadge\">");
      out.print(rs.getString("USTART") );
      out.write(" - ");
      out.print(rs.getString("UEND") );
      out.write("</span>\n");
      out.write("                    <p>");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("</p>\n");
      out.write("                    ");
 
                                 ll++;
                            }
      out.write("\n");
      out.write("                          ");
 }

      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"WorkExperience RightHeader \">\n");
      out.write("\n");
      out.write("                   \n");
      out.write("  ");
  
                 int j = 0;
                            String queryj="Select * from CERTIFICATE  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(queryj);
                              if(rs.next()==true){ 
                                
      out.write("\n");
      out.write("                                 <h2>Certifications</h2>\n");
      out.write("                    <h5>");
      out.print(rs.getString("UCERTI") );
      out.write("</h5>\n");
      out.write("                    <p>");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("</p>\n");
      out.write("\n");
      out.write(" ");
  while(rs.next()==true)
                            {


      out.write("\n");
      out.write(" <h5>");
      out.print(rs.getString("UCERTI") );
      out.write("</h5>\n");
      out.write("                   <p>");
      out.print(rs.getString("UDESCRIPTION") );
      out.write("</p>\n");
      out.write("                    ");
 
                                 j++;
                            }
      out.write("\n");
      out.write("                          ");
 }

      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"Hobies RightHeader\">\n");
      out.write("                   \n");
      out.write("                     ");

                         int jp = 0;
                            String query3="Select * from UHOBBY  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query3);
                             if(rs.next()==true){ 
                                
      out.write("\n");
      out.write("                                 <h2>Hobbies</h2>\n");
      out.write("                     ");
      out.print(rs.getString("UINTREST") );
      out.write("<br/>\n");
      out.write("                         ");
 
                          while(rs.next()==true)
                            {
                                
      out.write("\n");
      out.write("                         ");
      out.print(rs.getString("UINTREST") );
      out.write("<br/>\n");
      out.write("                         ");

                           jp++;
                            }
      out.write("\n");
      out.write("                   \n");
 } 
      out.write("\n");
      out.write("       \n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("            </div></div>\n");
      out.write(" ");

                        }
                        catch(Exception ex)
                        {
                            ex.printStackTrace();
                        }
                  
                    
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script>\n");
      out.write("        window.onload = function () {\n");
      out.write("        document.getElementById(\"download\")\n");
      out.write("            .addEventListener(\"click\", () => {\n");
      out.write("                const row1 = this.document.getElementById(\"row1\");\n");
      out.write("                console.log(row1);\n");
      out.write("                console.log(window);\n");
      out.write("                \n");
      out.write("                html2pdf().from(row1).save();\n");
      out.write("            })\n");
      out.write("    }  \n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("<script>\n");
      out.write("    window.onload = function () {\n");
      out.write("    document.getElementById(\"download\")\n");
      out.write("        .addEventListener(\"click\", () => {\n");
      out.write("            const row1 = this.document.getElementById(\"row1\");\n");
      out.write("            console.log(row1);\n");
      out.write("            console.log(window);\n");
      out.write("            \n");
      out.write("            html2pdf().from(row1).save();\n");
      out.write("        })\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("body * {\n");
      out.write("    font-family: 'Work Sans', sans-serif;\n");
      out.write("    color:#363636;\n");
      out.write("}\n");
      out.write(".ProfileContainer \n");
      out.write("{\n");
      out.write("    background-color: #f0ae12;\n");
      out.write("  border-radius: 50%;\n");
      out.write("  height: 300px;\n");
      out.write("  width: 300px;\n");
      out.write("  left:-50px;\n");
      out.write("  top:-50px;\n");
      out.write("  position: absolute;\n");
      out.write("  z-index: 0;\n");
      out.write("}\n");
      out.write(".ProfileIMG {\n");
      out.write("    width: 250px;\n");
      out.write("    height: 250px;\n");
      out.write("    background-image: url('https://sawacrow.github.io/DesignerResumeCV/imgs/pexelstuan.jpg');\n");
      out.write("    background-size: contain;\n");
      out.write("    border-radius: 50%;\n");
      out.write("    border:10px solid #ffffff;\n");
      out.write("    margin-left:70px;\n");
      out.write("    margin-top:70px;\n");
      out.write("    position: relative;\n");
      out.write("    z-index: 1;\n");
      out.write(" \n");
      out.write("}\n");
      out.write(".gray{\n");
      out.write("    background-color:#f3f4f5;\n");
      out.write("}\n");
      out.write(".SmallCircle\n");
      out.write(" {\n");
      out.write("    background-color: #f0ae12;\n");
      out.write("    opacity: 0.8;\n");
      out.write("    border-radius: 50%;\n");
      out.write("    height: 90px;\n");
      out.write("    width: 90px;\n");
      out.write("    left:160px;\n");
      out.write("    top:-20px;\n");
      out.write("    position: absolute;\n");
      out.write("    z-index: 0;\n");
      out.write(" }\n");
      out.write(" h2 {\n");
      out.write("    color:#464646;\n");
      out.write("    margin-bottom:30px;\n");
      out.write("    font-weight: 500;\n");
      out.write("\n");
      out.write(" }\n");
      out.write(" .LeftSideContainer\n");
      out.write(" {\n");
      out.write("     margin-left:100px;\n");
      out.write("     \n");
      out.write(" }\n");
      out.write(" i {\n");
      out.write("     color:#f0ae12;\n");
      out.write("     padding-right:10px;\n");
      out.write(" }\n");
      out.write(" a {\n");
      out.write("     text-decoration: none;\n");
      out.write("     color:#464646;\n");
      out.write("    }\n");
      out.write(".LeftHeader,\n");
      out.write(".RightHeader{\n");
      out.write("    margin-top:30px;\n");
      out.write("    margin-bottom:100px;\n");
      out.write("   \n");
      out.write("}\n");
      out.write(".GoldenBadge {\n");
      out.write("    background-color: #f0ae12;\n");
      out.write("    padding:5px 10px;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("    display: inline-block;\n");
      out.write("    font-weight: 500;\n");
      out.write("}\n");
      out.write(".Education  .GoldenBadge {\n");
      out.write("    margin-top:20px;\n");
      out.write("    \n");
      out.write("    \n");
      out.write("}\n");
      out.write(".skills{\n");
      out.write("    font-weight: 500;\n");
      out.write("    max-width: 360px;\n");
      out.write("    min-width: 310px !important;\n");
      out.write("     \n");
      out.write("    line-height: 32px;\n");
      out.write("}\n");
      out.write(".GrayDot{\n");
      out.write("    color:#e1e1e1;\n");
      out.write("}\n");
      out.write("h1 {\n");
      out.write("    margin-top:130px;\n");
      out.write("    font-weight: 600;\n");
      out.write("    font-size:60px;\n");
      out.write("}\n");
      out.write(".RightSideContainer {\n");
      out.write("    margin-left:100px;\n");
      out.write("    width: fit-content;\n");
      out.write("   \n");
      out.write("}\n");
      out.write("\n");
      out.write(".surname {\n");
      out.write("    color:#f0ae12;;\n");
      out.write("}\n");
      out.write(".about,\n");
      out.write(".RightSideContainer {\n");
      out.write("    margin-top:108px;\n");
      out.write("    max-width: 600px;\n");
      out.write("}\n");
      out.write(".WorkExperience h5 {\n");
      out.write("    margin-top:20px;\n");
      out.write("}\n");
      out.write(".Hobies .rowCont {\n");
      out.write("   margin-top:30px;\n");
      out.write("   display: flex;\n");
      out.write("      flex-direction: row;\n");
      out.write("   justify-content: space-between;\n");
      out.write("   max-width: 400px;\n");
      out.write("}\n");
      out.write(".Hobies .rowCont div {\n");
      out.write("    width: 50%;\n");
      out.write("}\n");
      out.write(".skills i {\n");
      out.write("    padding:1px;\n");
      out.write("}\n");
      out.write("@media only screen and (max-width: 1217px) {\n");
      out.write("  .LeftSideContainer,\n");
      out.write("  .RightSideContainer  {\n");
      out.write("      margin-left: 10px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .skills {\n");
      out.write("      padding-right:15px;\n");
      out.write("  }\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  @media only screen and (max-width: 374px) {\n");
      out.write("      .ProfileIMG {\n");
      out.write("          margin-left:30px;\n");
      out.write("      }\n");
      out.write("      .LeftSideContainer,\n");
      out.write("      .RightSideContainer  {\n");
      out.write("          margin-left: 3px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("  }\n");
      out.write("  #pinIcon {\n");
      out.write("    padding-left: 2px;\n");
      out.write("    padding-right: 12px;\n");
      out.write("     \n");
      out.write("  }\n");
      out.write("  .skills .float-end {\n");
      out.write("    padding-right: 8px;\n");
      out.write("    \n");
      out.write("  }\n");
      out.write("</style>\n");
      out.write("\n");
    
//  String filename = "Template1.jsp";   
//  String filepath = "F:\\Java Programs\\Banasthali\\web\\";   
//  response.setContentType("APPLICATION/OCTET-STREAM");   
//  response.setHeader("Content-Disposition","attachment; filename=\"" + filename + "\"");   
//  
//  java.io.FileInputStream fileInputStream=new java.io.FileInputStream(filepath + filename);  
//            
//  int i;   
//  while ((i=fileInputStream.read()) != -1) {  
//    out.write(i);   
//  }   
//  fileInputStream.close();   

      out.write("   ");
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
