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
<td><input type="button"
  onclick="location.href='submit/${f:h(e.id)}'" value="結果ページへ"/></td>
</tr>
</c:forEach>
</table>

</body>
</html>