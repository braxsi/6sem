<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Trade JSP</title>
	<style>
		body { background: url(${pageContext.servletContext.contextPath}/img/stalker3.jpg); }
	</style>
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" type="text/css">
	<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/header.css" type="text/css">
	<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/main.css" type="text/css">
    <script src="${pageContext.servletContext.contextPath}/webjars/jquery/3.3.1-1/jquery.min.js" type="text/javascript"></script>


	<!-- <link href="https://nubex.ru/templates/nubexsite/plain/css/main.css?v=08112017" rel="stylesheet" type="text/css" title="compact"> -->



</head>
<body>
<nav class="b-header_mainmenu"><ul>
	<li><a href="${pageContext.servletContext.contextPath}/about/features/" title="Играть">Играть</a></li>
	<li><a href="${pageContext.servletContext.contextPath}/user/updateUser" title="Профиль">Профиль</a></li>
	<li><a href="${pageContext.servletContext.contextPath}/user/resources" class="current" title="Ресурсы">Ресурсы</a></li>
	<li><a href="${pageContext.servletContext.contextPath}/we/" title="Сталкеры">Сталкеры</a></li>
	<li><a href="${pageContext.servletContext.contextPath}/we/" title="Настройки">Настройки</a></li>
	<li><a href="${pageContext.servletContext.contextPath}/we/" title="Об игре">Об игре</a></li>
</ul></nav>

<div class="nav-bar">
	<div class="container">

		<ul class="nav nav-pills">
			<li id="m1">
				<a href="" target="_self">Играть</a>
			</li>
			<li id="m2" class="active">
				<a href="" target="_self">Профиль</a>
			</li>
			<li id="m3">
				<a href="" target="_self">Торговля</a>
			</li>
			<li id="m4">
				<a href="" target="_self">Сталкеры</a>
			</li>
			<li id="m5">
				<a href="" target="_self">Настройки</a>
			</li>
			<li id="m6">
				<a href="" target="_self">Об игре</a>
			</li>
		</ul>
	</div>
</div>

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
