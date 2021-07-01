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
    <title>Executive</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
     <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
<script src="https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.9.2/html2pdf.bundle.js"></script> 
         <script src="https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.9.2/html2pdf.bundle.js"></script>

</head>
<style>
    * {
    margin:0;
    padding:0px;
    box-sizing: border-box;
}

/*body {
    padding: 50px 0px 0px 0px;
}*/
hr {
    margin: auto;
    width: 90%;
    color: grey;
}

.container {
    /*padding: 50px 0px 0px 0px;*/
    margin: 50px auto;
    display: flex;
    justify-content: flex-start;
    width: 90%;
    

}

aside, main section {
    background-color: white;
    border: 1px solid grey;
    box-shadow: 0px 0px 8px 8px #c9c9c9;
    flex: 3;
    /*height: auto;*/
    margin-right: 15px;

}

main {
    flex: 7;
}

main #first-section {
    margin-bottom: 50px;
}

.personal-img {
    width: 100%;
    height: auto;
}

.person-name {
    color: #5c5c5c ;
    font-size: 2vw;
    margin: 5px;
}

.personal-details, .details-list {
    font-size: 1.2vw;
    padding: 25px;
    list-style: none;
    color:#009688;
}

.details-list {
    padding-top: 0px;
}

.personal-details li{
    margin: 15px 0px;
    /*letter-spacing: .5px;*/
}

.personal-details li i {
    margin-right: 10px;

}

.details-list li {
    margin: 15px 0px;
}

.head-section {
    color: #5c5c5c;
    padding: 30px;
    margin: 0px;
    font-size: 1.6vw;
}

.head-section i{
    color: #009688;
}

.progress-back {
    border: 1px solid grey;
    border-radius: 15px;
    height: 1.5em;
    margin-top: 15px;
    text-align: justify;
}

.progress-text {
    color: white;
    text-align: center;
}

.progress {
    height: 100%;
    border-radius: 15px;
    background-color: #009688;
}

.p-100 {width: 100%;}
.p-95 {width: 95%;}
.p-90 {width: 90%;}
.p-85 {width: 85%;}
.p-75 {width: 75%;}
.p-30 {width: 30%;}

.data-details {
    width: 90%;
    margin: auto;
    padding: 40px 0px;
}

.data-details h3{
    font-size: 1.2vw;
    color: #5c5c5c;
    margin: 10px 0px;
}

.data-details > span{
    color: #009688;
    margin: 15px 0px;
    letter-spacing: 1px;
    font-weight: bold;
}
.green-span {
    background-color:#009688;
    padding: 5px;
    border-radius: 5px;
    font-weight: normal;
    color: white;
}

.fa-calendar-alt {
    margin: 0px 10px;
}

.data-details p {
    color: #5c5c5c;
    margin: 10px 0px;
    letter-spacing: .5px;
    line-height: 1.6;
}

footer {
    margin-top: 60px; 
    width: 100%;
    height: 150px;
    background-color: #009688;
    text-align: center;
    padding: 20px 0px;
    color: white;
    font-weight: bold;
    line-height: 2;
}

footer a {
    color: white;
    text-decoration: none;
    font-size: 1.2vw;
}
</style>
<body>

    <div class="container">
        <aside>
            <img class="personal-img" alt="personal image"src="sample-personal-image.jpg">
            <h2 class="person-name"> Awosome man</h2>
            <ul class="personal-details">
                <li> <i class="fas fa-user-tie"></i> Web Developer</li>
                <li> <i class="fas fa-globe-asia"></i> Somewhere, Anywhere</li>
                <li> <i class="fas fa-inbox"></i> Testing@testing.com</li>
                <li> <i class="fas fa-phone"></i> 123-456-789</li>
            </ul>

            <hr>
            <h2 class="head-section"><i class="fas fa-gem"></i> Skills </h2>
            <ul class="details-list">
                <li>
                    Python
                    <div class="progress-back">
                        <div class="progress p-85"><h4 class="progress-text">85%</h4> </div>
                    </div>
                </li>
                <li>
                    Data structure
                    <div class="progress-back">
                        <div class="progress p-75"><h4 class="progress-text">75%</h4> </div>
                    </div>
                </li>
                <li>
                    Git
                    <div class="progress-back">
                        <div class="progress p-90"><h4 class="progress-text">90%</h4> </div>
                    </div>
                </li>
                <li>
                    Team Work
                    <div class="progress-back">
                        <div class="progress p-95"><h4 class="progress-text">95%</h4> </div>
                    </div>
                </li>
            </ul>
            <hr>
            <h2 class="head-section"><i class="fas fa-language"></i> Languages </h2>
            <ul class="details-list">
                <li> 
                Arabic
                <div class="progress-back">
                    <div class="progress p-100"><h4 class="progress-text">100%</h4> </div>
                </div>
                </li>
                <li>
                English
                <div class="progress-back">
                    <div class="progress p-85"><h4 class="progress-text">85%</h4> </div>
                </div>
                </li>
                <li>
                German
                <div class="progress-back">
                    <div class="progress p-30"><h4 class="progress-text">30%</h4> </div>
                </div>
                </li>
                
            </ul>
        </aside>

        <main>
            <section id="first-section">
                <h2 class="head-section"><i class="fas fa-briefcase"></i> Work Experience </h2>
                <div class="data-details">
                    <h3>Data Scintest / somewhere.com</h3>
                    <span><i class="fas fa-calendar-alt"></i> Jan 2020 - <span class="green-span">Current</span></span>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                    tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
                    quis nostrud exercitation ullamco laboris nisi ut aliquip.</p>
                </div>
                <hr>
                <div class="data-details">
                    <h3>Automation Solutions / AutomationSolutions.com</h3>
                    <span><i class="fas fa-calendar-alt"></i> May 2018 - <span> Dec 2019</span></span>
                    <p>Reprehenderit in voluptate velit esse
                    cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
                    proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                </div>
                <hr>
                <div class="data-details">
                    <h3>Junior Developer / example.com</h3>
                    <span><i class="fas fa-calendar-alt"></i> Sep 2017 - <span>May 2018</span></span>
                    <p>Lesse
                    cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
                    proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                </div>
            </section>

            <section>
                <h2 class="head-section"><i class="fas fa-user-graduate"></i> Education </h2>
                <div class="data-details">
                    <h3>Masters Degree - Data Science</h3>
                    <span><i class="fas fa-calendar-alt"></i> Aug 2018 - <span>May 2020</span></span>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                    tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
                    quis nostrud exercitation ullamco laboris nisi ut aliquip.</p>
                </div>
                <hr>
                <div class="data-details">
                    <h3>Bachelor's  Degree - Computer Science</h3>
                    <span><i class="fas fa-calendar-alt"></i> Sep 2014 - <span>Jun 2018</span></span>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                    tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
                    quis nostrud exercitation ullamco laboris nisi ut aliquip.</p>
                </div>
                <hr>
                <div class="data-details">
                    <h3>High School</h3>
                    <span><i class="fas fa-calendar-alt"></i> <span>Jul 2014</span></span>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing.</p>
                </div>
            </section>
        </main>
    </div>

   
</body>
</html>