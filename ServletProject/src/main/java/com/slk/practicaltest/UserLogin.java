package com.slk.practicaltest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UserLogin
 */
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		response.setContentType("text/html");
		
		PrintWriter outPut = response.getWriter();
		request.getRequestDispatcher("theme.html").include(request, response);
		String userName = request.getParameter("userName");

		String userPassword = request.getParameter("userPassword");
		
		outPut.print("<html>");
		if(userPassword.equals("123") && userName.equals("tarun"))
		{
		
			//outPut.print("wellcome : " + userName);
		
			
			outPut.print("<link rel='stylesheet' href='com.css'>");
			outPut.print("<body>");
			outPut.print("<div class='topnav'>");
			outPut.print("<a class='active' href='#home'>Home</a><a href='NextPage'>Profile</a> ");
			outPut.print(" <div class='login-container'>");
			outPut.print("<form action='UserLogout'>");
			outPut.print(" <button type='submit'>Logout</button>");
			outPut.print("</form>");
			outPut.print("</div>");
			outPut.print(" </div>");
			
			
			
			outPut.print("<h1 class = 'val'> Home </h1>");
			outPut.print("</body>");
		
			
			HttpSession session = request.getSession();
						session.setAttribute("userName", userName);
						 session.setMaxInactiveInterval(30); // 30 seconds
//			Cookie cookie = new Cookie("userName", userName);
//			
//			response.addCookie(cookie);
		}else
		{
			outPut.print("<script>alert('UserName && Password Wrong !!!!!!!!');</script> ");
			request.getRequestDispatcher("Userlogin.html").include(request, response);
		}
		outPut.print("</html>");
		outPut.close();
	}

}
