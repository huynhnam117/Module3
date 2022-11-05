<%--
  Created by IntelliJ IDEA.
  User: vannam
  Date: 04/11/2022
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>
    <a href="/Product">Back to Product list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>Id: </td>
                <td>${Product.getId()}</td>
            </tr>
            <tr>
                <td>Name: </td>
                <td>${Product.getName()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete Product"></td>
                <td><a href="/Product">Back to Product list</a></td>
            </tr>
        </table>
    </fieldset>
    </form>
</body>
</html>
