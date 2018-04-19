<%--
  Created by IntelliJ IDEA.
  User: braxsi
  Date: 18.04.2018
  Time: 22:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Update user info</title>
    <style>
        body { background: url(img/stalker1.jpg); }
    </style>
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/header.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/css/main.css" type="text/css">
    <script src="${pageContext.servletContext.contextPath}/webjars/jquery/3.3.1-1/jquery.min.js" type="text/javascript"></script>
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
<div style="vertical-align: middle; display: table; width:100%; height: 100%">
    <div style="vertical-align: middle; display: table-cell;">

        <table align="center" bgcolor="#f0f8ff">

            <th align="center" colspan="2"><h3 align="center">${page.title}</h3></th>
                <tr>
                    <td>${page.text}</td>
                </tr>
                <tr>
                    <td align="center" colspan="2">
                    <form:form method="POST" action="game">
                        <c:forEach var="item" items="${page.actionList}" varStatus="status">
                            <button type="submit" value="${status.index}" name="button">${status.index+1}</button>
                        </c:forEach>
                    </form:form>
                    </td>
                </tr>
        </table>
    </div>
</div>

</body>
</html>
