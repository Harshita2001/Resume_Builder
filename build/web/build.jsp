
<%-- 
    Document   : newjsp1
    Created on : 16 Feb, 2021, 7:22:04 PM
    Author     : Isha Sharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en-US" xml:lang="en-US">
<head>
    <meta charset="utf-8" />
   <meta name="viewport" content="width=device-width, initial-scale=1" minimum-scale="1">   
  <style>


          *{box-sizing:border-box}
        
              ol,ul{
              margin:0;
              padding:0;
              list-style:none}
       body{
              margin:0;
           padding:0;
             border:0;
              font-family:"Source Sans Pro",Arial,sans-serif;
              font-size:16px;
              line-height:1.5;
              font-weight:400;
                  color:#2b0c62;
              background-color:#f7f7f7;
              overflow-x:hidden;
              vertical-align:baseline;
              text-rendering:optimizeLegibility;
              -moz-text-size-adjust:none;-ms-text-size-adjust:none;text-size-adjust:none;-webkit-text-size-adjust:none
          }
       
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
</style>
<style>
    <%--loading--%>

     body.loadingBody{overflow:hidden;background:#fff!important}
     .waitPreLoad{display:none}
     .dvWizardloading{position:fixed;top:0;right:0;bottom:0;left:0;background:#fff;display:none;height:100%;width:100%;z-index:999}
           
           .wizardPreLoad{position:relative;width:450px;margin:15% auto 0;text-align:center}
           
           .wizardPreLoad h2{color:#2b0c62;font-size:0;font-weight:400;margin-bottom:20px;text-transform:uppercase;opacity:0}
           
           .wizardPreLoad .lines{position:absolute;top:35px;bottom:0;background:#f0f2fd;height:2px;width:100%}
           
           .wizardPreLoad .line-active{position:relative;top:-16px;background:#2b0c62;display:inline-block;
                       height:2px;width:0;font-size:2px;line-height:2px}
           
           .wizardPreLoad .load-texts-wrp{position:relative;top:25px;overflow:hidden;height:105px}
           
           .wizardPreLoad .load-texts{position:relative;top:-105px;bottom:0;left:0;width:450px}
           
           .wizardPreLoad .load-texts>div{color:#2b0c62;display:block;font-size:16px;margin-bottom:10px;overflow:hidden;line-height:18px}
           
           .wizardPreLoad .load-texts>div.ld-fn{display:none}
</style>
<style>
                            
                            @media only screen and (max-width:1023px){
                                
                                .hiw-cont .option-available .connecting-dot{width:120px;left:163px}}
                            .hiw-cont .cta-container{margin-bottom:20px}
                        
                            .hiw-new .hiw-content{display:-webkit-box;display:flex;
                                                  
                                        -webkit-box-pack:justify;justify-content:space-between;height:100vh;width:100%;min-height:600px}
                            .hiw-new .col-left{position:relative;
                                     background-size:cover;
                                    
                                     background-position:center top;height:100vh;width:36%}
                            
                            @media screen and (max-width:1349px){
                                
                                .hiw-new .col-left .affiliates-comp .img-col{margin:0 0 0 23px}
                            
                            
                            }
                      
                            .hiw-new .col-right{padding-left:90px;width:64%}
                            
                            @media only screen and (max-width:1023px){.hiw-new .col-right{padding-left:40px;width:57%}
                             .hiw-new .col-right .create-resume{padding-right:30px}}
                            
                            .hiw-new .col-right .create-resume{display:-webkit-box;display:flex;-webkit-box-orient:vertical;
                                          -webkit-box-direction:normal;flex-direction:column;-webkit-box-align:start;align-items:flex-start;
                                          -webkit-box-pack:center;justify-content:center;height:100vh;width:100%}
                            .hiw-new .col-right .create-resume h1{font-size:40px;font-weight:700;line-height:38px;margin:0 0 25px;
                                             max-width:550px}
                     
                            .hiw-new .col-right ul{counter-reset:section;margin:0 0 20px}
                            .hiw-new .col-right ul li{position:relative;font-size:18px;margin-bottom:18px}
                            .hiw-new .col-right ul li:before{height:30px;width:30px;display:inline-block;content:"";
                                   border-radius:50%;background-color:#00c293;vertical-align:middle}
                            
                            .hiw-new .col-right ul li:after{position:absolute;top:5px;left:3px;height:30px;width:30px;
                                  counter-increment:section;content:counter(section);border-radius:50%;
                                  background-color:#2b0c62;color:#fff;
                                  font-size:18px;font-weight:700;text-align:center;line-height:29px}
                            
                            .hiw-new .col-right ul li span{margin-left:15px;position:relative;top:5px}
                            
                            .hiw-new .button-primary{min-width:235px}

</style>
 
<script defer="defer" src="//ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js" ></script> 
<script defer="defer" src="https://cdnprod1.resumehelp.com/javascripts/app.min.js?v=1500"></script>
<script defer="defer" src="https://cdnprod1.resumehelp.com/javascripts/wizard/how-it-works-rb.min.js?v=1500"></script>
<script defer="defer" src="https://cdnprod1.resumehelp.com/javascripts/common/modernizr-webp.js?v=1500"></script>
</head>
<body class="bg-white hiw-new ">

        <header class="header"></header>
   


        <section>
            <div class="hiw-content">
                <div class="col-left">
                    <div class="affiliates-comp">

                        <div class="img-col">
                            <img src="images/3.jpeg" width="600px" height="640px"/>
                        </div>
                    </div>
                </div>
                <div class="col-right">
                    <div class="create-resume">
                        <h1>The easiest way to create a professional resume.</h1>
                        <ul>
                            <li><span>Choose your favorite resume Template.</span></li>
                            <li><span>Insert your Details Accurately.</span></li>
                            <li><span>Download and print your new resume.</span></li>
                        </ul>
                        <a href="resume_det.jsp"> <button class="button" id="btnCreateResume">BUILD YOUR RESUME</button></a>


                    </div>
                </div>
            </div>
        </section>
    



</body>
</html>