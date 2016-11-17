package edu.cvtc.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContactServlet
 */
@WebServlet("/ContactServlet")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final PrintWriter out = response.getWriter();
		out.append("<!doctype html>\n<html>\n\t<head>\n\t\t<title>Contact</title>\n\t</head>\n\t<body>");
		out.append("\n\t\t<h1>Contact</h1>");
		out.append("\n\t\t<p>Please leave your contact information. I will respond as soon as possible.</p>");
		out.append("\n\t\t<form>Name:<input type='text'name='name'id='name'value=''/>"
				+ "\n\t\t\t<p>Email: <input type='text' name='email' id='email' value='' </p>"
				+ "\n\t\t\t<p>Comments:</p>\t\t\n\t\t\t<p><textarea name='comments' id='comments' cols='25' rows='3'></textarea></p>"
				+ "\n\t\t\t<input type='submit' value='submit' />"
				+ "\n\t\t</form>");
		
		out.append("\n\t\t<p><a href=\"AboutServlet\">About</a>"
				+ " - <a href=\"ContactServlet\">Contact</a>"
				+ " - <a href=\"HomeServlet\">Home Page</a></p>");
		out.append("\n\t\t<p>\t&copy; Copyright 2016 Andrew Adolphson</p>"
				+ "\n\t</body>\n</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
