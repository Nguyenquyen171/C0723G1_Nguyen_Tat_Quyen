<%--
  Created by IntelliJ IDEA.
  User: Gia Kiet
  Date: 11/8/2023
  Time: 7:22 AM
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

        .chinhsuabtn {
            width: 20%;
            height: 50px;
            font-size: 15px;
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
    <c:import url="menu-user.jsp"></c:import>

        <div class="col-md-6 " style="float: right">
            <h3 style="margin-bottom: 10px">Thông tin tài khoản </h3>

            <div class="mb-3 row">
                <label class="col-sm-4 col-form-label" style="font-weight: bold">Họ tên</label>
                <div class="col-sm-8">
                    <table>
                        <tr>
                            <td name="name">${listNgu.getName()}</td>
                        </tr>
                    </table>
                </div>
            </div>
            <div class="mb-3 row">
                <label class="col-sm-4 col-form-label" style="font-weight: bold">Email</label>
                <div class="col-sm-8">
                    <table>
                        <tr>
                            <td name="email">${listNgu.getEmail()}</td>
                        </tr>
                    </table>
                </div>
            </div>
            <div class="mb-3 row">
                <label class="col-sm-4 col-form-label" style="font-weight: bold">Số điện thoại</label>
                <div class="col-sm-8">
                    <table>
                        <tr>
                            <td name="phone">${listNgu.getPhoneNumber()}</td>
                        </tr>
                    </table>
                </div>
            </div>
            <div class="mb-3 row">
                <label class="col-sm-4 col-form-label" style="font-weight: bold">Địa chỉ</label>
                <div class="col-sm-8">
                    <table>
                        <tr>
                            <td name="address">${listNgu.getAddress()}</td>
                        </tr>
                    </table>
                </div>
            </div>
            <div class="mb-3 row">
                <label class="col-sm-4 col-form-label" style="font-weight: bold">Giới tính</label>
                <div class="col-sm-8">
                    <table>
                        <tr>
                            <td name="gender">${listNgu.getGender()}</td>
                        </tr>
                    </table>
                </div>
            </div>
            <div class="mb-3 row">
                <label class="col-sm-4 col-form-label" style="font-weight: bold">UserName</label>
                <div class="col-sm-8">
                    <table>
                        <tr>
                            <td name="userName">${listNgu.getUserName()}</td>
                        </tr>
                    </table>
                </div>
            </div>
            <a href="/thong_tin_tai_khoan?action=edit&username=${listNgu.getUserName()}">
            chinh sua
            </a>
        </div>

    <div class="col-md-4" style="margin-bottom: 100px;    margin-top: 40px;
">
        <p>Trên trang này bạn có thể sửa đổi thông tin đăng nhập và các dữ liệu cá nhân được sử dụng trong để mua
            hàng.</p>
        <p>
            Để giữ cho tài khoản của bạn bảo mật an toàn chúng tôi khuyên bạn nên tránh việc tạo mật khẩu sử dụng:
        </p>
        <ul>
            <li>Từ điển trong ngôn ngữ bất kỳ.</li>
            <li>Từ đánh vần ngược, lỗi chính tả phổ biến, và chữ viết tắt.</li>
            <li>Trình tự hoặc các ký tự lặp đi lặp lại. Ví dụ: 12345678, 222222, abcdefg, hoặc các chữ cái liền kề
                trên
                bàn phím (qwerty).
            </li>
            <li>Thông tin cá nhân. Tên của bạn, sinh nhật, số giấy phép lái xe, số hộ chiếu, hoặc thông tin tương
                tự.
            </li>
        </ul>
    </div>
</div>

</body>
<c:import url="footer1.jsp"></c:import>
<script>

</script>
</html>
