<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>  
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>  

<html>
<head>
<title>Textarea</title>
</head>
<body>
<html:errors/>
<html:form action="/textarea/textarea">
<html:textarea property="textarea"/><br />
<c:out value="${textarea}"/><br />
<input type="submit" name="submit" value="サブミット"/>
</html:form>
</body>
</html>