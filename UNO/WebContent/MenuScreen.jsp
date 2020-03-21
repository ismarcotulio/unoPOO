<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
out.print("<link rel='stylesheet' type='text/css' href='MenuStyle.css'>");
out.println("<div id='menuBtns' class='bg-dark btn-container border'><div id='oneLogo' class='logo'></div>"
+"<div id='btn1'><a href='#' class='btn-ghost red '>Nueva Partida</a></div>"
+"<div id='btn2'><a href='#' class='btn-ghost orange'>Ingresar </a></div>"
+"<div id='btn3'><a href='#' class='btn-ghost green'>Scores</a></div></div>");
%>
</body>
</html>