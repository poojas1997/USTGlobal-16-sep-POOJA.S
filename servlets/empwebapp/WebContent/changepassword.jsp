<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>
<body>

<a href="./home">Home</a>
<a style='float:right' href='./logout'>Logout</a>
<h4><%=msg %></h4>
<fieldset>
<form action="./changepassword" method="post">

	<h2 align="center">Change password</h2>

	<label>New Password</label>
	<input type="password" name="new password" class="form-control" ><br><br>
	<label>Confirm Password</label>
	<input type="password"  name="confirm password" class="form-control"><br><br>
	<input type="reset" value="Reset"><br><br>
	<input type="submit" value="change Password">

		
</form>
</fieldset>

</body>
</html>