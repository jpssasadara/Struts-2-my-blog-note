<%-- 
    Document   : login
    Created on : Sep 23, 2019, 10:40:47 AM
    Author     : sasadara_j
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Form</title>
    </head>
    <body>
        <h1>Sign In</h1>
    <s:form action="login">
        <s:textfield label="Login ID" key="user.userId" />
        <s:password label="Password" key="user.password"/>
        <s:submit/>
    </s:form>
    </body>
</html>
