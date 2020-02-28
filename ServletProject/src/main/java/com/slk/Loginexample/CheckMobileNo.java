package com.slk.Loginexample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CheckMobileNo {

	
	public static int checkMobileNo(String userMobileNo,String userName, String userPassword, String userType) throws SQLException
	{
		 int status =0;
		 
		 Connection con = DBConnectionProvider.getCon();
		
			Statement  st = con.createStatement();
		 ResultSet rs = null;
		 
		 rs = st.executeQuery("select * from user");
		 String mobno = null;
		 Boolean check=false;
		 while(rs.next())
		 {
			 mobno =rs.getString("UserMobileNo");
			 System.out.println("test : " + mobno);
			 
			 if(userMobileNo==null)
			 {
				 
				 check= true;
				 break;
				
			 }
			 else
			 {
				 check = userMobileNo.equals(mobno);
				 System.out.println("this is not null value ");
			 }
			 
				if( check == true  )
				{
					check=true;
					System.out.println("inner check : " + check);
					break;

				}
		 }
		 
		 
		 System.out.println("outer test check : " + check);
			if(check == false)
			{
				PreparedStatement ps =con.prepareStatement("insert into user(UserName,UserPassword,UserMobileNo,UserType) values (?,?,?,?)");
				
				ps.setString(1,userName);
				ps.setString(2,userPassword);

				ps.setString(3,userMobileNo);

				ps.setString(4,userType);
				status=ps.executeUpdate();
			}
			return status;
	}
}
