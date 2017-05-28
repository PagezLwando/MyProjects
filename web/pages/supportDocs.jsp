<%-- 
    Document   : supportDocs
    Created on : May 23, 2017, 12:28:41 AM
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
            <ul>
                <li><a href="../index.jsp"> Home page </a></li>
                <li><a href="../pages/about.jsp"> About </a></li>
                <li><a href="../pages/alumni.jsp"> Alumni </a></li>
                <li class="active">
                    <a href="../pages/applynow.jsp"> Apply </a></li>
                <li><a href="../pages/contact.jsp"> Contact </a></li>
                <li><a href="../pages/gallery.jsp"> Gallery </a></li>
                <li style="float: right;"><a input="text" name="search">
                    <span class="glyphicon glyphicon-search"></span>
                </a></li>
                <li style="float: right;"><a href="../pages/home.jsp">
                    <span class="glyphicon glyphicon-home"></span></a>
                </li>
            </ul>
        </div>
        <form action="/NewSupport" method="POST" enctype="multipart/data">
            <fieldset>          
                <legend style="text-decoration-color: black; width: 96%">
                    <b> DOCUMENTS UPLOAD SECTION </b>
                </legend>
                <table border="0">
                <tr>
                    <td>ID Copy: </td>
                    <td><input type="file" name="idCopy" size="50" accept=".pdf"/></td>
                </tr>
                <tr>
                    <td>Latest Results: </td>
                    <td><input type="file" name="latestResults" size="50" accept=".pdf"/></td>
                </tr>
                <tr>
                    <td>Guardian ID Copy: </td>
                    <td><input type="file" name="guardianIdCopy" size="50" accept=".pdf"/></td>
                </tr>
                </table>
            </fieldset>
            <br>
            <input type="submit" value="submit" />
        </form>
    </body>
</html>
