<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
	body { background: url(img/stalker1.jpg); }
</style>
<head>
	<title>User added</title>
</head>
<body>
User <c:out value="${user.email}"/> was created
</body>
</html>
