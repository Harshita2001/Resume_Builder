<%@page import="java.sql.*"%>
<%@page import="java.io.*" %>

<%
try{

        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
        Statement stmt1=conn.createStatement(); 
        String job_id = request.getParameter("ID");
        int id_del = Integer.parseInt(job_id);
        int x=stmt1.executeUpdate("DELETE FROM JOB WHERE JOB_ID= "+id_del+" ");
        if(x>0)
        {
            out.println("<script type='text/javascript'> ");
            out.println("alert('Job Deleted Successfully!')"); 
            out.println(" window.location.href = 'admin.jsp'");
            out.println("</script>");
        }
        else
        {
            out.println("<script type='text/javascript'> ");
            out.println("alert('Kindly try again!!')"); 
            out.println(" window.location.href = 'admin.jsp'");
            out.println("</script>");
        }
            
        
        conn.close();
        
        

    
}
  catch(Exception ex){
          out.println(ex);
    }
%>     		 
            
    

