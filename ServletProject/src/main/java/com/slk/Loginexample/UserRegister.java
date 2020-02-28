package com.slk.Loginexample;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UserRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userMobileNo = request.getParameter("userMobileNo");
		String userPassword = request.getParameter("userPassword");
		String userName = request.getParameter("userName");
		String userType = request.getParameter("userType");
		
		
		System.out.println("test all data" + userMobileNo+""+userName+""+ userPassword+""+userType);
		
		PrintWriter out = response.getWriter();
		try {
			int status =CheckMobileNo.checkMobileNo(userMobileNo,userName,userPassword,userType);
			
			System.out.println("Test status : " + status);
			
			if(status>0)
			{
				request.getRequestDispatcher("UserHome.jsp").include(request, response);
				out.print("<script>alert('Sucessfully Regiterd!!!');</script>");
			}else
			{
				request.getRequestDispatcher("UserRegister.jsp").include(request, response);
				out.print("<script>alert('Not Regiterd!!!');</script>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
