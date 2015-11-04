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
    success
</div>


<script src="${basePath}/static/js/jquery-1.11.0.js"></script>
<script src="${basePath}/static/bootstrap3/js/bootstrap.min.js"></script>
</body>
</html>