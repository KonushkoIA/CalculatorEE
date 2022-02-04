<%--
  Created by IntelliJ IDEA.
  User: Иван
  Date: 25.01.2022
  Time: 21:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<c:if test="${sessionScope.user == null}">
    <a href="/registration">Registration</a>
    <br>
    <a href="/login">Login</a>
</c:if>
<c:if test="${sessionScope.user != null}">
    <a href="/calculation">Calculation</a>
    <br>
    <a href="/story">History</a>
    <form action="/logout" method="post">
        <button>Logout</button>
    </form>
</c:if>
</body>
</html>
