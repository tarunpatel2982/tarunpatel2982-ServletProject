package com.slk.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondCookiesEx
 */
public class SecondCookiesEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		 
		Cookie ck[] =  request.getCookies();
		printWriter.print("Hello " + ck[0].getValue());
		
		printWriter.close();
	}

}
