<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lengoclinh
  Date: 19/09/2023
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <style>
        h1 {
            text-align: center;
        }

        img {
            width: 100px;
            height: 100px;
        }

        table {
            width: 500px;
        }

        .table {
            margin: 0;
            display: flex;
            justify-content: center;
        }

        table tr td {
            border: 1px solid black;
        }

        .content {
            text-align: center;
        }

    </style>
</head>
<body>
<h1>Products</h1>
<a href="Cart.jsp">Show cart</a>
<div class="table">
    <table>
        <c:forEach items="${list}" var="product">

        <form action="/cart" method="post">
                <tr>
                    <td class="content">${product.getName()}</td>
                    <input type="hidden" name="name" value="${product.getName()}">

                    <td class="content">${product.getPrice()}</td>
                    <input type="hidden" name="price" value="${product.getPrice()}">

                    <td class="content"><img src="${product.getImage()}"></td>
                    <input type="hidden" name="image" value="${product.getImage()}">

                    <td class="content">
                        <input type="submit" value="add to Buy">
                    </td>
                </tr>
        </form>
        </c:forEach>

    </table>
</div>
</body>
</html>
