<%-- 
    Document   : SearchForm
    Created on : Sep 23, 2019, 9:13:35 AM
    Author     : sasadara_j
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search</title>
    </head>
    <body>
        <s:form action="jps/sasadara">
            <s:textfield label="Enter the language:" key="language"/>
            <s:submit/>
        </s:form>
        <!--<form method="post" action="jps/sasadara.action">
            <input id="language" name="language"/>
            <input type="submit"/>
        </form> -->
        
    </body>
</html>
