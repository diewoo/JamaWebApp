<%-- 
    Document   : Registro
    Created on : 4/06/2016, 10:37:24 AM
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        String usuario = "";
        String password = "";

        usuario = request.getAttribute("usuario").toString();
        password = request.getAttribute("password").toString();


    %>
    <body>
        <h1><%= usuario%></h1>
        <h1><%= password%></h1>
    </body>
</html>
