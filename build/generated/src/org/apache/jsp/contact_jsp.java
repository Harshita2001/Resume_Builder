package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("     <link href=\"https://craftmycv.com/css/app.css\" rel=\"stylesheet\">   \n");
      out.write("     <style>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("/* Contact us Page */\n");
      out.write("\n");
      out.write(".static-page .layer{position:absolute;}\n");
      out.write(".static-page .static-bg .layer-01{left:-75px; top:120px; z-index:1;}\n");
      out.write(".static-page .static-bg .layer-02{right:0; top:390px;}\n");
      out.write("\n");
      out.write("\n");
      out.write(".static-page .static-container{position:relative; z-index:1; padding:50px 0 85px; max-width: 1100px; margin: 0 auto;}\n");
      out.write(".static-page .static-container-inner{background-color:#FFF; box-shadow:0 6px 15px rgba(0,0,0,.16); padding:60px; font-size:15px; line-height:1.4;}\n");
      out.write(".static-page .static-container-inner h3{font-size:20px; margin:25px 0 5px;}\n");
      out.write(".static-page .static-container-inner p{margin-bottom:15px;}\n");
      out.write(".static-page .static-container-inner ul,\n");
      out.write(".static-page .static-container-inner ol{margin-bottom:15px;}\n");
      out.write(".static-page .static-container-inner li{margin-bottom:15px;}\n");
      out.write(".static-page .static-container-inner ul ul,\n");
      out.write(".static-page .static-container-inner ol ol{margin-top:15px;}\n");
      out.write("\n");
      out.write("\n");
      out.write(".contact-page .contact-form .layer-03{ bottom:110px;}\n");
      out.write("\n");
      out.write("\n");
      out.write(".contact-page .contact-form{background-color:#FFF; max-width:550px; width:100%; \n");
      out.write("             box-shadow:0 6px 10px rgba(0,0,0,.1); position:relative; height: 650px;margin-left: 300px; margin-top: 10px;border-radius: 30px;}\n");
      out.write(".contact-page .contact-form-inner{padding:40px 65px;}\n");
      out.write(".contact-page .contact-form-header{padding-bottom:20px;}\n");
      out.write(".contact-page .contact-form-header h3{font-size:26px;}\n");
      out.write(".contact-page .contact-form .action-row .btn{min-width:145px;}\n");
      out.write(".contact-page .contact-info{color:black; padding:50px 40px 0 0; max-width:600px; flex-grow:1;}\n");
      out.write(".contact-page .contact-info-inner{max-width:420px; margin-left: -60px; margin-top: -100px;}\n");
      out.write(".contact-page .contact-info-body .info-list > li{display:flex; margin:25px 0; font-size:16px;}\n");
      out.write(".contact-page .contact-info-body li.mob .key{display:block; color:#A1A6B2; font-size:14px;}\n");
      out.write(".contact-page .contact-info-body li .key{font-weight:700;}\n");
      out.write(".contact-page .contact-info-body li.mob a{color:#FFF; font-weight:700;}\n");
      out.write(".contact-page .contact-info-body li .img-wrap{margin-right:20px;}\n");
      out.write(".contact-page .contact-info-body li .icon-wrap{width:47px; height:47px; background-color:#FFF; color:#212529; font-size:22px;}\n");
      out.write(".contact-page .contact-info-body li address strong{font-weight:700; display:block;}\n");
      out.write(".contact-page .contact-info-body li .img-cont{display:flex; align-items:flex-start; justify-content: center; \n");
      out.write("         flex-direction: column; line-height:1.4; font-size:18px;}\n");
      out.write(".know-more-section{background-color:#47B5D6; color:#FFF; padding:40px 0;}\n");
      out.write(".know-more-section h3{font-size:29px; font-weight:900; margin-bottom:10px;}\n");
      out.write(".know-more-section .action-row{margin:30px 0 0;}\n");
      out.write(".know-more-section .btn{font-size:20px;padding:21px 20px; min-width:260px; height:auto; line-height:1; }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("     </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <div class=\"contact-page static-page bg-whit\" style=\"\n");
      out.write("         clip-path: ellipse(800px 800px at 30% 50%);\n");
      out.write("         background-image:  linear-gradient(to right bottom, \n");
      out.write("     rgba(30, 210, 255, 0.6),\n");
      out.write("     rgba(30, 210, 200, 0.6)),\n");
      out.write("     url('bg.svg');\n");
      out.write("    \" >\n");
      out.write("\n");
      out.write("  \n");
      out.write("             <section class=\"form-section\" >\n");
      out.write("    \t<div class=\"container\">\n");
      out.write("\t    \t<div class=\"form-section-inner d-flex static-container\" >\n");
      out.write("\n");
      out.write("\t\t    \t<div class=\"contact-form\">\n");
      out.write("\n");
      out.write("\t\t\t    \t<div class=\"contact-form-inner\">\n");
      out.write("\t\t\t    \t\t<div class=\"contact-form-header\">\n");
      out.write("                                            <h3><b>Get in touch</b></h3>\n");
      out.write("\t\t\t    \t\t</div>\n");
      out.write("\t\t\t    \t\t<div class=\"contact-form-body\">\n");
      out.write("\t\t\t    \t\t\t<form method=\"POST\"  id=\"contact-form\">\n");
      out.write("                                <input type=\"hidden\" name=\"_token\" value=\"IF8fp1ovYn1WaO8j14A7SY2psn6aNyjhedhXdIth\">                  <input type=\"text\" id=\"website\" name=\"website\" style=\"display:none\" value=\"\" />\n");
      out.write("\t\t\t\t    \t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t    \t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t    \t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t    \t\t\t\t\t   <label for=\"full-name\">First Name<i class=\"text-danger\"> * </i></label>\n");
      out.write("\t\t\t\t    \t\t\t\t\t   <input type=\"text\" class=\"form-control\" name=\"txtfname\" required value=\"\" />\n");
      out.write("\t\t\t\t    \t\t\t\t\t </div>\n");
      out.write("\t\t\t\t    \t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t    \t\t\t</div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("\t\t\t\t    \t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t    \t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t    \t\t\t\t\t   <label for=\"full-name\">Last Name<i class=\"text-danger\"> * </i></label>\n");
      out.write("\t\t\t\t    \t\t\t\t\t   <input type=\"text\" class=\"form-control\" name=\"txtlname\" required value=\"\" />\n");
      out.write("\t\t\t\t    \t\t\t\t\t </div>\n");
      out.write("\t\t\t\t    \t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t    \t\t\t</div>\n");
      out.write("\t\t\t\t    \t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t    \t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t    \t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t    \t\t\t\t\t   <label for=\"email\">Email Address<i class=\"text-danger\"> * </i></label>\n");
      out.write("\t\t\t\t    \t\t\t\t\t   <input type=\"email\" name=\"txtid\" class=\"form-control\" required value=\"\" />\n");
      out.write("                                            \t\t\t\t    \t\t\t\t\t </div>\n");
      out.write("\t\t\t\t    \t\t\t\t</div>\n");
      out.write("\t\t\t\t    \t\t\t</div>\n");
      out.write("\t\t\t\t    \t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t    \t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t    \t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t    \t\t\t\t\t   <label for=\"message\">Message<i class=\"text-danger\"> * </i></label>\n");
      out.write("\t\t\t\t    \t\t\t\t\t   <textarea class=\"form-control\" id=\"message\" name=\"txtmsg\" rows=\"4\"></textarea>\n");
      out.write("                                            \t\t\t\t    \t\t\t\t\t </div>\n");
      out.write("\t\t\t\t    \t\t\t\t</div>\n");
      out.write("\t\t\t\t    \t\t\t</div>\n");
      out.write("                                <div class=\"g-recaptcha\"\n");
      out.write("                                     data-sitekey=\"6LemAtwZAAAAAM4gpSfATpjt1yL_puqd6U0vGzDL\">\n");
      out.write("                                </div>\n");
      out.write("                                                                <p></p>\n");
      out.write("                                <input type=\"hidden\" name=\"recaptcha\" id=\"recaptcha\">\n");
      out.write("                              <div class=\"action-row\">\n");
      out.write("                                  <input type=\"submit\" style=\"      \tdisplay: inline-block;\n");
      out.write("  \tborder-radius: 100px;\n");
      out.write("  \ttransition: all .2s;\n");
      out.write("    border: none;\n");
      out.write("    outline: 0;\n");
      out.write("   color:  white;\n");
      out.write("  padding: 14px 28px;\n");
      out.write("  font-size: 16px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  background-color:cornflowerblue;\n");
      out.write("  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2),0 6px 20px 0 rgba(0,0,0,0.19);\"\n");
      out.write("                                       class=\"btn btn-orange\"\n");
      out.write("                                       name=\"btn_submit\"\n");
      out.write("                                       value=\"Send\">\n");
      out.write("                              </div>\n");
      out.write("\t\t\t    \t\t\t</form>\n");
      out.write("\t\t\t    \t\t</div>\n");
      out.write("\t\t\t    \t</div>\n");
      out.write("\t\t    \t</div>\n");
      out.write("                                   \n");
      out.write("\t    \t</div>\n");
      out.write("    \t</div>\n");
      out.write("    </section>\n");
      out.write("         \n");
      out.write("</div>         \n");
  
    
    if(request.getParameter("btn_submit")!=null)
    {
        try
    {
        String fname=request.getParameter("txtfname"); 
        String lname=request.getParameter("txtlname");
        String emailid=request.getParameter("txtid");
        String msg=request.getParameter("txtmsg");
         Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");    
            PreparedStatement pst = conn.prepareStatement("select id from GET_IN_TOUCH order by id desc") ; 
            
            ResultSet rst = pst.executeQuery();
            int id = 1;
            if(rst.next()==true) 
            {    
                id = rst.getInt(1);
                id++;
                
            } 
            pst = conn.prepareStatement("insert into GET_IN_TOUCH values (?,?,?,?,?)");
            pst.setInt(1, id);
            pst.setString(2, fname);  
            pst.setString(3, lname);
            pst.setString(4, emailid);
            pst.setString(5, msg);
            int x=pst.executeUpdate();        
            if(x>0)  
                out.println("<script>alert('Message received successfully!')</script>");
                 
        }
    
        catch(Exception ex)
        {
            out.println("Error occurred.Kindly try again!"); 
        }
    }
    
    

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
