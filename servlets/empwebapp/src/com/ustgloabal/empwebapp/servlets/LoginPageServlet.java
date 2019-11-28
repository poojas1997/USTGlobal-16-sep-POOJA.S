package com.ustgloabal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.jsp")
public class LoginPageServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
		PrintWriter out = resp.getWriter();
		
		String id = "";
		Cookie[] cookies = req.getCookies();
		if(cookies != null) {
		for(Cookie cookie: cookies) {
			if(cookie.getName().equals("alwaysRemember")) {
				id = cookie.getValue();
			}
		}
		}
		
		out.println("<html>");
		out.println("<fieldset align='center'>");
		out.println("<form action='./login' method='post'>");
		out.println("<h2>Login</h2>");

		out.println("<label>Id</label>");
		out.println("<input type='number' name='id' value='"+id+"' class='form-control'><br><br>");
		out.println("<label>Password</label>");
		out.println("<input type='password' name='password' class='form-control'><br><br>");
		out.println("<input type='checkbox' name='rememberme' value='checked'>");
		out.println("<label>Remember Me</label><br><br>");
		out.println("<input type='reset' value='Reset'>");
		out.println("<input type='submit' value='Login' >");
 		
		out.println("</form>");
		out.println("</fieldset>");
		out.println("<a href='./register.html'>Register</a>");
		out.println("</html>");

		
	}//end of dogGet()
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doGet(req, resp);
	}//end of doPost()
}
