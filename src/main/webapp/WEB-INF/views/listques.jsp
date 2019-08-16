<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:form action="/listexams" method="get">
<table align= center border=1 >
<tr>
<td>Ques_id</td>
<td>Exam_id</td>
<td>Question</td>
<td>OptA</td>
<td>OptB</td>
<td>OptC</td>
<td>OptD</td>
<td>Answer</td>
</tr>

<c:forEach items="${qlist}" var="q">

<tr>
<td>${q.Ques_id}</td>
<td>${q.exam_id}</td>
<td>${q.question}</td>
<td>${q.optA}</td>
<td>${q.optB}</td>
<td>${q.optC}</td>
<td>${q.optD}</td>
<td>${q.answer}</td>  
</tr>

</c:forEach>

<tr> <td colspan=8><input type="button" name="button" value="Back" align="center"></td> 
</table>
</f:form>
</body>
</html>