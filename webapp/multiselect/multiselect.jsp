<html>
<head>
<title>Multiselect</title>
</head>
<body>
<html:errors/>
<s:form action="/multiselect">
<html:select property="select" multiple="true" size="3">
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