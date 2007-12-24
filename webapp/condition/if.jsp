<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>  
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>  

<html>
<head>
<title>If</title>
</head>
<body>
<c:if test="${hoge != null}">
hoge is not null
</c:if>
<c:if test="${hoge == null}">
hoge is null
</c:if>
</body>
</html>