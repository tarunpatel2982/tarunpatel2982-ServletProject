package com.slk.practicaltest;

public class Auth {

	boolean logedin;
	String userName;
	public Auth(boolean logedin, String userName) {
		
		this.logedin = logedin;
		this.userName = userName;
	}
	public boolean isLogedin() {
		return logedin;
	}
	public void setLogedin(boolean logedin) {
		this.logedin = logedin;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
//	@Override
//	public String toString() {
//		return "Auth [logedin=" + logedin + ", userName=" + userName + "]";
//	}
	
	
}
