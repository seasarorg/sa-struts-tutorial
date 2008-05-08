<%@page pageEncoding="UTF-8"%>
<html>
<head>
<title>Form First</title>
</head>
<body>
<html:errors/>
<s:form action="/form">
First:<html:text property="first"/><br />
<input type="submit" name="goSecond" value="Secondへ"/>
</s:form>
</body>
</html>