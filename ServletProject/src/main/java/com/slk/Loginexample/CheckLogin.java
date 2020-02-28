package com.slk.Loginexample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CheckLogin {

	
	public static boolean isvalidate(String userMobilenNo,String userPassword ,String userType ) 
	{
		 boolean status =false;
		Connection con = null;
		ResultSet rs =null;
		con= DBConnectionProvider.getCon();
		Statement st;
		try {
			PreparedStatement ps = con.prepareStatement("select * from user where UserMobileNo=? and UserPassword=? and UserType=?");
			ps.setString(1, userMobilenNo);
			ps.setString(2, userPassword);
			ps.setString(3, userType);
			
			 rs=ps.executeQuery();
			
			status=rs.next();
			
			
			
			System.out.println("check sattus  : " + status);
			
		 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		return status;
		
	}
}
