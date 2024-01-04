<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/3/2023
  Time: 1:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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


        .btn-outline-danger {
            font-size: 12px;

        }
    </style>
</head>
<div>
    <c:import url="navbar.jsp"></c:import>
    <div class="row m-4">
        <c:import url="menu-admin.jsp"></c:import>
        <div class="col-md-10 col-sm-12">
            <h2 class="title-h2">Quản lý khách hàng</h2>
                <div class="row b1">
                    <div class="col-md-2 col-sm-6">
                        <p>Tên khách hàng</p>
                        <input class="form-control form-control-sm b1" type="text" placeholder="Example"
                               aria-label=".form-control-sm example">
                    </div>
                    <div class="col-md-2 col-sm-6">
                        <p>Loại khách hàng</p>
                        <select class="form-select form-select-sm b1" aria-label="Small select example">
                            <option selected>Tất cả</option>
                            <option value="1">Gold</option>
                            <option value="1">Platinum</option>
                            <option value="1">Diamond</option>
                        </select>
                    </div>
                    <div class="col-md-8 col-sm-6">
                        <div class="py-4 d-flex" style="position: relative ; top: 10px;">
                            <button type="submit" class="btn btn-outline-danger btn-sm bt b1">Tìm kiếm
                            </button>
                            <a href="customer?action=create" >
                                <button type="button" class="btn btn-outline-danger btn-sm bt b1 mx-3" >Thêm khách hàng
                                </button>
                            </a>
                        </div>
                    </div>
                </div>
            <div class="b1">
                <table class="table table-striped table-hover">
                    <thead style="font-size: 14px">
                    <tr>
                        <th>Mã</th>
                        <th>Tên khách hàng</th>
                        <th>Email</th>
                        <th>Số điện thoại</th>
                        <th>Giới tính</th>
                        <th>Loại khách hàng</th>
                        <th>Chi tiết</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="customer" items="${customerAllDTOList}">
                        <tr>
                            <td>${customer.customerCode}</td>
                            <td>${customer.name}</td>
                            <td>${customer.email}</td>
                            <td>${customer.phone}</td>
                            <td>${customer.gender}</td>
                            <td>${customer.customerType}</td>
                            <td><a href="customer?action=detail&id=${customer.customerCode}">
                                <button type="button" class="btn btn-outline-primary" style="font-size: 16px;">Chi tiết
                                </button>
                            </a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    <c:import url="footer1.jsp"></c:import>
</div>
</body>
</html>

