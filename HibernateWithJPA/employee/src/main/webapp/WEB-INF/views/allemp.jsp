<%@page import="java.util.List"%>
<%@page import="com.te.employee.bean.EmployeeDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="navbar.jsp"%>
<%
List<EmployeeDetails> list = (List<EmployeeDetails>) request.getAttribute("alldata");
%>
<%
String err = (String) request.getAttribute("err");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Employee Details</title>

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
</style>
</head>
<body>
	<%
	if (err != null && !err.isEmpty()) {
	%>
	<h1><%=err%></h1>
	<%
	}
	%>




	<table id="customers">
		<tr>
			<th>Emp ID</th>
			<th>Name</th>
			<th>UserName</th>
			<th>Address</th>
			<th>Password</th>
			
		</tr>
		<%
		if (list != null) {
			for (EmployeeDetails details : list) {
		%>
		<tr>
			<td><%=details.getId()%></td>
			<td><%=details.getName()%></td>
			<td><%=details.getUser()%></td>
			<td><%=details.getAddress()%></td>
			<td><%=details.getPassword()%></td>
			
		</tr>


		<%
		}
		}
		%>
	</table>
	
	
	
</body>
</html>