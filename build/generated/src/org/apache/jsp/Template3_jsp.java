package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Template3_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>Responsive Resume UI Design in HTML and CSS</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("    <script src=\"https://kit.fontawesome.com/b99e675b6e.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("    @import url('https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap');\r\n");
      out.write("\r\n");
      out.write("*{\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    list-style: none;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    font-family: 'Roboto', sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body{\r\n");
      out.write("    background: #c4c4c4;\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("    line-height: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".resume_wrapper{\r\n");
      out.write("    display: flex;\r\n");
      out.write("    width: 800px;\r\n");
      out.write("    margin: 50px auto;\r\n");
      out.write("    background: #fff;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".resume_wrapper .resume_left{\r\n");
      out.write("    width: 35%;\r\n");
      out.write("    background: #26252d;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".resume_wrapper .resume_left .resume_image{\r\n");
      out.write("    width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".resume_wrapper .resume_left .resume_image img{\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".resume_wrapper .resume_title{\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("    font-weight: 700;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("    letter-spacing: 4px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".resume_wrapper .resume_left .resume_info{\r\n");
      out.write("    color: #84838b;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".resume_wrapper .resume_left .resume_bottom{\r\n");
      out.write("    padding: 20px 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".resume_wrapper .resume_item{\r\n");
      out.write("    padding: 20px 0;\r\n");
      out.write("    border-bottom: 1px solid #0175b2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".resume_wrapper  .resume_item:last-child{\r\n");
      out.write("    border-bottom: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".resume_wrapper .resume_left .resume_namerole{\r\n");
      out.write("    display: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".resume_wrapper .resume_namerole .name{\r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("    font-weight: 700;\r\n");
      out.write("    margin-bottom: 5px;\r\n");
      out.write("    letter-spacing: 4px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".resume_wrapper .resume_left .resume_namerole .role{\r\n");
      out.write("    color: #84838b;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".resume_wrapper .resume_left .resume_contact .resume_info:last-child{\r\n");
      out.write("     margin-top: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".resume_wrapper .resume_left .resume_contact .resume_subtitle{\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    margin-bottom: 2px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".resume_wrapper .resume_left .resume_skills .skills_list{\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("    margin-bottom: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".resume_wrapper .resume_left .resume_skills .skills_list .skills_bar p{\r\n");
      out.write("    position: relative;\r\n");
      out.write("    width: 125px;\r\n");
      out.write("    height: 20px;\r\n");
      out.write("    background: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".resume_wrapper .resume_left .resume_skills .skills_list .skills_bar p span{    \r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 0;\r\n");
      out.write("    left: 0;\r\n");
      out.write("    background: #0175b2;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".resume_wrapper .resume_right{\r\n");
      out.write("    width: 65%;\r\n");
      out.write("    padding: 20px 40px;\r\n");
      out.write("    color: #26252d;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".resume_wrapper .resume_right .resume_namerole .name{\r\n");
      out.write("    color: #26252d;\r\n");
      out.write("    font-size: 32px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".resume_wrapper .resume_right .resume_namerole .role{\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".resume_wrapper .resume_right .resume_item .resume_title{\r\n");
      out.write("    color: #26252d;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".resume_wrapper .resume_right .resume_data{\r\n");
      out.write("    display: flex;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".resume_wrapper .resume_right .resume_data .year{\r\n");
      out.write("    padding-right: 35px;\r\n");
      out.write("    width: 115px;\r\n");
      out.write("    position: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".resume_wrapper .resume_right .resume_data .content{\r\n");
      out.write("    padding-left: 35px;\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("    width: calc(100% - 115px);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".resume_wrapper .resume_right .resume_data .year:before{\r\n");
      out.write("    content: \"\";\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 5px;\r\n");
      out.write("    right: 0;\r\n");
      out.write("    width: 10px;\r\n");
      out.write("    height: 10px;\r\n");
      out.write("    background: #fff;\r\n");
      out.write("    border: 1px solid #26252d;\r\n");
      out.write("    border-radius: 50%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".resume_wrapper .resume_right .resume_data .year:after{\r\n");
      out.write("    content: \"\";\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 17px;\r\n");
      out.write("    right: 4px;\r\n");
      out.write("    width: 3px;\r\n");
      out.write("    height: 90%;\r\n");
      out.write("    background: #0175b2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".resume_wrapper .resume_right .resume_data:last-child .year:after{\r\n");
      out.write("    display: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".resume_wrapper .resume_right .resmue_interests .resume_info{\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".resume_wrapper .resume_right .resmue_interests .interests .int_icon{\r\n");
      out.write("    font-size: 38px;\r\n");
      out.write("    color: #0175b2;\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media screen and (max-width: 800px){\r\n");
      out.write("    .resume_wrapper .resume_right .resume_namerole{\r\n");
      out.write("        display: none;\r\n");
      out.write("    }\r\n");
      out.write("    .resume_wrapper .resume_left .resume_namerole{\r\n");
      out.write("        display: block;\r\n");
      out.write("    }\r\n");
      out.write("    .resume_wrapper{\r\n");
      out.write("        width: 95%;\r\n");
      out.write("        margin: 10px auto;\r\n");
      out.write("        flex-direction: column;\r\n");
      out.write("    }\r\n");
      out.write("    .resume_wrapper .resume_left,\r\n");
      out.write("    .resume_wrapper .resume_right{\r\n");
      out.write("        width: 100%;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media screen and (max-width: 424px){\r\n");
      out.write("    .resume_wrapper .resume_right{\r\n");
      out.write("        padding: 20px 30px;\r\n");
      out.write("    }\r\n");
      out.write("    .resume_wrapper .resume_right .resume_data{\r\n");
      out.write("        flex-direction: column;\r\n");
      out.write("    }\r\n");
      out.write("    .resume_wrapper .resume_right .resume_data .year{\r\n");
      out.write("        padding: 0;\r\n");
      out.write("        margin-bottom: 5px;\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        color: #0175b2;\r\n");
      out.write("    }\r\n");
      out.write("    .resume_wrapper .resume_right .resume_data .year:before,\r\n");
      out.write("    .resume_wrapper .resume_right .resume_data .year:after{\r\n");
      out.write("        display: none;\r\n");
      out.write("    }\r\n");
      out.write("    .resume_wrapper .resume_right .resume_data .content{\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        padding: 0;\r\n");
      out.write("    }\r\n");
      out.write("    .resume_wrapper .resume_right .resmue_interests .interests .int_icon{\r\n");
      out.write("        font-size: 24px;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"resume_wrapper\">\r\n");
      out.write("    <div class=\"resume_left\">\r\n");
      out.write("        <div class=\"resume_image\">\r\n");
      out.write("            <img src=\"pic.jpg\" alt=\"Resume_image\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"resume_bottom\">\r\n");
      out.write("            <div class=\"resume_item resume_namerole\">\r\n");
      out.write("                <div class=\"name\">Rosie Jackson</div>\r\n");
      out.write("                <div class=\"role\">UI Designer</div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"resume_item resume_profile\">\r\n");
      out.write("                <div class=\"resume_title\">Profile</div>\r\n");
      out.write("                <div class=\"resume_info\">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\r\n");
      out.write("                tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\r\n");
      out.write("                quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\r\n");
      out.write("                consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\r\n");
      out.write("                cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\r\n");
      out.write("                proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"resume_item resume_address\">\r\n");
      out.write("                <div class=\"resume_title\">Address</div>\r\n");
      out.write("                <div class=\"resume_info\">\r\n");
      out.write("                    18th home,<br/>\r\n");
      out.write("                    woods street,<br/>\r\n");
      out.write("                    New York City, United States\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"resume_item resume_contact\">\r\n");
      out.write("                <div class=\"resume_title\">Contact</div>\r\n");
      out.write("                <div class=\"resume_info\">\r\n");
      out.write("                    <div class=\"resume_subtitle\">Phone</div>\r\n");
      out.write("                    <div class=\"resume_subinfo\">+62 000 222 333</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"resume_info\">\r\n");
      out.write("                    <div class=\"resume_subtitle\">Email</div>\r\n");
      out.write("                    <div class=\"resume_subinfo\">rosiejack@gmail.com</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"resume_item resume_skills\">\r\n");
      out.write("                <div class=\"resume_title\">Skills</div>\r\n");
      out.write("                <div class=\"resume_info\">\r\n");
      out.write("                    <div class=\"skills_list\">\r\n");
      out.write("                        <div class=\"skills_left\">HTML</div>\r\n");
      out.write("                        <div class=\"skills_bar\">\r\n");
      out.write("                            <p>\r\n");
      out.write("                                <span style=\"width: 90%\"></span>\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"skills_list\">\r\n");
      out.write("                        <div class=\"skills_left\">CSS</div>\r\n");
      out.write("                        <div class=\"skills_bar\">\r\n");
      out.write("                            <p>\r\n");
      out.write("                                <span style=\"width: 80%\"></span>\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"skills_list\">\r\n");
      out.write("                        <div class=\"skills_left\">Javascript</div>\r\n");
      out.write("                        <div class=\"skills_bar\">\r\n");
      out.write("                            <p>\r\n");
      out.write("                                <span style=\"width: 50%\"></span>\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"skills_list\">\r\n");
      out.write("                        <div class=\"skills_left\">Photoshop</div>\r\n");
      out.write("                        <div class=\"skills_bar\">\r\n");
      out.write("                            <p>\r\n");
      out.write("                                <span style=\"width: 95%\"></span>\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"resume_right\">\r\n");
      out.write("        <div class=\"resume_item resume_namerole\">\r\n");
      out.write("            <div class=\"name\">Rosie Jackson</div>\r\n");
      out.write("            <div class=\"role\">UI Designer</div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"resume_item resume_education\">\r\n");
      out.write("            <div class=\"resume_title\">Education</div>\r\n");
      out.write("            <div class=\"resume_info\">\r\n");
      out.write("                <div class=\"resume_data\">\r\n");
      out.write("                    <div class=\"year\">2000 - 2010</div>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <p>Title</p>\r\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"resume_data\">\r\n");
      out.write("                    <div class=\"year\">2010 - 2013</div>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <p>Title</p>\r\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"resume_data\">\r\n");
      out.write("                    <div class=\"year\">2013 - 2015</div>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <p>Title</p>\r\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"resume_item resume_experience\">\r\n");
      out.write("            <div class=\"resume_title\">Experience</div>\r\n");
      out.write("            <div class=\"resume_info\">\r\n");
      out.write("                <div class=\"resume_data\">\r\n");
      out.write("                    <div class=\"year\">2000 - 2010</div>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <p>Title</p>\r\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"resume_data\">\r\n");
      out.write("                    <div class=\"year\">2010 - 2013</div>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <p>Title</p>\r\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"resume_data\">\r\n");
      out.write("                    <div class=\"year\">2013 - 2015</div>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <p>Title</p>\r\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"resume_data\">\r\n");
      out.write("                    <div class=\"year\">2013 - 2015</div>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <p>Title</p>\r\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"resume_data\">\r\n");
      out.write("                    <div class=\"year\">2013 - 2015</div>\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <p>Title</p>\r\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"resume_item resmue_interests\">\r\n");
      out.write("            <div class=\"resume_title\">Interests</div>\r\n");
      out.write("            <div class=\"resume_info\">\r\n");
      out.write("                <div class=\"interests\">\r\n");
      out.write("                    <div class=\"int_icon\">\r\n");
      out.write("                        <i class=\"fas fa-volleyball-ball\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"int_data\">Volleyball</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"interests\">\r\n");
      out.write("                    <div class=\"int_icon\">\r\n");
      out.write("                        <i class=\"fas fa-book-open\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"int_data\">Reading</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"interests\">\r\n");
      out.write("                    <div class=\"int_icon\">\r\n");
      out.write("                        <i class=\"fas fa-film\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"int_data\">Movies</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"interests\">\r\n");
      out.write("                    <div class=\"int_icon\">\r\n");
      out.write("                        <i class=\"fas fa-biking\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"int_data\">Riding</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
