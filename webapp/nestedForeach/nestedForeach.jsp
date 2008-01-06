<html>
<head>
<title>Nested ForEach</title>
</head>
<body>

<table border="1">
<c:forEach var="empItems" items="${empItemsItems}">
<tr>
<c:forEach var="emp" items="${empItems}">
<td><c:out value="${emp.id}"/></td>
<td><c:out value="${emp.name}"/></td>
</c:forEach>
</tr>
</c:forEach>
</table>

</body>
</html>