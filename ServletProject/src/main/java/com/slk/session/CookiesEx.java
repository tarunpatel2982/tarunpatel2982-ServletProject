package com.slk.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookiesEx
 */
public class CookiesEx extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");

		PrintWriter p = resp.getWriter();

		String s = req.getParameter("uname");
		p.println("Well Come  : " + s);
		
		
		Cookie ck = new Cookie("uname", s);
		resp.addCookie(ck);

		//p.print("check "+ ck);
		p.print("<form action ='SecondCookiesEx' method='post'>");

		p.print("<input type ='submit' value ='go'>");

		p.print("</form>");
		p.close();
	}

}
