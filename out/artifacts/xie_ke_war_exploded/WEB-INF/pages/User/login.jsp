<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="theContext" value="${pageContext.request.contextPath}" scope="page"/>
<%@ page isELIgnored ="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${theContext}/User/user_login">
    <input name="login_name" id="userId">
    <input name="password" id="password" type="password">
    <input type="submit" value="提交">
    <a href="${theContext}/User/sign_in">注册</a>
</form>
<a href="${theContext}/">首页</a>

<form action="${theContext}/Admin/login">
    <input name="aUsername" id="userId1">
    <input name="aPassword" id="password1" type="password">
    <input type="submit" value="提交">
    <a href="${theContext}/User/sign_in">注册</a>
</form>
<a href="${theContext}/">首页</a>

<form action="${theContext}/Auditor/login">
    <input name="aaUsername" id="userId2">
    <input name="aaPassword" id="password2" type="password">
    <input type="submit" value="提交">
    <a href="${theContext}/User/sign_in">注册</a>
</form>
<a href="${theContext}/">首页</a>
<form action="${theContext}/Warehouseman/login">
    <input name="wUsername" id="userId3">
    <input name="wPassword" id="password3" type="password">
    <input type="submit" value="提交">
    <a href="${theContext}/User/sign_in">注册</a>
</form>
<a href="${theContext}/">首页</a>
</body>
</html>
