<%-- 
    Document   : calcJsp
    Created on : 28/09/2025, 09:11:57 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="./CalcServlet" method="get">
    <input type="text" name="val1" placeholder="Valor 1">
    <input type="text" name="val2" placeholder="Valor 2">
    
    <button type="submit" name="operation" value="add">Sumar</button>
    <button type="submit" name="operation" value="sub">Restar</button>
    <button type="submit" name="operation" value="mul">Multiplicar</button>
    <button type="submit" name="operation" value="div">Dividir</button>
    <button type="submit" name="operation" value="square">Elevar al cuadrado</button>
    <button type="submit" name="operation" value="mod">Módulo</button>
</form>
    </body>
</html>
