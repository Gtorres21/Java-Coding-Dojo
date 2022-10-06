<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<style>
	h2{
	margin-left: 2%;
	}
	#form{
	margin: 4%;
	}

</style>
</head>
<body>
	<h1>Save Travels</h1>
	
	<table class="table table-dark">
		<thead>
			<tr>
				<td>Expense</td>
				 <td>Vendor</td>
				 <td>Amount</td>
				 <td>Actions</td>
				 <td></td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="travel" items="${travels}"> 
				<tr>
					<td><a href="/travels/show/${travel.id}"><c:out value="${travel.expense}"/></a></td>
					<td> <c:out value="${travel.vendor}" /> </td>
					<td><c:out value="${travel.amount}"/>  </td>
					<td> <a href="/travels/edit/${travel.id}">edit</a></td>
					<td>
						<form action="/travels/delete/${travel.id}" method="post">
						    <input type="hidden" name="_method" value="delete">
						    <input class="btn btn-warning" type="submit" value="Delete">
						</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	 
	 <div class="row">
			<h2>Add an Expense</h2>
			<div class="col-6 ">
				<form:form action="/travels/create" method="post" modelAttribute="travel" id="form">
				    <p class="d-flex flex-column">
				        <form:label path="expense">Expense</form:label>
				        <form:errors path="expense"/>
				        <form:input path="expense"/>
				    </p>
				    <p class="d-flex flex-column">
				        <form:label path="vendor">Vendor</form:label>
				        <form:errors path="vendor"/>
				        <form:input path="vendor"/>
				    </p>
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
				    <input type="submit" value="Submit" class="btn btn-primary"/>
				</form:form>
			</div>

		<div class="col-6">
		</div>
 	</div>	
</body>
</html>