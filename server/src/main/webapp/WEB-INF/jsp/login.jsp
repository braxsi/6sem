<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <style>
        body { background: url(img/stalker1.jpg); }
    </style>
    <title>Login</title>
</head>
<body>

<div style="vertical-align: middle; display: table; width:100%; height: 100%">
    <div style="vertical-align: middle; display: table-cell;">

        <table align="center" bgcolor="#f0f8ff">
            <th align="center" colspan="2"><h3 align="center">Enter login and password</h3></th>
            <form:form method="POST" action="addUser" modelAttribute="user">
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
            </form:form>
        </table>
    </div>
</div>

</body>
</html>
