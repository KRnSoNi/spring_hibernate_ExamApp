<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Insert title here</title>
</head>
<body>

	<f:form action="codeexam" method="post" modelAttribute="examBean">
		<center>
			<f:select path="exam_id">
				<f:options items="${list}" itemLabel="examTitle" itemValue="exam_id"/>
			</f:select>
			<br> <br> <input type="submit" name="submit" value="ENTER">
		</center>
	</f:form>
</body>
</html>