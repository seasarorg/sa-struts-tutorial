<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>  
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>  
<%@taglib prefix="tiles" uri="http://jakarta.apache.org/struts/tags-tiles"%>

<html>
<head>
<title>Login</title>
</head>
<body>
<html:errors/>
<html:form action="/login/login">
<table>
<tr>
<td>ユーザ名:</td><td><html:text property="userName"/></td>
</tr>
<tr>
<td>パスワード:</td><td><html:password property="password" redisplay="false"/></td>
</tr>
</table>
<input type="submit" name="login" value="ログイン"/>
</html:form>
</body>
</html>