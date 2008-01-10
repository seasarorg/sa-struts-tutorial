<html>
<head>
<title>ForEach Button</title>
</head>
<body>

<table border="1">
<c:forEach var="e" items="${empItems}">
<tr>
<td><c:out value="${e.id}"/></td>
<td><c:out value="${e.name}"/></td>
<td>
<form action="submit/${f:u(e.id)}">
<input type="submit" value="結果ページへ"/>
</form>
</td>
</tr>
</c:forEach>
</table>

</body>
</html>