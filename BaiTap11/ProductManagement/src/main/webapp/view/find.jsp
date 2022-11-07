<%--
  Created by IntelliJ IDEA.
  User: vannam
  Date: 07/11/2022
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Find product page</h1>
<p>
    <a href="/Product">Back to the list page</a>
</p>
<form action="/Product?action=find" method="post">
    <fieldset>
        <legend>Find according to:</legend>
        <table>
            <tr>
                <p>Name</p>
                <td><input type="text" name="name" id="name"></br>
                </td>
            </tr>
            <tr>
                <td><input type="submit" value="Find product"></td>
            </tr>
        </table>
    </fieldset>
</form>
<c:if test="${output.size()==null}">
    <p>Not found any product by given name!</p>
</c:if>
<c:if test="${output.size()!=null}">
    <table class="table table-dark">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Price</th>
            <th>Description</th>
            <th>Manufacturer</th>
        </tr>
        <c:forEach var="x" items="${output}" varStatus="index">
            <tr>
                <td>${x.getId()}</td>
                <td>${x.getName()}</td>
                <td>${x.getPrice()}</td>
                <td>${x.getDescription()}</td>
                <td>${x.getManufacturer()}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>
