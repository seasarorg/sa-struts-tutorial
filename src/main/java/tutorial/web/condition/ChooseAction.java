package tutorial.web.condition;

import org.seasar.struts.annotation.Execute;

public class ChooseAction {

	public String hoge;

	@Execute(validator = false)
	public String execute() {
		return "choose.jsp";
	}
}