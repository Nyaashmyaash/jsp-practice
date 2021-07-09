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
    <form class="form-style-7" method="post" action="/signUp">
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
<div class="form-style-7">
    <table>
        <tr>
            <th>User name</th>
            <th>User birth date</th>
        </tr>
        <c:forEach items="${usersFromServer}" var="user">
            <tr>
                <td>${user.name}</td>
                <td>${user.birthDate}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
