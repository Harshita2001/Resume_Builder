<%@page import="java.sql.*"%>
<%@page import="java.io.*" %>
<html>
<head>
     <script src="https://cdn.jsdelivr.net/npm/sweetalert2@10.10.1/dist/sweetalert2.all.min.js"></script>
        <link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/sweetalert2@10.10.1/dist/sweetalert2.min.css'>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>WELCOME ADMIN! </title>
<style>
form { width: 500px; }
input[type=text] { float:left ; width: 200px; }
input[type=file] { float:left ; width: 200px; }
label { float: left; width: 300px; }
.clear { clear: both; height: 0; line-height: 0; }
.floatright { float: right; }
table, th, td {
            border: 2px solid black;
            border-collapse: collapse;
        }
        th, td {
            padding: 15px;
        }
</style>

<style>
.button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  border-radius: 12px;
  padding: 14px 40px;
  display: block;
  width: 40%;
}
.button:hover {
  box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
}



</style>
<style>
body {
  background-image: url(images/w.jpeg);
  background-repeat: no-repeat;
  background-position: center;
   background-size:100% 100%;
}
</style>
 <script type = "text/javascript" >  
    function preventBack() { window.history.forward(); }  
    setTimeout("preventBack()", 0);  
    window.onunload = function () { null };  
</script>
</head>
<body>
        
    <div style="text-align: center;  font-size: 40px; color: #2b0c62; padding-top: 60px;">
        <div style="font-weight: normal; font-family: 'Ultra', sans-serif; font-size: 32px; line-height: 42px; 
             text-transform: uppercase; text-align: center;">
            <b>WELCOME ADMIN!</b>
            <div style="float:right; margin-top: -60px; font-size: 20px; text-shadow: 0 5px 5px rgba(0,0,0,0.2); color: black;">
      
                    <div>
                        <a class="nav-link" href="getstarted.jsp" style="color:black;"> <span class="fa fa-user-plus " ></span> Logout</a>
                   
                    </div>

    </div> 
        </div>
        </div>
    <center>
        <p style="padding-top: 10px; color: #2b0c62; font-size: 20px; font-family: serif; font-weight: bold; ">
            <b>Choose any of the following options</b></p> 


        <br> <br> 
    <input type="submit" class="button" data-toggle="modal" data-target="#myModaladdtemplate" value="ADD TEMPLATE" id="btn_addtemplate"/>

    <div class="modal fade" id="myModaladdtemplate" role="dialog">
    <div class="modal-dialog">
    
       Modal content
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title"><b>ADD TEMPLATE</b></h4>
        </div>
        <div class="modal-body">
            <form action="Add_Template_Servlet" method="POST" enctype="multipart/form-data">
                <label for="txtname">Template Name:</label> <input type="text" name="txtname"/>
                <br/> <br />
                <label for="img">Upload Template:</label> <input type="file" name="img"/>
                <br /> <br />
                <input type="submit" class="btn btn-default" value="Add Template" name="btn_add" />
                
            </form>
        </div>
        
      </div>
      
    </div>
  </div>
    <br>
    
    <input type="submit" class="button" data-toggle="modal" data-target="#myModalviewdeltemplate" value="VIEW / DELETE TEMPLATE" id="btn_view_del_template"/>
    
    <div class="modal fade" id="myModalviewdeltemplate" role="dialog">
    <div class="modal-dialog">
    
       Modal content
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title"><b>VIEW / DELETE TEMPLATE</b></h4>
        </div>
        <div class="modal-body">
            <%
        try{
    
                    
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
        Statement stmt1=conn.createStatement();
        ResultSet rs=stmt1.executeQuery("select NAME from TEMPLATE");
       %>
        
       <table>
        <br>
        <tr><td><b>TEMPLATE NAME</b></td><td><b>VIEW TEMPLATE</b></td><td><b>DELETE TEMPLATE</b></td></tr>
	<%
        while(rs.next())
        {
            out.print("<tr>");
            out.print("<td>"+rs.getString(1) +"</td>");
            out.print("<td><a href='View.jsp?NAME="+rs.getString(1)+"'>View Template</a></td>");
            out.println("<td><a href='Delete.jsp?NAME="+rs.getString(1)+"'>Delete Template</a></td>");
            out.print("</tr>");
                    
        }  
}
  catch(Exception ex){
          out.println(ex);
    }
        %>  </table>
        </div>
        
      </div>
      
    </div>
  </div>
        
    <br>    

    <input type="submit" class="button" data-toggle="modal" data-target="#myModalviewusers" value="VIEW USERS" id="btn_view_users" />
        
    <div class="modal fade" id="myModalviewusers" role="dialog">
    <div class="modal-dialog">
    
     
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title"><b>VIEW USERS</b></h4>
        </div>
        <div class="modal-body">
            
        
        <%
    try
    {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery("select EMAIL, NAME from USER1");
        out.print("<center>");
        out.print("<table>");
        out.print("<tr>");
        out.print("<td><b>EMAIL ID</b></td><td><b>NAME</b></td>" );
        out.print("</tr>");
        while(rs.next())
        {

            out.print("<tr>");
            out.print("<td>"+ rs.getString(1)+ "</td><td>" + rs.getString(2)+ "</td>" );
            out.print("</tr>");

        }
        out.print("</table>");
        out.print("</center>");
        conn.close();
        
    }
    catch(Exception ex)
        {ex.printStackTrace();}
%>
       
	
        </div>
        
      </div>
      
    </div>
  </div>
   
<br>

    <input type="submit" class="button" data-toggle="modal" data-target="#myModaladdjob" value="ADD JOB" id="btn_addjob"/>

    <div class="modal fade" id="myModaladdjob" role="dialog">
    <div class="modal-dialog">
    
       Modal content
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title"><b>ADD JOB</b></h4>
        </div>
        <div class="modal-body">
            <form action="myForm" id="fmjob">
                <label>Job Description:</label> <input type="text" name="desp">
          <br/><br/>
                <label>Company Name:</label> <input type="text" name="company_name">
                <br/><br/>
                <label>Job Location:</label> <input type="text" name="job_location">
                <br /><br/>
                <label>Minimum Experience Required:</label> <input type="text" name="exp_reqd">
                <br /> <br /> 
                <label>Salary Insights:</label> <input type="text" name="salary">
                <br /> <br /> 
                <label>Last Date to Apply:</label> <input type="text" name="deadline" placeholder="DD/MM/YYYY" >
                <br /> <br /> 
                <label>Link to Apply:</label> <input type="text" name="link_apply">
                <br/><br/>
                <input type="submit" class="btn btn-default" value="Post Job" name="btn_add_job">
                <br />
            </form>
        </div>
        
      </div>
      
    </div>
  </div>
  
    <br>
    
    <input type="submit" class="button" data-toggle="modal" data-target="#myModalviewdeljob" value="VIEW / DELETE JOB" id="btn_view_del_job"/>

   <div class="modal fade" id="myModalviewdeljob" role="dialog">
    <div class="modal-dialog">
    
       Modal content
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title"><b>JOB DETAILS</b></h4>
        </div>
        <div class="modal-body">
            <%
                try
                {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata"); 
                    PreparedStatement pst = conn.prepareStatement("select JOB_ID, JOB_DESCRIPTION, DEADLINE  from JOB ") ; 
                    ResultSet rst = pst.executeQuery();
                    out.print("<table>");
                    out.print("<tr><td><b>JOB DESCRIPTION</b></td><td><b>DEADLINE</b></td><td><b>DELETE JOB</b></td></tr>");
                    while(rst.next())
                    {
                        out.print("<tr>");
                        out.print("<td>"+rst.getString(2) +"</td>");
                        out.print("<td>"+rst.getString(3) +"</td>");
                        String JID = String.valueOf(rst.getInt(1));
                        out.println("<td><a href='DeleteJob.jsp?ID="+JID+" '>Delete</a></td>");
                        out.print("</tr>");
                    }
                    out.print("</table>");
                    conn.close();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                     
                
            %>
          
          
        </div>
        
      </div>
      
    </div>
  </div>

            
             <br>

<input type="submit" class="button" data-toggle="modal" data-target="#myModalviewquery" value="VIEW QUERIES" id="btn_view_queries"/>
    
    <div class="modal fade" id="myModalviewquery" role="dialog">
    <div class="modal-dialog">
    
       Modal content
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title"><b>VIEW QUERIES</b></h4>
        </div>
        <div class="modal-body">
            <%
                try
                {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata"); 
                    PreparedStatement pst = conn.prepareStatement("select EMAIL, MESSAGE  from GET_IN_TOUCH ") ; 
                    ResultSet rst = pst.executeQuery();
                    out.print("<html><body>");
                    out.print("<table>");
                    out.print("<tr><td><b>EMAIL ID</b></td><td><b>QUERY</b></td></tr>");
                    while(rst.next())
                    {
                        out.print("<tr>");
                        out.print("<td>"+rst.getString(1) +"</td>");
                        out.print("<td>"+rst.getString(2) +"</td>");
                        out.print("</tr>");
                    }
                    out.print("</table>");
                    out.print("</body></html>");
                    conn.close();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                     
                
            %>
          
          
        </div>
        
      </div>
      
    </div>
  </div>


</center>
        
</body>
</html>
 
    
