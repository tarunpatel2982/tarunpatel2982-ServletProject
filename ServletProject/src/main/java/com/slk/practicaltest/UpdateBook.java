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
					
					
					if(del.equals(bookId1))
					{
						String bookName= book.getBookName();

						String bookPrice= book.getBookPrice();

						String bookAuthor= book.getBookAuthor();
						
						outPut.print("<html>");
						
						outPut.print("<form  method='get' action='UpdateBookData' style='margin-left: 42%;margin-top: 22%;'>");
						outPut.print("<table>");
						outPut.print("<input type='hidden' name='bookId' value='" + bookId1 + "'>");
						outPut.print("<tr><td><label>Book Name </label></td><td><input type='text' name='bookName' value='"+ bookName+"'placeholder='Enter Book Name'></td></tr>");
						outPut.print("<tr><td><label>Book Price </label></td><td><input type='text' name='bookPrice' value='"+ bookPrice+"'placeholder='Enter Book Name'></td></tr>");
						outPut.print("<tr><td><label>Author Name </label></td><td><input type='text' name='bookAuthor' value='"+ bookAuthor+"'placeholder='Enter Book Name'></td></tr>");
						
						outPut.print("<table>");
						outPut.print("");
						outPut.print("");
						outPut.print("");
						outPut.print("<input type='submit' value='Update'>");
						outPut.print("</form>");
						outPut.print("");
						outPut.print("</html>");
					}	
				}
			
			outPut.close();
		}
	}

	

