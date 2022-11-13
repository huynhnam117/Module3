<%--
  Created by IntelliJ IDEA.
  User: vannam
  Date: 07/11/2022
  Time: 08:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="mx-5 px-5 pt-3">
    <h2 class="text-center fw-bold">Add Employee</h2>
<%--    Quay lại trang home--%>
    <p class="text-center mt-3"><a href="/"><i class="fa-solid fa-house-chimney h5 mx-1"></i>Back HOME</a></p>
<%--    Quay lại trang List--%>
    <p class="text-center">
        <a href="/employee"><i class="fa-solid fa-backward"></i>Travel Employee page list</a>
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
        <form class="w-50 border border-2 border-success p-3 rounded" action="/employee?action=create"
              method="post">
            <div class="form-group">
                <label for="name" class="h6">Name:</label>
                <div class="input-group">
                    <input type="text" id="name" class="form-control" placeholder="Input name" name="name">
                    <span class="input-group-text"><i class="fa-solid fa-person-circle-question"></i></span>
                </div>
            </div>

            <div class="mt-3 form-group">
                <label for="date_of_birth" class="h6">Birthday:</label>
                <input type="date" id="date_of_birth" class="form-control" name="date_of_birth" min="${minAge}"
                       max="${maxAge}">
            </div>


            <div class="mt-3 form-group">
                <label for="id_card" class="h6">Id card:</label>
                <div class="input-group">
                    <input type="text" id="id_card" class="form-control" placeholder="Input Id card" name="id_card">
                    <span class="input-group-text"><i class="fa-solid fa-id-card"></i></span>
                </div>
            </div>

            <div class="mt-3 form-group">
                <label for="salary" class="h6">Salary:</label>
                <div class="input-group">
                    <input type="text" id="salary" class="form-control" placeholder="Input Salary" name="salary">
                    <span class="input-group-text"><i class="fa-solid fa-id-card"></i></span>
                </div>
            </div>

            <div class="mt-3 form-group">
                <label for="phone" class="h6">Phone:</label>
                <div class="input-group">
                    <input type="text" id="phone" class="form-control" placeholder="Input Phone number" name="phone">
                    <span class="input-group-text"><i class="fa-solid fa-square-phone"></i></span>
                </div>
            </div>

            <div class="mt-3 form-group">
                <label for="email" class="h6">Email:</label>
                <div class="input-group">
                    <input type="text" id="email" class="form-control" placeholder="Input Email" name="email">
                    <span class="input-group-text"><i class="fa-solid fa-envelope-circle-check"></i></span>
                </div>
            </div>

            <div class="mt-3 form-group">
                <label for="address" class="h6">Address:</label>
                <div class="input-group">
                    <input type="text" id="address" class="form-control" placeholder="Input Address" name="address">
                    <span class="input-group-text"><i class="fa-solid fa-map-location-dot"></i></span>
                </div>
            </div>

            <div class="mt-3 form-group">
                <label class="h6" for="position_id">Position_id:</label>
                <div class="input-group">
                    <input type="text" id="position_id" class="form-control" placeholder="Input Position_id" name="position_id">
                    <span class="input-group-text"><i class="fa-solid fa-ranking-star"></i></span>
                </div>
            </div>

            <div class="mt-3 form-group">
                <label class="h6" for="education_degree_id">Education_degree_id:</label>
                <div class="input-group">
                    <input type="text" id="education_degree_id" class="form-control" placeholder="Input Education_degree_id" name="education_degree_id">
                    <span class="input-group-text"><i class="fa-solid fa-ranking-star"></i></span>
                </div>
            </div>

            <div class="mt-3 form-group">
                <label class="h6" for="division_id">division_id:</label>
                <div class="input-group">
                    <input type="text" id="division_id" class="form-control" placeholder="Input division_id" name="division_id">
                    <span class="input-group-text"><i class="fa-solid fa-ranking-star"></i></span>
                </div>
            </div>

            <div class="mt-3 form-group">
                <label class="h6" for="username">Username:</label>
                <div class="input-group">
                    <input type="text" id="username" class="form-control" placeholder="Input Username" name="username">
                    <span class="input-group-text"><i class="fa-solid fa-ranking-star"></i></span>
                </div>
            </div>
<%--          Lưu dữ liệu--%>
            <div class="mt-3 text-center">
                <button class="btn btn-info btn-outline-success btn-sm border border-2 border-success text-dark">
                    Save <i class="fa-solid fa-floppy-disk"></i></button>
            </div>
        </form>
    </div>
</div>
</body>
</html>
