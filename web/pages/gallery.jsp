<%-- 
    Document   : gallery
    Created on : May 13, 2017, 5:13:19 PM
    Author     : Lwando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="stylesheet" type="text/css" href="../css/slideshow.css">
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../css/styles.css">
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js.jquery-1.11.3.min.js"></script>
    <link href="http://fonts.googleapis..com/css?family=Open+Sans:400,600"
    rel="stylsheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <title> SJC | Gallery </title>
</head>
<body>
    <h1>
        <img src="../images/web.gif" width="90" height="90"> St Johns College
    </h1>
	<hr>
	<div class="container">
            <div>
		<ul>
                    <li><a href="../index.jsp"> Home page </a></li>
                    <li><a href="../pages/about.jsp"> About </a></li>
                    <li><a href="../pages/alumni.jsp"> Alumni </a></li>
                    <li><a href="../pages/applynow.jsp"> Apply </a></li>
                    <li><a href="../pages/contact.jsp"> Contact </a></li>
                    <li class="active"><a href="../pages/gallery.jsp"> Gallery </a></li>
                    <li style="float: right;"><a input="text">
                        <span class="glyphicon glyphicon-search"></span>
                    </a></li>
                    <li style="float: right;"><a href="../pages/home.jsp">
                        <span class="glyphicon glyphicon-home"></span>
                    </a></li>
		</ul>
            </div>
	<p>
        <hr>
        <br>
        <p style="text-align: center; font-size: 20px;">
	<div class="slideshow-container">
            <div class="mySlides fade">
                <div class="numbertext">1 / 4</div>
                <img src="../images/theFesci.JPG" style="width:900px; height: 600px;">
                <div class="text"> SJC students attended science festival in Grahamstown </div>
            </div>

        <div class="mySlides fade">
            <div class="numbertext">2 / 4</div>
                <img src="../images/mrMandM.jpg" style="width:900px; height: 600px;">
                <div class="text">During the OR Tambo Municipal district awards Mr 
                                Magaqa and Mr Matoti holding the District Award 
            </div>
        </div>

        <div class="mySlides fade">
            <div class="numbertext">3 / 4</div>
               <img src="../images/principalandstudents.jpg" style="width:900px; height: 600px;">
                <div class="text"> 2015 Students with SJC principal </div>
        </div>

        <div class="mySlides fade">
            <div class="numbertext">4 / 4</div>
            <img src="../images/joy.jpg" style="width:900px; height: 600px;">
            <div class="text"> SJC students celebrating in the Morning Assembly </div>
        </div>
        </div>
        <br>

            <div style="text-align:center">
                <span class="dot"></span>
                <span class="dot"></span>
                <span class="dot"></span>
                <span class="dot"></span>
            </div>

            <script>
            var slideIndex = 0;
            showSlides();

            function showSlides() {
                var i;
                var slides = document.getElementsByClassName("mySlides");
                var dots = document.getElementsByClassName("dot");
                for (i = 0; i < slides.length; i++) {
                   slides[i].style.display = "none";
                }
                slideIndex++;
                if (slideIndex> slides.length) {slideIndex = 1}
                for (i = 0; i < dots.length; i++) {
                    dots[i].className = dots[i].className.replace(" active", "");
                }
                slides[slideIndex-1].style.display = "block";
                dots[slideIndex-1].className += " active";
                setTimeout(showSlides, 2500); // Change image every 3 seconds
            }
            </script>
            
        <div class="footer">
         &copy 2016 St John's College<br>
         Developed by <a href="lwandonodume@gmail.com">lwandonodume@gmail.com</a>
            <div class="div">
                <a href="#">
                    <img src="../images/facebook.jpg" width="20" height="20"></a>
                <a href="#">
                    <img src="../images/instagram.png" width="20" height="20"></a>
                <a href="#">
                    <img src="../images/youtube.jpg" width="20" height="20"></a>
                <a href="#">
                    <img src="../images/location.jpg" width="20" height="20"></a>   
            </div>
            </div>
	</div>
    </body>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js.jquery-1.11.3.min.js"></script>
</html>