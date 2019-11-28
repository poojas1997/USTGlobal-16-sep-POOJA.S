package com.ustglobal.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

public class MyServletDemo extends HttpServlet{

	private String mymsg;
	
	public void intit() {
		mymsg = "Hello World";
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<h1>" +mymsg+ "</h1>");
	}
	
	public void destroy() {
		
	}
}
