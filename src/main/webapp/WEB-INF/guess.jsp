<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="/WEB-INF/partials/header.jsp"%>
</head>
<body>
<h1 class="center-text">Welcome traveler</h1><br>
<h4 class="center-text">Please select a number 1-3!</h4>
<FORM action="guess" method="post">
    <label for="guess">What is your guess?</label>
    <input type="text" name="guess" id="guess">
    <button type="submit" class="btn-secondary">Good luck...</button>
</FORM>

</body>
<%@include file="/WEB-INF/partials/script.jsp"%>
</html>
