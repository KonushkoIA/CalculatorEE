<%--
  Created by IntelliJ IDEA.
  User: Иван
  Date: 31.01.2022
  Time: 21:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<html>
<head>
    <title>Calculation</title>
</head>
<body>
<form action="/calculation" method="post">
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
        <div class="row justify-content-md-center" style="height: 270px">
        </div>
        <div class="row justify-content-md-center">
            <div class="col-4">
                <label>
                    <%--@declare id="num1"--%><label for="num1">First Number</label>
                        <br>
                    <input type="number" step="any" name="num1" placeholder="Number1" >
                </label>
            </div>
        </div>
        <div class="row justify-content-md-center">
            <div class="col-4">
                <label>
                    <%--@declare id="num2"--%><label for="num2">Second Number</label>
                        <br>
                    <input type="number" step="any" name="num2" placeholder="Number2">
                </label>
            </div>
        </div>
        <div class="row justify-content-md-center">
            <div class="col-4">
                <%--@declare id="operation"--%><label for="operation">Select Operation</label>
                    <br>
            <select name="operation" class="form-select" aria-label="Default select example">
                <option selected>Open this select menu</option>
                <option value="sum">Sum</option>
                <option value="subtraction">Subtraction</option>
                <option value="multiplication">Multiplication</option>
                <option value="division">Division</option>
            </select>
            </div>
        </div>
        <div class="row justify-content-md-center">
            <div class="col-4">
                <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </div>
    </div>
</form>
</body>
</html>
