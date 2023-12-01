<%--
  Created by IntelliJ IDEA.
  User: nguyentatquyen
  Date: 01/12/2023
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Them moi nguoi dung</h3>
<form action="?action=edit&id=${book.getId()}" method="post">
    <label for="title">Tên:</label><br>
    <input type="text" id="title" name="title" value="${book.getTitle()}"><br><br>
    <label for="page_size">Kích thước:</label><br>
    <input type="text" id="page_size" name="page_size" value="${book.getPageSize()}"><br><br>
    <label for="author">Country:</label><br>
    <input type="text" id="author" name="author" value="${book.getAuthor()}"><br><br>
    <label for="category">Country:</label><br>
    <input type="text" id="category" name="category" value="${book.getCategory()}"><br><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
