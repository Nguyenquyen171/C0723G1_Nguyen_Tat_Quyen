<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nguyentatquyen
  Date: 03/11/2023
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
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
        .b1 {
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

        .btn-danger {
            font-size: 12px;
            padding: 3px 3px;
        }
    </style>

</head>
<body>
​
<div class="row m-4 ">
    <div class="col-md-2 col-sm-12 left1" style="background-color: #F5F4F4">
        <ul class="nav flex-column ">
            <li class="nav-item">
                <table>
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
        <a href="?action=create" methods="post">
            <button type="button" class="btn btn-outline-secondary my-3">Thêm Loại sản phẩm</button>
        </a>
        ​
        <form>
            <div class="row b1">
                <div class="col-md-2 col-sm-6">
                    <p>Tên loại sản phẩm</p>
                    <select class="form-select form-select-sm b1" aria-label="Small select example">
                        <option selected>Tất cả</option>
                        <option value="1">Nhẫn</option>
                        <option value="1">Bông tai</option>
                        <option value="1">Vòng tay</option>
                        <option value="1">Dây chuyền</option>
                    </select>
                </div>
                ​
                <div class="col-md-2 col-sm-6">
                    <div class="py-4">
                        <button type="submit" class="btn btn-outline-danger bt b1"
                                style="height: 30.33px; margin-top: 7px">Tìm kiếm
                        </button>
                    </div>
                    ​
                </div>
            </div>
        </form>
        <div class="b1">
            <table class="table table-striped table-hover">
                <thead style="font-size: 14px">
                <tr>
                    <th>Số thứ tự</th>
                    <th>Mã loại sản phẩm</th>
                    <th>Chất liệu</th>
                    <th>Mô tả</th>
                    ​
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${productTypeList}" var="product_type" varStatus="status">
                    <tr>
                        <td>${status.count}</td>
                        <td>${product_type.productCode}</td>
                        <td>${product_type.typeName}</td>
                        <td>${product_type.describe}</td>
                        <td>
                            <a  href="?action=edit&id=${product_type.getId()}"><button type="button" class="btn btn-outline-secondary b2">Sửa</button></a>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
    ​
    ​

</div>
</body>
</html>
