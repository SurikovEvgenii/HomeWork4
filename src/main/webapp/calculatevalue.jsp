<%--
  Created by IntelliJ IDEA.
  User: Mystation
  Date: 25.02.2024
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="style.css" type="text/css" rel="stylesheet">
    <title>Calculate MAX,MIN,AVG value</title>
</head>
<body>
    <h1>Calculate MAX,MIN and AVG value </h1><br>
    <h3>Version 1.0</h3><br>
    <p>I can work only with INT type of data ^_^</p><br><br>
    <fieldset>
        <legend>Input numbers in area and select type of calculate value</legend>
        <form action="calculatevalue" method="POST"><br>
            <label>Number 1:</label>
            <input type="number" name="num"/><br>
            <label>Number 2:</label>
            <input type="number" name="num"/><br>
            <label>Number 3:</label>
            <input type="number" name="num"/><br><br>
            <label>What do you want get?</label>
            <input type="radio" value="MAX" name="radioSelect"/>
            <label>MAX</label>
            <input type="radio" value="MIN" name="radioSelect"/>
            <label>MIN</label>
            <input type="radio" value="AVG" name="radioSelect"/>
            <label>AVG</label><br><br>
            <input type="submit" value="Get value"/>
        </form>
    </fieldset>
    <br>
    <fieldset>
        <legend><b>Result</b></legend>

        <% if(request.getAttribute("checkBoxValue")==null){
            request.setAttribute("checkBoxValue","Result");
            request.setAttribute("num0"," ");
            request.setAttribute("num1"," ");
            request.setAttribute("num2"," ");
            request.setAttribute("calculateValue"," ");
        }%>

        <p><%= "Number 1: " + request.getAttribute("num0")%></p>
        <p><%= "Number 2: " + request.getAttribute("num1")%></p>
        <p><%= "Number 3: " + request.getAttribute("num2")%></p><br>
        <p><b><%= request.getAttribute("checkBoxValue") + ": "+request.getAttribute("calculateValue")%></b></p>
    </fieldset>
    <br>
    <br>
    <a href="index.jsp">Return to main page</a>

</body>
</html>
