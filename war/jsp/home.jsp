<%@ page language="java" contentType="text/html; charset=windows-1256"

	pageEncoding="windows-1256"%>

    pageEncoding="windows-1256"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Insert title here</title>
<marquee direction="right" behavior="alternate">
	<h1>social network</h1>
</marquee>

<marquee direction="left" behavior="alternate">
	<h1>${it.name}</h1>
</marquee>

</head>

<body>
	<form action="/social/signout" method="post">

		<input type="submit" value="Sign Out"> <a
			href="/social/search/">search</a> <br>
	</form>


	<form action="/social/acceptance" method="post">

		acceptname: <input type="text" name="fname" /> <br> <input
			type="submit" value="Accept frind">
	</form>

	<form action="/social/sendMsg" method="post">
		Receiver name <input type="text" name="Rname" /> <br>
		<textarea name="Msg" rows="4" cols="50"></textarea>
		<br> <input type="submit" value="send Msg">
	</form>
	
	<form action="/social/notification" method="get">
     
		 <input	type="submit" value="see notification">
	</form>
	<form action="/social/showfriends" method="get">
     
		 <input	type="submit" value="show friends">
	</form>
	
	<form action="/social/groupchat" method="get">
     friend name:<input type="text" name="uname" /> <br>
		 <input	type="submit" value="groupchat">
	</form>
	<form action="/social/makepost" method="post">
		feelings<input type="text"name="feelings" /> <br>
		hashtag<input type="text"name="hash" /> <br>
		privacy<input type="text"name="privacy" /> <br>
		<textarea name="post" rows="4" cols="50"></textarea>
		<br> <input type="submit" value="post">
	</form>
	<form action="/social/likepost" method="post">
     postid <input type="text" name="ID" /> <br>
		 <input
			type="submit" value="like post">
			<a
			href="/social/createpage/">createpage</a> <br>
	</form>
	<form action="/social/sharepost" method="post">
     postid <input type="text" name="ID"/><br>
		 <input
			type="submit"value="share">
			${it.post}
	</form>
	
	<form action="/social/hashtag" method="post">
       hashtag <input type="text" name="hg"/><br>
		 <input
			type="submit"value="searchhashnum">
			${it.hg}
	</form>
	
	<form action="/social/Htag" method="post">
       hashtag <input type="text" name="htag"/><br>
		 <input
			type="submit"value="display post">
	</form>
</body>


		
			
	
</html>


