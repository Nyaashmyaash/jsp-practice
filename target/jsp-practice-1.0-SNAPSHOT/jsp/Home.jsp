<%--
  Created by IntelliJ IDEA.
  User: Nyash
  Date: 10.07.2021
  Time: 0:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<span style="color: ${cookie.color.value}">
    Java недавно стукнуло 20 лет. Казалось бы, на сегодняшний день на java написано все. Любая идея, любой проект, любой инструмент на java? — это уже есть. Тем более когда речь идет о таких банальных вещах как пул соединений к базе данных, который используют миллионы разработчиков по всему миру. Но не тут то было! Встречайте — проект HikariCP — самый быстрый на сегодняшний день пул соединений на java.
    HikariCP — еще один яркий пример того, что всегда стоить брать под сомнение эффективность некоторых решений, даже если их используют миллионы людей и живут они десятки лет. Хикари — прекрасный пример того, как микро оптимизации, которые по отдельности никогда не смогут дать вам больше 0.00001% прироста — в совокупности позволяют создать очень быстрый и эффективный инструмент.
</span>
<form method="post" action="/home">
    <label for="color">
        <select name="color" id="color">
            <option value="red">Red</option>
            <option value="black">Black</option>
            <option value="white">White</option>
        </select>
    </label>
    <input type="submit" value="Color send">
</form>
</body>
</html>
