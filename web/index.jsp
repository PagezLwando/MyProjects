<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : index
    Created on : Mar 28, 2017, 9:41:45 AM
    Author     : Lwando
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head id="head">

	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<link rel="stylesheet" type="text/css" href="css/styles.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <title>
		SJC | Home
	</title>
    </head>
        
    <body>
	<h1><img src="images/web.gif" width="90" height="90"> St Johns College </h1>
	<hr>
	<div class="container">
            <div>
                <ul>
                    <li class="active"><a href="index.jsp"> Home page </a></li>
                    <li><a href="pages/about.jsp"> About </a></li>
                    <li><a href="pages/alumni.jsp"> Alumni </a></li>
                    <li><a href="pages/applynow.jsp"> Apply </a></li>
                    <li><a href="pages/contact.jsp"> Contact </a></li>
                    <li><a href="pages/gallery.jsp"> Gallery </a></li>
                    <li style="float: right;"><a input="text">
                        <span class="glyphicon glyphicon-search"></span>
                    </a></li>
                    <li style="float: right;"><a href="pages/home.jsp">
                        <span class="glyphicon glyphicon-home"></span></a></li>
                </ul>
            </div>
        </div>
            <br>
		<p>
                    
                    Thank you very much for visiting our home page. 
                    Hope you will remain in our home for the next few 
                    minutes and get to know us well.<br> We encourage you to
                    contact either the Principal, staff or the students so 
                    that we can transcend the geographical,<br> cultural, and 
                    religious boundary to achieve the concept of global 
                    village.<br> St.John's College is a co-educational 
                    institution which caters for grade 8 to  grade 12 learners.
                    <br> The college offers residential facilities for the students.<br>
		</p>
	<center><img src="" width="800" height="200"></center>

	<div class="footer">
            &copy 2016 St John's College<br>
            Developed by <a href="#">lwandonodume@gmail.com</a>
		<div class="div">
                    <a href="#"><img src="images/facebook.jpg" width="20" height="20"></a>
                    <a href="#"><img src="images/instagram.png" width="20" height="20"></a>
                    <a href="#"><img src="images/youtube.jpg" width="20" height="20"></a>
                    <a href="#"><img src="images/location.jpg" width="20" height="20"></a>
            </div>
	</div>
	</div>
    </body>
</html>