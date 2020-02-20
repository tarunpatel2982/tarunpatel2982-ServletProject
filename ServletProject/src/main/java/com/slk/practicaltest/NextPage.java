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
 * Servlet implementation class NextPage
 */
public class NextPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		response.setContentType("text/html");
		
		PrintWriter outPut = response.getWriter();
		request.getRequestDispatcher("theme.html").include(request, response);
		
		outPut.print("<html>");
//		Cookie ck[] = request.getCookies();
		HttpSession httpSession = request.getSession(false);
		if(httpSession!=null)
		{
			String uname=(String) httpSession.getAttribute("userName");
			//outPut.print("<h1 class = 'val'> test Wellcome : " +  uname + "</h1");
			if(!uname.equals("") || uname!=null)
			{
				outPut.print("<link rel='stylesheet' href='com.css'>");
				outPut.print("<div class='topnav'>");
				outPut.print("<a class='active' href='#home'>Home</a>");
				outPut.print(" <div class='login-container'>");
				outPut.print("<form action='UserLogout'>");
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
