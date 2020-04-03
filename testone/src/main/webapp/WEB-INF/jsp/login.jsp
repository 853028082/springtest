<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="cn">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>样例系统</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous"/>
    <link href="<%=request.getContextPath()%>/assets/pages/css/login.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="container">
    <form class="form-signin" method="post" action="${pageContext.request.contextPath}/login">
        <h2 class="form-signin-heading">请登录</h2>
        <div class="alert alert-danger display-hide">
            <button class="close" data-close="alert"></button>
            <span>请输入用户名、密码</span>
        </div>
        <p>
            <label for="username" class="sr-only">用户名</label>
            <input type="text" id="username" name="username" class="form-control" placeholder="Username" required
                   autofocus>
        </p>
        <p>
            <label for="password" class="sr-only">密码</label>
            <input type="password" id="password" name="password" class="form-control" placeholder="Password" required>
        </p>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
    </form>
    <button class="btn btn-lg btn-primary btn-block" id="regst" onclick="window.location='/register'">注册</button>
</div>
<div class="copyright"><span id="left">Copyright &copy; </span><br><span id="right">Version:</span></div>
<script src="${pageContext.request.contextPath}/assets/plugins/jquery-2.0.3.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/assets/plugins/jquery-validation/js/jquery.validate.min.js"
        type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/assets/plugins/jquery-validation/js/additional-methods.min.js"
        type="text/javascript"></script>
<script type="text/javascript">
    var root = "<%=request.getContextPath()%>";
</script>
<script src="${pageContext.request.contextPath}/assets/custom/scripts/version.js" type="text/javascript"></script>
</body>
</html>