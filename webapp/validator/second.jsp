<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>  
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>  
<%@taglib prefix="tiles" uri="http://jakarta.apache.org/struts/tags-tiles"%>

<html>
<head>
<title>Validator Second</title>
<html:javascript formName="validator_thirdActionForm"/>
</head>
<body>
<html:errors/>
<html:form action="/validator/third"
    onsubmit="return validateValidator_thirdActionForm(this)">
<table>
<tr><td>First</td><td><c:out value="${first}"/></td></tr>
<tr><td>Second</td><td><html:text property="second"/></td></tr>
</table>
<input type="submit" name="goThird" value="Thirdへ"/>
<input type="submit" name="backFirst" value="戻る"
   onclick="bCancel=true"/>
</html:form>
</body>
</html>