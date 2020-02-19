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
		
		
		if(userPassword.equals("123") && userName.equals("tarun"))
		{
			outPut.print("wellcome : " + userName);
			
			HttpSession session = request.getSession();
						session.setAttribute("userName", userName);
						outPut.print("<br>");	
						outPut.print("<h1><a href='NextPage'>Next Page </a></h1>");
			
			Cookie cookie = new Cookie("userName", userName);
			
			response.addCookie(cookie);
		}else
		{
			outPut.print("UserName And Password Wrong !!!!! ");
			request.getRequestDispatcher("Userlogin.html").include(request, response);
		}
		outPut.close();
	}

}
