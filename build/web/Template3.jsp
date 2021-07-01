<%@page import="java.security.interfaces.RSAKey"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*" %>
<%
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/bvdata");
    Statement stmt1=conn.createStatement();
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Responsive Resume UI Design in HTML and CSS</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="styles.css">
    <script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.9.2/html2pdf.bundle.js"></script> 
         <script src="https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.9.2/html2pdf.bundle.js"></script>
 
</head>
<style>
             .button {
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
         </style>
<style>
    @import url('https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap');

*{
    margin: 0;
    padding: 0;
    list-style: none;
    box-sizing: border-box;
    font-family: 'Roboto', sans-serif;
}

body{
    background: #c4c4c4;
    font-size: 14px;
    line-height: 20px;
}

.resume_wrapper{
    display: flex;
    width: 800px;
    margin: 50px auto;
    background: #fff;
    padding: 10px;
}

.resume_wrapper .resume_left{
    width: 35%;
    background: #26252d;
}

.resume_wrapper .resume_left .resume_image{
    width: 100%;
}

.resume_wrapper .resume_left .resume_image img{
    width: 100%;
    display: block;
}

.resume_wrapper .resume_title{
    color: #fff;
    text-transform: uppercase;
    font-weight: 700;
    font-size: 16px;
    margin-bottom: 10px;
    letter-spacing: 4px;
}

.resume_wrapper .resume_left .resume_info{
    color: #84838b;
}

.resume_wrapper .resume_left .resume_bottom{
    padding: 20px 30px;
}

.resume_wrapper .resume_item{
    padding: 20px 0;
    border-bottom: 1px solid #0175b2;
}

.resume_wrapper  .resume_item:last-child{
    border-bottom: 0;
}

.resume_wrapper .resume_left .resume_namerole{
    display: none;
}

.resume_wrapper .resume_namerole .name{
    font-size: 20px;
    color: #fff;
    text-transform: uppercase;
    font-weight: 700;
    margin-bottom: 5px;
    letter-spacing: 4px;
}

.resume_wrapper .resume_left .resume_namerole .role{
    color: #84838b;
}

.resume_wrapper .resume_left .resume_contact .resume_info:last-child{
     margin-top: 10px;
}

.resume_wrapper .resume_left .resume_contact .resume_subtitle{
    color: #fff;
    margin-bottom: 2px;
}

.resume_wrapper .resume_left .resume_skills .skills_list{
    display: flex;
    justify-content: space-between;
    margin-bottom: 5px;
}

.resume_wrapper .resume_left .resume_skills .skills_list .skills_bar p{
    position: relative;
    width: 125px;
    height: 20px;
    background: #fff;
}

.resume_wrapper .resume_left .resume_skills .skills_list .skills_bar p span{    
    position: absolute;
    top: 0;
    left: 0;
    background: #0175b2;
    width: 100%;
    height: 100%;
}

.resume_wrapper .resume_right{
    width: 65%;
    padding: 20px 40px;
    color: #26252d;
}

.resume_wrapper .resume_right .resume_namerole .name{
    color: #26252d;
    font-size: 32px;
}

.resume_wrapper .resume_right .resume_namerole .role{
    font-size: 14px;
    text-transform: uppercase;
}

.resume_wrapper .resume_right .resume_item .resume_title{
    color: #26252d;
}

.resume_wrapper .resume_right .resume_data{
    display: flex;
}

.resume_wrapper .resume_right .resume_data .year{
    padding-right: 35px;
    width: 115px;
    position: relative;
}

.resume_wrapper .resume_right .resume_data .content{
    padding-left: 35px;
    margin-bottom: 20px;
    width: calc(100% - 115px);
}

.resume_wrapper .resume_right .resume_data .year:before{
    content: "";
    position: absolute;
    top: 5px;
    right: 0;
    width: 10px;
    height: 10px;
    background: #fff;
    border: 1px solid #26252d;
    border-radius: 50%;
}

.resume_wrapper .resume_right .resume_data .year:after{
    content: "";
    position: absolute;
    top: 17px;
    right: 4px;
    width: 3px;
    height: 90%;
    background: #0175b2;
}

.resume_wrapper .resume_right .resume_data:last-child .year:after{
    display: none;
}

.resume_wrapper .resume_right .resmue_interests .resume_info{
    display: flex;
    justify-content: space-between;
    text-align: center;
}

.resume_wrapper .resume_right .resmue_interests .interests .int_icon{
    font-size: 38px;
    color: #0175b2;
    margin-bottom: 10px;
}

@media screen and (max-width: 800px){
    .resume_wrapper .resume_right .resume_namerole{
        display: none;
    }
    .resume_wrapper .resume_left .resume_namerole{
        display: block;
    }
    .resume_wrapper{
        width: 95%;
        margin: 10px auto;
        flex-direction: column;
    }
    .resume_wrapper .resume_left,
    .resume_wrapper .resume_right{
        width: 100%;
    }
}

@media screen and (max-width: 424px){
    .resume_wrapper .resume_right{
        padding: 20px 30px;
    }
    .resume_wrapper .resume_right .resume_data{
        flex-direction: column;
    }
    .resume_wrapper .resume_right .resume_data .year{
        padding: 0;
        margin-bottom: 5px;
        width: 100%;
        color: #0175b2;
    }
    .resume_wrapper .resume_right .resume_data .year:before,
    .resume_wrapper .resume_right .resume_data .year:after{
        display: none;
    }
    .resume_wrapper .resume_right .resume_data .content{
        width: 100%;
        padding: 0;
    }
    .resume_wrapper .resume_right .resmue_interests .interests .int_icon{
        font-size: 24px;
    }
}
</style>
<body>
<center>
        
        <br>
       <button id="download" class="button"><i class="fa fa-download" style="color: white"></i>DOWNLOAD</button>
        <input type="submit" formtarget="../resume_det.jsp" onclick="window.location.href='../resume_det.jsp'" name="submit2" value="edit details" class="button button-primary float-right" />
        
    </center>
<div class="resume_wrapper">
    <div class="resume_left">
         <%
                        
                    try
                        {
                            String mail = session.getAttribute("userId").toString();
        
                            String query1="Select * from PERSONAL where UEMAIL='"+mail+"' " ;
                            ResultSet rs=stmt1.executeQuery(query1);
                            
                            while(rs.next()==true)
                            {
                               %>
        <div class="resume_bottom">
            <div class="resume_item resume_namerole">
                <div class="name"><%=rs.getString("UFNAME") %>&nbsp;&nbsp; <%=rs.getString("ULNAME") %></div>
                <div class="role">UI Designer</div>
            </div>
            <div class="resume_item resume_profile">
                <div class="resume_title">Profile</div>
                <div class="resume_info"><%=rs.getString("USUM") %></div>
            </div>
            <div class="resume_item resume_address">
                <div class="resume_title">Address</div>
                <div class="resume_info">
                   <%=rs.getString("UADDRESS") %> &nbsp;&nbsp;<%=rs.getString("UZIPCODE") %><br/>
				<%=rs.getString("UCOUNTRY") %>
                </div>
            </div>
            <div class="resume_item resume_contact">
                <div class="resume_title">Contact</div>
                <div class="resume_info">
                    <div class="resume_subtitle">Phone</div>
                    <div class="resume_subinfo"><%=rs.getString("UEMAIL") %></div>
                </div>
                <div class="resume_info">
                    <div class="resume_subtitle">Email</div>
                    <div class="resume_subinfo"><%=rs.getString("UCONTACT") %></div>
                </div>
            </div>
               <% }
%> 
            <div class="resume_item resume_skills">
                <div class="resume_title">Skills</div>
                <div class="resume_info">
                    <div class="skills_list">
                        <div class="skills_left">HTML</div>
                        <div class="skills_bar">
                            <p>
                                <span style="width: 90%"></span>
                            </p>
                        </div>
                    </div>
                    <div class="skills_list">
                        <div class="skills_left">CSS</div>
                        <div class="skills_bar">
                            <p>
                                <span style="width: 80%"></span>
                            </p>
                        </div>
                    </div>
                    <div class="skills_list">
                        <div class="skills_left">Javascript</div>
                        <div class="skills_bar">
                            <p>
                                <span style="width: 50%"></span>
                            </p>
                        </div>
                    </div>
                    <div class="skills_list">
                        <div class="skills_left">Photoshop</div>
                        <div class="skills_bar">
                            <p>
                                <span style="width: 95%"></span>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="resume_right">
        <div class="resume_item resume_namerole">
            <div class="name">Rosie Jackson</div>
            <div class="role">UI Designer</div>
        </div>
        <div class="resume_item resume_education">
            <div class="resume_title">Education</div>
            <div class="resume_info">
                <div class="resume_data">
                    <div class="year">2000 - 2010</div>
                    <div class="content">
                        <p>Title</p>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                    </div>
                </div>
                <div class="resume_data">
                    <div class="year">2010 - 2013</div>
                    <div class="content">
                        <p>Title</p>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                    </div>
                </div>
                <div class="resume_data">
                    <div class="year">2013 - 2015</div>
                    <div class="content">
                        <p>Title</p>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                    </div>
                </div>
            </div>
        </div>
        <div class="resume_item resume_experience">
            <div class="resume_title">Experience</div>
            <div class="resume_info">
                <div class="resume_data">
                    <div class="year">2000 - 2010</div>
                    <div class="content">
                        <p>Title</p>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                    </div>
                </div>
                <div class="resume_data">
                    <div class="year">2010 - 2013</div>
                    <div class="content">
                        <p>Title</p>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                    </div>
                </div>
                <div class="resume_data">
                    <div class="year">2013 - 2015</div>
                    <div class="content">
                        <p>Title</p>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                    </div>
                </div>
                <div class="resume_data">
                    <div class="year">2013 - 2015</div>
                    <div class="content">
                        <p>Title</p>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                    </div>
                </div>
                <div class="resume_data">
                    <div class="year">2013 - 2015</div>
                    <div class="content">
                        <p>Title</p>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                    </div>
                </div>
            </div>
        </div>
        <div class="resume_item resmue_interests">
            <div class="resume_title">Interests</div>
            <div class="resume_info">
                <div class="interests">
                    <div class="int_icon">
                        <i class="fas fa-volleyball-ball"></i>
                    </div>
                    <div class="int_data">Volleyball</div>
                </div>
                <div class="interests">
                    <div class="int_icon">
                        <i class="fas fa-book-open"></i>
                    </div>
                    <div class="int_data">Reading</div>
                </div>
                <div class="interests">
                    <div class="int_icon">
                        <i class="fas fa-film"></i>
                    </div>
                    <div class="int_data">Movies</div>
                </div>
                <div class="interests">
                    <div class="int_icon">
                        <i class="fas fa-biking"></i>
                    </div>
                    <div class="int_data">Riding</div>
                </div>
            </div>
        </div>
    </div>
</div>
<%
                        }
                        catch(Exception ex)
                        {
                            ex.printStackTrace();
                        }
                  
                    %>
                        

<script>
    window.onload = function () {
    document.getElementById("download")
        .addEventListener("click", () => {
            const row1 = this.document.getElementById("doc2");
            console.log(row1);
            console.log(window);
            
            html2pdf().from(row1).save();
        })
}

</script>
</body>
</html>