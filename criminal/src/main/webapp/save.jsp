<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<title>Criminal Details</title>

<style>
body {
	text-align: center;
	padding-top: 15px;
}

label {
	display: inline-block;
	width: 80px;
}

body {
	background-size: 100%;
	background-position: center;
	background-repeat: no-repeat;
}
</style>
</head>
<body>

	<!-- Image and text -->
	<nav class="navbar navbar-dark bg-dark">
		<a class="navbar-brand" href="#"> <img
			src=data:image/jpeg;base64,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
			width="55" height="45" class="d-inline-block align-top" alt="">
			Criminal Details
		</a>
		<div>
			<a class="btn btn-secondary" href="index.jsp">Home</a>
		</div>
	</nav>

	<h1>Criminal Details Saved Sucessfully...</h1>

	<%-- <br>
	<h1>Your ID Number:${entity.id}</h1>
	</br> --%>
	<div class="page">
		<table class="table table-striped table-dark">
			<thead>
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Name</th>
					<th scope="col">Image</th>
					<th scope="col">Crime</th>
					<th scope="col">Total Years of Awarded</th>
					<th scope="col">Alias Name</th>
					<th scope="col">Description</th>
					<th scope="col">Jail Name</th>

				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">${entity.id}</th>
					<td><img alt="Nothing"
						src="send/files/${entity.fileName}/?contentType=${entity.contentType}"
						width="80" height="75"></td>
					<td>${entity.name}</td>
					<td>${entity.crime}</td>
					<td>${entity.aliasName}</td>
					<td>${entity.awarded}</td>
					<td>${entity.description}</td>
					<td>${entity.jailName}</td>

				</tr>
				
			</tbody>
		</table>
	</div>

	
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