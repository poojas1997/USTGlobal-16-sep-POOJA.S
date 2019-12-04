<%@page import="com.ustglobal.empspringmvc.dto.EmployeeBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	EmployeeBean bean = (EmployeeBean) session.getAttribute("bean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./changepassword">Change Password</a>&nbsp;&nbsp;
	<a href="./update">Update Profile </a>&nbsp;&nbsp;
	<a href="./delete">Delete Profile</a>
	<a href="./logout" style="float: right;">Logout</a>
	<center><h2>Welcome <%=bean.getName()%></h2>

	
		<legend>Search Employee</legend>
		<form action="./search">
			<table>
				<tr>
					<td>Id:</td>
					<td><input type="number" name="id"></td>
					<td><input type="submit" value="search"></td>
				</tr>
			</table>
		</form>
	<br>
</center>
	<%
		EmployeeBean employeeBean = (EmployeeBean) request.getAttribute("bean");
	%>

	<%
		if (employeeBean != null) {
	%>
	<center>
	<table border="1" style="border: solid" >
	
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Gender</th>
			<th>DOJ</th>
		</tr>

		<tr>
			<td><%=employeeBean.getName()%></td>
			<td><%=employeeBean.getEmail()%></td>
			<td><%=employeeBean.getGender()%></td>
			<td><%=employeeBean.getDoj()%></td>
		</tr>
	</table>
</center>
	<%
		}
	%>
	<h3 style="color:red;">${msg }</h3>
</body>
</html>