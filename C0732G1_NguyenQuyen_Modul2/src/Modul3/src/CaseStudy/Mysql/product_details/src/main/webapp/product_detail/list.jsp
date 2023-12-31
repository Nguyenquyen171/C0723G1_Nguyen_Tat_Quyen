<%--
  Created by IntelliJ IDEA.
  User: nguyentatquyen
  Date: 04/11/2023
  Time: 22:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="main.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">

    <style>
        ul {
            list-style-type: none;
        }

        p {
            font-family: Roboto;
        }

        body.new-design .hero .hero-title .eyebrow {
            font-size: 12px;
            line-height: 16px;
            font-weight: 700;
            letter-spacing: -.05em;
            text-transform: uppercase;
            padding-bottom: 0.5rem;
            margin-bottom: 0;
        }

        .hero .hero-title {
            color: #fff;
            font-size: 66px;
            letter-spacing: 2px;
            font-variant-ligatures: none;
            line-height: 70px;
            margin-bottom: 16px;
            position: relative;
            text-transform: uppercase;
            z-index: 25;
        }


        .overline {
            font-size: .625rem;
            letter-spacing: .0625rem;
            line-height: 1rem;
            font-weight: 400;
            text-transform: uppercase;
        }

        .lv-product__name {
            text-transform: none;
        }

        .heading-s {
            font-size: 1.125rem;
            letter-spacing: .025rem;
            line-height: 1.5rem;
            font-weight: 400;
        }


        .variation-selector__title {
            font-size: .875rem;
            letter-spacing: .025rem;
            line-height: 1rem;
            font-weight: 400;
            color: inherit;
        }

        .variation-selector__value {
            font-size: .875rem;
            letter-spacing: .025rem;
            line-height: 1rem;
            font-weight: 400;
            color: inherit;
        }

        h1, h2, h3, h4, h5, h6 {
            font-weight: 400;
        }

        h1 {
            font-size: 2em;
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

            </div>

        </div>
        <div>

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

                </li>
                <li class="nav-item " style="margin-right: 2%">
                    <button class="btn"><i class="fa-regular fa-user"></i></button>
            </ul>
        </div>
    </div>
</nav>
<main>
    <div>
        <div class="container">
            <div class="row">
                <div class="col-6 ">
                    <div class="card ">
                        <div class="card row justify-content-center" style="background: rgb(246,245,243)">
                            <div class="carousel slide" data-bs-ride="carousel">
                                <div class="carousel-inner">
                                    <div class="carousel-item active">
                                        <img src="https://vn.louisvuitton.com/images/is/image/lv/1/PP_VP_L/louis-vuitton-nh%E1%BA%ABn-louis-vuitton-blossom-danh-m%E1%BB%A5c-s%E1%BA%A3n-ph%E1%BA%A9m--Q0I25C_PM2_Side%20view.png?wid=1440&hei=1440"
                                             class="d-block w-100" alt="...">
                                    </div>
                                    <div class="carousel-item">
                                        <img src="https://vn.louisvuitton.com/images/is/image/lv/1/PP_VP_L/louis-vuitton-nh%E1%BA%ABn-louis-vuitton-blossom-danh-m%E1%BB%A5c-s%E1%BA%A3n-ph%E1%BA%A9m--Q0I25C_PM2_Front%20view.png?wid=1440&hei=1440"
                                             class="d-block w-100" alt="...">
                                    </div>
                                </div>
                                <button class="carousel-control-prev" type="button"
                                        data-bs-target="#carouselExampleAutoplaying" data-bs-slide="prev">
                                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                    <span class="visually-hidden">Previous</span>
                                </button>
                                <button class="carousel-control-next" type="button"
                                        data-bs-target="#carouselExampleAutoplaying" data-bs-slide="next">
                                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                    <span class="visually-hidden">Next</span>
                                </button>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-6">
                    <div class="col-lg-7 ">
                        <br>
                        <br>
                        <br>
                        <br>
                        <br>
                        <br>
                        <c:forEach items="${productDetailList}" var="product_detail" varStatus="status">
                            <div class="container  offset-6">

                                <strong class="overline">
                                        ${status.id}
                                </strong>
                                <h1 class="lv-product__name heading-s">
                                        ${status.nameProduct}
                                </h1>
                                <span>  ${status.price}</span>
                                <br>
                                <br>

                                <span class="variation-selector__title">
      Chất liệu &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </span>
                                <span class="variation-selector__value">
                                        ${status.material}
    </span>
                                <hr>
                                <span class="variation-selector__title">
      ${status.quantity} &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </span>
                                <div class="btn-group dropend">
                                    <button type="button" class="btn ">
                                        S
                                    </button>
                                    <button type="button" class="btn  dropdown-toggle dropdown-toggle-split"
                                            data-bs-toggle="dropdown" aria-expanded="false">
                                        <span class="visually-hidden">Toggle Dropright</span>
                                    </button>
                                    <ul class="dropdown-menu">
                                        <li>1</li>
                                        <li>2</li>
                                        <li>3</li>
                                        <li>4</li>
                                        <li>5</li>
                                    </ul>
                                </div>
                                <br>
                                <span class="variation-selector__title">
     Số lượng &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </span>
                                <div class="btn-group dropend">
                                    <button type="button" class="btn ">
                                        Q
                                    </button>
                                    <button type="button" class="btn  dropdown-toggle dropdown-toggle-split"
                                            data-bs-toggle="dropdown" aria-expanded="false">
                                        <span class="visually-hidden">Toggle Dropright</span>
                                    </button>
                                    <ul class="dropdown-menu">
                                        <li> ${status.detail}</li>

                                    </ul>
                                </div>

                                <br>
                                <br>
                                <br>
                                <div class="d-grid gap-2">
                                    <button class="btn btn-dark" type="button">Mua Ngay</button>
                                </div>
                                <br>
                                <div>
                                    <p class="overline">Kiểm tra tình trạng còn hàng tại cửa hàng
                                    </p>
                                    <p style="padding: 0px" class="overline">
                                        Thông tin chi tiết sản phẩm
                                    </p>
                                </div>
                            </div>
                        </c:forEach>
                    </div>

                </div>
            </div>
        </div>
    </div>

</main>
</body>
</html>
