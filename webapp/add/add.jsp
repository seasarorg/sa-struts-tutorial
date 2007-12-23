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
<html:form action="/add/add">
<html:text property="arg1"/>
+
<html:text property="arg2"/>
=
<c:out value="${result}"/><br />
<input type="submit" name="calculate" value="計算"/>
</html:form>
</body>
</html>