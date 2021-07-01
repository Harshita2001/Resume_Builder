
<%@page contentType="text/html" pageEncoding="UTF-8"%>  
<head>
  <script>
    history.pushState(null, null, null);
    window.addEventListener('popstate', function () {
        history.pushState(null, null, null);
    });
</script>  
<style>
     :root {
    --menu-width: 30em; /* Width of menu */
    --items: 3; /* Number of items you have */
  --item-width: calc(var(--menu-width) / var(--items));
}
nav {
    width: var(--menu-width);
    display:flex;                 
    flex-wrap: wrap;
    top: 3em;
    transform-style: preserve-3d;
    position: relative;
    z-index: 2;
    margin: 0px auto;
    perspective: 200px;
}
nav .menu-item {
    color: white;
    font-weight: 600;
    transform-style: preserve-3d;
    flex-grow: 1;
    display: flex;
    flex-basis: var(--item-width);
    box-sizing: border-box;
    padding: 1em 1em;
    justify-content: center;
    perspective: 200px;
    letter-spacing: 1px;
    min-height: 7.5em;
}

nav .menu-text, nav .menu-text a {    
                                       
                    
    color: white;
    text-decoration: none;
    text-shadow: 0 5px 5px rgba(0,0,0,0.2);
    transition: color 0.1s ease-out;
   
}

nav .menu-text a:hover {
    color: rgba(255,255,255,0.5);
}

#sub-menu-holder {
    pointer-events: none;
    color: rgba(0,0,0,0.5);
    font-weight: normal;
    padding: 1em;
    position: absolute;
    transition: opacity 2 ease-out;
    transform: rotateX(-25deg) scale(1);
    transform-origin: 50% 7em 0em;
    opacity: 0;
    box-shadow: 0 2px 7px rgba(0,0,0,0.1), 0 2px 20px rgba(0,0,0,0.3);
    box-sizing: border-box;
    top: 1rem;
    border-radius: 10px;
    background: white;
    display: block;
    width: calc(var(--menu-width) * 1.5);
}

#sub-menu-container {
    position:absolute;
    z-index: -1;
    min-width: 100%;
    top: 2.5em;
    width: 100%;
}

nav .menu-item:hover ~ #sub-menu-container #sub-menu-holder {
    animation: clipPath 0.25s ease-out 1 forwards;        
    transition: clip-path 0.25s ease-out, left 0.15s ease-out, height 0.15s ease-out;
    opacity: 1;
    right: auto;
}
nav .menu-item:nth-of-type(1):hover ~ #sub-menu-container #sub-menu-holder {
    clip-path: inset(0 28.75em 0 0 round 10px);
    height: 14em;
}


nav .menu-item:nth-of-type(1):hover ~ #sub-menu-container #sub-menu-holder {
    left: calc(-9em + -1px);
     height: 13.75em;
    width: 56em;}

/* submenu text */
.menu-item .sub-menu {
    position: absolute;
    top: 7em;
    color: grey;
    border-radius: 10px;
    min-width: 27.5em;
    pointer-events: none;
    box-sizing: border-box;
    z-index: 999;
    margin-left: -5em;
    clip-path: inset(0 10em 10em 15em);
    opacity: 0;
    padding: 1em;
    transition: all 0.25s ease-out, opacity 0.25s ease-in, margin-left 0.25s ease-out, clip-path 0.15s ease-out;
   }


.menu-item:hover .sub-menu {
    pointer-events: all;
    clip-path: inset(0 0 0 0);
}

.menu-text:after {
    transition: bottom 0.25s ease-out, opacity 0.01s ease-out 0.01s;
    opacity: 0;
    content: '';
    position: absolute;
    pointer-events: none;
    bottom: -2em;
    left: calc(38% - 10px);
    border-color: transparent transparent white transparent;
    border-width: 10px;
    border-style:solid;
    
    
    
}
.menu-item:hover .menu-text:after {
    bottom: 0.5em;
    opacity: 1;
    transition: bottom 0.25s ease-out, opacity 0.01s ease-out 0.15s;
}
.menu-item:hover .sub-menu {
    opacity: 1;
    margin-left: 0;
}

.menu-item:hover ~ #sub-menu-container #sub-menu-holder  {
    transition: transform 0.25s ease-out, opacity 0.25s ease-out, clip-path 0.25s ease-out;
}

@keyframes clipPath {
    0% {
        opacity: 0;
    }
    100% {
        transform: rotateX(0deg) scale(1);
        top: 4.5em;
        opacity: 1;        
    }
}

/* Menu specific */
.menu-item .title {
    font-weight: 500;
    color: rgb(44 70 86);
    margin: 0 0 0.25em 0;
}

.menu-item .icon-box * {
    transition: all 0.1s ease-out;
    position: relative;
}
.menu-item .icon-box.space {
    margin-bottom: 1.25em;
}
.menu-item .icon-box.flat {height: 1.5em;margin-bottom: 0.5em;}
.menu-item .icon, .menu-item .text {
    float: left;
 }

.menu-item .icon {
   
    font-size: 1.25em;
    margin: 0 1em 0 0;
}
.menu-item .icon-box {
    float: left;
    width: 100%;
    margin: 0;
    height: 4em;
    row-gap: 0;
    line-height: 1em;
        cursor: pointer;
}
.menu-item .icon-box:hover .text i {
    clip-path: inset(0 0 0 0);
    transition: clip-path 0.1s ease-out;
}

.menu-item .icon-box:hover .icon, .menu-item .icon-box:hover .title, .menu-item .icon-box:hover .sub-text {
    color: rgb(89 110 123);
}
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

/*arrow*/
.arrow {
  border: solid white;
  border-width: 0 3px 3px 0;
  display: inline-block;
  padding: 3px;
}.right {
  transform: rotate(-45deg);
  -webkit-transform: rotate(-45deg);
}
body {
  margin: 0;

 font-family: Arial, Helvetica, sans-serif;
}
.container {
  padding: 1px;}

.row:after {
  content: "";
  display: table;
  clear: both
}

.column-66 {
  float: left;
  position: sticky;
  width: 50%;
  letter-spacing:-4px;
  padding: 40px;
  color:#2b0c62;
  font-family:serif;
}
.column-33 {
    float: right;
  position:fixed;
  width: 50%;
padding: 10px;


}
.xlarge-font {
  font-size: 50px;
  text-shadow: 0 2px 5px rgba(0,0,0,0.2);
 }
/*.zoom {
  transition: transform .2s;}.zoom:hover {
  -ms-transform: scale(1.5); 
  -webkit-transform: scale(1.5);
  transform: scale(1.5);}*/


/*create resume button*/
.button {
      	display: inline-block;
  	border-radius: 100px;
  	transition: all .2s;
    border: none;
    outline: 0;
   color:  white;
  padding: 14px 28px;
  font-size: 16px;
  cursor: pointer;
  background-color:#f98b3e;
  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2),0 6px 20px 0 rgba(0,0,0,0.19);
}
.button:hover {
  	transform: translateY(-3px);
  	box-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);
}

.button:active {
  	transform: translateY(-1px);
  	box-shadow: 0 5px 10px rgba(0, 0, 0, 0.2);
}
img {
  display: block;
  height: auto;
  max-width: 100%;
}

@media screen and (max-width: 1000px) {
  .column-66,
  .column-33 {
    width: 100%;
    text-align: center;
  }
  img {
    margin: auto;
  }
}


</style>

<style>
    @import url(https://fonts.googleapis.com/css?family=Lato:900);
*, *:before, *:after{
  box-sizing:border-box;
}
body{
  font-family: 'Lato', sans-serif;
    ;
}
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
    
    
</style>
<style>
* {
  box-sizing: border-box;
}

.column {
 float: left;
  width: 30%;
  padding-left:100px;
  height: 200px;
}

/* Clearfix (clear floats) */
.row::after {
  content: "";
  clear: both;
  display: table;
  
}

/* Responsive layout - makes the three columns stack on top of each other instead of next to each other */
@media screen and (max-width: 500px) {
  .column {
    width: 100%;
  }
}
</style>

<style>
    
    
    /* Footer */
@import url('https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css');
section {
    padding: 60px 0;
    
}


#footer {
    height: 65vh;
    background-image: 
        linear-gradient(to right bottom,#0099cc,lightblue );
  
     clip-path: polygon(0 10vh, 100% 0, 100% 75vh, 0 100%);
     
}

#footer h5{
	padding-left: 10px;
    border-left: 3px solid #eeeeee;
    padding-bottom: 6px;
    margin-bottom: 20px;
    color:#2b0c62;
    font-family: serif;
    
}
#footer a {
    color:#2b0c62;
    text-decoration: none !important;
    background-color: transparent;
    -webkit-text-decoration-skip: objects;
}
#footer ul.social li{
	padding-left: 40px;
      
       
}

#footer ul.social li a i {
    margin-right: 5px;
	font-size:25px;
	-webkit-transition: .5s all ease;
	-moz-transition: .5s all ease;
	transition: .5s all ease;
}
#footer ul.social li:hover a i {
	font-size:30px;
	margin-top:-10px;
}
#footer ul.social li a,
#footer ul.quick-links li a{
	color:#ffffff;
        font-family: serif;
}
#footer ul.social li a:hover{
	color:#2b0c62;
}
#footer ul.quick-links li{
	padding: 3px 0;
	-webkit-transition: .5s all ease;
	-moz-transition: .5s all ease;
	transition: .5s all ease;
}
#footer ul.quick-links li:hover{
	padding: 3px 0;
	margin-left:5px;
	font-weight:700;
}
#footer ul.quick-links li a i{
	margin-right: 5px;
}
#footer ul.quick-links li:hover a i {
    font-weight: 700;
}

@media (max-width:767px){
	#footer h5 {
    padding-left: 0;
    border-left: transparent;
    padding-bottom: 0px;
    margin-bottom: 10px;
}
}

</style>

</head>

<style>
.accordion {
  background-color: #eee;
  margin-left: 300px;

  color:#2b0c62;
  cursor: pointer;
  padding: 18px;
  margin-bottom: 5px;
  width: 50%;
  border: none;
  text-align: center;
  outline: none;
  font-size: 15px;
  transition: 0.4s;
}

.active, .accordion:hover {
  background-color: #ccc;
}

.accordion:after {
  content: '\002B';
  color:#2b0c62;
 
  outline: none;
  font-weight: bold;
  float: right;
  margin-left: 5px;
}

.active:after {
  content: "\2212";
}

.panel {
    margin-left: 300px;
  padding: 0 18px;
  background-color: whitesmoke;
  font-family: serif;
  max-height: 0;
    margin-bottom: 5px;
  width: 50%;
  overflow: hidden;
  
  transition: max-height 0.2s ease-out;
}
</style>
<body>
    <div style="height: 100vh;
  	background-image: 
	  linear-gradient(to right bottom, 
     rgba(30, 210, 255, 0.6),
     rgba(30, 210, 200, 0.6)),
     url('bg.svg');
  	background-size: cover;
  	background-position: top;
  	position: relative;

  	clip-path: polygon(0 0, 100% 0, 100% 75vh, 0 100%);">   
<div id="navbar">
  
    <div class="foo">
    <span class="letter" data-letter="R">R</span><span class="letter" data-letter="B">B</span>
    <a href="" id="logo"></a>
    </div>
    <a href="profile.jsp" style="font-family:sans-serif;color:#2b0c62;padding-left: 30px;">ResumeBuilder</a>
 
    
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
                            <div class="title"> <a style="text-decoration:none;" href="build.jsp">Resume Builder</a></div>
                            <div class="sub-text">Create a stunning resume.</div>
                        </div>
                    </div>
                    <div class="icon-box">
                        <div class="icon"><i><img src="images/t3.webp" alt=""/></i></div>
                        
                        <div class="text">
                            <div class="title"><a href="template.jsp" style="text-decoration:none;">Resume Templates</a></div>
                            <div class="sub-text">Find the perfect resume template.</div>
                        </div>
                    </div>
                    <div class="icon-box">
                        <div class="icon"><i><img src="images/lp.webp" alt=""/></i></div>
                        
                        <div class="text">
                            <div class="title"><a href="build.jsp" style="text-decoration:none;">How to create resume?</a></div>
                            <div class="sub-text">See perfect resume samples.</div>
                        </div>
                    </div>
                  </div>
            </div>
            
            
                <div class="menu-text" style="margin-right:60px;margin-top: 15px;font-size:20px;">
                    <a href="about_us.jsp">About Us</a>
                </div>
                 <div class="menu-text" style="margin-right:50px;margin-top: 15px;font-size:20px;">
                    <a href="#">Contact Us</a>
                </div>
            
          
            <div id="sub-menu-container">
                <div id="sub-menu-holder">

                </div>
            </div>
        </nav>

   <!-- The first Section -->
<div class="container">
  <div class="row">
    <div class="column-66">
        <h1 class="xlarge-font">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbspCONTACT US<br></h1>
        <h1 style="font-family:serif;color:whitesmoke;font-size:22px;letter-spacing:0.5px; ">
            Let us know if you need any help
        <br>    Thanks for your interest in VisualCV. If you have a question regarding your VisualCV, please visit our <br>
        support.visualcv.com support forums.
    <br>To get in touch, use the emails listed below.</h1>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;<a href="contact.jsp"><button class="button"><b>CONTACT US&nbsp;&nbsp;<i class="arrow right"></i></b></button></a>
    </div>
     
    
  </div>
   

    
</div>
    </div>
    
    
           <div style=" float: right;
  position:absolute;
  z-index: 99;
  width: 50%;
top:40%;
left:48%;
">
          
               <img src="images/fr.webp"/>
      </div> 

    <br><br><br><br>
        
<div style="text-align:center;">
    <span class="xlarge-font" style=" color:#2b0c62;" >F.A.Q.</span>
    <h1 style="font-family:serif; color:#2b0c62;">Frequently Asked <span style="color:orange;">Questions</span></h1>
  </div>

<button class="accordion">Why do I need a resume?</button>
<div class="panel">
    <p>The purpose of a resume is to stimulate the interest of a potential employer enough to want to interview you. Resumes provide a brief overview of your skills and experience and demonstrate your aptitude for the job you are applying for. You might use a resume at job fairs and informational interviews, to answer job ads, to accompany a request for a letter of recommendation, and as part of a graduate school application.</p>
</div>

<button class="accordion">Must I include my GPA on my resume?</button>
<div class="panel">
    <p>As a student or recent graduate your academic achievement will be one of your most important assets. The basic rule of thumb is "if you've got it, flaunt it;" it is appropriate to include your GPA on your resume if it is 3.0 or above</p>
</div>

<button class="accordion">Do I need an objective on my resume?</button>
<div class="panel">
    <p>It is a good idea to include an objective on your resume so that a potential employer is clear about what you are looking for from the beginning. It's not required, but an objective is useful for focusing the resume and the reader.</p>
</div>
<button class="accordion">Can a resume be more than one page?</button>
<div class="panel">
    <p>Yes, a resume can be more than one page, but it shouldn't be unless you have extensive experience related to your job objective. Most resumes for college students and recent graduates should fit onto one page if you clearly and concisely describe your experiences.</p>
</div>

<script>
var acc = document.getElementsByClassName("accordion");
var i;

for (i = 0; i < acc.length; i++) {
  acc[i].addEventListener("click", function() {
    this.classList.toggle("active");
    var panel = this.nextElementSibling;
    if (panel.style.maxHeight) {
      panel.style.maxHeight = null;
    } else {
      panel.style.maxHeight = panel.scrollHeight + "px";
    } 
  });
}
</script>
   
   
    
 
    <!-- The third Section -->
<div class="container">
   
    <div class="column-66">
        
        
    </div>   </div>
    <br><br><br><br>
   
    
    

   <br><br><br><br><br>

<!-- Footer -->
	<section id="footer">
            <div class="container">
                <div class="row text-center text-xs-center text-sm-left text-md-left" style="display:flex;">
                            <div class="col-xs-12 col-sm-4 col-md-4" style="padding-left:150px;">
                                <h5 style="font-size:30px; color:#2b0c62;">Resume</h5>
                                <ul class="list-unstyled quick-links" style="list-style: none;
margin-left: 0;">
						<li><a href="build.jsp"><i class="fa fa-angle-double-right"></i>Resume Builder</a></li>
						<li><a href="showtemplate2.jsp"><i class="fa fa-angle-double-right"></i>Resume Templates</a></li>
						<li><a href="job_post.jsp"><i class="fa fa-angle-double-right"></i>Job Portal</a></li>
						<li><a href="build.jsp"><i class="fa fa-angle-double-right"></i>How to write a Resume</a></li>
						
					</ul>
				</div>
                            <div class="col-xs-12 col-sm-4 col-md-4" style="padding-left:200px;">
                                <h5 style="font-size:30px;">About Us</h5>
                                <ul class="list-unstyled quick-links" style="list-style: none;
margin-left: 0;">
						<li><a href="about_us.jsp"><i class="fa fa-angle-double-right"></i>Our Team</a></li>
						<li><a href="about_us.jsp"><i class="fa fa-angle-double-right"></i>Our Project</a></li>
					
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