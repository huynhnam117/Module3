<%--
  Created by IntelliJ IDEA.
  User: vannam
  Date: 04/11/2022
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Delete product page</h1>
<a href="/Product">Back to the list page!</a>
<form action="/Product?action=delete" method="post">
    <p>Do you wish to delete the product that has the id of <input type="text" name="id" value="${id}"></p>
    <p><button>Yes</button> <a href="/Product">No</a></p>
</form>
<c:if test="${mess!=null}">
    <span> ${mess}</span>
</c:if>
</body>
</html>
