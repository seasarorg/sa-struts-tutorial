package tutorial.web.employee;

import java.util.List;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Result;

import tutorial.entity.Department;
import tutorial.entity.Employee;

@Result(path = "/employee/edit.jsp")
public class EditAction {

	@ActionForm
	public EmployeeDto employeeDto;

	public List<Department> deptItems;

	public JdbcManager jdbcManager;

	@Execute
	public String edit() {
		Employee emp = jdbcManager
			.from(Employee.class)
			.id(employeeDto.id)
			.getSingleResult();
		Beans.copy(emp, employeeDto).execute();
		deptItems = jdbcManager.from(Department.class).getResultList();
		return "success";
	}
}
