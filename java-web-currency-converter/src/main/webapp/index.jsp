<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Convert</title>
</head>
<body>
<h1>
    Java-web-currency-converter
</h1>
<br/>
<form action="/convert" method="post">
    <label>Rate: </label> <br/>
    <input type="text" name="rate" placeholder="Rate" value="22000"><br/>
    <label>USD: </label> <br/>
    <input type="text" name="usd" placeholder="USD" value="0"><br/>
    <input type="submit" value="convert">
</form>

</body>
</html>