<%-- 
    Document   : hello
    Created on : Mar 10, 2020, 12:28:46 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>You're successfully log in</h1>
        <h1 style="font-size: 20px; color: red">User-name:</h1><br>
        <h1> <%= request.getParameter("username")%></h1><br>
        <h1 style="font-size: 20px;color: blueviolet">Password:</h1>
        <h1> <%= request.getParameter("usermail")%></h1>
    </body>
</html>
