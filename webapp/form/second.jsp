<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>  
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>  

<html>
<head>
<title>Form Second</title>
</head>
<body>
<html:errors/>
<html:form action="/form/form">
Second:<html:text property="second"/><br />
<input type="submit" name="goThird" value="Thirdへ"/>
<input type="submit" name="execute" value="戻る"/>
</html:form>
</body>
</html>