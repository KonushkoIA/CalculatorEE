<%--
  Created by IntelliJ IDEA.
  User: Иван
  Date: 09.02.2022
  Time: 06:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<html>
<head>
    <title>ChangePassword</title>
</head>
<body>
<form action="/changePassword" method="post">
    <div class="container">
        <div class="row justify-content-md-center" style="height: 320px">
        </div>
        <div class="row justify-content-md-center">
            <div class="col-4">
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">New Password</label>
                    <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="New Password" minlength="3" required>
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
