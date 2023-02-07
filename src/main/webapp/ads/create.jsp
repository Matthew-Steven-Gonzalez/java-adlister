
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create An Ad</title>
</head>
<body>
<h1>Create An Ad</h1>
<form action="/ads/create" method="post">
    <label for="name">Name</label>
    <input name="name" id="name" type="text">
    <br />
    <label for="description">Description:</label>
    <input name="description" id="description" type="text">
    <br />
    <label for="userId">User ID number:</label>
    <input name="userId" id="userId" type="text">
    <br />
    <label for="list">Categories</label>
    <UL id="list">
        <li>For sale  :  1</li>
        <li>Found  :  2</li>
        <li>Looking for  :  3</li>
    </UL>
    <label for="catId">Category ID number: </label>
    <input name="catId" id="catId" type="text">
    <br />
    <input type="submit">
</form>
</body>
</html>
