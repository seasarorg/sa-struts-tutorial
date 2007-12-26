package tutorial.web.employee;

import java.util.List;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Required;
import org.seasar.struts.annotation.Result;
import org.seasar.struts.annotation.Results;

import tutorial.entity.Department;
import tutorial.entity.Employee;

@Results( { @Result(name = "list", path = "/employee/list.jsp"),
	@Result(name = "edit", path = "/employee/edit.jsp"),
	@Result(name = "confirm", path = "/employee/confirm.jsp") })
public class IndexAction {

	public List<Employee> empItems;

	public List<Department> deptItems;

	@Required
	@IntegerType
	public String id;

	@Required(target = "confirm, store")
	public String name;

	@Required(target = "confirm, store")
	public String jobType;

	@IntegerType
	public String salary;

	@IntegerType
	public String departmentId;

	@Required(target = "confirm, store")
	@IntegerType
	public String version;

	public JdbcManager jdbcManager;

	@Execute(validator = false)
	public String execute() {
		empItems = jdbcManager
			.from(Employee.class)
			.orderBy("id")
			.getResultList();
		return "list";
	}

	@Execute(input = "/employee/edit.jsp")
	public String edit() {
		Employee emp = jdbcManager
			.from(Employee.class)
			.id(id)
			.getSingleResult();
		Beans.copy(emp, this).execute();
		deptItems = jdbcManager.from(Department.class).getResultList();
		return "edit";
	}

	@Execute(input = "/employee/edit.jsp")
	public String confirm() {
		return "confirm";
	}

	@Execute(input = "/employee/confirm.jsp")
	public String store() {
		Employee emp = Beans.createAndCopy(Employee.class, this).execute();
		jdbcManager.update(emp).execute();
		return execute();
	}

	@Execute(validator = false)
	public String backToEdit() {
		deptItems = jdbcManager.from(Department.class).getResultList();
		return "edit";
	}

	@Execute(validator = false)
	public String backToList() {
		return execute();
	}
}