package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class registerServlet
 */
@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	    Connection con;
	    PreparedStatement pstmt;
	    String fname=request.getParameter("fname");
	    String lname=request.getParameter("lname");
	    String email=request.getParameter("email");
	    String gender=request.getParameter("gender");
	    String password=request.getParameter("password");
	    try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr", "hr");
			if(con!=null)
				System.out.println("Connection is Successfull");
			
			pstmt=con.prepareStatement("insert into registeration values(?,?,?,?,?)");
			pstmt.setString(1, fname);
			pstmt.setString(2, lname);
			pstmt.setString(3, email);
			pstmt.setString(4, gender);
			pstmt.setString(5, password);
			
			int rowStatus =pstmt.executeUpdate();
			if(rowStatus>0)
				System.out.println("row is inserted");
			else
				System.out.println("insertion error");	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	    
	    
	    
	}
}
