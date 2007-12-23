package tutorial.web.checkbox;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Result;

@Result(path = "/checkbox/checkbox.jsp")
public class CheckboxAction {

	public boolean check1;

	public boolean check2;

	@Execute
	public String execute() {
		check2 = true;
		return "success";
	}

	@Execute
	public String submit() {
		return "success";
	}

	public void reset() {
		check1 = false;
		check1 = false;
	}
}