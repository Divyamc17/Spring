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
		<a class="navbar-brand" href="#"> <img
			src="/docs/4.0/assets/brand/bootstrap-solid.svg" width="30"
			height="30" class="d-inline-block align-top" alt=""> Patient
			Details
		</a> <a class="btn btn-secondary" href="Search.jsp">Seach</a>
	</nav>
	<h1 style="text-align: center;">Patient Registration Details</h1>
	<!-- <div>
		<a href="">Search</a>
	</div> -->


	<p Class="text-success">${message }</p>
	<p Class="text-danger">${error}</p>

	<form action="send" method="post" enctype="multipart/form-data">
		<div>
			<label for="name">Name:</label> <input type="text" id="name"
				name="name">
		</div>
		<div>
			<label for="email">Email:</label> <input type="text" id="Email"
				name="email"><br>
		</div>
		<div>
			<label for="age">Age:</label> <input type="number" id="Age"
				name="age"><br>
		</div>
		<div>
			<label for="phone">Mobile No:</label> <input id="mobileNo"
				name="mobileNo" type="tel" placeholder="123-4567-8901" /><br>
		</div>
		<div class="form-check">
			<label>Gender:</label> <label class="form-check-label"> <input
				type="radio" class="form-check-input" name="gender">Female
			</label> <label class="form-check-label"> <input type="radio"
				class="form-check-input" name="gender">Male
			</label>
		</div>
		<div>
			Id Card Details:<select class="form-select" name=idCard>
				<option selected>Select Id Card</option>
				<option value="aadarcard">Aadhaar Card</option>
				<option value="voterid">Vooter ID</option>
				<option value="pancard">PAN card</option>
				<option value="drivingLicense">Driving License</option>
				<option value="rationcard">Ration card</option>
			</select><br> <br>
		</div>

		<div class="form-check">
			<label>BPL Card:</label> <label class="form-check-label"> <input
				type="radio" class="form-check-input" name="bplCard">Yes
			</label> <label class="form-check-label"> <input type="radio"
				class="form-check-input" name="bplCard">No
			</label>
		</div>
		<div class="form-check">
			<label>Insurence:</label> <label class="form-check-label"> <input
				type="radio" class="form-check-input" name="insurence">Yes
			</label> <label class="form-check-label"> <input type="radio"
				class="form-check-input" name="insurence">No
			</label>
		</div>

		<div>
			<label for="age">Image:</label> <input type="file" id="Age"
				name="image"><br>
		</div>
		<button class="btn btn-primary" type="submit">Save</button>
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