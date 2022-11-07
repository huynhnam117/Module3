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
<a href="/Product?action=add">Add new product</a>
<a href="/Product?action=find">Find product</a>
<table class="table table-dark">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Price</th>
        <th>Description</th>
        <th>Manufacturer</th>
        <th>Edit</th>
        <th>Delete</th>
        <th>View details</th>
    </tr>
    <c:forEach var="x" items="${products}" varStatus="index">
        <tr>
            <td>${x.getId()}</td>
            <td>${x.getName()}</td>
            <td>${x.getPrice()}</td>
            <td>${x.getDescription()}</td>
            <td>${x.getManufacturer()}</td>
            <td><a href="/Product?action=edit&id=${x.getId()}">Edit</a></td>
            <td><a href="/Product?action=delete&id=${x.getId()}">Delete</a></td>
            <td><a href="/Product?action=view&id=${x.getId()}">View</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
