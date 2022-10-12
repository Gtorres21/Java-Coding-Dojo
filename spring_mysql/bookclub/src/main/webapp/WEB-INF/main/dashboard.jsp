<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	*{
	margin: 0.5%;
	}
</style>
</head>
<body>
<div class="row d-flex align-content-center">
	<div class="col ">
		<h1>Welcome, <c:out value="${loggedInUser.userName }"/></h1>
		<h4>Books from everyone's Shelves:</h4>
	
	</div>
	<div class="col-2 d-flex flex-column gap-1">
		<a href="/user/logout" class="btn btn-outline-danger btn-warning">Logout</a>
		<br>
		<a href="/book/new" class="btn btn-primary">+ Add to my shelf</a>
	</div>
</div>

<table class="table table-dark">
	<thead>
		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Author Name</th>
			<th>Posted By: </th>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="book" items="${allBooks}">
		<tr>
			<td>${book.id}</td>
			<td> <a href="/book/view/${book.id}">  ${book.title} </a> </td>
			<td>${book.author}</td>
			<td>${book.user.userName}</td>
		</tr>
		</c:forEach>
	</tbody>


</table>



</body>
</html>