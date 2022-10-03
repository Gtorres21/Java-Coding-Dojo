<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<title>Fruity Loop</title>
</head>
	<body>
		<h1> Fruit Store </h1>
		<table class="table"> 
			<thead>
				<tr>
					<th>Name</th>
					<th>Price</th>
				</tr>	
			</thead>
			<tbody>
				<c:forEach var="fruit" items="${fruitsFromController}">
				<tr>
					<td>
						<c:out value="${fruit.name}"/>
					</td>
					<td>
						<c:out value="${fruit.price}"/>
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	
	
	</body>
</html>