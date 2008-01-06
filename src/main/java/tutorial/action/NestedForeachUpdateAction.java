package tutorial.action;

import java.util.ArrayList;
import java.util.List;

import org.seasar.struts.annotation.Execute;

import tutorial.entity.Employee;

public class NestedForeachUpdateAction {

	public List<List<Employee>> empItemsItems = new ArrayList<List<Employee>>();

	@Execute(validator = false)
	public String index() {
		for (int i = 0; i < 10; i++) {
			List<Employee> empItems = new ArrayList<Employee>();
			for (int j = 0; j < 2; j++) {
				Employee e = new Employee();
				e.id = i * 10 + j;
				e.name = "name" + i + j;
				empItems.add(e);
			}
			empItemsItems.add(empItems);
		}
		return "nestedForeachUpdate.jsp";
	}

	@Execute(validator = false)
	public String submit() {
		return "nestedForeachUpdate.jsp";
	}
}