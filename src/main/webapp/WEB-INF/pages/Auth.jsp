<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="red">
<h1>Login</h1>
<form action="Verify" method="post">
Enter Id: <input type="text" name="empId">
Enter Password: <input type="password" name="empPass">
<input type="submit" value="Authenticate">
</form>
<h1><a href="http://localhost:9966/emp/show">Registration</a></h1>

</body>
</html>