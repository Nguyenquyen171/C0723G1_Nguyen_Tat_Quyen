<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nguyentatquyen
  Date: 03/11/2023
  Time: 15:16
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
        a {
            text-decoration: none;
        }

        .left1 {
            font-size: 14px;
            font-family: 'Roboto', sans-serif;
        }

        h3 {
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
            font-family: 'Roboto', sans-serif;
        }

    </style>

</head>

<c:import url="navbar.jsp"></c:import>

<div class="row m-4 ">
    <c:import url="menu-admin.jsp"></c:import>
    <div class="col-md-6 " style="float: right">
        <h3 style="margin-bottom: 10px">Chỉnh sửa sản phẩm </h3>
        <form action="?action=edit&id=${productType.getId()}" method="post" class="b1">
            <div class="mb-3 row">
                <label class="col-sm-4 col-form-label" style="font-weight: bold">Chỉnh sửa sản phẩm<span
                        style="color: red">*</span></label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" id="typeName" name="typeName" value="${productType.getTypeName()}" required>
                </div>
            </div>
            <div class="mb-3 row">
                <label class="col-sm-4 col-form-label" style="font-weight: bold">Chỉnh sửa mô tả<span
                        style="color: red">*</span></label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" id="describe" name="describe" value="${productType.getDescribe()}" style="height: 100px"
                           required>
                </div>
            </div>

            <button type="submit" value="submit" class="btn btn-danger" style="width: 23%; text-transform: uppercase;font-weight: 600 ; font-size: 12px;
            font-family: 'Roboto', sans-serif;">
                Thêm mới
            </button>
        </form>
    </div>

</div>

</html>
