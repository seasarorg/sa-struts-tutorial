package tutorial.action;

import org.seasar.struts.annotation.Execute;

public class ConditionAction {

	public String hoge;

	@Execute(validator = false)
	public String index() {
		return "condition.jsp";
	}
}