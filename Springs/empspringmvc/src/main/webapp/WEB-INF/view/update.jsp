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
		<legend align="center">Update Profile</legend>
		<form action="./update" method="post">
		<a href="./home"style="float:left">Home</a>
		<a href="./logout" style="float:right">Logout</a>
			<table>
				<tr>
					<td>Name :</td>
					<td><input type="text" name="name"></td>
				</tr>
				
				
				<tr>
					<td>DOJ :</td>
					<td><input type="date" name="doj"></td>
				</tr>

				<tr>
					<td>Gender :</td>
					<td><select name="gender" required="required">
							<option>-----select--------</option>
							<option value="M">Male</option>
							<option value="F">Female</option>
					</select></td>
				</tr>
				<tr>
					<td><input type="submit" value="Update"></td>
				</tr>
			</table>
		</form>
		<h3>${msg }</h3>
	</center>
</body>
</html>