package com.slk.url;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoUrl
 */
public class DemoUrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		
		String n =  request.getParameter("uname");
		printWriter.print("Wellcome : " + n);
		printWriter.print("<br>");
		
		
		printWriter.print("<br><a href='DemoUrl2?uname="+ n+ "'>visit</a>");
		
		printWriter.close();
				//response.getWriter().append("Served at: ").append(request.getContextPath());
	}


}
