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
 * Servlet implementation class Book2
 */
public class Book2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		PrintWriter outPut = response.getWriter();
		
		HttpSession session = request.getSession();
		
		
		///request.getRequestDispatcher("BookManagement.html").include(request, response);
		ArrayList<Book> arrayList = (ArrayList<Book>) session.getAttribute("arraylist");
		outPut.print("<html>");
		outPut.print("<link rel='stylesheet' href='comman.css'>");
		outPut.print("<h1 class='tb1'><a href='AddBook.html'>Add Book</a></h1>");
		
		outPut.print("");
		outPut.print("<table style='border: 1px solid black;margin-left: 45%;margin-top: 2px;' >");
		outPut.print("<tr><th>ID </th><th>Book Name </th><th>Book Price </th><th>Book Author </th><th>Action</th></tr>");
		String bookId = null;
		for (Book book : arrayList) {
			outPut.print("<tr ><td style='border: 1px solid black;'>");
			bookId =book.getBookId();
			outPut.print(bookId);
			outPut.print("</td>");
			outPut.print("<td style='border: 1px solid black;'>");
			
			outPut.print( book.getBookName());
			outPut.print("</td>");
			outPut.print("<td style='border: 1px solid black;'>");
			outPut.print( book.getBookPrice());
			outPut.print("</td>");
			outPut.print("<td style='border: 1px solid black;'>");
			outPut.print( book.getBookAuthor());
			outPut.print("</td>");
			outPut.print("<td><a href='DeleteBook?bookId="+bookId+ "'>Delet Book</a></td>");
			outPut.print("<td><a href='UpdateBook?bookId="+bookId+ "'>update</a></td></tr>");
			
		}
		
		outPut.print("</table>");
		
		outPut.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
