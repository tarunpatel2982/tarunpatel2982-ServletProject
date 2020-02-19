package com.slk.practicaltest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class NextPage
 */
public class NextPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		response.setContentType("text/html");
		
		PrintWriter outPut = response.getWriter();
		request.getRequestDispatcher("theme.html").include(request, response);
		HttpSession session = request.getSession();
		
		String userName = (String) session.getAttribute("userName");
		
		outPut.print("<h1> Wellcome : " +  userName + "</h1");
		outPut.print("<br>");
		outPut.print("<form action='UserLogout'>");
		outPut.print("<input type='submit' value = 'Logout'>");
		outPut.print("</form>");
		outPut.close();
	}
	

}
