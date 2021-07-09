<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.nyash.jsp.models.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="/css/styles.css" rel="stylesheet" type="text/css">
</head>
<body>
    <form class="form-style-7" method="post" action="/login">
        <label for="name">User name
            <input class="input-field" type="text" id="name" name="name">
        </label>
        <label for="birthDate">Birth date
            <input class="input-field" type="text" id="birthDate" name="birthDate">
        </label>
        <label for="password">Password
            <input class="input-field" type="password" id="password" name="password">
        </label>
        <input type="submit" value="Sign-Up">
    </form>
</body>
</html>
