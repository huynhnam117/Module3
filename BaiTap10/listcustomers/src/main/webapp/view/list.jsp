<%--
  Created by IntelliJ IDEA.
  User: vannam
  Date: 03/11/2022
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
<h1 class="fw-light" style="text-align: center">Trang Danh Sách Khách Hàng</h1>
<table class="table table-striped table-hover">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>BirthDay</th>
        <th>Address</th>
        <th>Email</th>
        <th>Image</th>
    </tr>
<c:forEach var="Customer" items="${listcustomer2}" varStatus="status">
    <tr>
        <td>${status.count}</td>
        <td>${Customer.getName()}</td>
        <td>${Customer.getBirthDay()}</td>
        <td>${Customer.getAddress()}</td>
        <td>${Customer.getEmail()}</td>
        <td>
            <img width="70px" height="50px" src="${Customer.getImage()}">
        </td>
    </tr>
</c:forEach>
</table>
</body>
</html>
