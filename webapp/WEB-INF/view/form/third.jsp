<%@page pageEncoding="UTF-8"%>
<html>
<head>
<title>Form Third</title>
</head>
<body>
<s:form>
<table>
<tr><td>First</td><td>${f:h(first)}</td></tr>
<tr><td>Second</td><td>${f:h(second)}</td></tr>
</table><br />
<input type="submit" name="backSecond" value="戻る"/>
</s:form>
</body>
</html>