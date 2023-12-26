<%--
  Created by IntelliJ IDEA.
  User: nguyentatquyen
  Date: 26/12/2023
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <script
          src="https://kit.fontawesome.com/64d58efce2.js"
          crossorigin="anonymous"
  ></script>
  <link rel="stylesheet" href="login_1-1/style.css" />
  <title>Đăng Nhập & Đăng Ký</title>
</head>
<body>
<div class="container">
  <div class="forms-container">
    <div class="signin-signup">
      <form action="#" class="sign-in-form">
        <h2 class="title">Đăng Nhập</h2>
        <div class="input-field">
          <i class="fas fa-user"></i>
          <input type="text" placeholder="Tên Đăng Nhập" />
        </div>
        <div class="input-field">
          <i class="fas fa-lock"></i>
          <input type="password" placeholder="Mật Khẩu" />
        </div>
        <input type="submit" value="Đăng Nhập" class="btn solid" />
      </form>
      <form action="#" class="sign-up-form">
        <h2 class="title">Tạo Tài Khoản Mới</h2>
        <div class="input-field">
          <i class="fas fa-user"></i>
          <input type="text" placeholder="Tên Tài Khoản" />
        </div>
        <div class="input-field">
          <i class="fas fa-lock"></i>
          <input type="password" placeholder="Mật Khẩu" />
        </div>
        <div class="input-field">
          <i class="fas fa-user"></i>
          <input type="text" placeholder="Họ & Tên" />
        </div>
        <div class="input-field">
          <i class="fas fa-phone"></i>
          <input type="number" placeholder="Số Điện Thoại" />
        </div>
        <div class="input-field">
          <i class="fas fa-address-book"></i>
          <input type="text" placeholder="Địa Chỉ" />
        </div>
        <div class="input-field">
          <i class="fas fa-envelope"></i>
          <input type="email" placeholder="Email" />
        </div>
        <input type="submit" class="btn" value="Đăng Ký" />
      </form>
    </div>
  </div>

  <div class="panels-container">
    <div class="panel left-panel">
      <div class="content">
        <h3>Bạn Chưa Có Tài Khoản ?</h3>
        <p>
          Hãy Đăng Ký Ngay Để Mua Được Sách Bạn Mong Muốn
        </p>
        <button class="btn transparent" id="sign-up-btn">
          Đăng Ký
        </button>
      </div>
      <img src="login_1-1/notebook.svg" class="image" alt="" />
    </div>
    <div class="panel right-panel">
      <div class="content">
        <h3>Bạn Đã Có Tài Khoản</h3>
        <p>
          Chúng Ta Hãy Đăng Nhập Kẻo Hết Sách Bạn Yêu Thích
        </p>
        <button class="btn transparent" id="sign-in-btn">
          Đăng Nhập
        </button>
      </div>
      <img src="login_1-1/books.svg" class="image" alt="" />
    </div>
  </div>
</div>

<script src="login_1-1/main.js"></script>
</body>
</html>
