<%--
  Created by IntelliJ IDEA.
  User: 86185
  Date: 2023-08-21
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="theContext" value="${pageContext.request.contextPath}" scope="page"/>
<%@ page isELIgnored ="false" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${theContext}/User/signIn">
<%--    private int userId;--%>
<%--    private String loginName;--%>
<%--    private int password;--%>
<%--    private String userName;--%>
<%--    private String mobile;--%>
    名字：<input name="loginName" type="text">
    密码<input name="password"  type="text">
    用户名：<input name="userName"  type="text">
    手机号：<input name="mobile"  type="text">
    <input type="submit" value="提交">


</form>
</body>
</html>
