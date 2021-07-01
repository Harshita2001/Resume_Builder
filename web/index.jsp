


<%@page import="com.project.helper.ConnectionProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
       
 
 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <link href="homepage.css" rel="stylesheet" type="text/css"/>
      
    </head>
    <body>
    
<div style="height: 100vh;background-image: 
	  linear-gradient(to right bottom, 
     rgba(30, 210, 255, 0.6),
     rgba(30, 210, 200, 0.6)),url('images/w.jpeg');background-size: cover;background-position: top;
     position: relative;clip-path: polygon(0 0, 100% 0, 100% 75vh, 0 100%);">   

        <!--navigation bar start-->
        <div id="navbar">
     <!--logo-->
    <div class="foo">
    <span class="letter" data-letter="R">R</span><span class="letter" data-letter="B">B</span>
    <a href="" id="logo"></a>
    </div> 
     <a href="#" style="font-family:sans-serif;color:#2b0c62;padding-left: 30px;">ResumeBuilder</a>
 
    <div style="float:right; margin-top: -49px;"> <a class="dropbtn" href="login_page.jsp" style="outline: none; border-color: white; border-style:solid;border-radius: 3px;color:  white;font-size: 20px;
     margin-right: 20px;
 padding: 10px 10px; cursor: pointer;">LOG IN</a> <a href="register_page.jsp" style="border-color: green; border-style:solid;border-radius: 3px;color:  white;font-size: 20px; box-shadow: inset 0 3px 5px 0 rgba(0, 0, 0, 0.2);
margin-right:60px;padding: 10px 10px; cursor: pointer;">SIGN UP</a>
    </div>
        
        </div>
        <nav id="menu">
            <div class="menu-item">
                <div class="menu-text" style="font-size:20px;">
                    <a href="#">Resume</a>
                </div>
                <div class="sub-menu">
                    <div class="icon-box">
                        <div class="icon"><i> <img src="images/t2.webp" alt=""/></i></div>
                       
                        <div class="text">
                            <div class="title"> <a style="text-decoration:none;" href="#">Resume Builder</a></div>
                            <div class="sub-text">Create a stunning resume.</div>
                        </div>
                    </div>
                    <div class="icon-box">
                        <div class="icon"><i><img src="images/t3.webp" alt=""/></i></div>
                        
                        <div class="text">
                            <div class="title"><a href="showtemplate2.jsp" style="text-decoration:none;">Resume Templates</a></div>
                            <div class="sub-text">Find the perfect resume template.</div>
                        </div>
                    </div>
                    <div class="icon-box">
                        <div class="icon"><i><img src="images/lp.webp" alt=""/></i></div>
                        
                        <div class="text">
                            <div class="title"><a href="#" style="text-decoration:none;">How to create resume?</a></div>
                            <div class="sub-text">See perfect resume samples.</div>
                        </div>
                    </div>
                  </div>
            </div>
             
             <div class="menu-text" style="margin-right:75px;margin-top: 15px;font-size:20px;">
                    <a href="about_us.jsp">About Us</a>
                </div>
                
                 <div class="menu-text" style="margin-right:20px;margin-top: 15px;font-size:20px;">
                    <a href="contactUs.jsp">Contact Us</a>
                </div>
           <div id="sub-menu-container">
                <div id="sub-menu-holder">

                </div>
            </div>
           
        </nav>
<!--navigation bar ends-->
   <!-- The first Section -->
<div class="container">
  <div class="row">
    <div class="column-66">
        <h1 class="xlarge-font">Get Your Resume To<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; The <span style="  text-shadow: 0 2px 5px rgba(0,0,0,0.7);">Top</span>
                <br>Of The Pile with Our<br>&nbsp;&nbsp;&nbsp;&nbsp;Resume Maker</h1>
        <h1 style="font-family:Times new roman;color:whitesmoke;font-size:22px;letter-spacing:0.5px; ">Create your professional resume in 15 minutes</h1>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;<a href="build.jsp"><button class="button"><b>CREATE RESUME&nbsp;&nbsp;<i class="arrow right"></i></b></button></a>
    </div>
     
    
  </div>
   

    
</div>
    </div>
    
    
           <div style=" float: right;
  position:absolute;
  z-index: 99;
  width: 50%;
top:20%;
left:48%;
//box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2),0 6px 20px 0 rgba(0,0,0,0.19);
">
          
               <img src="images/fr.webp"/>
      </div> 

    <br><br><br><br>
    <div style="position:absolute;
  	top: 125%;
        opacity: 3;
        font-family:serif;
  	left: 50%;
    	transform: translate(-50%, -50%);
  	text-align: center;
        color:#2b0c62;
          font-size: 30px;">
        Getting a job today requires a great resume that is customized for each job you apply to.It’s one of the best ways to show your value to employers. Our Resume Builder makes it easy to do just that — in no time!     
  
    </div>
   
    <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
    
    
    
    

    <div class="container" style="background:whitesmoke; ">
 
   <div style="text-align:center; padding-top: 90px;
        clip-path: polygon(0 20vh, 100% 0, 100% 75vh, 0 100%);height: 120vh;
        padding-left: 20px;
  	background-image: 
	  linear-gradient(to right bottom,#0099cc,lightblue );">
     <h1 class="xlarge-font" style="  color:#2b0c62;
  font-family:serif;"><b>Create your resume in just 3 steps.</b></h1>
  <div>
<div style="float: left;
     margin-top: -40px;
width: 30%;
//box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2),0 6px 20px 0 rgba(0,0,0,0.19);
padding: 50px;">
<img src="images/vv.webp" >
<p style="color:white; "><span style="color:orange;">1.</span>&nbsp;&nbsp;Select Your Winning Template</p>
</div>
     <div style="float: left;
width: 30%;
 margin-top: -40px;
padding: 30px;">
<img src="images/lop.webp">
<p style="color:white;"><span style="color:orange; ">2.</span>&nbsp;&nbsp;Enter Your Details Correctly</p>
</div>
<div style="float: left;
width: 30%;
 margin-top: -60px;
padding: 50px;">
<img src="images/96.webp" >
<p style="color:white; "><span style="color:orange; ">3.</span>&nbsp;&nbsp;Download Your Resume</p>
</div>
   </div>
   </div>
  </div>   
    <!-- The third Section -->
<div class="container">
   
    <div class="column-66">
        
        
    </div>   </div>
    <br><br><br><br>
   <!-- The third Section -->
    <div class="container" style="background:url(images/98.webp) no-repeat;">
  <div class="row">
    <div class="column-66">
        <h1 class="xlarge-font" style="text-align:center; margin-top: 80px;"><b>The Right Resume Templates For The Job</b></h1>
     
        <p style="text-align: center;
        color:gray;
          font-size: 30px;
          
          letter-spacing: 1.4px;">Choose from a library of classic templates that have landed thousands of people new jobs.</p>
        <a href="showtemplate2.jsp"><button class="button" style="margin-left:170px;">VIEW TEMPLATES</button></a>
    </div>
  </div>
        <br><br><br><br><br><br><br><br><br>
</div>
    
    
   <!-- The third Section -->
    <div class="container" style="background:url(images/cv.webp) no-repeat right">
         <br><br><br>
  <div class="row">
    <div class="column-66">
      <h1 class="xlarge-font"  style="text-align:center; margin-top: 80px;"><b>Apply now and Earn money</b></h1>
     
      <p style="text-align: center;
        color:gray;
          font-size: 25px;
          
          letter-spacing: 1.4px">One job portal that showcases thousands of jobs various job sectors from all the states and major cities in India.  Find the right job that matches your profile and skillset. <br/>Please Login to Register Now!
          </p>
     
         
    </div>
  </div>
        
</div>
   <br><br><br><br><br><br><br><br><br>
   
<!-- Footer -->
	<section id="footer">
            <div class="container">
                <div class="row text-center text-xs-center text-sm-left text-md-left" style="display:flex;">
                            <div class="col-xs-12 col-sm-4 col-md-4" style="padding-left:150px;">
                                <h5 style="font-size:30px; color:#2b0c62;">Resume</h5>
                                <ul class="list-unstyled quick-links" style="list-style: none;
margin-left: 0;">
						<li><a href="#"><i class="fa fa-angle-double-right"></i>Resume Builder</a></li>
						<li><a href="showtemplate2.jsp"><i class="fa fa-angle-double-right"></i>Resume Templates</a></li>
						<li><a href="#"><i class="fa fa-angle-double-right"></i>Job Portal</a></li>
						<li><a href="#"><i class="fa fa-angle-double-right"></i>How to write a Resume</a></li>
						
					</ul>
				</div>
                            <div class="col-xs-12 col-sm-4 col-md-4" style="padding-left:200px;">
                                <h5 style="font-size:30px;">About Us</h5>
                                <ul class="list-unstyled quick-links" style="list-style: none;
margin-left: 0;">
						<li><a href="about_us.jsp"><i class="fa fa-angle-double-right"></i>Our Team</a></li>
						<li><a href="profile.jsp"><i class="fa fa-angle-double-right"></i>Our Project</a></li>
					
					</ul>
				</div>
				<div class="col-xs-12 col-sm-4 col-md-4" style="padding-left:250px;">
                                    <h5 style="font-size:30px;"> Contact Us</h5>
                                    <ul class="list-unstyled quick-links" style="list-style: none;
margin-left: 0;">
						<li><a href="contactUs.jsp"><i class="fa fa-angle-double-right"></i>FAQ</a></li>
						<li><a href=""><i class="fa fa-angle-double-right"></i>+0097533****</a></li>
				
		
					</ul>
				</div>
			</div>
                <div class="row">
                    <div class="col-xs-12 col-sm-12 col-md-12 mt-2 mt-sm-5">
                        <ul class="list-unstyled list-inline social text-center" style="display:flex; list-style: none;
margin-left: 0; padding-left: 400px;"  >
						<li><a href=""><i class="fa fa-facebook"></i></a></li>
						<li><a href=""><i class="fa fa-twitter"></i></a></li>
						<li><a href=""><i class="fa fa-instagram"></i></a></li>
						<li ><a href=""><i class="fa fa-google-plus"></i></a></li>
                                                <li ><a href="" target="_blank"><i class="fa fa-envelope"></i></a></li>
					</ul>
				</div>
				<hr>
			</div>	
			<div class="row">
				<div >
			
                                    <p class="h6" style="text-align:center; color:#2b0c62;">© All right Reversed. &nbsp;&nbsp;<a class="text-green ml-2" href="" target="_blank">Banasthali Vidyapith</a></p>
				</div>
				<hr>
			</div>	
		</div>
	</section>
	<!-- ./Footer -->   
   
   
   
</body>
    </body>
</html>