<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Freddy's Pizza</title>
    <%@include file="/WEB-INF/partials/header.jsp"%>
</head>
<body>
<div>
    <form action="pizza-order" method="post">
        <label for="crust">Crust type:</label>
        <select name="crust" id="crust">
            <option value="thin">Thin</option>
            <option value="hand-tossed">Hand-tossed</option>
            <option value="deep">Deep</option>
            <option value="weird">No Crust</option>
        </select><br>
        <label for="sauce">Sauce type:</label>
        <select name="sauce" id="sauce">
            <option value="regular">Regular</option>
            <option value="white">White Sauce</option>
            <option value="saucy">Extra Sauce</option>
            <option value="weird">No Sauce</option>
        </select><br>
        <label for="size">Size:</label>
        <select name="size" id="size">
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
            <option value="extra-large">Extra Large</option>
        </select><br>
        <input type="checkbox" id="pepperoni" name="pepperoni" value="pepperoni">
        <label for="pepperoni">Pepperoni</label><br>
        <input type="checkbox" id="sausage" name="sausage" value="sausage">
        <label for="sausage">Sausage</label><br>
        <input type="checkbox" id="onion" name="onion" value="onion">
        <label for="onion">Onion</label><br>
        <input type="checkbox" id="pineapple" name="pineapple" value="pineapple">
        <label for="pineapple">Pineapple</label><br>
        <input type="checkbox" id="extra-cheese" name="extra-cheese" value="extra-cheese">
        <label for="extra-cheese">Extra Cheese</label><br>
        <label for="address">Delivery Address:</label>
        <input type="text" name="address" id="address"><br>
        <button type="submit" class="btn-secondary">Order Pie</button>
    </form>

</div>

</body>
<%@include file="/WEB-INF/partials/script.jsp"%>
</html>
