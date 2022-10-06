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
<style>
	*{
	margin: .5%;
	}
</style>
</head>
<body>

	<div class="navbar">
	<h1>Edit Expense</h1>
	<a href="/travels/new">Go back</a>
	
	</div>

		 <div class="row">
			<div class="col-6 ">
				<form:form action="/travels/edit/${travel.id}" method="post"  modelAttribute="travel" id="form">
					<input type="hidden" name="_method" value="put">
				    <p class="d-flex flex-column">
				        <form:label path="expense">Expense</form:label>
				        <form:errors path="expense"/>
				        <form:input path="expense"/>
				    </p>
				    <p class="d-flex flex-column">
				        <form:label path="vendor">Vendor</form:label>
				        <form:errors path="vendor"/>
				        <form:input path="vendor"/>
				    </p >
				    <p class="d-flex flex-column">
				        <form:label path="amount">Amount</form:label>
				        <form:errors path="amount"/>
				        <form:input type="number" step="0.01" path="amount"/>
				    </p>
				    <p class="d-flex flex-column">
				        <form:label path="description">Description</form:label>
				        <form:errors path="description"/>     
				        <form:textarea path="description"/>
				    </p>    
				    <input type="submit" value="Submit" class="btn btn-warning"/>
				</form:form>
			</div>

		<div class="col-6">
		</div>
 	</div>	

</body>
</html>