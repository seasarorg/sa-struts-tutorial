package tutorial.web.checkbox;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Result;

@Result(name = "checkbox", path = "/checkbox/checkbox.jsp")
public class CheckboxAction {

	public boolean check1;

	public boolean check2;

	@Execute(validator = false)
	public String execute() {
		check2 = true;
		return "checkbox";
	}

	@Execute(input = "checkbox")
	public String submit() {
		return "checkbox";
	}

	public void reset() {
		check1 = false;
		check1 = false;
	}
}