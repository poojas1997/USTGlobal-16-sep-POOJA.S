<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page session="false" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
    <jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>

<%
	String id = "";
	Cookie[] cookies = request.getCookies();
	if(cookies != null) {
		for(Cookie cookie: cookies) {
			if(cookie.getName().equals("alwaysRemember")) {
				id = cookie.getValue();
			}
		}
	}
%>
<body>

<h3><%= msg %></h3><br>
<fieldset align='center'>
	<form action='./login' method='post'>
		<h2>Login</h2>
 	    
		<label>Id</label>
		<input type='number' name='id' value='<%=id %>' class='form-control'><br><br>
		
		<label>Password</label>
		<input type='password' name='password' class='form-control'><br><br>
		
		<input type='checkbox' name='rememberme' value='checked'>
		<label>Remember Me</label><br><br>
		
		<input type='reset' value='Reset'>
		<input type='submit' value='Login' >
 		
	</form>
</fieldset>
		<a href='./register.htmls'>Register</a>

</body>
</html>