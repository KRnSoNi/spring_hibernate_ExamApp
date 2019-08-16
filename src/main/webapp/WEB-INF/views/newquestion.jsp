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
	<f:form action="insertQues" method="post" modelAttribute="que">
Subjects: 
<input type="hidden" name="exam_id">
<f:select path="ebean.exam_id">
	<f:options itemLabel="examTitle"  items="${listexam}"  itemValue="exam_id"/> 
</f:select>
Question Name:- <f:input path="quesName" />
		<br>

Question:- <f:input path="question" />
		<br>
Option 1 : <f:input path="optA" />
		<br> 
Option 2 : <f:input path="optB" />
		<br>
Option 3 : <f:input path="optC" />
		<br>	
Option 4 : <f:input path="optD" />
		<br>
Answer: <f:input path="answer" />
		<br>

		<input type="submit" name="submit">

	</f:form>
</body>
</html>