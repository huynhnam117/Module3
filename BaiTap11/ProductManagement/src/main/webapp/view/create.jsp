<%--
  Created by IntelliJ IDEA.
  User: vannam
  Date: 04/11/2022
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Trang Thêm Mới</h1>
<a href="/Product">Back to the list page!</a>
<h1>Adding new product page</h1>
<form action="/roduct?action=add" method="post">
    <p>Product Id: <input type="number" name="id"> </p>
    <p>Product Name: <input type="text" name="name"> </p>
    <p>Product Price: <input type="number" name="price"> </p>
    <p>Product Description: <input type="text" name="description"> </p>
    <p>Product Manufacturer: <input type="text" name="manufacturer"> </p>
    <button>Save</button>
</form>
<c:if test="${mess!=null}">
    <span> ${mess}</span>
</c:if>
</body>
</html>
