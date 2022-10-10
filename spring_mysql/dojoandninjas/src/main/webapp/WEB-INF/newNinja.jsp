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
			<h2>New Ninja</h2>
			<div class="col-6 ">
				<form:form action="/ninja/create" method="post" modelAttribute="ninja" id="form">
					<form:select path="dojo">
						<c:forEach var="dojo" items="${allDojos}">
							<form:option  value="${dojo.id }" path="dojo" >
								<c:out value="${dojo.name} "/> 
							</form:option>
						</c:forEach>
					</form:select>
				    <p class="d-flex flex-column">
				        <form:label path="firstName">First Name: </form:label>
				        <form:errors path="firstName"/>
				        <form:input path="firstName"/>
				    </p>
				       <p class="d-flex flex-column">
				        <form:label path="lastName">Last Name: </form:label>
				        <form:errors path="lastName"/>
				        <form:input path="lastName"/>
				    </p>
				       <p class="d-flex flex-column">
				        <form:label path="age">Age: </form:label>
				        <form:errors path="age"/>
				       <form:input type="number"  path="age"/>
				    </p>
   
				    <input type="submit" value="Submit" class="btn btn-primary"/>
				</form:form>
			</div>

		<div class="col-6">
		</div>
 	</div>	

</body>
</html>