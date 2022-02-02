<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	nav {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  border: 1px solid #e7e7e7;
  background-color: #f3f3f3;
}



 a {
  display: block;
  color: #666;
  text-align: center;
  padding: 14px 48px;
  text-decoration: none;
  float: left;
}

 a:hover {
  background-color: #04AA6D;
  color: yellow;
}

 a.active {
  color: white;
  background-color: #04AA6D;
}
</style>
</head>
<body>
	<nav>
		<a href="./home">Home</a>
		<a href="./add">Add Employee</a>
		<a href="./update">Update Employee</a>
		<a href="./delete">Delete Employee</a> 
		<a href="./getstudent">See Employee Details</a> 
		<a href="./allstudent">See All Employee</a> 
		<a href="./logout">Logout</a>
	</nav>
</body>
</html>