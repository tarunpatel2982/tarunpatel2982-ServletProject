package com.slk.loginHttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HttpProfile
 */
public class HttpProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		response.setContentType("text/html");
		

		PrintWriter printWriter = response.getWriter();
		request.getRequestDispatcher("link2.html").include(request, response);
		
		printWriter.print("<h1>hello</h1>");
		
		HttpSession httpSession = request.getSession(false);
		
		
		
		
		if(httpSession!=null)
		{
			String name = (String) httpSession.getAttribute("uname") ;
			printWriter.print("<h2>Hello</h2> <h1>" + name  + "</h1><h2> Welcome to profile </h2>" );
		}else
		{
			printWriter.print("please login");
			
			request.getRequestDispatcher("loginHttpsession.html").include(request, response);
		}
		
		printWriter.close();
	}

}
