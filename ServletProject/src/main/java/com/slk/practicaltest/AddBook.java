package com.slk.practicaltest;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BookServlet
 */
public class AddBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	ArrayList<Book> bArrayList= new ArrayList<Book>();
	
	protected void pro (HttpServletRequest request ,HttpServletResponse response) throws ServletException, IOException
	{
		
		
	
					
						
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//			pro(request, response);
		PrintWriter printWriter = response.getWriter();
		String bookId = request.getParameter("bookId");

		String bookName = request.getParameter("bookName");

		String bookPrice = request.getParameter("bookPrice");

		String bookAuthor = request.getParameter("bookAuthor");
		
						bArrayList.add(new Book(bookId,bookName,bookPrice,bookAuthor));

						HttpSession httpSession = request.getSession();
						httpSession.setAttribute("arraylist", bArrayList);
					
						request.getRequestDispatcher("AddBook.html").include(request, response);
						
			
		
	}

	

}
