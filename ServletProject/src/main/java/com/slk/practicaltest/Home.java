package com.slk.practicaltest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.codec.binary.StringUtils;

/**
 * Servlet implementation class UserLogin
 */
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");

		PrintWriter outPut = response.getWriter();

		request.getRequestDispatcher("theme.html").include(request, response);

		String userName = request.getParameter("userName");
		String userPassword = request.getParameter("userPassword");

		

		boolean logedin = false;
		
		Auth auth =new Auth(logedin, userName);
		auth.setUserName(userName);
		auth.setLogedin(false);
		HttpSession session = request.getSession();
		
		Auth obj= (Auth) session.getAttribute("userObj");
	
			if(obj!=null)
			{
				outPut.print("<script>alert('execute if condition ');</script> ");
				
				

				outPut.print("<html>");
				outPut.print("<link rel='stylesheet' href='com.css'>");
				outPut.print("<body>");
				outPut.print("<div class='topnav'>");
				outPut.print("<form action='UserProfile' method='post'>");
				outPut.print(" <button type='submit'>User Profile</button>");
				outPut.print("</form>");

				outPut.print(" <div class='login-container'>");
				outPut.print("<form action='UserLogout' method='post'>");
				outPut.print(" <button type='submit'>Logout</button>");
				outPut.print("</form>");
				outPut.print("</div>");
				outPut.print(" </div>");

				outPut.print("<h1 class = 'val'> Home </h1>");
				outPut.print("</body>");
				
				outPut.print("</html>");
				
				
				
			}else if (userName.equals("tarun") && userPassword.equals("123"))
			{
			
					auth.setLogedin(true);
					auth.setUserName(userName);
					outPut.print("<script>alert('execute else if condition ');</script> ");
		
					outPut.print("<html>");
					outPut.print("<link rel='stylesheet' href='com.css'>");
					outPut.print("<body>");
					outPut.print("<div class='topnav'>");
					outPut.print("<form action='UserProfile' method='post'>");
					outPut.print(" <button type='submit'>User Profile</button>");
					outPut.print("</form>");
		
					outPut.print(" <div class='login-container'>");
					outPut.print("<form action='UserLogout' method='post'>");
					outPut.print(" <button type='submit'>Logout</button>");
					outPut.print("</form>");
					outPut.print("</div>");
					outPut.print(" </div>");
		
					outPut.print("<h1 class = 'val'> Home </h1>");
					outPut.print("</body>");
					
					outPut.print("</html>");
					
					session.setAttribute("userObj", auth);
					
					session.setMaxInactiveInterval(30); // 30 seconds
				
		}else
		{
			
			outPut.print("<script>alert('UserName && Password Wrong !!!!!!!!');</script> ");
			
			request.getRequestDispatcher("Userlogin.html").include(request, response);
		}
		
		
		
		outPut.close();
	}
}






//outPut.print("<script>alert('" + uname + "');</script> ");
//outPut.print("<script>alert('" + upass + "');</script> ");

//if (null == userPassword || userPassword.trim().length() == 0) {
//	outPut.print("<script>alert('UserName && Password Wrong !!!!!!!!');</script> ");
//	request.getRequestDispatcher("Userlogin.html").include(request, response);
//}
//
//if (null == upass && upass.trim().length() == 0) {
//	outPut.print("<script>alert('UserName && Password Wrong !!!!!!!!');</script> ");
//	request.getRequestDispatcher("Userlogin.html").include(request, response);
//}