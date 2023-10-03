<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>loginweb</title>
    <style>
        body{
            text-align: center;
            color: aqua;
        }
        input[type= text]{
            border: 2px solid purple;  border-radius: 15px;
            width: 300px;
            height: 30px;
            margin-bottom: 30px;
        }

        input[type= password]{
            border: 2px solid purple;  border-radius: 15px;
            width: 300px;
            height: 30px;
            margin-bottom: 30px;

        }
    </style>
</head>
<body>
<h1>
    Login
</h1>
<br/>
<form action="/login" method="get">


    <input type="text" name="username"  placeholder = "enter username"  /> <br/>
    <input type="password" name="password"  placeholder = "enter password"/><br/>
    <input type="submit" value="Sign in">

</form>

</body>
</html>