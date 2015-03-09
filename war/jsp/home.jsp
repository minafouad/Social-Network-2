<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Insert title here</title>
<marquee direction="right" behavior="alternate">
            <h1>social network</h1></marquee>
            
            <marquee direction="left" behavior="alternate">
            <h1>${it.name}</h1></marquee>
            
</head>

<body>
<form action="/social/signout" method="post">
   
  <input type="submit" value="Sign Out"> 
  </form>

<p> Welcome b2a ya ${it.name} </p>
<p> This is should be user home page </p>
<p> Current implemented services "http://fci-swe-apps.appspot.com/rest/RegistrationService --- {requires: uname, email, password}" </p>
<p> and "http://fci-swe-apps.appspot.com/rest/LoginService --- {requires: uname,  password}" </p>
<p> you should implement sendFriendRequest service and addFriend service</p>

<form action="/social/acceptance" method="post">
    your name : <input type="text" name="uname" value="${it.name} " /> <br>
    acceptname: <input type="text" name="fname" /> <br>
   <input type="submit" value="Accept frind"> 
  </form>
</body>
</html>