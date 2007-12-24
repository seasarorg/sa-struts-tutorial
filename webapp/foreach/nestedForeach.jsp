<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>  
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>  

<html>
<head>
<title>ForEach</title>
</head>
<body>

<table border="1">
<c:forEach var="empItems" items="${empItemsItems}">
<tr>
<c:forEach var="emp" items="${empItems}">
<td><c:out value="${emp.id}"/></td>
<td><c:out value="${emp.name}"/></td>
</c:forEach>
</tr>
</c:forEach>
</table>

</body>
</html>