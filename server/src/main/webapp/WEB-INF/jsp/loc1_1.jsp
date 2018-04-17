<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User added</title>
    <style>
        body { background: url(${pageContext.servletContext.contextPath}/img/stalker1.jpg); }
    </style>
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" type="text/css">
</head>
<body>
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