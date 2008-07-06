package tutorial.action;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import tutorial.entity.Department;
import tutorial.entity.Employee;
import tutorial.form.EmployeeForm;
import tutorial.service.DepartmentService;
import tutorial.service.EmployeeService;

public class EmployeeAction {

	public List<Employee> empItems;

	public List<Department> deptItems;

	@ActionForm
	@Resource
	protected EmployeeForm employeeForm;

	@Resource
	protected EmployeeService employeeService;

	@Resource
	protected DepartmentService departmentService;

	@Execute(validator = false)
	public String index() {
		empItems = employeeService.findAll();
		return "index.jsp";
	}

	@Execute(validator = false, urlPattern = "edit/{id}")
	public String edit() {
		Employee emp = employeeService.findById(Integer
			.valueOf(employeeForm.id));
		Beans.copy(emp, employeeForm).execute();
		deptItems = departmentService.findAll();
		return "edit.jsp";
	}

	@Execute(input = "backToEdit")
	public String confirm() {
		return "confirm.jsp";
	}

	@Execute(input = "confirm.jsp")
	public String store() {
		Employee emp = Beans
			.createAndCopy(Employee.class, employeeForm)
			.execute();
		employeeService.update(emp);
		return index();
	}

	@Execute(validator = false)
	public String backToEdit() {
		deptItems = departmentService.findAll();
		return "edit.jsp";
	}
}