<%@ page import="braxxi.kursach.commons.entity.UserEntity" %>
<%@ page import="braxxi.kursach.server.dao.UserDao" %>
<%@ page import="org.springframework.beans.factory.annotation.Autowired" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<style>
	body { background: url(img/stalker3.jpg); }
</style>
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
		<td><input type="submit" value="bandage+" name="bandage1"/></td>
		<td><input type="submit" value="bandage-" name="bandage2"/></td>
	</tr>
	<tr>
		<td><form:label path="cartridges">Cartridges</form:label></td>
		<td><form:input path="cartridges"/></td>
		<td><input type="submit" value="cartridges+" name="cartridges1"/></td>
		<td><input type="submit" value="cartridges-" name="cartridges2"/></td>
	</tr>
	<tr>
		<td><form:label path="radiation">Radiation</form:label></td>
		<td><form:input path="radiation"/></td>
		<td><input type="submit" value="radiation+" name="radiation1"/></td>
		<td><input type="submit" value="radiation-" name="radiation2"/></td>
	</tr>
	<tr>
		<td><form:label path="gold">Gold</form:label></td>
		<td><form:input path="gold"/></td>
	</tr>
</form:form>
</body>
</html>
