<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%String errmsg = (String) request.getAttribute("errMessage"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LogIn Page</title>
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

form {
	border: 3px solid #f1f1f1;
}

input[type=number], input[type=password] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

#login {
	background-color: #04AA6D;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
}

#login:hover {
	opacity: 0.8;
}

.container {
	padding: 16px;
}
}
</style>
</head>
<body>
	<h2>Student Login Form</h2>

	<form action="./login" method="post">
		<% if(errmsg != null && !errmsg.isEmpty()){ %>
		<div>
			<h1><%=errmsg %></h1>
		</div>
		<%} %>

		<div class="container">
			<label for="uname"><b>Student ID</b></label> <input type="number"
				placeholder="Enter Roll No." name="id" required> <label
				for="psw"><b>Password</b></label> <input type="password"
				placeholder="Enter Password" name="password" required>

			<input type="submit" value="LogIn" id="login">
			<!-- <label> <input type="checkbox" checked="checked"
				name="remember"> Remember me
			</label> -->
		</div>


	</form>
</body>
</html>