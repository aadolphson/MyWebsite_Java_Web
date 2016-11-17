package edu.cvtc.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AboutServlet
 */
@WebServlet("/AboutServlet")
public class AboutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final PrintWriter out = response.getWriter();		
		out.append("<!doctype html>\n<html>\n\t<head>\n\t\t<title>About</title>\n\t</head>\n\t<body>");
		out.append("\n\t\t<h1>About</h1>");
		out.append("\n\t\t<p>Hello, My name is Andrew Adolphsons and I'm a student at CVTC in Eau Claire. I enjoy playing music and "
				+ "hanging out with my friends!</p>");
		

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
