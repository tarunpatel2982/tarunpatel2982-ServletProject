package com.slk.practicaltest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UserProfiles
 */
public class UserProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
		
		PrintWriter outPut = response.getWriter();
		request.getRequestDispatcher("theme.html").include(request, response);
		
		outPut.print("<html>");
//		Cookie ck[] = request.getCookies();
		HttpSession httpSession = request.getSession(false);
		
			Auth obj= (Auth) httpSession.getAttribute("userObj");
		
			String uname= obj.getUserName();
			   outPut.print("<script>alert('" + uname + "');</script> ");
			//outPut.print("<h1 class = 'val'> test Wellcome : " +  uname + "</h1");
			if(obj.logedin==true)
			{
				outPut.print("<link rel='stylesheet' href='com.css'>");
				outPut.print("<div class='topnav'>");
				//outPut.print("<a class='active' href='UserLogin'>Home</a>");
				
				outPut.print("<form action='Home' method='post'>");
				outPut.print(" <button type='submit'>Home</button>");
				outPut.print("</form>");
				
				outPut.print(" <div class='login-container'>");
				outPut.print("<form action='UserLogout' method='post'>");
				outPut.print(" <button type='submit'>Logout</button>");
				outPut.print("</form>");
				outPut.print("</div>");
				outPut.print(" </div>");
				outPut.print("<body>");
				outPut.print("<h1 class = 'val'> Wellcome : " +  uname + "</h1");
				outPut.print("</body>");
				
			}
			else
			{
				outPut.print("<script>alert('Please Login !!!')</scrtipt>");
				request.getRequestDispatcher("Userlogin.html").include(request, response);
			}
			
	
		
		outPut.print("</html>");
		outPut.close();
	}

}
