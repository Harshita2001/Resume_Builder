<%-- 
    Document   : logout
    Created on : 26 Mar, 2021, 1:42:17 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGOUT Page</title>
    </head>
    <body>
        <%

            session.invalidate();

        %>

        <h1><font color="Red">You are Sucessfully logged out...</font></h1>

        <a href="index.jsp">Go-Back To Home Page</a>

    </body>
</html>
