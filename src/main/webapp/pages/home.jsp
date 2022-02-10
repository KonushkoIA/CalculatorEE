<%--
  Created by IntelliJ IDEA.
  User: Иван
  Date: 25.01.2022
  Time: 21:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<html>
<head>
    <title>Home</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
<c:if test="${sessionScope.user == null}">
            <li class="nav-item">
                <a class="nav-link" href="/registration">Registration </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/login">Login</a>
            </li>
</c:if>
<c:if test="${sessionScope.user != null}">
            <li class="nav-item">
                <a class="nav-link" href="/calculation">Calculation</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/story">History</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/changePassword">Change Password</a>
            </li>
            <form action="/logout" method="post">
                <button>Logout</button>
            </form>
</c:if>
        </ul>
    </div>
</nav>
</body>
</html>
