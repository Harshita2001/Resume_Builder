
<%@page import="java.net.URL"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*" %>

<%
try{

        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
        Statement stmt1=conn.createStatement();
        String nm = request.getParameter("NAME");
        ResultSet rs=stmt1.executeQuery("SELECT FILE FROM TEMPLATE WHERE NAME='"+nm+"' ");
        if(rs.next()==true)
        {
            String x = rs.getString(1);
            String site = new String(x);
            response.setStatus(response.SC_MOVED_TEMPORARILY);
            response.setHeader("Location", site); 

        }
        
        
           
//        conn.close();
        
        

    
}
  catch(Exception ex){
          out.println(ex);
    }
%>     		 
            
    

