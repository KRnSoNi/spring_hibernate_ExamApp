<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%-- <%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %> --%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- <style type="text/css">
.error
{
color:red;
}
</style> -->
<title>Insert title here</title>
</head>
<body>
<center>
<h2>ADMIN-PANEL</h2><br>

<form action="check" method="get" >
<table align=center>
<caption><b><i>Admin Log-In</i></b></caption>
<tr> 
<td>Username :</td>
<td><input type="text" name="usernameA" /> <br><br></td></tr>

<tr> 
<td>Password : </td>
<td><input type="password" name="passwordA" /> <br><br></td></tr>
</tr>
 
<tr>
	<td><input type="submit" name="submit"></td>
	<td><input type="reset" name="cancel"></td>
</tr>
</table>

</form>
</center></body>
</html>