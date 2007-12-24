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
<c:forEach var="e" items="${empItems}">
<tr>
<td><c:out value="${e.id}"/></td>
<td><c:out value="${e.name}"/></td>
<td><a href="result.do?id=${e.id}">結果ページへ</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>