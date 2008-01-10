<html>
<head>
<title>Nested ForEach Update</title>
</head>
<body>
<html:errors/>
<s:form action="/nestedForeachUpdate">
<table border="1">
<c:forEach var="empItems" varStatus="s" items="${empItemsItems}">
<tr>
<c:forEach var="emp" varStatus="s2" items="${empItems}">
<td>
<input type="text"
  name="empItemsItems[${s.index}][${s2.index}].id"
  value="${f:h(emp.id)}"/>
</td>
<td>
<input type="text"
  name="empItemsItems[${s.index}][${s2.index}].name"
  value="${f:h(emp.name)}"/>
</td>
</c:forEach>
</tr>
</c:forEach>
</table><br />
<input type="submit" name="submit" value="サブミット"/>
</s:form>
</body>
</html>