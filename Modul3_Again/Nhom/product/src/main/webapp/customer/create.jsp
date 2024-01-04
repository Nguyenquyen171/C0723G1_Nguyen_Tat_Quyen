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
        <div class="col-md-7" style="float: right">
            <form method="post">
                <h3 style="margin-bottom: 10px">Thêm mới thông tin khách hàng</h3>
                <div class="mb-3 row">
                    <label for="name" class="col-sm-4 col-form-label" style="font-weight: bold">Họ tên<span
                            style="color: red">*</span></label>
                    <div class="col-sm-8">
                        <input name="name" type="text" class="form-control" id="name" required>
                    </div>
                </div>
                <div class="mb-3 row">
                    <label for="email" class="col-sm-4 col-form-label" style="font-weight: bold">Email<span
                            style="color: red">*</span></label>
                    <div class="col-sm-8">
                        <input name="email" type="text" class="form-control" id="email" placeholder="@gmail.com"
                               required>
                    </div>
                </div>
                <div class="mb-3 row">
                    <label for="phoneNumber" class="col-sm-4 col-form-label" style="font-weight: bold">Số điện
                        thoại<span
                                style="color: red">*</span></label>
                    <div class="col-sm-8">
                        <input name="phone" type="text" class="form-control" id="phoneNumber"
                               placeholder="Mời bạn nhập số điện thoại"
                               required>
                    </div>
                </div>
                <div class="mb-3 row">
                    <label for="address" class="col-sm-4 col-form-label" style="font-weight: bold">Địa chỉ<span
                            style="color: red">*</span></label>
                    <div class="col-sm-8">
                        <input name="address" type="text" class="form-control" id="address"
                               placeholder="Mời bạn nhập địa chỉ"
                               required>
                    </div>
                </div>
                <div class="mb-3 row">
                    <label for="gender" class="col-sm-4 col-form-label" style="font-weight: bold">Giới tính<span
                            style="color: red">*</span></label>
                    <div class="col-sm-8" id="gender">
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="inlineRadioOptions"
                                   id="inlineRadio1"
                                   value="option1">
                            <label class="form-check-label" for="inlineRadio1">Nam</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input  class="form-check-input" type="radio" name="inlineRadioOptions"
                                   id="inlineRadio2"
                                   value="option2">
                            <label class="form-check-label" for="inlineRadio2">Nữ</label>
                        </div>
                    </div>
                </div>
                <div class="mb-3 row">
                    <label for="username" class="col-sm-4 col-form-label" style="font-weight: bold">Tài khoản
                        <span style="color: red">*</span></label>
                    <div class="col-sm-8">
                        <input name = "username" type="text" class="form-control" id="username" placeholder="User name" required>
                    </div>
                </div>
                <div class="mb-3 row">
                    <label for="password" class="col-sm-4 col-form-label" style="font-weight: bold">Mật khẩu
                        <span style="color: red">*</span></label>
                    <div class="col-sm-8">
                        <input name ="password" type="password" class="form-control" id="password" placeholder="Mời bạn nhập mật khẩu"
                               required>
                    </div>
                </div>
                <div class="mb-3 row">
                    <div class="col-sm-4"></div>
                    <div class="col-sm-8">
                        <button type="submit" class="btn btn-danger"
                                style="width: 50%; text-transform: uppercase;font-weight: 600">
                            Thêm mới khách hàng
                        </button>
                    </div>
                </div>
            </form>
        </div>
        <div class="col-md-3" style="margin-bottom: 100px;    margin-top: 40px;
">
            <p>Trên trang này bạn có thể sửa đổi thông tin đăng nhập và các dữ liệu cá nhân được sử dụng trong để
                mua
                hàng.</p>
            <p>
                Để giữ cho tài khoản của bạn bảo mật an toàn chúng tôi khuyên bạn nên tránh việc tạo mật khẩu sử
                dụng:
            </p>
            <ul>
                <li>Từ điển trong ngôn ngữ bất kỳ.</li>
                <li>Từ đánh vần ngược, lỗi chính tả phổ biến, và chữ viết tắt.</li>
                <li>Trình tự hoặc các ký tự lặp đi lặp lại. Ví dụ: 12345678, 222222, abcdefg, hoặc các chữ cái liền
                    kề
                    trên
                    bàn phím (qwerty).
                </li>
                <li>Thông tin cá nhân. Tên của bạn, sinh nhật, số giấy phép lái xe, số hộ chiếu, hoặc thông tin
                    tương
                    tự.
                </li>
            </ul>
        </div>
    </div>
    <c:import url="footer1.jsp"></c:import>
</div>
</body>
</html>

