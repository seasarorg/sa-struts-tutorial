<html>
<head>
<title>Condition</title>
</head>
<body>
<html:errors/>
<c:if test="${hoge != null}">
hoge is not null
</c:if>
<c:if test="${hoge == null}">
hoge is null
</c:if>
<br />
<c:choose>
<c:when test="${hoge == '1'}">
One
</c:when>
<c:when test="${hoge == '2'}">
Two
</c:when>
<c:otherwise>
Other
</c:otherwise>
</c:choose>
</body>
</html>