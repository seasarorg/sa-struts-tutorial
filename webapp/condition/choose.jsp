<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>  
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>  
<%@taglib prefix="tiles" uri="http://jakarta.apache.org/struts/tags-tiles"%>

<html>
<head>
<title>Choose</title>
</head>
<body>
<html:errors/>
<c:choose>
<c:when test="${hoge == '1'}">
One
</c:when>
<c:when test="${hoge == '2'}">
Two
</c:when>
<c:otherwise>
Other
</c:otherwise>
</c:choose>
</body>
</html>