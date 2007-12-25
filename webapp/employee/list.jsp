<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>  
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>  

<html>
<head>
<title>Employee List</title>
</head>
<body>

<table border="1">
<tr style="background-color:pink">
<th>Id</th><th>Name</th><th>JobType</th><th>Salary</th><th>Department Id</th><th>編集</th>
</tr>
<c:forEach var="e" varStatus="s" items="${empItems}">
<tr style="background-color:${s.index %2 == 0 ? 'white' : 'yellow'}">
<td><c:out value="${e.id}"/></td>
<td><c:out value="${e.name}"/></td>
<td><c:out value="${e.jobType}"/></td>
<td><fmt:formatNumber value="${e.salary}" pattern="#,##0"/></td>
<td><c:out value="${e.departmentId}"/></td>
<td><a href="edit.do?id=${e.id}&edit=true">編集</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>