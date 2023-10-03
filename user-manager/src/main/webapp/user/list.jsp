<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lengoclinh
  Date: 28/09/2023
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List User</title>
</head>
<body>
<h1>User Management</h1>
<h2>
    <a href="/users?action=create">Add New User</a></br>
    <form action="/users" method="get">
        <input type="text" name="keyword">
        <input type="hidden" name="action" value="search">
        <button type="submit">Search</button>
    </form>

</h2>
<form action="/users" method="get">
</center>
<div align="center">
<table border="1" cellpadding="5">
<caption><h2>List of Users</h2></caption>
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Email</th>
    <th>Country</th>
    <th>Actions</th>
</tr>
<c:forEach var="user" items="${listUser}">
    <tr>
    <td><c:out value="${user.id}"/></td>
    <td><c:out value="${user.name}"/></td>
        <td><c:out value="${user.email}"/></td>
        <td><c:out value="${user.country}"/></td>
        <td>
            <a href="/users?action=edit&id=${user.id}">Edit</a>
            <a href="/users?action=delete&id=${user.id}">Delete</a>
        </td>
    </tr>
</c:forEach>
</table>
</div>
</form>
</body>
</html>
