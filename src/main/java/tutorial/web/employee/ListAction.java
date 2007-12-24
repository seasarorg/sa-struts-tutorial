package tutorial.web.employee;

import java.util.List;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Result;

import tutorial.entity.Employee;

@Result(path = "/employee/list.jsp")
public class ListAction {

	public List<Employee> empItems;

	public JdbcManager jdbcManager;

	@Execute
	public String execute() {
		empItems = jdbcManager
			.from(Employee.class)
			.orderBy("id")
			.getResultList();
		return "success";
	}
}
