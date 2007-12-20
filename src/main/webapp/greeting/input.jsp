<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>  

<html>
<head>
<title>Greeting input</title>
</head>
<body>
<html:errors/>
<form action="result.do" method="post">
<input type="text" name="name"
  value="${name}"/>
<input type="submit" value="submit"/>
</form>
</body>
</html>