<%@page pageEncoding="UTF-8"%>
<html>
<head>
<title>Select</title>
</head>
<body>
<html:errors/>
<s:form action="/select">
<html:select property="select">
<html:option value="1">One</html:option>
<html:option value="2">Two</html:option>
<html:option value="3">Three</html:option>
</html:select>
<br />
${f:h(select)}<br />
<input type="submit" name="submit" value="サブミット"/>
</s:form>
</body>
</html>