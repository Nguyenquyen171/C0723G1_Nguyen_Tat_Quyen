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
            <th>Công</th>
            <th>Ngày hết hạn</th>
            <th>Trạng thái</th>
            <th>Mô tả thêm</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td><input type="text" name="name"></td>
            <td><input type="date" name="startDate"></td>
            <td><input type="date" name="deadline"></td>
            <td>
                <select name="statusId">
                    <c:forEach items="${statusList}" var="status">
                        <option name="statusId" value="${status.statusId}">${status.status}</option>
                    </c:forEach>
                </select>
            </td>
            <td><input type="text" name="description"></td>
        </tr>
        </tbody>
    </table>
</form>
</body>
</html>
