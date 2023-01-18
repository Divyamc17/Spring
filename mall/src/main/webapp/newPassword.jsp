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

right:-100px; 

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

<form action="forgotPassword" method="get">

<div class="container">
	<div class="row">
		<div class="col-sm-8.5">
		    
		    <label>Generate Password</label>
		    <div class="form-group pass_show"> 
                <input type="password" name="generatedPassword" class="form-control" placeholder="Current Password"> 
            </div> 
		       <label>New Password</label>
            <div class="form-group pass_show"> 
                <input type="password" name="password" class="form-control" placeholder="New Password"> 
            </div> 
		       <label>Confirm Password</label>
            <div class="form-group pass_show"> 
                <input type="password" name="password1" class="form-control" placeholder="Confirm Password"> 
            </div> 
            
            <button class="btn btn-outline-dark btn-lg px-4" type="submit" value="forgotPassword">Save</button>
            
		</div>  
	</div>
</div>
</form>

</body>
</html>