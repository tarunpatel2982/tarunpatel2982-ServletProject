package com.slk.Loginexample;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class userPage
 */
public class userPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Connection con=DBConnectionProvider.getCon();
	ResultSet rs =null;
	Statement st=null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String typeUser =request.getParameter("u");
		String typeAdmin =request.getParameter("a");
		String userMobileNo = request.getParameter("userMobileNo");
		String userPassword = request.getParameter("userPassword");
		
		PrintWriter out = response.getWriter();
		
		String userType= null;
		
		boolean status = false;
		
		if( typeUser!=null && typeUser.equals("User") )
		{
			userType =typeUser;
			status=	CheckLogin.isvalidate(userMobileNo,userPassword,userType);
			
			if(status == true)
			{
				PreparedStatement ps;
				
				
				try {
					ps = con.prepareStatement("select * from user where UserMobileNo=? ");
					ps.setString(1,userMobileNo);

					 rs=ps.executeQuery();
					
					while (rs.next()) {
						String uname=rs.getString("userName");
						System.out.println("test data : " + uname);
					}
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				request.setAttribute("UserName", userType);
				request.getRequestDispatcher("UserHome.jsp").include(request, response);
			}
			else
			{
				request.getRequestDispatcher("UserLogin.jsp");
				out.print("<script>alert('Enter User Name And Password Worng!!!');</script>");
					//System.out.println("user not login");
			}
			
		}else if(typeAdmin!=null && typeAdmin.equals("Admin"))
			{
				userType =typeAdmin;
				
				status =CheckLogin.isvalidate(userMobileNo,userPassword,userType);
				
			if(status == true)
			{
				String uname=null;
				
				PreparedStatement ps;
				
				
				try {
					ps = con.prepareStatement("select * from user where UserMobileNo=? ");
					ps.setString(1,userMobileNo);

					 rs=ps.executeQuery();
					
					while (rs.next()) {
						 uname=rs.getString("userName");
						System.out.println("test data : " + uname);
					}
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				request.setAttribute("uname", uname);
				request.getRequestDispatcher("UserRegister.jsp").include(request, response);
				out.print("<script>alert('Sucessfully Login!!!');</script>");
			}
			else
			{
				request.getRequestDispatcher("UserLogin.jsp").include(request, response);
					//System.out.println("user not login");
				
				out.print("<script>alert('Enter User Name And Password Worng!!!');</script>");
			}
				
		}else
		{
		//	System.out.println("user not found!!!");
			request.getRequestDispatcher("index.jsp").include(request, response);
		}
		
		
		
	}
	
	

}
