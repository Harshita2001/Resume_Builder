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
    <title>Executive</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
     <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
<script src="https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.9.2/html2pdf.bundle.js"></script> 
         <script src="https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.9.2/html2pdf.bundle.js"></script>
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
    * {
    margin:0;
    padding:0px;
    box-sizing: border-box;
}

/*body {
    padding: 50px 0px 0px 0px;
}*/
hr {
    margin: auto;
    width: 90%;
    color: grey;
}

.container {
    /*padding: 50px 0px 0px 0px;*/
    margin: 50px auto;
    display: flex;
    justify-content: flex-start;
    width: 90%;
    

}

aside, main section {
    background-color: white;
    border: 1px solid grey;
    box-shadow: 0px 0px 8px 8px #c9c9c9;
    flex: 3;
    /*height: auto;*/
    margin-right: 15px;

}

main {
    flex: 7;
}

main #first-section {
    margin-bottom: 50px;
}

.personal-img {
    width: 100%;
    height: auto;
}

.person-name {
    color: #5c5c5c ;
    font-size: 2vw;
    margin: 5px;
}

.personal-details, .details-list {
    font-size: 1.2vw;
    padding: 25px;
    list-style: none;
    color:#009688;
}

.details-list {
    padding-top: 0px;
}

.personal-details li{
    margin: 15px 0px;
    /*letter-spacing: .5px;*/
}

.personal-details li i {
    margin-right: 10px;

}

.details-list li {
    margin: 15px 0px;
}

.head-section {
    color: #5c5c5c;
    padding: 30px;
    margin: 0px;
    font-size: 1.6vw;
}

.head-section i{
    color: #009688;
}

.progress-back {
    border: 1px solid grey;
    border-radius: 15px;
    height: 1.5em;
    margin-top: 15px;
    text-align: justify;
}

.progress-text {
    color: white;
    text-align: center;
}

.progress {
    height: 100%;
    border-radius: 15px;
    background-color: #009688;
}

.p-100 {width: 100%;}
.p-95 {width: 95%;}
.p-90 {width: 90%;}
.p-85 {width: 85%;}
.p-75 {width: 75%;}
.p-30 {width: 30%;}

.data-details {
    width: 90%;
    margin: auto;
    padding: 40px 0px;
}

.data-details h3{
    font-size: 1.2vw;
    color: #5c5c5c;
    margin: 10px 0px;
}

.data-details > span{
    color: #009688;
    margin: 15px 0px;
    letter-spacing: 1px;
    font-weight: bold;
}
.green-span {
    background-color:#009688;
    padding: 5px;
    border-radius: 5px;
    font-weight: normal;
    color: white;
}

.fa-calendar-alt {
    margin: 0px 10px;
}

.data-details p {
    color: #5c5c5c;
    margin: 10px 0px;
    letter-spacing: .5px;
    line-height: 1.6;
}

footer {
    margin-top: 60px; 
    width: 100%;
    height: 150px;
    background-color: #009688;
    text-align: center;
    padding: 20px 0px;
    color: white;
    font-weight: bold;
    line-height: 2;
}

footer a {
    color: white;
    text-decoration: none;
    font-size: 1.2vw;
}
</style>
<body>
<center>
        <button id="download" class="button"><i class="fa fa-download"></i>&nbsp;&nbsp;DOWNLOAD</button>
<input type="submit" formtarget="../resume_det.jsp" onclick="window.location.href='../resume_det.jsp'" name="submit2" value="edit details" class="button button-primary float-right" />
  </center>
<div class="container" id="container">
        <aside>
            <%
                        
                    try
                        {
                            String mail = session.getAttribute("userId").toString();
        
                            String query1="Select * from PERSONAL where UEMAIL='"+mail+"' " ;
                            ResultSet rs=stmt1.executeQuery(query1);
                            
                            while(rs.next()==true)
                            {
                               %>
            <h2 class="person-name"> <%=rs.getString("UFNAME") %>&nbsp;&nbsp; <%=rs.getString("ULNAME") %></h2>
            <ul class="personal-details">
                <li> <i class="fas fa-user-tie"></i> Web Developer</li>
                <li> <i class="fas fa-globe-asia"></i><%=rs.getString("UADDRESS") %> &nbsp;&nbsp;<%=rs.getString("UZIPCODE") %>&nbsp;&nbsp;
                <%=rs.getString("UCOUNTRY") %><br/></li>
                <li> <i class="fas fa-inbox"></i> <%=rs.getString("UEMAIL") %></li>
                <li> <i class="fas fa-phone"></i><%=rs.getString("UCONTACT") %></li>
            </ul>
 <% }
%>
            <hr> <%   int l = 0;
                            String query5="Select * from SKILLS  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query5);
                             if(rs.next()==true){ 
                     %>
            <h2 class="head-section"><i class="fas fa-gem"></i> Skills </h2>
            <ul class="details-list">
                <li>
                   <%=rs.getString("SK") %>
                    
                </li>
               <%
                            while(rs.next()==true)
                            {
                                %>
             <li>
                   <%=rs.getString("SK") %>
                    
                </li>
                                    
             <%
                           l++;
                            } %>
        
        <% } %>
            </ul>
            <hr> <%  
                                       
                         int M = 0;
                            String query6="Select * from LANGUAGE  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query6);
                              if(rs.next()==true){ 
                                %>
            <h2 class="head-section"><i class="fas fa-language"></i> Languages </h2>
            <ul class="details-list">
                <li> 
               <%=rs.getString("ULANGUAGE") %>
               
                </li>
               <%   while(rs.next()==true)
                            {
                                %>
                                     
			<li><%=rs.getString("ULANGUAGE") %></li>
							 <%
                           M++;
                            }
                                                         %>	
                
              <% } %>
            </ul>
            
             <%  
                                       
                         int Mh = 0;
                            String query66="Select * from UHOBBY  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query66);
                              if(rs.next()==true){ 
                                %>
           <hr>  <h2 class="head-section"><i class="fas fa-language"></i> Hobbies </h2>
            <ul class="details-list">
                <li> 
               <%=rs.getString("UINTREST") %>
               
                </li>
               <%   while(rs.next()==true)
                            {
                                %>
                                     
			<li><%=rs.getString("UINTREST") %></li>
							 <%
                           Mh++;
                            }
                                                         %>	
                
              <% } %>
            </ul>
        </aside>

        <main>
            <section id="first-section">
                 <%  
                        int i = 0;
                            String query2="Select * from WORKEX  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query2);
                              if(rs.next()==true){ 
                                %>
                <h2 class="head-section"><i class="fas fa-briefcase"></i> Work Experience </h2>
                <div class="data-details">
                    <h3><%=rs.getString("UPOSITION") %>&nbsp;&nbsp;<%=rs.getString("UCOMPANY") %></h3>
                    <span><i class="fas fa-calendar-alt"></i> <%=rs.getString("USTART") %> <span class="green-span"><%=rs.getString("UEND") %></span></span>
                    <p><%=rs.getString("UDESCRIPTION") %></p>
                
             
                <%  while(rs.next()==true)
                            {

%>
                    <h3><%=rs.getString("UPOSITION") %>&nbsp;&nbsp;<%=rs.getString("UCOMPANY") %></h3>
                    <span><i class="fas fa-calendar-alt"></i> <%=rs.getString("USTART") %> <span class="green-span"><%=rs.getString("UEND") %></span></span>
                    <p><%=rs.getString("UDESCRIPTION") %></p>
               
                <% 
                                 i++;
                            }%>
                             </div>
              
                          <% }
%>
               
            </section>

<section id="first-section">
                 <%  
                        int ic = 0;
                            String queryc="Select * from  CERTIFICATE  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(queryc);
                              if(rs.next()==true){ 
                                %>
                <h2 class="head-section"><i class="fas fa-briefcase"></i> Certificates </h2>
                <div class="data-details">
                    <h3><%=rs.getString("UCERTI") %></h3>
                    <p><%=rs.getString("UDESCRIPTION") %></p>
                
             
                <%  while(rs.next()==true)
                            {

%>
                    <h3><%=rs.getString("UCERTI") %></h3>
                    <p><%=rs.getString("UDESCRIPTION") %></p>
               
                <% 
                                 ic++;
                            }%>
                             </div>
                
                          <% }
%>
               
            </section>
            <section>
                <%
                         int k = 0;
                            String query4="Select * from EDUCATION  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query4);
                             if(rs.next()==true){ 
                                %>
                <h2 class="head-section"><i class="fas fa-user-graduate"></i> Education </h2>
                <div class="data-details">
                    <h3><%=rs.getString("UPROGRAM") %>&nbsp;&nbsp;<%=rs.getString("UINSTITUTE") %></h3>
                    <span><i class="fas fa-calendar-alt"></i> <%=rs.getString("USTART") %> - <span><%=rs.getString("UEND") %></span></span>
                    <p><%=rs.getString("UINSTITUTE") %></p>
                </div>
                 <% 
                            while(rs.next()==true)
                            {
                                %>
                                 <div class="data-details">
                    <h3><%=rs.getString("UPROGRAM") %>&nbsp;&nbsp;</h3>
                    <span><i class="fas fa-calendar-alt"></i> <%=rs.getString("USTART") %> - <span><%=rs.getString("UEND") %></span></span>
                    <p><%=rs.getString("UINSTITUTE") %></p>
                </div>
                <%
                           k++;
                            }%>
						
                          
                            <% } %>
              
            </section>
        </main>
    </div>
<%
                        }
                        catch(Exception ex)
                        {
                            ex.printStackTrace();
                        }
                  
                    %>
                    
    </main>
                     <script>
    window.onload = function () {
    document.getElementById("download")
        .addEventListener("click", () => {
            const resume = this.document.getElementById("container");
            console.log(resume);
            console.log(window);
            
            html2pdf().from(resume).save();
        });
};

</script> 
   
</body>
</html>