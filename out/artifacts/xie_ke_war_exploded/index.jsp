<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="theContext" value="${pageContext.request.contextPath}" scope="page"/>
<%@ page isELIgnored ="false" %>
<html>
<body>
<%--<a href="publisher/find_publisher">显示出版社信息</a>--%>
<%--根据id号查询--%>
<%--<form id="form1" method="post"--%>
<%--&lt;%&ndash;action="${theContext}/book/add_book_binding_default">&ndash;%&gt;--%>
<%--&lt;%&ndash;action="${theContext}/book/add_book_binding_basic">&ndash;%&gt;--%>
<%--&lt;%&ndash;  action="${theContext}/book/add_book_binding_basic_ex">&ndash;%&gt;--%>
<%--      action="${theContext}/User/find_userById">--%>
<%--    <input name="UserId" type="text" id="UserId" size="30">--%>
<%--    <input type="submit" name="submit" id="button" value="查询" >--%>
<%--    <form/>--%>
<%--    <a href="${theContext}/User/to_login">前往登录界面</a>--%>
<%--    <a href="${theContext}/User/user_list">查询</a>--%>
<%--    <a href="${theContext}/User/user_list_1">查询2</a>--%>

<%--    --%>

<jsp:forward page="/WEB-INF/pages/User/login.jsp"></jsp:forward>
</body>
</html>
