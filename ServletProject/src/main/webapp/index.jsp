<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="link.html" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		
<div class="topnav">
	
	 <form action="UserLogin.jsp" method="post">
		 <input type="hidden" name="u" value="User"> 
	  
	  	<input  type="submit" value="User">
    </form>
    
    
	 <form action="UserLogin.jsp" method="post">
		 <input type="hidden" value="Admin" name="a"> 
	  
	  	<input id="btnu" type="submit" value="Admin">
    </form>
  
</div>
	</head>
	<body>
	
	</body>
</html>