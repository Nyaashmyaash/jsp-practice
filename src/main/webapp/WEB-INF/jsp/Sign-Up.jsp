<%@ page import="java.util.ArrayList" %>
<%@ page import="com.nyash.jsp.models.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    ArrayList<User> users = (ArrayList) request.getAttribute("usersFromServer");
%>
<table>
    <tr>
        <th>User name</th>
        <th>User birth date</th>
    </tr>
    <%
        for (User user : users)
    %>
</table>
</body>
</html>
