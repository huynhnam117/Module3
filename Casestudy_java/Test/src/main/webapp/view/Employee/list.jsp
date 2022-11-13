<%--
  Created by IntelliJ IDEA.
  User: vannam
  Date: 07/11/2022
  Time: 07:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>
<h1 class="fw-light" style="text-align: center">List Employee.</h1>
<p class="text-center mt-3"><a href="/"><i class="fa-solid fa-house-chimney h5 mx-1"></i>Back HOME</a></p>
<a href="/employee?action=create">
<button type="button" class="btn btn-outline-primary">+Add Employee</button>
</a>
<form class="d-flex" role="search" style="margin-left: 1360px">

    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" style="width: 300px">
    <button class="btn btn-outline-success" type="submit">Search</button>
</form>
<table id="employeeTable" class="table table-striped-columns">
    <thead>
    <tr>
        <th>Stt</th>
        <th>Name</th>
        <th>Date Of Brith</th>
        <th>ID Card</th>
        <th>Salary</th>
        <th>Phone</th>
        <th>Email</th>
        <th>Address</th>
        <th>Position_id</th>
        <th>Education_degree_id</th>
        <th>Division_id</th>
        <th>Username</th>
        <th class="text-center">Edit</th>
        <th class="text-center">Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach varStatus="status" var="employee" items="${employeeList}">
        <tr>
            <td class="text-center">${status.count}</td>
            <td>${employee.employeeName}</td>
            <td>${employee.employeeDate_of_birth}</td>
            <td>${employee.employeeId_card}</td>
            <td>${employee.employeeSalary}</td>
            <td>${employee.employeePhone}</td>
            <td>${employee.employeeEmail}</td>
            <td>${employee.employeeAddress}</td>
            <td>${employee.employeePosition_id}</td>
            <td>${employee.employeeEducation_degree_id}</td>
            <td>${employee.employeeDivision_id}</td>
            <td>${employee.employeeUsername}</td>
                <%--  chỉnh sửa--%>
            <td class="text-center">
                <a href="/employee?action=edit&id=${employee.employeeId}">
                    <button class="btn btn-outline-primary">Edit</button>
                </a>
            </td>
                <%--                       Xóa--%>
            <td class="text-center">
                <a href="/employee?action=delete&id=${employee.employeeId}" data-bs-toggle="modal"
                   data-bs-target="#exampleModal"
                   onclick="deleteCustomer('${employee.getEmployeeId()}','${employee.getEmployeeName()}')">
                    <button class="btn btn-outline-danger">Delete </button>
                </a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
