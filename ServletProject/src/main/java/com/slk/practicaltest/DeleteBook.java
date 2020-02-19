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
 * Servlet implementation class DeleteBook
 */
public class DeleteBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	
	protected ArrayList<Book> remove(ArrayList<Book> bo)
	{
		
		return bo;
		
	}
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		   PrintWriter outPut =response.getWriter();
			
			String del = request.getParameter("bookId");
			
			
			//outPut.print("test : " + del);
			
			HttpSession session = request.getSession();
			
			ArrayList<Book> array= (ArrayList<Book>) session.getAttribute("arraylist");
			
		
				for (Book book : array) {
					String bookId1=book.getBookId();
					
					
					if(bookId1.equals(del))
					{
						//outPut.print("test id  " + bookId1);
						array.remove(book);
						//outPut.print("sucessfully Delete !!!!");
						request.getRequestDispatcher("Book2").include(request, response);
					
					}
					
				}
				
			outPut.close();
		}


}
