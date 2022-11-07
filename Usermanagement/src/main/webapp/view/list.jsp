<%--
  Created by IntelliJ IDEA.
  User: vannam
  Date: 07/11/2022
  Time: 14:06
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
<center>
    <h1>User Management</h1>
    <h2>
        <a href="/users?action=create">Add New User</a>
    </h2>
    <form action="/users?action=search" method="post">
        <input type="text" name="searchCountry">
        <input type="submit" value="Search">
    </form>
    <p>Sort by <select name="selectSort">
        <option value="1">By name</option>
        <option>By something that not available now</option>
    </select>
<%--        <button><a href="/users?action=sort&selectSort=selectSort">Sort</a></button>--%>
    </p>
    <c:if test="${listUser.size()==0}">
        <p align="center">Can't found any users</p>
    </c:if>

</center>
<div align="center">
    <table class="table table-striped table-hover">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Country</th>
            <th>Actions</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <c:forEach var="user" items="${listUser}">
            <tr>
                <td><c:out value="${user.id}"/></td>
                <td><c:out value="${user.name}"/></td>
                <td><c:out value="${user.email}"/></td>
                <td><c:out value="${user.country}"/></td>
                <td><a href="/users?action=edit&id=${user.id}">Edit</a></td>
                 <td><a href="/users?action=delete&id=${user.id}">Delete</a></td>

            </tr>
        </c:forEach>
    </table>
    <p align="center">${messSort}</p>
</div>
</body>
</html>
