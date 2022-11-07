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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>
<h1 class="fw-light" style="text-align: center">List Contract.</h1>
<p class="text-center mt-3"><a href="/"><i class="fa-solid fa-house-chimney h5 mx-1"></i>Back HOME</a></p>
<button type="button" class="btn btn-outline-primary">+Add Contract</button>
<form class="d-flex" role="search" style="margin-left: 1360px">

    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" style="width: 300px">
    <button class="btn btn-outline-success" type="submit">Search</button>
</form>
<table class="table">
    <thead>
    <tr>
        <th scope="col">ID</th>
        <th scope="col">Start_date</th>
        <th scope="col">End_date</th>
        <th scope="col">Deposit</th>
        <th scope="col">Employee_id</th>
        <th scope="col">Customer_id</th>
        <th scope="col">Facility_id</th>
        <th scope="col">Edit</th>
        <th scope="col">Delete</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">1</th>
        <td>11/07/2000</td>
        <td>30/07/2000</td>
        <td>12.000.000</td>
        <td>1</td>
        <td>1</td>
        <td>1</td>

        <td> <button type="button" class="btn btn-outline-primary" data-bs-toggle="modal">Edit </button></td>
        <td>
            <button type="button" class="btn btn-outline-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">
                Delete
            </button>
            <div class="modal fade" id="exampleModal1" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel1">Bạn Có Chắc Chắn Muốn Xóa Không?</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                            <button type="button" class="btn btn-primary">Save changes</button>
                        </div>
                    </div>
                </div>
            </div>
        </td>
    </tr>
    <tr>
        <th scope="row">2</th>
        <td>11/09/2000</td>
        <td>20/10/2000</td>
        <td>15.000.000</td>
        <td>2</td>
        <td>2</td>
        <td>2</td>

        <td> <button type="button" class="btn btn-outline-primary" data-bs-toggle="modal">Edit </button></td>
        <td>
            <button type="button" class="btn btn-outline-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">
                Delete
            </button>
            <div class="modal fade" id="exampleModal2" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel2">Bạn Có Chắc Chắn Muốn Xóa Không?</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                            <button type="button" class="btn btn-primary">Save changes</button>
                        </div>
                    </div>
                </div>
            </div>
        </td>
    </tr>
    <tr>
        <th scope="row">3</th>
        <td>15/07/2000</td>
        <td>29/07/2000</td>
        <td>17.000.000</td>
        <td>3</td>
        <td>3</td>
        <td>3</td>

        <td> <button type="button" class="btn btn-outline-primary" data-bs-toggle="modal">Edit </button></td>
        <td>
            <button type="button" class="btn btn-outline-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">Delete</button>
            <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">Bạn Có Chắc Chắn Muốn Xóa Không?</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                            <button type="button" class="btn btn-primary">Save changes</button>
                        </div>
                    </div>
                </div>
            </div>
        </td>
    </tr>

    </tbody>
</table>
</body>
</html>
