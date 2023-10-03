<%--
  Created by IntelliJ IDEA.
  User: lengoclinh
  Date: 18/09/2023
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="" method="get">
<h1>Danh sach khach hang</h1>
<table border="1">
  <tr>
    <th>Name</th>
    <th>Age</th>
    <th>Address</th>
    <th>Image</th>
  </tr>
  <c:forEach items="${customers}" var="customer">
    <tr>
      <td>${customer.getName()}</td>
      <td>${customer.age}</td>
      <td>${customer.address}</td>
      <td>
        <div style="background-image: url(${customer.image}); width: 50px; height:50px;  background-size: cover ">
            <%--                        <img src="${customer.image}" alt="">--%>
        </div>
      </td>
    </tr>

  </c:forEach>
</table>
  </form>
</body>
</html>
