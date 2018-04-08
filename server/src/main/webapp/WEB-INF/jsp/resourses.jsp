<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
	<title>Trade JSP</title>
</head>
<body>
<h3>Trade</h3>
<form:form method="POST" action="resourses" modelAttribute="user">
<table>
	<tr>
		<td><form:label path="bandage">Bandage:</form:label></td>
		<td><form:input path="bandage"/></td>
	</tr>
	<tr>
		<td><form:label path="cartridges">Cartridges</form:label></td>
		<td><form:input path="cartridges"/></td>
	</tr>
	<tr>
		<td><form:label path="radiation">Radiation</form:label></td>
		<td><form:input path="radiation"/></td>
	</tr>
	<tr>
		<td><form:label path="gold">Gold</form:label></td>
		<td><form:input path="gold"/></td>
	</tr>
	<tr>
		<td><input type="submit" value="Submit"/></td>
	</tr>
</form:form>
</body>
</html>
