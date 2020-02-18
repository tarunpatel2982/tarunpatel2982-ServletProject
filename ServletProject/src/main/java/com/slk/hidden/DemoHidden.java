package com.slk.hidden;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoHidden
 */
public class DemoHidden extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		PrintWriter printWriter = response.getWriter();
		String n = request.getParameter("uname");
		printWriter.print("test : " + n);
		
		
		printWriter.print("<form action='DemoHidden2'>");
		printWriter.print("<input type='hidden' name='uname' value='" + n + "'>");
		printWriter.print("<input type='submit' value='go'>");
		printWriter.print("</form>");
		printWriter.close();
	}

	

}
