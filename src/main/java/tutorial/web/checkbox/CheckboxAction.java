package tutorial.web.checkbox;

import org.seasar.struts.annotation.Execute;

public class CheckboxAction {

	public boolean check1;

	public boolean check2;

	@Execute(validator = false)
	public String execute() {
		check2 = true;
		return "checkbox.jsp";
	}

	@Execute(validator = false)
	public String submit() {
		return "checkbox.jsp";
	}
}