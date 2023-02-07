<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Ads</title>
</head>
<body>
<h1>Here are all the products:</h1>

<c:forEach var="ad" items="${ads}">
    <div>
        <h2>${ad.name}</h2>
        <p>Description: ${ad.description}</p>
        <p>User ID: ${ad.userId}</p>
        <P>${ad.catId}</P>
    </div>
</c:forEach>

</body>
</html>
