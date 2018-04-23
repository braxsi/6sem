<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User updated</title>
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
    <li><a href="${pageContext.servletContext.contextPath}/user/main/" title="Играть">Играть</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/user/updateUser" class="current" title="Профиль">Профиль</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/user/resources" title="Ресурсы">Ресурсы</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/we/" title="Сталкеры">Сталкеры</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/we/" title="Настройки">Настройки</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/we/" title="Об игре">Об игре</a></li>
</ul></nav>

User <c:out value="${user.email}"/> was updated
</body>
</html>
