<%--
  Created by IntelliJ IDEA.
  User: Иван
  Date: 31.01.2022
  Time: 21:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculation</title>
</head>
<body>
<form action="/calculation" method="post">
    <input type="text" name="num1" placeholder="Number1">
    <br>
    <input type="text" name="num2" placeholder="Number2">
    <br>
    <select name="operation">
    <option value="sum">sum</option>
    <option value="subtraction">sub</option>
    <option value="multiplication">mul</option>
    <option value="division">div</option>
    </select>
    <br>
    <button>Submit</button>
    <br>
    <a href="/">Home</a>
</form>
</body>
</html>
