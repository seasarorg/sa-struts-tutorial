<%@page pageEncoding="UTF-8"%>
<html>
<head>
<title>Textarea</title>
</head>
<body>
<html:errors/>
<s:form>
<html:textarea property="textarea"/><br />
${f:br(f:h(textarea))}<br />
<input type="submit" name="submit" value="サブミット"/>
</s:form>
</body>
</html>