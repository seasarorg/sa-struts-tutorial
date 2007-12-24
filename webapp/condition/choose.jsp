<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>  
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>  

<html>
<head>
<title>Choose</title>
</head>
<body>
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