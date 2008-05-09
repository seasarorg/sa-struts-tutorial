package tutorial.action;

import org.seasar.struts.annotation.Execute;

public class CheckboxAction {

	public boolean check1;

	public boolean check2;

	@Execute(validator = false)
	public String index() {
		check2 = true;
		return "index.jsp";
	}

	@Execute(validator = false)
	public String submit() {
		return "index.jsp";
	}
}