<%@page pageEncoding="UTF-8"%>
<html>
<head>
<title>Tutorial: Checkbox</title>
<link rel="stylesheet" type="text/css" href="${f:url('/css/sa.css')}" />
</head>
<body>

<h1>Tutorial: Checkbox</h1>

<html:errors/>
<s:form>
<html:checkbox property="check1"/>check1
<html:checkbox property="check2"/>check2<br />
check1:${f:h(check1)}<br />
check2:${f:h(check2)}<br />
<input type="submit" name="submit" value="サブミット"/>
</s:form>
</body>
</html>