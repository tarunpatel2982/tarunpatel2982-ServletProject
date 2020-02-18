package com.slk.hidden;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoHidden2
 */
public class DemoHidden2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	
		
		response.setContentType("text/html");
		
		PrintWriter printWriter = response.getWriter();
		
		String n = request.getParameter("uname");
		printWriter.print("<h1>  Hello " + n + "</h1> ");
	}


}
