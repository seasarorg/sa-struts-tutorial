<%@page pageEncoding="UTF-8"%>
<html>
<head>
<title>Add</title>
</head>
<body>
<html:errors/>
<s:form action="/add">
<html:text property="arg1"/> + <html:text property="arg2"/>
= ${f:h(result)}<br />
<input type="submit" name="submit" value="サブミット"/>
</s:form>
</body>
</html>