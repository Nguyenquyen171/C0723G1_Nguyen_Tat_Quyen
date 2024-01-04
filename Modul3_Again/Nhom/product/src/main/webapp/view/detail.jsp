<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 11/3/2023
  Time: 4:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
            text-align: center;
        }

        h3 {
            font-size: 15px;
            font-family: 'Roboto', sans-serif;
            text-transform: uppercase;
            font-weight: 600;
        }

        .btn-outline-secondary {
            font-size: 15px;
            padding: 3px 3px;
        }

        .font-b {
            font-family: 'Roboto', sans-serif;
            font-weight: 600;
            font-size: 14px;
        }

        .font-c {
            font-family: 'Roboto', sans-serif;
            font-size: 14px;
        }

        .text-of-bill {
            font-family: 'Roboto', sans-serif;
            font-size: 14px;
        }
    </style>
</head>
<body>
<c:import url="navbar.jsp"></c:import>
<div class="m-3">
    <h2 class="title-h2 ">CHI TIẾT ĐƠN HÀNG</h2>
    <div>
        <button type="button" class="btn btn-outline-secondary" onclick="goBack()">Quay lại</button>
    </div>
    <div class="row">
        <div class="col-md-7">
            <c:forEach items="${orderDetailDotList}" var="order">
                <div class="row">
                    <div class="col-md-3">
                        <img src="${order.imageLink}" height="90%" width="90%"/>
                    </div>
                    <div class="col-md-9 my-3">
                        <h3>${order.productName}</h3>
                        <div><span class="font-b">MSP: </span><span class="font-c">${order.productCode}</span></div>
                        <div><span class="font-b">Số lượng: </span><span class="font-c">${order.productQuality}</span>
                        </div>
                        <div><span class="font-b">Giá mua: </span><span class="font-c">
                                <fmt:formatNumber value="${order.productPrice}" type="currency"/>
                        </span></div>
                        <div><span class="font-b">Thành tiền: </span><span class="font-c">
                               <fmt:formatNumber value="${order.total}" type="currency"/></span></div>
                    </div>
                </div>
            </c:forEach>
        </div>
        <div class="col-md-5">
            <table class="table text-of-bill" style="background-color: #F2F2F2">
                <tbody>
                <tr>
                    <td>Mã đơn hàng:</td>
                    <td>${orderTotalDot.orderCode}</td>
                </tr>
                <tr>
                    <td>Ngày đặt hàng:</td>
                    <td>${orderTotalDot.orderDate}</td>
                </tr>
                <tr>
                    <td>Địa chỉ nhận:</td>
                    <td>${orderTotalDot.orderAddress}</td>
                </tr>
                <tr>
                    <td>Số điện thoại:</td>
                    <td>${orderTotalDot.orderPhone}</td>
                </tr>
                <tr>
                    <td>Tổng tiền:</td>
                    <td><fmt:formatNumber value="${orderTotalDot.orderTotal}" type="currency"/></td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
<c:import url="footer1.jsp"></c:import>
<script>
    function goBack() {
        window.location.href = '/user_order';
    }
</script>
</body>
</html>
