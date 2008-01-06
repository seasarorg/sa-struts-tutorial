<html>
<head>
<title>Login</title>
</head>
<body>
<html:errors/>
<s:form action="/login">
<table>
<tr>
<td>ユーザ名:</td><td><html:text property="userName"/></td>
</tr>
<tr>
<td>パスワード:</td><td><html:password property="password" redisplay="false"/></td>
</tr>
</table>
<input type="submit" name="login" value="ログイン"/>
</s:form>
</body>
</html>