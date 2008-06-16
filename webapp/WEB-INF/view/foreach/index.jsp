<%@page pageEncoding="UTF-8"%>
<html>
<head>
<title>Tutorial: ForEach</title>
<link rel="stylesheet" type="text/css" href="${f:url('/css/sa.css')}" />
</head>
<body>

<h1>Tutorial: ForEach</h1>


<table border="1">
<c:forEach var="m" varStatus="s" items="${mapItems}">
<tr style="background-color:${s.index % 2 == 0 ? 'pink' : 'yellow'}">
<td>${f:h(m.id)}</td>
<td>${f:h(m.name)}</td>
<td><a href="result/${f:u(m.id)}">結果ページへ</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>