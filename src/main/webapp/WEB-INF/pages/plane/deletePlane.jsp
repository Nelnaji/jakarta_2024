<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Plane index</h1>
<ul>
    <jsp:useBean id="planes" scope="request" type="java.util.List"/>
    <c:forEach var="plane" items="${planes}">
        <li>${plane.plateNumber}
            <form action="/planes" method="post">
                <input type="hidden" name="action" value="delete">
                <input type="hidden" name="planeId" value="${plane.id}">

                <button type="submit">Supprimer</button>
            </form>

        </li>
    </c:forEach>
</ul>
</body>
</html>