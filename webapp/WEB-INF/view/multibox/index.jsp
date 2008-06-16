<%@page pageEncoding="UTF-8"%>
<html>
<head>
<title>Tutorial: Multibox</title>
<link rel="stylesheet" type="text/css" href="${f:url('/css/sa.css')}" />
</head>
<body>

<h1>Tutorial: Multibox</h1>

<html:errors/>
<s:form>
<html:multibox property="checks" value="Check1"/>Check1
<html:multibox property="checks" value="Check2"/>Check2<br />
${f:h(checks)}<br />
<input type="submit" name="submit" value="サブミット"/>
</s:form>
</body>
</html>