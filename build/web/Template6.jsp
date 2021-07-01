<%@page import="java.security.interfaces.RSAKey"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*" %>
<%
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
    Statement stmt1=conn.createStatement();
%>
<!DOCTYPE html>
<html>
    <head>
          <meta charset="utf-8" />
    <meta
      name="viewport" content="width=device-width,initial-scale=1,shrink-to-fit=no"/>
    <title>Resume</title>
        <style>
            * {
  box-sizing: border-box;
  transition: 0.35s ease;
}
.rela-block {
  display: block;
  position: relative;
  margin: auto;
  top: ;
  left: ;
  right: ;
  bottom: ;
}
.rela-inline {
  display: inline-block;
  position: relative;
  margin: auto;
  top: ;
  left: ;
  right: ;
  bottom: ;
}
.floated {
  display: inline-block;
  position: relative;
  margin: false;
  top: ;
  left: ;
  right: ;
  bottom: ;
  float: left;
}
.abs-center {
  display: false;
  position: absolute;
  margin: false;
  top: 50%;
  left: 50%;
  right: false;
  bottom: false;
  transform: translate(-50%, -50%);
  text-align: center;
  width: 88%;
}
body {
  font-family: 'Open Sans';
  font-size: 18px;
  letter-spacing: 0px;
  font-weight: 400;
  line-height: 28px;
  background: url("http://kingofwallpapers.com/leaves/leaves-016.jpg") right no-repeat;
  background-size: cover;
}
body:before {
  content: "";
  display: false;
  position: fixed;
  margin: 0;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  background-color: rgba(255,255,255,0.92);
}
.caps {
  text-transform: uppercase;
}
.justified {
  text-align: justify;
}
p.light {
  color: #777;
}
h2 {
  font-family: 'Open Sans';
  font-size: 30px;
  letter-spacing: 5px;
  font-weight: 600;
  line-height: 40px;
  color: #000;
}
h3 {
  font-family: 'Open Sans';
  font-size: 21px;
  letter-spacing: 1px;
  font-weight: 600;
  line-height: 28px;
  color: #000;
}
.page {
  width: 90%;
  max-width: 1200px;
  margin: 80px auto;
  background-color: #fff;
  box-shadow: 6px 10px 28px 0px rgba(0,0,0,0.4);
}
.top-bar {
  height: 220px;
  background-color: #848484;
  color: #fff;
}
.name {
  display: false;
  position: absolute;
  margin: false;
  top: false;
  left: calc(350px + 5%);
  right: 0;
  bottom: 0;
  height: 120px;
  text-align: center;
  font-family: 'Raleway';
  font-size: 58px;
  letter-spacing: 8px;
  font-weight: 100;
  line-height: 60px;
}
.name div {
  width: 94%;
}
.side-bar {
  display: false;
  position: absolute;
  margin: false;
  top: 60px;
  left: 5%;
  right: false;
  bottom: 0;
  width: 350px;
  background-color: #f7e0c1;
  padding: 320px 30px 50px;
}
.mugshot {
  display: false;
  position: absolute;
  margin: false;
  top: 50px;
  left: 70px;
  right: false;
  bottom: false;
  height: 210px;
  width: 210px;
}
.mugshot .logo {
  margin: -23px;
}
.logo {
  display: false;
  position: absolute;
  margin: false;
  top: 0;
  left: 0;
  right: false;
  bottom: false;
  z-index: 100;
  margin: 0;
  color: #000;
  height: 250px;
  width: 250px;
}
.logo .logo-svg {
  height: 100%;
  width: 100%;
  stroke: #000;
  cursor: pointer;
}
.logo .logo-text {
  display: false;
  position: absolute;
  margin: false;
  top: 58%;
  right: 16%;
  cursor: pointer;
  font-family: "Montserrat";
  font-size: 55px;
  letter-spacing: 0px;
  font-weight: 400;
  line-height: 58.333333333333336px;
}
.social {
  padding-left: 60px;
  margin-bottom: 20px;
  cursor: pointer;
}
.social:before {
  content: "";
  display: false;
  position: absolute;
  margin: false;
  top: -4px;
  left: 10px;
  right: false;
  bottom: false;
  height: 35px;
  width: 35px;
  background-size: cover !important;
}
.social.twitter:before {
  background: url("https://cdn3.iconfinder.com/data/icons/social-media-2026/60/Socialmedia_icons_Twitter-07-128.png") center no-repeat;
}
.social.pinterest:before {
  background: url("https://cdn3.iconfinder.com/data/icons/social-media-2026/60/Socialmedia_icons_Pinterest-23-128.png") center no-repeat;
}
.social.linked-in:before {
  background: url("https://cdn3.iconfinder.com/data/icons/social-media-2026/60/Socialmedia_icons_LinkedIn-128.png") center no-repeat;
}
.side-header {
  font-family: 'Open Sans';
  font-size: 18px;
  letter-spacing: 4px;
  font-weight: 600;
  line-height: 28px;
  margin: 60px auto 10px;
  padding-bottom: 5px;
  border-bottom: 1px solid #888;
}
.list-thing {
  padding-left: 25px;
  margin-bottom: 10px;
}
.content-container {
  margin-right: 0;
  width: calc(95% - 350px);
  padding: 25px 40px 50px;
}
.content-container > * {
  margin: 0 auto 25px;
}
.content-container > h3 {
  margin: 0 auto 5px;
}
.content-container > p.long-margin {
  margin: 0 auto 50px;
}
.title {
  width: 80%;
  text-align: center;
}
.separator {
  width: 240px;
  height: 2px;
  background-color: #999;
}
.greyed {
  background-color: #ddd;
  width: 100%;
  max-width: 580px;
  text-align: center;
  font-family: 'Open Sans';
  font-size: 18px;
  letter-spacing: 6px;
  font-weight: 600;
  line-height: 28px;
}
@media screen and (max-width: 1150px) {
  .name {
    color: #fff;
    font-family: 'Raleway';
    font-size: 38px;
    letter-spacing: 6px;
    font-weight: 100;
    line-height: 48px;
  }
}

        </style>
    </head>
    <body>
        <!-- FONTS -->
<link href='https://fonts.googleapis.com/css?family=Open+Sans:300,400,600' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Raleway:100' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet' type='text/css'>

<!-- PAGE STUFF -->
<div class="rela-block page">
     <%
                        
                    try
                        {
                            String mail = session.getAttribute("userId").toString();
        
                            String query1="Select * from PERSONAL where UEMAIL='"+mail+"' " ;
                            ResultSet rs=stmt1.executeQuery(query1);
                            
                            while(rs.next()==true)
                            {
                               %>
    <div class="rela-block top-bar">
        <div class="caps name"><div class="abs-center"><%=rs.getString("UFNAME") %>&nbsp;&nbsp; <%=rs.getString("ULNAME") %></div></div>
    </div>
    <div class="side-bar">
        <div class="mugshot">
            <div class="logo">
                <svg viewbox="0 0 80 80" class="rela-block logo-svg">
                    <path d="M 10 10 L 52 10 L 72 30 L 72 70 L 30 70 L 10 50 Z" stroke-width="2.5" fill="none"/>
                </svg>
                <p class="logo-text">kj</p>
            </div>
        </div>
        <p><%=rs.getString("UADDRESS") %></p>
        <p><%=rs.getString("UZIPCODE") %>&nbsp;&nbsp;<%=rs.getString("UCOUNTRY") %></p>
        <p><%=rs.getString("UCONTACT") %></p>
        <p><%=rs.getString("UEMAIL") %></p><br>
        <% }
%>
<%   int l = 0;
                            String query5="Select * from SKILLS  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query5);
                             if(rs.next()==true){ 
                     %>
        <p class="rela-block caps side-header">Expertise</p>
        <p class="rela-block list-thing"><%=rs.getString("SK") %></p>
        <%
                            while(rs.next()==true)
                            {
                                %>
        <p class="rela-block list-thing"><%=rs.getString("SK") %></p>
         <%
                           l++;
                            } %>
   
        <% } %>

         <%
                         int k = 0;
                            String query4="Select * from EDUCATION  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query4);
                             if(rs.next()==true){ 
                                %>
        <p class="rela-block caps side-header">Education</p>
        <h4 class="rela-block list-thing"><%=rs.getString("UPROGRAM") %></h4>
        <h5 class="rela-block list-thing"><%=rs.getString("UINSTITUTE") %></h5>
        <h5 class="rela-block list-thing"><%=rs.getString("USTART") %> - <%=rs.getString("UEND") %></h5>
        <h5 class="rela-block list-thing">Marks:        <%=rs.getString("UCGPA") %></h5>
        <%
                            while(rs.next()==true)
                            {
                                %>
        <h4 class="rela-block list-thing"><%=rs.getString("UPROGRAM") %></h4>
        <h5 class="rela-block list-thing"><%=rs.getString("UINSTITUTE") %></h5>
        <h5 class="rela-block list-thing"><%=rs.getString("USTART") %> - <%=rs.getString("UEND") %></h5>
        <h5 class="rela-block list-thing">Marks:        <%=rs.getString("UCGPA") %></h5>
         <%
                           l++;
                            } %>
   
        <% } %>
    </div>
    <div class="rela-block content-container">
          <%
                        
                   String queryp="Select * from PERSONAL where UEMAIL='"+mail+"' " ;
                           rs=stmt1.executeQuery(queryp);
                            
                            while(rs.next()==true)
                            {
                               %>
        <div class="rela-block caps greyed">Profile</div>
        <p class="long-margin"><%=rs.getString("USUM") %> </p>
        <% } %>
        
       <%  
                        int i = 0;
                            String query2="Select * from WORKEX  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query2);
                              if(rs.next()==true){ 
                                %>
                                <div class="rela-block caps greyed">Experience</div>
        <h3><%=rs.getString("UPOSITION") %></h3>
        <h4><%=rs.getString("UCOMPANY") %></h4>
        <p class="light"><%=rs.getString("USTART") %>
                -<%=rs.getString("UEND") %></p>
        <p class="justified"><%=rs.getString("UDESCRIPTION") %></p>
     <%  while(rs.next()==true)
                            {

%>
 <h3><%=rs.getString("UPOSITION") %></h3>
        <h4><%=rs.getString("UCOMPANY") %></h4>
        <p class="light"><%=rs.getString("USTART") %>
                -<%=rs.getString("UEND") %></p>
        <p class="justified"><%=rs.getString("UDESCRIPTION") %></p>
        
             <% 
                                 i++;
                            }%>
                          
 
<% }
%>
 
        
        <%  
                           int ll = 0;
                            String queryl="Select * from PROJECT  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(queryl);
                             if(rs.next()==true){ 
                                
                                %>
                                <div class="rela-block caps greyed">Projects</div>
        <h3><%=rs.getString("PNAME") %></h3>
        <p class="light"><%=rs.getString("USTART") %>
                -<%=rs.getString("UEND") %></p>
        <p class="justified"><%=rs.getString("UDESCRIPTION") %></p>
     <%  while(rs.next()==true)
                            {

%>
<h3><%=rs.getString("PNAME") %></h3>
        <p class="light"><%=rs.getString("USTART") %>
                -<%=rs.getString("UEND") %></p>
        <p class="justified"><%=rs.getString("UDESCRIPTION") %></p>
        
             <% 
                                 ll++;
                            }%>
                          
 
<% }
%>
         <%  
                 int j = 0;
                            String queryj="Select * from CERTIFICATE  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(queryj);
                              if(rs.next()==true){ 
                                %>
                                <div class="rela-block caps greyed">Certifications</div>
        <h3><%=rs.getString("UCERTI") %></h3>
        <p class="light">Description</p>
        <p class="justified"><%=rs.getString("UDESCRIPTION") %></p>
     <%  while(rs.next()==true)
                            {

%>
<h3><%=rs.getString("UCERTI") %></h3>
        <p class="light">Description</p>
        <p class="justified"><%=rs.getString("UDESCRIPTION") %></p>
        
             <% 
                                 j++;
                            }%>
                          
 
<% }
%>
      <%
                         int jp = 0;
                            String query3="Select * from UHOBBY  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query3);
                             if(rs.next()==true){ 
                                %>
                                <div class="rela-block caps greyed">Hobbies</div>
        <p class="rela-block list-thing"><%=rs.getString("UINTREST") %></p>
        <%
                            while(rs.next()==true)
                            {
                                %>
        <p class="rela-block list-thing"><%=rs.getString("UINTREST") %></p>
         <%
                           jp++;
                            } %>
   
        <% } %>
         <%  
                      int M = 0;
                            String query6="Select * from LANGUAGE  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query6);
                              if(rs.next()==true){ 
                                %>
        <div class="rela-block caps greyed">Language</div>
        <p class="rela-block list-thing"><%=rs.getString("ULANGUAGE") %></p>
        <%
                            while(rs.next()==true)
                            {
                                %>
        <p class="rela-block list-thing"><%=rs.getString("ULANGUAGE") %></p>
         <%
                           M++;
                            } %>
   
        <% } %>
    
    </div>
         <%
                        }
                        catch(Exception ex)
                        {
                            ex.printStackTrace();
                        }
                  
                    %>
                    
</div>
        
    </body>
</html>