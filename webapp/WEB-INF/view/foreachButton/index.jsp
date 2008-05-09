<%@page pageEncoding="UTF-8"%>
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
<s:form action="result/${f:u(m.id)}">
<input type="submit" value="結果ページへ"/>
</s:form>
</td>
</tr>
</c:forEach>
</table>

</body>
</html>