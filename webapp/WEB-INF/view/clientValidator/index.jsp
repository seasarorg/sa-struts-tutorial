<%@page pageEncoding="UTF-8"%>
<html>
<head>
<html:javascript formName="clientValidatorActionForm_submit"/>
<html:javascript formName="clientValidatorActionForm_submit2"/>
<title>Tutorial: Client Validator</title>
<link rel="stylesheet" type="text/css" href="${f:url('/css/sa.css')}" />
</head>
<body>

<h1>Tutorial: Client Validator</h1>

<html:errors/>
<s:form>
<table>
<tr><td>aaa</td><td><html:text property="aaa"/></td></tr>
<tr><td>bbb</td><td><html:text property="bbb"/></td></tr>
</table>
<input type="submit" name="submit" value="aaaが必須"
    onclick="forms[0].name='clientValidatorActionForm_submit';
        return validateClientValidatorActionForm_submit(forms[0]);"/>
<input type="submit" name="submit2" value="bbbが必須"
    onclick="forms[0].name='clientValidatorActionForm_submit2';
        return validateClientValidatorActionForm_submit2(forms[0]);"/>
</s:form>
</body>
</html>