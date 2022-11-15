<%--
  Created by IntelliJ IDEA.
  User: vannam
  Date: 08/11/2022
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">

</head>
<style>
    body {
        background-color: white;
    }
    form {
        background-color: white;
    }
    a {
        text-decoration: none;
    }
    a:hover {
        text-decoration: underline;
    }
    input:invalid {
        border-color: black;
    }
    input:valid {
        border-color: white;
    }
</style>
<body>
<div class="mx-5 px-5 pt-3">
    <h2 class="text-center fw-bold">Edit Customer</h2>
    <p class="text-center mt-3"><a href="/"><i class="fa-solid fa-house-chimney h5 mx-1"></i> Back to HOME</a></p>
    <p class="text-center">
        <a href="/customer"><i class="fa-solid fa-backward"></i> Back to Customer list</a>
    </p>
    <c:if test="${mess!=null}">
        <c:if test="${check}">
            <div class="justify-content-center d-flex">
                <div class="alert alert-success alert-dismissible fade show w-50 text-center">
                    <strong>Congratulations!</strong> ${mess}
                    <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
                </div>
            </div>
        </c:if>
        <c:if test="${!check}">
            <div class="justify-content-center d-flex">
                <div class="alert alert-danger alert-dismissible fade show w-50 text-center">
                    <strong>Sorry!</strong> ${mess}
                    <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
                </div>
            </div>
        </c:if>
    </c:if>
    <div class="d-flex justify-content-center">
        <form class="w-50 border border-2 border-success p-3 rounded" action="/customer?action=edit&id=${customer.getCustomerId()}"
              method="post">
            <div class="form-group">
                <label for="name" class="h6">Name:</label>
                <div class="input-group">
                    <input type="text" id="name" value="${customer.getCustomerName()}" class="form-control" placeholder="Input name" name="name" required >

                </div>
            </div>

            <div class="mt-3 form-group">
                <label for="dateOfBirth" class="h6">Birthday:</label>
                <input type="date" id="dateOfBirth" value="${customer.getCustomerBirthday()}" class="form-control" name="dateOfBirth" min="${minAge}"
                       max="${maxAge}">
            </div>

            <div class="mt-3 form-group">
                <label class="h6">Gender:</label>
                <div class="d-flex">
<%--                    Nam--%>
                    <label class="d-block me-4">
                        <input name="gender" type="radio" value="1" ${customer.customerGender==1?"checked":""}>Male
                        <i class="fa-solid fa-mars"></i>
                    </label>
<%--                        Nữ--%>
                    <label class="d-block">
                        <input name="gender" type="radio" value="0" ${customer.customerGender==0?"checked":""}>Female
                        <i class="fa-solid fa-venus"></i>
                    </label>

                </div>
            </div>

            <div class="mt-3 form-group">
                <label for="idCard" class="h6">Id card:</label>
                <div class="input-group">
                    <input type="text" id="idCard" value="${customer.getCustomerIdCard()}" class="form-control" placeholder="Input Id card" name="idCard">

                </div>
            </div>
            <div class="mt-3 form-group">
                <label for="phone" class="h6">Phone:</label>
                <div class="input-group">
                    <input type="text" id="phone" value="${customer.getCustomerPhone()}" class="form-control" placeholder="Input Phone number" name="phone">

                </div>
            </div>

            <div class="mt-3 form-group">
                <label for="email" class="h6">Email:</label>
                <div class="input-group">
                    <input type="text" id="email" value="${customer.getCustomerEmail()}" class="form-control" placeholder="Input Email" name="email">

                </div>
            </div>

            <div class="mt-3 form-group">
                <label for="address" class="h6">Address:</label>
                <div class="input-group">
                    <input type="text" id="address" value="${customer.getCustomerAddress()}" class="form-control" placeholder="Input Address" name="address">

                </div>
            </div>

            <div class="mt-3 form-group">
                <label for="address" class="h6">Customer Type:</label>
                <div class="input-group">
                    <select name="customerType">
                        <option value="1"${customer.customerTypeId == 1?"selected":""}>Diamond</option>
                        <option value="2"${customer.customerTypeId == 2?"selected":""}>Platinium</option>
                        <option value="3"${customer.customerTypeId == 3?"selected":""}>Gold</option>
                        <option value="4"${customer.customerTypeId == 4?"selected":""}>Silver</option>
                        <option value="5"${customer.customerTypeId == 5?"selected":""}>Member</option>
                    </select>
                </div>
            </div>

            <div class="mt-3 text-center">
                <button type="submit" class="btn btn-info btn-outline-success btn-sm border border-2 border-success text-dark">
                    Save <i class="fa-solid fa-floppy-disk"></i></button>
            </div>
        </form>
    </div>
</div>
<p>${mess}</p>
</body>
</html>
