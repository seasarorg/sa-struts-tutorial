<%@page pageEncoding="UTF-8"%>
<html>
<head>
<title>Client Validator</title>
<html:javascript formName="clientValidatorActionForm_submit"/>
<html:javascript formName="clientValidatorActionForm_submit2"/>
</head>
<body>
<html:errors/>
<s:form action="/clientValidator">
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