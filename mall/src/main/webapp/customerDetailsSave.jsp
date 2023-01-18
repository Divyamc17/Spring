<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<style>

</style>

</head>

<body>
<nav class="navbar navbar-dark bg-dark" >
        <div class="container-fluid">
          <a class="navbar-brand" href="#">
            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRm4Uqexra566YlUNMbL3cyDgmEzY__Z3JQIw&usqp=CAU" alt="" width="35" height="45" class="d-inline-block align-text-top">
            Mall
          </a>
        </div>
      </nav>

<div class="page">
		<table class="table table-striped table-dark">
			<thead>
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Name</th>
					<th scope="col">Email</th>
					<th scope="col">MobileNo</th>
					<th scope="col">Age</th>
					<th scope="col">Country</th>
					<th scope="col">State</th>
					<th scope="col">City</th>
					<th scope="col">Pincode</th>
					

				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">${entity.id}</th>
					<td>${entity.name}</td>
					<td>${entity.email}</td>
					<td>${entity.mobileNo}</td>
					<td>${entity.age}</td>
					<td>${entity.country}</td>
					<td>${entity.state}</td>
					<td>${entity.city}</td>
					<td>${entity.pincode}</td>

				</tr>
				
			</tbody>
		</table>
	</div>


	
		
</body>
</html>