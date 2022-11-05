<%--
  Created by IntelliJ IDEA.
  User: vannam
  Date: 04/11/2022
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
<h1 class="fw-light" style="text-align: center">Trang Danh Sách Sản Phẩm</h1>
<a href="/Product?action=add"><button type="button" class="btn btn-outline-primary" style="margin-left: 20px">+Add Product</button></a>
<table class="table table-striped table-hover">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Price</th>
        <th>Describe</th>
        <th>Producer</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <c:forEach var="Product" items="${productList}" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${Product.getName()}</td>
            <td>${Product.getPrice()}</td>
            <td>${Product.getDescribe()}</td>
            <td>${Product.getProducer()}</td>
            <td> <button type="button" class="btn btn-outline-primary" data-bs-toggle="modal">Edit </button></td>
            <td> <button type="button" class="btn btn-outline-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">Delete</button></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
