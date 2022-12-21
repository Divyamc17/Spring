<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>Insert title here</title>
<h1>Patient Registration Details</h1>
<style>
 body {
  text-align: center;
  padding-top:15px;
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
  <a class="navbar-brand" href="#">
    <img src="/docs/4.0/assets/brand/bootstrap-solid.svg" width="30" height="30" class="d-inline-block align-top" alt="">
    Patient Details
  </a>
</nav>


<div>
  <a href="Search.jsp">Search</a>
  </div>
  <form action="send" method="get" >
  Name  : <input type="text" name="name" value="${entity.name}"/>
  AgeGreaterThan  : <input type="number" name="age" value="${entity.age}"/>
  AgeLesserThan  : <input type="number" name="age" value="${entity.age}"/>
  <input class="btn btn-primary" type="submit" value="Search">
  </form>
  

<p Class="text-danger">${error}</p>
<c:forEach items="${list}" var="entity">
<table class="table table-striped table-dark">
  <thead>
    <tr>
      <th scope="col">#</th>
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
    <tr>
      <th scope="row">1</th>
      <td>${entity.name}</td>
      <td>${entity.email}</td>
      <td>${entity.age}</td>
      <td>${entity.mobileNo}</td>
      <td>${entity.gender}</td>
      <td>${entity.idCard}</td>
      <td>${entity.bplCard}</td>
      <td>${entity.insurence}</td>
    </tr>
    </tr>
  </tbody>
</table>
</c:forEach>
</form>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>