package com.slk.Loginexample;

import java.sql.Connection;
import java.sql.DriverManager;

import com.slk.Loginexample.*;


public class DBConnectionProvider {

	
	private static Connection con=null;
	
	static
	{
		try
		{
			
			Class.forName(Provider.DRIVER);
			con = DriverManager.getConnection(Provider.CONNECTION_URL,Provider.USERNAME,Provider.PASSWORD);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static Connection getCon()
	{
		return con;
	}
}
