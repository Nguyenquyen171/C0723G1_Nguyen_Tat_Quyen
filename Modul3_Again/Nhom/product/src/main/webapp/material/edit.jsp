<%--
  Created by IntelliJ IDEA.
  User: Gia Kiet
  Date: 11/3/2023
  Time: 11:36 AM
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
    <div class="col-md-6 " style="float: right">
        <h3 style="margin-bottom: 10px">Chỉnh sửa chất liệu </h3>
        <form action="/quan_ly_chat_lieu?action=edit" method="post" class="b1">

            <div class="mb-3 row">
                <label class="col-sm-4 col-form-label" style="font-weight: bold">Mã loại chất liệu</label>
                <div class="col-sm-8">
                    <input type="text" name="nameId" value="${QuanLyChatLieu.getNameId()}" readonly>
                </div>
            </div>
            <div class="mb-3 row">
                <label class="col-sm-4 col-form-label" style="font-weight: bold">Tên loại chất liệu</label>
                <div class="col-sm-8">
                    <input type="text" name="nameType" id="name" value="${QuanLyChatLieu.getNameType()}">
                </div>
            </div>
            <div class="mb-3 row">
                <label class="col-sm-4 col-form-label" style="font-weight: bold">Mô tả</label>
                <div class="col-sm-8">
                    <input type="text" name="describe" id="describe" value="${QuanLyChatLieu.getDescribe()}">
                </div>
            </div>
            <button type="submit" value="submit" class="btn btn-danger" style="width: 23%; text-transform: uppercase;font-weight: 600 ; font-size: 12px ;
            font-family: 'Roboto', sans-serif;">
                Edit
            </button>
        </form>
    </div>
</div>
<c:import url="footer.jsp"></c:import>
</body>
</html>
