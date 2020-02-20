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
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//			pro(request, response);
		PrintWriter printWriter = response.getWriter();
		String bookId = request.getParameter("bookId");

		String bookName = request.getParameter("bookName");

		String bookPrice = request.getParameter("bookPrice");

		String bookAuthor = request.getParameter("bookAuthor");
		
		
		//printWriter.print("test id " + bookId);
		if(bArrayList.isEmpty())
		{
			//printWriter.print("test id " + bookId);
			if(bookId.equals(""))
			{
				printWriter.print("<script>alert('Enter BookId No')</script>");
				request.getRequestDispatcher("AddBook.html").include(request, response);
				//printWriter.print("if this");
			}
			else
			{
				//printWriter.print("test Array " + bArrayList);
				bArrayList.add(new Book(bookId,bookName,bookPrice,bookAuthor));

				HttpSession httpSession = request.getSession();
				httpSession.setAttribute("arraylist", bArrayList);
				request.getRequestDispatcher("AddBook.html").include(request, response);
				printWriter.print("<script>alert('===>>> Sucessfully Add data ')</script>");
			}
			
		}
		else
		{
				for (Book book : bArrayList) {
					String s=book.getBookId();
					
					//printWriter.print("test id " + s);
					if(!bookId.equals(s) &&  bookId !="")
					{
						bArrayList.add(new Book(bookId,bookName,bookPrice,bookAuthor));

						HttpSession httpSession = request.getSession();
						httpSession.setAttribute("arraylist", bArrayList);
						request.getRequestDispatcher("AddBook.html").include(request, response);
						printWriter.print("<script>alert('===>>> Sucessfully Add data ')</script>");
						
					}
					else
					{
						printWriter.print("<script>alert('===>>> Enter Valid BookId No ')</script>");
//							printWriter.print("Not Valid Record !!!!!");
							request.getRequestDispatcher("AddBook.html").include(request, response);
					}
					
					
				}

		}

		
	}

	

}
