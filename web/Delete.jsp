
<%@page import="java.sql.*"%>
<%@page import="java.io.*" %>

<%
try{

        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
        Statement stmt1=conn.createStatement();
        String nm = request.getParameter("NAME");
        out.println(nm);
        int x=stmt1.executeUpdate("DELETE FROM TEMPLATE WHERE NAME= '"+nm+"' ");
        out.println(x);
        if(x>0)
           { out.println("<script type='text/javascript'> ");
           
            out.println("alert('Template deleted successfully!!')"); 
            out.println(" window.location.href = 'admin.jsp'");
            out.println("</script>");
           }
           else
           {
               out.println("<script type='text/javascript'> ");
            out.println("alert('Please try again!!')"); 
            out.println(" window.location.href = 'admin.jsp'");
            out.println("</script>");
           }

    
}
  catch(Exception ex){
          out.println(ex);
    }
%>     		 
            
    

