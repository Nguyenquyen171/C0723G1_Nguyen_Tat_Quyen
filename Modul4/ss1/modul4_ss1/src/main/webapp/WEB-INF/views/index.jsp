<%--
  Created by IntelliJ IDEA.
  User: nguyentatquyen
  Date: 10/01/2024
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/convert">
    <label for="usd"> USD</label>
    <input type="number" name="usd" id="usd"> <br><br>
    <input type="submit" value="Chuyển đổi">
    <c:if test="${not empty vnd}">
        <p>
            Kết quả sau khi chuyển đổi là : ${vnd} đ
        </p>
    </c:if>
</form>
</body>
</html>
