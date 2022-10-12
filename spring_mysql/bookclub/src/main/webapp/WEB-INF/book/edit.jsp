<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit a Book</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div class="row d-flex justify-content-between">
	<h1>Edit your Book!</h1>
	<a href="/dashboard">Back to the shelves</a>
	</div>
	<form:form action="/book/edit/${book.id}" modelAttribute="book" method="post">
	<input type="hidden" name="_method" value="put" />
	<form:input type="hidden" path="user" value="${user_id}"/>
	<div>
		<form:label path="title">Title</form:label>
		<form:input type="text" path="title"/>
		<form:errors path="title" />
	</div>
	<div>
		<form:label path="author">Author</form:label>
		<form:input type="text" path="author"/>
		<form:errors path="author" />
	</div>
	<div>
		<form:label path="thoughts">My thoughts</form:label>
		<form:textarea path="thoughts" cols="40" rows="10"/>
		<form:errors path="thoughts" />
	</div>
	<input type="submit" value="Edit" />
	</form:form>



</body>
</html>