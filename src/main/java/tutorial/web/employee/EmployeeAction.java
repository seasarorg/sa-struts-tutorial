package tutorial.web.employee;

import java.util.List;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Required;

import tutorial.entity.Department;
import tutorial.entity.Employee;

public class EmployeeAction {

	@Required
	@IntegerType
	public String id;

	@Required
	public String name;

	@Required
	public String jobType;

	@IntegerType
	public String salary;

	@IntegerType
	public String departmentId;

	@Required
	@IntegerType
	public String version;

	public List<Employee> empItems;

	public List<Department> deptItems;

	public JdbcManager jdbcManager;

	@Execute(validator = false)
	public String execute() {
		empItems = jdbcManager
			.from(Employee.class)
			.leftOuterJoin("department")
			.orderBy("id")
			.getResultList();
		return "list.jsp";
	}

	@Execute(validator = false)
	public String edit() {
		Employee emp = jdbcManager
			.from(Employee.class)
			.id(id)
			.getSingleResult();
		Beans.copy(emp, this).execute();
		deptItems = jdbcManager
			.from(Department.class)
			.orderBy("id")
			.getResultList();
		return "edit.jsp";
	}

	@Execute(input = "employee.do?backToEdit=true")
	public String confirm() {
		return "confirm.jsp";
	}

	@Execute(input = "confirm.jsp")
	public String store() {
		Employee emp = Beans.createAndCopy(Employee.class, this).execute();
		jdbcManager.update(emp).execute();
		return execute();
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