<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="silver">
<h1 align="center">Insert The Data</h1>
<pre>
<form action="save" method="post">
<h2 align="center">
Enter Name: <input type="text" name="empName"/>
</h2>
<h2 align="center">
Enter Password: <input type="password" name="empPass"/>
</h2>
<h2 align="center">
Enter Salary: <input type="text" name="empSal"/>
</h2>
<h2 align="center">
Enter Designation: <input type="text" name="empDesg"/>
</h2>
<h1 align="center">
<input type="submit" value="save">
</h1>
</form>

 
<h1 align="center">Record Inserted Successfully With Id is ${id}</h1>
<h1 align="center">
All Data</h1>
<table border=1 align="center">
<tr>
<th>id</th>
<th>Name</th>
<th>Password</th>
<th>Salary</th>
<th>Designation</th>
</tr>
<!-- for each loop -->
<c:forEach items="${emp}" var="ob">
<tr>
<td>${ob.empId}</td>
<td>${ob.empName}</td>
<td>${ob.empPass}</td>
<td>${ob.empSal}</td>
<td>${ob.empDesg}</td>
</tr>
</c:forEach>
</table>
</pre>
</html>