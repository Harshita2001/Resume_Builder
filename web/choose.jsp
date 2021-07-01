<%-- 
    Document   : ChooseTemplate
    Created on : 28 Apr, 2021, 11:14:08 PM
    Author     : User
--%>


<%@page import="java.sql.*"%>
<%@page import="java.io.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
    Statement stmt1=conn.createStatement();
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CHOOSE TEMPLATE</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        
        <style>
           .top-container {
    grid-area: 1 / -3 / 1 / 3;
    margin: 0 0 2em 0;

}
nav .menu-item.highlight:hover ~ #sub-menu-container #sub-menu-holder { opacity: 1; }
#navbar {
 
  padding: 20px 10px;
  position: absolute;
  width: 100%;
  }

#navbar a {
  float:left;
  text-decoration: none;}

#navbar #logo {
 padding: 20px;} 
        iframe
        {
            width: 800px;
            height: 100%;
            resize: both;
        }
        h1 {
            text-align: center;
            text-transform: uppercase;
            color: black;
        }
        h2{
            font-size: 1.4rem;
            text-align: center;
            box-sizing: border-box;
            position: relative;
            font-weight: 700;
            font-family: "Euclid Circular B", sans-serif;
        }
        button 
        {
            background-color: #4CAF50;
            border: none;
            color: white;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            cursor: pointer;
            border-radius: 12px;
            align-items: center;
            align-self: center;
            height: 40px;
            width: 250px;
            background-color: white;
            color: black;
            border: 2px solid #e7e7e7;
            
        }

        button:hover 
        {
            background-color: #4CAF50;
            box-shadow: 0 12px 16px 0 rgba(0,0,0,1.0), 0 17px 50px 0 rgba(0,0,0,1.0);
        }
        .split 
        {
            height: 100%;
            width: 50%;
            position: absolute;
            z-index: 1;
            /*top: 0;*/
            overflow-x: hidden;
            /*padding-top: 20px;*/
        }

        .left 
        {
            left: 0;
        }
        .right 
        {
            right: 0;
        }
        .centered 
        {
            position: absolute;
            top: 35%;
            left: 50%;
            transform: translate(-50%, -50%);
            text-align: center;
        }
        </style>
        
        <style>
            div.foo{
  width: 100%;
  margin: 0 auto;
  text-align: left;
}
.letter{
   letter-spacing: 1px;
   font-weight: 900;
  font-size: 4em;
  margin: 0.0em;
  position: relative;
  color:#3b5998;
  transform-style: preserve-3d;
  perspective: 800;
  z-index: 1;
}
.letter:before, .letter:after{
  position:absolute;
  content: attr(data-letter);
  transform-origin: top left;
  top:0;
  left:0;
}
.letter, .letter:before, .letter:after{
  transition: all 0.3s ease-in-out;
}
.letter:before{
  color: #fff;
  text-shadow: 
    -1px 0px 1px rgba(255,255,255,.8),
    1px 0px 1px rgba(0,0,0,.8);
  z-index: 3;
  transform:
    rotateX(0deg)
    rotateY(-15deg)
    rotateZ(0deg);
}
.letter:after{
  color: rgba(0,0,0,.11);
  z-index:2;
  transform:
    scale(1.08,1)
    rotateX(0deg)
    rotateY(0deg)
    rotateZ(0deg)
    skew(0deg,1deg);
}
.letter:hover:before{
  color: #fafafa;
  transform:
    rotateX(0deg)
    rotateY(-40deg)
    rotateZ(0deg);
}
.letter:hover:after{
  transform:
    scale(1.08,1)
    rotateX(0deg)
    rotateY(40deg)
    rotateZ(0deg)
    skew(0deg,22deg);
}  
* {
  box-sizing: border-box;
}
.column {
 float: left;
  width: 30%;
  padding-left:100px;
  height: 200px;
}



        </style>
    </head>
    <body>
      
   
        
        <div style="height: 150vh;
  	background-image: 
	  linear-gradient(to right bottom, 
     rgba(76, 210, 255, 0.6),
     rgba(30, 100, 200, 0.6)),
     url('bg.svg');
  	background-size: cover;
  	background-position: top;
  	position: relative;

  	clip-path: polygon(0 0, 100% 0, 100% 150vh, 0 100%);"> 
           
              <div class="foo">
    <span class="letter" data-letter="R">R</span><span class="letter" data-letter="B">B</span>
     <a href="profile.jsp" style="font-family:sans-serif;color:#2b0c62;padding-left: 10px;">ResumeBuilder</a>
 
     <h1>Select Resume Template</h1>
            <h2>Choose a template that suits your profile!</h2>
          
              </div> 
   
            
            
            <div class="split left">
            <div class="centered">

            
            <%        
                try
                {
                    String query1="Select NAME, FILE from TEMPLATE" ;
                    ResultSet rs=stmt1.executeQuery(query1);
                    while(rs.next())
                    {
                        String s = rs.getString("NAME");
                        String link = rs.getString("FILE");
                        out.print("<center>");
                        out.print( "<button class='button' id="+link+"  >"+s+"</button><br/>" );  
                        out.print("<br/></center>");
                    }
                }
                catch(Exception ex)
                {
                    ex.printStackTrace();
                }                  
            %>
            
             </div>
            </div>
            
            <div class="split right">
            <div class="centered">
            <iframe class="frm" style="width:700px; height:800px;"   src=""></iframe> 
            <a type='button' id="" href="" target='_blank' class='btn_temp btn btn-danger use' >Use this template</a>
            <!--<button>USE THIS TEMPLATE</button>-->
              <br/><br/><br/>  
            </div>
            </div>
          <br/><br/><br/>
            
            
        </div>
            <br/><br/><br/>
        <script>
                        
                        $(document).ready(function(){
                            $('.button').click(function(){
                                var id = $(this).attr('id');
                                $('#show-data').html(id);
                                $(".frm").attr('src',id);
                                $(".btn_temp").attr('href',id);
                                   $(".btn_temp").attr('id',id);
        $(".result").attr('id',id);
                                 $("a#manual").on("click", function(){
         $.post(id, function(data){

    $("#myModalDiv").html(data).fadeIn();

});
        

    });
                                });
  
                                    });
                                    
                           
                    </script>
    </body>
</html>


