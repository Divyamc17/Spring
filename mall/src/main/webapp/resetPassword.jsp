<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<style >

.container{
        position: absolute;
        top: 50%;
        left: 50%;
        width:400px;
        padding: 40px;
        transform: translate(-50%,-50%);
        background:aquamarine;
        box-shadow: 0 15px 25px rgba(143,124,236, 0.7);
        border-radius: 10px;
        }

.pass_show{position: relative} 

.pass_show .ptxt { 

position: absolute; 

top: 50%; 

right: -220px; 

z-index: 2; 

color: #f36c01; 

margin-top: -10px; 

cursor: pointer; 

transition: .3s ease all; 

} 

.pass_show .ptxt:hover{color: #333333;} 

</style>
<script >
 $(document).ready(function(){
	$('.pass_show').append('<span class="ptxt">Show</span>');  
	});
	  

	$(document).on('click','.pass_show .ptxt', function()
			{ 

	$(this).text($(this).text() == "Show" ? "Hide" : "Show"); 

	$(this).prev().attr('type', function(index, attr){return attr == 'password' ? 'text' : 'password'; }); 

	});  
	


</script>
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

<form action="reset" method="get">

<div class="container">
	<div class="row">
		<div class="col-sm-10">
		    
		   <lSabel for="username" > Select Mall Name </lSabel> 
       <select class="form-control" aria-label="Default select example" name="name">
        <option selected>Open this select menu</option>
        <option value="Mantri">Mantri</option>
        <option value="Orion">Orion</option>
        <option value="Central">Central</option>
        <option value="Lulu">Lulu</option>
      </select>
      <br>
             
             <button class="btn btn-outline-dark btn-lg px-4" type="submit" value="">Submit</button>
             
             
         </div>   
            
		</div>  
	</div>
</div>

</form>

</body>
</html>