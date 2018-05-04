<%--
  Created by IntelliJ IDEA.
  User: braxsi
  Date: 12.04.2018
  Time: 23:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Update user info</title>
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
    <li><a href="${pageContext.servletContext.contextPath}/user/choiceGroup" title="Играть">Играть</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/user/updateUser" class="current" title="Профиль">Профиль</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/user/resources" title="Ресурсы">Ресурсы</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/user/stalkers" title="Сталкеры">Сталкеры</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/user/gallery" title="Галерея">Галерея</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/user/test" title="Тест">Тест</a></li>
    <li><a href="${pageContext.servletContext.contextPath}/user/about" title="Об игре">Об игре</a></li>
</ul></nav>
<div style="vertical-align: middle; display: table; width:100%; height: 100%">
    <div style="vertical-align: middle; display: table-cell;">

        <table align="center" style="background-color: #f0f8ff;">
            <th align="center" colspan="2" style="padding: 10px 20px;"><h3 align="center">Здравствуйте, здесь можно изменить данные профиля</h3></th>
            <form:form method="POST" action="updateUser" modelAttribute="user">
                <tr>
                    <td style="padding: 10px 20px;"><form:label path="login">Nickname</form:label></td>
                    <td style="padding: 10px 20px;"><form:input path="login"/></td>
                </tr>
                <tr >
                    <td style="padding: 10px 20px;"><form:label path="password">Password</form:label></td>
                    <td style="padding: 10px 20px;"><form:password path="password"/></td>
                </tr>
                <tr>
                    <td style="padding: 10px 20px;"><form:label path="email">Email</form:label></td>
                    <td style="padding: 10px 20px;"><form:input path="email"/></td>
                </tr>
                <tr>
                    <td style="padding: 10px 20px;" align="center" colspan="2"><input type="submit" value="Изменить"/></td>
                </tr>
            </form:form>
        </table>
    </div>
</div>

</body>
</html>
