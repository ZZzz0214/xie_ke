<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="theContext" value="${pageContext.request.contextPath}" scope="page"/>
<%@ page isELIgnored ="false" %>
<html>
<body>
<a href="publisher/find_publisher">显示出版社信息</a>
根据id号查询
<form id="form1" method="post"
<%--action="${theContext}/book/add_book_binding_default">--%>
<%--action="${theContext}/book/add_book_binding_basic">--%>
<%--  action="${theContext}/book/add_book_binding_basic_ex">--%>
      action="${theContext}/User/find_userById">
    <input name="UserId" type="text" id="UserId" size="30">
    <input type="submit" name="submit" id="button" value="查询" >
    <form/>
    <a href="${theContext}/User/to_login">前往登录界面</a>
    <a href="${theContext}/User/user_list">查询</a>
    <a href="${theContext}/User/user_list_1">查询2</a>
</body>
</html>
