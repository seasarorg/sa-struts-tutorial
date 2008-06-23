package tutorial.action;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.dto.EmployeeDto;
import tutorial.entity.Department;
import tutorial.entity.Employee;

public class EmployeeAction {

	public List<Employee> empItems;

	public List<Department> deptItems;

	@ActionForm
	@Resource
	protected EmployeeDto employeeDto;

	@Resource
	protected JdbcManager jdbcManager;

	@Execute(validator = false)
	public String index() {
		empItems = jdbcManager
			.from(Employee.class)
			.orderBy("id")
			.getResultList();
		return "index.jsp";
	}

	@Execute(validator = false, urlPattern = "edit/{id}")
	public String edit() {
		Employee emp = jdbcManager
			.from(Employee.class)
			.id(employeeDto.id)
			.getSingleResult();
		Beans.copy(emp, employeeDto).execute();
		deptItems = jdbcManager
			.from(Department.class)
			.orderBy("id")
			.getResultList();
		return "edit.jsp";
	}

	@Execute(input = "backToEdit")
	public String confirm() {
		return "confirm.jsp";
	}

	@Execute(input = "confirm.jsp")
	public String store() {
		Employee emp = Beans
			.createAndCopy(Employee.class, employeeDto)
			.execute();
		jdbcManager.update(emp).execute();
		return index();
	}

	@Execute(validator = false)
	public String backToEdit() {
		deptItems = jdbcManager
			.from(Department.class)
			.orderBy("id")
			.getResultList();
		return "edit.jsp";
	}
}