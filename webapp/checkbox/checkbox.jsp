<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>  
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>  
<%@taglib prefix="tiles" uri="http://jakarta.apache.org/struts/tags-tiles"%>

<html>
<head>
<title>Checkbox</title>
</head>
<body>
<html:errors/>
<html:form action="/checkbox/checkbox">
<html:checkbox property="check1"/>check1
<html:checkbox property="check2"/>check2<br />
<input type="submit" name="submit" value="サブミット"/>
</html:form>
</body>
</html>