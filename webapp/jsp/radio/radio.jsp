<%@page pageEncoding="UTF-8"%>
<html>
<head>
<title>Radio</title>
</head>
<body>
<html:errors/>
<s:form action="/radio">
<html:radio property="radio" value="1"/>One
<html:radio property="radio" value="2"/>Two
<html:radio property="radio" value="3"/>Three
<br />
${f:h(radio)}<br />
<input type="submit" name="submit" value="サブミット"/>
</s:form>
</body>
</html>