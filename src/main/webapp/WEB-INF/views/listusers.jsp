<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<f:form action="admin" method="get">
		<table border=1>
		<caption><b><h2>-:List Of Users:-</h2></b>
			<tr>
				<td>No.</td>
				<td>UserName</td>
				<td>E-mail</td>
				<td>Password</td>

			</tr>

			<c:forEach items="${users}" var="users">
				<tr>
					<td>${users.user_id}</td>
					<td>${users.userName}</td>
					<td>${users.email}</td>
					<td>${users.password}</td>

				</tr>

			</c:forEach>

		</table>
	</f:form>
</center>
</body>
</html>