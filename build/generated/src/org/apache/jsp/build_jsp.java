package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class build_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en-US\" xml:lang=\"en-US\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" minimum-scale=\"1\">   \n");
      out.write("  <style>\n");
      out.write("\n");
      out.write("\n");
      out.write("          *{box-sizing:border-box}\n");
      out.write("        \n");
      out.write("              ol,ul{\n");
      out.write("              margin:0;\n");
      out.write("              padding:0;\n");
      out.write("              list-style:none}\n");
      out.write("       body{\n");
      out.write("              margin:0;\n");
      out.write("           padding:0;\n");
      out.write("             border:0;\n");
      out.write("              font-family:\"Source Sans Pro\",Arial,sans-serif;\n");
      out.write("              font-size:16px;\n");
      out.write("              line-height:1.5;\n");
      out.write("              font-weight:400;\n");
      out.write("                  color:#2b0c62;\n");
      out.write("              background-color:#f7f7f7;\n");
      out.write("              overflow-x:hidden;\n");
      out.write("              vertical-align:baseline;\n");
      out.write("              text-rendering:optimizeLegibility;\n");
      out.write("              -moz-text-size-adjust:none;-ms-text-size-adjust:none;text-size-adjust:none;-webkit-text-size-adjust:none\n");
      out.write("          }\n");
      out.write("       \n");
      out.write("     .button{ \n");
      out.write("               \tdisplay: inline-block;\n");
      out.write("  \tborder-radius: 100px;\n");
      out.write("  \ttransition: all .2s;\n");
      out.write("    border: none;\n");
      out.write("    outline: 0;\n");
      out.write("   color:  white;\n");
      out.write("  padding: 14px 28px;\n");
      out.write("  font-size: 16px;\n");
      out.write("  cursor: pointer;\n");
      out.write("\n");
      out.write("  background-color:#f98b3e;\n");
      out.write("  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2),0 6px 20px 0 rgba(0,0,0,0.19);\n");
      out.write("  \n");
      out.write("       }\n");
      out.write("       .button:hover {\n");
      out.write("  \ttransform: translateY(-3px);\n");
      out.write("  \tbox-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button:active {\n");
      out.write("  \ttransform: translateY(-1px);\n");
      out.write("  \tbox-shadow: 0 5px 10px rgba(0, 0, 0, 0.2);\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<style>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("     body.loadingBody{overflow:hidden;background:#fff!important}\n");
      out.write("     .waitPreLoad{display:none}\n");
      out.write("     .dvWizardloading{position:fixed;top:0;right:0;bottom:0;left:0;background:#fff;display:none;height:100%;width:100%;z-index:999}\n");
      out.write("           \n");
      out.write("           .wizardPreLoad{position:relative;width:450px;margin:15% auto 0;text-align:center}\n");
      out.write("           \n");
      out.write("           .wizardPreLoad h2{color:#2b0c62;font-size:0;font-weight:400;margin-bottom:20px;text-transform:uppercase;opacity:0}\n");
      out.write("           \n");
      out.write("           .wizardPreLoad .lines{position:absolute;top:35px;bottom:0;background:#f0f2fd;height:2px;width:100%}\n");
      out.write("           \n");
      out.write("           .wizardPreLoad .line-active{position:relative;top:-16px;background:#2b0c62;display:inline-block;\n");
      out.write("                       height:2px;width:0;font-size:2px;line-height:2px}\n");
      out.write("           \n");
      out.write("           .wizardPreLoad .load-texts-wrp{position:relative;top:25px;overflow:hidden;height:105px}\n");
      out.write("           \n");
      out.write("           .wizardPreLoad .load-texts{position:relative;top:-105px;bottom:0;left:0;width:450px}\n");
      out.write("           \n");
      out.write("           .wizardPreLoad .load-texts>div{color:#2b0c62;display:block;font-size:16px;margin-bottom:10px;overflow:hidden;line-height:18px}\n");
      out.write("           \n");
      out.write("           .wizardPreLoad .load-texts>div.ld-fn{display:none}\n");
      out.write("</style>\n");
      out.write("<style>\n");
      out.write("                            \n");
      out.write("                            @media only screen and (max-width:1023px){\n");
      out.write("                                \n");
      out.write("                                .hiw-cont .option-available .connecting-dot{width:120px;left:163px}}\n");
      out.write("                            .hiw-cont .cta-container{margin-bottom:20px}\n");
      out.write("                        \n");
      out.write("                            .hiw-new .hiw-content{display:-webkit-box;display:flex;\n");
      out.write("                                                  \n");
      out.write("                                        -webkit-box-pack:justify;justify-content:space-between;height:100vh;width:100%;min-height:600px}\n");
      out.write("                            .hiw-new .col-left{position:relative;\n");
      out.write("                                     background-size:cover;\n");
      out.write("                                    \n");
      out.write("                                     background-position:center top;height:100vh;width:36%}\n");
      out.write("                            \n");
      out.write("                            @media screen and (max-width:1349px){\n");
      out.write("                                \n");
      out.write("                                .hiw-new .col-left .affiliates-comp .img-col{margin:0 0 0 23px}\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            }\n");
      out.write("                      \n");
      out.write("                            .hiw-new .col-right{padding-left:90px;width:64%}\n");
      out.write("                            \n");
      out.write("                            @media only screen and (max-width:1023px){.hiw-new .col-right{padding-left:40px;width:57%}\n");
      out.write("                             .hiw-new .col-right .create-resume{padding-right:30px}}\n");
      out.write("                            \n");
      out.write("                            .hiw-new .col-right .create-resume{display:-webkit-box;display:flex;-webkit-box-orient:vertical;\n");
      out.write("                                          -webkit-box-direction:normal;flex-direction:column;-webkit-box-align:start;align-items:flex-start;\n");
      out.write("                                          -webkit-box-pack:center;justify-content:center;height:100vh;width:100%}\n");
      out.write("                            .hiw-new .col-right .create-resume h1{font-size:40px;font-weight:700;line-height:38px;margin:0 0 25px;\n");
      out.write("                                             max-width:550px}\n");
      out.write("                     \n");
      out.write("                            .hiw-new .col-right ul{counter-reset:section;margin:0 0 20px}\n");
      out.write("                            .hiw-new .col-right ul li{position:relative;font-size:18px;margin-bottom:18px}\n");
      out.write("                            .hiw-new .col-right ul li:before{height:30px;width:30px;display:inline-block;content:\"\";\n");
      out.write("                                   border-radius:50%;background-color:#00c293;vertical-align:middle}\n");
      out.write("                            \n");
      out.write("                            .hiw-new .col-right ul li:after{position:absolute;top:5px;left:3px;height:30px;width:30px;\n");
      out.write("                                  counter-increment:section;content:counter(section);border-radius:50%;\n");
      out.write("                                  background-color:#2b0c62;color:#fff;\n");
      out.write("                                  font-size:18px;font-weight:700;text-align:center;line-height:29px}\n");
      out.write("                            \n");
      out.write("                            .hiw-new .col-right ul li span{margin-left:15px;position:relative;top:5px}\n");
      out.write("                            \n");
      out.write("                            .hiw-new .button-primary{min-width:235px}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write(" \n");
      out.write("<script defer=\"defer\" src=\"//ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js\" ></script> \n");
      out.write("<script defer=\"defer\" src=\"https://cdnprod1.resumehelp.com/javascripts/app.min.js?v=1500\"></script>\n");
      out.write("<script defer=\"defer\" src=\"https://cdnprod1.resumehelp.com/javascripts/wizard/how-it-works-rb.min.js?v=1500\"></script>\n");
      out.write("<script defer=\"defer\" src=\"https://cdnprod1.resumehelp.com/javascripts/common/modernizr-webp.js?v=1500\"></script>\n");
      out.write("</head>\n");
      out.write("<body class=\"bg-white hiw-new \">\n");
      out.write("\n");
      out.write("        <header class=\"header\"></header>\n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("        <section>\n");
      out.write("            <div class=\"hiw-content\">\n");
      out.write("                <div class=\"col-left\">\n");
      out.write("                    <div class=\"affiliates-comp\">\n");
      out.write("\n");
      out.write("                        <div class=\"img-col\">\n");
      out.write("                            <img src=\"images/89.webp\" width=\"600px\" height=\"640px\"/>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-right\">\n");
      out.write("                    <div class=\"create-resume\">\n");
      out.write("                        <h1>The easiest way to create a professional resume.</h1>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><span>Choose your favorite resume Template.</span></li>\n");
      out.write("                            <li><span>Insert your Details Accurately.</span></li>\n");
      out.write("                            <li><span>Download and print your new resume.</span></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <a href=\"getstarted.jsp\"> <button class=\"button\" id=\"btnCreateResume\">BUILD YOUR RESUME</button></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
