<%--
  Created by IntelliJ IDEA.
  User: Иван
  Date: 25.01.2022
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<form action="/registration" method="post">
    <input type="text" name="name" placeholder="Name" minlength="3" required>
    <br>
    <input type="text" name="username" placeholder="Username" minlength="3" required>
    <br>
    <input type="password" name="password" placeholder="Password" minlength="3" required>
    <br>
    <button>Submit</button>
</form>
</body>
</html>
