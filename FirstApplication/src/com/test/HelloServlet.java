package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
This is My Change
*/
public class HelloServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	    RequestDispatcher rd=null;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name=request.getParameter("username");
		String password = request.getParameter("password");
		if(name.equalsIgnoreCase("niit") && password.equals("123456"))
		{
			rd= request.getRequestDispatcher("welcome.jsp");
			rd.forward(request, response);
		}
		else
		{
			out.println("<h2>Username OR Password Incorrect!!! Try Again...</h2>");
			rd=request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
		}
	}
}
