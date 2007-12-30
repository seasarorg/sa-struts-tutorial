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
<html:errors/>
<html:form action="/foreach/foreachUpdate">
<table border="1">
<c:forEach var="empItems" items="${empItems}">
<tr>
<td><html:text name="empItems" property="id" indexed="true"/></td>
<td><html:text name="empItems" property="name" indexed="true"/></td>
</tr>
</c:forEach>
</table><br />
<input type="submit" name="submit" value="サブミット"/>
</html:form>
</body>
</html>