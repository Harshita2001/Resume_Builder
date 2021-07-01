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
    <meta charset="utf-8" />
    <meta
      name="viewport"
      content="width=device-width,initial-scale=1,shrink-to-fit=no"
    />
    <link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/2.7.0/build/reset-fonts-grids/reset-fonts-grids.css" media="all" /> 
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
	
    <link rel="stylesheet" type="text/css" href="resume.css" media="all" />
            <script src="https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.9.2/html2pdf.bundle.js"></script> 
         <script src="https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.9.2/html2pdf.bundle.js"></script>

    <title>Resume</title>
    <style>
        #main{
             height: 50px;
  width: 100%;
        }
    </style>
    <style>
      @import url("https://fonts.googleapis.com/css?family=Quicksand:400,700");

      html,
      body {
        background: #ccc;
        font-family: Quicksand, Arial, Verdana, sans-serif;
        font-size: 14px;
        color: #444;
      }

      main {
        background: #fff;
        box-sizing: border-box;
        box-shadow: 0 3px 10px rgba(0, 0, 0, 0.25);
        margin: 2rem auto;
        padding: 2.75rem;
        position: relative;
      }

      h1 {
        margin: 0;
        font-size: 2.5rem;
        line-height: 2rem;
        font-weight: normal;
        color: #000;
      }

      h2 {
        color: #47a;
        font-size: 1rem;
        font-weight: bold;
        margin: 0;
        margin-top: 1.5rem;
        text-transform: uppercase;
      }

      h3 {
        color: #111;
        font-size: 1.25rem;
        margin-top: 0rem;
        margin: 0;
        font-weight: normal;
      }

      h3 span.dept {
        color: #aaa;
      }

      h3 span.dept::before {
        content: "";
        border-left: 1px solid #ccc;
        padding-left: 0.4rem;
      }

      h4 {
        margin: 0;
        font-weight: normal;
      }

      h4 span.dates {
        color: #888;
        display: inline-block;
        float: right;
      }

      p {
        font-size: 1rem;
        margin-top: 0.5rem;
        margin-bottom: 0;
      }

      a {
        color: #369;
      }

     

      time {
        display: inline-block;
        min-width: 2rem;
      }

      address {
        font-style: normal;
      }

      .normal {
        font-weight: normal;
      }

      .position {
        margin-top: 0.75rem;
        transition: opacity 0.7s;
      }

      .no-bullets,
      .no-bullets ul {
        list-style: none;
        margin-left: 0;
        padding-left: 0;
        color: #000;
        font-weight: bold;
      }
      .no-bullets ul {
        font-weight: normal;
      }
      .no-bullets span {
        color: #666;
      }

      #contact {
        text-align: right;
        font-size: 0.9rem;
      }

      #phone {
        font-size: 1.25rem;
        font-weight: bold;
        text-decoration: none !important;
      }

      #location {
        font-size: 1.1rem;
      }

      #languages {
        column-count: 4;
      }

      a,
      a:visited,
      a:link,
      a:active,
      a:focus,
      #languages label {
        color: #395;
      }

      #professional-experience {
        position: relative;
      }

      main input {
        position: absolute;
        left: -10000px;
      }

      .educert {
        display: flex;
      }
      .educert li {
        flex: 1;
        align-items: start;
        justify-content: start;
      }

      #filters {
        position: absolute;
        top: 0;
        right: 0;
        z-index: 1;
      }

      #filters > ul {
        list-style: none;
        padding-left: 0;
        margin: -0.5rem;
        padding: 0.5rem;
      }

      #filters > ul > li > h3 {
        margin: 0;
        display: block;
        text-align: right;
        font-weight: bold;
        font-size: 1rem;
        color: #395;
        text-transform: uppercase;
      }

      #filters > ul > li > h3::before {
        content: "\2610 ";
        font-size: 1.2rem;
      }

      input:checked ~ div #filters > ul > li > h3::before {
        content: "\2611 ";
      }

      #filters > ul:hover {
        background: white;
        box-shadow: 0 2px 8px rgba(0, 0, 0, 0.2);
      }

      #filters > ul:hover ul {
        list-style: none;
        padding-left: 0;
        display: block;
        column-count: 4;
      }

      #filters > ul > li > ul {
        position: relative;
        top: 0;
        right: 0;
        display: none;
        padding: 1rem;
      }

      label {
        cursor: pointer;
      }

      input:checked ~ div section.position,
      input:checked ~ div #languages label {
        opacity: 0.25;
      }


      #contact-mini {
        display: flex;
        margin-top: 1rem;
      }

      #contact-mini > div {
        font-size: 0.75rem;
        flex: 1;
      }

      #contact-mini > div:nth-child(2) {
        text-align: center;
        flex: 2;
      }
      #contact-mini > div:last-child {
        text-align: right;
      }

      input:checked ~ div #languages label[for]::before,
      input:not(:checked) ~ div #languages label[for]::before {
        content: "";
      }

      #contact {
        display: none;
      }

      @media all and (min-width: 630px) {
        main {
          max-width: 600px;
        }
        #contact-mini > div {
          font-size: 1rem;
        }
      }

      @media all and (min-width: 1000px) {
        html,
        body {
          font-size: 16px;
        }
        main {
          max-width: 920px;
          display: flex;
        }
        main > div:first-child {
          flex: 1;
        }
        main > div:last-child {
          width: 21%;
          margin-left: 4%;
        }
        #languages {
          column-count: 1;
        }
        .educert {
          display: block;
        }
        .educert > li:nth-child(n + 2) {
          margin-top: 0.75rem;
        }
        #contact-mini {
          display: none;
        }
        #contact {
          display: block;
        }
        #email,
        #website {
          font-size: 0.9em;
        }
      }

      @media all and (min-width: 1200px) {
        html,
        body {
          font-size: 18px;
        }
        main {
          max-width: 1120px;
        }
        #email,
        #website {
          font-size: 1em !important;
        }
      }

      @media print {
        @page {
          size: 900px;
        }
        html,
        body {
          background: #fff;
          font-size: 16px;
          width: 900px;
        }
        a,
        a:visited,
        a:link,
        a:active,
        a:focus,
        #languages label {
          text-decoration: none;
          color: #000;
        }
        main {
          margin: 0;
          max-width: 920px;
          display: flex;
          box-shadow: none;
        }
        main > div:first-child {
          flex: 1;
        }
        main > div:last-child {
          width: 21%;
          margin-left: 4%;
        }
        #filters {
          display: none;
        }
        #languages {
          column-count: 1;
        }
        .educert {
          display: block;
        }
        .educert > li:nth-child(n + 2) {
          margin-top: 0.75rem;
        }
        .position {
          opacity: 1 !important;
        }
        #contact-mini {
          display: none;
        }
        #contact {
          display: block;
        }
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
        <button id="download" class="button" style="color: blue; background:white;"><i class="fa fa-download" style="color: blue"></i>&nbsp;&nbsp;DOWNLOAD</button>
<input type="submit" formtarget="../resume_det.jsp" onclick="window.location.href='../resume_det.jsp'" name="submit2" value="edit details" class="button button-primary float-right" />
  </center>
    <main id="resume" itemscope itemtype="http://schema.org/Person">
      <div>
        <header>
          <%
                        
                    try
                        {
                            String mail = session.getAttribute("userId").toString();
        
                            String query1="Select * from PERSONAL where UEMAIL='"+mail+"' " ;
                            ResultSet rs=stmt1.executeQuery(query1);
                            
                            while(rs.next()==true)
                            {
                               %>
          <h1 itemprop="name"><%=rs.getString("UFNAME") %>&nbsp;&nbsp; <%=rs.getString("ULNAME") %></h1>
          <p id="objective" itemprop="description">
            <span itemprop="jobTitle">&nbsp;&nbsp<%=rs.getString("UADDRESS") %> &nbsp;&nbsp;<%=rs.getString("UZIPCODE") %>&nbsp;&nbsp;
                <%=rs.getString("UCOUNTRY") %><br/></span>
                <span itemprop="jobTitle"><%=rs.getString("USUM") %><br/><br/></span>
           
          </p>
          <address id="contact-mini">
            <div itemprop="email">
                <a href="">
                    <%=rs.getString("UEMAIL") %></a>
              
            </div>
              <a href="">
               <span itemprop="telephone"><%=rs.getString("UCONTACT") %></span></a>
            
           
          </address>   <% }
%>
        </header>
        <section id="professional-experience">
        
          <%  
                        int i = 0;
                            String query2="Select * from WORKEX  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query2);
                              if(rs.next()==true){ 
                                %>
                            <h2>Experience</h2>      
          <section
            itemprop="memberOf"
            itemscope
            itemtype="http://schema.org/Organization"
            class="position reactjs html css javascript kotlin a11y less api"
          >
            <h3>
              <span itemprop="name"><%=rs.getString("UPOSITION") %></span>
              </h3>
            <h4
              itemprop="member"
              itemscope
              itemtype="http://schema.org/OrganizationRole"
            >
              <span itemprop="roleName"><%=rs.getString("UCOMPANY") %></span>
              <span class="dates">
                <time itemprop="startDate"><%=rs.getString("USTART") %></time>
                -
                <time itemprop="endDate"><%=rs.getString("UEND") %></time>
              </span>
            </h4>
            <ul itemprop="description">
              <li>
                <%=rs.getString("UDESCRIPTION") %>
              </li></ul>
             
                          <%  while(rs.next()==true)
                            {

%>
<h3>
              <span itemprop="name"><%=rs.getString("UPOSITION") %></span>
              </h3>
            <h4
              itemprop="member"
              itemscope
              itemtype="http://schema.org/OrganizationRole"
            >
              <span itemprop="roleName"><%=rs.getString("UCOMPANY") %></span>
              <span class="dates">
                <time itemprop="startDate"><%=rs.getString("USTART") %></time>
                -
                <time itemprop="endDate"><%=rs.getString("UEND") %></time>
              </span>
            </h4>
            <ul itemprop="description">
              <li>
                <%=rs.getString("UDESCRIPTION") %>
              </li>
            </ul>
                <% 
                                 i++;
                            }%>
                          <% }
%>
          </section>

         

         

 
        </section>
          
         
      <section id="professional-experience">
          
          <%  
                           int ll = 0;
                            String queryl="Select * from PROJECT  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(queryl);
                             if(rs.next()==true){ 
                                
                                %>
                            <h2>Projects</h2>
          <section
            itemprop="memberOf"
            itemscope
            itemtype="http://schema.org/Organization"
            class="position reactjs html css javascript kotlin a11y less api"
          >
            <h3>
              <span itemprop="name"><%=rs.getString("PNAME") %></span>
              </h3>
            <h4
              itemprop="member"
              itemscope
              itemtype="http://schema.org/OrganizationRole"
            >
              <span class="dates">
                <time itemprop="startDate"><%=rs.getString("USTART") %></time>
                -
                <time itemprop="endDate"><%=rs.getString("UEND") %></time>
              </span>
            </h4>
            <ul itemprop="description">
              <li>
                <%=rs.getString("UDESCRIPTION") %>
              </li></ul>
             
                          <%  while(rs.next()==true)
                            {

%>
<h3>
              <span itemprop="name"><%=rs.getString("PNAME") %></span>
              </h3>
            <h4
              itemprop="member"
              itemscope
              itemtype="http://schema.org/OrganizationRole"
            >
              <span class="dates">
                <time itemprop="startDate"><%=rs.getString("USTART") %></time>
                -
                <time itemprop="endDate"><%=rs.getString("UEND") %></time>
              </span>
            </h4>
            <ul itemprop="description">
              <li>
                <%=rs.getString("UDESCRIPTION") %>
              </li>
            </ul>
                <% 
                                 ll++;
                            }%>
                          <% }
%>
          </section>
</section>
          
          <section id="professional-experience3">
         
          <%  
                 int j = 0;
                            String queryj="Select * from CERTIFICATE  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(queryj);
                              if(rs.next()==true){ 
                                %>
                     <h2>Certifications</h2>            
          <section
            itemprop="memberOf"
            itemscope
            itemtype="http://schema.org/Organization"
            class="position reactjs html css javascript kotlin a11y less api"
          >
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
                                 j++;
                            }%>
                          
          </section>
<% }
%>
         

       </section>
      </div>
      <div>
           <%
                        
                   String queryp="Select * from PERSONAL where UEMAIL='"+mail+"' " ;
                           rs=stmt1.executeQuery(queryp);
                            
                            while(rs.next()==true)
                            {
                               %>
        <address id="contact" class="contact-2">
          <div
            id="location"
            itemprop="address"
            itemscope
            itemtype="http://schema.org/PostalAddress"
          >
            
          </div>
          <a href="" id="phone"><%=rs.getString("UCONTACT") %></a>
          <div>
            <a href="" id="email"
              ><%=rs.getString("UEMAIL") %></a
            >
          </div>
          
        </address>
<% } %>
        <section>
         
            
        <%   int l = 0;
                            String query5="Select * from SKILLS  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query5);
                             if(rs.next()==true){ 
                     %>
                      <h2>Programming Languages</h2>
          <ul class="no-bullets" id="languages">
           
            <li><label for="html" itemprop="knowsAbout"><%=rs.getString("SK") %></label></li>
            <%
                            while(rs.next()==true)
                            {
                                %>
            <li><label for="html" itemprop="knowsAbout"><%=rs.getString("SK") %></label></li>
           
                                    
             <%
                           l++;
                            } %>
        </ul> </section>
        <% } %>

        <section>
         
            <%
                         int k = 0;
                            String query4="Select * from EDUCATION  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query4);
                             if(rs.next()==true){ 
                                %>
                                 <h2>Education</h2>
          <ul class="no-bullets educert">
            <li
              itemprop="alumniOf"
              itemscope
              itemtype="http://schema.org/EducationalOrganization"
            >
                 <span itemprop="name"><%=rs.getString("UPROGRAM") %></span>
              <ul>
                <li itemprop="award"><%=rs.getString("UINSTITUTE") %></li>
                <li itemprop="award"><%=rs.getString("USTART") %> - <%=rs.getString("UEND") %></li>
              <li itemprop="award"> Marks:        <%=rs.getString("UCGPA") %></li>
              
              </ul><br/>
                                <% 
                            while(rs.next()==true)
                            {
                                %>
                       
                        <span itemprop="name"><%=rs.getString("UPROGRAM") %></span>
              <ul>
                <li itemprop="award"><%=rs.getString("UINSTITUTE") %></li>
                <li itemprop="award"><%=rs.getString("USTART") %> - <%=rs.getString("UEND") %></li>
              <li itemprop="award"> Marks:        <%=rs.getString("UCGPA") %></li>
              
              </ul><br/>
                         <%
                           k++;
                            }%>
						
                          
                            <% } %>
              
      
     
        </section>

        <section>
          
            <%
                         int jp = 0;
                            String query3="Select * from UHOBBY  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query3);
                             if(rs.next()==true){ 
                                %>
                                <h2>Hobbies</h2>
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

        <section>
          
            <%  
                                       
                         int M = 0;
                            String query6="Select * from LANGUAGE  where UEMAIL='"+mail+"' " ;
                             rs=stmt1.executeQuery(query6);
                              if(rs.next()==true){ 
                                %>
                                <h2>Languages</h2>
          <ul class="no-bullets educert">
            <li>
             
              <ul>
                <li><%=rs.getString("ULANGUAGE") %></li>
                 <%   while(rs.next()==true)
                            {
                                %>
                                     
			<li><%=rs.getString("ULANGUAGE") %></li>
							 <%
                           M++;
                            }
                                                         %>	
                
              </ul>
            </li>
           
            
          </ul><% } %>
        </section>
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
            const resume = this.document.getElementById("resume");
            console.log(resume);
            console.log(window);
            
            html2pdf().from(resume).save();
        })
}

</script> 
  </body>
</html>
