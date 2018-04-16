<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <style>
        body { background: url(img/stalker3.jpg); }
    </style>
    <title>Choice group</title>
</head>
<body>
<div style="vertical-align: middle; display: table; width:100%; height: 100%">
    <div style="vertical-align: middle; display: table-cell;">

        <table align="center" bgcolor="#f0f8ff">
            <th align="center"><h3 align="center">Welcome, choice group</h3></th>

<form:form method="POST" action="choiceGroup">

<tr class="form-group"><td>
    <c:forEach var="item" items="${groups}">
        <div><input type="radio" name="group" id="${item.id}" value="${item.id}"><label for="${item.id}">${item.name}</label>
        </div>
    </c:forEach>
</td></tr>
    <tr>
        <td align="center"><input type="submit" value="Submit"/></td>
    </tr>

</form:form>
</table>
    </div></div>
</body>
</html>
