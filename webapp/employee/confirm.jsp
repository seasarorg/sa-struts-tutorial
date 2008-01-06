<html>
<head>
<title>Employee Confirm</title>
</head>
<body>
<html:errors/>
<s:form action="/employee">
<html:hidden property="id"/>
<html:hidden property="name"/>
<html:hidden property="jobType"/>
<html:hidden property="salary"/>
<html:hidden property="departmentId"/>
<html:hidden property="version"/>
<table>
<tr>
<td>Id</td><td>${f:h(id)}</td>
</tr>
<tr>
<td>Name</td><td>${f:h(name)}</td>
</tr>
<tr>
<td>JobType</td><td>${f:h(jobType)}</td>
</tr>
<tr>
<td>Salary</td><td>${f:h(salary)}</td>
</tr>
<tr>
<td>Department</td><td>${f:h(departmentId)}</td>
</tr>
</table>
<input type="submit" name="store" value="更新"/>
<input type="submit" name="backToEdit" value="戻る"/>
</s:form>
</body>
</html>