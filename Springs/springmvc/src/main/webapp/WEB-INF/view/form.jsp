<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>

</head>
<body>
	
	
<fieldset align="center">
<h2>Register Form</h2>

	<form action="./form" method="post">
	
	<table>
	<tr>
	<td>
		<label>Id : </label>
	</td>
	<td>
		<input type="tel" name="id" class="form-control" style="float: center">
	</td>
	</tr>
	
	<tr>
	<td>
		<label>Name : </label>
	</td>
	<td>
		<input type="text" name="name" class="form-control">
	</td>
	</tr>
	
	<tr>
	<td>
		<label>Password : </label>
	</td>
	<td>
		<input type="password" name="password" class="form-control">
	</td>
	</tr>
	
	<tr>
	<td>
		<label>Gender : </label>
	</td>
	<td>
		<input type="text" name="gender" class="form-control">
	</td>
	</tr>
	
	<tr>
	<td>DOJ : </td>
	<td><input type="date" name="doj" class="form-control"></td>
	</tr>
	<tr>
	<td >
		<button style="align: center";>Submit</button>&nbsp;
		<button>Reset</button>
		
	</td>
	</tr>
	</table>	
	
	</form>

</fieldset>
</body>
</html>