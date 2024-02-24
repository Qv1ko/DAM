<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		Persona p = new Persona(request.getParameter("nombre"), request.getParameter("apellidos"));
	%>
	
	<h3>Usuario <%= p.toString() %></h3>
	
	<h2>El nombre elegido es: <%= p.getNombre() %></h2>
	<h2>El apellido elegido es: <%= p.getApellidos() %></h2>
	
</body>
</html>