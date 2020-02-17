package com.slk.first;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GenericServExample
 */
public class GenericServExample extends GenericServlet {
	

	 public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

 		response.getWriter().println("Hello Generic Servlet");
 	// TODO Auto-generated method stub
	}
}
