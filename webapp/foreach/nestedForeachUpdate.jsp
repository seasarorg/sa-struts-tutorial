<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>  
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>  

<html>
<head>
<title>Nested ForEach Update</title>
</head>
<body>
<html:errors/>
<html:form action="/foreach/nestedForeachUpdate">
<table border="1">
<c:forEach var="empItems" varStatus="s" items="${empItemsItems}">
<tr>
<c:forEach var="emp" varStatus="s2" items="${empItems}">
<td>
<input type="text"
  name="empItemsItems[${s.index}][${s2.index}].id"
  value="${emp.id}"/>
</td>
<td>
<input type="text"
  name="empItemsItems[${s.index}][${s2.index}].name"
  value="${emp.name}"/>
</td>
</c:forEach>
</tr>
</c:forEach>
</table><br />
<input type="submit" name="submit" value="サブミット"/>
</html:form>
</body>
</html>