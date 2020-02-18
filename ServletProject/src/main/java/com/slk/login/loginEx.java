package com.slk.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginEx
 */
public class loginEx extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		request.getRequestDispatcher("link.html").include(request, response);
		String name =request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		if(pass.equals("aaa"))
		{
			out.print("You Are Sucessfully  Login");
			out.println("<br>Welcome "+ name);
			Cookie c= new Cookie("uname",name);
			//out.print("Check Cookie : " + c);
			response.addCookie(c);
			
			
		}
		
		else
		{
			out.print("Sorry User Name And Password is wrong");
			
			request.getRequestDispatcher("login.html").include(request, response);
		}
//		out.println("User Name"  + name);
		out.close();
	
	}

}
