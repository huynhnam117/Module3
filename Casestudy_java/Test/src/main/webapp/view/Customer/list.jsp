<%--
  Created by IntelliJ IDEA.
  User: vannam
  Date: 02/11/2022
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">

</head>
<style>
    body {
        background-color: white;
    }
    table {
        border: solid 3px;
    }
    a {
        text-decoration: none;
    }
    a:hover {
        text-decoration: underline;
    }
</style>
<body>
<div class="p-3">
    <h2 class="text-center fw-bold">list Customer</h2>
    <p class="text-center mt-3"><a href="/"><i></i> Back to HOME</a></p>
    <c:if test="${mess!=null}">
        <c:if test="${check}">
            <div class="justify-content-center d-flex">
                <div class="alert alert-success alert-dismissible fade show w-50 text-center">
                    <strong>${mess}</strong>
                    <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
                </div>
            </div>
        </c:if>

        <c:if test="${!check}">
            <div class="justify-content-center d-flex">
                <div class="alert alert-danger alert-dismissible fade show w-50 text-center">
                    <strong>${mess}</strong>
                    <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
                </div>
            </div>
        </c:if>
    </c:if>

<%--           thêm--%>
    <nav class="navbar navbar-expand-lg py-0 my-0">
        <div class="container-fluid">
            <a href="/customer?action=create">
                <button class="btn btn-success btn-outline"><span class="text-light"> + Add Customer</span></button>
            </a>

<%--            Tìm Kiếm--%>
            <form class="d-flex my-2" role="search" action="/customer?action=search&name=${customer.getcustomerName()}" method="get">
                <input class="form-control me-2" type="text" placeholder="" aria-label="Search"
                       name="name">
                <button class="btn btn-outline-success" type="submit" name="action" value="search">
                    <i class="fa-solid fa-magnifying-glass"></i></button>
            </form>
        </div>
    </nav>
<%--             Danh sách--%>
    <table id="customerTable" class="table table-striped-columns">
        <thead>
        <tr>
            <th>Stt</th>
            <th>Name</th>
            <th>Birthday</th>
            <th>Gender</th>
            <th>Id card</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Address</th>
            <th>customer_type_id</th>
            <th class="text-center">Edit</th>
            <th class="text-center">Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach varStatus="status" var="customer" items="${customerList}">
            <tr>
                <td class="text-center">${status.count}</td>
                <td>${customer.customerName}</td>
                <td>${customer.customerBirthday}</td>
                <c:if test="${customer.customerGender == 1}">
                    <td>Male</td>
                </c:if>
                <c:if test="${customer.customerGender == 0}">
                    <td>Female</td>
                </c:if>
                <td>${customer.customerIdCard}</td>
                <td>${customer.customerPhone}</td>
                <td>${customer.customerEmail}</td>
                <td>${customer.customerAddress}</td>
                <td>${customer.customerTypeId}</td>
                    <%--  chỉnh sửa--%>
                <td class="text-center">
                    <a href="/customer?action=edit&id=${customer.getCustomerId()}">
                        <button class="btn btn-outline-primary">Edit</button>
                    </a>
                </td>
<%--                       Xóa--%>
                <td class="text-center">
                    <a href="/customer?action=delete&id=${customer.customerId}" data-bs-toggle="modal"
                       data-bs-target="#exampleModal"
                       onclick="deleteCustomer('${customer.getCustomerId()}','${customer.getCustomerName()}')">
                        <button class="btn btn-outline-danger">Delete </button>
                    </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
