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
	<div class="d-flex justify-content-between">
	<h1>All Dojos</h1>
	<div>
	<a href="/dojo/new" class="btn btn-primary">Create Dojo</a>
	<a href="/ninja/new" class="btn btn-warning">Create a Ninja</a>
	</div>
	</div>
	
	
	<table class="table table-dark">
		<thead>
			<tr>
				<td>Dojo Location</td>
				
			</tr>
		</thead>
		<tbody>
			<c:forEach var="dojo" items="${allDojos}"> 
				<tr>
					<td><a href="/dojo/show/${dojo.id}"><c:out value="${dojo.name}"/></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>