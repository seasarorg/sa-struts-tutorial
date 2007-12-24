package tutorial.web.foreach;

import java.util.ArrayList;
import java.util.List;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Result;

import tutorial.entity.Employee;

@Result(path = "/foreach/foreachUpdate.jsp")
public class ForeachUpdateAction {

	public List<Employee> empItems = new ArrayList<Employee>();

	@Execute
	public String execute() {
		for (int i = 0; i < 10; i++) {
			Employee e = new Employee();
			e.id = i;
			e.name = "name" + i;
			empItems.add(e);
		}
		return "success";
	}

	@Execute
	public String submit() {
		return "success";
	}
}
