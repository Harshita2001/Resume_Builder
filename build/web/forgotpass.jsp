
<%@ page import="java.util.Properties"%>
<%@ page import="javax.mail.*"%>
<%@ page import="javax.mail.internet.InternetAddress"%>
<%@ page import="javax.mail.internet.MimeMessage"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="javax.mail.Message.RecipientType"%>
<%@ page import="javax.mail.Transport"%>
<%
   
        
         Properties props= new Properties();
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port","465");
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.debug","true");
        props.put("mail.smtp.auth", "true");
          props.put("mail.smtp.port", "465");
          props.put("mail.smtp.socketFactory.fallback","false");
          try{ 
            String mail=request.getParameter("email");
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata"); 
            String query="select password from user1 where email LIKE '"+mail+"'";
            PreparedStatement pst = conn.prepareStatement(query) ; 
            ResultSet rst = pst.executeQuery();
            if(rst.next())
            {
                 String fetchedPassword=rst.getString("password");
                  Session mailSession = Session.getInstance(props, new javax.mail.Authenticator() {
        @Override
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication("anubhikansal4757@gmail.com","Tweetkr22@do22");
        }
    });
 
                  // Create a default MimeMessage object.
	   MimeMessage message = new MimeMessage(mailSession);
           message.setText("your password is "+fetchedPassword);
           message.setSubject("Password for your account");
	   message.setFrom(new InternetAddress("anubhikansal4757@gmail.com"));
	message.addRecipient(RecipientType.TO,new InternetAddress(mail));
           message.saveChanges();
	   Transport transport=mailSession.getTransport("smtp");
           transport.connect("smtp.gmail.com","anubhikansal4757@gmail.com","Tweetkr22@do22");
           transport.sendMessage(message,message.getAllRecipients());
           transport.close();
           out.print("<script>alert('Password is sent! Please Login again!')</script>");
             // response.sendRedirect("login_page.jsp");
            } 
              
          
          }catch(Exception e){
              e.printStackTrace();
              out.print("<script>alert('email not found!')</script>");
           
          
          } 
          
                                            

    
                      

%>