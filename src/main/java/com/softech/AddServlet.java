package com.softech;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		float a=Float.parseFloat(req.getParameter("num1"));
		float b=Float.parseFloat(req.getParameter("num2"));
		float result = a+b;
		
//		PrintWriter out=res.getWriter();
//		out.println("The result is : " + result);
		
		RequestDispatcher rd=req.getRequestDispatcher("sq");
		rd.forward(req, res);
		
	}
}
