<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login | Register</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col">
			<h1>Register</h1>
			<form:form action="/user/register" method="post" modelAttribute="newUser">
				<div class="form-group">
					<label>User Name</label>
					<form:input path="userName" class="form-control" />
					<form:errors path="userName" class="text-danger" />
				</div>
				<div class="form-group">
					<label>Email</label>
					<form:input path="email" class="form-control" />
					<form:errors path="email" class="text-danger" />
				</div>
				<div class="form-group">
					<label>Password</label>
					<form:input path="password" class="form-control" />
					<form:errors path="password" class="text-danger" />
				</div>
				<div class="form-group">
					<label>Confirm Password</label>
					<form:input path="confirm" class="form-control" />
					<form:errors path="confirm" class="text-danger" />
				</div>
				<input type="submit" value="Register User" class="btn btn-primary" />				
			</form:form>
		</div>
		<div class="col">
		<h1>Login</h1>
		<form:form action="/user/login" method="post" modelAttribute="loginUser">
		<div class="Form=group">
			<label>Email</label>
			<form:input path="email" class="form-control" />
			<form:errors path="email" class="text-danger" />
		</div>
		<div class="form-group">
			<label>Password</label>
			<form:input path="password" class="form-control" />
			<form:errors path="password" class="text-danger" />
		</div>
		<input type="submit" value="Login" class="btn btn-primary" />	
		</form:form>
		</div>
	</div>
</div>


</body>
</html>