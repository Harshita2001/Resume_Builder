package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class resume_005fdet_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@10.10.1/dist/sweetalert2.all.min.js\"></script>\n");
      out.write("        <link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/sweetalert2@10.10.1/dist/sweetalert2.min.css'>\n");
      out.write("<script src=\"alert/dist/sweetalert-dev.js\"></script>\n");
      out.write("  <link rel=\"stylesheet\" href=\"alert/dist/sweetalert.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("      <script src=\"https://cdn.tiny.cloud/1/6x7zn6obtay5y18ual7htiku4v793qherw3ko7awq7p8onq7/tinymce/5/tinymce.min.js\" referrerpolicy=\"origin\"></script>\n");
      out.write("    <script src=\"https://kit.fontawesome.com/yourcode.js\" crossorigin=\"anonymous\"></script>\n");
      out.write(" <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
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
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jqueryui/1.9.1/jquery-ui.min.js\"></script>\n");
      out.write("\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write("    @import url(https://fonts.googleapis.com/css?family=Lato:900);\n");
      out.write("*, *:before, *:after{\n");
      out.write("  box-sizing:border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div.foo{\n");
      out.write("  width: 100%;\n");
      out.write("  margin: 0 auto;\n");
      out.write("  text-align: left;\n");
      out.write("\n");
      out.write("}\n");
      out.write(".letter{\n");
      out.write("   letter-spacing: 1px;\n");
      out.write("   font-weight: 900;\n");
      out.write("  font-size: 4em;\n");
      out.write("  margin: 0.0em;\n");
      out.write("  position: relative;\n");
      out.write("  color:#3b5998;\n");
      out.write("  transform-style: preserve-3d;\n");
      out.write("  perspective: 800;\n");
      out.write("  z-index: 1;\n");
      out.write("}\n");
      out.write(".letter:before, .letter:after{\n");
      out.write("  position:absolute;\n");
      out.write("  content: attr(data-letter);\n");
      out.write("  transform-origin: top left;\n");
      out.write("  top:0;\n");
      out.write("  left:0;\n");
      out.write("}\n");
      out.write(".letter, .letter:before, .letter:after{\n");
      out.write("  transition: all 0.3s ease-in-out;\n");
      out.write("}\n");
      out.write(".letter:before{\n");
      out.write("  color: #fff;\n");
      out.write("  text-shadow: \n");
      out.write("    -1px 0px 1px rgba(255,255,255,.8),\n");
      out.write("    1px 0px 1px rgba(0,0,0,.8);\n");
      out.write("  z-index: 3;\n");
      out.write("  transform:\n");
      out.write("    rotateX(0deg)\n");
      out.write("    rotateY(-15deg)\n");
      out.write("    rotateZ(0deg);\n");
      out.write("}\n");
      out.write(".letter:after{\n");
      out.write("  color: rgba(0,0,0,.11);\n");
      out.write("  z-index:2;\n");
      out.write("  transform:\n");
      out.write("    scale(1.08,1)\n");
      out.write("    rotateX(0deg)\n");
      out.write("    rotateY(0deg)\n");
      out.write("    rotateZ(0deg)\n");
      out.write("    skew(0deg,1deg);\n");
      out.write("}\n");
      out.write(".letter:hover:before{\n");
      out.write("  color: #fafafa;\n");
      out.write("  transform:\n");
      out.write("    rotateX(0deg)\n");
      out.write("    rotateY(-40deg)\n");
      out.write("    rotateZ(0deg);\n");
      out.write("}\n");
      out.write(".letter:hover:after{\n");
      out.write("  transform:\n");
      out.write("    scale(1.08,1)\n");
      out.write("    rotateX(0deg)\n");
      out.write("    rotateY(40deg)\n");
      out.write("    rotateZ(0deg)\n");
      out.write("    skew(0deg,22deg);\n");
      out.write("}\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</style>\n");
      out.write("<link href=\"https://cdnprod2.resumehelp.com/styles/base.min.css?v=1500\" rel=\"stylesheet\" />\n");
      out.write("  \n");
      out.write("<style>\n");
      out.write("\n");
      out.write(" *{box-sizing:border-box}\n");
      out.write("        body,form,h1,h2,h3,\n");
      out.write("         h4,h5,h6,header,li,menu,nav,ol,\n");
      out.write("         p,section,table,u,ul{margin:0;padding:0;border:0;font-size:100%;vertical-align:baseline}\n");
      out.write("         \n");
      out.write("         ol,ul{margin:0;padding:0;list-style:none}\n");
      out.write("         \n");
      out.write("         html{position:relative;min-height:100%}\n");
      out.write("         \n");
      out.write("         body{font-family:\"Source Sans Pro\",Arial,sans-serif;\n");
      out.write("              font-size:16px;\n");
      out.write("              line-height:1.5;\n");
      out.write("              font-weight:400;\n");
      out.write("              color:#2b0c62;\n");
      out.write("              background-color:whitesmoke;\n");
      out.write("              }\n");
      out.write("         h1{font-size:30px;font-weight:700}\n");
      out.write("         h2{font-size:25px}\n");
      out.write("         a{text-decoration:none}\n");
      out.write("        .display-block{display:block!important}\n");
      out.write("         .display-inlineblock{display:inline-block!important}\n");
      out.write("         .display-flex{display:-webkit-box!important;display:flex!important}\n");
      out.write("       .text-upper{text-transform:uppercase;} .text-lower{text-transform:lowercase}\n");
      out.write("                  .text-capitalize{text-transform:capitalize}\n");
      out.write("                  .text-initial{text-transform:initial!important}\n");
      out.write("              .float-right{float:right!important}\n");
      out.write("              .float-left{float: left!important}\n");
      out.write("                   .container-main::after,.grid-container::after{content:\"\";clear:both}\n");
      out.write("              .container-main{margin:auto;;width:100%;}\n");
      out.write("                  .container-main::after{display:table}\n");
      out.write("                  \n");
      out.write("                 .outer-wrapper{\n");
      out.write("                               padding:20px 30px 30px;\n");
      out.write("                               margin-bottom:125px;\n");
      out.write("                               background:white;\n");
      out.write("                                margin-top:30px;\n");
      out.write("                 }\n");
      out.write("                 body.finalize-page-new{overflow-x:unset}\n");
      out.write("     .fc-widget-normal{right:5px!important;bottom:10px!important}\n");
      out.write("     .grid-container{width:100%}\n");
      out.write("     .grid-container::after{display:block}\n");
      out.write("      \n");
      out.write("     \n");
      out.write("     .button{\n");
      out.write("     display: inline-block;\n");
      out.write("  \tborder-radius: 100px;\n");
      out.write("     \n");
      out.write("  \ttransition: all .2s;\n");
      out.write("    border: none;\n");
      out.write("    outline: 0;\n");
      out.write("   color:  white;\n");
      out.write("  padding: 14px 28px;\n");
      out.write("  font-size: 16px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  background-color:#f98b3e;\n");
      out.write("  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2),0 6px 20px 0 rgba(0,0,0,0.19);\n");
      out.write("  \n");
      out.write("     } \n");
      out.write("\n");
      out.write(".button:hover {\n");
      out.write("  \ttransform: translateY(-3px);\n");
      out.write("  \tbox-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button:active {\n");
      out.write("  \ttransform: translateY(-1px);\n");
      out.write("  \tbox-shadow: 0 5px 10px rgba(0, 0, 0, 0.2);\n");
      out.write("}\n");
      out.write("     \n");
      out.write("     .button-primary{\n");
      out.write("         display: inline-block;\n");
      out.write("  \tborder-radius: 100px;\n");
      out.write("     \n");
      out.write("  \ttransition: all .2s;\n");
      out.write("    border: none;\n");
      out.write("    outline: 0;\n");
      out.write("   color:  white;\n");
      out.write("  padding: 14px 28px;\n");
      out.write("  font-size: 16px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  background-color:#f98b3e;\n");
      out.write("  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2),0 6px 20px 0 rgba(0,0,0,0.19);\n");
      out.write("     }\n");
      out.write("     \n");
      out.write("    .button-tertiary{    display: inline-block;\n");
      out.write("  \tborder-radius: 100px;\n");
      out.write("     \n");
      out.write("  \ttransition: all .2s;\n");
      out.write("    border: none;\n");
      out.write("    outline: 0;\n");
      out.write("   color:  white;\n");
      out.write("  padding: 14px 28px;\n");
      out.write("  font-size: 16px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  background-color:#f98b3e;\n");
      out.write("  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2),0 6px 20px 0 rgba(0,0,0,0.19);\n");
      out.write("    \n");
      out.write("    }\n");
      out.write("    .button-primary:hover {\n");
      out.write("  \ttransform: translateY(-3px);\n");
      out.write("  \tbox-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button-primary:active {\n");
      out.write("  \ttransform: translateY(-1px);\n");
      out.write("  \tbox-shadow: 0 5px 10px rgba(0, 0, 0, 0.2);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button-tertiary:active {\n");
      out.write("  \ttransform: translateY(-1px);\n");
      out.write("  \tbox-shadow: 0 5px 10px rgba(0, 0, 0, 0.2);\n");
      out.write("}\n");
      out.write("  .button-tertiary:hover {\n");
      out.write("  \ttransform: translateY(-3px);\n");
      out.write("  \tbox-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);\n");
      out.write("}\n");
      out.write("\n");
      out.write("                                           .text-link{color:#00c293}\n");
      out.write("                                           .text-link:active,.text-link:focus,\n");
      out.write("                                                 .text-link:hover{color:#009f78\n");
      out.write("                                                 }\n");
      out.write("                                                 \n");
      out.write("                                                 \n");
      out.write("                                                 .btn-md{padding:9px 10px}.btn-md-45{padding:9.5px 10px;line-height:1.25}\n");
      out.write("                                                 .btn-sm{padding:7.5px 10px;font-size:14px;text-transform:initial}\n");
      out.write("                                                 .cta-container{margin:35px 0 10px;text-align:center}\n");
      out.write("                                                 .cta-container .button-tertiary,.cta-container .button-tertiary+.\n");
      out.write("                                                 button-primary{min-width:167px}.cta-container .button-tertiary+\n");
      out.write("                                                 .button-primary+.skip-cta{float:right;color:#878787;\n");
      out.write("                                                          text-decoration:underline;margin:10px 10px 0 0;font-size:16px}\n");
      out.write("                                                 .input-group .input-element.invalid:after,\n");
      out.write("                                                 .input-group .input-element.valid:after\n");
      out.write("                                                 {top:50%;font-size:inherit;font-family:\"Font Awesome 5 Pro\";right:10px}\n");
      out.write("                                                 .description-container .button-default{\n");
      out.write("                                                     width:100%;margin:10px auto}\n");
      out.write("                                                 .input-group .input-element.valid input{padding-right:25px}\n");
      out.write("                                                 .input-group .input-element.valid:after{position:absolute;content:\"\\f00c\";\n");
      out.write("                                                       color:#00c293;-webkit-transform:translateY(-50%);\n");
      out.write("                                                       \n");
      out.write("                                                       -ms-transform:translateY(-50%);transform:translateY(-50%)}\n");
      out.write("                                                 .input-group .input-element.invalid{position:relative}\n");
      out.write("                                                 .input-group .input-element.invalid input\n");
      out.write("                                                 \n");
      out.write("      {border-color:#fb6565;padding-right:25px}\n");
      out.write("      .input-group .input-element.invalid:after{position:absolute;content:\"\\f00d\";color:#fb6565;\n");
      out.write("            -webkit-transform:translateY(-50%);-ms-transform:translateY(-50%);transform:translateY(-50%)}\n");
      out.write("      .input-row::after{clear:both;content:\"\";display:table}.input-row .input-group{float:left}\n");
      out.write("      .input-group{font-family:\"Source Sans Pro\",Arial,sans-serif;font-size:14px;line-height:1.3;font-weight:400;color:#333;\n");
      out.write("                  margin-bottom:10px}.input-group label{display:inline-block;margin-bottom:3px}\n");
      out.write("                  .input-group .input-element{position:relative;width:100%}.input-group .input-element .ui-autocomplete\n");
      out.write("                  {z-index:9;width:100%!important;left:0!important;max-height:215px;border-top:1px solid #ccc}\n");
      out.write("                  .input-group [contenteditable=true],.input-group input[type=text],\n");
      out.write("                  .input-group input[type=password],.input-group input[type=email],.input-group input[type=number],\n");
      out.write("                  .input-group input[type=search],.input-group select,.input-group textarea{height:40px;width:100%;\n");
      out.write("                                       display:block;font-size:15px;font-family:\"Source Sans Pro\",Arial,sans-serif;\n");
      out.write("                                       -webkit-appearance:none;-moz-appearance:none;appearance:none;border-radius:0;\n");
      out.write("    padding:10px;background-color:#fff;box-shadow:none;border:1px solid #ccc;color:#333}\n");
      out.write("                  .input-group [contenteditable=true]:focus,.input-group input[type=text]:focus,.input-group input\n");
      out.write("                  [type=password]:focus,.input-group input[type=email]:focus,.input-group input[type=number]:focus,\n");
      out.write("                  .input-group input[type=search]:focus,.input-group select:focus,.input-group textarea:focus{outline:0;\n");
      out.write("                        border:1px solid #00c293}.input-group [contenteditable=true]:focus{outline:0;box-shadow:0 0 5px #ddd;\n");
      out.write("                              border:1px solid #ccc}.input-group .nice-select{border-radius:0;height:40px;line-height:30px;\n");
      out.write("    font-size:15px;float:none}.input-group .nice-select .list{border-radius:0}.input-group .nice-select:after{\n");
      out.write("        -webkit-transform:none;-ms-transform:none;transform:none;width:0;height:0;border-left:5px solid transparent!important;\n");
      out.write("        border-right:5px solid transparent!important;border-top:5px solid #333;border-bottom:0;top:55%}\n");
      out.write("    .input-group .nice-select.open:after{border-bottom:5px solid #333;border-top:0;-webkit-transition:none;transition:none;\n");
      out.write("          -webkit-transform:rotate(0);-ms-transform:rotate(0);transform:rotate(0)}\n");
      out.write("    .input-group .nice-select:focus{outline:0;border:1px solid #00c293!important}\n");
      out.write("    .inline-input{margin-bottom:20px}.inline-input label{margin-bottom:0}.inline-input\n");
      out.write("    .input-element{display:inline-block;vertical-align:middle;width:auto}.inline-input\n");
      out.write("    .input-element>*{width:100%}.select-box .input-element.invalid:after{display:none}.input-control{height:40px;width:100%;\n");
      out.write("                  display:block;font-size:15px;-webkit-appearance:none;-moz-appearance:none;appearance:none;border-radius:0;\n");
      out.write("                  padding:10px;background-color:#fff;box-shadow:none;border:1px solid #ccc;color:#333}.input-control:focus\n");
      out.write("    {outline:0;border:1px solid #00c293}textarea{font-family:\"Source Sans Pro\",Arial,sans-serif;overflow:auto;\n");
      out.write("             -webkit-overflow-scrolling:touch}input[disabled],input[readonly]{background-color:#f2f2f2!important}\n");
      out.write("    select[disabled],select[readonly],textarea[disabled]{color:#767676!important}input[type=search]::-ms-clear{display:none;\n");
      out.write("              width:0;height:0}input[type=search]::-ms-reveal{display:none;width:0;height:0}input[type=search]\n");
      out.write("              ::-webkit-search-cancel-button,input[type=search]::-webkit-search-decoration,input[type=search]\n");
      out.write("              ::-webkit-search-results-button,input[type=search]::-webkit-search-results-decoration{display:none}\n");
      out.write("              .error-message{color:#fb6565;font-size:13px;line-height:1.3;display:none}\n");
      out.write("              .no-label-text{padding-top:21px}::-ms-clear{display:none}input[type=checkbox],input[type=radio]\n");
      out.write("              {opacity:0;position:absolute;z-index:-1}input[type=checkbox]\n");
      out.write("              :active+input[type=hidden]+label.cst-checkbox:before,input[type=checkbox]:active+label:before,\n");
      out.write("              input[type=radio]:active+input[type=hidden]+label.cst-checkbox:before,input[type=radio]:active+label:before\n");
      out.write("      {-webkit-transition-duration:0;transition-duration:0}input[type=checkbox]+input[type=hidden]+label.cst-checkbox,\n");
      out.write("      input[type=checkbox]+label,input[type=radio]+input[type=hidden]+label.cst-checkbox,input[type=radio]+label{\n");
      out.write("          cursor:pointer;font-weight:400;position:relative;padding:0 10px 0 2em;vertical-align:middle;\n");
      out.write("          -webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none}\n");
      out.write("      input[type=checkbox]+input[type=hidden]+label.cst-checkbox:before,input[type=checkbox]+label:before,\n");
      out.write("      input[type=radio]+input[type=hidden]+label.cst-checkbox:before,input[type=radio]+label:\n");
      out.write("      before{position:absolute;top:50%;left:0;box-sizing:content-box;border-radius:0;content:\"\";width:16px;height:16px;\n");
      out.write("             margin-top:-9px;border:1px solid #ccc;text-align:center}input[type=checkbox]+input[type=hidden]\n");
      out.write("      +label.cst-checkbox:after,input[type=checkbox]+label:after,input[type=radio]+input[type=hidden]+label.cst-checkbox:after,input[type=radio]+label:after{position:absolute;top:50%;left:3px;box-sizing:content-box;content:\"\";background-color:#00c293;width:12px;height:12px;margin-top:-6px;-webkit-transform:scale(0);-ms-transform:scale(0);transform:scale(0);-webkit-transform-origin:50%;-ms-transform-origin:50%;transform-origin:50%;\n");
      out.write("            -webkit-transition:-webkit-transform .2s ease-out;transition:-webkit-transform .2s ease-out;transition:transform .2s ease-out;transition:transform .2s ease-out,-webkit-transform .2s ease-out}input[type=checkbox]+input[type=hidden]+label.cst-checkbox:after,input[type=checkbox]+label:after{top:50%;background-color:transparent;width:9px;height:4px;margin-top:-5px;border-style:solid;border-color:#fff;border-width:0 0 3px 3px;-webkit-border-image:none;-o-border-image:none;border-image:none;-webkit-transform:rotate(-45deg) scale(0);-ms-transform:rotate(-45deg) scale(0);transform:rotate(-45deg) scale(0);-webkit-transition:none;transition:none}input[type=checkbox]:checked+input[type=hidden]+label.cst-checkbox:before,input[type=checkbox]:checked+label:before{background-color:#00c293;border-color:#00c293;-webkit-animation:borderscale .2s ease;animation:borderscale .2s ease}input[type=radio]:checked+label:before{background-color:#fff;border-color:#00c293}\n");
      out.write("      input[type=radio]:checked+label:after{-webkit-transform:scale(.7);-ms-transform:scale(.7);transform:scale(.7)}input[type=radio]+label{font-size:14px}input[type=radio]+label:after,input[type=radio]+label:before{border-radius:50%}input[type=checkbox]:checked+input[type=hidden]+label.cst-checkbox:after,input[type=checkbox]:checked+label:after{content:\"\";-webkit-transition:-webkit-transform .2s ease-out;transition:-webkit-transform .2s ease-out;transition:transform .2s ease-out;transition:transform .2s ease-out,-webkit-transform .2s ease-out;-webkit-transform:rotate(-45deg) scale(1);-ms-transform:rotate(-45deg) scale(1);transform:rotate(-45deg) scale(1)}\n");
      out.write("     \n");
      out.write("\n");
      out.write("\n");
      out.write("   .header{position:relative;\n");
      out.write("           background-color:#00073a;\n");
      out.write("     height:70px;padding:13px 10px;\n");
      out.write("     text-transform:capitalize}\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("@media only screen and (min-width:1024px){\n");
      out.write("    .funnel-wrapper .form-container-main section{width:calc(50% - 22.5px);float:left;margin-left:15px\n");
      out.write("    \n");
      out.write("    }}\n");
      out.write(".funnel-wrapper .form-container-main section.form-text{padding-top:8px}\n");
      out.write(".funnel-wrapper .form-container-main section+section{margin-top:12px}\n");
      out.write("\n");
      out.write(".funnel-wrapper .form-container-main .show-image{margin:0 auto;background:0 0;border:2px solid #ccc;\n");
      out.write("           width:236px;height:325px;padding:16px;position:relative;overflow:hidden}\n");
      out.write(".upload-page{margin-bottom:45px}\n");
      out.write("           .upload-page .upload-wrapper{display:-webkit-box;display:flex;-webkit-box-pack:end;\n");
      out.write("                          justify-content:flex-end;-webkit-box-align:center;align-items:center;height:calc(100vh - 205px);\n");
      out.write("                          width:100%;min-height:660px}.upload-page .upload-wrapper .upload-content-outer{margin:0 auto}\n");
      out.write("                          .upload-page .upload-wrapper .upload-content{max-width:640px;padding:0 75px;-webkit-box-pack:center;\n");
      out.write("                                         justify-content:center;-webkit-box-align:center;align-items:center}\n");
      out.write("                          .upload-page .upload-wrapper \n");
      out.write("                          .upload-content .upload-option-container{min-height:259px}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<link href=\"https://cdnprod2.resumehelp.com/styles/builder.min.css?v=1500\" rel=\"stylesheet\" />\n");
      out.write("       \n");
      out.write("<style>\n");
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
      out.write("<style>\n");
      out.write("* {box-sizing: border-box}\n");
      out.write("body {font-family: \"Lato\", sans-serif;}\n");
      out.write("\n");
      out.write("/* Style the tab */\n");
      out.write(".tab {\n");
      out.write("  float: left;\n");
      out.write("  \tbox-shadow: 0 5px 10px rgba(0, 0, 0, 0.2);\n");
      out.write("  background-color:whitesmoke;\n");
      out.write("  width: 22%;\n");
      out.write("\n");
      out.write(" margin-left: 70px;\n");
      out.write(" margin-top: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the buttons inside the tab */\n");
      out.write(".tab button {\n");
      out.write("  display: block;\n");
      out.write("  background-color:white;\n");
      out.write(" color:#2b0c62;\n");
      out.write("  padding: 20px 10px;\n");
      out.write("  width: 100%;\n");
      out.write(" outline: none;\n");
      out.write("  text-align:left;\n");
      out.write("  cursor: pointer;\n");
      out.write("  transition: 0.3s;\n");
      out.write("  font-size: 18px;\n");
      out.write(" border-top-style: solid;\n");
      out.write("\n");
      out.write(" border-top-color:lightgray;\n");
      out.write(" border-top-width: 1.5px;\n");
      out.write("  border-top-style: solid;\n");
      out.write("\n");
      out.write(" border-bottom-color:lightgray;\n");
      out.write(" border-bottom-width: 1.5px;\n");
      out.write("  border-bottom-style: solid;\n");
      out.write("\n");
      out.write(" border-left-color:lightgray;\n");
      out.write(" border-left-width: 1.5px;\n");
      out.write("  border-left-style: solid;\n");
      out.write(" border-right-style: none;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Change background color of buttons on hover */\n");
      out.write(".tab button:hover {\n");
      out.write("  background-color: #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Create an active/current \"tab button\" class */\n");
      out.write(".tab button.active {\n");
      out.write("  background-color:whitesmoke ;\n");
      out.write("  border-left-style: solid;\n");
      out.write("  border-left-color:orange;\n");
      out.write("  border-left-width: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the tab content */\n");
      out.write(".tabcontent {\n");
      out.write("  float: left;\n");
      out.write("  \n");
      out.write("padding: 2px;\n");
      out.write("  width: 70%;\n");
      out.write("  border-left: none;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<style>\n");
      out.write("            div.foo{\n");
      out.write("  width: 100%;\n");
      out.write("  margin: 0 auto;\n");
      out.write("  text-align: left;\n");
      out.write("}\n");
      out.write(".letter{\n");
      out.write("   letter-spacing: 1px;\n");
      out.write("   font-weight: 900;\n");
      out.write("  font-size: 4em;\n");
      out.write("  margin: 0.0em;\n");
      out.write("  position: relative;\n");
      out.write("  color:#3b5998;\n");
      out.write("  transform-style: preserve-3d;\n");
      out.write("  perspective: 800;\n");
      out.write("  z-index: 1;\n");
      out.write("}\n");
      out.write(".letter:before, .letter:after{\n");
      out.write("  position:absolute;\n");
      out.write("  content: attr(data-letter);\n");
      out.write("  transform-origin: top left;\n");
      out.write("  top:0;\n");
      out.write("  left:0;\n");
      out.write("}\n");
      out.write(".letter, .letter:before, .letter:after{\n");
      out.write("  transition: all 0.3s ease-in-out;\n");
      out.write("}\n");
      out.write(".letter:before{\n");
      out.write("  color: #fff;\n");
      out.write("  text-shadow: \n");
      out.write("    -1px 0px 1px rgba(255,255,255,.8),\n");
      out.write("    1px 0px 1px rgba(0,0,0,.8);\n");
      out.write("  z-index: 3;\n");
      out.write("  transform:\n");
      out.write("    rotateX(0deg)\n");
      out.write("    rotateY(-15deg)\n");
      out.write("    rotateZ(0deg);\n");
      out.write("}\n");
      out.write(".letter:after{\n");
      out.write("  color: rgba(0,0,0,.11);\n");
      out.write("  z-index:2;\n");
      out.write("  transform:\n");
      out.write("    scale(1.08,1)\n");
      out.write("    rotateX(0deg)\n");
      out.write("    rotateY(0deg)\n");
      out.write("    rotateZ(0deg)\n");
      out.write("    skew(0deg,1deg);\n");
      out.write("}\n");
      out.write(".letter:hover:before{\n");
      out.write("  color: #fafafa;\n");
      out.write("  transform:\n");
      out.write("    rotateX(0deg)\n");
      out.write("    rotateY(-40deg)\n");
      out.write("    rotateZ(0deg);\n");
      out.write("}\n");
      out.write(".letter:hover:after{\n");
      out.write("  transform:\n");
      out.write("    scale(1.08,1)\n");
      out.write("    rotateX(0deg)\n");
      out.write("    rotateY(40deg)\n");
      out.write("    rotateZ(0deg)\n");
      out.write("    skew(0deg,22deg);\n");
      out.write("}  \n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write(".column {\n");
      out.write(" float: left;\n");
      out.write("  width: 30%;\n");
      out.write("  padding-left:100px;\n");
      out.write("  height: 200px;\n");
      out.write("}\n");
      out.write("/* Clearfix (clear floats) */\n");
      out.write(".row::after {\n");
      out.write("  content: \"\";\n");
      out.write("  clear: both;\n");
      out.write("  display: table;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("/* Responsive layout - makes the three columns stack on top of each other instead of next to each other */\n");
      out.write("@media screen and (max-width: 500px) {\n");
      out.write("  .column {\n");
      out.write("    width: 100%;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("    \n");
      out.write(" /* Footer start */\n");
      out.write("@import url('https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css');\n");
      out.write("section {\n");
      out.write("    padding: 60px 0;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("#footer {\n");
      out.write("    height: 65vh;\n");
      out.write("    background-image:   linear-gradient(to right bottom,#0099cc,lightblue );\n");
      out.write("     clip-path: polygon(0 10vh, 100% 0, 100% 75vh, 0 100%);\n");
      out.write("     \n");
      out.write("}\n");
      out.write("#footer h5{\n");
      out.write("\tpadding-left: 10px;\n");
      out.write("    border-left: 3px solid #eeeeee;\n");
      out.write("    padding-bottom: 6px;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("    color:#2b0c62;\n");
      out.write("    font-family: serif;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("#footer a {\n");
      out.write("    color:#2b0c62;\n");
      out.write("    text-decoration: none !important;\n");
      out.write("    background-color: transparent;\n");
      out.write("    -webkit-text-decoration-skip: objects;\n");
      out.write("}\n");
      out.write("#footer ul.social li{\n");
      out.write("\tpadding-left: 40px;\n");
      out.write("      \n");
      out.write("       \n");
      out.write("}\n");
      out.write("#footer ul.social li a i {\n");
      out.write("    margin-right: 5px;\n");
      out.write("\tfont-size:25px;\n");
      out.write("\t-webkit-transition: .5s all ease;\n");
      out.write("\t-moz-transition: .5s all ease;\n");
      out.write("\ttransition: .5s all ease;\n");
      out.write("}\n");
      out.write("#footer ul.social li:hover a i {\n");
      out.write("\tfont-size:30px;\n");
      out.write("\tmargin-top:-10px;\n");
      out.write("}\n");
      out.write("#footer ul.social li a,\n");
      out.write("#footer ul.quick-links li a{\n");
      out.write("\tcolor:#ffffff;\n");
      out.write("        font-family: serif;\n");
      out.write("}\n");
      out.write("#footer ul.social li a:hover{\n");
      out.write("\tcolor:#2b0c62;\n");
      out.write("}\n");
      out.write("#footer ul.quick-links li{\n");
      out.write("\tpadding: 3px 0;\n");
      out.write("\t-webkit-transition: .5s all ease;\n");
      out.write("\t-moz-transition: .5s all ease;\n");
      out.write("\ttransition: .5s all ease;\n");
      out.write("}\n");
      out.write("#footer ul.quick-links li:hover{\n");
      out.write("\tpadding: 3px 0;\n");
      out.write("\tmargin-left:5px;\n");
      out.write("\tfont-weight:700;\n");
      out.write("}\n");
      out.write("#footer ul.quick-links li a i{\n");
      out.write("\tmargin-right: 5px;\n");
      out.write("}\n");
      out.write("#footer ul.quick-links li:hover a i {\n");
      out.write("    font-weight: 700;\n");
      out.write("}\n");
      out.write("@media (max-width:767px){\n");
      out.write("\t#footer h5 {\n");
      out.write("    padding-left: 0;\n");
      out.write("    border-left: transparent;\n");
      out.write("    padding-bottom: 0px;\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write(" ");
      out.write("\n");
      out.write("        <header class=\"header\">\n");
      out.write("            <div class=\"foo\" style=\"padding-left: 10px; padding-top: 1px;\">\n");
      out.write("    <span class=\"letter\" data-letter=\"R\">R</span><span class=\"letter\" data-letter=\"B\">B</span>\n");
      out.write("     <a href=\"profile.jsp\" style=\"font-family:sans-serif;color:#2b0c62;padding-left: 10px;\">ResumeBuilder</a>\n");
      out.write("                   </div> \n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("            \n");
      out.write("<div class=\"tab\">\n");
      out.write("\n");
      out.write("    <button class=\"tablinks\" onclick=\"openCity(event, 'info')\" id=\"defaultOpen\"> <i class='fas fa-user' style='font-size:24px'></i><b>&nbsp;&nbsp;Basic Information</b></button>\n");
      out.write("    <button class=\"tablinks\" onclick=\"openCity(event, 'edu')\"><i class='fas fa-graduation-cap' style='font-size:24px'></i>&nbsp;&nbsp;<b>Education</b> </button>\n");
      out.write("    <button class=\"tablinks\" onclick=\"openCity(event, 'work')\"><i class='fas fa-laptop-code' style='font-size:24px'></i>&nbsp;&nbsp;<b>Work Experience</b></button>\n");
      out.write("    <button class=\"tablinks\" onclick=\"openCity(event, 'skill')\"><i class='far fa-keyboard' style='font-size:24px'></i>&nbsp;&nbsp;<b>Key Skills</b></button>\n");
      out.write("    <button class=\"tablinks\" onclick=\"openCity(event, 'certi')\"><i class='fas fa-award' style='font-size:24px'></i>&nbsp;&nbsp;<b>Certifications</b> </button>\n");
      out.write("    <button class=\"tablinks\" onclick=\"openCity(event, 'pro')\"><i class='fas fa-database' style='font-size:24px'></i>&nbsp;&nbsp;<b>Projects</b></button>\n");
      out.write("    <button class=\"tablinks\" onclick=\"openCity(event, 'lang')\"><i class='fas fa-pen' style='font-size:24px'></i>&nbsp;&nbsp;<b>Languages</b></button>\n");
      out.write("    <button class=\"tablinks\" onclick=\"openCity(event, 'inter')\"><i class='fas fa-icons' style='font-size:24px'></i>&nbsp;&nbsp;<b>Hobbies & Interests</b> </button>\n");
      out.write("  <button class=\"tablinks\" onclick=\"openCity(event, 'img')\"><i class='fas fa-user-alt' style='font-size:24px'></i>&nbsp;&nbsp;<b>Upload Profile</b> </button>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("</div>\n");
      out.write(" <form id=\"form1\" method=\"POST\">\n");
      out.write("      <input type=\"submit\" formtarget=\"choose.jsp\" onclick=\"window.location.href='choose.jsp'\" name=\"submit\" value=\"choose template\" class=\"button-primary float-right\" />\n");
      out.write("  <input type=\"submit\" formtarget=\"Template/Decent.jsp\" onclick=\"window.location.href='Template/Decent.jsp'\" name=\"submit1\" value=\"Preview\" class=\"button-primary float-right\" />\n");
      out.write("  \n");
      out.write("      <input type=\"submit\" name=\"btn_submit\" id=\"btn_submit\" value=\"Save all Details\" class=\"third button-primary float-right\" />\n");
      out.write("\n");
      out.write("<div id=\"info\" class=\"tabcontent\">\n");
      out.write("<div class=\"container-main contact-page resume-fn funnel-wrapper\">\n");
      out.write("    <div class=\"outer-wrapper\">\n");
      out.write("        <h1>Basic Information</h1>\n");
      out.write("        <p class=\"sub-header\">Start by filling out your contact information, then move through each tab to add content</p>\n");
      out.write("        <div class=\"form-container-main grid-container content-wrapper\">\n");
      out.write("     \n");
      out.write("               \n");
      out.write("                    \n");
      out.write("                    <div class=\"input-row \">\n");
      out.write("                            <div class=\"input-group email\">\n");
      out.write("                                <label for=\"txtEmail\">First Name</label>\n");
      out.write("                                <div class=\"input-element\">\n");
      out.write("                                    <input type=\"text\" name=\"fname\" class=\"error\" id=\"fname\" tabindex=\"8\" maxlength=\"60\">\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-group phone\">\n");
      out.write("                                <label for=\"txtPhone\">Last Name</label>\n");
      out.write("                                <div class=\"input-element\">\n");
      out.write("                                    <input type=\"text\" name=\"lname\" class=\"error\" id=\"lname\" maxlength=\"20\" tabindex=\"9\">\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                      \n");
      out.write("                    \n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <label for=\"txtAddress\">Address</label>\n");
      out.write("                            <div class=\"input-element\">\n");
      out.write("                                <input type=\"text\" name=\"address\" id=\"address\" class=\"error\" maxlength=\"100\" tabindex=\"2\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-row \">\n");
      out.write("                                \n");
      out.write("                                    <div class=\"input-group city\">\n");
      out.write("                                        <label for=\"txtCity\">City</label>\n");
      out.write("                                        <div class=\"input-element  \">\n");
      out.write("                                            <input type=\"text\" name=\"city\" class=\"error\" id=\"city\" placehoelder=\"\" maxlength=\"50\" autocomplete=\"off\" tabindex=\"3\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                           \n");
      out.write("                                        <div class=\"input-group zip\">\n");
      out.write("                                            <label for=\"txtZipCode\">ZIP code</label>\n");
      out.write("                                            <div class=\"input-element\">\n");
      out.write("                                                <input type=\"text\" name=\"zip\" class=\"error\" id=\"zip\" maxlength=\"10\" tabindex=\"5\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <span id=\"errZipCodeValid\" class=\"error-message\">Please enter numbers only</span>\n");
      out.write("                                        </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"input-group country\">\n");
      out.write("                                <label for=\"txtCountry\">Country</label>\n");
      out.write("                                <div class=\"input-element\">\n");
      out.write("                                    <input type=\"text\" name=\"country\" class=\"error\" id=\"country\" maxlength=\"40\" tabindex=\"6\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div >\n");
      out.write("                                <label class=\"input-group\">Summary</label>\n");
      out.write("                                <div>\n");
      out.write("                                    <textarea class=\"form-control\" class=\"error\"  name=\"summ\" id=\"summ\" rows=\"4\" cols=\"100\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                            </div><br/>\n");
      out.write("                        </div>\n");
      out.write("                           <div class=\"input-row \">\n");
      out.write("                            <div class=\"input-group email\">\n");
      out.write("                                <label for=\"txtEmail\">Email</label>\n");
      out.write("                                <div class=\"input-element\">\n");
      out.write("                                    <input type=\"text\" class=\"error\" name=\"email\" id=\"email\" tabindex=\"8\" maxlength=\"60\">\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-group phone\">\n");
      out.write("                                <label for=\"txtPhone\">Phone</label>\n");
      out.write("                                <div class=\"input-element\">\n");
      out.write("                                    <input type=\"text\" class=\"error\" name=\"contact\" id=\"contact\" maxlength=\"20\" tabindex=\"9\">\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                               \n");
      out.write("                               \n");
      out.write("                        </div>\n");
      out.write("                    \n");
      out.write("<input type=\"button\" value=\"Save\" onclick=\"mySave1()\" class=\"button-primary float-right\" name=\"anubhi\" id=\"anubhi\" />\n");
      out.write("                \n");
      out.write(" <script>\n");
      out.write("    fname.value = localStorage.getItem('fname');\n");
      out.write("    fname.oninput = () => {\n");
      out.write("      localStorage.setItem('fname', fname.value)\n");
      out.write("    };\n");
      out.write("    </script>\n");
      out.write("    <script>\n");
      out.write("    lname.value = localStorage.getItem('lname');\n");
      out.write("    lname.oninput = () => {\n");
      out.write("      localStorage.setItem('lname', lname.value)\n");
      out.write("    };\n");
      out.write("    </script>\n");
      out.write("    <script>\n");
      out.write("    address.value = localStorage.getItem('address');\n");
      out.write("    address.oninput = () => {\n");
      out.write("      localStorage.setItem('address', address.value)\n");
      out.write("    };\n");
      out.write("    </script>\n");
      out.write("   <script>\n");
      out.write("    city.value = localStorage.getItem('city');\n");
      out.write("    city.oninput = () => {\n");
      out.write("      localStorage.setItem('city', city.value)\n");
      out.write("    };\n");
      out.write("    </script>\n");
      out.write("    <script>\n");
      out.write("    zip.value = localStorage.getItem('zip');\n");
      out.write("    zip.oninput = () => {\n");
      out.write("      localStorage.setItem('zip', zip.value)\n");
      out.write("    };\n");
      out.write("    </script>\n");
      out.write("    <script>\n");
      out.write("    country.value = localStorage.getItem('country');\n");
      out.write("    country.oninput = () => {\n");
      out.write("      localStorage.setItem('country', country.value)\n");
      out.write("    };\n");
      out.write("    </script>\n");
      out.write("    <script>\n");
      out.write("    summ.value = localStorage.getItem('summ');\n");
      out.write("    summ.oninput = () => {\n");
      out.write("      localStorage.setItem('summ', summ.value)\n");
      out.write("    };\n");
      out.write("</script>\n");
      out.write(" <script>\n");
      out.write("    email.value = localStorage.getItem('email');\n");
      out.write("    email.oninput = () => {\n");
      out.write("      localStorage.setItem('email', email.value)\n");
      out.write("    };\n");
      out.write("</script>\n");
      out.write(" <script>\n");
      out.write("    contact.value = localStorage.getItem('contact');\n");
      out.write("    contact.oninput = () => {\n");
      out.write("      localStorage.setItem('contact', contact.value)\n");
      out.write("    };\n");
      out.write("</script>\n");
      out.write(" </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"edu\" class=\"tabcontent\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("<div class=\"container-main experience-container education-container resume-fn funnel-wrapper\">\n");
      out.write("    <div class=\"outer-wrapper\">\n");
      out.write("        <h1>Education</h1>\n");
      out.write("        <p class=\"sub-header\">Where did you go to?</p>\n");
      out.write("        <div class=\"form-container-main grid-container content-wrapper\">\n");
      out.write("              \n");
      out.write("    <div id=\"mainE\">\n");
      out.write("        <input type=\"button\" id=\"btedu\" value=\"Add Element\" class=\"bt button-primary float-left\" /><br/><br/><br/><br/>\n");
      out.write("        <input type=\"button\" name=\"btn_submit1\" value=\"Save\" onclick=\"mySavee()\" class=\"button-primary float-right\" />\n");
      out.write("    \n");
      out.write(" <input type=\"button\" name=\"btn_submit11\" value=\"Load\" onclick=\"myLoade()\" class=\"button-primary float-right\" />\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("    <br>\n");
      out.write("   </div>\n");
      out.write("         </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("     \n");
      out.write("<script>\n");
      out.write("    //education\n");
      out.write("          var amountOfInputs=8;\n");
      out.write("           var program = [];\n");
      out.write("           var instit = [];\n");
      out.write("           var sdt = [];\n");
      out.write("           var endt = [];\n");
      out.write("           var mar = [];\n");
      out.write("          function mySavee() {\n");
      out.write("          for(var i = 1; i < 9; i++){\n");
      out.write("            program[i]=document.getElementById(\"ed\"+i).value;\n");
      out.write("            instit[i]=document.getElementById(\"inst\"+i).value;\n");
      out.write("            sdt[i]=document.getElementById(\"std\"+i).value;\n");
      out.write("            endt[i]=document.getElementById(\"end\"+i).value;\n");
      out.write("            mar[i]=document.getElementById(\"cgp\"+i).value;\n");
      out.write("            localStorage.setItem(\"pr\"+i, JSON.stringify(program[i])); //store colors  \n");
      out.write("            localStorage.setItem(\"itt\"+i, JSON.stringify(instit[i]));\n");
      out.write("            localStorage.setItem(\"st\"+i, JSON.stringify(sdt[i]));\n");
      out.write("            localStorage.setItem(\"en\"+i, JSON.stringify(endt[i]));\n");
      out.write("            localStorage.setItem(\"mark\"+i, JSON.stringify(mar[i]));\n");
      out.write("        }\n");
      out.write("       \n");
      out.write("       }\n");
      out.write("       function myLoade() {\n");
      out.write("           var pm =[];\n");
      out.write("           var inst =[];\n");
      out.write("           var sd =[];\n");
      out.write("           var ed =[];\n");
      out.write("           var mk =[];\n");
      out.write("           for(var i = 1; i < 9; i++){\n");
      out.write("               pm[i]=JSON.parse(localStorage.getItem(\"pr\"+i));\n");
      out.write("               inst[i]=JSON.parse(localStorage.getItem(\"itt\"+i));\n");
      out.write("               sd[i]=JSON.parse(localStorage.getItem(\"st\"+i));\n");
      out.write("               ed[i]=JSON.parse(localStorage.getItem(\"en\"+i));\n");
      out.write("               mk[i]=JSON.parse(localStorage.getItem(\"mark\"+i));\n");
      out.write("document.getElementById(\"ed\"+i).value = pm[i];\n");
      out.write("document.getElementById(\"inst\"+i).value = inst[i];\n");
      out.write("document.getElementById(\"std\"+i).value = sd[i];\n");
      out.write("document.getElementById(\"end\"+i).value = ed[i];\n");
      out.write("document.getElementById(\"cgp\"+i).value = mk[i];\n");
      out.write("           }\n");
      out.write("       }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<div id=\"work\" class=\"tabcontent\">\n");
      out.write("<div class=\"container-main experience-container resume-fn funnel-wrapper\">\n");
      out.write("    <div class=\"outer-wrapper\">\n");
      out.write("        <h1>Experience</h1>\n");
      out.write("        <p class=\"sub-header\">What is your work experience?</p>\n");
      out.write("        <div class=\"form-container-main grid-container content-wrapper\">\n");
      out.write("\n");
      out.write("    <div id=\"mainW\">\n");
      out.write("        <input type=\"button\" id=\"btnW\" value=\"Add Element\" class=\"bt button-primary float-left\" /><br/><br/><br/><br/>\n");
      out.write("       <input type=\"button\" onclick=\"mySavew()\" name=\"btnss\" id=\"btnss\" value=\"Save\" class=\"bt button-primary float-right\"/>    \n");
      out.write("    <input type=\"button\" onclick=\"myLoadw()\" name=\"btnssw\" id=\"btnw\" value=\"Load\" class=\"bt button-primary float-right\"/>      \n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <br><br><br><br><br>\n");
      out.write("    \n");
      out.write(" \n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("    //work\n");
      out.write("          var amountOfInputs=8;\n");
      out.write("           var pros = [];\n");
      out.write("           var insc = [];\n");
      out.write("           var desc = [];\n");
      out.write("           var stde = [];\n");
      out.write("           var ende = [];\n");
      out.write("          function mySavew() {\n");
      out.write("          for(var i = 1; i < 9; i++){\n");
      out.write("            pros[i]=document.getElementById(\"pos\"+i).value;\n");
      out.write("            insc[i]=document.getElementById(\"com\"+i).value;\n");
      out.write("            desc[i]=document.getElementById(\"dew\"+i).value;\n");
      out.write("            stde[i]=document.getElementById(\"stw\"+i).value;\n");
      out.write("            ende[i]=document.getElementById(\"enw\"+i).value;\n");
      out.write("            localStorage.setItem(\"post\"+i, JSON.stringify(pros[i])); //store colors  \n");
      out.write("            localStorage.setItem(\"insct\"+i, JSON.stringify(insc[i]));\n");
      out.write("            localStorage.setItem(\"descp\"+i, JSON.stringify(desc[i]));\n");
      out.write("            localStorage.setItem(\"stdep\"+i, JSON.stringify(stde[i]));\n");
      out.write("            localStorage.setItem(\"endep\"+i, JSON.stringify(ende[i]));\n");
      out.write("        }\n");
      out.write("       \n");
      out.write("       }\n");
      out.write("       function myLoadw() {\n");
      out.write("           var pmw =[];\n");
      out.write("           var instw =[];\n");
      out.write("           var sdw =[];\n");
      out.write("           var edw =[];\n");
      out.write("           var mkw =[];\n");
      out.write("           for(var i = 1; i < 9; i++){\n");
      out.write("               pmw[i]=JSON.parse(localStorage.getItem(\"post\"+i));\n");
      out.write("               instw[i]=JSON.parse(localStorage.getItem(\"insct\"+i));\n");
      out.write("               sdw[i]=JSON.parse(localStorage.getItem(\"descp\"+i));\n");
      out.write("               edw[i]=JSON.parse(localStorage.getItem(\"stdep\"+i));\n");
      out.write("               mkw[i]=JSON.parse(localStorage.getItem(\"endep\"+i));\n");
      out.write("document.getElementById(\"pos\"+i).value = pmw[i];\n");
      out.write("document.getElementById(\"com\"+i).value = instw[i];\n");
      out.write("document.getElementById(\"dew\"+i).value = sdw[i];\n");
      out.write("document.getElementById(\"stw\"+i).value = edw[i];\n");
      out.write("document.getElementById(\"enw\"+i).value = mkw[i];\n");
      out.write("           }\n");
      out.write("       }\n");
      out.write("</script>\n");
      out.write("<div id=\"skill\" class=\"tabcontent\">\n");
      out.write("<div class=\"container-main experience-container resume-fn funnel-wrapper\">\n");
      out.write("    <div class=\"outer-wrapper\">\n");
      out.write("        <h1>Key Skills</h1>\n");
      out.write("        <p class=\"sub-header\">Enter maximum 8 skills</p>\n");
      out.write("        <div class=\"form-container-main grid-container content-wrapper\">\n");
      out.write("            \n");
      out.write("    <div id=\"main2\">\n");
      out.write("        <input type=\"button\" id=\"btnd\" value=\"Add Element\" class=\"bt button-primary float-left\" /><br/><br/><br/><br/>\n");
      out.write("        <br/>\n");
      out.write("       <input type=\"button\" onclick=\"mySave()\" name=\"btnss1\" id=\"btnssk1\" value=\"Save\" class=\"bt button-primary float-right\"/>    \n");
      out.write("    <input type=\"button\" onclick=\"myLoad()\" name=\"btnss2\" id=\"btn1\" value=\"Load\" class=\"bt button-primary float-right\"/>      \n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <br/>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    </div>   \n");
      out.write("   \n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("</div> \n");
      out.write("\n");
      out.write("<script>\n");
      out.write("       //skills\n");
      out.write("     function mySave() {\n");
      out.write("       var s1 = document.getElementById(\"ss1\").value;\n");
      out.write("       localStorage.setItem(\"myContent1\", s1);\n");
      out.write("        var s2 = document.getElementById(\"ss2\").value;\n");
      out.write("       localStorage.setItem(\"myContent2\", s2);\n");
      out.write("       var s3 = document.getElementById(\"ss3\").value;\n");
      out.write("       localStorage.setItem(\"myContent3\", s3);\n");
      out.write("        var s4 = document.getElementById(\"ss4\").value;\n");
      out.write("       localStorage.setItem(\"myContent4\", s4);\n");
      out.write("        var s5 = document.getElementById(\"ss5\").value;\n");
      out.write("       localStorage.setItem(\"myContent5\", s5);\n");
      out.write("       var s6 = document.getElementById(\"ss6\").value;\n");
      out.write("       localStorage.setItem(\"myContent6\", s6);\n");
      out.write("       var s7 = document.getElementById(\"ss7\").value;\n");
      out.write("       localStorage.setItem(\"myContent7\", s7);\n");
      out.write("       var s8 = document.getElementById(\"ss8\").value;\n");
      out.write("       localStorage.setItem(\"myContent8\", s8);\n");
      out.write("     }\n");
      out.write("     function myLoad() {\n");
      out.write("       var s1 = localStorage.getItem(\"myContent1\");\n");
      out.write("       document.getElementById(\"ss1\").value = s1;\n");
      out.write("       var s2 = localStorage.getItem(\"myContent2\");\n");
      out.write("       document.getElementById(\"ss2\").value = s2;\n");
      out.write("       var s3 = localStorage.getItem(\"myContent3\");\n");
      out.write("       document.getElementById(\"ss3\").value = s3;\n");
      out.write("       var s4 = localStorage.getItem(\"myContent4\");\n");
      out.write("       document.getElementById(\"ss4\").value = s4;\n");
      out.write("       var s5 = localStorage.getItem(\"myContent5\");\n");
      out.write("       document.getElementById(\"ss5\").value = s5;\n");
      out.write("       var s6 = localStorage.getItem(\"myContent6\");\n");
      out.write("       document.getElementById(\"ss6\").value = s6;\n");
      out.write("       var s7 = localStorage.getItem(\"myContent7\");\n");
      out.write("       document.getElementById(\"ss7\").value = s7;\n");
      out.write("       var s8 = localStorage.getItem(\"myContent8\");\n");
      out.write("       document.getElementById(\"ss8\").value = s8;\n");
      out.write("     }\n");
      out.write("   </script>\n");
      out.write("<div id=\"certi\" class=\"tabcontent\">\n");
      out.write("\n");
      out.write("     <div class=\"container-main experience-container resume-fn funnel-wrapper\">\n");
      out.write("    <div class=\"outer-wrapper\">\n");
      out.write("        <h1>Certifications</h1>\n");
      out.write("        <p class=\"sub-header\"></p>\n");
      out.write("        <div class=\"form-container-main grid-container content-wrapper\">\n");
      out.write("  \n");
      out.write("    <div id=\"mainC\">\n");
      out.write("        <input type=\"button\" id=\"btCE\" value=\"Add Element\" class=\"bt button-primary float-left\" /><br/><br/><br/><br/>\n");
      out.write("        <input type=\"button\" onclick=\"mySavec()\" name=\"btnssc\" id=\"btnsskc\" value=\"Save\" class=\"bt button-primary float-right\"/>    \n");
      out.write("    <input type=\"button\" onclick=\"myLoadec()\" name=\"btnssc\" id=\"btnc\" value=\"Load\" class=\"bt button-primary float-right\"/>      \n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <br><br><br><br><br>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("</div> \n");
      out.write("</div>\n");
      out.write("   <script>\n");
      out.write("    //certification\n");
      out.write("          var amountOfInputs=8;\n");
      out.write("           var titl = [];\n");
      out.write("           var descr = [];\n");
      out.write("          function mySavec() {\n");
      out.write("          for(var i = 1; i < 9; i++){\n");
      out.write("            program[i]=document.getElementById(\"tit\"+i).value;\n");
      out.write("            instit[i]=document.getElementById(\"des\"+i).value;\n");
      out.write("            localStorage.setItem(\"tc\"+i, JSON.stringify(program[i])); //store colors  \n");
      out.write("            localStorage.setItem(\"dc\"+i, JSON.stringify(instit[i]));\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("       \n");
      out.write("       }\n");
      out.write("       function myLoadec() {\n");
      out.write("           var pmc =[];\n");
      out.write("           var instc =[];\n");
      out.write("           for(var i = 1; i < 9; i++){\n");
      out.write("               pmc[i]=JSON.parse(localStorage.getItem(\"tc\"+i));\n");
      out.write("               instc[i]=JSON.parse(localStorage.getItem(\"dc\"+i));\n");
      out.write("document.getElementById(\"tit\"+i).value = pmc[i];\n");
      out.write("document.getElementById(\"des\"+i).value = instc[i];\n");
      out.write("           }\n");
      out.write("       }\n");
      out.write("</script>\n");
      out.write("<div id=\"pro\" class=\"tabcontent\">\n");
      out.write("  <div class=\"container-main experience-container resume-fn funnel-wrapper\">\n");
      out.write("    <div class=\"outer-wrapper\">\n");
      out.write("        <h1>Projects</h1>\n");
      out.write("        <p class=\"sub-header\">Tell about your projects?</p>\n");
      out.write("        <div class=\"form-container-main grid-container content-wrapper\">\n");
      out.write("            \n");
      out.write("    <div id=\"mainP\">\n");
      out.write("        <input type=\"button\" id=\"btPR\" value=\"Add Element\" class=\"bt button-primary float-left\" /><br/><br/><br/><br/>\n");
      out.write("        <input type=\"button\" onclick=\"mySavep()\" name=\"btnssp\" id=\"btnsskp\" value=\"Save\" class=\"bt button-primary float-right\"/>    \n");
      out.write("    <input type=\"button\" onclick=\"myLoadp()\" name=\"btnssp\" id=\"btnp\" value=\"Load\" class=\"bt button-primary float-right\"/>      \n");
      out.write("  \n");
      out.write("    </div>\n");
      out.write("    <br>\n");
      out.write("   \n");
      out.write("           \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("     \n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("</div>  \n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("  <script>\n");
      out.write("    //projects\n");
      out.write("          var amountOfInputs=8;\n");
      out.write("           var programp = [];\n");
      out.write("           var institp = [];\n");
      out.write("           var sdtp = [];\n");
      out.write("           var endtp = [];\n");
      out.write("          function mySavep() {\n");
      out.write("          for(var i = 1; i < 9; i++){\n");
      out.write("            programp[i]=document.getElementById(\"pr\"+i).value;\n");
      out.write("            institp[i]=document.getElementById(\"pro\"+i).value;\n");
      out.write("            sdtp[i]=document.getElementById(\"stp\"+i).value;\n");
      out.write("            endtp[i]=document.getElementById(\"enp\"+i).value;\n");
      out.write("            localStorage.setItem(\"prp\"+i, JSON.stringify(programp[i])); //store colors  \n");
      out.write("            localStorage.setItem(\"ittp\"+i, JSON.stringify(institp[i]));\n");
      out.write("            localStorage.setItem(\"stp\"+i, JSON.stringify(sdtp[i]));\n");
      out.write("            localStorage.setItem(\"enp\"+i, JSON.stringify(endtp[i]));\n");
      out.write("        }\n");
      out.write("       \n");
      out.write("       }\n");
      out.write("       function myLoadp() {\n");
      out.write("           var pmp =[];\n");
      out.write("           var instp =[];\n");
      out.write("           var sdp =[];\n");
      out.write("           var edp =[];\n");
      out.write("           for(var i = 1; i < 9; i++){\n");
      out.write("               pmp[i]=JSON.parse(localStorage.getItem(\"prp\"+i));\n");
      out.write("               instp[i]=JSON.parse(localStorage.getItem(\"ittp\"+i));\n");
      out.write("               sdp[i]=JSON.parse(localStorage.getItem(\"stp\"+i));\n");
      out.write("               edp[i]=JSON.parse(localStorage.getItem(\"enp\"+i));\n");
      out.write("document.getElementById(\"pr\"+i).value = pmp[i];\n");
      out.write("document.getElementById(\"pro\"+i).value = instp[i];\n");
      out.write("document.getElementById(\"stp\"+i).value = sdp[i];\n");
      out.write("document.getElementById(\"enp\"+i).value = edp[i];\n");
      out.write("           }\n");
      out.write("       }\n");
      out.write("</script>\n");
      out.write("<div id=\"lang\" class=\"tabcontent\">\n");
      out.write("\n");
      out.write("     <div class=\"container-main experience-container resume-fn funnel-wrapper\">\n");
      out.write("    <div class=\"outer-wrapper\">\n");
      out.write("        <h1>Language</h1>\n");
      out.write("        <p class=\"sub-header\">Tell about your Language?</p>\n");
      out.write("        <div class=\"form-container-main grid-container content-wrapper\">\n");
      out.write("           \n");
      out.write("               \n");
      out.write("    <div id=\"main1\"><br>\n");
      out.write("        <input type=\"button\" id=\"btAnd\" value=\"Add Element\" class=\"bt button-primary float-left\" /><br/><br/><br><br>\n");
      out.write("        <input type=\"button\" onclick=\"mySave3()\" name=\"btn_sub11\" id=\"bn1\" value=\"Save\" class=\"bt button-primary float-right\"/>\n");
      out.write("<input type=\"button\" name=\"btn_sub12\" onclick=\"myLoad3()\" id=\"bn11\" value=\"Load\" class=\"bt button-primary float-right\"/>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <br/>\n");
      out.write("   \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"cta-container clearfix\">\n");
      out.write("              </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("</div>  \n");
      out.write("</div>\n");
      out.write("<div id=\"inter\" class=\"tabcontent\">\n");
      out.write("    \n");
      out.write("     <div class=\"container-main experience-container resume-fn funnel-wrapper\">\n");
      out.write("    <div class=\"outer-wrapper\">\n");
      out.write("        <h1>Hobbies</h1>\n");
      out.write("        <p class=\"sub-header\">Tell about your Hobbies/Interest?</p>\n");
      out.write("        <div class=\"form-container-main grid-container content-wrapper\">\n");
      out.write("   \n");
      out.write("    <div id=\"main\">\n");
      out.write("        <input type=\"button\" id=\"btAdd\" value=\"Add Element\" class=\"bt button-primary float-left\" /><br/><br/><br/><br/>\n");
      out.write("       <input type=\"button\" onclick=\"mySave2()\" name=\"btn_submit22\" id=\"bt1\" value=\"Save\" class=\"button-primary float-right\" />\n");
      out.write("    <input type=\"button\" onclick=\"myLoad2()\" name=\"btn_submit222\" id=\"bt2\" value=\"Load\" class=\"button-primary float-right\" />\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("       \n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("</div>   \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("      <script>\n");
      out.write("          //hobby\n");
      out.write("          var amountOfInputs=8;\n");
      out.write("           var colors = [];\n");
      out.write("          function mySave2() {\n");
      out.write("          for(var i = 1; i < 8; i++){\n");
      out.write("            colors[i]=document.getElementById(\"tb\"+i).value;\n");
      out.write("        localStorage.setItem(\"my_colors\"+i, JSON.stringify(colors[i])); //store colors  \n");
      out.write("    \n");
      out.write("        }\n");
      out.write("       \n");
      out.write("       }\n");
      out.write("       function myLoad2() {\n");
      out.write("           var storedColors =[];\n");
      out.write("           for(var i = 1; i < 8; i++){\n");
      out.write("               storedColors[i]=JSON.parse(localStorage.getItem(\"my_colors\"+i));\n");
      out.write("document.getElementById(\"tb\"+i).value = storedColors[i];\n");
      out.write("           }\n");
      out.write("       }\n");
      out.write("</script>\n");
      out.write("      <script>\n");
      out.write("          //language\n");
      out.write("           var col = [];\n");
      out.write("          function mySave3() {\n");
      out.write("          for(var i = 1; i < 8; i++){\n");
      out.write("            col[i]=document.getElementById(\"ll\"+i).value;\n");
      out.write("        localStorage.setItem(\"colors\"+i, JSON.stringify(col[i])); //store colors  \n");
      out.write("    \n");
      out.write("        }\n");
      out.write("       \n");
      out.write("       }\n");
      out.write("       function myLoad3() {\n");
      out.write("           var storedCol =[];\n");
      out.write("           for(var i = 1; i < 8; i++){\n");
      out.write("               storedCol[i]=JSON.parse(localStorage.getItem(\"colors\"+i));\n");
      out.write("document.getElementById(\"ll\"+i).value = storedCol[i];\n");
      out.write("           }\n");
      out.write("       }\n");
      out.write("</script> \n");
      out.write("       \n");
      out.write("    \n");
      out.write("     <script>\n");
      out.write("    //work\n");
      out.write("var addW = $('#btnW');\n");
      out.write("var allW = $('#mainW');\n");
      out.write("var amountOfInputs = 1;\n");
      out.write("var maximumBoxew = 8;\n");
      out.write("var iCnt = 1;\n");
      out.write("addW.click(function(event){\n");
      out.write("    \n");
      out.write("   if($(\".boxw\").length >= maximumBoxew){\n");
      out.write("       \n");
      out.write("      Swal.fire('You can add only 8 records!'); \n");
      out.write("                \n");
      out.write("                 \n");
      out.write("        return;\n");
      out.write("    }\n");
      out.write("        \n");
      out.write("    var listW = $('<div class=\"boxw\"></div>');\n");
      out.write("   for(var i = 0; i < amountOfInputs; i++){\n");
      out.write("        listW.append('<label class=\"input-group\">Position: </label><input type=text class=\"error\" name=pos' + iCnt+ ' ' + ' id=pos' + iCnt + ' ' +'  autocomplete=\"off\" tabindex=\"1\"> \\n\\\n");
      out.write("<br/><br/><label class=\"input-group\">Company: </label>\\n\\<input type=text class=\"error\" name=com' + iCnt+ ' ' + ' id=com' + iCnt + ' ' +' placeholder=\"\" autocomplete=\"off\" tabindex=\"1\">\\n\\\n");
      out.write("<br/><br/><label class=\"input-group\">Description: </label><textarea class=\"error\" name=dew' + iCnt+ ' ' + ' id=dew' + iCnt + ' ' +' placeholder=\"\" autocomplete=\"off\" tabindex=\"1\" rows=\"4\" cols=\"100\"></textarea>\\n\\\n");
      out.write("<br/><br/><label class=\"input-group\">Start Date: </label><input class=\"error\" type=text name=stw' + iCnt+ ' ' + ' id=stw' + iCnt + ' ' +' placeholder=\"\" autocomplete=\"off\" tabindex=\"1\"><br/>\\n\\\n");
      out.write("<br/><label class=\"input-group\">End Date: </label><input class=\"error\" type=text name=enw' + iCnt+ ' ' + ' id=enw' + iCnt + ' ' +' placeholder=\"\" autocomplete=\"off\" tabindex=\"1\"><br/><br/>'); // end append\n");
      out.write(" listW.append('<input type=\"submit\" value=Delete id=rem' +iCnt+ ' ' + ' name=rem'+iCnt+' class=\"btnP button-primary float-right\" />');\n");
      out.write(" listW.append('<input type=\"button\"  value=remove class=\"btnP button-primary float-right removeGroup\" /><br/><br/>');\n");
      out.write("     listW.appendTo(allW);\n");
      out.write("            iCnt=iCnt+1;\n");
      out.write("        }\n");
      out.write("   \n");
      out.write("});\n");
      out.write("$(document).on(\"click\", \".removeGroup\", function(event){\n");
      out.write("    event.preventDefault();\n");
      out.write("     iCnt=iCnt-1;\n");
      out.write("   $(this).parent(\".boxw\").remove();\n");
      out.write("});\n");
      out.write("</script> \n");
      out.write(" ");
 
        try{
            
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
        PreparedStatement pst1 ;
        ResultSet rst1;
     int kw=1;
        while(kw!=8)
            {
                 String mail=request.getParameter("email");
                String r=request.getParameter("rem"+kw);
                String posi=request.getParameter("pos"+kw);
                if( r!=null)    
                {
                    if(posi!=null){
                 pst1 = conn.prepareStatement("DELETE FROM WORKEX WHERE UPOSITION='"+posi+"' AND UEMAIL='"+mail+"' ");
              int xs=pst1.executeUpdate();
                 
      out.write("\n");
      out.write("              <script>\n");
      out.write("                 Swal.fire('Work Experience Deleted!'); \n");
      out.write("                 </script>\n");
      out.write("                 ");

        }}
                  kw++;
        }
        }catch(Exception exec) 
    {
        exec.printStackTrace();
    }
        
    
      out.write("\n");
      out.write(" <script>\n");
      out.write("    //PROJECT\n");
      out.write("var addP = $('#btPR');\n");
      out.write("var allP = $('#mainP');\n");
      out.write("var maximumBoxep = 8;\n");
      out.write("var iCnt = 1;\n");
      out.write("addP.click(function(event){\n");
      out.write("    \n");
      out.write("   if($(\".boxp\").length >= maximumBoxep){\n");
      out.write("       Swal.fire('You cannot have more than 8 fields!'); \n");
      out.write("       return;\n");
      out.write("    }\n");
      out.write("        \n");
      out.write("    var listP = $('<div class=\"boxp\"></div>');\n");
      out.write("   for(var i = 0; i < amountOfInputs; i++){\n");
      out.write("        listP.append('<label class=\"input-group\">Project Title: </label><input type=text name=pr' + iCnt+ ' ' + ' id=pr' + iCnt + ' ' +' placeholder=\"\" autocomplete=\"off\" tabindex=\"1\"> \\n\\\n");
      out.write("<br/><br/><label class=\"input-group\">Project Description: </label><textarea name=pro' + iCnt+ ' ' + ' id=pro' + iCnt + ' ' +' placeholder=\"\" cols=\"70\" rows=\"4\"></textarea>\\n\\\n");
      out.write("<br/><br/><label class=\"input-group\">Start Date: </label><input type=text name=stp' + iCnt+ ' ' + ' id=stp' + iCnt + ' ' +' placeholder=\"\" autocomplete=\"off\" tabindex=\"1\"><br/>\\n\\\n");
      out.write("<br/><label class=\"input-group\">End Date: </label><input type=text name=enp' + iCnt+ ' ' + ' id=enp' + iCnt + ' ' +' placeholder=\"\" autocomplete=\"off\" tabindex=\"1\"><br/><br/>');\n");
      out.write(" listP.append('<input type=\"submit\" value=Delete id=remp' +iCnt+ ' ' + ' name=remp'+iCnt+' class=\"btnP button-primary float-right\" />');\n");
      out.write("  listP.append('<input type=\"button\" value=\"Remove\" class=\"btnP button-primary float-right removeGroup\" /><br/><br/>');\n");
      out.write("    listP.appendTo(allP);\n");
      out.write("            iCnt=iCnt+1;\n");
      out.write("        }\n");
      out.write("  \n");
      out.write("});\n");
      out.write("$(document).on(\"click\", \".removeGroup\", function(event){\n");
      out.write("    event.preventDefault();\n");
      out.write("   $(this).parent(\".boxp\").remove();\n");
      out.write("   iCnt=iCnt-1;\n");
      out.write("});\n");
      out.write("</script> \n");
 
        try{
            
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
        PreparedStatement pst1 ;
        ResultSet rst1;
     int kw=1;
        while(kw!=8)
            {
                 String mail=request.getParameter("email");
                String r=request.getParameter("remp"+kw);
                String nm=request.getParameter("pr"+kw);
                if( r!=null)    
                {
                    if(nm!=null){
                 pst1 = conn.prepareStatement("DELETE FROM PROJECT WHERE PNAME='"+nm+"' AND UEMAIL='"+mail+"' ");
              int xs=pst1.executeUpdate();
                 
      out.write("\n");
      out.write("              <script>\n");
      out.write("                 Swal.fire('Project Details Deleted!'); \n");
      out.write("                 </script>\n");
      out.write("                 ");

        }}
                  kw++;
        }
        }catch(Exception exec) 
    {
        exec.printStackTrace();
    }
        
    
      out.write("\n");
      out.write(" <script>\n");
      out.write("    //certificate\n");
      out.write("var addC = $('#btCE');\n");
      out.write("var allC = $('#mainC');\n");
      out.write("var maximumBoxec = 8;\n");
      out.write("var amountOfInpu = 1;\n");
      out.write("var iCnt = 1;\n");
      out.write("addC.click(function(event){\n");
      out.write("    \n");
      out.write("   if($(\".boxc\").length >= maximumBoxec){\n");
      out.write("        Swal.fire('You cannot have more than 8 fields!'); \n");
      out.write("       \n");
      out.write("        return;\n");
      out.write("    }\n");
      out.write("        \n");
      out.write("    var listC = $('<div class=\"boxc\"></div>');\n");
      out.write("   for(var i = 1; i <= amountOfInpu; i++){\n");
      out.write("        listC.append('<label class=\"input-group\">Certificate Title: </label><input type=text name=tit' + iCnt+ ' ' + ' id=tit' + iCnt + ' ' +' placeholder=\"\" autocomplete=\"off\" tabindex=\"1\"> \\n\\\n");
      out.write("<br/><br/><label class=\"input-group\">Certificate Description: </label>\\n\\<textarea name=des' + iCnt+ ' ' + ' id=des' + iCnt + ' ' +' placeholder=\"\" cols=\"100\" rows=\"4\"></textarea>\\n\\\n");
      out.write("<br/><br/>');\n");
      out.write("            listC.append('<input type=\"submit\" value=Delete id=remc' +iCnt+ ' ' + ' name=remc'+iCnt+' class=\"btnP button-primary float-right\" />');\n");
      out.write("            listC.append('<input type=\"button\" value=\"Remove\" class=\"btnP button-primary float-right removeGroupc\" /><br/><br/>');\n");
      out.write("    listC.appendTo(allC);\n");
      out.write("            iCnt=iCnt+1;\n");
      out.write("        }\n");
      out.write("   \n");
      out.write("});\n");
      out.write("$(document).on(\"click\", \".removeGroupc\", function(event){\n");
      out.write("    event.preventDefault();\n");
      out.write("    $(this).parent(\".boxc\").remove();\n");
      out.write("   iCnt=iCnt-1;\n");
      out.write("});\n");
      out.write("</script> \n");
 
        try{
            
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
        PreparedStatement pst1 ;
        ResultSet rst1;
     int kw=1;
        while(kw!=8)
            {
                 String mail=request.getParameter("email");
                String r=request.getParameter("remc"+kw);
                String nm=request.getParameter("tit"+kw);
                if( r!=null)    
                {
                    if(nm!=null){
                 pst1 = conn.prepareStatement("DELETE FROM CERTIFICATE WHERE UCERTI='"+nm+"' AND UEMAIL='"+mail+"' ");
              int xs=pst1.executeUpdate();
                 
      out.write("\n");
      out.write("              <script>\n");
      out.write("                 Swal.fire('Certificate detail Deleted!'); \n");
      out.write("                 </script>\n");
      out.write("                 ");

        }}
                  kw++;
        }
        }catch(Exception exec) 
    {
        exec.printStackTrace();
    }
        
    
      out.write("\n");
      out.write("<script>\n");
      out.write("    //education\n");
      out.write("var addE = $('#btedu');\n");
      out.write("var allE = $('#mainE');\n");
      out.write("var maximumBox = 8;\n");
      out.write("var amountOfInp = 1;\n");
      out.write("var iCnt = 1;\n");
      out.write("addE.click(function(event){\n");
      out.write("    \n");
      out.write("   if($(\".boxe\").length >= maximumBox){\n");
      out.write("        Swal.fire('You cannot have more than 8 fields!'); \n");
      out.write("       \n");
      out.write("        return;\n");
      out.write("    }\n");
      out.write("        \n");
      out.write("    var listE = $('<div class=\"boxe\"></div>');\n");
      out.write("   for(var i = 1; i <= amountOfInp; i++){\n");
      out.write("        listE.append('<label class=\"input-group\">Program: </label><input type=text name=ed' + iCnt+ ' ' + ' id=ed' + iCnt + ' ' +' placeholder=\"\" autocomplete=\"off\" tabindex=\"1\"> \\n\\\n");
      out.write("<br/><br/><label class=\"input-group\">Institute: </label><input type=text name=inst' + iCnt+ ' ' + ' id=inst' + iCnt + ' ' +'  autocomplete=\"off\" tabindex=\"1\">\\n\\\n");
      out.write("<br/><br/><label class=\"input-group\">Start Date: </label><input type=text name=std' + iCnt+ ' ' + ' id=std' + iCnt + ' ' +'  autocomplete=\"off\" tabindex=\"1\">\\n\\\n");
      out.write("<br/><br/><label class=\"input-group\">End Date: </label><input type=text name=end' + iCnt+ ' ' + ' id=end' + iCnt + ' ' +'  autocomplete=\"off\" tabindex=\"1\">\\n\\\n");
      out.write("<br/><br/><label class=\"input-group\">CGPA / Marks: </label><input type=text name=cgp' + iCnt+ ' ' + ' id=cgp' + iCnt + ' ' +'  autocomplete=\"off\" tabindex=\"1\">  \\n\\\n");
      out.write("<br><br>');\n");
      out.write("            listE.append('<input type=\"submit\" value=Delete id=reme' +iCnt+ ' ' + ' name=reme'+iCnt+' class=\"btnP button-primary float-right\" />');\n");
      out.write("            listE.append('<input type=\"button\" value=\"Remove\" class=\"btnP button-primary float-right removeGroupe\" /><br/><br/>');\n");
      out.write("    listE.appendTo(allE);\n");
      out.write("            iCnt=iCnt+1;\n");
      out.write("        }\n");
      out.write("   \n");
      out.write("});\n");
      out.write("$(document).on(\"click\", \".removeGroupe\", function(event){\n");
      out.write("    event.preventDefault();\n");
      out.write("    $(this).parent(\".boxe\").remove();\n");
      out.write("   iCnt=iCnt-1;\n");
      out.write("});\n");
      out.write("</script>\n");
 
        try{
            
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
        PreparedStatement pst1 ;
        ResultSet rst1;
     int kw=1;
        while(kw!=8)
            {
                 String mail=request.getParameter("email");
                String r=request.getParameter("reme"+kw);
                String nm=request.getParameter("ed"+kw);
                if( r!=null)    
                {
                    if(nm!=null){
                 pst1 = conn.prepareStatement("DELETE FROM EDUCATION WHERE UPROGRAM='"+nm+"' AND UEMAIL='"+mail+"' ");
              int xs=pst1.executeUpdate();
                
      out.write("\n");
      out.write("              <script>\n");
      out.write("                 Swal.fire('Education Deleted!'); \n");
      out.write("                 </script>\n");
      out.write("                 ");

        }}
                  kw++;
        }
        }catch(Exception exec) 
    {
        exec.printStackTrace();
    }
        
    
      out.write("\n");
      out.write("   \n");
      out.write("<script>\n");
      out.write("    //skills\n");
      out.write("var adds = $('#btnd');\n");
      out.write("var alls = $('#main2');\n");
      out.write("var maximums = 8;\n");
      out.write("var iCnt = 1;\n");
      out.write("adds.click(function(event){\n");
      out.write("    \n");
      out.write("    if($(\".boxs\").length >= maximums){\n");
      out.write("        Swal.fire('You cannot have more than 8 fields!'); \n");
      out.write("       \n");
      out.write("        return;\n");
      out.write("    }\n");
      out.write("        \n");
      out.write("    var lists = $('<div class=\"boxs\"></div>');\n");
      out.write("   \n");
      out.write("        lists.append('<label class=\"input-group\">Hobby / Interest:</label><input type=\"text\"  name=ss' + iCnt+ ' ' + ' id=ss' + iCnt + ' ' +'\" class=\"input\" />&nbsp;&nbsp;');\n");
      out.write("    \n");
      out.write("    lists.append('<input type=\"submit\" value=Delete id=rems' +iCnt+ ' ' + ' name=rems'+iCnt+' class=\"btnP button-primary float-right\" />');\n");
      out.write("    lists.append('<input type=\"button\" value=\"Remove\" class=\"removeGrous\" /><br/><br/>');\n");
      out.write("   iCnt=iCnt+1;\n");
      out.write("        lists.appendTo(alls);\n");
      out.write("});\n");
      out.write("$(document).on(\"click\", \".removeGrous\", function(event){\n");
      out.write("    event.preventDefault();\n");
      out.write("    $(this).parent(\".boxs\").remove();\n");
      out.write("   iCnt=iCnt-1;\n");
      out.write("});\n");
      out.write("</script>\n");
 
        try{
            
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
        PreparedStatement pst1 ;
        ResultSet rst1;
     int kw=1;
        while(kw!=8)
            {
                 String mail=request.getParameter("email");
                String r=request.getParameter("rems"+kw);
                String nm=request.getParameter("ss"+kw);
                if( r!=null)    
                {
                    if(nm!=null){
                 pst1 = conn.prepareStatement("DELETE FROM SKILLS WHERE SK='"+nm+"' AND UEMAIL='"+mail+"' ");
              int xs=pst1.executeUpdate();
                 
      out.write("\n");
      out.write("              <script>\n");
      out.write("                 Swal.fire('Skill Deleted!'); \n");
      out.write("                 </script>\n");
      out.write("                 ");

        }}
                  kw++;
        }
        }catch(Exception exec) 
    {
        exec.printStackTrace();
    }
        
    
      out.write("\n");
      out.write("<script>\n");
      out.write("    //hobby\n");
      out.write("var addl = $('#btAdd');\n");
      out.write("var alll = $('#main');\n");
      out.write("var amountOfInputs = 1;\n");
      out.write("var maximumBoxes = 8;\n");
      out.write("var iCnt = 1;\n");
      out.write("addl.click(function(event){\n");
      out.write("    \n");
      out.write("    // create a limit\n");
      out.write("    if($(\".boxl\").length >= maximumBoxes){\n");
      out.write("        Swal.fire('You cannot have more than 8 fields!'); \n");
      out.write("       \n");
      out.write("        return;\n");
      out.write("    }\n");
      out.write("        \n");
      out.write("    var listItem = $('<div class=\"boxl\"></div>');\n");
      out.write("    for(var i = 0; i < amountOfInputs; i++){\n");
      out.write("        listItem.append('<label class=\"input-group\">Hobby / Interest:</label><input type=\"text\" class=\"error\"  name=tb' + iCnt+ ' ' + ' id=tb' + iCnt + ' ' +'\"/>&nbsp;&nbsp;');\n");
      out.write("     listItem.append('<input type=\"submit\" value=Delete id=remh' +iCnt+ ' ' + ' name=remh'+iCnt+' class=\"btnP button-primary float-right\" />');\n");
      out.write("            listItem.append('<input type=\"button\" value=\"Remove\" class=\"removeGrouh\" /><br/><br/>');\n");
      out.write("    listItem.appendTo(alll);\n");
      out.write("            iCnt=iCnt+1;\n");
      out.write("        }\n");
      out.write("   \n");
      out.write("});\n");
      out.write("\n");
      out.write("$(document).on(\"click\", \".removeGrouh\", function(event){\n");
      out.write("    event.preventDefault();\n");
      out.write("   $(this).parent(\".boxl\").remove();\n");
      out.write("   iCnt=iCnt-1;\n");
      out.write("});\n");
      out.write("</script>\n");
 
        try{
            
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
        PreparedStatement pst1 ;
        ResultSet rst1;
     int kw=1;
        while(kw!=8)
            {
                 String mail=request.getParameter("email");
                String r=request.getParameter("remh"+kw);
                String nm=request.getParameter("tb"+kw);
                if( r!=null)    
                {
                    if(nm!=null){
                 pst1 = conn.prepareStatement("DELETE FROM UHOBBY WHERE UINTREST='"+nm+"' AND UEMAIL='"+mail+"' ");
              int xs=pst1.executeUpdate();
                 
      out.write("\n");
      out.write("              <script>\n");
      out.write("                 Swal.fire('Hobby Deleted!'); \n");
      out.write("                 </script>\n");
      out.write("                 ");

        }}
                  kw++;
        }
        }catch(Exception exec) 
    {
        exec.printStackTrace();
    }
        
    
      out.write("\n");
      out.write("<script>\n");
      out.write("    //language\n");
      out.write("var add = $('#btAnd');\n");
      out.write("var all = $('#main1');\n");
      out.write("var amountOfInputs = 1;\n");
      out.write("var maximumBoxes = 8;\n");
      out.write("var iCnt = 1;\n");
      out.write("add.click(function(event){\n");
      out.write("    \n");
      out.write("    // create a limit\n");
      out.write("    if($(\".box\").length >= maximumBoxes){\n");
      out.write("       Swal.fire('You cannot have more than 8 fields!'); \n");
      out.write("       \n");
      out.write("        return;\n");
      out.write("    }\n");
      out.write("        \n");
      out.write("    var listItem = $('<div class=\"box\"></div>');\n");
      out.write("    // we will add 2 boxes here, but we can modify this in the amountOfBoxes value\n");
      out.write("    for(var i = 0; i < amountOfInputs; i++){\n");
      out.write("        listItem.append('<label class=\"input-group\">Language</label><input type=\"text\"  name=ll' + iCnt+ ' ' + ' id=ll' + iCnt + ' ' +'\" class=\"input\" />&nbsp;&nbsp;');\n");
      out.write("    listItem.append('<input type=\"submit\" value=Delete id=reml' +iCnt+ ' ' + ' name=reml'+iCnt+' class=\"btnP button-primary float-right\" />');\n");
      out.write("            listItem.append('<input type=\"button\" value=\"Remove\" class=\"removeGroup\" /><br/><br/>');\n");
      out.write("    listItem.appendTo(all);\n");
      out.write("            iCnt=iCnt+1;\n");
      out.write("        }\n");
      out.write("   \n");
      out.write("});\n");
      out.write("\n");
      out.write("// Lets implement your remove field option by removing the groups parent div on click\n");
      out.write("$(document).on(\"click\", \".removeGroup\", function(event){\n");
      out.write("    event.preventDefault();\n");
      out.write("    $(this).parent(\".box\").remove();\n");
      out.write("   iCnt=iCnt-1;\n");
      out.write("});\n");
      out.write("</script>\n");
 
        try{
            
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
        PreparedStatement pst1 ;
        ResultSet rst1;
     int kw=1;
        while(kw!=8)
            {
                 String mail=request.getParameter("email");
                String r=request.getParameter("reml"+kw);
                String nm=request.getParameter("ll"+kw);
                if( r!=null)    
                {
                    if(nm!=null){
                 pst1 = conn.prepareStatement("DELETE FROM LANGUAGE WHERE ULANGUAGE='"+nm+"' AND UEMAIL='"+mail+"' ");
              int xs=pst1.executeUpdate();

      out.write("\n");
      out.write("              <script>\n");
      out.write("                 Swal.fire('Language Deleted!'); \n");
      out.write("                 </script>\n");
      out.write("                 ");

           
        }}
                  kw++;
        }
        }catch(Exception exec) 
    {
        exec.printStackTrace();
    }
        
    
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<div id=\"img\" class=\"tabcontent\">\n");
      out.write(" <section class=\"form-image\"  style=\"background-color:whitesmoke;\">\n");
      out.write("    <div style=\"border:none; text-align: center;\">\n");
      out.write("        <span style=\"text-align:center; position:absolute; padding-top: 30px;\">Upload your photo</span>\n");
      out.write("<span style=\"text-align:center;font-size: 10px; color: gray;position:absolute; padding-top: 60px;\">We support JPG, PNG or JPEG</span>\n");
      out.write("        \n");
      out.write("        <div class=\"container-main experience-container resume-fn funnel-wrapper\">\n");
      out.write("    <div class=\"outer-wrapper\">\n");
      out.write("        <h1>Profile</h1>\n");
      out.write("        <span>Upload your photo</span><br/>\n");
      out.write("<span style=\"font-size: 10px; color: gray;\">We support JPG, PNG or GIF</span>\n");
      out.write("     \n");
      out.write("        <div class=\"form-container-main grid-container content-wrapper\">\n");
      out.write("    <form action=\"FileUpload\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("\t    <br/>\n");
      out.write("             <div class=\"input-group email\">\n");
      out.write("                                <label for=\"txtEmail\">Email</label>\n");
      out.write("                                <div class=\"input-element\">\n");
      out.write("                                    <input type=\"text\" class=\"error\" name=\"email1\" id=\"email1\" tabindex=\"8\" maxlength=\"60\">\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                            </div><br/><br/>\n");
      out.write("          \n");
      out.write("            Select File:&nbsp;&nbsp;&nbsp;<input type=\"file\" class=\"button-primary\" name=\"img\"  size='50'><br><br>\n");
      out.write("   \n");
      out.write("            \n");
      out.write("            <input type=\"submit\" name=\"btn_add\" class=\"button-primary float-right\" value=\"Upload\" >\n");
      out.write("          </form>\n");
      out.write("   <script>\n");
      out.write("    email1.value = localStorage.getItem('email');\n");
      out.write("   \n");
      out.write("</script>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("</div>  \n");
      out.write("\t  \n");
      out.write(" <br><br>\n");
      out.write("    </div>\n");
      out.write(" </section></div>\n");
      out.write("<script>\n");
      out.write("function openCity(evt, cityName) {\n");
      out.write("  var i, tabcontent, tablinks;\n");
      out.write("  tabcontent = document.getElementsByClassName(\"tabcontent\");\n");
      out.write("  for (i = 0; i < tabcontent.length; i++) {\n");
      out.write("    tabcontent[i].style.display = \"none\";\n");
      out.write("  }\n");
      out.write("  tablinks = document.getElementsByClassName(\"tablinks\");\n");
      out.write("  for (i = 0; i < tablinks.length; i++) {\n");
      out.write("    tablinks[i].className = tablinks[i].className.replace(\" active\", \"\");\n");
      out.write("  }\n");
      out.write("  document.getElementById(cityName).style.display = \"block\";\n");
      out.write("  evt.currentTarget.className += \" active\";\n");
      out.write("}\n");
      out.write("document.getElementById(\"defaultOpen\").click();\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
       
    try
    {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
        PreparedStatement pst ;
        ResultSet rst;
         String mail=request.getParameter("email");
            String fn = request.getParameter("fname");
            String ln=request.getParameter("lname");        
            String pwd=request.getParameter("address");   
            String cty = request.getParameter("city");
            String zc=request.getParameter("zip");
            String country = request.getParameter("country");
            String cont=request.getParameter("contact");
            String sum=request.getParameter("summ");
            session.setAttribute("userId", mail);
        if(request.getParameter("btn_submit")!=null && request.getParameter("email")!=null)    
        {   
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
                int xm = pst.executeUpdate();
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
                int xm = pst.executeUpdate(); 
                 
            }
          
             int r=1,xw=0;
                while(r!=9)
                {
                    String pos=request.getParameter("pos"+r);
                    String cmp=request.getParameter("com"+r);
                    String st=request.getParameter("stw"+r);
                    String end=request.getParameter("enw"+r);
                    String des=request.getParameter("dew"+r);
                    pst = conn.prepareStatement("insert into WORKEX values (?,?,?,?,?,?)");
                    r++;
                    pst.setString(1, mail);
                    pst.setString(2, pos);
                    pst.setString(3, cmp);
                    pst.setString(4, st);
                    pst.setString(5, end);
                    pst.setString(6, des);
                    if(pos==null)
                        break;
                     xw =pst.executeUpdate();
                } 
                
            int s=1;
            while(s!=9)
            {
                String tit=request.getParameter("pr"+s);
                String start=request.getParameter("stp"+s);
                String end=request.getParameter("enp"+s);
                String des=request.getParameter("pro"+s);
                           s++;
                pst = conn.prepareStatement("insert into PROJECT values (?,?,?,?,?)");
                pst.setString(1, mail);
                pst.setString(2, tit);
                pst.setString(3, start);
                pst.setString(4, end);
                pst.setString(5, des);
                if(tit==null)
                    break;
                int xtp=pst.executeUpdate();
                 }         
        int c=1;   
          while(c!=9)
            {
                 String cert=request.getParameter("tit"+c);
                String des=request.getParameter("des"+c);
                pst = conn.prepareStatement("insert into CERTIFICATE values (?,?,?)");
                c++;
                pst.setString(1, mail);
                pst.setString(2, cert);
                pst.setString(3, des);
                if(cert==null)
                    break;
                int xs=pst.executeUpdate();
                }
              int j=1;
             while(j!=9)
            {
                String skill=request.getParameter("ss"+j);
                if(skill==null)
                    break;
                pst = conn.prepareStatement("insert into SKILLS values (?,?)");
                j++;
                
                pst.setString(1, mail);
                pst.setString(2, skill);
                
               int xr=pst.executeUpdate();
                 
            }
             
            int k=1; 
            while(k!=9)
            {
                String pro=request.getParameter("ed"+k);
                String instt=request.getParameter("inst"+k);
                String st=request.getParameter("std"+k);
                String endd=request.getParameter("end"+k);
                String cgpa=request.getParameter("cgp"+k);
                pst = conn.prepareStatement("insert into EDUCATION values (?,?,?,?,?,?)");
                pst.setString(1, mail);
                pst.setString(2, pro);
                pst.setString(3, instt);
                pst.setString(4, st);
                pst.setString(5, endd);
                 pst.setString(6, cgpa);
                  k++;
                if(pro==null)
                    break;
                int xp=pst.executeUpdate();
                
            }
                int q=1;
            while(q!=9)
            {
                String lang=request.getParameter("ll"+q);
                pst = conn.prepareStatement("insert into LANGUAGE values (?,?)");
                q++;
                pst.setString(1, mail);
                pst.setString(2, lang);
                if(lang==null)
                    break;
                int xt=pst.executeUpdate();
                
            }
                int p=1;
             while(p!=9)
            {
                String hob=request.getParameter("tb"+p);
                pst = conn.prepareStatement("insert into UHOBBY values (?,?)");
                p++;
                pst.setString(1, mail);
                pst.setString(2, hob);
                if(hob==null)
                    break;
               int xx=pst.executeUpdate();
                       
            }
      out.write("\n");
      out.write("            <script>\n");
      out.write("           Swal.fire('', 'All Details Saved Successfully', 'success'); \n");
      out.write("           \n");
      out.write("            </script>\n");
      out.write("            ");

        }
            
    }
    catch(Exception exec) 
    {
        exec.printStackTrace();
    }
            
   

      out.write('\n');
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
