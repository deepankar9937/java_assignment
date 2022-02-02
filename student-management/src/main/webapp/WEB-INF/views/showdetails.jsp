<%@page import="com.te.student.bean.StudentDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="navbar.jsp"%>
<%
StudentDetails data = (StudentDetails) request.getAttribute("data");
String errmsg = (String) request.getAttribute("errmsg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#customers {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
	text-align: center;
}

#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

#customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

#customers tr:hover {
	background-color: #ddd;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #04AA6D;
	color: white;
}

#heading {
	background-color: orange;
}
</style>
</head>
<body>
<br> <br>
	<%
	if (errmsg != null && !errmsg.isEmpty()) {
	%>

	<h1 style="color: red;"><%=errmsg%></h1>
	<%
	}
	%>
	<form action="./getdata" method="post">
		<label>Enter Your ID : </label> <input type="number" name="id">
		<input type="submit" value="Search">
	</form>
	<%
	if (data != null) {
	%>
	<br>
	<br>
	<table id="customers">
		<tr id="heading">
			<td colspan="2">Student Details</td>
		</tr>
		<tr>
			<th>Name</th>
			<td><%=data.getName()%>
		</tr>
		<tr>
			<th>ID</th>
			<td><%=data.getId()%>
		</tr>
		<tr>
			<th>Mark</th>
			<td><%=data.getMark()%> %</td>
		</tr>
		
		<tr>
			<th>Address</th>
			<td><%=data.getAddress()%>
		</tr>
		<tr>
			<th>Password</th>
			<td><%=data.getPassword()%>
		</tr>

	</table>
	<%
	}
	%>
</body>
</html>