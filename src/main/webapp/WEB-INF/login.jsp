<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%--%>
<%--    if (request.getMethod().equalsIgnoreCase("post")) {--%>
<%--        String username = request.getParameter("username");--%>
<%--        String password = request.getParameter("password");--%>
<%--        if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")) {--%>
<%--            response.sendRedirect("/profile.jsp");--%>
<%--        }--%>
<%--    }--%>
<%--%>--%>

<%--<c:if test = "${param.username.equalsIgnoreCase('admin') && param.password.equalsIgnoreCase('password')}">--%>
<%--    <c:redirect url="/WEB-INF/profile.jsp"/>--%>
<%--</c:if>--%>
<html>
<head>
    <title>Log-In</title>
    <%@include file="/WEB-INF/partials/header.jsp"%>
</head>
<body>
<div class = "container">
    <form method="POST" action="login">
        <div class="mb-3 row">
            <label for="username" class="form-label">Username:</label><br>
            <input type="text" id="username" name="username" class="form-control"><br>
        </div>
        <div class="mb-3 row">
            <label for="password" class="form-label">Password:</label><br>
            <input type="password" id="password" name="password" class="form-control"><br>
        </div>
        <button type="submit" value="log-in" class="btn btn-secondary">Log In</button>
    </form>
</div>
</body>
<%@include file="/WEB-INF/partials/script.jsp"%>
</html>
