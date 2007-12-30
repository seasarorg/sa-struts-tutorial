<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>  
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>  
<%@taglib prefix="tiles" uri="http://jakarta.apache.org/struts/tags-tiles"%>

<html>
<head>
<title>Employee Confirm</title>
</head>
<body>
<html:errors/>
<html:form action="/employee/employee">
<html:hidden property="id"/>
<html:hidden property="name"/>
<html:hidden property="jobType"/>
<html:hidden property="salary"/>
<html:hidden property="departmentId"/>
<html:hidden property="version"/>
<table>
<tr>
<td>Id</td><td><c:out value="${id}"/></td>
</tr>
<tr>
<td>Name</td><td><c:out value="${name}"/></td>
</tr>
<tr>
<td>JobType</td><td><c:out value="${jobType}"/></td>
</tr>
<tr>
<td>Salary</td><td><c:out value="${salary}"/></td>
</tr>
<tr>
<td>Department</td><td><c:out value="${departmentId}"/></td>
</tr>
</table>
<input type="submit" name="store" value="更新"/>
<input type="submit" name="backToEdit" value="戻る"/>
</html:form>
</body>
</html>