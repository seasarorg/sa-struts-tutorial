<%@page pageEncoding="UTF-8"%>
<html>
<head>
<title>Nested ForEach</title>
</head>
<body>

<table border="1">
<c:forEach var="mapItems" items="${mapItemsItems}">
<tr>
<c:forEach var="m" items="${mapItems}">
<td>${f:h(m.id)}</td>
<td>${f:h(m.name)}</td>
</c:forEach>
</tr>
</c:forEach>
</table>

</body>
</html>