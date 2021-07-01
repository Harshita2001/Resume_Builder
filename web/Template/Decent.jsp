
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
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />

    <!-- Font Awesome -->
    <script src="https://kit.fontawesome.com/996973c893.js"></script>

    <!-- Style -->
    <link rel="stylesheet" href="style.css" />

    <!-- Google Fonts -->
    <link
      href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,700,800,900&display=swap"
      rel="stylesheet"
    />
<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
     <script src="https://kit.fontawesome.com/d9973f5636.js" crossorigin="anonymous"></script>
    <link
        href="https://fonts.googleapis.com/css2?family=Work+Sans:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap"
        rel="stylesheet">
      <script src="https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.9.2/html2pdf.bundle.js"></script> 
         <script src="https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.9.2/html2pdf.bundle.js"></script>
 
    <title>Decent</title>
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
      body {
  margin: 0;
  padding: 0;
  background: rgb(240, 239, 239);
  font-family: "Poppins", sans-serif;
}

h1 {
  margin: 0;
  font-weight: 400;
}

h2 {
  margin: 0;
  font-weight: 400;
  display: inline-block;
}

.box {
  background: #fff;
  width: 50rem;
  padding: 3rem;
  margin: 1rem auto;
  border-radius: 0.5rem;
}

.header {
  display: grid;
  grid-template-columns: 40% 60%;
}

.header-left {
  display: grid;
  justify-items: center;
  align-items: center;
  font-size: 2rem;
}

.first-name {
  font-weight: 400;
  margin: 0;
}
.last-name {
  font-weight: 200;
  margin: 0;
}

.header-right {
  width: 100%;
  display: grid;
  justify-items: end;
}

.header-right p {
  display: inline-block;
}

.grey {
  background: rgb(133, 133, 133);
  color: #fff;
  padding: 0.7rem;
  border-radius: 0.3rem;
}

.icon {
  color: rgb(223, 223, 223);
  font-size: 1.5rem;
  margin-right: 0.5rem;
}

table {
  border: 2px solid #000;
  margin: 1rem 0 1rem 0;
  width: 100%;
  text-align: center;
  border-collapse: collapse;
}

td,
th {
  border: 1px solid #000;
  padding: 0.4rem;
}
  </style>
  <body>
      <center>
        
        <br>
       <button id="download" class="button"><i class="fa fa-download" style="color: white"></i>DOWNLOAD</button>
        <input type="submit" formtarget="../resume_det.jsp" onclick="window.location.href='../resume_det.jsp'" name="submit2" value="edit details" class="button button-primary float-right" />
        
    </center>
  <div class="box" id="box">
      <div class="header">
           <%
                        
                    try
                        {
                            String mail = session.getAttribute("userId").toString();
        
                            String query1="Select * from PERSONAL where UEMAIL='"+mail+"' " ;
                            ResultSet rs=stmt1.executeQuery(query1);
                            
                            while(rs.next()==true)
                            {
                               %>
        <div class="header-left">
            
          <div class="name">
            <h4 class="first-name"><%=rs.getString("UFNAME") %>&nbsp;&nbsp; <%=rs.getString("ULNAME") %></h4>
            
          </div>
        </div>
        <div class="header-right">
            <span><i class="fas fa-envelope"></i>&nbsp;&nbsp;<%=rs.getString("UEMAIL") %></span>
            
          
         <span><%=rs.getString("UADDRESS") %> &nbsp;&nbsp;<%=rs.getString("UZIPCODE") %>&nbsp;&nbsp;
                <%=rs.getString("UCOUNTRY") %></span>
          
            <span><i class="fas fa-phone"></i>&nbsp;&nbsp;<%=rs.getString("UCONTACT") %></span>
            
          
        </div>
      </div>
      <hr />
      <div class="objective">
        <div class="obj-heading grey">
          <i class="fas fa-bullseye icon"></i>
          <h2>Profile</h2>
        </div>
        <p>
          <%=rs.getString("USUM") %>
        </p>
      </div>
        <% } %>
      <div class="education">
          <%
                         int k = 0;
                            String query4="Select * from EDUCATION  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query4);
                             if(rs.next()==true){ 
                                %>
        <div class="ed-heading grey">
          <i class="fas fa-school icon"></i>
          <h2>Education</h2>
        </div>

        <table>
          <tr>
            <th>Board</th>
            <th>Institution</th>
            <th>Year of passing</th>
            <th>Percentage/GPA</th>
          </tr>
          <tr>
            <td><%=rs.getString("UPROGRAM") %></td>
            <td><%=rs.getString("UINSTITUTE") %></td>
            <td><%=rs.getString("USTART") %> - <%=rs.getString("UEND") %></td>
            <td><%=rs.getString("UCGPA") %></td>
          </tr>
            <% 
                            while(rs.next()==true)
                            {
                                %>
        <tr>
            <td><%=rs.getString("UPROGRAM") %></td>
            <td><%=rs.getString("UINSTITUTE") %></td>
            <td><%=rs.getString("USTART") %> - <%=rs.getString("UEND") %></td>
            <td><%=rs.getString("UCGPA") %></td>
          </tr>
          <%
                           k++;
                            }%>
						
                          
                            <% } %>
        </table>
      </div>
      <div class="skills">
           <%   int l = 0;
                            String query5="Select * from SKILLS  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query5);
                             if(rs.next()==true){ 
                     %>
          <div class="skills-heading grey">
                <i class="fas fa-tools icon"></i>
                <h2>Skills</h2>
          </div>

        <ul>
          <li><%=rs.getString("SK") %></li> <%
                            while(rs.next()==true)
                            {
                                %>
          <li><%=rs.getString("SK") %></li>
           <%
                           l++;
                            } %>
       
        <% } %>
        </ul>
      </div>
          <div class="education">
          <%
                         int kP = 0;
                            String queryKP="Select * from PROJECT  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(queryKP);
                             if(rs.next()==true){ 
                                %>
        <div class="ed-heading grey">
          <i class="fas fa-laptop-code"></i>
          <h2>Projects</h2>
        </div>

        <table>
          <tr>
            <th>Title</th>
            <th>Start Date - End Date</th>
            <th>Description</th>
          </tr>
          <tr>
            <td><%=rs.getString("PNAME") %></td>
            <td><%=rs.getString("USTART") %> - <%=rs.getString("UEND") %></td>
            <td><%=rs.getString("UDESCRIPTION") %></td>
          </tr>
            <% 
                            while(rs.next()==true)
                            {
                                %>
        <tr>
            <td><%=rs.getString("PNAME") %></td>
            <td><%=rs.getString("USTART") %> - <%=rs.getString("UEND") %></td>
            <td><%=rs.getString("UDESCRIPTION") %></td>
          </tr>
          <%
                           kP++;
                            }%>
						
                          
                            <% } %>
        </table>
      </div>
         <div class="skills">
           <%   int l1 = 0;
                            String queryl1="Select * from LANGUAGE  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(queryl1);
                             if(rs.next()==true){ 
                     %>
          <div class="skills-heading grey">
                <i class="fab fa-creative-commons-nd icon"></i>
                <h2>Language</h2>
          </div>

        <ul>
          <li><%=rs.getString("ULANGUAGE") %></li> <%
                            while(rs.next()==true)
                            {
                                %>
          <li><%=rs.getString("ULANGUAGE") %></li>
           <%
                           l1++;
                            } %>
       
        <% } %>
        </ul>
      </div>
        <div class="education">
          <%
                         int kc = 0;
                            String queryKc="Select * from CERTIFICATE  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(queryKc);
                             if(rs.next()==true){ 
                                %>
        <div class="ed-heading grey">
          <i class="fas fa-book"></i>
          <h2>Certificates</h2>
        </div>

        <table>
          <tr>
            <th>Title</th>
            <th>Description</th>
          </tr>
          <tr>
            <td><%=rs.getString("UCERTI") %></td>
            <td><%=rs.getString("UDESCRIPTION") %></td>
          </tr>
            <% 
                            while(rs.next()==true)
                            {
                                %>
        <tr>
            <td><%=rs.getString("UCERTI") %></td>
            <td><%=rs.getString("UDESCRIPTION") %></td>
          </tr>
          <%
                           kc++;
                            }%>
						
                          
                            <% } %>
        </table>
      </div>
         <div class="skills">
           <%   int l2 = 0;
                            String query51="Select * from UHOBBY  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query51);
                             if(rs.next()==true){ 
                     %>
          <div class="skills-heading grey">
                <i class="fas fa-tools icon"></i>
                <h2>Skills</h2>
          </div>

        <ul>
          <li><%=rs.getString("UINTREST") %></li> <%
                            while(rs.next()==true)
                            {
                                %>
          <li><%=rs.getString("UINTREST") %></li>
           <%
                           l2++;
                            } %>
       
        <% } %>
        </ul>
      </div>
  
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
            const resume = this.document.getElementById("box");
            console.log(resume);
            console.log(window);
            
            html2pdf().from(resume).save();
        })
}

</script> 
  </body>
</html>