package tutorial.web.multibox;

import org.seasar.struts.annotation.Execute;

public class MultiboxAction {

	public String[] checks;

	@Execute(validator = false)
	public String execute() {
		checks = new String[] { "Check1" };
		return "multibox.jsp";
	}

	@Execute(validator = false)
	public String submit() {
		return "multibox.jsp";
	}
}