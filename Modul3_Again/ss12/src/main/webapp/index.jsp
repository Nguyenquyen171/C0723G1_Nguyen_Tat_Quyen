<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
        rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
        crossorigin="anonymous">

</head>
<body>
<h1>
</h1>
<br/>


<div class="container">
  <h2>Danh sách công việc</h2>
  <a class="btn btn-outline-primary" href="?action=createForm" methods="post" role="button">Thêm mới công việc</a>
  <table style="margin-top: 5px" class="table table-hover table-bordered">
    <thead>
    <tr>
      <th>STT</th>
      <th>Tên </th>
      <th>Kích thước</th>
      <th>Mô tả thêm</th>
      <th>Chức năng</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${bookList}" var="book" varStatus="loop">
      <tr>
        <td>${loop.count}</td>
        <td>${book.title}</td>
        <td>${book.pageSize}</td>
        <td>${book.category.name}</td>
                      <td><a class="btn btn-outline-primary" href="" role="button">Edit</a></td>
        <td style="text-align: center"><button type="button" class="btn btn-outline-danger"
                                               data-bs-toggle="modal" data-bs-target="#exampleModal"
                                               onclick="sendInf('${book.id}','${book.title}')"
        >
          Xóa
        </button></td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
</div>
<%-- modal--%>
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <form action="?action=delete" method="post">
      <div class="modal-content">
        <div class="modal-header">
          <h1 class="modal-title fs-5" id="exampleModalLabel">Remove product</h1>
          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
        </div>
        <div class="modal-body">
          <input type="hidden" name="idDel" id="idDel">
          Bạn chắc chắn muốn xóa công việc <span id="nameDel" class="text-danger"> </span> ?
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Hủy</button>
          <button type="submit" class="btn btn-danger">Xóa</button>
        </div>
      </div>
    </form>
  </div>
</div>

<%--pagination--%>
<nav aria-label="Page navigation example" class="mt-3">
  <ul class="pagination justify-content-center">
    <c:forEach begin="1" end="" var="page">
      <li class="page-item"><a class="page-link" href=""></a> </li>
    </c:forEach>
  </ul>
</nav>

<script>
  function sendInf(id, title) {
    document.getElementById("nameDel").innerText = title;
    document.getElementById("idDel").value = id;
  }
</script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
</body>
</html>