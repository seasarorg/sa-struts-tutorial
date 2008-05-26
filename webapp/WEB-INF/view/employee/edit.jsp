<%@page pageEncoding="UTF-8"%>
<html>
<head>
<title>Employee Edit</title>
</head>
<body>
<html:errors/>
<s:form>
<html:hidden property="id"/>
<html:hidden property="version"/>
<table>
<tr>
<td>Id</td><td>${f:h(id)}</td>
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
<html:option value="${f:h(d.id)}">${f:h(d.name)}</html:option>
</c:forEach>
</html:select>
</td>
</tr>
</table>
<input type="submit" name="confirm" value="確認"/>
<input type="submit" name="index" value="戻る"/>
</s:form>
</body>
</html>