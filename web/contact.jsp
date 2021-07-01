<%-- 
    Document   : newjsp4
    Created on : 5 Mar, 2021, 6:29:17 PM
    Author     : Isha Sharma
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    


     <link href="https://craftmycv.com/css/app.css" rel="stylesheet">   
     <style>
         
         
         
/* Contact us Page */

.static-page .layer{position:absolute;}
.static-page .static-bg .layer-01{left:-75px; top:120px; z-index:1;}
.static-page .static-bg .layer-02{right:0; top:390px;}


.static-page .static-container{position:relative; z-index:1; padding:50px 0 85px; max-width: 1100px; margin: 0 auto;}
.static-page .static-container-inner{background-color:#FFF; box-shadow:0 6px 15px rgba(0,0,0,.16); padding:60px; font-size:15px; line-height:1.4;}
.static-page .static-container-inner h3{font-size:20px; margin:25px 0 5px;}
.static-page .static-container-inner p{margin-bottom:15px;}
.static-page .static-container-inner ul,
.static-page .static-container-inner ol{margin-bottom:15px;}
.static-page .static-container-inner li{margin-bottom:15px;}
.static-page .static-container-inner ul ul,
.static-page .static-container-inner ol ol{margin-top:15px;}


.contact-page .contact-form .layer-03{ bottom:110px;}


.contact-page .contact-form{background-color:#FFF; max-width:550px; width:100%; 
             box-shadow:0 6px 10px rgba(0,0,0,.1); position:relative; height: 650px;margin-left: 300px; margin-top: 10px;border-radius: 30px;}
.contact-page .contact-form-inner{padding:40px 65px;}
.contact-page .contact-form-header{padding-bottom:20px;}
.contact-page .contact-form-header h3{font-size:26px;}
.contact-page .contact-form .action-row .btn{min-width:145px;}
.contact-page .contact-info{color:black; padding:50px 40px 0 0; max-width:600px; flex-grow:1;}
.contact-page .contact-info-inner{max-width:420px; margin-left: -60px; margin-top: -100px;}
.contact-page .contact-info-body .info-list > li{display:flex; margin:25px 0; font-size:16px;}
.contact-page .contact-info-body li.mob .key{display:block; color:#A1A6B2; font-size:14px;}
.contact-page .contact-info-body li .key{font-weight:700;}
.contact-page .contact-info-body li.mob a{color:#FFF; font-weight:700;}
.contact-page .contact-info-body li .img-wrap{margin-right:20px;}
.contact-page .contact-info-body li .icon-wrap{width:47px; height:47px; background-color:#FFF; color:#212529; font-size:22px;}
.contact-page .contact-info-body li address strong{font-weight:700; display:block;}
.contact-page .contact-info-body li .img-cont{display:flex; align-items:flex-start; justify-content: center; 
         flex-direction: column; line-height:1.4; font-size:18px;}
.know-more-section{background-color:#47B5D6; color:#FFF; padding:40px 0;}
.know-more-section h3{font-size:29px; font-weight:900; margin-bottom:10px;}
.know-more-section .action-row{margin:30px 0 0;}
.know-more-section .btn{font-size:20px;padding:21px 20px; min-width:260px; height:auto; line-height:1; }



     </style>



</head>


<body>
    
    <div class="contact-page static-page bg-whit" style="
         clip-path: ellipse(800px 800px at 30% 50%);
         background-image:  linear-gradient(to right bottom, 
     rgba(30, 210, 255, 0.6),
     rgba(30, 210, 200, 0.6)),
     url('bg.svg');
    " >

  
             <section class="form-section" >
    	<div class="container">
	    	<div class="form-section-inner d-flex static-container" >

		    	<div class="contact-form">

			    	<div class="contact-form-inner">
			    		<div class="contact-form-header">
                                            <h3><b>Get in touch</b></h3>
			    		</div>
			    		<div class="contact-form-body">
			    			<form method="POST"  id="contact-form">
                                <input type="hidden" name="_token" value="IF8fp1ovYn1WaO8j14A7SY2psn6aNyjhedhXdIth">                  <input type="text" id="website" name="website" style="display:none" value="" />
				    			<div class="row">
				    				<div class="col-md-12">
				    					<div class="form-group">
				    					   <label for="full-name">First Name<i class="text-danger"> * </i></label>
				    					   <input type="text" class="form-control" name="txtfname" required value="" />
				    					 </div>
				    				</div>

				    			</div>
                                <div class="row">
				    				<div class="col-md-12">
				    					<div class="form-group">
				    					   <label for="full-name">Last Name<i class="text-danger"> * </i></label>
				    					   <input type="text" class="form-control" name="txtlname" required value="" />
				    					 </div>
				    				</div>

				    			</div>
				    			<div class="row">
				    				<div class="col-md-12">
				    					<div class="form-group">
				    					   <label for="email">Email Address<i class="text-danger"> * </i></label>
				    					   <input type="email" name="txtid" class="form-control" required value="" />
                                            				    					 </div>
				    				</div>
				    			</div>
				    			<div class="row">
				    				<div class="col-md-12">
				    					<div class="form-group">
				    					   <label for="message">Message<i class="text-danger"> * </i></label>
				    					   <textarea class="form-control" id="message" name="txtmsg" rows="4"></textarea>
                                            				    					 </div>
				    				</div>
				    			</div>
                                <div class="g-recaptcha"
                                     data-sitekey="6LemAtwZAAAAAM4gpSfATpjt1yL_puqd6U0vGzDL">
                                </div>
                                                                <p></p>
                                <input type="hidden" name="recaptcha" id="recaptcha">
                              <div class="action-row">
                                  <input type="submit" style="      	display: inline-block;
  	border-radius: 100px;
  	transition: all .2s;
    border: none;
    outline: 0;
   color:  white;
  padding: 14px 28px;
  font-size: 16px;
  cursor: pointer;
  background-color:cornflowerblue;
  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2),0 6px 20px 0 rgba(0,0,0,0.19);"
                                       class="btn btn-orange"
                                       name="btn_submit"
                                       value="Send">
                              </div>
			    			</form>
			    		</div>
			    	</div>
		    	</div>
                                   
	    	</div>
    	</div>
    </section>
         
</div>         
<%  
    
    if(request.getParameter("btn_submit")!=null)
    {
        try
    {
        String fname=request.getParameter("txtfname"); 
        String lname=request.getParameter("txtlname");
        String emailid=request.getParameter("txtid");
        String msg=request.getParameter("txtmsg");
         Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");    
            PreparedStatement pst = conn.prepareStatement("select id from GET_IN_TOUCH order by id desc") ; 
            
            ResultSet rst = pst.executeQuery();
            int id = 1;
            if(rst.next()==true) 
            {    
                id = rst.getInt(1);
                id++;
                
            } 
            pst = conn.prepareStatement("insert into GET_IN_TOUCH values (?,?,?,?,?)");
            pst.setInt(1, id);
            pst.setString(2, fname);  
            pst.setString(3, lname);
            pst.setString(4, emailid);
            pst.setString(5, msg);
            int x=pst.executeUpdate();        
            if(x>0)  
                out.println("<script>alert('Message received successfully!')</script>");
                 
        }
    
        catch(Exception ex)
        {
            out.println("Error occurred.Kindly try again!"); 
        }
    }
    
    
%>




