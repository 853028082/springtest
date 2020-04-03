<%--
  Created by IntelliJ IDEA.
  User: Ruisoft
  Date: 2020/3/30
  Time: 8:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>注册</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous"/>
    <link href="<%=request.getContextPath()%>/assets/pages/css/login.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<form class="form-signin" method="post" action="${pageContext.request.contextPath}/register/add">
    <p>
        <label for="username" class="sr-only">用户名</label>
        <input type="text" id="username" name="username" class="form-control" placeholder="Username" required
               autofocus>
    </p>
    <p>
        <label for="password" class="sr-only">密码</label>
        <input type="password" id="password" name="password" class="form-control" placeholder="Password" required>
    </p>
    <button class="btn btn-lg btn-primary btn-block" type="submit">注册</button>
</form>
</body>
</html>
