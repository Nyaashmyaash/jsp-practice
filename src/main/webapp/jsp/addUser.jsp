<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="/css/styles.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="form-style-7">
    <h3> Please add user </h3>
</div>
    <form class="form-style-7" method="post" action="/users">
        <label for="first-name">First name
            <input class="input-field" type="text" id="first-name" name="first-name">
        </label>
        <label for="last-name">Last name
            <input class="input-field" type="text" id="last-name" name="last-name">
        </label>
        <input type="submit" value="Add user">
    </form>
</body>
</html>
