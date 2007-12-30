<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>  
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>  
<%@taglib prefix="tiles" uri="http://jakarta.apache.org/struts/tags-tiles"%>

<html>
<head>
<title>JavaScript Validator</title>
<html:javascript formName="validator_jsValidatorActionForm" />
</head>
<body>
<html:errors/>
<html:form action="/validator/jsValidator"
  onsubmit="return validateValidator_jsValidatorActionForm(this)">
<html:text property="text"/><br />
<input type="submit" name="submit" value="サブミット"/>
</html:form>
</body>
</html>