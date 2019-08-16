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
		<f:form action="admin2" method="get">
			<table border=1>
			<caption><h2><b>-:List Of Exams:-</b></h2></caption>


				<tr>
					<td>Exam ID</td>
					<td>Exam Title</td>
					<td>Date</td>
					<td>Total Marks</td>
					<td>Duration</td>
					<td>Exam Code</td>
				</tr>

				<c:forEach items="${exams}" var="exams">
					<tr>
						<td>${exams.exam_id}</td>
						<td>${exams.examTitle}</td>
						<td>${exams.examDate}</td>
						<td>${exams.totalMarks}</td>
						<td>${exams.duration}</td>
						<td>${exams.examCode}</td>
						<td><a href="listques/${exams.exam_id}">Open Exam</a> 
					</tr>

				</c:forEach>

			</table>
		</f:form>
	</center>



</body>
</html>