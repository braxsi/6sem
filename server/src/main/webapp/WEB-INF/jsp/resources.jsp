<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Trade JSP</title>
	<style>
		body { background: url(img/stalker3.jpg); }
	</style>
    <link rel="stylesheet" href="webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" type="text/css">
</head>
<body>
<div style="vertical-align: middle; display: table; width:100%; height: 100%">
	<div style="vertical-align: middle; display: table-cell;">
		<table align="center" bgcolor="#f0f8ff">
			<th align="center" colspan="4"><h3 align="center">Trade</h3></th>
<form:form method="POST" action="resources" modelAttribute="user">
	<tr class="form-group">
		<td><form:label path="bandage">Bandage:</form:label></td>
		<td><form:input path="bandage" class="form-control" disabled="true"/></td>
		<td><button type="submit" value="bandage+" name="action" class="btn btn-default">bandage +</button></td>
		<td><button type="submit" value="bandage-" name="action" class="btn btn-default">bandage -</button></td>
	</tr>
	<tr class="form-group">
		<td><form:label path="cartridges">Cartridges</form:label></td>
		<td><form:input path="cartridges" class="form-control" disabled="true"/></td>
		<td><button type="submit" value="cartridges+" name="action" class="btn btn-default">cartridges +</button></td>
		<td><button type="submit" value="cartridges-" name="action" class="btn btn-default">cartridges -</button></td>
	</tr>
	<tr class="form-group">
		<td><form:label path="radiation">Radiation</form:label></td>
		<td><form:input path="radiation" class="form-control" disabled="true"/></td>
		<td><button type="submit" value="radiation+" name="action" class="btn btn-default">radiation +</button></td>
		<td><button type="submit" value="radiation-" name="action" class="btn btn-default">radiation -</button></td>
	</tr>
	<tr class="form-group">
		<td><form:label path="gold">Gold</form:label></td>
		<td><form:input path="gold" class="form-control" disabled="true"/></td>
	</tr>
</form:form>
		</table>
	</div>
	</div>
</body>
</html>
