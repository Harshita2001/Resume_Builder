<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@10.10.1/dist/sweetalert2.all.min.js"></script>
        <link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/sweetalert2@10.10.1/dist/sweetalert2.min.css'>
<script src="alert/dist/sweetalert-dev.js"></script>
  <link rel="stylesheet" href="alert/dist/sweetalert.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
      <script src="https://cdn.tiny.cloud/1/6x7zn6obtay5y18ual7htiku4v793qherw3ko7awq7p8onq7/tinymce/5/tinymce.min.js" referrerpolicy="origin"></script>
    <script src="https://kit.fontawesome.com/yourcode.js" crossorigin="anonymous"></script>
 <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
 <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.9.1/jquery-ui.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.9.1/jquery-ui.min.js"></script>

    <meta name="viewport" content="width=device-width, initial-scale=1">
<style>
    @import url(https://fonts.googleapis.com/css?family=Lato:900);
*, *:before, *:after{
  box-sizing:border-box;
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
<link href="https://cdnprod2.resumehelp.com/styles/base.min.css?v=1500" rel="stylesheet" />
  
<style>

 *{box-sizing:border-box}
        body,form,h1,h2,h3,
         h4,h5,h6,header,li,menu,nav,ol,
         p,section,table,u,ul{margin:0;padding:0;border:0;font-size:100%;vertical-align:baseline}
         
         ol,ul{margin:0;padding:0;list-style:none}
         
         html{position:relative;min-height:100%}
         
         body{font-family:"Source Sans Pro",Arial,sans-serif;
              font-size:16px;
              line-height:1.5;
              font-weight:400;
              color:#2b0c62;
              background-color:whitesmoke;
              }
         h1{font-size:30px;font-weight:700}
         h2{font-size:25px}
         a{text-decoration:none}
        .display-block{display:block!important}
         .display-inlineblock{display:inline-block!important}
         .display-flex{display:-webkit-box!important;display:flex!important}
       .text-upper{text-transform:uppercase;} .text-lower{text-transform:lowercase}
                  .text-capitalize{text-transform:capitalize}
                  .text-initial{text-transform:initial!important}
              .float-right{float:right!important}
              .float-left{float: left!important}
                   .container-main::after,.grid-container::after{content:"";clear:both}
              .container-main{margin:auto;;width:100%;}
                  .container-main::after{display:table}
                  
                 .outer-wrapper{
                               padding:20px 30px 30px;
                               margin-bottom:125px;
                               background:white;
                                margin-top:30px;
                 }
                 body.finalize-page-new{overflow-x:unset}
     .fc-widget-normal{right:5px!important;bottom:10px!important}
     .grid-container{width:100%}
     .grid-container::after{display:block}
      
     
     .button{
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
     
     .button-primary{
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
     
    .button-tertiary{    display: inline-block;
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
    .button-primary:hover {
  	transform: translateY(-3px);
  	box-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);
}

.button-primary:active {
  	transform: translateY(-1px);
  	box-shadow: 0 5px 10px rgba(0, 0, 0, 0.2);
}

.button-tertiary:active {
  	transform: translateY(-1px);
  	box-shadow: 0 5px 10px rgba(0, 0, 0, 0.2);
}
  .button-tertiary:hover {
  	transform: translateY(-3px);
  	box-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);
}

                                           .text-link{color:#00c293}
                                           .text-link:active,.text-link:focus,
                                                 .text-link:hover{color:#009f78
                                                 }
                                                 
                                                 
                                                 .btn-md{padding:9px 10px}.btn-md-45{padding:9.5px 10px;line-height:1.25}
                                                 .btn-sm{padding:7.5px 10px;font-size:14px;text-transform:initial}
                                                 .cta-container{margin:35px 0 10px;text-align:center}
                                                 .cta-container .button-tertiary,.cta-container .button-tertiary+.
                                                 button-primary{min-width:167px}.cta-container .button-tertiary+
                                                 .button-primary+.skip-cta{float:right;color:#878787;
                                                          text-decoration:underline;margin:10px 10px 0 0;font-size:16px}
                                                 .input-group .input-element.invalid:after,
                                                 .input-group .input-element.valid:after
                                                 {top:50%;font-size:inherit;font-family:"Font Awesome 5 Pro";right:10px}
                                                 .description-container .button-default{
                                                     width:100%;margin:10px auto}
                                                 .input-group .input-element.valid input{padding-right:25px}
                                                 .input-group .input-element.valid:after{position:absolute;content:"\f00c";
                                                       color:#00c293;-webkit-transform:translateY(-50%);
                                                       
                                                       -ms-transform:translateY(-50%);transform:translateY(-50%)}
                                                 .input-group .input-element.invalid{position:relative}
                                                 .input-group .input-element.invalid input
                                                 
      {border-color:#fb6565;padding-right:25px}
      .input-group .input-element.invalid:after{position:absolute;content:"\f00d";color:#fb6565;
            -webkit-transform:translateY(-50%);-ms-transform:translateY(-50%);transform:translateY(-50%)}
      .input-row::after{clear:both;content:"";display:table}.input-row .input-group{float:left}
      .input-group{font-family:"Source Sans Pro",Arial,sans-serif;font-size:14px;line-height:1.3;font-weight:400;color:#333;
                  margin-bottom:10px}.input-group label{display:inline-block;margin-bottom:3px}
                  .input-group .input-element{position:relative;width:100%}.input-group .input-element .ui-autocomplete
                  {z-index:9;width:100%!important;left:0!important;max-height:215px;border-top:1px solid #ccc}
                  .input-group [contenteditable=true],.input-group input[type=text],
                  .input-group input[type=password],.input-group input[type=email],.input-group input[type=number],
                  .input-group input[type=search],.input-group select,.input-group textarea{height:40px;width:100%;
                                       display:block;font-size:15px;font-family:"Source Sans Pro",Arial,sans-serif;
                                       -webkit-appearance:none;-moz-appearance:none;appearance:none;border-radius:0;
    padding:10px;background-color:#fff;box-shadow:none;border:1px solid #ccc;color:#333}
                  .input-group [contenteditable=true]:focus,.input-group input[type=text]:focus,.input-group input
                  [type=password]:focus,.input-group input[type=email]:focus,.input-group input[type=number]:focus,
                  .input-group input[type=search]:focus,.input-group select:focus,.input-group textarea:focus{outline:0;
                        border:1px solid #00c293}.input-group [contenteditable=true]:focus{outline:0;box-shadow:0 0 5px #ddd;
                              border:1px solid #ccc}.input-group .nice-select{border-radius:0;height:40px;line-height:30px;
    font-size:15px;float:none}.input-group .nice-select .list{border-radius:0}.input-group .nice-select:after{
        -webkit-transform:none;-ms-transform:none;transform:none;width:0;height:0;border-left:5px solid transparent!important;
        border-right:5px solid transparent!important;border-top:5px solid #333;border-bottom:0;top:55%}
    .input-group .nice-select.open:after{border-bottom:5px solid #333;border-top:0;-webkit-transition:none;transition:none;
          -webkit-transform:rotate(0);-ms-transform:rotate(0);transform:rotate(0)}
    .input-group .nice-select:focus{outline:0;border:1px solid #00c293!important}
    .inline-input{margin-bottom:20px}.inline-input label{margin-bottom:0}.inline-input
    .input-element{display:inline-block;vertical-align:middle;width:auto}.inline-input
    .input-element>*{width:100%}.select-box .input-element.invalid:after{display:none}.input-control{height:40px;width:100%;
                  display:block;font-size:15px;-webkit-appearance:none;-moz-appearance:none;appearance:none;border-radius:0;
                  padding:10px;background-color:#fff;box-shadow:none;border:1px solid #ccc;color:#333}.input-control:focus
    {outline:0;border:1px solid #00c293}textarea{font-family:"Source Sans Pro",Arial,sans-serif;overflow:auto;
             -webkit-overflow-scrolling:touch}input[disabled],input[readonly]{background-color:#f2f2f2!important}
    select[disabled],select[readonly],textarea[disabled]{color:#767676!important}input[type=search]::-ms-clear{display:none;
              width:0;height:0}input[type=search]::-ms-reveal{display:none;width:0;height:0}input[type=search]
              ::-webkit-search-cancel-button,input[type=search]::-webkit-search-decoration,input[type=search]
              ::-webkit-search-results-button,input[type=search]::-webkit-search-results-decoration{display:none}
              .error-message{color:#fb6565;font-size:13px;line-height:1.3;display:none}
              .no-label-text{padding-top:21px}::-ms-clear{display:none}input[type=checkbox],input[type=radio]
              {opacity:0;position:absolute;z-index:-1}input[type=checkbox]
              :active+input[type=hidden]+label.cst-checkbox:before,input[type=checkbox]:active+label:before,
              input[type=radio]:active+input[type=hidden]+label.cst-checkbox:before,input[type=radio]:active+label:before
      {-webkit-transition-duration:0;transition-duration:0}input[type=checkbox]+input[type=hidden]+label.cst-checkbox,
      input[type=checkbox]+label,input[type=radio]+input[type=hidden]+label.cst-checkbox,input[type=radio]+label{
          cursor:pointer;font-weight:400;position:relative;padding:0 10px 0 2em;vertical-align:middle;
          -webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none}
      input[type=checkbox]+input[type=hidden]+label.cst-checkbox:before,input[type=checkbox]+label:before,
      input[type=radio]+input[type=hidden]+label.cst-checkbox:before,input[type=radio]+label:
      before{position:absolute;top:50%;left:0;box-sizing:content-box;border-radius:0;content:"";width:16px;height:16px;
             margin-top:-9px;border:1px solid #ccc;text-align:center}input[type=checkbox]+input[type=hidden]
      +label.cst-checkbox:after,input[type=checkbox]+label:after,input[type=radio]+input[type=hidden]+label.cst-checkbox:after,input[type=radio]+label:after{position:absolute;top:50%;left:3px;box-sizing:content-box;content:"";background-color:#00c293;width:12px;height:12px;margin-top:-6px;-webkit-transform:scale(0);-ms-transform:scale(0);transform:scale(0);-webkit-transform-origin:50%;-ms-transform-origin:50%;transform-origin:50%;
            -webkit-transition:-webkit-transform .2s ease-out;transition:-webkit-transform .2s ease-out;transition:transform .2s ease-out;transition:transform .2s ease-out,-webkit-transform .2s ease-out}input[type=checkbox]+input[type=hidden]+label.cst-checkbox:after,input[type=checkbox]+label:after{top:50%;background-color:transparent;width:9px;height:4px;margin-top:-5px;border-style:solid;border-color:#fff;border-width:0 0 3px 3px;-webkit-border-image:none;-o-border-image:none;border-image:none;-webkit-transform:rotate(-45deg) scale(0);-ms-transform:rotate(-45deg) scale(0);transform:rotate(-45deg) scale(0);-webkit-transition:none;transition:none}input[type=checkbox]:checked+input[type=hidden]+label.cst-checkbox:before,input[type=checkbox]:checked+label:before{background-color:#00c293;border-color:#00c293;-webkit-animation:borderscale .2s ease;animation:borderscale .2s ease}input[type=radio]:checked+label:before{background-color:#fff;border-color:#00c293}
      input[type=radio]:checked+label:after{-webkit-transform:scale(.7);-ms-transform:scale(.7);transform:scale(.7)}input[type=radio]+label{font-size:14px}input[type=radio]+label:after,input[type=radio]+label:before{border-radius:50%}input[type=checkbox]:checked+input[type=hidden]+label.cst-checkbox:after,input[type=checkbox]:checked+label:after{content:"";-webkit-transition:-webkit-transform .2s ease-out;transition:-webkit-transform .2s ease-out;transition:transform .2s ease-out;transition:transform .2s ease-out,-webkit-transform .2s ease-out;-webkit-transform:rotate(-45deg) scale(1);-ms-transform:rotate(-45deg) scale(1);transform:rotate(-45deg) scale(1)}
     


   .header{position:relative;
           background-color:#00073a;
     height:70px;padding:13px 10px;
     text-transform:capitalize}
 



@media only screen and (min-width:1024px){
    .funnel-wrapper .form-container-main section{width:calc(50% - 22.5px);float:left;margin-left:15px
    
    }}
.funnel-wrapper .form-container-main section.form-text{padding-top:8px}
.funnel-wrapper .form-container-main section+section{margin-top:12px}

.funnel-wrapper .form-container-main .show-image{margin:0 auto;background:0 0;border:2px solid #ccc;
           width:236px;height:325px;padding:16px;position:relative;overflow:hidden}
.upload-page{margin-bottom:45px}
           .upload-page .upload-wrapper{display:-webkit-box;display:flex;-webkit-box-pack:end;
                          justify-content:flex-end;-webkit-box-align:center;align-items:center;height:calc(100vh - 205px);
                          width:100%;min-height:660px}.upload-page .upload-wrapper .upload-content-outer{margin:0 auto}
                          .upload-page .upload-wrapper .upload-content{max-width:640px;padding:0 75px;-webkit-box-pack:center;
                                         justify-content:center;-webkit-box-align:center;align-items:center}
                          .upload-page .upload-wrapper 
                          .upload-content .upload-option-container{min-height:259px}

</style>
<link href="https://cdnprod2.resumehelp.com/styles/builder.min.css?v=1500" rel="stylesheet" />
       
<style>
            .register{
    background: -webkit-linear-gradient(left, #3931af, #00c6ff);
    margin-top: 3%;
    padding: 3%;
}
.register-left{
    text-align: center;
    color: #fff;
    margin-top: 4%;
}
.register-left input{
    border: none;
    border-radius: 1.5rem;
    padding: 2%;
    width: 60%;
    background: #f8f9fa;
    font-weight: bold;
    color: #383d41;
    margin-top: 30%;
    margin-bottom: 3%;
    cursor: pointer;
}
.register-right{
    background: #f8f9fa;
    border-top-left-radius: 10% 50%;
    border-bottom-left-radius: 10% 50%;
}
.register-left img{
    margin-top: 15%;
    margin-bottom: 5%;
    width: 25%;
    -webkit-animation: mover 2s infinite  alternate;
    animation: mover 1s infinite  alternate;
}
@-webkit-keyframes mover {
    0% { transform: translateY(0); }
    100% { transform: translateY(-20px); }
}
@keyframes mover {
    0% { transform: translateY(0); }
    100% { transform: translateY(-20px); }
}
.register-left p{
    font-weight: lighter;
    padding: 12%;
    margin-top: -9%;
}
.register .register-form{
    padding: 10%;
    margin-top: 10%;
}
.btnRegister{
    float: right;
    margin-top: 10%;
    border: none;
    border-radius: 1.5rem;
    padding: 2%;
    background: #0062cc;
    color: #fff;
    font-weight: 600;
    width: 250px;
    cursor: pointer;
}
.register .nav-tabs{
    margin-top: 3%;
    border: none;
    background: #0062cc;
    border-radius: 1.5rem;
    width: 28%;
    float: right;
}
.register .nav-tabs .nav-link{
    padding: 2%;
    height: 34px;
    font-weight: 600;
    color: #fff;
    border-top-right-radius: 1.5rem;
    border-bottom-right-radius: 1.5rem;
}
.register .nav-tabs .nav-link:hover{
    border: none;
}
.register .nav-tabs .nav-link.active{
    width: 100px;
    color: #0062cc;
    border: 2px solid #0062cc;
    border-top-left-radius: 1.5rem;
    border-bottom-left-radius: 1.5rem;
}
.register-heading{
    text-align: center;
    margin-top: 8%;
    margin-bottom: -15%;
    color: #495057;
}
button:hover {
color: #ffffff;
background: #2b0c62;
border-color: #1172c4;
border-color: #1172c4;
border-style: solid;
border-width: 2px;
border-radius: 50px;
padding: 0px 10px;
line-height:45px;
}
.high {
border-color: black;
border-style: solid;
border-width: 4px;
border-radius: 50px;
padding: 0px 20px;
line-height:55px;
}
            </style>
<style>
* {box-sizing: border-box}
body {font-family: "Lato", sans-serif;}

/* Style the tab */
.tab {
  float: left;
  	box-shadow: 0 5px 10px rgba(0, 0, 0, 0.2);
  background-color:whitesmoke;
  width: 22%;

 margin-left: 70px;
 margin-top: 30px;
}

/* Style the buttons inside the tab */
.tab button {
  display: block;
  background-color:white;
 color:#2b0c62;
  padding: 20px 10px;
  width: 100%;
 outline: none;
  text-align:left;
  cursor: pointer;
  transition: 0.3s;
  font-size: 18px;
 border-top-style: solid;

 border-top-color:lightgray;
 border-top-width: 1.5px;
  border-top-style: solid;

 border-bottom-color:lightgray;
 border-bottom-width: 1.5px;
  border-bottom-style: solid;

 border-left-color:lightgray;
 border-left-width: 1.5px;
  border-left-style: solid;
 border-right-style: none;

}

/* Change background color of buttons on hover */
.tab button:hover {
  background-color: #ddd;
}

/* Create an active/current "tab button" class */
.tab button.active {
  background-color:whitesmoke ;
  border-left-style: solid;
  border-left-color:orange;
  border-left-width: 5px;
}

/* Style the tab content */
.tabcontent {
  float: left;
  
padding: 2px;
  width: 70%;
  border-left: none;
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
    
 /* Footer start */
@import url('https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css');
section {
    padding: 60px 0;
    
}
#footer {
    height: 65vh;
    background-image:   linear-gradient(to right bottom,#0099cc,lightblue );
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
<body>
 <%--header--%>
        <header class="header">
            <div class="foo" style="padding-left: 10px; padding-top: 1px;">
    <span class="letter" data-letter="R">R</span><span class="letter" data-letter="B">B</span>
     <a href="profile.jsp" style="font-family:sans-serif;color:#2b0c62;padding-left: 10px;">ResumeBuilder</a>
                   </div> 

        </header>
            
<div class="tab">

    <button class="tablinks" onclick="openCity(event, 'info')" id="defaultOpen"> <i class='fas fa-user' style='font-size:24px'></i><b>&nbsp;&nbsp;Basic Information</b></button>
    <button class="tablinks" onclick="openCity(event, 'edu')"><i class='fas fa-graduation-cap' style='font-size:24px'></i>&nbsp;&nbsp;<b>Education</b> </button>
    <button class="tablinks" onclick="openCity(event, 'work')"><i class='fas fa-laptop-code' style='font-size:24px'></i>&nbsp;&nbsp;<b>Work Experience</b></button>
    <button class="tablinks" onclick="openCity(event, 'skill')"><i class='far fa-keyboard' style='font-size:24px'></i>&nbsp;&nbsp;<b>Key Skills</b></button>
    <button class="tablinks" onclick="openCity(event, 'certi')"><i class='fas fa-award' style='font-size:24px'></i>&nbsp;&nbsp;<b>Certifications</b> </button>
    <button class="tablinks" onclick="openCity(event, 'pro')"><i class='fas fa-database' style='font-size:24px'></i>&nbsp;&nbsp;<b>Projects</b></button>
    <button class="tablinks" onclick="openCity(event, 'lang')"><i class='fas fa-pen' style='font-size:24px'></i>&nbsp;&nbsp;<b>Languages</b></button>
    <button class="tablinks" onclick="openCity(event, 'inter')"><i class='fas fa-icons' style='font-size:24px'></i>&nbsp;&nbsp;<b>Hobbies & Interests</b> </button>
  <button class="tablinks" onclick="openCity(event, 'img')"><i class='fas fa-user-alt' style='font-size:24px'></i>&nbsp;&nbsp;<b>Upload Profile</b> </button>
  
  
</div>
 <form id="form1" method="POST">
      <input type="submit" formtarget="choose.jsp" onclick="window.location.href='choose.jsp'" name="submit" value="choose template" class="button-primary float-right" />
  <input type="submit" formtarget="Template/Decent.jsp" onclick="window.location.href='Template/Decent.jsp'" name="submit1" value="Preview" class="button-primary float-right" />
  
      <input type="submit" name="btn_submit" id="btn_submit" value="Save all Details" class="third button-primary float-right" />

<div id="info" class="tabcontent">
<div class="container-main contact-page resume-fn funnel-wrapper">
    <div class="outer-wrapper">
        <h1>Basic Information</h1>
        <p class="sub-header">Start by filling out your contact information, then move through each tab to add content</p>
        <div class="form-container-main grid-container content-wrapper">
     
               
                    
                    <div class="input-row ">
                            <div class="input-group email">
                                <label for="txtEmail">First Name</label>
                                <div class="input-element">
                                    <input type="text" name="fname" class="error" id="fname" tabindex="8" maxlength="60">
                                </div>
                                
                            </div>
                            <div class="input-group phone">
                                <label for="txtPhone">Last Name</label>
                                <div class="input-element">
                                    <input type="text" name="lname" class="error" id="lname" maxlength="20" tabindex="9">
                                </div>
                                
                            </div>
                        </div>
                      
                    
                        <div class="input-group">
                            <label for="txtAddress">Address</label>
                            <div class="input-element">
                                <input type="text" name="address" id="address" class="error" maxlength="100" tabindex="2">
                            </div>
                        </div>
                        <div class="input-row ">
                                
                                    <div class="input-group city">
                                        <label for="txtCity">City</label>
                                        <div class="input-element  ">
                                            <input type="text" name="city" class="error" id="city" placehoelder="" maxlength="50" autocomplete="off" tabindex="3">
                                        </div>
                                    </div>
                                           
                                        <div class="input-group zip">
                                            <label for="txtZipCode">ZIP code</label>
                                            <div class="input-element">
                                                <input type="text" name="zip" class="error" id="zip" maxlength="10" tabindex="5">
                                            </div>
                                            <span id="errZipCodeValid" class="error-message">Please enter numbers only</span>
                                        </div>
                            
                            <div class="input-group country">
                                <label for="txtCountry">Country</label>
                                <div class="input-element">
                                    <input type="text" name="country" class="error" id="country" maxlength="40" tabindex="6">
                                </div>
                            </div>
                            <div >
                                <label class="input-group">Summary</label>
                                <div>
                                    <textarea class="form-control" class="error"  name="summ" id="summ" rows="4" cols="100"></textarea>
                            </div>
                            </div><br/>
                        </div>
                           <div class="input-row ">
                            <div class="input-group email">
                                <label for="txtEmail">Email</label>
                                <div class="input-element">
                                    <input type="text" class="error" name="email" id="email" tabindex="8" maxlength="60">
                                </div>
                                
                            </div>
                            <div class="input-group phone">
                                <label for="txtPhone">Phone</label>
                                <div class="input-element">
                                    <input type="text" class="error" name="contact" id="contact" maxlength="20" tabindex="9">
                                </div>
                                
                            </div>
                               
                               
                        </div>
                    
<input type="button" value="Save" onclick="mySave1()" class="button-primary float-right" name="anubhi" id="anubhi" />
                
 <script>
    fname.value = localStorage.getItem('fname');
    fname.oninput = () => {
      localStorage.setItem('fname', fname.value)
    };
    </script>
    <script>
    lname.value = localStorage.getItem('lname');
    lname.oninput = () => {
      localStorage.setItem('lname', lname.value)
    };
    </script>
    <script>
    address.value = localStorage.getItem('address');
    address.oninput = () => {
      localStorage.setItem('address', address.value)
    };
    </script>
   <script>
    city.value = localStorage.getItem('city');
    city.oninput = () => {
      localStorage.setItem('city', city.value)
    };
    </script>
    <script>
    zip.value = localStorage.getItem('zip');
    zip.oninput = () => {
      localStorage.setItem('zip', zip.value)
    };
    </script>
    <script>
    country.value = localStorage.getItem('country');
    country.oninput = () => {
      localStorage.setItem('country', country.value)
    };
    </script>
    <script>
    summ.value = localStorage.getItem('summ');
    summ.oninput = () => {
      localStorage.setItem('summ', summ.value)
    };
</script>
 <script>
    email.value = localStorage.getItem('email');
    email.oninput = () => {
      localStorage.setItem('email', email.value)
    };
</script>
 <script>
    contact.value = localStorage.getItem('contact');
    contact.oninput = () => {
      localStorage.setItem('contact', contact.value)
    };
</script>
 </div>
    </div>
</div>
</div>

<div id="edu" class="tabcontent">
    
    
<div class="container-main experience-container education-container resume-fn funnel-wrapper">
    <div class="outer-wrapper">
        <h1>Education</h1>
        <p class="sub-header">Where did you go to?</p>
        <div class="form-container-main grid-container content-wrapper">
              
    <div id="mainE">
        <input type="button" id="btedu" value="Add Element" class="bt button-primary float-left" /><br/><br/><br/><br/>
        <input type="button" name="btn_submit1" value="Save" onclick="mySavee()" class="button-primary float-right" />
    
 <input type="button" name="btn_submit11" value="Load" onclick="myLoade()" class="button-primary float-right" />
    
    </div>
    <br>
   </div>
         </div>
        </div>
    </div>
     
<script>
    //education
          var amountOfInputs=8;
           var program = [];
           var instit = [];
           var sdt = [];
           var endt = [];
           var mar = [];
          function mySavee() {
          for(var i = 1; i < 9; i++){
            program[i]=document.getElementById("ed"+i).value;
            instit[i]=document.getElementById("inst"+i).value;
            sdt[i]=document.getElementById("std"+i).value;
            endt[i]=document.getElementById("end"+i).value;
            mar[i]=document.getElementById("cgp"+i).value;
            localStorage.setItem("pr"+i, JSON.stringify(program[i])); //store colors  
            localStorage.setItem("itt"+i, JSON.stringify(instit[i]));
            localStorage.setItem("st"+i, JSON.stringify(sdt[i]));
            localStorage.setItem("en"+i, JSON.stringify(endt[i]));
            localStorage.setItem("mark"+i, JSON.stringify(mar[i]));
        }
       
       }
       function myLoade() {
           var pm =[];
           var inst =[];
           var sd =[];
           var ed =[];
           var mk =[];
           for(var i = 1; i < 9; i++){
               pm[i]=JSON.parse(localStorage.getItem("pr"+i));
               inst[i]=JSON.parse(localStorage.getItem("itt"+i));
               sd[i]=JSON.parse(localStorage.getItem("st"+i));
               ed[i]=JSON.parse(localStorage.getItem("en"+i));
               mk[i]=JSON.parse(localStorage.getItem("mark"+i));
document.getElementById("ed"+i).value = pm[i];
document.getElementById("inst"+i).value = inst[i];
document.getElementById("std"+i).value = sd[i];
document.getElementById("end"+i).value = ed[i];
document.getElementById("cgp"+i).value = mk[i];
           }
       }
</script>

<div id="work" class="tabcontent">
<div class="container-main experience-container resume-fn funnel-wrapper">
    <div class="outer-wrapper">
        <h1>Experience</h1>
        <p class="sub-header">What is your work experience?</p>
        <div class="form-container-main grid-container content-wrapper">

    <div id="mainW">
        <input type="button" id="btnW" value="Add Element" class="bt button-primary float-left" /><br/><br/><br/><br/>
       <input type="button" onclick="mySavew()" name="btnss" id="btnss" value="Save" class="bt button-primary float-right"/>    
    <input type="button" onclick="myLoadw()" name="btnssw" id="btnw" value="Load" class="bt button-primary float-right"/>      

    </div>
    <br><br><br><br><br>
    
 
        </div>
       
    </div>

</div>
</div>
<script>
    //work
          var amountOfInputs=8;
           var pros = [];
           var insc = [];
           var desc = [];
           var stde = [];
           var ende = [];
          function mySavew() {
          for(var i = 1; i < 9; i++){
            pros[i]=document.getElementById("pos"+i).value;
            insc[i]=document.getElementById("com"+i).value;
            desc[i]=document.getElementById("dew"+i).value;
            stde[i]=document.getElementById("stw"+i).value;
            ende[i]=document.getElementById("enw"+i).value;
            localStorage.setItem("post"+i, JSON.stringify(pros[i])); //store colors  
            localStorage.setItem("insct"+i, JSON.stringify(insc[i]));
            localStorage.setItem("descp"+i, JSON.stringify(desc[i]));
            localStorage.setItem("stdep"+i, JSON.stringify(stde[i]));
            localStorage.setItem("endep"+i, JSON.stringify(ende[i]));
        }
       
       }
       function myLoadw() {
           var pmw =[];
           var instw =[];
           var sdw =[];
           var edw =[];
           var mkw =[];
           for(var i = 1; i < 9; i++){
               pmw[i]=JSON.parse(localStorage.getItem("post"+i));
               instw[i]=JSON.parse(localStorage.getItem("insct"+i));
               sdw[i]=JSON.parse(localStorage.getItem("descp"+i));
               edw[i]=JSON.parse(localStorage.getItem("stdep"+i));
               mkw[i]=JSON.parse(localStorage.getItem("endep"+i));
document.getElementById("pos"+i).value = pmw[i];
document.getElementById("com"+i).value = instw[i];
document.getElementById("dew"+i).value = sdw[i];
document.getElementById("stw"+i).value = edw[i];
document.getElementById("enw"+i).value = mkw[i];
           }
       }
</script>
<div id="skill" class="tabcontent">
<div class="container-main experience-container resume-fn funnel-wrapper">
    <div class="outer-wrapper">
        <h1>Key Skills</h1>
        <p class="sub-header">Enter maximum 8 skills</p>
        <div class="form-container-main grid-container content-wrapper">
            
    <div id="main2">
        <input type="button" id="btnd" value="Add Element" class="bt button-primary float-left" /><br/><br/><br/><br/>
        <br/>
       <input type="button" onclick="mySave()" name="btnss1" id="btnssk1" value="Save" class="bt button-primary float-right"/>    
    <input type="button" onclick="myLoad()" name="btnss2" id="btn1" value="Load" class="bt button-primary float-right"/>      

    </div>
    <br/>

    </div>
    </div>   
   
    </div>
  
</div> 

<script>
       //skills
     function mySave() {
       var s1 = document.getElementById("ss1").value;
       localStorage.setItem("myContent1", s1);
        var s2 = document.getElementById("ss2").value;
       localStorage.setItem("myContent2", s2);
       var s3 = document.getElementById("ss3").value;
       localStorage.setItem("myContent3", s3);
        var s4 = document.getElementById("ss4").value;
       localStorage.setItem("myContent4", s4);
        var s5 = document.getElementById("ss5").value;
       localStorage.setItem("myContent5", s5);
       var s6 = document.getElementById("ss6").value;
       localStorage.setItem("myContent6", s6);
       var s7 = document.getElementById("ss7").value;
       localStorage.setItem("myContent7", s7);
       var s8 = document.getElementById("ss8").value;
       localStorage.setItem("myContent8", s8);
     }
     function myLoad() {
       var s1 = localStorage.getItem("myContent1");
       document.getElementById("ss1").value = s1;
       var s2 = localStorage.getItem("myContent2");
       document.getElementById("ss2").value = s2;
       var s3 = localStorage.getItem("myContent3");
       document.getElementById("ss3").value = s3;
       var s4 = localStorage.getItem("myContent4");
       document.getElementById("ss4").value = s4;
       var s5 = localStorage.getItem("myContent5");
       document.getElementById("ss5").value = s5;
       var s6 = localStorage.getItem("myContent6");
       document.getElementById("ss6").value = s6;
       var s7 = localStorage.getItem("myContent7");
       document.getElementById("ss7").value = s7;
       var s8 = localStorage.getItem("myContent8");
       document.getElementById("ss8").value = s8;
     }
   </script>
<div id="certi" class="tabcontent">

     <div class="container-main experience-container resume-fn funnel-wrapper">
    <div class="outer-wrapper">
        <h1>Certifications</h1>
        <p class="sub-header"></p>
        <div class="form-container-main grid-container content-wrapper">
  
    <div id="mainC">
        <input type="button" id="btCE" value="Add Element" class="bt button-primary float-left" /><br/><br/><br/><br/>
        <input type="button" onclick="mySavec()" name="btnssc" id="btnsskc" value="Save" class="bt button-primary float-right"/>    
    <input type="button" onclick="myLoadec()" name="btnssc" id="btnc" value="Load" class="bt button-primary float-right"/>      

    </div>
    <br><br><br><br><br>
    
    
        </div>
      
    </div>
  
</div> 
</div>
   <script>
    //certification
          var amountOfInputs=8;
           var titl = [];
           var descr = [];
          function mySavec() {
          for(var i = 1; i < 9; i++){
            program[i]=document.getElementById("tit"+i).value;
            instit[i]=document.getElementById("des"+i).value;
            localStorage.setItem("tc"+i, JSON.stringify(program[i])); //store colors  
            localStorage.setItem("dc"+i, JSON.stringify(instit[i]));
            
        }
       
       }
       function myLoadec() {
           var pmc =[];
           var instc =[];
           for(var i = 1; i < 9; i++){
               pmc[i]=JSON.parse(localStorage.getItem("tc"+i));
               instc[i]=JSON.parse(localStorage.getItem("dc"+i));
document.getElementById("tit"+i).value = pmc[i];
document.getElementById("des"+i).value = instc[i];
           }
       }
</script>
<div id="pro" class="tabcontent">
  <div class="container-main experience-container resume-fn funnel-wrapper">
    <div class="outer-wrapper">
        <h1>Projects</h1>
        <p class="sub-header">Tell about your projects?</p>
        <div class="form-container-main grid-container content-wrapper">
            
    <div id="mainP">
        <input type="button" id="btPR" value="Add Element" class="bt button-primary float-left" /><br/><br/><br/><br/>
        <input type="button" onclick="mySavep()" name="btnssp" id="btnsskp" value="Save" class="bt button-primary float-right"/>    
    <input type="button" onclick="myLoadp()" name="btnssp" id="btnp" value="Load" class="bt button-primary float-right"/>      
  
    </div>
    <br>
   
           

        </div>
     
    </div>
  
</div>  
    
</div>
  <script>
    //projects
          var amountOfInputs=8;
           var programp = [];
           var institp = [];
           var sdtp = [];
           var endtp = [];
          function mySavep() {
          for(var i = 1; i < 9; i++){
            programp[i]=document.getElementById("pr"+i).value;
            institp[i]=document.getElementById("pro"+i).value;
            sdtp[i]=document.getElementById("stp"+i).value;
            endtp[i]=document.getElementById("enp"+i).value;
            localStorage.setItem("prp"+i, JSON.stringify(programp[i])); //store colors  
            localStorage.setItem("ittp"+i, JSON.stringify(institp[i]));
            localStorage.setItem("stp"+i, JSON.stringify(sdtp[i]));
            localStorage.setItem("enp"+i, JSON.stringify(endtp[i]));
        }
       
       }
       function myLoadp() {
           var pmp =[];
           var instp =[];
           var sdp =[];
           var edp =[];
           for(var i = 1; i < 9; i++){
               pmp[i]=JSON.parse(localStorage.getItem("prp"+i));
               instp[i]=JSON.parse(localStorage.getItem("ittp"+i));
               sdp[i]=JSON.parse(localStorage.getItem("stp"+i));
               edp[i]=JSON.parse(localStorage.getItem("enp"+i));
document.getElementById("pr"+i).value = pmp[i];
document.getElementById("pro"+i).value = instp[i];
document.getElementById("stp"+i).value = sdp[i];
document.getElementById("enp"+i).value = edp[i];
           }
       }
</script>
<div id="lang" class="tabcontent">

     <div class="container-main experience-container resume-fn funnel-wrapper">
    <div class="outer-wrapper">
        <h1>Language</h1>
        <p class="sub-header">Tell about your Language?</p>
        <div class="form-container-main grid-container content-wrapper">
           
               
    <div id="main1"><br>
        <input type="button" id="btAnd" value="Add Element" class="bt button-primary float-left" /><br/><br/><br><br>
        <input type="button" onclick="mySave3()" name="btn_sub11" id="bn1" value="Save" class="bt button-primary float-right"/>
<input type="button" name="btn_sub12" onclick="myLoad3()" id="bn11" value="Load" class="bt button-primary float-right"/>

    </div>
    <br/>
   

        </div>
        <div class="cta-container clearfix">
              </div>
      
    </div>
  
</div>  
</div>
<div id="inter" class="tabcontent">
    
     <div class="container-main experience-container resume-fn funnel-wrapper">
    <div class="outer-wrapper">
        <h1>Hobbies</h1>
        <p class="sub-header">Tell about your Hobbies/Interest?</p>
        <div class="form-container-main grid-container content-wrapper">
   
    <div id="main">
        <input type="button" id="btAdd" value="Add Element" class="bt button-primary float-left" /><br/><br/><br/><br/>
       <input type="button" onclick="mySave2()" name="btn_submit22" id="bt1" value="Save" class="button-primary float-right" />
    <input type="button" onclick="myLoad2()" name="btn_submit222" id="bt2" value="Load" class="button-primary float-right" />
    
    </div>
    <br>
    
       
        </div>
       
    </div>
  
</div>   
</div>

      <script>
          //hobby
          var amountOfInputs=8;
           var colors = [];
          function mySave2() {
          for(var i = 1; i < 8; i++){
            colors[i]=document.getElementById("tb"+i).value;
        localStorage.setItem("my_colors"+i, JSON.stringify(colors[i])); //store colors  
    
        }
       
       }
       function myLoad2() {
           var storedColors =[];
           for(var i = 1; i < 8; i++){
               storedColors[i]=JSON.parse(localStorage.getItem("my_colors"+i));
document.getElementById("tb"+i).value = storedColors[i];
           }
       }
</script>
      <script>
          //language
           var col = [];
          function mySave3() {
          for(var i = 1; i < 8; i++){
            col[i]=document.getElementById("ll"+i).value;
        localStorage.setItem("colors"+i, JSON.stringify(col[i])); //store colors  
    
        }
       
       }
       function myLoad3() {
           var storedCol =[];
           for(var i = 1; i < 8; i++){
               storedCol[i]=JSON.parse(localStorage.getItem("colors"+i));
document.getElementById("ll"+i).value = storedCol[i];
           }
       }
</script> 
       
    
     <script>
    //work
var addW = $('#btnW');
var allW = $('#mainW');
var amountOfInputs = 1;
var maximumBoxew = 8;
var iCnt = 1;
addW.click(function(event){
    
   if($(".boxw").length >= maximumBoxew){
       
      Swal.fire('You can add only 8 records!'); 
                
                 
        return;
    }
        
    var listW = $('<div class="boxw"></div>');
   for(var i = 0; i < amountOfInputs; i++){
        listW.append('<label class="input-group">Position: </label><input type=text class="error" name=pos' + iCnt+ ' ' + ' id=pos' + iCnt + ' ' +'  autocomplete="off" tabindex="1"> \n\
<br/><br/><label class="input-group">Company: </label>\n\<input type=text class="error" name=com' + iCnt+ ' ' + ' id=com' + iCnt + ' ' +' placeholder="" autocomplete="off" tabindex="1">\n\
<br/><br/><label class="input-group">Description: </label><textarea class="error" name=dew' + iCnt+ ' ' + ' id=dew' + iCnt + ' ' +' placeholder="" autocomplete="off" tabindex="1" rows="4" cols="100"></textarea>\n\
<br/><br/><label class="input-group">Start Date: </label><input class="error" type=text name=stw' + iCnt+ ' ' + ' id=stw' + iCnt + ' ' +' placeholder="" autocomplete="off" tabindex="1"><br/>\n\
<br/><label class="input-group">End Date: </label><input class="error" type=text name=enw' + iCnt+ ' ' + ' id=enw' + iCnt + ' ' +' placeholder="" autocomplete="off" tabindex="1"><br/><br/>'); // end append
 listW.append('<input type="submit" value=Delete id=rem' +iCnt+ ' ' + ' name=rem'+iCnt+' class="btnP button-primary float-right" />');
 listW.append('<input type="button"  value=remove class="btnP button-primary float-right removeGroup" /><br/><br/>');
     listW.appendTo(allW);
            iCnt=iCnt+1;
        }
   
});
$(document).on("click", ".removeGroup", function(event){
    event.preventDefault();
     iCnt=iCnt-1;
   $(this).parent(".boxw").remove();
});
</script> 
 <% 
        try{
            
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
        PreparedStatement pst1 ;
        ResultSet rst1;
     int kw=1;
        while(kw!=8)
            {
                 String mail=request.getParameter("email");
                String r=request.getParameter("rem"+kw);
                String posi=request.getParameter("pos"+kw);
                if( r!=null)    
                {
                    if(posi!=null){
                 pst1 = conn.prepareStatement("DELETE FROM WORKEX WHERE UPOSITION='"+posi+"' AND UEMAIL='"+mail+"' ");
              int xs=pst1.executeUpdate();
                 %>
              <script>
                 Swal.fire('Work Experience Deleted!'); 
                 </script>
                 <%
        }}
                  kw++;
        }
        }catch(Exception exec) 
    {
        exec.printStackTrace();
    }
        
    %>
 <script>
    //PROJECT
var addP = $('#btPR');
var allP = $('#mainP');
var maximumBoxep = 8;
var iCnt = 1;
addP.click(function(event){
    
   if($(".boxp").length >= maximumBoxep){
       Swal.fire('You cannot have more than 8 fields!'); 
       return;
    }
        
    var listP = $('<div class="boxp"></div>');
   for(var i = 0; i < amountOfInputs; i++){
        listP.append('<label class="input-group">Project Title: </label><input type=text name=pr' + iCnt+ ' ' + ' id=pr' + iCnt + ' ' +' placeholder="" autocomplete="off" tabindex="1"> \n\
<br/><br/><label class="input-group">Project Description: </label><textarea name=pro' + iCnt+ ' ' + ' id=pro' + iCnt + ' ' +' placeholder="" cols="70" rows="4"></textarea>\n\
<br/><br/><label class="input-group">Start Date: </label><input type=text name=stp' + iCnt+ ' ' + ' id=stp' + iCnt + ' ' +' placeholder="" autocomplete="off" tabindex="1"><br/>\n\
<br/><label class="input-group">End Date: </label><input type=text name=enp' + iCnt+ ' ' + ' id=enp' + iCnt + ' ' +' placeholder="" autocomplete="off" tabindex="1"><br/><br/>');
 listP.append('<input type="submit" value=Delete id=remp' +iCnt+ ' ' + ' name=remp'+iCnt+' class="btnP button-primary float-right" />');
  listP.append('<input type="button" value="Remove" class="btnP button-primary float-right removeGroup" /><br/><br/>');
    listP.appendTo(allP);
            iCnt=iCnt+1;
        }
  
});
$(document).on("click", ".removeGroup", function(event){
    event.preventDefault();
   $(this).parent(".boxp").remove();
   iCnt=iCnt-1;
});
</script> 
<% 
        try{
            
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
        PreparedStatement pst1 ;
        ResultSet rst1;
     int kw=1;
        while(kw!=8)
            {
                 String mail=request.getParameter("email");
                String r=request.getParameter("remp"+kw);
                String nm=request.getParameter("pr"+kw);
                if( r!=null)    
                {
                    if(nm!=null){
                 pst1 = conn.prepareStatement("DELETE FROM PROJECT WHERE PNAME='"+nm+"' AND UEMAIL='"+mail+"' ");
              int xs=pst1.executeUpdate();
                 %>
              <script>
                 Swal.fire('Project Details Deleted!'); 
                 </script>
                 <%
        }}
                  kw++;
        }
        }catch(Exception exec) 
    {
        exec.printStackTrace();
    }
        
    %>
 <script>
    //certificate
var addC = $('#btCE');
var allC = $('#mainC');
var maximumBoxec = 8;
var amountOfInpu = 1;
var iCnt = 1;
addC.click(function(event){
    
   if($(".boxc").length >= maximumBoxec){
        Swal.fire('You cannot have more than 8 fields!'); 
       
        return;
    }
        
    var listC = $('<div class="boxc"></div>');
   for(var i = 1; i <= amountOfInpu; i++){
        listC.append('<label class="input-group">Certificate Title: </label><input type=text name=tit' + iCnt+ ' ' + ' id=tit' + iCnt + ' ' +' placeholder="" autocomplete="off" tabindex="1"> \n\
<br/><br/><label class="input-group">Certificate Description: </label>\n\<textarea name=des' + iCnt+ ' ' + ' id=des' + iCnt + ' ' +' placeholder="" cols="100" rows="4"></textarea>\n\
<br/><br/>');
            listC.append('<input type="submit" value=Delete id=remc' +iCnt+ ' ' + ' name=remc'+iCnt+' class="btnP button-primary float-right" />');
            listC.append('<input type="button" value="Remove" class="btnP button-primary float-right removeGroupc" /><br/><br/>');
    listC.appendTo(allC);
            iCnt=iCnt+1;
        }
   
});
$(document).on("click", ".removeGroupc", function(event){
    event.preventDefault();
    $(this).parent(".boxc").remove();
   iCnt=iCnt-1;
});
</script> 
<% 
        try{
            
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
        PreparedStatement pst1 ;
        ResultSet rst1;
     int kw=1;
        while(kw!=8)
            {
                 String mail=request.getParameter("email");
                String r=request.getParameter("remc"+kw);
                String nm=request.getParameter("tit"+kw);
                if( r!=null)    
                {
                    if(nm!=null){
                 pst1 = conn.prepareStatement("DELETE FROM CERTIFICATE WHERE UCERTI='"+nm+"' AND UEMAIL='"+mail+"' ");
              int xs=pst1.executeUpdate();
                 %>
              <script>
                 Swal.fire('Certificate detail Deleted!'); 
                 </script>
                 <%
        }}
                  kw++;
        }
        }catch(Exception exec) 
    {
        exec.printStackTrace();
    }
        
    %>
<script>
    //education
var addE = $('#btedu');
var allE = $('#mainE');
var maximumBox = 8;
var amountOfInp = 1;
var iCnt = 1;
addE.click(function(event){
    
   if($(".boxe").length >= maximumBox){
        Swal.fire('You cannot have more than 8 fields!'); 
       
        return;
    }
        
    var listE = $('<div class="boxe"></div>');
   for(var i = 1; i <= amountOfInp; i++){
        listE.append('<label class="input-group">Program: </label><input type=text name=ed' + iCnt+ ' ' + ' id=ed' + iCnt + ' ' +' placeholder="" autocomplete="off" tabindex="1"> \n\
<br/><br/><label class="input-group">Institute: </label><input type=text name=inst' + iCnt+ ' ' + ' id=inst' + iCnt + ' ' +'  autocomplete="off" tabindex="1">\n\
<br/><br/><label class="input-group">Start Date: </label><input type=text name=std' + iCnt+ ' ' + ' id=std' + iCnt + ' ' +'  autocomplete="off" tabindex="1">\n\
<br/><br/><label class="input-group">End Date: </label><input type=text name=end' + iCnt+ ' ' + ' id=end' + iCnt + ' ' +'  autocomplete="off" tabindex="1">\n\
<br/><br/><label class="input-group">CGPA / Marks: </label><input type=text name=cgp' + iCnt+ ' ' + ' id=cgp' + iCnt + ' ' +'  autocomplete="off" tabindex="1">  \n\
<br><br>');
            listE.append('<input type="submit" value=Delete id=reme' +iCnt+ ' ' + ' name=reme'+iCnt+' class="btnP button-primary float-right" />');
            listE.append('<input type="button" value="Remove" class="btnP button-primary float-right removeGroupe" /><br/><br/>');
    listE.appendTo(allE);
            iCnt=iCnt+1;
        }
   
});
$(document).on("click", ".removeGroupe", function(event){
    event.preventDefault();
    $(this).parent(".boxe").remove();
   iCnt=iCnt-1;
});
</script>
<% 
        try{
            
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
        PreparedStatement pst1 ;
        ResultSet rst1;
     int kw=1;
        while(kw!=8)
            {
                 String mail=request.getParameter("email");
                String r=request.getParameter("reme"+kw);
                String nm=request.getParameter("ed"+kw);
                if( r!=null)    
                {
                    if(nm!=null){
                 pst1 = conn.prepareStatement("DELETE FROM EDUCATION WHERE UPROGRAM='"+nm+"' AND UEMAIL='"+mail+"' ");
              int xs=pst1.executeUpdate();
                %>
              <script>
                 Swal.fire('Education Deleted!'); 
                 </script>
                 <%
        }}
                  kw++;
        }
        }catch(Exception exec) 
    {
        exec.printStackTrace();
    }
        
    %>
   
<script>
    //skills
var adds = $('#btnd');
var alls = $('#main2');
var maximums = 8;
var iCnt = 1;
adds.click(function(event){
    
    if($(".boxs").length >= maximums){
        Swal.fire('You cannot have more than 8 fields!'); 
       
        return;
    }
        
    var lists = $('<div class="boxs"></div>');
   
        lists.append('<label class="input-group">Hobby / Interest:</label><input type="text"  name=ss' + iCnt+ ' ' + ' id=ss' + iCnt + ' ' +'" class="input" />&nbsp;&nbsp;');
    
    lists.append('<input type="submit" value=Delete id=rems' +iCnt+ ' ' + ' name=rems'+iCnt+' class="btnP button-primary float-right" />');
    lists.append('<input type="button" value="Remove" class="removeGrous" /><br/><br/>');
   iCnt=iCnt+1;
        lists.appendTo(alls);
});
$(document).on("click", ".removeGrous", function(event){
    event.preventDefault();
    $(this).parent(".boxs").remove();
   iCnt=iCnt-1;
});
</script>
<% 
        try{
            
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
        PreparedStatement pst1 ;
        ResultSet rst1;
     int kw=1;
        while(kw!=8)
            {
                 String mail=request.getParameter("email");
                String r=request.getParameter("rems"+kw);
                String nm=request.getParameter("ss"+kw);
                if( r!=null)    
                {
                    if(nm!=null){
                 pst1 = conn.prepareStatement("DELETE FROM SKILLS WHERE SK='"+nm+"' AND UEMAIL='"+mail+"' ");
              int xs=pst1.executeUpdate();
                 %>
              <script>
                 Swal.fire('Skill Deleted!'); 
                 </script>
                 <%
        }}
                  kw++;
        }
        }catch(Exception exec) 
    {
        exec.printStackTrace();
    }
        
    %>
<script>
    //hobby
var addl = $('#btAdd');
var alll = $('#main');
var amountOfInputs = 1;
var maximumBoxes = 8;
var iCnt = 1;
addl.click(function(event){
    
    // create a limit
    if($(".boxl").length >= maximumBoxes){
        Swal.fire('You cannot have more than 8 fields!'); 
       
        return;
    }
        
    var listItem = $('<div class="boxl"></div>');
    for(var i = 0; i < amountOfInputs; i++){
        listItem.append('<label class="input-group">Hobby / Interest:</label><input type="text" class="error"  name=tb' + iCnt+ ' ' + ' id=tb' + iCnt + ' ' +'"/>&nbsp;&nbsp;');
     listItem.append('<input type="submit" value=Delete id=remh' +iCnt+ ' ' + ' name=remh'+iCnt+' class="btnP button-primary float-right" />');
            listItem.append('<input type="button" value="Remove" class="removeGrouh" /><br/><br/>');
    listItem.appendTo(alll);
            iCnt=iCnt+1;
        }
   
});

$(document).on("click", ".removeGrouh", function(event){
    event.preventDefault();
   $(this).parent(".boxl").remove();
   iCnt=iCnt-1;
});
</script>
<% 
        try{
            
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
        PreparedStatement pst1 ;
        ResultSet rst1;
     int kw=1;
        while(kw!=8)
            {
                 String mail=request.getParameter("email");
                String r=request.getParameter("remh"+kw);
                String nm=request.getParameter("tb"+kw);
                if( r!=null)    
                {
                    if(nm!=null){
                 pst1 = conn.prepareStatement("DELETE FROM UHOBBY WHERE UINTREST='"+nm+"' AND UEMAIL='"+mail+"' ");
              int xs=pst1.executeUpdate();
                 %>
              <script>
                 Swal.fire('Hobby Deleted!'); 
                 </script>
                 <%
        }}
                  kw++;
        }
        }catch(Exception exec) 
    {
        exec.printStackTrace();
    }
        
    %>
<script>
    //language
var add = $('#btAnd');
var all = $('#main1');
var amountOfInputs = 1;
var maximumBoxes = 8;
var iCnt = 1;
add.click(function(event){
    
    // create a limit
    if($(".box").length >= maximumBoxes){
       Swal.fire('You cannot have more than 8 fields!'); 
       
        return;
    }
        
    var listItem = $('<div class="box"></div>');
    // we will add 2 boxes here, but we can modify this in the amountOfBoxes value
    for(var i = 0; i < amountOfInputs; i++){
        listItem.append('<label class="input-group">Language</label><input type="text"  name=ll' + iCnt+ ' ' + ' id=ll' + iCnt + ' ' +'" class="input" />&nbsp;&nbsp;');
    listItem.append('<input type="submit" value=Delete id=reml' +iCnt+ ' ' + ' name=reml'+iCnt+' class="btnP button-primary float-right" />');
            listItem.append('<input type="button" value="Remove" class="removeGroup" /><br/><br/>');
    listItem.appendTo(all);
            iCnt=iCnt+1;
        }
   
});

// Lets implement your remove field option by removing the groups parent div on click
$(document).on("click", ".removeGroup", function(event){
    event.preventDefault();
    $(this).parent(".box").remove();
   iCnt=iCnt-1;
});
</script>
<% 
        try{
            
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
        PreparedStatement pst1 ;
        ResultSet rst1;
     int kw=1;
        while(kw!=8)
            {
                 String mail=request.getParameter("email");
                String r=request.getParameter("reml"+kw);
                String nm=request.getParameter("ll"+kw);
                if( r!=null)    
                {
                    if(nm!=null){
                 pst1 = conn.prepareStatement("DELETE FROM LANGUAGE WHERE ULANGUAGE='"+nm+"' AND UEMAIL='"+mail+"' ");
              int xs=pst1.executeUpdate();
%>
              <script>
                 Swal.fire('Language Deleted!'); 
                 </script>
                 <%
           
        }}
                  kw++;
        }
        }catch(Exception exec) 
    {
        exec.printStackTrace();
    }
        
    %>
</form>

<div id="img" class="tabcontent">
 <section class="form-image"  style="background-color:whitesmoke;">
    <div style="border:none; text-align: center;">
        <span style="text-align:center; position:absolute; padding-top: 30px;">Upload your photo</span>
<span style="text-align:center;font-size: 10px; color: gray;position:absolute; padding-top: 60px;">We support JPG, PNG or JPEG</span>
        
        <div class="container-main experience-container resume-fn funnel-wrapper">
    <div class="outer-wrapper">
        <h1>Profile</h1>
        <span>Upload your photo</span><br/>
<span style="font-size: 10px; color: gray;">We support JPG, PNG or GIF</span>
     
        <div class="form-container-main grid-container content-wrapper">
    <form action="FileUpload" method="POST" enctype="multipart/form-data">
	    <br/>
             <div class="input-group email">
                                <label for="txtEmail">Email</label>
                                <div class="input-element">
                                    <input type="text" class="error" name="email1" id="email1" tabindex="8" maxlength="60">
                                </div>
                                
                            </div><br/><br/>
          
            Select File:&nbsp;&nbsp;&nbsp;<input type="file" class="button-primary" name="img"  size='50'><br><br>
   
            
            <input type="submit" name="btn_add" class="button-primary float-right" value="Upload" >
          </form>
   <script>
    email1.value = localStorage.getItem('email');
   
</script>
        </div>
       
    </div>
  
</div>  
	  
 <br><br>
    </div>
 </section></div>
<script>
function openCity(evt, cityName) {
  var i, tabcontent, tablinks;
  tabcontent = document.getElementsByClassName("tabcontent");
  for (i = 0; i < tabcontent.length; i++) {
    tabcontent[i].style.display = "none";
  }
  tablinks = document.getElementsByClassName("tablinks");
  for (i = 0; i < tablinks.length; i++) {
    tablinks[i].className = tablinks[i].className.replace(" active", "");
  }
  document.getElementById(cityName).style.display = "block";
  evt.currentTarget.className += " active";
}
document.getElementById("defaultOpen").click();
</script>
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
            String fn = request.getParameter("fname");
            String ln=request.getParameter("lname");        
            String pwd=request.getParameter("address");   
            String cty = request.getParameter("city");
            String zc=request.getParameter("zip");
            String country = request.getParameter("country");
            String cont=request.getParameter("contact");
            String sum=request.getParameter("summ");
            session.setAttribute("userId", mail);
        if(request.getParameter("btn_submit")!=null && request.getParameter("email")!=null)    
        {   
            pst=conn.prepareStatement("select UEMAIL from PERSONAL where UEMAIL ='"+mail+"' " );
            rst=pst.executeQuery();
            if(rst.next()==true)
            {
                pst = conn.prepareStatement("update PERSONAL set UFNAME=?, ULNAME=?, UADDRESS=?, UCITY=?, UZIPCODE=?, UCOUNTRY=?, UCONTACT=?, USUM=? where UEMAIL=?");
                pst.setString(1, fn);  
                pst.setString(2, ln);
                pst.setString(3, pwd);
                pst.setString(4, cty);
                pst.setString(5, zc);  
                pst.setString(6, country);
                pst.setString(7, cont);
                pst.setString(8, sum);
                pst.setString(9, mail);
                int xm = pst.executeUpdate();
      }
            else
            {
                pst = conn.prepareStatement("insert into PERSONAL(UEMAIL,UFNAME,ULNAME,UADDRESS,UCITY,UZIPCODE,UCOUNTRY,UCONTACT,USUM) values(?,?,?,?,?,?,?,?,?)");  
                pst.setString(1, mail);
                pst.setString(2, fn);  
                pst.setString(3, ln);
                pst.setString(4, pwd);
                pst.setString(5, cty);
                pst.setString(6, zc);  
                pst.setString(7, country);
                pst.setString(8, cont);
                pst.setString(9, sum);
                int xm = pst.executeUpdate(); 
                 
            }
          
             int r=1,xw=0;
                while(r!=9)
                {
                    String pos=request.getParameter("pos"+r);
                    String cmp=request.getParameter("com"+r);
                    String st=request.getParameter("stw"+r);
                    String end=request.getParameter("enw"+r);
                    String des=request.getParameter("dew"+r);
                    pst = conn.prepareStatement("insert into WORKEX values (?,?,?,?,?,?)");
                    r++;
                    pst.setString(1, mail);
                    pst.setString(2, pos);
                    pst.setString(3, cmp);
                    pst.setString(4, st);
                    pst.setString(5, end);
                    pst.setString(6, des);
                    if(pos==null)
                        break;
                     xw =pst.executeUpdate();
                } 
                
            int s=1;
            while(s!=9)
            {
                String tit=request.getParameter("pr"+s);
                String start=request.getParameter("stp"+s);
                String end=request.getParameter("enp"+s);
                String des=request.getParameter("pro"+s);
                           s++;
                pst = conn.prepareStatement("insert into PROJECT values (?,?,?,?,?)");
                pst.setString(1, mail);
                pst.setString(2, tit);
                pst.setString(3, start);
                pst.setString(4, end);
                pst.setString(5, des);
                if(tit==null)
                    break;
                int xtp=pst.executeUpdate();
                 }         
        int c=1;   
          while(c!=9)
            {
                 String cert=request.getParameter("tit"+c);
                String des=request.getParameter("des"+c);
                pst = conn.prepareStatement("insert into CERTIFICATE values (?,?,?)");
                c++;
                pst.setString(1, mail);
                pst.setString(2, cert);
                pst.setString(3, des);
                if(cert==null)
                    break;
                int xs=pst.executeUpdate();
                }
              int j=1;
             while(j!=9)
            {
                String skill=request.getParameter("ss"+j);
                if(skill==null)
                    break;
                pst = conn.prepareStatement("insert into SKILLS values (?,?)");
                j++;
                
                pst.setString(1, mail);
                pst.setString(2, skill);
                
               int xr=pst.executeUpdate();
                 
            }
             
            int k=1; 
            while(k!=9)
            {
                String pro=request.getParameter("ed"+k);
                String instt=request.getParameter("inst"+k);
                String st=request.getParameter("std"+k);
                String endd=request.getParameter("end"+k);
                String cgpa=request.getParameter("cgp"+k);
                pst = conn.prepareStatement("insert into EDUCATION values (?,?,?,?,?,?)");
                pst.setString(1, mail);
                pst.setString(2, pro);
                pst.setString(3, instt);
                pst.setString(4, st);
                pst.setString(5, endd);
                 pst.setString(6, cgpa);
                  k++;
                if(pro==null)
                    break;
                int xp=pst.executeUpdate();
                
            }
                int q=1;
            while(q!=9)
            {
                String lang=request.getParameter("ll"+q);
                pst = conn.prepareStatement("insert into LANGUAGE values (?,?)");
                q++;
                pst.setString(1, mail);
                pst.setString(2, lang);
                if(lang==null)
                    break;
                int xt=pst.executeUpdate();
                
            }
                int p=1;
             while(p!=9)
            {
                String hob=request.getParameter("tb"+p);
                pst = conn.prepareStatement("insert into UHOBBY values (?,?)");
                p++;
                pst.setString(1, mail);
                pst.setString(2, hob);
                if(hob==null)
                    break;
               int xx=pst.executeUpdate();
                       
            }%>
            <script>
           Swal.fire('', 'All Details Saved Successfully', 'success'); 
           
            </script>
            <%
        }
            
    }
    catch(Exception exec) 
    {
        exec.printStackTrace();
    }
            
   
%>
