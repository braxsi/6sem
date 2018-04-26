<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User added</title>
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
    <li><a href="${pageContext.servletContext.contextPath}/user/main/" class="current" title="Играть">Играть</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/user/updateUser" title="Профиль">Профиль</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/user/resources" title="Ресурсы">Ресурсы</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/user/stalkers" title="Сталкеры">Сталкеры</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/user/gallery" title="Галерея">Галерея</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/user/test" title="Тест">Тест</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/user/about" title="Об игре">Об игре</a></li>
</ul></nav>

<div style="vertical-align: middle; display: table; width:100%; height: 100%">
    <div style="vertical-align: middle; display: table-cell;">
        <table align="center" bgcolor="#f0f8ff">
            <th align="center" colspan="4"><h3 align="center">Trade</h3></th>
            <form:form method="POST" action="loc1_2" modelAttribute="user">
            <tr>
                <td align="center">123123123</td>
            </tr>
            <tr>
                <td align="center">
                    <input type="submit1" value="Submit1"/>
                    <input type="submit2" value="Submit2"/>
                </td>
            </tr>
            </form:form>
        </table>
    </div>
</div>
</body>
</html>