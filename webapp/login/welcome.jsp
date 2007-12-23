<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>  
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>  

<html>
<head>
<title>Welcome</title>
</head>
<body>
Hello <c:out value="${userName}"/>!!!
</body>
</html>