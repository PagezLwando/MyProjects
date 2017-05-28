<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : applynow
    Created on : May 12, 2017, 10:04:34 PM
    Author     : Lwando
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8"
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
        <link rel="shortcut icon" href="../favicon.ico">
	<link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="../css/styles.css">
	<link rel="stylesheet" type="text/css" href="../css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">
	<title>
		SJC | Apply
	</title>
</head>
<body style="background-color: #f2f2f2;">
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
				<li class="active">
                                    <a href="../pages/applynow.jsp"> Apply </a></li>
				<li><a href="../pages/contact.jsp"> Contact </a></li>
				<li><a href="../pages/gallery.jsp"> Gallery </a></li>
				<li style="float: right;"><a>
                                        <span class="glyphicon glyphicon-search"></span>
                                    </a></li>
				<li style="float: right;">
                                    <a href="../pages/home.jsp">
                                        <span class="glyphicon glyphicon-home"></span>
                                    </a>
                                </li>
			</ul>
		</div>
		<p>

        <span style="color: black;width: 96%">
            <b> BASIC INFORMATION OF THE APPLICANT </b>
        </span>
        <form action="../NewApplicant" method="POST">
                    <label> First Name: </label>
                    <fieldset>
                        <input type="text" name="firstName" placeholder="First Name:" required>
                    </fieldset>
                    <label> Last Name: </label>
                    <fieldset>
                        <input type="text" name="lastName" placeholder="Last Name:" required>
                    </fieldset>
                    <label> Title: </label> 
                        <input type="checkbox" name="Mr" value="Mr"> Mr 
			<input type="checkbox" name="Miss" value="Miss"> Miss
                        <input type="checkbox" name="Mrs" value="Mrs"> Mrs <br>
                        (Please check one of the boxes above)
                        <br>
                        <label> Gender: </label><select name="gender">
                            <option>male</option>
                            <option>female</option>
                        </select>
                        
                        <br>
                    <label> Date of Birth: </label>
                    <fieldset>
                        <input type="text" name="dateOfBirth" 
                               placeholder="dd-mm-yyyy:" required>
                    </fieldset>
                    <label> Identity No.: </label>
                    <fieldset>
                        <input type="text" name="identityNumber" 
                               placeholder="id no." required>
                    </fieldset>
                    <label> Email Address:</label>
                    <fieldset>
                        <input type="email" name="emailAddress" placeholder="E-mail" required>
			(Used for communication only or help send you documents)
                    </fieldset>
                    <label> Cell Number: </label>
                    <fieldset> 
                        <input type="text" name="cellNumber" placeholder="Cell Number:" />
                    </fieldset>
                    
                    <label> Grade you applying for </label>
                    <fieldset>
                        <select name="grade" onselect="1" required>           
                            <option> Select grade </option>
                            <option name="grade08"> Grade 08 </option>
                            <option name="grade10"> Grade 10 </option>
                        </select>
                    </fieldset>
			<hr>
		<input type="checkbox" name="Yes" required>
                    Terms and conditions<br>
                    (Please read the 
                        <a href="../access/termsAndConditions.htm">terms and conditions</a>)
                <fieldset>
                    <input class="submit" type="submit" name="submit" value="Submit">
                    <input class="reset" type="reset" name="cancel" value="Reset.">
                </fieldset>
	</form>
        <div class="footer">
            &copy 2016 St John's College<br>
            Developed by <a href="lwandonodume@gmail.com">lwandonodume@gmail.com</a>
            <div class="div">
                <a href="#"><img src="../images/facebook.jpg" width="20" height="20"></a>
                <a href="#"><img src="../images/instagram.png" width="20" height="20"></a>
                <a href="#"><img src="../images/youtube.jpg" width="20" height="20"></a>
                <a href="#"><img src="../images/location.jpg" width="20" height="20"></a>
            </div>
        </div>
    </div>
</body>
</html>