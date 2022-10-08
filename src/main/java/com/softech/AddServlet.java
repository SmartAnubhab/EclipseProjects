package com.softech;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		HttpSession session=req.getSession();
		float k=(float)session.getAttribute("result");
		session.removeAttribute("result");
		
		PrintWriter out=res.getWriter();
		out.println("The value passed here is : " + k);
		
	}
}
