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
<form action="bbb2.do" method="post">
<input type="hidden" name="name" value="${name}"/>
<c:forEach items="${hogeList}" var="hoge" varStatus="s">
<input type="text" name="hogeList[${s.index}].aaa"
  value="${hoge.aaa}"/>
<input type="text" name="hogeList[${s.index}].bbb"
  value="${hoge.bbb}"/>
<br />
</c:forEach>
<br />
<c:forEach items="${hogeListList}" var="hogeList" varStatus="s">
  <c:forEach items="${hogeList}" var="hoge" varStatus="s2">
    <input type="text" name="hogeListList[${s.index}][${s2.index}].aaa"
  value="${hoge.aaa}"/>
<input type="text" name="hogeListList[${s.index}][${s2.index}].bbb"
  value="${hoge.bbb}"/>
  </c:forEach>
  <br />
</c:forEach>
<br />
<input type="submit" value="submit"/>
</form>
</body>
</html>