<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>SHOW TEMPLATES</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css">
        <link rel="stylesheet" type="text/css" href="page.css"> 
        <link rel="stylesheet" href="showtemplate2.css">
        <link rel="shortcut icon" type="image/gif/png" href="rb.png">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css">
    </head>
    <body>
        <br/>
        <hr>
        <br/>
       <center><h1 class="heading">SAMPLE TEMPLATES</h1></center>
        <section>

            <center><h1 class="heading">PROFESSIONAL RESUME TEMPLATES</h1></center>
            <div class="container">
                
                <h3 class="heading">Choose a template that suits your profile</h3>
             
                <hr>
                <div class="card-wrapper">
                    <div class="card" data-tilt>
                        <img src="templare2.jpeg" class="card-img">
                        <h1>WINDSER</h1>
                        <a href="windser.html" class="btn">VIEW</a>
                         <ul class="soial-media">
                         <center>  <li><i class="fa fa-eye" title="NO OF VIEWS" aria-hidden="true" style="color: cadetblue;"></i></li></center>
                   
                        </ul>
                    
                    </div>

                   

                    <div class="card">
                        <img src="template2.png" class="card-img">
                        <h1>ELEGANT</h1>
                        <a href="template2.png" class="btn">VIEW</a>
                        <ul class="soial-media" >
                            <center>  <li><i class="fa fa-eye" title="NO OF VIEWS" aria-hidden="true" style="color: cadetblue;"></i></li></center>
                        </ul>
                    </div>

                  >
            </div>
            <br/>
            <nav  class="navbar">
                <ul class="pagination justify-content-center fixed-bottom mb-5">
                    <li class="page-item" title="previous">
                        <a href="showtemplate2.jsp" class="page-link rounded-circle m-1"><i class="fas fa-chevron-left text-primary"></i></a>
                    </li>
                    <li class="page-item"><a href="showtemplate2.jsp" class="page-link rounded-circle m-1">1</a></li>
                    <li class="page-item  active"><a href="showtemplate2-copy.jsp" class="page-link rounded-circle m-1">2</a></li>
                    <li class="page-item" title="next">
                        <a href="showtemplate2-copy.jsp" class="page-link rounded-circle m-1"><i class="fas fa-chevron-right text-primary"></i></a>
                    </li>
                </ul>
            </nav>
    
        </section>
        <script type="text/javascript" src="vanilla-tilt.js"></script>
        <script type="text/javascript">
            VanillaTilt.init(document.querySelector(".card"), {
                max: 25,
                speed: 400
            });
            
            //It also supports NodeList
            VanillaTilt.init(document.querySelectorAll(".card"));
        </script>        
    </body>
</html>