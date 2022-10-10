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
	<h1><c:out value="${oneDojo.name}"/> Location Ninjas</h1>
	
	<table class="table table-dark">
		<thead>
			<tr>
				<td>First Name</td>
				 <td>Last Name</td>
				 <td>Age</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="ninja" items="${ninjas}"> 
				<tr>
					<td><c:out value="${ninja.firstName}"/></td>
					<td> <c:out value="${ninja.lastName}" /> </td>
					<td><c:out value="${ninja.age}"/>  </td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	
</body>
</html>