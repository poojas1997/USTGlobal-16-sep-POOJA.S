<%@page import="com.ustglobal.springmvcassesment.dto.Retailer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%
	Retailer bean= (Retailer) session.getAttribute("bean");
   %>
  
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./updatepassword">Update Password</a>
<a href="./logout" style="float:right">Logout</a>
<h2 align="center">Welcome <%=bean.getName() %></h2>

<center>
<legend>Search Product</legend>
		<form action="./search">
			<table>
				<tr>
					<td>PId:</td>
					<td><input type="tel" name="id"></td>
					<td><input type="submit" value="search"></td>
				</tr>
			</table>
		</form>
 
	<h3 style="color:red;">${msg }</h3>
</center>
</body>
</html>