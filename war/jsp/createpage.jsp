<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/social/createpage" method="post">
     pagename <input type="text" name="name"/><br>
	 pagetype <input type="text" name="type"/><br> 
     pagecategory <input type="text" name="category"/><br>
     
		<input	type="submit"value="createpage">
		
	</form>
	<form action="/social/likepage" method="post">
	
    enter page name <input type="text" name="name"/><br>
	 
     <input	type="submit"value="likepage">
		
	</form>
</body>
</html>