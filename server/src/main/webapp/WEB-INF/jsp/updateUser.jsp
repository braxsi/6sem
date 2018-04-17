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
        body { background: url(img/stalker1.jpg); }
    </style>
    <link rel="stylesheet" href="webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" type="text/css">
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
            <th align="center" colspan="2"><h3 align="center">Welcome, Update The User Details</h3></th>
            <form:form method="POST" action="updateUser" modelAttribute="user">
                <tr>
                    <td><form:label path="login">Nickname</form:label></td>
                    <td><form:input path="login"/></td>
                </tr>
                <tr>
                    <td><form:label path="password">Password</form:label></td>
                    <td><form:password path="password"/></td>
                </tr>
                <tr>
                    <td><form:label path="email">Email</form:label></td>
                    <td><form:input path="email"/></td>
                </tr>
                <tr>
                    <td align="center" colspan="2"><input type="submit" value="Submit"/></td>
                </tr>
            </form:form>
        </table>
    </div>
</div>

</body>
</html>
