<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
	<tr>
			<td>ID</td>
			<td>Name</td>
			<td>Salary</td>
	</tr>
	<c:forEach items="${Employees}" var="employee">
		<tr>
			<td>${employee.id}</td>
			<td>${employee.name}</td>
			<td>${employee.salary}</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>