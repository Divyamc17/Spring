<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" >  
<head>
<meta charset="ISO-8859-1">
<title> Login Form   
</title>  
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">  
</head>  
<style>  
body {  
  background: #0dcaf0; !important;  
  font-family: 'Muli', sans-serif;  
}  
h1 {  
  color: #fff;  
  padding-bottom: 2rem;  
  font-weight: bold;  
}  
a {  
  color: #333;  
}  
a:hover {  
  color: #E8D426;  
  text-decoration: none;  
}  
.form-control:focus {  
    color: #000;  
    background-color: #fff;  
    border: 2px solid #E8D426;  
    outline: 0;  
    box-shadow: none;  
}  
.btn {  
  background: #28a745;  
  border: #E8D426;  
}  
.btn:hover {  
  background: #28a745;  
  border: #E8D426;  
}  
</style>  
<body> 
    
    <nav class="navbar navbar-dark bg-dark" >
        <div class="container-fluid">
          <a class="navbar-brand" href="#">
            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRm4Uqexra566YlUNMbL3cyDgmEzY__Z3JQIw&usqp=CAU" alt="" width="35" height="45" class="d-inline-block align-text-top">
            Mall
          </a>
        </div>
      </nav>
<form action="mall" method="post">
<div class="pt-5"> 

  <h1 class="text-center">Please enter your login and password!</h1>  
<div class="container">  
                <div class="row">  
                    <div class="col-md-5 mx-auto">  
                        <div class="card card-body">  
                      <!-- <form id="submitForm"  data-parsley-validate="" data-parsley-errors-messages-disabled="true" novalidate="" _lpchecked="1"> -->  
<input type="hidden" name="_csrf" value="7635eb83-1f95-4b32-8788-abec2724a9a4">  
                   <div class="form-group required">  
              <lSabel for="username"> Enter your Name  </lSabel>  
             <input type="text" class="form-control text-lowercase" id="username" required="" name="adminName" value="">  
               </div>                      
       <div class="form-group required">  
    <label class="d-flex flex-row align-items-center" for="password"> Enter your Password   
     <a class="ml-auto border-link small-xl" href="resetPassword.jsp"> Forget Password? </a> </label>  
<input type="password" class="form-control" required="" id="password" name="password" value="">  
       </div>  
    
       <lSabel for="username"> Select Mall Name </lSabel> 
       <select class="form-control" aria-label="Default select example">
        <option selected>Open this select menu</option>
        <option value="Mantri">Mantri</option>
        <option value="Orion">Orion</option>
        <option value="Central">Central</option>
        <option value="Lulu">Lulu</option>
      </select>
<br>
         <div class="form-group pt-1">  
      <button class="btn btn-primary btn-block" type="submit"> Log In </button>  
                  </div>  
               <!-- </form>  --> 
             <p class="small-xl pt-3 text-center">  
       <span class="text-muted"> Not a member? </span>  
        <a href="#"> Sign up </a>  
                        </p>  
                        </div>  
                    </div>  
                </div>  
            </div>  
</div>
</form>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>  
</body>  
</html>