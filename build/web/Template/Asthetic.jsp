<%@page import="java.security.interfaces.RSAKey"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*" %>
<%
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
    Statement stmt1=conn.createStatement();
%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Asthetic</title>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
	
    <link rel="stylesheet" type="text/css" href="resume.css" media="all" />
<script src="https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.9.2/html2pdf.bundle.js"></script> 
         <script src="https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.9.2/html2pdf.bundle.js"></script>

    </head>
    <style>
             .button {
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
         </style>
    <style>
         html, body, * {
  box-sizing: border-box;
  color: #53555b;
  margin: 0;
  padding: 0;
}



#main-container {
  background-image: url(./assets/img//background.jpg);
  background-size: cover;
  display: flex;
  font-weight: 400;
  justify-content: center;
  margin: 0;
  padding-bottom: 10px;
  width: 100%;
}

.page {
  box-sizing: border-box;
  height: 29.684cm;
  margin: 0;
  padding: 0;
  width: 21.1cm;
}

.page > * {
  margin: 0;
}

header {
  background-color: rgb(49, 63, 78);
  height: 9%;
  padding: 12px 20px;
}

header .name, header .major {
  color: white;
  font-family: Helvetica, sans-serif;
  font-weight: 400;
  margin: 0;
}

header .major {
  font-weight: 100;
  margin-top: 10px;
}

.contents {
  box-sizing: border-box;
  display: flex;
  height: 91%;
  width: 100%;
}

.main-section {
  background-color: white;
  display: inline-block;
  width: 70%;
}

.main-section > section,
.right-section > section {
  padding: 20px;
}

.highlights {
  font-family: Helvetica, sans-serif;
  font-size: small;
  font-weight: 100;
  text-align: left;
  word-spacing: normal;
  font-variant: normal;
}

li {
  font-variant: normal;
  font-weight: 100;
}

.section-title {
  border-bottom: 1px solid #bdbdbd;
  color: rgb(49, 63, 78);
  font-family: Tahoma, sans-serif;
  font-size: 18px;
  font-weight: 400;
}

.right-section {
  background-color: #f5f5f5;
  display: inline-block;
  width: 30%;
}

.experience-card {
  font-family: Helvetica, sans-serif;
  padding: 10px 0;
}

.experience-card .title {
  color: #53555b;
  font-family: Helvetica, sans-serif;
  font-size: 17px;
}

.experience-card .company {
  font-family: Helvetica, sans-serif;
  font-size: 15px;
  margin-bottom: 10px;
}

.experience-card .company .name{
  color: #919191;
  font-weight: bold;
}

.experience-card .company .duration{
  color: #919191;
  font-size: 14px;
}

ul {
  font-family: Helvetica, sans-serif;
  font-size: small;
  list-style: disc;
  list-style-position: inside;
}

.certificate-card {
  color: #53555b;
  font-family: Helvetica, sans-serif;
  margin: 8px 0;
}

.date {
  color: #919191;
  font-size: small;
}

.education-card {
  color: #53555b;
  font-family: Helvetica, sans-serif;
  margin: 8px 0;
}

.education-card .institution{
  font-size: small;
}

.info-item {
  color: #53555b;
  font-family: Helvetica, sans-serif;
  font-size: small;
  margin-top: 10px;
}

.info-item .info {
  display: block;
  font-weight: 100;
  margin-top: 6px;
}

.skill-card {
  display: flex;
  font-family: Helvetica, sans-serif;
  font-size: small;
  justify-content: space-between;
  padding: 20px 0;
}

.skill-level-container {
  display: flex;
}

.disc {
  background-color: #c2c2c2;
  border-radius: 50%;
  display: inline-block;
  height: 12px;
  margin-right: 2px;
  width: 12px;
  position: relative;
}

.fill {
  background-color: rgb(49, 63, 78);
}

.half-disc-left{
  height:12px;
  width:6px;
  border-radius: 90px 0 0 90px;
  background:rgb(49, 63, 78);
}

.concentric-half {
  background-color: rgb(49, 63, 78);
  height: 6px;
  width: 6px;
  position: absolute;
  top: 25%;
  left: 25%;
}
        </style>
    <body>
        
    <center>
       <button id="download" class="button"><i class="fa fa-download" style="color: white"></i>DOWNLOAD</button>
        <input type="submit" formtarget="../resume_det.jsp" onclick="window.location.href='../resume_det.jsp'" name="submit2" value="edit details" class="button button-primary" />
        <br/>
    </center>
        <div id="main-container">
  <%
                        
                    try
                        {
                            String mail = session.getAttribute("userId").toString();
                            String query1="Select * from PERSONAL where UEMAIL='"+mail+"' " ;
                            ResultSet rs=stmt1.executeQuery(query1);
                            
                            while(rs.next()==true)
                            {
                               %>
    <div class="page" id="toPrint">
      <header>
        <h1 class="name"><%=rs.getString("UFNAME") %>&nbsp;&nbsp;<%=rs.getString("ULNAME") %></h1>
        <h3 class="name"><%=rs.getString("UCONTACT") %>&nbsp;</h3>
      </header>
      <section class="contents">
        <section class="main-section">
          <section class="highlights"><%=rs.getString("USUM") %>
          </section>
          <section class="experience">
         
<% } %>
            <div class="experience-card">
            
              <div>
                <ul class='experience-list'>
                <%  
                        int i = 0;
                            String query2="Select * from WORKEX  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query2);
                              if(rs.next()==true){ 
                                %>
                                 <h2>Work Experience</h2>
                    <div class="title"><%=rs.getString("UPOSITION") %></div>
                     <div class="company">
                         <span class="name"><%=rs.getString("USTART") %> - <%=rs.getString("UEND") %></span> <br/><span><%=rs.getString("UCOMPANY") %></span>
                     </div>  <p><%=rs.getString("UDESCRIPTION") %></p>

 <%  while(rs.next()==true)
                            {

%>
 <h5><%=rs.getString("UPOSITION") %></h5>
                    <span class="GoldenBadge"><%=rs.getString("USTART") %> - <%=rs.getString("UEND") %></span> <span><%=rs.getString("UCOMPANY") %></span>
                    <p><%=rs.getString("UDESCRIPTION") %></p>
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
                               <br/><br/> <h2>Projects</h2>
                    <h3><%=rs.getString("PNAME") %></h3>
                    <span class="GoldenBadge"><%=rs.getString("USTART") %> - <%=rs.getString("UEND") %></span>
                    <p><%=rs.getString("UDESCRIPTION") %></p>

 <%  while(rs.next()==true)
                            {

%>
 <h3><%=rs.getString("PNAME") %></h3>
                    <span class="GoldenBadge"><%=rs.getString("USTART") %> - <%=rs.getString("UEND") %></span>
                    <p><%=rs.getString("UDESCRIPTION") %></p>
                    <% 
                                 ll++;
                            }%>
                          <% }
%>

                   
 
                               
                </ul>
              </div>
            </div>
          </section>
          <section class="certificates">
            <section id="professional-experience3">
          
          <%  
                 int p = 0;
                            String queryc="Select * from CERTIFICATE  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(queryc);
                              if(rs.next()==true){ 
                                %>
                                <h2>Certifications</h2>        
         
            <h3>
              <span itemprop="name"><%=rs.getString("UCERTI") %></span>
              </h3>
            
              <p>
                <%=rs.getString("UDESCRIPTION") %>
              </p>
             
                          <%  while(rs.next()==true)
                            {

%>
  <h3>
              <span itemprop="name"><%=rs.getString("UCERTI") %></span>
              </h3>
            
              <p>
                  <%=rs.getString("UDESCRIPTION") %></p>
              
                <% 
                                 p++;
                            }%>
                          
       
<% }
%>
         

       </section>
          </section>
          <section class="education">
           <section>
         
            <%
                         int k = 0;
                            String query4="Select * from EDUCATION  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query4);
                             if(rs.next()==true){ 
                                %>
                                 <h2>Education</h2>
          <ul class="no-bullets educert">
           
                 <h3 itemprop="name"><%=rs.getString("UPROGRAM") %></h3>
              <ul>
                  <h4><%=rs.getString("UINSTITUTE") %></h4>
               <%=rs.getString("USTART") %> - <%=rs.getString("UEND") %><br/>
              Marks:        <%=rs.getString("UCGPA") %>
              
              </ul><br/>
                                <% 
                            while(rs.next()==true)
                            {
                                %>
                       
                        <h3 itemprop="name"><%=rs.getString("UPROGRAM") %></h3>
              <ul>
                  <h4><%=rs.getString("UINSTITUTE") %></h4>
               <%=rs.getString("USTART") %> - <%=rs.getString("UEND") %><br/>
             Marks:        <%=rs.getString("UCGPA") %>
              
              </ul><br/>
                         <%
                           k++;
                            }%>
						
                          
                            <% } %>
              
      
     
        </section>

          </section>
        </section>
                             <%
                        
                   
                          
                            String query10="Select * from PERSONAL where UEMAIL='"+mail+"' " ;
                            rs=stmt1.executeQuery(query10);
                            
                            while(rs.next()==true)
                            {
                               %>
        <section class="right-section">
          <section class="personal-info">
            <div class="section-title">Personal Info</div>
            <div class="info-item">
              <strong><%=rs.getString("UADDRESS") %> &nbsp;&nbsp;<%=rs.getString("UZIPCODE") %>&nbsp;&nbsp;<br/>
                <%=rs.getString("UCOUNTRY") %></strong>
              <span class="info"><i class="fas fa-phone"></i> <a href=""><%=rs.getString("UCONTACT") %></a><br>
                         
</span>
              <span class="info"><i class="fas fa-envelope"></i> <a
                            href=""><%=rs.getString("UEMAIL") %></a><br>
                        </span>
              <span class="info"><i id="pinIcon" class="fas fa-thumbtack"></i> <%=rs.getString("UFNAME") %>&nbsp;&nbsp; <%=rs.getString("ULNAME") %></span>
            </div><% } %>
           
          </section>
          <section class="skills">
                <%   int l = 0;
                            String query5="Select * from SKILLS  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query5);
                             if(rs.next()==true){ 
                     %>
                    <h2>Skills
                      </h2><br/>
                       <%=rs.getString("SK") %><br/>
 <%
                            while(rs.next()==true)
                            {
                                %>
                                    <%=rs.getString("SK") %><br/>
                     
 <%
                           l++;
                            } %>
        
        <% } %>

                </section>  
        <section class="skills">
             <%  
                                       
                         int M = 0;
                            String query6="Select * from LANGUAGE  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query6);
                              if(rs.next()==true){ 
                                %>
                                 <h2>Languages</h2><br/>
                     <ul class="no-bullets">
            <li>
                <span><%=rs.getString("ULANGUAGE") %><br/></span></li>
                         <% 
                          while(rs.next()==true)
                            {
                                %>
                          <ul class="no-bullets">
            <li>
              <span> <%=rs.getString("ULANGUAGE") %><br/></span></li>
                         <%
                           M++;
                            }%>
                   
<% } %>
                          </ul><br/><br/>
 </section>  
          <section class="skills">
          
            <%
                         int jp = 0;
                            String query3="Select * from UHOBBY  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query3);
                             if(rs.next()==true){ 
                                %>
                                <h2>Hobbies</h2><br/>
          <ul class="no-bullets">
            <li>
              <span><%=rs.getString("UINTREST") %></span></li>
             <% 
                          while(rs.next()==true)
                            {
                                %>
                             <li>   <span><%=rs.getString("UINTREST") %></span></li>
                                  <%
                           jp++;
                            }%>
                                
            
          </ul><% } %>
        </section>
        </section> </div>
            
         
    </div>
      <%
                            }
                        catch(Exception ex)
                        {
                            ex.printStackTrace();
                        }
                  
                    %>
  <script>
    window.onload = function () {
    document.getElementById("download")
        .addEventListener("click", () => {
            const resume = this.document.getElementById("main-container");
            console.log(resume);
            console.log(window);
            
            html2pdf().from(resume).save();
        })
}

</script> 
    </body>
</html>
