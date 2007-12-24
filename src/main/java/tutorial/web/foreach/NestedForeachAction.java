package tutorial.web.foreach;

import java.util.ArrayList;
import java.util.List;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Result;

import tutorial.entity.Employee;

@Result(path = "/foreach/nestedForeach.jsp")
public class NestedForeachAction {

	public List<List<Employee>> empItemsItems = new ArrayList<List<Employee>>();

	@Execute
	public String execute() {
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
		return "success";
	}
}
