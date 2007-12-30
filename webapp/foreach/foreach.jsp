<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>  
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>  
<%@taglib prefix="tiles" uri="http://jakarta.apache.org/struts/tags-tiles"%>

<html>
<head>
<title>ForEach</title>
</head>
<body>

<table border="1">
<c:forEach var="e" varStatus="s" items="${empItems}">
<tr style="background-color:${s.index % 2 == 0 ? 'pink' : 'yellow'}">
<td><c:out value="${e.id}"/></td>
<td><c:out value="${e.name}"/></td>
<td><a href="foreach.do?id=${e.id}&submit=true">結果ページへ</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>