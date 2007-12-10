<%@page contentType="text/html charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>  

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Greeting input</title>
</head>
<body>
<html:errors/>
<form action="result.do" method="post">
<input type="text" name="name"
  value="<c:out value='${name}'/>"/>
<input type="submit" value="submit"/>
</form>
</body>
</html>