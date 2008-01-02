<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>  
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>  
<%@taglib prefix="tiles" uri="http://jakarta.apache.org/struts/tags-tiles"%>

<html>
<head>
<title>Form Third</title>
</head>
<body>
<html:form action="/form/form">
<table>
<tr><td>First</td><td><c:out value="${first}"/></td></tr>
<tr><td>Second</td><td><c:out value="${second}"/></td></tr>
</table><br />
<input type="submit" name="backSecond" value="戻る"/>
</html:form>
</body>
</html>