<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>home page</title>
<marquee direction="left" behavior="alternate">
	<h1>social network</h1>
</marquee>
<img src="image/logo.png" />
<marquee direction="left" behavior="alternate">
	<h1>home page of ${it.name}</h1>
</marquee>
</head>
<body>

	<p>${it.name} home page</p>
	<form action="/social/add" method="post">
		name : <input type="text" name="uname" value="${it.name} " /> <br>
		<input type="submit" value="add frind">

	</form>

</body>
</html>