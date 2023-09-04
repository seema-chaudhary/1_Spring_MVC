<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login</h1>
<% 
String name = (String)request.getAttribute("name");
Integer id = (Integer)request.getAttribute("id");
%>
<h2>Name :  <%= name %> </h2>
<h2>ID   :   <%= id %> </h2>
</body>
</html>