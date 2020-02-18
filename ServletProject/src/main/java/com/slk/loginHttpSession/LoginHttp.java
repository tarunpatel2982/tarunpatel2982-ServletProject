package com.slk.loginHttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginHttp
 */
public class LoginHttp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter printWriter = response.getWriter();
		request.getRequestDispatcher("link2.html").include(request, response);
		String userName=request.getParameter("uname");
		String userPassword = request.getParameter("pass");
		printWriter.print("<br>");
		printWriter.print("test name  "+  userName + "  "  + userPassword);
		
		
		if(userPassword.equals("aaa"))
		{
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("uname", userName);
			
		}else
		{
			printWriter.print("sry user name and password Wrong !!");
			
			request.getRequestDispatcher("loginHttpsession.html").include(request, response);
		}
		
		printWriter.close();
	}

}
