<html>
<head>
<title>Upload</title>
</head>
<body>
<html:errors/>
${f:h(message)}
<s:form action="/upload" enctype="multipart/form-data">
<html:file property="formFile"/><br />
<input type="submit" name="upload" value="アップロード"/>
</s:form>
</body>
</html>