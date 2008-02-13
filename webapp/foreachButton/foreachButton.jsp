<html>
<head>
<title>ForEach Button</title>
</head>
<body>

<table border="1">
<c:forEach var="m" items="${mapItems}">
<tr>
<td><c:out value="${m.id}"/></td>
<td><c:out value="${m.name}"/></td>
<td>
<form method="post" action="submit/${f:u(m.id)}">
<input type="submit" value="結果ページへ"/>
</form>
</td>
</tr>
</c:forEach>
</table>

</body>
</html>