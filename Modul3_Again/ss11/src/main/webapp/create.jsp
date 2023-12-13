<%--
  Created by IntelliJ IDEA.
  User: nguyentatquyen
  Date: 30/11/2023
  Time: 08:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="?action=create" method="post">
    <table style="margin-top: 5px" class="table table-hover">
        <thead>
        <tr>
            <th>Tên</th>
            <th>Kích thước trang </th>
            <th>Tác giả </th>
            <th>Loại sách</th>
            <th>Chức năng</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td><input type="text" name="title"></td>
            <td><input type="number" name="page_size"></td>
            <td><input type="text" name="author"></td>
            <td><input type="text" name="author"></td>
            <td><input type="category" name="category"></td>
            <input type="submit" value="Submit">
        </tr>
        </tbody>
    </table>
</form>
</body>
</html>
