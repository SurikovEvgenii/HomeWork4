<%--
  Created by IntelliJ IDEA.
  User: Mystation
  Date: 25.02.2024
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Quote: Linus Torvalds</title>
</head>
<body>
    <b><%="Linus Torvalds: "%></b><%= session.getAttribute("quote")%>
</body>
</html>
