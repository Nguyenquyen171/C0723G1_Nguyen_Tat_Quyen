<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 10/10/2023
  Time: 10:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Thêm mới công việc</title>
</head>
<body>
<form action="?action=create" method="post">
    <table style="margin-top: 5px" class="table table-hover">
        <thead>
        <tr>
            <th>Tên </th>
            <th>Kích thước</th>
            <th>Mô tả thêm</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td><input type="text" name="title"></td>
            <td><input type="number" name="page_size"></td>
            <td>
                <select name="id">
                    <c:forEach items="${categoryList}" var="category">
                        <option name="statusId" value="${category.id}">${category.name}</option>
                    </c:forEach>
                </select>
            </td>

        </tr>
        <%--        <label>Tên công việc <input type="text" name="name"></label>--%>
        <%--        <br/>--%>
        <%--        <label>Ngày thực hiên <input type="date" name="startDate"></label>--%>
        <%--        <br/>--%>
        <%--        <label>Ngày kết thúc <input type="date" name="deadline"></label>--%>
        <%--        <br/>--%>
        <%--        <label>Mô tả thêm <input type="text" name="description"></label>--%>
        <%--        <br/>--%>
        <%--        <select name="statusId">--%>
        <%--            <c:forEach items="${statusList}" var="status">--%>
        <%--                <option name="statusId" value="${status.statusId}">${status.status}</option>--%>
        <%--            </c:forEach>--%>
        <%--        </select>--%>
        <tr>
            <td style="text-align: center">
                <button type="submit" class="btn btn-outline-info">Thêm mới</button>
            </td>
        </tr>
        </tbody>
    </table>
</form>
</body>
</html>
