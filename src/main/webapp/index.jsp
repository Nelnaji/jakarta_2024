<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Welcome to </title>
</head>
<body>
<h1><%= "Aeroport dashboard" %></h1>
<br/>

<a href="${pageContext.request.contextPath}/plane">View All planes</a>
<a href="${pageContext.request.contextPath}/planetype">View All Plane types</a>
</body>
</html>
