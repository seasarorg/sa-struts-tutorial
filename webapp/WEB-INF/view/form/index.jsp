<%@page pageEncoding="UTF-8"%>
<html>
<head>
<title>Tutorial: Form First</title>
<link rel="stylesheet" type="text/css" href="${f:url('/css/sa.css')}" />
</head>
<body>

<h1>Tutorial: Form First</h1>
<html:errors/>
<s:form>
First:<html:text property="first"/><br />
<input type="submit" name="goSecond" value="Secondへ"/>
</s:form>
</body>
</html>