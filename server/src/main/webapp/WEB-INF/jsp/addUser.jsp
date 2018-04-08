<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
	<title>Add user</title>
</head>
<body>
<h3>Welcome, Enter The User Details</h3>
<form:form method="POST" action="addUser" modelAttribute="user">
	<table>
		<tr>
			<td><form:label path="login">Nickname</form:label></td>
			<td><form:input path="login"/></td>
		</tr>
		<tr>
			<td><form:label path="password">Password</form:label></td>
			<td><form:input path="password"/></td>
		</tr>
		<tr>
			<td><form:label path="email">Email</form:label></td>
			<td><form:input path="email"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="Submit"/></td>
		</tr>
	</table>
</form:form>
</body>
</html>
