<%-- 
    Document   : index
    Created on : 4/06/2016, 09:14:46 AM
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
    <head>
        <meta charset="UTF-8">


        <title>Yea!</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <script src="js/prefixfree.min.js"></script>
        <link href="css/animate.css" rel="stylesheet" type="text/css"/>

    </head>

    <body >

        <div class="body "></div>
        <div class="grad"></div>
        <div class="header">
            <div class="animated zoomIn">Jama!<span>Login</span></div>
        </div>
        <br>
        <form method="POST" action="LoginServlet">
        <div class="login">
            <input type="text" placeholder="usuario" name="user"><br>
            <input type="password" placeholder="password" name="password"><br>
            <div class="" ><input  type="submit" value="Login" ></div>
        </div>
        </form>
        
        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>





    </body>
</html>
