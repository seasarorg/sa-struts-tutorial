<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>  
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>  

<html>
<head>
<title>Employee List</title>
</head>
<body>
<html:errors/>
<html:form action="/employee/confirm">
<html:hidden property="id"/>
<html:hidden property="version"/>
<table>
<tr>
<td>Id</td><td><c:out value="${id}"/></td>
</tr>
<tr>
<td>Name</td><td><html:text property="name"/></td>
</tr>
<tr>
<td>JobType</td>
<td>
<html:select property="jobType">
<html:option value="CLERT">CLERK</html:option>
<html:option value="SALESMAN">SALESMAN</html:option>
<html:option value="MANAGER">MANAGER</html:option>
<html:option value="ANALYST">ANALYST</html:option>
<html:option value="PRESIDENT">PRESIDENT</html:option>
</html:select>
</td>
</tr>
<tr>
<td>Salary</td><td><html:text property="salary"/></td>
</tr>
<tr>
<td>Department</td>
<td>
<html:select property="departmentId">
<html:option value=""></html:option>
<c:forEach var="d" items="${deptItems}">
<html:option value="${d.id}"><c:out value="${d.name}"/></html:option>
</c:forEach>
</html:select>
</td>
</tr>
</table>
<input type="submit" value="確認"/>
</html:form>
</body>
</html>