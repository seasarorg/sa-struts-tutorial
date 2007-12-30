<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>  
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>  
<%@taglib prefix="tiles" uri="http://jakarta.apache.org/struts/tags-tiles"%>

<html>
<head>
<title>Form First</title>
</head>
<body>
<html:errors/>
<html:form action="/form/form">
First:<html:text property="first"/><br />
<input type="submit" name="goSecond" value="Secondへ"/>
</html:form>
</body>
</html>