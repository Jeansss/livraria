<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Lista de Autores</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
</head>
<body class="container">
	<form action="<c:url value="/autores"/>" method="POST">
		<div class="form-group">
			<label for="name">Name</label>
			<input id="name" class="form-control" name="name">
		</div>
		<div class="form-group">
			<label for="email">Email</label>
			<input id="email" class="form-control" name="email">
		</div>
		<div class="form-group">
			<label for="date">Date</label>
			<input id="date" class="form-control" name="date">
		</div>
		
		<input type="submit" value="Gravar" class="mt-2 btn-primary">
	</form>
<h1 class="h1 text-center">Lista de Autores</h1>
	<table class="table table-striped table-dark">
		<thead>
			<tr>
				<th>NAME</th>
				<th>EMAIL</th>
				<th>DATE</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${autores}" var="a">
			<tr>
				<td>${a.name}</td>
				<td>${a.email}</td>
				<td>${a.date}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>

</body>
</html>