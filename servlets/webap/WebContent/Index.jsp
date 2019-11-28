<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%--     <%@page extends="javax.servlet.http.HttpServlet" %>    // @page extends directive--%>    
 
  <%@page session="false" %> 
<!--   //default value of session is true, if it is true it creates  cookie before login
		if it is false, it doesn't create a cookie
 --> 
 
 <%@page isThreadSafe="true" %>
 <!-- default of isThreadSafe is true, if it is false it implements 3 interfaces orelse 2 interfaces 
 in java file-->
 
   <%@page errorPage="error.jsp" %>

 
 <%!
	public void jspInit(){
		System.out.println("This is Init phase");
	}

	public void jspDestroy(){
		System.out.println("This is Destroy phase");
	}
	
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<%									//jsp scripltlet tag
	Date date = new Date();
	int i = 1/0;
/* 	m();
 */%>

<%-- <%!									//jsp declaration tag
	public int i =10;
	public void m() {
	System.out.println(i);
	}
%>
 --%><body>

<h1 style="color: blue;">Date and Time is <%=date %></h1>		
<%-- <h3><%=i %></h3>				<!-- //jsp expreesion tag -->
 --%>

</body>
</html>