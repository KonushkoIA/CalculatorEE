<%--
  Created by IntelliJ IDEA.
  User: Иван
  Date: 28.01.2022
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="/login" method="post">
    <input type="text" name="username" placeholder="Username" minlength="3" required>
    <br>
    <input type="password" name="password" placeholder="Password" minlength="3" required>
    <br>
    <button>Submit</button>
</form>
</body>
</html>
