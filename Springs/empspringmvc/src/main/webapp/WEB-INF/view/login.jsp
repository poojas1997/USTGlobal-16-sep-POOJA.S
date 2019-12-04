<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page session ="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
form {
 margin: 0;
 border: 1px solid black;
 height: 150px;
 width:250px;
}
</style>
</head>
<body>
<h3 style="color:red;">${msg}</h3>

	<center>
	
		<legend align="center">Login</legend>
		<form action="./login" method="post" >
		<br>
			<table>
				<tr>
					<td>ID :</td>
					<td><input type="number" name="id"></td>
				</tr>

				<tr>
					<td>Password :</td>
					<td><input type="password" name="password"></td>
				</tr>

				<tr>
					<td><input type="submit" value="login"></td>
					<td><input type="reset" value="Reset"></td>
				</tr>


			</table>
			
		</form>
<br>
<a href="./register">Click Here to Register</a>
	</center>
</body>
</html>