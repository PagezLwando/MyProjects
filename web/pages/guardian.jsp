<%-- 
    Document   : guardian
    Created on : May 23, 2017, 12:26:34 AM
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
	SJC | Guardian Info
    </title>
</head>
<body style="background-color: #f2f2f2;">
    <h1>
        <img src="../images/web.gif" width="90" height="90" alt="Bage"> St Johns College
    </h1>
    <hr>
    <div class="container">
        <ul>
            <li><a href="../index.jsp"> Home page </a></li>
            <li><a href="../pages/about.jsp"> About </a></li>
            <li><a href="../pages/alumni.jsp"> Alumni </a></li>
            <li class="active">
                <a href="../pages/applynow.jsp"> Apply </a></li>
            <li><a href="../pages/contact.jsp"> Contact </a></li>
            <li><a href="../pages/gallery.jsp"> Gallery </a></li>
            <li style="float: right;"><a><span class="glyphicon glyphicon-search"></span>
            </a></li>
            <li style="float: right;"><a href="../pages/home.jsp">
                <span class="glyphicon glyphicon-home"></span></a>
            </li>
        </ul>
    </div>
        <span style="color: black;width: 96%">
            <b> BASIC INFORMATION OF PARENT OR GUARDIAN </b>
        </span>
        <form action="/NewSupport" method="POST">
            <label> Guardians First Name: </label>
            <fieldset> 
                <input type="text" name="guardiansFirstName" placeholder="First Name:" required>
            </fieldset>
            <label> Guardians Last Name:</label>
            <fieldset>
                <input type="text" name="guardiansLastName" placeholder="Last Name:" required>
            </fieldset>
            <label> Guardians Id Number:</label>
            <fieldset>
                <input type="text" name="guardiansIdNumber" placeholder="ID no." required>
            </fieldset>
            <label> Guardians Cell Number: </label>
            <fieldset>
                <input type="text" name="guardianCellNumber" placeholder="Cell number:" required/>
            </fieldset>
            <label> country: </label>
            <fieldset>
                <select name="country">
                    <option name="--select--"> -- select-- </option>
            	    <option name="South Africa"> South Africa </option>
		    <option name="Zimbabwe"> Zimbabwe </option>
		    <option name="Mozambique"> Mozambique </option>
                    <option name="Botswana"> Botswana </option>
                    <option name="Zambia"> Zambia </option>
                    <option name="Nigeria"> Nigeria </option>
		</select>
            </fieldset>
            <label> Postal Address: </label>
            <fieldset>
                <input type="text" name="address" placeholder="P.O Box" required><br>
                <input type="text" name="address" placeholder="Mthatha" required><br>
                <input type="text" name="code" placeholder="South Africa" required>
            </fieldset>
            <label> Postal code: </label>
            <fieldset>
                <input type="text" name="code" placeholder="Postal Code" required>
            </fieldset>
            <br>
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
    </body>
</html>
