<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="navbar.jsp"%>
<%
String msg = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

	<br>
	<br>

	<%
	if (msg != null && !msg.isEmpty()) {
	%>
	<h1><%=msg%></h1>
	<%
	}
	%>

	<fieldset>
		<legend style="text-align: center;">Student Add Form</legend>
		<form action="./add" method="post">
			<table>
				<tr>
					<td><label>Enter Your ID :</label></td>
					<td><input type="number" name="id"></td>
				</tr>

				<tr>
					<td><label>Enter Your Name :</label></td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td><label>Enter Your Mark :</label></td>
					<td><input type="number" name="mark" step="0.01"></td>
				</tr>
				<tr>
					<td><label>Enter Your Address :</label></td>
					<td><input type="text" name="address"></td>
				</tr>
				<tr>
					<td><label>Enter Your Password :</label></td>
					<td><input type="password" name="password"></td>
				</tr>
			</table>
			<button type="submit">Add Student</button>
		</form>
	</fieldset>
</body>
</html>