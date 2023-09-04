<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL</title>
</head>
<body>
<h1>JSP Expression Language jstl</h1>
<h2>Name : ${name} </h2>
<h2>ID   : ${id} </h2>
<hr>
	<h1>Getting Data using JSTL</h1>
	<h2>Id is : ${id}</h2>
	<h2>Name is :${name}</h2>
	<h2>Marks: ${m }</h2>
	
<hr>
	<c:forEach var="item" items="${m }">
		<h2><c:out value="${item}"></c:out></h2>
		<%-- <h2>${item}</h2> --%>
	</c:forEach>	

</body>
</html>