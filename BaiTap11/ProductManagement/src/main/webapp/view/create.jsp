<%--
  Created by IntelliJ IDEA.
  User: vannam
  Date: 04/11/2022
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Trang Thêm Mới</h1>
<a href="/Product">Quay lại List</a>
<c:if text ="${mess != null}">
 <span style="color: brown">${mess}</span>
</c:if>
<form action="/Product?action=add" method="post">
    <pre>ID:  <input type="text" name="id"/></pre>
    <pre>Name: <input type="text" name="name"/></pre>
    <pre>Price: <input type="text" name="price"/></pre>
    <pre>Describe: <input type="text" name="describe"/></pre>
    <pre>Producer: <input type="text" name="producer"/></pre>
    <pre><button>Save</button></pre>
</form>
</body>
</html>
