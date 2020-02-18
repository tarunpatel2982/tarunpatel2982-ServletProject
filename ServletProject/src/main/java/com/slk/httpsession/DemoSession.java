package com.slk.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DemoSession
 */
public class DemoSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		
		String s = request.getParameter("uname");
		printWriter.print("test name : " + s);
		
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("uname", s);
		
		printWriter.print("<a href='DemoSession2'>visit</a>");
		printWriter.close();
	}

	

}
