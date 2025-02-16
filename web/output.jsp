<%-- 
    Document   : output
    Created on : 16 Feb 2025, 2:01:50 PM
    Author     : samuk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Output Page</title>
    </head>
    <body>
        <h1>Output Page </h1>
        
        <%
        String wearingMask = (String)request.getAttribute("wearingMask");
        String sanitizing = (String)request.getAttribute("sanitizing");
        int temp = (Integer)request.getAttribute("temp");
        String results = (String)request.getAttribute("results");
        %>
        
        <p>
            <%=results%>
        </p>
        
    </body>
</html>
