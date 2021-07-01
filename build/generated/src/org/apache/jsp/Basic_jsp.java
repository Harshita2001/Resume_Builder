package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Basic_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<script src=\"https://kit.fontawesome.com/yourcode.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl\" crossorigin=\"anonymous\">\n");
      out.write(" <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jqueryui/1.9.1/jquery-ui.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("       <style>\n");
      out.write("            .register{\n");
      out.write("    background: -webkit-linear-gradient(left, #3931af, #00c6ff);\n");
      out.write("    margin-top: 3%;\n");
      out.write("    padding: 3%;\n");
      out.write("}\n");
      out.write(".register-left{\n");
      out.write("    text-align: center;\n");
      out.write("    color: #fff;\n");
      out.write("    margin-top: 4%;\n");
      out.write("}\n");
      out.write(".register-left input{\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 1.5rem;\n");
      out.write("    padding: 2%;\n");
      out.write("    width: 60%;\n");
      out.write("    background: #f8f9fa;\n");
      out.write("    font-weight: bold;\n");
      out.write("    color: #383d41;\n");
      out.write("    margin-top: 30%;\n");
      out.write("    margin-bottom: 3%;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write(".register-right{\n");
      out.write("    background: #f8f9fa;\n");
      out.write("    border-top-left-radius: 10% 50%;\n");
      out.write("    border-bottom-left-radius: 10% 50%;\n");
      out.write("}\n");
      out.write(".register-left img{\n");
      out.write("    margin-top: 15%;\n");
      out.write("    margin-bottom: 5%;\n");
      out.write("    width: 25%;\n");
      out.write("    -webkit-animation: mover 2s infinite  alternate;\n");
      out.write("    animation: mover 1s infinite  alternate;\n");
      out.write("}\n");
      out.write("@-webkit-keyframes mover {\n");
      out.write("    0% { transform: translateY(0); }\n");
      out.write("    100% { transform: translateY(-20px); }\n");
      out.write("}\n");
      out.write("@keyframes mover {\n");
      out.write("    0% { transform: translateY(0); }\n");
      out.write("    100% { transform: translateY(-20px); }\n");
      out.write("}\n");
      out.write(".register-left p{\n");
      out.write("    font-weight: lighter;\n");
      out.write("    padding: 12%;\n");
      out.write("    margin-top: -9%;\n");
      out.write("}\n");
      out.write(".register .register-form{\n");
      out.write("    padding: 10%;\n");
      out.write("    margin-top: 10%;\n");
      out.write("}\n");
      out.write(".btnRegister{\n");
      out.write("    float: right;\n");
      out.write("    margin-top: 10%;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 1.5rem;\n");
      out.write("    padding: 2%;\n");
      out.write("    background: #0062cc;\n");
      out.write("    color: #fff;\n");
      out.write("    font-weight: 600;\n");
      out.write("    width: 250px;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write(".register .nav-tabs{\n");
      out.write("    margin-top: 3%;\n");
      out.write("    border: none;\n");
      out.write("    background: #0062cc;\n");
      out.write("    border-radius: 1.5rem;\n");
      out.write("    width: 28%;\n");
      out.write("    float: right;\n");
      out.write("}\n");
      out.write(".register .nav-tabs .nav-link{\n");
      out.write("    padding: 2%;\n");
      out.write("    height: 34px;\n");
      out.write("    font-weight: 600;\n");
      out.write("    color: #fff;\n");
      out.write("    border-top-right-radius: 1.5rem;\n");
      out.write("    border-bottom-right-radius: 1.5rem;\n");
      out.write("}\n");
      out.write(".register .nav-tabs .nav-link:hover{\n");
      out.write("    border: none;\n");
      out.write("}\n");
      out.write(".register .nav-tabs .nav-link.active{\n");
      out.write("    width: 100px;\n");
      out.write("    color: #0062cc;\n");
      out.write("    border: 2px solid #0062cc;\n");
      out.write("    border-top-left-radius: 1.5rem;\n");
      out.write("    border-bottom-left-radius: 1.5rem;\n");
      out.write("}\n");
      out.write(".register-heading{\n");
      out.write("    text-align: center;\n");
      out.write("    margin-top: 8%;\n");
      out.write("    margin-bottom: -15%;\n");
      out.write("    color: #495057;\n");
      out.write("}\n");
      out.write("button:hover {\n");
      out.write("color: #ffffff;\n");
      out.write("background: #2b0c62;\n");
      out.write("border-color: #1172c4;\n");
      out.write("border-color: #1172c4;\n");
      out.write("border-style: solid;\n");
      out.write("border-width: 2px;\n");
      out.write("border-radius: 50px;\n");
      out.write("padding: 0px 10px;\n");
      out.write("line-height:45px;\n");
      out.write("}\n");
      out.write(".high {\n");
      out.write("border-color: black;\n");
      out.write("border-style: solid;\n");
      out.write("border-width: 4px;\n");
      out.write("border-radius: 50px;\n");
      out.write("padding: 0px 20px;\n");
      out.write("line-height:55px;\n");
      out.write("}\n");
      out.write("            </style>\n");
      out.write("            \n");
      out.write("</head>\n");
      out.write("<body>               \n");
      out.write("<div id=\"info\" class=\"tabcontent\">\n");
      out.write("<div class=\"container-main contact-page resume-fn funnel-wrapper\">\n");
      out.write("    <div class=\"outer-wrapper\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <div class=\"container register\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-3 register-left\">\n");
      out.write("                        <i class=\"fas fa-user-graduate\" style=\"font-size:36px\"></i>\n");
      out.write("\n");
      out.write("                        <h3>Personal Information</h3>\n");
      out.write("                         <div class=\"tab\">\n");
      out.write("\n");
      out.write("    <button class=\"btnRegister high\" href=\"\" id=\"button1\"><i class=\"material-icons\" style='font-size:24px'>group</i><b>&nbsp;&nbsp;Basic Information</b></button>\n");
      out.write("    <button class=\"btnRegister but\" href=\"\" id=\"button2\" data-toggle=\"tooltip\" data-placement=\"bottom\" title=\"Please fill Personal details first!\" ><i class='fas fa-graduation-cap' style='font-size:24px'></i>\n");
      out.write("&nbsp;&nbsp;<b>Education</b> </button><br/>\n");
      out.write("    <button class=\"btnRegister but\" href=\"\" data-toggle=\"tooltip\" data-placement=\"bottom\" title=\"Please fill Personal details first!\"><i class='fas fa-laptop-code' style='font-size:24px'></i>\n");
      out.write("&nbsp;&nbsp;<b>Work Experience</b></button><br/>\n");
      out.write("    <button class=\"btnRegister but\" id=\"myButton\" href=\"\" data-toggle=\"tooltip\" data-placement=\"bottom\" title=\"Please fill Personal details first!\" ><i class='far fa-keyboard' style='font-size:24px'></i>\n");
      out.write("&nbsp;&nbsp;<b>Key Skills</b></button><br/>\n");
      out.write("    <button class=\"btnRegister but\" id=\"myButton\" href=\"\" data-toggle=\"tooltip\" data-placement=\"bottom\" title=\"Please fill Personal details first!\" ><i class='fas fa-award' style='font-size:24px'></i>&nbsp;&nbsp;<b>Certifications</b> </button><br/>\n");
      out.write("    <button class=\"btnRegister but\" id=\"myButton\" href=\"\" data-toggle=\"tooltip\" data-placement=\"bottom\" title=\"Please fill Personal details first!\" ><i class='fas fa-database' style='font-size:24px'></i>&nbsp;&nbsp;<b>Projects</b></button><br/>\n");
      out.write("    <button class=\"btnRegister but\" id=\"myButton\" href=\"\" data-toggle=\"tooltip\" data-placement=\"bottom\" title=\"Please fill Personal details first!\" ><i class='fas fa-pen' style='font-size:24px'></i>&nbsp;&nbsp;<b>Languages</b></button><br/>\n");
      out.write("    <button class=\"btnRegister but\" id=\"myButton\" href=\"\" data-toggle=\"tooltip\" data-placement=\"bottom\" title=\"Please fill Personal details first!\" ><i class='fas fa-icons' style='font-size:24px'></i>&nbsp;&nbsp;<b>Hobbies & Interests</b></button><br/>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-9 register-right\">\n");
      out.write("                       <form id=\"fm\" method=\"POST\">\n");
      out.write("                        <div class=\"tab-content\" id=\"myTabContent\">\n");
      out.write("                           \n");
      out.write("                            <div class=\"tab-pane fade show active\" id=\"home\" role=\"tabpanel\" aria-labelledby=\"home-tab\">\n");
      out.write("                               \n");
      out.write("                                <div class=\"row register-form\">\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" name=\"fname\" id=\"fname\" class=\"form-control\" placeholder=\"First Name *\" value=\"\" required/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" name=\"lname\" id=\"lname\" class=\"form-control\" placeholder=\"Last Name *\" value=\"\" required />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" name=\"add\" id=\"add\" class=\"form-control\" placeholder=\" Address\" value=\"\" required/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" name=\"city\" id=\"city\" class=\"form-control\"  placeholder=\"City\" value=\"\" required/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" name=\"zip\" id=\"zip\" class=\"form-control\"  placeholder=\"Zip Code\" value=\"\" required/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" name=\"country\" id=\"country\" class=\"form-control\"  placeholder=\"Country\" value=\"\" required/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <textarea class=\"form-control\" name=\"summ\"  id=\"summ\" rows=\"4\" cols=\"50\" placeholder=\"Describe yourself here...\"></textarea>\n");
      out.write("                                            </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            \n");
      out.write("                                            <input type=\"text\" name=\"umail\" id=\"umail\" class=\"form-control\"  placeholder=\"Email ID *\" value=\"\" required/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" name=\"contact\" id=\"contact\" class=\"form-control\"  placeholder=\"Contact number\" value=\"\" required/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <br/>\n");
      out.write("                                        <input type=\"submit\" class=\"btnRegister\" name=\"anubhi\" id=\"anubhi\" value=\"Save\"/>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                           \n");
      out.write("                        </div>\n");
      out.write("                           </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("                \n");
      out.write("   \n");
      out.write("\n");
      out.write("      \n");
      out.write("      <!-- jQuery library -->\n");
      out.write("      <script src = \"https://code.jquery.com/jquery-3.2.1.slim.min.js\" \n");
      out.write("         integrity = \"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" \n");
      out.write("         crossorigin = \"anonymous\">\n");
      out.write("      </script>\n");
      out.write("      \n");
      out.write("      <!-- Popper -->\n");
      out.write("      <script src = \"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" \n");
      out.write("         integrity = \"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" \n");
      out.write("         crossorigin = \"anonymous\">\n");
      out.write("      </script>\n");
      out.write("      \n");
      out.write("      <!-- Latest compiled and minified Bootstrap JavaScript -->\n");
      out.write("      <script src = \"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" \n");
      out.write("         integrity = \"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" \n");
      out.write("         crossorigin = \"anonymous\">\n");
      out.write("      </script>\n");
      out.write("     \n");
      out.write("      <script>\n");
      out.write("         $(document).ready(function(){\n");
      out.write("               $('[data-toggle = \"tooltip\"]').tooltip();\n");
      out.write("           });\n");
      out.write("      </script>  \n");
      out.write("  \n");
      out.write("\n");
      out.write("              \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
       
    try
    {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
        PreparedStatement pst ;
        ResultSet rst;
        if(request.getParameter("anubhi")!=null)    
        {   
            String mail=request.getParameter("umail");
            String fn = request.getParameter("fname");
            String ln=request.getParameter("lname");        
            String pwd=request.getParameter("add");   
            String cty = request.getParameter("city");
            String zc=request.getParameter("zip");
            String country = request.getParameter("country");
            String cont=request.getParameter("contact");
            String sum=request.getParameter("summ");
            session.setAttribute("userId", mail);
            pst=conn.prepareStatement("select UEMAIL from PERSONAL where UEMAIL ='"+mail+"' " );
            rst=pst.executeQuery();
            if(rst.next()==true)
            {
                pst = conn.prepareStatement("update PERSONAL set UFNAME=?, ULNAME=?, UADDRESS=?, UCITY=?, UZIPCODE=?, UCOUNTRY=?, UCONTACT=?, USUM=? where UEMAIL=?");
                pst.setString(1, fn);  
                pst.setString(2, ln);
                pst.setString(3, pwd);
                pst.setString(4, cty);
                pst.setString(5, zc);  
                pst.setString(6, country);
                pst.setString(7, cont);
                pst.setString(8, sum);
                pst.setString(9, mail);
                out.print("<script>alert('updated')</script>");
                int x = pst.executeUpdate();
                if(x>0)      
                {   
                    response.sendRedirect("work.jsp"); 
                }
                else
                {
                    out.print("<script>alert('Error occured in updating database! Try again!')</script>");
                }
            }
            else
            {
                pst = conn.prepareStatement("insert into PERSONAL(UEMAIL,UFNAME,ULNAME,UADDRESS,UCITY,UZIPCODE,UCOUNTRY,UCONTACT,USUM) values(?,?,?,?,?,?,?,?,?)");  
                pst.setString(1, mail);
                pst.setString(2, fn);  
                pst.setString(3, ln);
                pst.setString(4, pwd);
                pst.setString(5, cty);
                pst.setString(6, zc);  
                pst.setString(7, country);
                pst.setString(8, cont);
                pst.setString(9, sum);
                int x = pst.executeUpdate(); 
                 
                if( x > 0 )            
                {   
                    
                    response.sendRedirect("work.jsp"); 
                    
                   
                }
                else
                {
                    out.print("<script>alert('Error in inserting details to database! Try again!')</script>"); 
                }
            }
            
        }
                
    }
    catch(Exception exec) 
    {
        exec.printStackTrace();
    }
            
   

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
