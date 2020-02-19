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
 * Servlet implementation class UpdateBook
 */
public class UpdateBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  PrintWriter outPut =response.getWriter();
			
			String del = request.getParameter("bookId");
			
			
			//outPut.print("test : " + del);
			
			HttpSession session = request.getSession();
			
			ArrayList<Book> array= (ArrayList<Book>) session.getAttribute("arraylist");
			
		
				for (Book book : array) {
					String bookId1=book.getBookId();
					
					
					if(bookId1.equals(del))
					{
						String bookName= book.getBookName();

						String bookPrice= book.getBookPrice();

						String bookAuthor= book.getBookAuthor();
						
						
						outPut.print("test " + bookAuthor);
						
						
						
					}	
				}
			
			outPut.close();
		}
	}

	

