<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<title>Display Omikuji</title>
<style>
	*{
		margin: .5%;
	}
	#container{
		background-color: cyan;
	}
</style>
</head>
<body>
	<h1>Here's Your Omikuji!</h1>
	<div id="container" class="border border-dark">
		<p>In ${num} years, you will live in ${city} with ${name} as your roommate, ${hobby}. The next time you see a ${thing}, you will have good luck. Also, ${comment}
		</p>
	</div>
	<a href="/">Go back</a>


</body>
</html>