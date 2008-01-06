<html>
<head>
<title>ForEach Update</title>
</head>
<body>
<html:errors/>
<s:form action="/foreachUpdate">
<table border="1">
<c:forEach var="empItems" items="${empItems}">
<tr>
<td><html:text name="empItems" property="id" indexed="true"/></td>
<td><html:text name="empItems" property="name" indexed="true"/></td>
</tr>
</c:forEach>
</table><br />
<input type="submit" name="submit" value="サブミット"/>
</s:form>
</body>
</html>