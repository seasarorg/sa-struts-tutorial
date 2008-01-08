package tutorial.action;

import org.seasar.struts.annotation.Execute;

public class ConditionAction {

	public String id;

	@Execute(validator = false, urlPattern = "{id}")
	public String index() {
		return "condition.jsp";
	}
}