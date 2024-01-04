<%--
  Created by IntelliJ IDEA.
  User: Gia Kiet
  Date: 11/5/2023
  Time: 11:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">
    <style>
        .title-h2 {
            position: relative;
            border-bottom: 1px solid #e0e0e0;
            margin-bottom: 15px;
            display: block;
            color: #212529;
            transition: 0.3s linear;
            font-size: 22px;
            font-family: 'Roboto', sans-serif;
            text-transform: uppercase;
            font-weight: 600;
        }


        .b1 {
            font-size: 12px;
            font-family: 'Roboto', sans-serif;
        }

        .left1 td {
            font-size: 14px;
            font-family: 'Roboto', sans-serif;
        }

        .btn-outline-secondary {
            font-size: 11px;
            padding: 3px 3px;
        }

        .btn-danger {
            font-size: 11px;
            padding: 3px 3px;
        }

    </style>
</head>


<body>
<c:import url="navbar.jsp"></c:import>

<div class="row m-4 ">
    <c:import url="menu-admin.jsp"></c:import>
    <div class="col-md-10 col-sm-12">
        <h2 class="title-h2">QUẢN LÝ Size</h2>
        <a href="/quan_ly_size?action=add">ADD</a>

        <form action="/quan_ly_size">
            <div class="row b1">
                <div class="col-md-2 col-sm-6">
                    <p>Tên loại size</p>
                    <select class="form-select form-select-sm b1" aria-label="Small select example" name = "nameSize">
                        <option  value="all" selected>Tất cả</option>
                        <c:forEach items="${listName}" var="name">
                            <option value="${name}" name="choose">${name}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="col-md-2 col-sm-6">
                    <div class="py-4">
                        <button type="submit" name = "action" value="search" class="btn btn-outline-danger bt b1"
                                style="height: 30.33px; margin-top: 7px">Tìm kiếm
                        </button>
                    </div>
                </div>
            </div>
        </form>

        <div class="b1">
            <table class="table table-striped table-hover">
                <thead style="font-size: 14px">
                <tr>
                    <th>Mã loại size</th>
                    <th>Tên loại size</th>
                    <th>Mô tả</th>
                    <th>Sửa</th>
                    <th>Xóa</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="quanLySize" items="${list}">
                    <tr>
                        <td><c:out value="${quanLySize.sizeId}"/></td>
                        <td><c:out value="${quanLySize.nameSize}"/></td>
                        <td><c:out value="${quanLySize.describe}"/></td>
                        <td>
                            <a href="/quan_ly_size?action=edit&id=${quanLySize.sizeId}">EDIT</a>
                        </td>
                        <td>
                            <a href="/quan_ly_size?action=delete&id=${quanLySize.sizeId}">DELETE</a>
                        </td>
                    </tr>
                </c:forEach>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
<script src="bootstrap-5.1.3/js/bootstrap.js"></script>
</body>
</html>
