<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>
<html>
<?php
?>
<head>
<style>
.center {
	margin-left:auto;
	margin-right: auto;
	margin-top:20%;
	margin-right:30%;
	width: 30%;
	background-color: #F03;
	background-position: center;
	
}
#said{
	background-color: #00F;
	color:white;
	margin-top:10%;
	margin-left:80%;
	width: 20%;
		
}
input {
	width:180px;
	clear:left;
	text-align:right;
	padding-right:10px;
	float:right;
	background-color: #FFF;
}


#s {
	background-color: #FFF;
	font-weight: bold;
}
#bar {
	background-color: #00F;
	color: #FFF;
}
#bar {
	font-weight: bold;
	font-size: 24px;
}
.center #s {
	font-size: 18px;
}
.k {
	font-weight: normal;
}
.center #s #said {
	font-weight: bold;
}
</style>


</head>
<body>
<div id="bar"><span id="bar">
  <h1>
  Sign Up</span>
<h1> </div>
<div class="center">
<form  id="s" name ="signup" action="/social/response" method="POST">
<b>Name *<b> :<input type="text" name="uname" required = " required "> </br> </br></br>

<b>E_mail * <b>:<input type="text" name="email" required = " required "> </br> </br></br>
<b>Password * <b>:<input type="password" name="password" required = " required "> </br></br></br>
<button id="said" class="k" name="signup" >Sign Up </button>
</form>
</div>
</body>
</html>