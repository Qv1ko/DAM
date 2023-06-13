<%@ page import="java.time.LocalDateTime"%>
<%@ page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<%!
	public int rand() {
		return (int)(Math.random() * 11);
	}
%>
<body>
	<h1>Web JSP</h1>
	<h3><%= LocalDateTime.now() %> - <% out.println(LocalDate.now().getDayOfWeek()); %></h3>
	<h3><% out.println("Hola, mundo"); %></h3>
	<h4><% out.println("Número random: " + rand()); %></h4>
	<%
		for (int i = 0; i < 5; i ++) {
			out.println("Número: " + i + "<br>");
		}
	%>
</body>
</html>