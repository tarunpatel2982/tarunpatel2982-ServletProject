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
		<a class="active" ><%=request.getAttribute("uname") %></a>
		 
		</div>
	</head>
	<body>
		<form action="UserRegister" class="userform" method="post">
			<h1 class="sig">Signup User</h1>
			<table class="table1">
				<thead></thead>
				<tbody>
					<tr><td> FullName</td><td >	<input class="textbox"type="text" name="userName" placeholder="Enter Full Name "></td></tr>
					
					<tr><td> Password</td><td  ><input class="textbox" type="password" name="userPassword" placeholder="Enter Password "></td></tr>
					
												<input  type="hidden" name="userType" value="User"></td></tr>
					
					<tr><td> MobileNo </td><td ><input class="textbox" type="text" name="userMobileNo" placeholder="Enter Mobile no "></td></tr>
					
					<tr><td></td><td><input class="btnsubmit" type="submit" value="Register"></td></tr>
				</tbody>
			</table>
			
		</form>
	</body>
</html>