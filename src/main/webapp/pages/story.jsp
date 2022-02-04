<%--
  Created by IntelliJ IDEA.
  User: Иван
  Date: 03.02.2022
  Time: 01:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Story</title>
</head>
<body>
<ul>
    <c:forEach items="${requestScope.items}" var="item">
        <li>${item}</li>
    </c:forEach>
</ul>
</body>
</html>
