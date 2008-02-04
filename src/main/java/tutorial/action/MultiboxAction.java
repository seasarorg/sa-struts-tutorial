package tutorial.action;

import org.seasar.struts.annotation.Execute;

public class MultiboxAction {

	public String[] checks = new String[0];

	@Execute(validator = false)
	public String index() {
		checks = new String[] { "Check1" };
		return "multibox.jsp";
	}

	@Execute(validator = false)
	public String submit() {
		return "multibox.jsp";
	}
}