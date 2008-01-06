<html>
<head>
<title>Employee List</title>
</head>
<body>

<table border="1">
<tr style="background-color:pink">
<th>Id</th><th>Name</th><th>JobType</th><th>Salary</th><th>Department</th><th>編集</th>
</tr>
<c:forEach var="e" varStatus="s" items="${empItems}">
<tr style="background-color:${s.index %2 == 0 ? 'white' : 'yellow'}">
<td align="right"><c:out value="${e.id}"/></td>
<td><c:out value="${e.name}"/></td>
<td><c:out value="${e.jobType}"/></td>
<td align="right"><fmt:formatNumber value="${e.salary}" pattern="#,##0"/></td>
<td align="right"><c:out value="${e.departmentId}"/></td>
<td><a href="edit/${e.id}">編集</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>