<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.error{color:red}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form method="post" action="loginCredentials" modelAttribute="user">
<table style="with: 50%">
<tr>
<td>User Name:</td><td> <form:input path="userName"/> <br><br></td></tr>
<tr>
<td>Password: </td><td> <form:input path="password"/></td></tr>

</table>
<input type="submit" value="Login">
 </form:form>
 
 <%-- 
	<form action="loginCredentials" method="post">
		<table style="with: 50%">
			<tr>
				<td>UserName</td>
				<td><input type="text" name="userName" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
		</table>
		<input type="submit" value="Login" />
		<ul>
		    <li><a href = "next.jsp">next</a></li>
		    <li><a href = "next.jsp">next</a></li>
		</ul>
	</form> --%>
	
	
</body>
</html>