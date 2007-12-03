<%@page contentType="text/html charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Hello</title>
</head>
<body>
<h1><c:out value="Hello ${name}!!!"/></h1>
<br />
<c:forEach items="${hogeList}" var="hoge">
${hoge.aaa} ${hoge.bbb}<br>
</c:forEach>
<br />
<c:forEach items="${hogeListList}" var="hogeList">
  <c:forEach items="${hogeList}" var="hoge">
    ${hoge.aaa} ${hoge.bbb}
  </c:forEach>
  <br />
</c:forEach>
</body>
</html>