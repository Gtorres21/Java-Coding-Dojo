<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome <c:out value="${loggedInUser.userName }"/></h1>

<h2>This is your dashboard. Nothing to see here yet</h2>


<a href="/user/logout" class="btn btn-outline-danger btn-warning">Logout</a>



</body>
</html>