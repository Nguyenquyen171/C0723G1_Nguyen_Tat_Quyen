<%--
  Created by IntelliJ IDEA.
  User: nguyentatquyen
  Date: 06/11/2023
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">
  <style>
    ​
    ​
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
    ​
    ​
    .b1{
      font-size: 12px;
      font-family: 'Roboto', sans-serif;
    }
    .left1 td {
      font-size: 14px;
      font-family: 'Roboto', sans-serif;
    }
    .btn-outline-secondary {
      font-size: 12px;
      padding: 3px 3px;
    }
    .btn-danger{
      font-size: 12px;
      padding: 3px 3px;
    }
  </style>
</head>
<body>
<nav class="navbar navbar-expand-lg bg-white px-5">
  <div class="container-fluid p-0">
    <div>
      <a class="navbar-brand" href="#">
        <img src="FBDBc3UVcAczrDS.jpeg" height="100" width="130"/></a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
              data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
              aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
    </div>
    <div style="margin: 0 auto">
      <div class="collapse navbar-collapse ">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li>
            <a class="nav-link active" aria-current="page" href="#" style="color: black">Trang sức
              bạc</a>
          </li>
          <li>
            <a class="nav-link" href="#" style="color: black"> Trang sức vàng </a>
          </li>
          <li>
            <a class="nav-link" href="#" style="color: black">Nhẫn cưới </a>
          </li>
          <li>
            <a class="nav-link" href="#" style="color: black">Thành Viên </a>
          </li>
        </ul>
        ​
      </div>
      ​
    </div>
    <div>
      ​
      <ul class="navbar-nav d-flex me-auto mb-2 mb-lg-0 right">
        <li>
          <form class="d-flex" role="search">
            <input class="form-control me-2" type="search" placeholder="Tìm kiếm" aria-label="Search">
            <button class="btn " type="submit"><i class="fa-solid fa-magnifying-glass"></i>
            </button>
          </form>
        </li>
        <li class="nav-item " style="margin-right: 2%">
          <button class="btn"><i class="fa-solid fa-cart-shopping"></i></button>
          ​
        </li>
        <li class="nav-item " style="margin-right: 2%">
          <button class="btn"><i class="fa-regular fa-user"></i></button>
      </ul>
    </div>
  </div>
</nav>
​
<div class="row m-4 ">
  <div class="col-md-2 col-sm-12 left1" style="background-color: #F5F4F4">
    <ul class="nav flex-column " >
      <li class="nav-item">
        <table >
          <tr>
            <td><img src="https://i.imgur.com/IERUO2e.png" height="15" width="14"/></td>
            <td><a class="nav-link text-secondary" href="#">Thông tin tài khoản</a></td>
          </tr>
        </table>
      </li>
      <li class="nav-item">
        <table>
          <tr>
            <td><img src="https://i.imgur.com/uvXA2cO.png" height="16" width="13"/></td>
            <td><a class="nav-link text-secondary" href="#">Quản lý đơn hàng</a></td>
          </tr>
        </table>
      </li>
      <li class="nav-item">
        <table>
          <tr>
            <td><img src="https://i.imgur.com/uvXA2cO.png" height="16" width="13"/></td>
            <td><a class="nav-link text-secondary" href="#">Giỏ hàng</a></td>
          </tr>
        </table>
      </li>
      <li class="nav-item">
        <table>
          <tr>
            <td><img src="https://i.imgur.com/uvXA2cO.png" height="16" width="13"/></td>
            <td><a class="nav-link text-secondary" href="#">Quản lý khách hàng</a></td>
          </tr>
        </table>
      </li>
      <li class="nav-item">
        <table>
          <tr>
            <td><img src="https://i.imgur.com/uvXA2cO.png" height="16" width="13"/></td>
            <td><a class="nav-link text-secondary" href="#">Quản lý sản phẩm</a></td>
          </tr>
        </table>
      </li>
      ​
      ​
    </ul>
  </div>
  <div class="col-md-10 col-sm-12">
    <h2 class="title-h2">QUẢN LÝ LOẠI SẢN PHẨM</h2>
    <button type="button" class="btn btn-outline-secondary my-3">Thêm Loại sản phẩm</button>
    ​
    <form>
      <div class="row b1">
        <div class="col-md-2 col-sm-6">
          <p>Mã loại sản phẩm</p>
          <input class="form-control form-control-sm b1" type="text" placeholder="Example"
                 aria-label=".form-control-sm example">
        </div>
        ​
        <div class="col-md-2 col-sm-6">
          <p>Tên loại sản phẩm</p>
          <select class="form-select form-select-sm b1" aria-label="Small select example">
            <option selected>Tất cả</option>
            <option value="1">Nhẫn</option>
            <option value="1">Bông tai</option>
            <option value="1">Vòng tay</option>
            <option value="1">Dây chuyền</option>
            ​
          </select>
        </div>
        ​
        <div class="col-md-2 col-sm-6">
          <div class="py-4">
            <button type="submit" class="btn btn-outline-danger bt b1" style="height: 30.33px; margin-top: 7px" >Tìm kiếm</button>
          </div>
          ​
        </div>
      </div>
    </form>
    <div class="b1">
      <table class="table table-striped table-hover">
        <thead style="font-size: 14px">
        <tr>
          <th>Mã loại sản hàng</th>
          <th>Tên loại sản phẩm</th>
          <th>Mô tả</th>
          ​
        </tr>
        </thead>
        <tbody>
        <tr>
          <td>AB1234</td>
          <td>Vàng</td>
          <td>Đã giao</td>
          <td><button type="button" class="btn btn-outline-secondary">Chi tiết</button>
            <button type="button" class="btn btn-danger">Huỷ đơn</button></td>
          ​
        </tr>
        <tr>
          <td>AB1234</td>
          <td>25/12/2023</td>
          <td>Đã giao</td>

          <td><button type="button" class="btn btn-outline-secondary">Chi tiết</button>
            <button type="button" class="btn btn-danger">Huỷ đơn</button></td>
          ​
        </tr>
        <tr>
          <td>AB1234</td>
          <td>25/12/2023</td>
          <td>Đã giao</td>

          <td><button type="button" class="btn btn-outline-secondary">Chi tiết</button>
            <button type="button" class="btn btn-danger">Huỷ đơn</button></td>

        </tr>

        </tbody>
      </table>
    </div>
  </div>
  hiskirkkfsknfkanfk sakndkand adnmksadnakio emtak

</div>

</body>
</html>
