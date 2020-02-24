package com.slk.practicaltest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UserLogout
 */
public class UserLogout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");

		PrintWriter outPut = response.getWriter();
		// Cookie ck = new Cookie("userName", "");
		HttpSession httpSession = request.getSession();
		Auth obj= (Auth) httpSession.getAttribute("userObj");
		if (obj.logedin==true) {

			obj.setLogedin(false);
			httpSession.removeAttribute("userName");
			httpSession.getMaxInactiveInterval();
			outPut.print("<script>alert('User Logout!!!!!!!!!!!!');</script> ");

			request.getRequestDispatcher("Userlogin.html").include(request, response);

		}
		else
		{
			outPut.print("<script>alert('User Logout!!!!!!!!!!!!');</script> ");

			request.getRequestDispatcher("Userlogin.html").include(request, response);
		}
//		httpSession.invalidate();
//		ck.setMaxAge(0);
//		response.addCookie(ck);

	}

}
