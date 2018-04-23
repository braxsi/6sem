<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>About game</title>
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
    <li><a href="${pageContext.servletContext.contextPath}/user/main" title="Играть">Играть</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/user/updateUser" title="Профиль">Профиль</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/user/resources"title="Ресурсы">Ресурсы</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/we/" title="Сталкеры">Сталкеры</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/we/" title="Настройки">Настройки</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/user/about" class="current" title="Об игре">Об игре</a></li>
</ul></nav>

<div style="vertical-align: middle; display: table; width:100%; height: 100%">
    <div style="vertical-align: middle; display: table-cell;">
        Мы рады, что вы решили сыграть в нашу игру жанра визуальная новелла. Надеемся, вам понравится эта игра и вы посоветуете её своим знакомым.
        S.T.A.L.K.E.R.: Multiplayer mod – браузерная игра (веб-приложение) в жанре визуальной новеллы в сеттинге одной из самых узнаваемых игровых вселенных, разработанных на постсоветском пространстве. Сеттинг представлен в жанре научной фантастики и выживания в аномальной Чернобыльской Зоне Отчуждения. Ключевые особенности сеттинга: уникальная гнетущая атмосфера, выживание во враждебном мире, населенном коварными мутантами, опасными аномалиями и сталкерами – искателями приключений с размытыми понятиями о чести и морали.
        Данная визуальная новелла располагает довольно вариативным прохождением – ваши действия напрямую влияют на сюжетные повороты и концовку игры.
    </div>
</div>
</body>
</html>

