<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Expense</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div class=row>
		<h1>Expense Details</h1>
		<a href="/travels/new">Go Back</a>
	</div>
	<div class="row d-flex flex-row">
		<div class=col-6>
		<h3>Expense Name: </h3>
		<h3>Expense: Description: </h3>
		<h3>Vendor: </h3>
		<h3>Amount Spend: </h3>
		
		</div>
		<div class=col-6>
		<h3><c:out value="${oneTravel.expense}"/></h3>
		<h3><c:out value="${oneTravel.description}"/></h3>
		<h3><c:out value="${oneTravel.vendor}"/></h3>
		<h3><c:out value="${oneTravel.amount}"/></h3>
		
		</div>
	
	
	</div>
	




</body>
</html>