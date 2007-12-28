package tutorial.web.multibox;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Result;

@Result(name = "multibox", path = "/multibox/multibox.jsp")
public class MultiboxAction {

	public String[] checks;

	@Execute(validator = false)
	public String execute() {
		checks = new String[] { "Check1" };
		return "multibox";
	}

	@Execute(validator = false)
	public String submit() {
		return "multibox";
	}
}