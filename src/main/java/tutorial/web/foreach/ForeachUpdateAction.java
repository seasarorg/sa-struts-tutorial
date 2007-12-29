package tutorial.web.foreach;

import java.util.ArrayList;
import java.util.List;

import org.seasar.struts.annotation.Execute;

import tutorial.entity.Employee;

public class ForeachUpdateAction {

	public List<Employee> empItems = new ArrayList<Employee>();

	@Execute(validator = false)
	public String execute() {
		for (int i = 0; i < 10; i++) {
			Employee e = new Employee();
			e.id = i;
			e.name = "name" + i;
			empItems.add(e);
		}
		return "foreachUpdate.jsp";
	}

	@Execute(validator = false)
	public String submit() {
		return "foreachUpdate.jsp";
	}
}
