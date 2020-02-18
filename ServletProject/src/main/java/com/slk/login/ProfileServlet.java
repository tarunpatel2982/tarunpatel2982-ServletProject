package com.slk.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProfileServlet
 */
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		response.setContentType("text/html");
		
		PrintWriter printWriter = response.getWriter();
		
		request.getRequestDispatcher("link.html").include(request, response);
		
		Cookie ck[] = request.getCookies();
		
		
		
		if(ck!=null)
		{
			String name =ck[0].getValue();
			
			printWriter.print("check session value : " + name);
			
			if(!name.equals("") || name!=null)
			{
				printWriter.print("<br>Wellcome Profile ");
				printWriter.print("<br> wellcome  : " + name);
			}
			
		}else
		{
			printWriter.print("please login first");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		
		printWriter.close();
	}

}
