
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
		
		<a style="float: right;"><% String name = request.getAttribute("UserName") %></a>
		 
		 <a href="profile.jsp">Profile</a>
		</div>
	</head>
	<body>
			
			
	</body>
</html>