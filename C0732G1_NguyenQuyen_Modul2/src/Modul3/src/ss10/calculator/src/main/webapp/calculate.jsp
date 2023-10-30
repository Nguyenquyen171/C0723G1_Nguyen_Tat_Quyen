<%--
  Created by IntelliJ IDEA.
  User: nguyentatquyen
  Date: 30/10/2023
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Simple Calculator</h1>
<form action="" method="post">
  <fieldset>
    <legend>Calculator</legend>
    <label>First operand: <input type="number" name="firstOperator"></label><br>
    <label for="operator">Operator: </label>
    <select name="operator" id="operator">
      <option value="+">Addition</option>
      <option value="-">Minus</option>
      <option value="x">Multiplication</option>
      <option value="/">Division</option>
    </select><br>
    <label>Second operand: <input type="number" name="secondOperator"></label><br>
    <button type="submit" name="Calculate">Calculate</button>
  </fieldset>
</form>

</body>
</html>
