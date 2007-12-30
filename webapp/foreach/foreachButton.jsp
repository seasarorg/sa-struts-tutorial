<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>  
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>  
<%@taglib prefix="tiles" uri="http://jakarta.apache.org/struts/tags-tiles"%>

<html>
<head>
<title>ForEach Button</title>
</head>
<body>

<table border="1">
<c:forEach var="e" items="${empItems}">
<tr>
<td><c:out value="${e.id}"/></td>
<td><c:out value="${e.name}"/></td>
<td><input type="button"
  onclick="location.href='foreachButton.do?id=<c:out value="${e.id}"/>&submit=true'" value="結果ページへ"/></td>
</tr>
</c:forEach>
</table>

</body>
</html>