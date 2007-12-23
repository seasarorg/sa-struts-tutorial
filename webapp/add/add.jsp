<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>  
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>  

<html>
<head>
<title>Add</title>
</head>
<body>
<html:errors/>
<form action="add.do" method="post">
<input type="text" name="arg1" value="${arg1}"/>
+
<input type="text" name="arg2" value="${arg2}"/>
=
<c:out value="${result}"/><br />
<input type="submit" name="calculate" value="計算"/>
</form>
</body>
</html>