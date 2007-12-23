<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>  
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>  

<html>
<head>
<title>Login</title>
</head>
<body>
<html:errors/>
<form action="welcome.do" method="post">
<table>
<tr>
<td>ユーザ名:</td><td><input type="text" name="userName" value="${userName}"/></td>
</tr>
<tr>
<td>パスワード:</td><td><input type="password" name="password"/></td>
</tr>
</table>
<input type="submit" value="ログイン"/>
</form>
</body>
</html>