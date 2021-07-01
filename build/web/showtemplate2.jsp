<%-- 
    Document   : ViewSample
    Created on : 21 Apr, 2021, 10:59:58 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>VIEW SAMPLE RESUMES</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <style>

/*        body {
            background-image: url('bv.svg');
            background-repeat: no-repeat;
        }*/
        .bg
        {
            background-color: whitesmoke;
        }
        #example1 {
            
            background: url(Resumebg.jpeg);
            background-repeat: no-repeat;
            height: 100%;
            position: relative;
            overflow: hidden;
          }
        h1 {
            font-size: 2.0rem;
            text-align: center;
            font-weight: 700;
            font-family: "Euclid Circular B", sans-serif;
        }
        h1::before,
        h1::after {
            display: inline-block;
            content: "";
            border-top: .3rem solid black;
            width: 4rem;
            margin: 0 1rem;
            transform: translateY(-0.3rem);
        } 
        span {
            background-color: #ffffff;
        }
        h2{
            font-size: 1.4rem;
            text-align: center;
            box-sizing: border-box;
            position: relative;
            font-weight: 700;
            font-family: "Euclid Circular B", sans-serif;
        }
        p
        {
            color: white;
            font-family: "Lucida Console", "Courier New", monospace;
            margin-left: 1em;
            line-height: 1.6;
            font-size: 1.8em;
            display: flex;
            justify-content: center;
        }
        carousel 
        {	
/*	margin: 0 auto;
	padding: 0 100px;
        width: 100%;*/
        
            margin: 50px;
            /*padding: 0 100px;*/
            width: 100%;
            horizontal-align:middle;
        }
        carousel carousel-item {
                text-align: center;
                overflow: hidden;
                height: auto;
        }
        carousel carousel-item img-box {
                background: #fff;
                padding: 40px;
                box-shadow: 0 6px 20px -6px rgba(0,0,0,0.4);
                display: block;
                width: 100%;
        /*        margin-right: 30px;*/
        }
        carousel carousel-item img {
                margin: 0 auto;
        }
        carousel-control-prev, carousel-control-next {
                width: 0px;
                /*background-color: yellow;*/
        }
        .carousel-control-prev i {
                background: #FFF;
            border: none;
            border-radius: 100em;
            width: 50px;
            height: 50px;
            box-shadow: 0px 3px 6px rgb(0 0 0 / 16%);
            position: absolute;
            top: 50%;
            margin-top: -32px;
            font-size: 18px;
            display: flex;
            align-items: center;
            justify-content: center;
            color: black;
            margin-left: -2px;
        }

        .carousel-control-next i {
            background: #FFF;
            border: none;
            border-radius: 100em;
            width: 50px;
            height: 50px;
            box-shadow: 0px 3px 6px rgb(0 0 0 / 16%);
            position: absolute;
            top: 50%;
            margin-top: -32px;
            font-size: 18px;
            display: flex;
            align-items: center;
            justify-content: center;
            color: black;
            margin-right: -2px;

        }

        .carousel-control-next i:hover
        {
            color: #ffffff;
            background: #f0ae12;
            height: 50px;
            width: 50px;
        }

        .carousel-control-prev i:hover
        {
            color: #ffffff;
            background: #f0ae12;
            height: 50px;
            width: 50px;
        }
        .carousel-indicators {
                bottom: -40px;
        }
        .carousel-indicators li, .carousel-indicators li.active {
                width: 10px;
                height: 10px;
                border: none;
                border-radius: 50%;
                margin: 1px 4px;
                box-shadow: inset 0 2px 1px rgba(0,0,0,2.0);
        }
        .carousel-indicators li 
        {	
                background: #999;
                border-color: transparent;
        }
        .carousel-indicators li.active {
                background: #555;
        }
        h4 {
	color: #696969;
	font-size: 40px;
	font-weight: 300;
	text-align: center;
	position: relative;
	/*margin: 40px 70px;*/
	/*text-transform: uppercase;*/
	font-family: 'Open Sans', sans-serif;
        color: #f0ae12;
        
        }

        </style>
    </head>
    <body>
<!--        <div style="height: 100vh;
  	background-image: 
	  linear-gradient(to right bottom, 
     rgba(76, 210, 255, 0.6),
     rgba(30, 100, 200, 0.6)),
     url('bg.svg');
  	background-size: cover;
  	background-position: top;
  	position: relative;

  	clip-path: polygon(0 0, 100% 0, 100% 100vh, 0 100%);"> 
       
            <br/>
        <h1><span>Resume Examples with Pre-filled Content for your Profile</span></h1>
        <h2><span>Start your journey towards a successful career!</span></h2>
                
        <br/>
        <br/>
        <br/>
        <table>
            <tr>
                <td>
                    <p>When it comes to getting a job, your resume is your calling card: 
        a strong resume will get you through the door, and a weak one can result in a lost opportunity. 
        To create a compelling resume, you need to have a well-organized, easy-to-read document, 
        showcasing your most marketable, relevant talents and accomplishments.</p>
                </td>
                <td style="width: 50%;">
                    <img src="images/vv.webp" style="padding:50px;">
                </td>
            </tr>
        </table>
        
        </div>-->
        <br/>
<!--        <h2 style="font-size: 2em; color: #009f78;">Resume Samples for Your 2021 Job Application</h2><br/>
        -->
        <div class="bg">
        <br/>
<div class="container-xl">
	<div class="row">
		<div class="col-md-9  mx-auto">
                    <!--<h3> <b>Recruiters love lucidity of data</b></h3>-->
                    <h4> <b>Recruiters love lucidity of data</b></h4><br/>
			<div id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="0">
				<!-- Carousel indicators -->
				<ol class="carousel-indicators">
					<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
					<li data-target="#myCarousel" data-slide-to="1"></li>
                                        <li data-target="#myCarousel" data-slide-to="2"></li>
                                        <li data-target="#myCarousel" data-slide-to="3"></li>
                                        <li data-target="#myCarousel" data-slide-to="4"></li>
					<li data-target="#myCarousel" data-slide-to="5"></li>
                                        <li data-target="#myCarousel" data-slide-to="6"></li>
                                        <li data-target="#myCarousel" data-slide-to="7"></li>
			
                                        
				</ol>   
				<!-- Wrapper for carousel items -->
				<div class="carousel-inner">
					<div class="carousel-item active">
						<div class="row">
							<div class="col-sm-6" style="left: 25%"><div class="img-box"><img src="Resume1.png" class="img-fluid" alt=""></div></div>
							 <!--<div class="col-sm-6"><div class="img-box"><img src="Resume2.png" class="img-fluid" alt=""></div></div>-->
							 
						</div>
					</div>
					<div class="carousel-item">
						<div class="row">
                                                        <div class="col-sm-6" style="left: 25%"><div class="img-box"><img src="Resume2.png" class="img-fluid" alt=""></div></div>
							<!--<div class="col-sm-6"><div class="img-box"><img src="Resume4.png" class="img-fluid" alt=""></div></div>-->
							
						</div>
					</div>
                                        <div class="carousel-item">
						<div class="row">
                                                        <div class="col-sm-6" style="left: 25%"><div class="img-box"><img src="Resume3.png" class="img-fluid" alt=""></div></div>
							<!--<div class="col-sm-6"><div class="img-box"><img src="Resume5.png" class="img-fluid" alt=""></div></div>-->
							
						</div>
					</div>
                                         <div class="carousel-item">
						<div class="row">
                                                        <div class="col-sm-6" style="left: 25%"><div class="img-box"><img src="Resume4.png" class="img-fluid" alt=""></div></div>
							 <!--<div class="col-sm-6"><div class="img-box"><img src="Resume8.png" class="img-fluid" alt=""></div></div>-->
							
						</div>
					</div>
                                        <div class="carousel-item">
						<div class="row">
							<div class="col-sm-6" style="left: 25%"><div class="img-box"><img src="Resume5.png" class="img-fluid" alt=""></div></div>
							 <!--<div class="col-sm-6"><div class="img-box"><img src="Resume2.png" class="img-fluid" alt=""></div></div>-->
							 
						</div>
					</div>
                                        <div class="carousel-item">
						<div class="row">
							<div class="col-sm-6" style="left: 25%"><div class="img-box"><img src="Resume6.png" class="img-fluid" alt=""></div></div>
							 <!--<div class="col-sm-6"><div class="img-box"><img src="Resume2.png" class="img-fluid" alt=""></div></div>-->
							 
						</div>
					</div>
                                        <div class="carousel-item">
						<div class="row">
							<div class="col-sm-6" style="left: 25%"><div class="img-box"><img src="Resume7.png" class="img-fluid" alt=""></div></div>
							 <!--<div class="col-sm-6"><div class="img-box"><img src="Resume2.png" class="img-fluid" alt=""></div></div>-->
							 
						</div>
					</div>
                                        <div class="carousel-item">
						<div class="row">
							<div class="col-sm-6" style="left: 25%"><div class="img-box"><img src="Resume8.png" class="img-fluid" alt=""></div></div>
							 <!--<div class="col-sm-6"><div class="img-box"><img src="Resume2.png" class="img-fluid" alt=""></div></div>-->
							 
						</div>
					</div>
                                     
					
				</div>
				<!-- Carousel controls -->
				<a class="carousel-control-prev" href="#myCarousel" data-slide="prev">
					<i class="fa fa-chevron-left"></i>
				</a>
				<a class="carousel-control-next" href="#myCarousel" data-slide="next">
					<i class="fa fa-chevron-right"></i>
				</a>
			</div>
		</div>
	</div>
</div>
        <br/>
        <br/>
        </div>
        

    </body>
</html>


