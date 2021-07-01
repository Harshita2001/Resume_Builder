package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Skills_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>\n");
      out.write("\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl\" crossorigin=\"anonymous\">\n");
      out.write(" <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jqueryui/1.9.1/jquery-ui.min.js\"></script>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write(" \n");
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
      out.write(".btnReg{\n");
      out.write("    float: right;\n");
      out.write("    margin-top: 10%;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 1.5rem;\n");
      out.write("    padding: 2%;\n");
      out.write("    background: #0062cc;\n");
      out.write("    color: #fff;\n");
      out.write("    font-weight: 600;\n");
      out.write("    width: 100px;\n");
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
      out.write(" .high {\n");
      out.write("border-color: black;\n");
      out.write("border-style: solid;\n");
      out.write("border-width: 4px;\n");
      out.write("border-radius: 50px;\n");
      out.write("padding: 0px 20px;\n");
      out.write("line-height:55px;\n");
      out.write("font-size: 20px;\n");
      out.write("}\n");
      out.write("            </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write(" \n");
      out.write("                \n");
      out.write("<div id=\"info\" class=\"tabcontent\">\n");
      out.write("<div class=\"container-main contact-page resume-fn funnel-wrapper\">\n");
      out.write("    <div class=\"outer-wrapper\">\n");
      out.write("        <form id=\"fm\" method=\"POST\">\n");
      out.write("        \n");
      out.write("    <div class=\"container register\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-3 register-left\">\n");
      out.write("                        <i class=\"far fa-keyboard\" style=\"font-size:36px\"></i>\n");
      out.write("\n");
      out.write("                        <h3>Key Skills</h3>\n");
      out.write("                        <p>Enter maximum 12 skills.</p>\n");
      out.write("                     <div class=\"tab\">\n");
      out.write("\n");
      out.write("    <button class=\"btnRegister\" formtarget=\"Basic.jsp\" onclick=\"window.location.href='Basic.jsp'\" id=\"defaultOpen\"><i class=\"material-icons\" style='font-size:24px'>group</i><b>&nbsp;&nbsp;Basic Information</b></button>\n");
      out.write("    <button class=\"btnRegister\" formtarget=\"education.jsp\" onclick=\"window.location.href='education.jsp'\"><i class='fas fa-graduation-cap' style='font-size:24px'></i>\n");
      out.write("&nbsp;&nbsp;<b>Education</b> </button><br/>\n");
      out.write("    <button class=\"btnRegister\" formtarget=\"work.jsp\" onclick=\"window.location.href='work.jsp'\"><i class='fas fa-laptop-code' style='font-size:24px'></i>\n");
      out.write("&nbsp;&nbsp;<b>Work Experience</b></button><br/>\n");
      out.write("    <button class=\"btnRegister high\" href=\"\"><i class='far fa-keyboard' style='font-size:24px'></i>\n");
      out.write("&nbsp;&nbsp;<b>Key Skills</b></button><br/>\n");
      out.write("    <button class=\"btnRegister\" formtarget=\"Certifications.jsp\" onclick=\"window.location.href='Certifications.jsp'\"><i class='fas fa-award' style='font-size:24px'></i>&nbsp;&nbsp;<b>Certifications</b> </button><br/>\n");
      out.write("    <button class=\"btnRegister\" formtarget=\"projects.jsp\" onclick=\"window.location.href='projects.jsp'\"><i class='fas fa-database' style='font-size:24px'></i>&nbsp;&nbsp;<b>Projects</b></button><br/>\n");
      out.write("    <button class=\"btnRegister\" formtarget=\"language.jsp\" onclick=\"window.location.href='language.jsp'\"><i class='fas fa-pen' style='font-size:24px'></i>&nbsp;&nbsp;<b>Languages</b></button><br/>\n");
      out.write("    <button class=\"btnRegister\" formtarget=\"hobbies.jsp\" onclick=\"window.location.href='hobbies.jsp'\"><i class='fas fa-icons' style='font-size:24px'></i>&nbsp;&nbsp;<b>Hobbies & Interests</b> </button><br/>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-9 register-right\">\n");
      out.write("                       \n");
      out.write("                        <div class=\"tab-content\" id=\"myTabContent\">\n");
      out.write("                           \n");
      out.write("                            <div class=\"tab-pane fade show active\" id=\"home\" role=\"tabpanel\" aria-labelledby=\"home-tab\">\n");
      out.write("                               \n");
      out.write("                                <div class=\"row register-form\">\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                      \n");
      out.write("         <div id=\"main2\">\n");
      out.write("        <input type=\"button\" id=\"btnd\" value=\"Add Skills\" class=\"btnRegister\" />\n");
      out.write("       \n");
      out.write("    </div>                              \n");
      out.write("                                        \n");
      out.write("                                <br/><br/><br/><br/><br/> \n");
      out.write("<input type=\"submit\" class=\"btnRegister\" name=\"btnss\" id=\"btnss\" value=\"Save\"/>\n");
      out.write("\n");
      out.write("     \n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                           \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </form></div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("            //skill\n");
      out.write("    $(document).ready(function() {\n");
      out.write("\n");
      out.write("        var iCnt = 0;\n");
      out.write("        if(iCnt===0){\n");
      out.write("            $(\"#btnss\").hide();\n");
      out.write("        }\n");
      out.write("        var container = $(document.createElement('div'));\n");
      out.write("$('#btnd').click(function() {\n");
      out.write("            if (iCnt <= 5) {iCnt = iCnt + 1;\n");
      out.write("$(container).append('<div><br/><br/><br/><br/><br/><label>Skills: </label><input class=\"form-control\" type=text name=ss' + iCnt+ ' ' + ' id=ss' + iCnt + ' ' +' placeholder=\"\" autocomplete=\"off\" tabindex=\"1\">    \\n\\\n");
      out.write("<input type=\"button\" class=\"btnR btnReg\" value=\"Remove\"></div>'); // end append\n");
      out.write("            $(\"#btnss\").show();\n");
      out.write("\t\t\t\t\t$('div .btnR').click (function () { \n");
      out.write("\t\t\t\t\t\t$(this).parent('div').remove();\n");
      out.write("                                                $('#lbl').remove();\n");
      out.write("                                                iCnt = iCnt - 1;\n");
      out.write("                                                $('#btnd').removeAttr('disabled');\n");
      out.write("                                                if(iCnt===0){\n");
      out.write("            $(\"#btnss\").hide();\n");
      out.write("        }\n");
      out.write("                    });\n");
      out.write("                $('#main2').after(container);\n");
      out.write("            }\n");
      out.write("            else {   \n");
      out.write("                \n");
      out.write("                $(container).append('<label id=\"lbl\">Reached the limit! You can add only 8 skills.</label>');  \n");
      out.write("                $('#btnd').attr('disabled', 'disabled');\n");
      out.write("            }\n");
      out.write("        });});\n");
      out.write("</script>    \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");

    try{
        String nm = session.getAttribute("userId").toString();
        int i=1,x=0;
        if(request.getParameter("btnss")!=null)
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
            PreparedStatement pst;
            while(i!=0)
            {
                pst = conn.prepareStatement(" insert into SKIL values (?,?) ");
                String skill=request.getParameter("ss"+i);
                i++;
                pst.setString(1, nm);
                pst.setString(2, skill);
                if(skill==null)
                    break;
                x=pst.executeUpdate();
                
                 
            }
            if(x>0)
                    response.sendRedirect("Certifications.jsp");
        }
    }
    catch(Exception ex){
          out.println(ex);
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
