<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>User added</title>
	<style>
		body { background: url(img/stalker1.jpg); }
	</style>
	<link rel="stylesheet" href="webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" type="text/css">
</head>
<body>
User <c:out value="${user.email}"/> was created
</body>
</html>
