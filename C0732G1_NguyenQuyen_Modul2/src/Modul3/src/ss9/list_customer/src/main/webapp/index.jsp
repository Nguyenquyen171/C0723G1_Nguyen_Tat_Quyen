<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<table>
  <thead>
  <tr>
    <th>STT</th>
    <th>Ten</th>
    <th>Ngay Sinh</th>
    <th>Dia Chi</th>
    <th>Image</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${customerList}" var="customer" varStatus="count">
    <tr>
      <td>${count.count}</td>
      <td>${customer.name}</td>
      <td>${customer.birthday}</td>
      <td>${customer.address}</td>
      <td><img src="${customer.avatar}" alt="${customer.name}"></td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>