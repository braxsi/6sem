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
	<li><a href="${pageContext.servletContext.contextPath}/user/choiceGroup" title="Играть">Играть</a></li>
	<li><a href="${pageContext.servletContext.contextPath}/user/updateUser" title="Профиль">Профиль</a></li>
	<li><a href="${pageContext.servletContext.contextPath}/user/resources" class="current" title="Ресурсы">Ресурсы</a></li>
	<li><a href="${pageContext.servletContext.contextPath}/user/stalkers" title="Сталкеры">Сталкеры</a></li>
	<li><a href="${pageContext.servletContext.contextPath}/user/gallery" title="Галерея">Галерея</a></li>
	<li><a href="${pageContext.servletContext.contextPath}/user/test" title="Тест">Тест</a></li>
	<li><a href="${pageContext.servletContext.contextPath}/user/about" title="Об игре">Об игре</a></li>
</ul></nav>

<div style="vertical-align: middle; display: table; width:100%; height: 100%">
	<div style="vertical-align: middle; display: table-cell;">
		<table align="center" style="background-color: #f0f8ff;">
			<th align="center" colspan="4" style="padding: 10px 20px;"><h3 align="center">Трейд</h3></th>
<form:form method="POST" action="resources" modelAttribute="user">
	<tr class="form-group">
		<td style="padding: 10px 20px;"><form:label path="bandage">Аптечка:</form:label></td>
		<td style="padding: 10px 20px;"><form:input path="bandage" class="form-control" disabled="true"/></td>
		<td style="padding: 10px 20px;"><button type="submit" value="bandage+" name="action" class="btn btn-default">+1 аптечка</button></td>
		<td style="padding: 10px 20px;"><button type="submit" value="bandage-" name="action" class="btn btn-default">-1 аптечка</button></td>
	</tr>
	<tr class="form-group">
		<td style="padding: 10px 20px;"><form:label path="cartridges">Патроны</form:label></td>
		<td style="padding: 10px 20px;"><form:input path="cartridges" class="form-control" disabled="true"/></td>
		<td style="padding: 10px 20px;"><button type="submit" value="cartridges+" name="action" class="btn btn-default">+1 патрон</button></td>
		<td style="padding: 10px 20px;"><button type="submit" value="cartridges-" name="action" class="btn btn-default">-1 патрон</button></td>
	</tr>
	<tr class="form-group">
		<td style="padding: 10px 20px;"><form:label path="radiation">Рад-комплект</form:label></td>
		<td style="padding: 10px 20px;"><form:input path="radiation" class="form-control" disabled="true"/></td>
		<td style="padding: 10px 20px;"><button type="submit" value="radiation+" name="action" class="btn btn-default">+1 рад-комплект</button></td>
		<td style="padding: 10px 20px;"><button type="submit" value="radiation-" name="action" class="btn btn-default">-1 рад-комплект</button></td>
	</tr>
	<tr class="form-group">
		<td style="padding: 10px 20px;"><form:label path="gold">Деньги</form:label></td>
		<td style="padding: 10px 20px;"><form:input path="gold" class="form-control" disabled="true"/></td>
	</tr>
</form:form>
		</table>
	</div>
	</div>
</body>
</html>
