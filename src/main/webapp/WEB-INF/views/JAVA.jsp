<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h2 style="font-family: Georgia">QUESTION-PAPER</h2>
	</center>
	<f:form action="examdata" method="post" modelAttribute="exams">
		<table align=center border=1>

			<tr>
				<td colspan=4
					style="background-color: lightblue; font-family: verdana"><h2>
						<center>||${exams.userexam[0].eBean.examTitle}||</center>
					</h2></td>
			</tr>

			<tr style="background-color: lightgrey; font-family: verdana">
				<td colspan="2">Exam: ${exams.userexam[0].eBean.examTitle}</td>
				<td>Date: ${exams.userexam[0].eBean.examDate}</td>
				<td>Duration:${exams.userexam[0].eBean.duration}</td>
			</tr>
			<tr>
				>
				<td colspan="4">---------------------------></td>
			</tr>


			<c:forEach items="${exams.userexam}" var="ex" varStatus="i">
				<tr>
					<td colspan="4">Ques: ${i.index+1} : ${ex.qBean.question}</td>
				

            
   
				<td><input type="hidden" name="userexam[${i.index}].qBean.ques_id" value="${ex.qBean.ques_id}"> </td>                                        
				<td><input type="hidden" name="userexam[${i.index}].eBean.exam_id" value="${ex.eBean.exam_id}">	</td>                                     
				<td><input type="hidden" name="userexam[${i.index}].uBean.user_id" value="${ex.uBean.user_id}"> </td>                                        
				<td><input type="hidden" name="userexam[${i.index}].qBean.answer"  value="${ex.qBean.answer}">  </td>

				<td> ${ex.qBean.optA}<input type="radio"
					name="userexam[${i.index}].ansOfUSer" value="A" /></td>
				<td>${ex.qBean.optB}<input type="radio"
					name="userexam[${i.index}].ansOfUSer" value="B" /></td>
				<td>${ex.qBean.optC}<input type="radio"
					name="userexam[${i.index}].ansOfUSer" value="C" /></td>
				<td>${ex.qBean.optD}<input type="radio"
					name="userexam[${i.index}].ansOfUSer" value="D" /></td>

				</td>

              </tr>
			</c:forEach>
			<tr>

				<td colspan="4"><input type="submit" name="submit"
					align="center"></td>

			</tr>
		</table>

	</f:form>
</body>
</html>