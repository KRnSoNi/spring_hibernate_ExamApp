<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
.error
{
color:red;
}
</style>
<title>Insert title here</title>
</head>
<body>

<f:form action="save" method="post" modelAttribute="userBean" >
<table align = "center">
<caption><h2>|Regestration|</h2></caption>

 <tr>  
<td>Enter Your Name : </td> 
<td><f:input path="userName"/> <f:errors cssClass="error" path="userName"> </f:errors><br><br></td>
</tr>
 
<tr> 
<td>Enter E-mail ID :</td> 
<td> <f:input path="email" /> <f:errors cssClass="error" path="email"> </f:errors><br><br></td>
</tr>

<tr> 
<td>Enter Password :</td> 
<td><f:input type="password" path="password" /> <f:errors cssClass="error" path="password"> </f:errors><br><br></td>
</tr>

<tr rowspan=2> <td> <input type="submit" name="submit" value="SUBMIT"> </td></tr>

</table>
</f:form>

</body>
</html>