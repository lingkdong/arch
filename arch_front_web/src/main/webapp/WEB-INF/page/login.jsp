<%--
  Created by IntelliJ IDEA.
  User: dt170
  Date: 15-11-4
  Time: 下午2:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName()
            + ":" + request.getServerPort() + path;
    pageContext.setAttribute("basePath", basePath);
%>
<html>
<head>
    <title>Login page</title>
    <link rel="stylesheet" href="${basePath}/static/bootstrap3/css/bootstrap.min.css">
</head>
<body>
<div class="container" style="margin-top: 100px;">
    <div class="row">
        <div class="col-lg-5">
            <form action="${basePath}/login" method="post">
                <div class="form-group">
                    <label>用户名</label>
                    <input class="form-control" id="username" placeholder="请输入用户名" name="customerId">
                </div>
                <div class="form-group">
                    <label>密码</label>
                    <input type="password" class="form-control" id="pwd" placeholder="请输入密码" name="pwd">
                </div>
                <div class="form-group">
                    <span style="color:red;">
                        ${error}
                    </span>
                </div>
                <input class="btn btn-default" type="submit" value="登录"/>
            </form>
        </div>
    </div>
</div>


<script src="${basePath}/static/js/jquery-1.11.0.js"></script>
<script src="${basePath}/static/bootstrap3/js/bootstrap.min.js"></script>
</body>
</html>