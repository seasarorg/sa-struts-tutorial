package tutorial.web.employee;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Input;
import org.seasar.struts.annotation.Result;
import org.seasar.struts.annotation.Results;

import tutorial.entity.Employee;

@Input(path = "/employee/confirm.jsp")
@Results( {
	@Result(name = "list", path = "/employee/list.do", redirect = true),
	@Result(name = "edit", path = "/employee/edit.do?edit2=true") })
public class ConfirmAction {

	@ActionForm
	public EmployeeDto employeeDto;

	public JdbcManager jdbcManager;

	@Execute
	public String confirm() {
		return "input";
	}

	@Execute
	public String store() {
		jdbcManager
			.update(Beans.createAndCopy(Employee.class, employeeDto).execute())
			.execute();
		return "list";
	}

	@Execute
	public String backToEdit() {
		return "edit";
	}

	@Execute
	public String backToList() {
		return "list";
	}
}
