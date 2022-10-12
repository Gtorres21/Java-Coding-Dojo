<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<style>
	*{
	margin: 0.25%;
	}
</style>
</head>
<body>
	<div class="d-flex justify-content-evenly">
		 <h1>${book.title}</h1> 
		 <a href="/dashboard">Back to the shelves</a>
	</div>
	<div class="container">
		<div class="row">
		<h3>${book.user.userName} read ${book.title} by ${book.author}</h3>
		<br>
		<h4>Here are ${book.user.userName}'s thoughts:</h4>
		</div>
		<div>
			<p id="my_thoughts">
				${book.thoughts}
			</p>
		</div>
		<div class="d-flex justify-content-between">
			<div class="col-6">
			</div>
			<div class="col-6 d-flex">
				<c:if test="${user_id == book.user.id }">
					<a href="/book/edit/${book.id}" class="btn btn-primary">Edit</a>
					<form action="/book/delete/${book.id}" method="post">
						<input type="hidden" name="_method" value="delete"/>
						<input type="submit" value="Delete" class="btn btn-danger">
					</form>
				</c:if>
			</div>
		</div>
		
	
	</div>




</body>
</html>