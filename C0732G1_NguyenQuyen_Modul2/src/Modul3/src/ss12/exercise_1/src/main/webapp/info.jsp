<%--
  Created by IntelliJ IDEA.
  User: nguyentatquyen
  Date: 02/11/2023
  Time: 07:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Thong tin User</title>
</head>
<body>
<h3>Thong tin nguoi dung</h3>
<p>Ten: ${user.getName()}</p>
<p>Email: ${user.getEmail()}</p>
<p>Country ${user.getCountry()}</p>
<a href="/users">Quay lai danh sach</a>
<p></p>
</body>
</html>