<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<title>Insert title here</title>

<style>
body {
	text-align: center;
	padding-top: 15px;
}

label {
	display: inline-block;
	width: 80px;
}
</style>
</head>
<body>

	<!-- Image and text -->
	<nav class="navbar navbar-dark bg-dark">
		<img alt=""
			src="https://img.freepik.com/free-vector/hospital-logo-design-vector-medical-cross_53876-136743.jpg?w=2000"
			width="75" height="25"> <a class="navbar-brand" href="#"style="text-align: left;">
			Patient Details </a> <a href="Search.jsp" style="text-align: right;">Search</a>
	</nav>

	<h1 style="text-align: center;">Patient Registration Details</h1>


	<form action="send" method="get">
		Name : <input type="text" name="name" /> AgeGreaterThan : <input
			type="number" name="greaterThanAge" value="0" /> AgeLesserThan : <input
			type="number" name="lesserThanAge" value="0" /> <input
			class="btn btn-primary" type="submit" value="Search">
	</form>


	<p Class="text-danger">${error}</p>
	<table class="table table-striped table-dark">
		<thead>
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Name</th>
				<th scope="col">Email</th>
				<th scope="col">Age</th>
				<th scope="col">MobileNo</th>
				<th scope="col">Gender</th>
				<th scope="col">Id-Proof</th>
				<th scope="col">BPL-Card</th>
				<th scope="col">Insurance</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="entity">

				<tr>
					<th scope="row">1</th>
					<td>${entity.id}</td>
					<td>${entity.name}</td>
					<td>${entity.email}</td>
					<td>${entity.age}</td>
					<td>${entity.mobileNo}</td>
					<td>${entity.gender}</td>
					<td>${entity.idCard}</td>
					<td>${entity.bplCard}</td>
					<td>${entity.insurence}</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
	</form>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>