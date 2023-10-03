<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lengoclinh
  Date: 19/09/2023
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cart</title>
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
<h1>My Cart</h1>
<div class="table">
    <table>

            <c:forEach items="${listCart}" var="product">
                <tr>
                    <td class="content">${product.getName()}</td>
                    <td class="content">${product.getPrice()}</td>
                    <td class="content"><img src="${product.getImage()}"></td>
                </tr>
            </c:forEach>


    </table>
</div>
</body>
</html>
