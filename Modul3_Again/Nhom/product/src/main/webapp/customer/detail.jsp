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
        a {
            text-decoration: none;
        }

        .chinhsuabtn {
            width: 20%;
            height: 50px;
            font-size: 15px;
        }
    </style>
</head>
<div>
    <c:import url="navbar.jsp"></c:import>
    <div class="row m-4">
        <c:import url="menu-admin.jsp"></c:import>
        <div class="col-md-10" style="float: right">
            <h3 style="margin-bottom: 10px">Thông tin tài khoản</h3>
            <div class="mb-3 row">
                <label for="makhachhang" class="col-sm-4 col-form-label" style="font-weight: bold">Mã khách hàng</label>
                <div class="col-sm-8">
                    <p id="makhachhang">${customerAllDTO.customerCode}</p>
                </div>
            </div>
            <div class="mb-3 row">
                <label for="name" class="col-sm-4 col-form-label" style="font-weight: bold">Họ Tên</label>
                <div class="col-sm-8">
                    <p id="name">${customerAllDTO.name}</p>
                </div>
            </div>
            <div class="mb-3 row">
                <label for="email" class="col-sm-4 col-form-label" style="font-weight: bold">Email</label>
                <div class="col-sm-8">
                    <span id="email">${customerAllDTO.email}</span>
                </div>
            </div>
            <div class="mb-3 row">
                <label for="phoneNumber" class="col-sm-4 col-form-label" style="font-weight: bold">Số điện
                    thoại</label>
                <div class="col-sm-8">
                    <span id="PhoneNumber">${customerAllDTO.phone}</span>
                </div>
            </div>
            <div class="mb-3 row">
                <label for="gender" class="col-sm-4 col-form-label" style="font-weight: bold">Giới tính</label>
                <div class="col-sm-8">
                    <span id="gender">${customerAllDTO.gender}</span>
                </div>
            </div>
            <div class="mb-3 row">
                <label for="address" class="col-sm-4 col-form-label" style="font-weight: bold">Địa chỉ</label>
                <div class="col-sm-8">
                    <span id="address">${customerAllDTO.address}</span>
                </div>
            </div>
            <div class="mb-3 row">
                <label for="account" class="col-sm-4 col-form-label" style="font-weight: bold">Tài khoản</label>
                <div class="col-sm-8">
                    <span id="account">${customerAllDTO.userName}</span>
                </div>
            </div>

            <div class="mb-3 row">
                <label for="password" class="col-sm-4 col-form-label" style="font-weight: bold">Mật khẩu</label>
                <div class="col-sm-8">
                    <span id="password">${customerAllDTO.password}</span>
                </div>
            </div>
            <div class="mb-3 row">
                <label for="loaikhach" class="col-sm-4 col-form-label" style="font-weight: bold">Loại khách</label>
                <div class="col-sm-8">
                    <span id="loaikhach">${customerAllDTO.customerType}</span>
                </div>
            </div>
        </div>
    </div>
    <c:import url="footer1.jsp"></c:import>
</div>
</body>
</html>

