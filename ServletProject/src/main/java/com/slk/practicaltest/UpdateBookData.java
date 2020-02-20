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
 * Servlet implementation class UpdateBookData
 */
public class UpdateBookData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String bookID = request.getParameter("bookId");

		String bookName = request.getParameter("bookName");

		String bookPrice = request.getParameter("bookPrice");

		String bookAuthor = request.getParameter("bookAuthor");
		
		
		PrintWriter outPut = response.getWriter();
		
//		outPut.print(bookID);
//		outPut.print(bookName);
//		outPut.print(bookPrice);
//		outPut.print(bookAuthor);
		
		
		HttpSession httpSession = request.getSession();
		ArrayList<Book> arrayList = (ArrayList<Book>) httpSession.getAttribute("arraylist");
		
		
		for (Book book : arrayList) {
			String bookId1=book.getBookId();
			
			
			if(bookId1.equals(bookID))
			{
				
				int in= arrayList.indexOf(book);
				
				//outPut.print("test : " + in);
				
				arrayList.set(in , new Book(bookID, bookName, bookPrice, bookAuthor));
//				arrayList.set(in , Book(bookID, bookName, bookPrice, bookAuthor));
				//outPut.print("sucessfully  update data !!!!!!!! ");
				outPut.print("<script>alert('===>>> Sucessfully Updated data')</script>");
			
			}
		}
		request.getRequestDispatcher("Book2").include(request, response);
		outPut.close();
	}

}
