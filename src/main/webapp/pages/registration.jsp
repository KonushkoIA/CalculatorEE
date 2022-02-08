<%--
  Created by IntelliJ IDEA.
  User: Иван
  Date: 25.01.2022
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<html>
<head>
    <title>Registration</title>
</head>
<body>
<%--<form action="/registration" method="post">--%>
<%--    <div class="mb-3">--%>
<%--        <label for="formGroupExampleInput" class="form-label">First name</label>--%>
<%--        <br>--%>
<%--        <input type="text" name="name" class="form-control" id="formGroupExampleInput" placeholder="First Name" minlength="3" required>--%>
<%--    </div>--%>
<%--    <div class="mb-3">--%>
<%--        <label for="formGroupExampleInput1" class="form-label">Username</label>--%>
<%--        <br>--%>
<%--        <input type="text" name="username" class="form-control" id="formGroupExampleInput1" placeholder="Username" minlength="3" required>--%>
<%--    </div>--%>
<%--    <div class="mb-3">--%>
<%--        <label for="exampleInputPassword1" class="form-label">Password</label>--%>
<%--        <br>--%>
<%--        <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password" minlength="3" required>--%>
<%--    </div>--%>
<%--    <button type="submit" class="btn btn-primary">Submit</button>--%>
<%--    <br>--%>
<%--    <a href="/">Home</a>--%>
<%--</form>--%>
<form action="/registration" method="post">
    <div class="container">
        <div class="row justify-content-md-center" style="height: 320px">
        </div>
        <div class="row justify-content-md-center">
            <div class="col-4">
                <div class="mb-3">
                    <label for="formGroupExampleInput" class="form-label">Name</label>
                    <input type="text" name="name" class="form-control" id="formGroupExampleInput" placeholder="Name" minlength="3" required>
                </div>
            </div>
        </div>
        <div class="row justify-content-md-center">
            <div class="col-4">
                <div class="mb-3">
                    <label for="formGroupExampleInput1" class="form-label">Username</label>
                    <input type="text" name="username" class="form-control" id="formGroupExampleInput1" placeholder="Username" minlength="3" required>
                </div>
            </div>
        </div>
        <div class="row justify-content-md-center">
            <div class="col-4">
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Password</label>
                    <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password" minlength="3" required>
                </div>
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
