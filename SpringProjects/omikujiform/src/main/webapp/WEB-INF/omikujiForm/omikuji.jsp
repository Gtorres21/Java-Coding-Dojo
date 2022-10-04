<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<title>Insert title here</title>
<style>
	*{
	margin: .5%;
	}
</style>
</head>
<body>
	<h1>Omikuji</h1>
	<div id="container">
	<form action='/processForm' method="post">
		<label>Pick Any Number from 5 to 25</label>
		<input type=number name="num" min="5" max="25" class="form-control">
		<label>Enter the name of any city.</label>
		<input type="text" name="city"  class="form-control">
		<label>Enter the name any real person</label>
		<input type="text" name="name"  class="form-control">
		<label>Enter professional endeavor or hobby:</label>
		<input type="text" name="hobby"  class="form-control">
		<label>Enter any type of living thing.</label>
		<input type="text" name="thing"  class="form-control">
		<label>Say something nice to someone:</label>
		<input type="text" name="comment"  class="form-control">
		
		<i>Send and show a friend!</i>
		
		<button type="submit"  class="form-control btn btn-primary">Submit</button>
	
	</form>
	</div>

</body>
</html>