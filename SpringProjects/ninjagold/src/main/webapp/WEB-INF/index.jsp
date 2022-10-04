<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ninja Gold Game</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<style>
	*{
	margin:.5%;
	}
	#boxOne{
	border: 2px solid black;
	padding: 1%;
	}
	#boxTwo{
	border: 2px solid black;
	padding: 1%;
	}
	#boxThree{
	border: 2px solid black;
	padding: 1%;
	}
	#boxFour{
	border: 2px solid black;
	padding: 1%;
	}
</style>
</head>
<body>
	<div id="head">
	
	<label>Your Gold:</label>
	<input type="number" name="gold " value="${gold}">
	</div>
	
	<div id="row" class="d-flex justify-content-evenly">
		<div id="boxOne" class="col3 text-center">
		<h2>Farm</h2>
		<p>(earns 10-20 gold)</p>
		<form action="/processGold" method="post">
		<button>Find Gold!</button>
		<input type="hidden" name="name" value="farm">
		</form>
		</div>
		
		<div id="boxTwo" class="col3 text-center">
		<h2>Cave</h2>
		<p>(earns 5-10 gold)</p>
		<form action="/processGold" method="post">
		<button>Find Gold!</button>
		<input type="hidden" name="name" value="cave">
		</form>
		</div>
		
		<div id="boxThree" class="col3 text-center">
		<h2>House</h2>
		<p>(earns 2-5 gold)</p>
		<form action="/processGold" method="post">
		<button>Find Gold!</button>
		<input type="hidden" name="name" value="house"> 
		</form>
		</div>
		
		<div id="boxFour" class="col3 text-center">
		<h2>Quest</h2>
		<p>(earns/takes 0-50 gold)</p>
		<form action="/processGold" method="post">
		<button>Find Gold!</button>
		<input type="hidden" name="name" value="quest">
		</form>
		</div>
		
	</div>
	
	<div id="rowTwo">
	<h2>Activities:</h2>
	<div><textarea rows="10" cols="200">You entered a ${name} and earned ${gold}.</textarea></div>
	</div>
	
	<a href="/delete" class="btn btn-primary">Reset</a>
	
	
	

</body>
</html>