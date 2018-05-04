<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Login</title>
    <style>
        body { background: url(${pageContext.servletContext.contextPath}/img/stalker1.jpg); }
    </style>
    <link rel="stylesheet" href="webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" type="text/css">
    <script src="${pageContext.servletContext.contextPath}/webjars/jquery/3.3.1-1/jquery.min.js" type="text/javascript"></script>
</head>
<body>

<div style="vertical-align: middle; display: table; width:100%; height: 100%">
    <div style="vertical-align: middle; display: table-cell;">

        <table align="center" bgcolor="#f0f8ff">
            <th align="center" colspan="2"><h3 align="center">Здравствуйте, введите логин и пароль</h3></th>
            <form:form method="POST" action="login" modelAttribute="user">
                <tr>
                    <td><form:label path="login">Login</form:label></td>
                    <td><form:input path="login" /></td>
                </tr>
                <tr>
                    <td><form:label path="password">Password</form:label></td>
                    <td><form:password path="password"/></td>
                </tr>
                    <td align="center" colspan="2"><input type="submit" value="Submit"/></td>
                </tr>
                </tr>
                <td  align="center" colspan="2"><a href="/6sem/addUser">Зарегестрироваться</a></td>
                </tr>
            </form:form>
        </table>
    </div>
</div>

</body>
</html>
