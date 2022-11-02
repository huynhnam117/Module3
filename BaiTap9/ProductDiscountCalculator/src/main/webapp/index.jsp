<%--
  Created by IntelliJ IDEA.
  User: vannam
  Date: 02/11/2022
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Index</h1>
<form action="/resul" method="get">
<div>
    <p>Product Description</p>
    <input type="text" name="ProductDescription">
    <p>List Price</p>
    <input type="text" name="ListPrice">
    <p>Discount Percent</p>
    <input type="text" name="DiscountPercent">
    <br>
    <button type="submit">submit</button>
</div>
</form>
</body>
</html>
