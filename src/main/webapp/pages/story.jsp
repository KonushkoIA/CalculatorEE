<%--
  Created by IntelliJ IDEA.
  User: Иван
  Date: 03.02.2022
  Time: 01:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<html>
<head>
    <title>Story</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="/">Home </a>
            </li>
        </ul>
    </div>
</nav>
<div class="container">
    <div class="row justify-content-md-center" style="height: 320px">
    </div>
    <div class="row justify-content-md-center">
    <div class="col-4">
<ul>
    <c:forEach items="${requestScope.items}" var="item">
        <li>${item}</li>
    </c:forEach>
</ul>
    </div>
    </div>
</div>
</body>
</html>
