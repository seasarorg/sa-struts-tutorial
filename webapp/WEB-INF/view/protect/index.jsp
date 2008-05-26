<%@page pageEncoding="UTF-8"%>
<html>
<head>
<title>Protect index</title>
</head>
<body>
<html:errors/>
このページは、tomcatとrole1ユーザが表示できます。<br />
<s:form>
<input type="submit" name="tomcat"
  value="tomcatユーザだけが押せます"/>
</s:form>
</body>
</html>