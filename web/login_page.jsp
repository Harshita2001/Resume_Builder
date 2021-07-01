
<%@page import="com.project.entity.Message"%>
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
        <title>Login Paqe</title>

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

       <main class=" primary-background banner-background"> <br><br><br>
           
            &nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; 
            <a class="navbar-brand" href="index.jsp" style=" margin-left: -40px; margin-top:-40px;color: whitesmoke; font-size: 60px; text-shadow: 0 5px 5px rgba(0,0,0,0.5);"><span><b>RB</b></span></a>
            <br/><a class="navbar-brand" href="getstarted.jsp" style=" margin-left: 10px; margin-top:-40px;color: whitesmoke; font-size: 20px; text-shadow: 0 5px 5px rgba(0,0,0,0.5);"><span><b>Login as Admin?</b></span></a>
          
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

                            <%
                                Message m = (Message) session.getAttribute("msg");
                                if (m != null) {
                            %>
                            <div class="alert <%= m.getCssClass() %>" role="alert">
                                <%= m.getContent() %>
                            </div> 


                            <%        
                                    session.removeAttribute("msg");
                                }
                            %>



                            <div class="card-body">
                                <form action="LoginServlet" method="post">
                                    <div class="form-group">
                                        <label for="exampleInputEmail1">Email address</label>
                                        <input name="email" required type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                                        <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                                    </div>
                                    
                                    <div class="form-group">
                                        <label for="exampleInputPassword1">Password</label>
                                        <input name="password" required type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                                    </div>
                                    
             
                                    <a href="forgot.jsp" id="fps" style="float:right;">Forgot Password?</a>
                                    <br><br>
                                    <div class="container text-center">
                                        <button type="submit" class="btn btn-primary" style="background-color:#00bcd4;">Submit</button>
                                    </div>
                                </form>

                            </div>


                        </div>



                    </div>


                </div>

            </div>

        </main>
 <script>
           
                    $.ajax({
                        url: "Forgotpass",
                        type: 'POST',
                        data: form,
                        success: function (data, textStatus, jqXHR) {
                            console.log(data)
                            $("#fps").show();
                            if (data.trim() === 'done')
                            {
                                swal("Password changed!")
                                        .then((value) => {
                                            window.location = "index.jsp"
                                        });
                            } else
                            {
                                swal(data);
                            }
                        },
                        error: function (jqXHR, textStatus, errorThrown) {
                            $("#fps").show();
                            swal("something went wrong..try again");
                        },
                        processData: false,
                        contentType: false
                    });
                });
            
        </script>



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




