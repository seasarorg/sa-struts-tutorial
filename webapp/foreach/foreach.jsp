<html>
<head>
<title>ForEach</title>
</head>
<body>

<table border="1">
<c:forEach var="e" varStatus="s" items="${empItems}">
<tr style="background-color:${s.index % 2 == 0 ? 'pink' : 'yellow'}">
<td>${f:h(e.id)}</td>
<td>${f:h(e.name}</td>
<td><a href="submit/${e.id}">結果ページへ</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>