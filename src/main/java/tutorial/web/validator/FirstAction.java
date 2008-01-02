package tutorial.web.validator;

import org.seasar.struts.annotation.Execute;

public class FirstAction {

	@Execute(validator = false)
	public String execute() {
		return "first.jsp";
	}
}