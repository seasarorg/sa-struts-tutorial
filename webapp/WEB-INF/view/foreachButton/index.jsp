<%@page pageEncoding="UTF-8"%>
<html>
<head>
<title>Tutorial: ForEach Button</title>
<link rel="stylesheet" type="text/css" href="${f:url('/css/sa.css')}" />
</head>
<body>

<h1>Tutorial: ForEach Button</h1>

<table border="1">
<c:forEach var="m" items="${mapItems}">
<tr>
<td>${f:h(m.id)}</td>
<td>${f:h(m.name)}</td>
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