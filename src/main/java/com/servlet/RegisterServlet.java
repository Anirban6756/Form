package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter prt=response.getWriter();
		
		prt.println("<h2> Welcome to Register Servlet</h2>");
		
		String name=request.getParameter("user_name");
		String pass=request.getParameter("user_password");
		String email=request.getParameter("user_email");
		String gender=request.getParameter("gender");
		String course=request.getParameter("user_course");
		String condition=request.getParameter("condition");
		
		if(condition.equals("checked")) {
			prt.println("<h2>Name :"+name+"</h2>");
			prt.println("<h2>Password :"+pass+"</h2>");
			prt.println("<h2>Email :"+email+"</h2>");
			prt.println("<h2>Gender :"+gender+"</h2>");
			prt.println("<h2>Course :"+course+"</h2>");
			
		}else {
			
			prt.println("You Have not accepted the terms and condition");
		}
		
	}

}
