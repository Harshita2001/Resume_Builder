<%@page import="java.security.interfaces.RSAKey"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*" %>
<%
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
    Statement stmt1=conn.createStatement();
%>
<!DOCTYPE>
<html>
<head>

	<title>Your Resume</title>
	<meta http-equiv="content-type" content="text/html;" charset="utf-8" />

	<meta name="keywords" content="" />
	<meta name="description" content="" />
 <script src="https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.9.2/html2pdf.bundle.js"></script> 
         <script src="https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.9.2/html2pdf.bundle.js"></script>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">

	<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/2.7.0/build/reset-fonts-grids/reset-fonts-grids.css" media="all" /> 
	<link rel="stylesheet" type="text/css" href="resume.css" media="all" />
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
 
.msg { padding: 10px; background: #222; position: relative; }
.msg h1 { color: #fff;  }

/* //-- yui-grids style overrides -- */
body { font-family: Georgia; color: #444; }
#inner { padding: 10px 80px; margin: 80px auto; background: #f5f5f5; border: solid #666; border-width: 8px 0 2px 0; }
.yui-gf { margin-bottom: 2em; padding-bottom: 2em; border-bottom: 1px solid #ccc; }

/* //-- header, body, footer -- */
#hd { margin: 2.5em 0 3em 0; padding-bottom: 1.5em; border-bottom: 1px solid #ccc }
#hd h2 { text-transform: uppercase; letter-spacing: 2px; }
#bd, #ft { margin-bottom: 2em; }

/* //-- footer -- */
#ft { padding: 1em 0 5em 0; font-size: 92%; border-top: 1px solid #ccc; text-align: center; }
#ft p { margin-bottom: 0; text-align: center;   }

/* //-- core typography and style -- */
#hd h1 { font-size: 48px; text-transform: uppercase; letter-spacing: 3px; }
h2 { font-size: 152% }
h3, h4 { font-size: 122%; }
h1, h2, h3, h4 { color: #333; }
p { font-size: 100%; line-height: 18px; padding-right: 3em; }
strong { font-weight: bold; }
li { line-height: 24px; border-bottom: 1px solid #ccc; }
p.enlarge { font-size: 144%; padding-right: 6.5em; line-height: 24px; }
p.enlarge span { color: #000 }
.contact-info { margin-top: 7px; }
.first h2 { font-style: italic; }
.last { border-bottom: 0 }



.job { position: relative; margin-bottom: 1em; padding-bottom: 1em; border-bottom: 1px solid #ccc; }
.job h4 { position: absolute; top: 0.35em; right: 0 }
.job p { margin: 0.75em 0 3em 0; }

.last { border: none; }
.skills-list {  }
.skills-list ul { margin: 0; }
.skills-list li { margin: 3px 0; padding: 3px 0; }
.skills-list li span { font-size: 152%; display: block; margin-bottom: -2px; padding: 0 }
.talent { width: 32%; float: left }
.talent h2 { margin-bottom: 6px; }

#srt-ttab { margin-bottom: 100px; text-align: center;  }
#srt-ttab img.last { margin-top: 20px }

/* --// override to force 1/8th width grids -- */
.yui-gf .yui-u{width:80.2%;}
.yui-gf div.first{width:12.3%;}



    </style>
</head>
<body>
    

<!-- REMOVE -->
<br/><br/>
  <button id="download" class="button" style="color: blue; background:white;"><i class="fa fa-download" style="color: blue"></i>&nbsp;&nbsp;DOWNLOAD</button>
 <input type="submit" formtarget="../resume_det.jsp" onclick="window.location.href='../resume_det.jsp'" name="submit2" value="edit details" class="button button-primary float-right" />
  

<div id="doc2" class="yui-t">

        
	
<%
                        
                    try
                        {
                            String mail = session.getAttribute("userId").toString();
        
                            String query1="Select * from PERSONAL where UEMAIL='"+mail+"' " ;
                            ResultSet rs=stmt1.executeQuery(query1);
                            
                            while(rs.next()==true)
                            {
                               %>


	<div id="inner">
	
		<div id="hd">
			<div class="yui-gc">
				<div class="yui-u first">
                                    <h1><%=rs.getString("UFNAME") %>&nbsp;&nbsp; <%=rs.getString("ULNAME") %></h1>
					<h4><%=rs.getString("UADDRESS") %> &nbsp;&nbsp;<%=rs.getString("UZIPCODE") %></h4>
				<h5><%=rs.getString("UCOUNTRY") %></h5>
				
                                </div>

				<div class="yui-u">
					<div class="contact-info">
						
						<i class="fas fa-envelope"></i><h3><%=rs.getString("UEMAIL") %></h3>
                                                <i class="fas fa-phone-alt"></i><h3><%=rs.getString("UCONTACT") %></h3>
					</div><!--// .contact-info -->
				</div>
			</div><!--// .yui-gc -->
		</div><!--// hd -->

		<div id="bd">
			<div id="yui-main">
				<div class="yui-b">
                                     <% if(rs.getString("USUM")!=" "){ %>
					<div class="yui-gf">
						<div class="yui-u first">
							<h2>Profile</h2>
						</div>
						<div class="yui-u">
							<p class="enlarge">
							<%=rs.getString("USUM") %>
                                                        </p>
						</div>
					</div><!--// .yui-gf --> <% } %>
<% }
%>
					
									<%
                         int l = 0;
                            String query5="Select SK from SKILLS  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query5);
                             if(rs.next()==true){ 
                                                                        %>
                                 <div class="yui-gf">
						<div class="yui-u first">
							<h2>Skills</h2>
						</div>
						<div class="yui-u">

								
                                                                    <div><%=rs.getString("SK") %></div><br/>
                            
                                 <%
                            while(rs.next()==true)
                            {
                                %>
                                     
                                <div><%=rs.getString("SK") %></div><br/>

                                      
                                        <%
                           l++;
                            } %>
                           

		
						</div>
					</div><!--// .yui-gf -->

                            <%  }
                                        %>
							
					
                                                     <%
                         int M = 0;
                            String query6="Select * from LANGUAGE  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query6);
                              if(rs.next()==true){ 
                                %>
                             <div class="yui-gf">
						<div class="yui-u first">
							<h2>Languages</h2>
						</div>
						<div class="yui-u">
							
                                                            <div><%=rs.getString("ULANGUAGE") %></div><br/>
                       <%   while(rs.next()==true)
                            {
                                %>
                                     
								<div><%=rs.getString("ULANGUAGE") %></div><br/>
							 <%
                           M++;
                            }
                                                         %>	
							

							
						</div>
					</div><!--// .yui-gf-->
  <%  }
                                        %>
		

							
                                        <%
                            
                            int i = 0;
                            String query2="Select * from WORKEX  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query2);
                              if(rs.next()==true){ 
                                %>
                             <div class="yui-gf">
	
						<div class="yui-u first">
							<h2>Experience</h2>
						</div><!--// .yui-u -->

						<div class="yui-u">
                                                    <div class="job">
                
                 <i class="fas fa-circle"></i>   <h2> <%=rs.getString("UPOSITION") %></h2><br/>
                 <h3> <%=rs.getString("UCOMPANY") %></h4>
                 <h4><%=rs.getString("USTART") %> - <%=rs.getString("UEND") %></h4> 
                   
                    <p>
                        <%=rs.getString("UDESCRIPTION") %>
                    </p>
<br/></div>
                          <%  while(rs.next()==true)
                            {

%>
                <div class="job">
                
                 <i class="fas fa-circle"></i>   <h2> <%=rs.getString("UPOSITION") %></h2><br/>
                 <h3> <%=rs.getString("UCOMPANY") %></h4>
                 <h4><%=rs.getString("USTART") %> - <%=rs.getString("UEND") %></h4> 
                   
                    <p>
                        <%=rs.getString("UDESCRIPTION") %>
                    </p>
<br/></div>
                  
        <% 
                                 i++;
                            }%>
								

							
						</div>
					</div>  <% }  %>
                        
                                        <%
                            
                            int ll = 0;
                            String queryl="Select * from PROJECT  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(queryl);
                             if(rs.next()==true){ 
                                %>
                                <div class="yui-gf">
	
						<div class="yui-u first">
							<h2>Projects</h2>
						</div><!--// .yui-u -->

						<div class="yui-u">

							<div class="job">
                                                             <i class="fas fa-circle"></i>   <h2> <%=rs.getString("PNAME") %></h2><br/>
                 <h4><%=rs.getString("USTART") %> - <%=rs.getString("UEND") %></h4> 
                   
                    <p>
                        <%=rs.getString("UDESCRIPTION") %>
                    </p>
                    <br/></div>
                           <% while(rs.next()==true)
                            {

%>
               <div class="job"> 
                 <i class="fas fa-circle"></i>   <h2> <%=rs.getString("PNAME") %></h2><br/>
                 <h4><%=rs.getString("USTART") %> - <%=rs.getString("UEND") %></h4> 
                   
                    <p>
                        <%=rs.getString("UDESCRIPTION") %>
                    </p>
<br/>
                  
        <% 
                                 ll++;
                            }%>
								</div>

							
						</div>
					</div>
<% } %>
					
                                                <%
                         int k = 0;
                            String query4="Select * from EDUCATION  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query4);
                             if(rs.next()==true){ 
                                %>
                                <div class="yui-gf">
						<div class="yui-u first">
							<h2>Education</h2>
						</div>
						<div class="yui-u">
                                                     <h2><%=rs.getString("UPROGRAM") %></h2>
                        <h3><%=rs.getString("UINSTITUTE") %></h3>
                        Start Date: <%=rs.getString("USTART") %>
                        &nbsp;&nbsp; End Date:     <%=rs.getString("UEND") %><br/>
                         Marks:        <%=rs.getString("UCGPA") %><br/><br/>
                        
                                <% 
                            while(rs.next()==true)
                            {
                                %>
                       
                        <h2><%=rs.getString("UPROGRAM") %></h2>
                        <h3><%=rs.getString("UINSTITUTE") %></h3>
                        Start Date: <%=rs.getString("USTART") %>
                            &nbsp;&nbsp;End Date:     <%=rs.getString("UEND") %><br/>
                         Marks:        <%=rs.getString("UCGPA") %><br/><br/>
                        
                         <%
                           k++;
                            }%>
						</div>
					</div><!--// .yui-gf --> <% } %>
      <%
                         int kk = 0;
                            String query7="Select * from CERTIFICATE  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query7);
                             if(rs.next()==true){ 
                                %>
                                <div class="yui-gf">
						<div class="yui-u first">
							<h2>Certification</h2>
						</div>
						<div class="yui-u">
                                                     <h2><%=rs.getString("UCERTI") %></h2>
                        <h3><%=rs.getString("UDESCRIPTION") %></h3>
                       
                        
                                <% 
                            while(rs.next()==true)
                            {
                                %>
                       
                        <h2><%=rs.getString("UCERTI") %></h2>
                        <h3><%=rs.getString("UDESCRIPTION") %></h3>
                        
                         <%
                           kk++;
                            }%>
						</div>
					</div><!--// .yui-gf --> <% } %>
   
                                        
                                        
                            <%
                         int j = 0;
                            String query3="Select * from UHOBBY  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query3);
                             if(rs.next()==true){ 
                                %>
                                 <div class="yui-gf last">
                    <h2>Hobbies</h2>
                    <div class="yui-u">
                                <div> <i class="fas fa-circle"></i> &nbsp;&nbsp;&nbsp;<%=rs.getString("UINTREST") %> </div><br/>
                        </div>
                          <%  while(rs.next()==true)
                            {
                                %>
                                 <div class="yui-u">
                                <div> <i class="fas fa-circle"></i> &nbsp;&nbsp;&nbsp;<%=rs.getString("UINTREST") %> </div><br/>
                        </div>
                   
                                <%
                           j++;
                            }%>
                             
</div>
<% } %>
				</div><!--// .yui-b -->
			</div><!--// yui-main -->
		</div><!--// bd -->
</div><!-- // inner -->
</div><!--// doc -->
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
            const row1 = this.document.getElementById("doc2");
            console.log(row1);
            console.log(window);
            
            html2pdf().from(row1).save();
        })
}

</script>
</body>
</html>

