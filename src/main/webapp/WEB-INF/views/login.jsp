<%@ include file="header.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
body {
	background-image: url("resources/images/signbg.jpg");
}
label{
	color: white;
}

h1{

    color: #000033;
    text-shadow: 0 0 5px #50829b, 0 0 10px #50829b,
             0 0 20px #50829b, 0 0 30px #50829b,
             0 0 40px #50829b;
    font-family: Comic Sans MS;    
             
}

#mail, #pass {
font-style: italic;
font-family: Comic Sans MS; 
color: black;
    text-shadow: 0 1px 0 #999999, 0 2px 0 #888888,
             0 3px 0 #777777, 0 4px 0 #666666,
             0 5px 0 #555555, 0 6px 0 #444444,
             0 7px 0 #333333, 0 8px 7px rgba(0, 0, 0, 0.4),
             0 9px 10px rgba(0, 0, 0, 0.2);
}

button {
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}

button:hover {
	opacity: 1;
}

.btn {
    background-color: grey;
	float: left;
	width: 50%;
	font-family: Arial Black;
	font-style: italic;
	color: blue;
	text-shadow: 0 0 5px #50829b, 0 0 10px #50829b,
             0 0 20px #50829b, 0 0 30px #50829b,
             0 0 40px #50829b;
}

#rem {
font-family: Arial Black;
}

#nu{
font-family: Arial Black;
color: dark blue
}


</style>

<title>Login</title>
</head>
<body>
<br> <br> <br>
<br> <br> <br>
<form class="form-horizontal" action="isvaliduser" method="post">

<div class="container">
			<h1 align="center">Login</h1>
			<br>
  <div class="form-group">
    <label id="mail" class="control-label col-sm-offset-2 col-sm-3" for="email">Email:</label>
    <div class="col-sm-3">
      <input type="email" class="form-control" name="email" id="email" placeholder="Enter email" required>
    </div>
  </div>
  <div class="form-group">
    <label id="pass" class="control-label col-sm-offset-2 col-sm-3" for="pwd">Password:</label>
    <div class="col-sm-3"> 
      <input type="password" class="form-control" name="password" id="pwd" placeholder="Enter password" required>
    </div>
  </div>
  
  <div class="form-group"> 
    <div class="col-sm-offset-5 col-sm-3">
      <button type="submit" class="btn" id="subbutton">Login!</button>
      <c:url value="/signup" var="register"></c:url><br>
	  <u><a id="nu" href="${register}">New User?</a></u>
    </div>
  </div>
</form>
<br> <br> <br>
<br> <br> <br>
<br> <br> <br>
<br> <br> <br>
</body>
</html>
