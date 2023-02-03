<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="/WEB-INF/partials/header.jsp"%>
</head>
<body>
    <form action="pickcolor" method="post">
        <label for="colorChoice">Please enter a color: </label>
        <input type="text" id="colorChoice" name="colorChoice">
        <button type="submit" class="btn-secondary btn">Color my world!</button>
    </form>
</body>
<%@include file="/WEB-INF/partials/script.jsp"%>
</html>
