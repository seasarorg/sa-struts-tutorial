<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>  
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>  

<html>
<head>
<title>Multiselect</title>
</head>
<body>
<html:errors/>
<html:form action="/multiselect/multiselect">

<html:select property="select" multiple="true" size="3">
<html:option value="1">One</html:option>
<html:option value="2">Two</html:option>
<html:option value="3">Three</html:option>
</html:select>
<c:out value="${selectAsString}"/>
<br />

<input type="submit" name="submit" value="サブミット"/>
</html:form>
</body>
</html>