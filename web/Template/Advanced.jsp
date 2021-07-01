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
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">

    <link href="./css/custom.css" rel="stylesheet">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <script src="https://kit.fontawesome.com/d9973f5636.js" crossorigin="anonymous"></script>
    <link
        href="https://fonts.googleapis.com/css2?family=Work+Sans:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap"
        rel="stylesheet">
      <script src="https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.9.2/html2pdf.bundle.js"></script> 
         <script src="https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.9.2/html2pdf.bundle.js"></script>
 <style>
        #main{
             height: 100%;
  width: 100%;
        }
    </style>
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
</head>

<body>
    <center>
        
        <br>
       <button id="download" class="button"><i class="fa fa-download" style="color: white"></i>DOWNLOAD</button>
        <input type="submit" formtarget="../resume_det.jsp" onclick="window.location.href='../resume_det.jsp'" name="submit2" value="edit details" class="button button-primary float-right" />
        
    </center>
<div id="main">
    <div class="container-fluid">
         <%
                        
                    try
                        {
                            String mail = session.getAttribute("userId").toString();
        
                            String query1="Select * from PERSONAL where UEMAIL='"+mail+"' " ;
                            ResultSet rs=stmt1.executeQuery(query1);
                            
                            while(rs.next()==true)
                            {
                               %>
        <div class="row" id="row1">
            <div class="col-12 col-sm-12 col-md-12 col-lg-5 gray" 
            style="">
 




                <div class="ProfileContainer">

                </div>
                <div class="ProfileIMG">
                    <div class="SmallCircle">
                    </div>
                </div>

                <div class="LeftSideContainer ">
                    <div class="contact LeftHeader ">

                        <h2>Contact</h2>
                        <i class="fas fa-phone-alt"></i> <a href=""><%=rs.getString("UCONTACT") %></a><br>
                        <i class="fas fa-envelope"></i> <a
                            href=""><%=rs.getString("UEMAIL") %></a><br>
                         <i id="pinIcon" class="fas fa-thumbtack"></i> <%=rs.getString("UFNAME") %>&nbsp;&nbsp; <%=rs.getString("ULNAME") %>
                    </div>

<% } %>

                    <div class="Education LeftHeader ">
 <%
                         int k = 0;
                            String query4="Select * from EDUCATION  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query4);
                             if(rs.next()==true){ 
                                %>
                        <h2>Education</h2>
                        <span class="GoldenBadge"><%=rs.getString("USTART") %> - <%=rs.getString("UEND") %></span><br>
                        <h5><%=rs.getString("UPROGRAM") %></h5>
                        <h6><%=rs.getString("UINSTITUTE") %></h6>
                        <span>Marks: <%=rs.getString("UCGPA") %></span><br>
 
 <% 
                            while(rs.next()==true)
                            {
                                %>
                      <span class="GoldenBadge"><%=rs.getString("USTART") %> - <%=rs.getString("UEND") %></span><br>
                        <h5><%=rs.getString("UPROGRAM") %></h5>
                        <h6><%=rs.getString("UINSTITUTE") %></h6>  
 <span>Marks: <%=rs.getString("UCGPA") %></span><br>
                      
  <%
                           k++;
                            }%>
						
                          
                            <% } %>
                    </div>


                    <div class="skills LeftHeader ">
                        
 <%   int l = 0;
                            String query5="Select * from SKILLS  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query5);
                             if(rs.next()==true){ 
                     %>
                     <h2>Skills</h2>
                      <div class="rowCont">
                                <div> <i class="fas fa-circle"></i> <%=rs.getString("SK") %></div></div>
 <%
                            while(rs.next()==true)
                            {
                                %>

<div class="rowCont">
    <div> <i class="fas fa-circle"></i><%=rs.getString("SK") %></div></div>
                     
 <%
                           l++;
                            } %>
        
        <% } %>
        <div class="Hobies RightHeader">
                   
                     <%  
                                       
                         int M = 0;
                            String query6="Select * from LANGUAGE  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query6);
                              if(rs.next()==true){ 
                                %>
                                 <h2>Languages</h2>
                     <%=rs.getString("ULANGUAGE") %><br/>
                         <% 
                          while(rs.next()==true)
                            {
                                %>
                          <%=rs.getString("ULANGUAGE") %><br/>
                         <%
                           M++;
                            }%>
                   
<% } %>

</div>

 </div>


                </div>

            </div>
          
            <div class="col-12 col-sm-12 col-md-12 col-lg-7 RightSideContainer">
               <%
                        
                   String queryp="Select * from PERSONAL where UEMAIL='"+mail+"' " ;
                           rs=stmt1.executeQuery(queryp);
                            
                            while(rs.next()==true)
                            {
                               %>

                <div class="about RightHeader">
                    <h2>About</h2>
                    <p><%=rs.getString("USUM") %>
                    </p>
                </div>
<% } %>
                <div class="WorkExperience RightHeader ">

                   
 <%  
                        int i = 0;
                            String query2="Select * from WORKEX  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query2);
                              if(rs.next()==true){ 
                                %>
                                 <h2>Work Experience</h2>
                    <h5><%=rs.getString("UPOSITION") %></h5>
                    <span class="GoldenBadge"><%=rs.getString("USTART") %> - <%=rs.getString("UEND") %></span> <span><%=rs.getString("UCOMPANY") %></span>
                    <p><%=rs.getString("UDESCRIPTION") %></p>

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
                </div>

                <div class="WorkExperience RightHeader ">

                    
 <%  
                           int ll = 0;
                            String queryl="Select * from PROJECT  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(queryl);
                             if(rs.next()==true){ 
                                
                                %>
                                <h2>Projects</h2>
                    <h5><%=rs.getString("PNAME") %></h5>
                    <span class="GoldenBadge"><%=rs.getString("USTART") %> - <%=rs.getString("UEND") %></span>
                    <p><%=rs.getString("UDESCRIPTION") %></p>

 <%  while(rs.next()==true)
                            {

%>
 <h5><%=rs.getString("PNAME") %></h5>
                    <span class="GoldenBadge"><%=rs.getString("USTART") %> - <%=rs.getString("UEND") %></span>
                    <p><%=rs.getString("UDESCRIPTION") %></p>
                    <% 
                                 ll++;
                            }%>
                          <% }
%>
                </div>

                <div class="WorkExperience RightHeader ">

                   
  <%  
                 int j = 0;
                            String queryj="Select * from CERTIFICATE  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(queryj);
                              if(rs.next()==true){ 
                                %>
                                 <h2>Certifications</h2>
                    <h5><%=rs.getString("UCERTI") %></h5>
                    <p><%=rs.getString("UDESCRIPTION") %></p>

 <%  while(rs.next()==true)
                            {

%>
 <h5><%=rs.getString("UCERTI") %></h5>
                   <p><%=rs.getString("UDESCRIPTION") %></p>
                    <% 
                                 j++;
                            }%>
                          <% }
%>
                </div>
                <div class="Hobies RightHeader">
                   
                     <%
                         int jp = 0;
                            String query3="Select * from UHOBBY  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query3);
                             if(rs.next()==true){ 
                                %>
                                 <h2>Hobbies</h2>
                     <%=rs.getString("UINTREST") %><br/>
                         <% 
                          while(rs.next()==true)
                            {
                                %>
                         <%=rs.getString("UINTREST") %><br/>
                         <%
                           jp++;
                            }%>
                   
<% } %>
       
 


            </div></div>
 <%
                        }
                        catch(Exception ex)
                        {
                            ex.printStackTrace();
                        }
                  
                    %>

        
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
    </div>
</div>
</body>
<script>
    window.onload = function () {
    document.getElementById("download")
        .addEventListener("click", () => {
            const row1 = this.document.getElementById("row1");
            console.log(row1);
            console.log(window);
            
            html2pdf().from(row1).save();
        })
}

</script>

</html>

<style>

body * {
    font-family: 'Work Sans', sans-serif;
    color:#363636;
}
.ProfileContainer 
{
    background-color: #f0ae12;
  border-radius: 50%;
  height: 300px;
  width: 300px;
  left:-50px;
  top:-50px;
  position: absolute;
  z-index: 0;
}
.ProfileIMG {
    width: 250px;
    height: 250px;
    background-image: url("../anubhi.jpeg");
    background-size: contain;
    border-radius: 50%;
    border:10px solid #ffffff;
    margin-left:70px;
    margin-top:70px;
    position: relative;
    z-index: 1;
 
}
.gray{
    background-color:#f3f4f5;
}
.SmallCircle
 {
    background-color: #f0ae12;
    opacity: 0.8;
    border-radius: 50%;
    height: 90px;
    width: 90px;
    left:160px;
    top:-20px;
    position: absolute;
    z-index: 0;
 }
 h2 {
    color:#464646;
    margin-bottom:30px;
    font-weight: 500;

 }
 .LeftSideContainer
 {
     margin-left:100px;
     
 }
 i {
     color:#f0ae12;
     padding-right:10px;
 }
 a {
     text-decoration: none;
     color:#464646;
    }
.LeftHeader,
.RightHeader{
    margin-top:30px;
    margin-bottom:100px;
   
}
.GoldenBadge {
    background-color: #f0ae12;
    padding:5px 10px;
    border-radius: 5px;
    margin-bottom: 10px;
    display: inline-block;
    font-weight: 500;
}
.Education  .GoldenBadge {
    margin-top:20px;
    
    
}
.skills{
    font-weight: 500;
    max-width: 360px;
    min-width: 310px !important;
     
    line-height: 32px;
}
.GrayDot{
    color:#e1e1e1;
}
h1 {
    margin-top:130px;
    font-weight: 600;
    font-size:60px;
}
.RightSideContainer {
    margin-left:100px;
    width: fit-content;
   
}

.surname {
    color:#f0ae12;;
}
.about,
.RightSideContainer {
    margin-top:108px;
    max-width: 600px;
}
.WorkExperience h5 {
    margin-top:20px;
}
.Hobies .rowCont {
   margin-top:30px;
   display: flex;
      flex-direction: row;
   justify-content: space-between;
   max-width: 400px;
}
.Hobies .rowCont div {
    width: 50%;
}
.skills i {
    padding:1px;
}
@media only screen and (max-width: 1217px) {
  .LeftSideContainer,
  .RightSideContainer  {
      margin-left: 10px;
  }

  .skills {
      padding-right:15px;
  }
  }

  @media only screen and (max-width: 374px) {
      .ProfileIMG {
          margin-left:30px;
      }
      .LeftSideContainer,
      .RightSideContainer  {
          margin-left: 3px;
      }

  }
  #pinIcon {
    padding-left: 2px;
    padding-right: 12px;
     
  }
  .skills .float-end {
    padding-right: 8px;
    
  }
</style>


               