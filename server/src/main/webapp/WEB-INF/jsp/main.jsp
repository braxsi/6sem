<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Start game</title>
    <style>
        body { background: url(${pageContext.servletContext.contextPath}/img/stalker1.jpg); }
    </style>

    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/header.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/main.css" type="text/css">
    <script src="${pageContext.servletContext.contextPath}/webjars/jquery/3.3.1-1/jquery.min.js" type="text/javascript"></script>

</head>
<body>

<nav class="b-header_mainmenu"><ul>
    <li><a href="${pageContext.servletContext.contextPath}/user/choiceGroup" class="current" title="Играть">Играть</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/user/updateUser" title="Профиль">Профиль</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/user/resources" title="Ресурсы">Ресурсы</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/user/stalkers" title="Сталкеры">Сталкеры</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/user/gallery" title="Галерея">Галерея</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/user/test" title="Тест">Тест</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/user/about" title="Об игре">Об игре</a></li>
</ul></nav>

<div style="vertical-align: middle; display: table; width:100%; height: 100%">
    <div style="vertical-align: middle; display: table-cell;">
        <table align="center" style="background-color: #f0f8ff;">
            <form:form method="POST" action="main">
            <th align="center" colspan="4" style="padding: 10px 20px;"><h3 align="center">Предыстория</h3></th>
            <tr>
                <td align="center" style="padding: 10px 20px;">${script.description}</td>
            </tr>
            <tr>
            <td align="center" colspan="2" style="padding: 10px 20px;"><input type="submit" value="Играть"/></td>
            </tr>
            </form:form>
        </table>
    </div>
</div>
</body>
</html>