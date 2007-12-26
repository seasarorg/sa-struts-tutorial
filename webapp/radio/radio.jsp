<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>  
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>  

<html>
<head>
<title>Radio</title>
</head>
<body>
<html:errors/>
<html:form action="/radio/radio">

<html:radio property="radio" value="1"/>One
<html:radio property="radio" value="2"/>Two
<html:radio property="radio" value="3"/>Three
<br />

<input type="submit" name="submit" value="サブミット"/>
</html:form>
</body>
</html>