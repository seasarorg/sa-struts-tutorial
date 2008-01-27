<html>
<head>
<title>Condition</title>
</head>
<body>
<html:errors/>
"id" is ${f:h(id)}.<br />
<c:if test="${id != null}">
"id" is not null.
</c:if>
<c:if test="${id == null}">
"id" is null.
</c:if>
<br />
<c:choose>
<c:when test="${id == '1'}">
"id" is one.
</c:when>
<c:when test="${id == '2'}">
"id" is two.
</c:when>
<c:otherwise>
"id" is other.
</c:otherwise>
</c:choose>
</body>
</html>