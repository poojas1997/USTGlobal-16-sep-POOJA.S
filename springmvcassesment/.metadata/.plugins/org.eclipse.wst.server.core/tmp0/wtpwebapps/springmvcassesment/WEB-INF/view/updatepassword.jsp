<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<legend>Change Password</legend>
		<form action="./updatepassword" method="post">
			<a href="./home">Home</a> <a href="./logout" style="float: right;">Logout</a>

			<table>
				<tr>
					<td>New Password :</td>
					<td><input type="password" name="password"></td>
				</tr>

				<tr>
					<td>Confirm Password :</td>
					<td><input type="password" name="confirmpassword"></td>
				</tr>

				<tr>
					<td><input type="submit" value="Confirm"></td>
				</tr>


			</table>
		</form>
	<h3>${msg }</h3>
		
	</center>

</body>
</html>