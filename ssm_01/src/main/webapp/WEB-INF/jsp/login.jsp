<%--
  Created by IntelliJ IDEA.
  User: 20806
  Date: 2022/7/26
  Time: 9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="/login">
    用户名：<input type="text" name="username"/><br>
    密码：<input type="password" name="password"><br>
    <input type="submit" value="提交">

    ${msg}
</form>
</body>
</html>
