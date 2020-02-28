<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="com.css"> 
<h1 class="text1">Wellcome User</h1>	
		<div class="topnav">
		<center><marquee behavior="slide"="down"><h2 style="color: white;">Hello </h2></marquee></center>
		 
		</div>
</head>
<body>

<% 
	String typeUser =request.getParameter("u");
	String typeAdmin =request.getParameter("a");
	
	out.print("test user: " +  typeUser);
	out.print("test admin: " +  typeAdmin);
%>
<form action="userPage" class="userform" method="post">
		<h1 class="sig">User Login </h1>
		<table class="table1">
		 <input type="hidden" name="u" value=<%=request.getParameter("u") %>> 
		  <input type="hidden" name="a" value=<%=request.getParameter("a")%>> 
		<tr><td><lable>User Name </lable></td><td><input class="textbox" type="text" name="userMobileNo" placeholder="Enter Mobile No"></td></tr>
		<tr><td><lable>Password</lable></td><td><input  class="textbox"type="password" name="userPassword" placeholder="Enter Password"></td></tr>
		<tr><td></td><td><input class="btnsubmit" type="submit" value="Submit"></td></tr>
		
		
		
		</table>
	</form>
</body>
</html>