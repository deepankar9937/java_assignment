<%@page import="com.te.student.bean.StudentDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="navbar.jsp" %>
	<% StudentDetails data = (StudentDetails) request.getAttribute("data"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
		<legend>Employee Update Details</legend>
		<form action="./update" method="post" >
			<table>
				<tr>
				<td><label>Your Id is:</label> </td>
				<td> <input type="number" name="id" value="<%=data.getId()%>" disabled="disabled"> </td>
				</tr>
				<tr>
					<td><label>Enter Your Name :</label></td>
					<td><input type="text" name="name" value="<%=data.getName()%>"></td>
				</tr>
				<tr>
					<td><label>Enter Your Mark :</label></td>
					<td><input type="number" name="mark" value="<%=data.getMark()%>" step="0.01"></td>
				</tr>
				<tr>
					<td><label>Enter Your Address :</label></td>
					<td><input type="text" name="address" value="<%=data.getAddress()%>"></td>
				</tr>
				<tr>
					<td><label>Enter Your Password :</label></td>
					<td><input type="text" name="password" value="<%=data.getPassword()%>"></td>
				</tr>
			</table>
			<input type="submit" value="Update">
		</form>

	</fieldset>

</body>
</html>