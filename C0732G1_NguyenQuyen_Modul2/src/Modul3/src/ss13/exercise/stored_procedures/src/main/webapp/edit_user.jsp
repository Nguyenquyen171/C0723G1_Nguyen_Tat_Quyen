<%--
  Created by IntelliJ IDEA.
  User: nguyentatquyen
  Date: 02/11/2023
  Time: 18:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Edit User</title>
</head>
<body>
<h2>Edit User</h2>
<form action="user-servlet?action=edit" method="post">
  <table>
    <tr>
      <th>Name</th>
      <th>Email</th>
      <th>Country</th>
    </tr>
    <tr>
      <input type="hidden" name="id" value="${user.getId()}">
    </tr>
    <tr>
      <td><input type="text" name="name" value="${user.getName()}"></td>
      <td><input type="text" name="email" value="${user.getEmail()}"></td>
      <td><input type="text" name="country" value="${user.getCountry()}"></td>
      <td><button type="submit">Edit</button></td>
    </tr>
  </table>

</form>
</body>
</html>