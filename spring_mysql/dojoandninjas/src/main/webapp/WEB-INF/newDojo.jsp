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
</head>
<body>

	 <div class="row">
			<h2>New Dojo</h2>
			<div class="col-6 ">
				<form:form action="/dojo/create" method="post" modelAttribute="dojo" id="form">
				    <p class="d-flex flex-column">
				        <form:label path="name">Name</form:label>
				        
				        <form:input path="name"/>
				    </p>
   
				    <input type="submit" value="Submit" class="btn btn-primary"/>
				</form:form>
			</div>

		<div class="col-6">
		</div>
 	</div>	

</body>
</html>