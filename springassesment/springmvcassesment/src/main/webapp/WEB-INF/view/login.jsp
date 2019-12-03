<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
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
	<legend>Login</legend>
	
	<br>
	<form action="./login" method="post">
		<table>
			<tr>
				<td>Id : </td>
				<td><input type="tel" name="id"></td>
			</tr>
			
			<tr>
				<td>Password : </td>
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