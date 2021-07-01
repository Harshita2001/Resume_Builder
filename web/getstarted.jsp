<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script type = "text/javascript" >  
    function preventBack() { window.history.forward(); }  
    setTimeout("preventBack()", 0);  
    window.onunload = function () { null };  
</script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login Paqe</title>

        <!--css-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            .banner-background{
                
                height: 100vh;
      background-image: 
          
	 linear-gradient(to right bottom, 
     rgba(30, 210, 255, 0.6),
     rgba(30, 210, 200, 0.8)),url(images/b.jpg);background-size: cover;background-position: top;
                   clip-path: ellipse(800px 800px at 30% 50%);
            }
               .primary-background{
                
                   background-color:#00bcd4;
     
               }
        </style>

    </head>
    <body>

      

        <main class=" primary-background banner-background" 
              <br><br><br>
           
            &nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; 
            <a class="navbar-brand" href="#" style=" margin-left: -40px; margin-top:-40px;color: whitesmoke; font-size: 60px; text-shadow: 0 5px 5px rgba(0,0,0,0.5);"><span><b>RB</b></span></a>
         <br/><a class="navbar-brand" href="login_page.jsp" style=" margin-left: 10px; margin-top:-40px;color: whitesmoke; font-size: 20px; text-shadow: 0 5px 5px rgba(0,0,0,0.5);"><span><b>Login as User?</b></span></a>
           
            <br>
            <div class="container">
                <div class="row">
                    <div class="col-md-4 offset-md-3">

                        <div class="card">
                            <div class="card-header primary-background text-white text-center">
                                <span class="fa fa-user-plus fa-3x"></span>
                                <br>
                                <p>Login here</p>
                            </div>

                       <div class="card-body">
                                <form id="fm" method="post">
                                    <div class="form-group">
                                        <label for="exampleInputEmail1">Email address</label>
                                        <input name="email" id="email" required type="email" class="form-control" aria-describedby="emailHelp" placeholder="Enter email">
                                        <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                                    </div>
                                    
                                    <div class="form-group">
                                        <label for="exampleInputPassword1">Password</label>
                                        <input name="password" id="password" required type="password" class="form-control" placeholder="Password">
                                    </div>
                                    
             
                                   
                                    <div class="container text-center">
         <input type="submit" name="btn_submit" id="btn_submit" value="Submit" class="third button-primary float-right" />
   </div>
                                </form>

                            </div>


                        </div>



                    </div>


                </div>

            </div>

        </main>
 



        <!--javascripts-->
        <script
            src="https://code.jquery.com/jquery-3.4.1.min.js"
            integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="js/myjs.js" type="text/javascript"></script>

    </body>
</html>

<%       
    try
    {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
        PreparedStatement pst ;
        ResultSet rst;
         String mail=request.getParameter("email");
            String pass = request.getParameter("password");
        if(request.getParameter("btn_submit")!=null)    
        {   
            pst=conn.prepareStatement("select * from LOGIN_INFO");
            rst=pst.executeQuery(); 
            out.print(mail);
                out.print(pass);
               if(rst.next()==true){
                     out.print(rst.getString(1));
               out.print(rst.getString(2));
               
            if(mail.equals(rst.getString(1)) && pass.equals(rst.getString(2)))
            {
                
               response.sendRedirect("admin.jsp");
                
            }

            else
            {
                out.print("<script>alert('INVALID DETAILS!')</script>");
                 
            }
                }
            
          
        }
            
    }
    catch(Exception exec) 
    {
        exec.printStackTrace();
    }
            
   
%>



