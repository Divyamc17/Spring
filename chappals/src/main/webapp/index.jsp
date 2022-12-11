<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<title>Insert title here</title>
</head>
<body>
</nav><!-- Just an image -->
<nav class="navbar navbar-Success bg-warning">
  <a class="navbar-brand" href="#">
    <img src="https://e7.pngegg.com/pngimages/310/332/png-clipart-computer-icons-home-house-desktop-service-home-blue-logo.png" width="40" height="40" alt="">
  </a>
  <div>
  <input type="text" placeholder="Search..">
  </div>
</nav>


<p Class="text-success">${message }</p>
<p Class="text-danger">${error}</p>

<form action="save" method="post" >
Brand<input type="text" name="brand" value=${entity.brand } ><br><br>
Price<input type="text" name="price" value=${entity.price }><br><br>
<label for="color">Choose a color:</label>

<select name="color" id="color" value=${entity.color } >
  <option value="Red">Red</option>
  <option value="Gold">Gold</option>
  <option value="White">White</option>
  <option value="Cream">Cream</option>
</select><br><br>

<label for="size">Choose a size:</label>

<select name="size" id="size" value=${entity.size }>
  <option value="36">36</option>
  <option value="38">38</option>
  <option value="40">40</option>
  <option value="42">42</option>
</select><br><br>

<label for="gender">Choose a Gender:</label><br>

<input type="radio"  name="gender" value=${entity.gender } >
<label for="Male">Male</label><br>
<input type="radio"  name="gender" value=${entity.gender } >
<label for="Female">Female</label><br>


<input class="btn btn-primary" type="submit" value="Submit">

</form>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>