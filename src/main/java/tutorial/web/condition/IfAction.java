package tutorial.web.condition;

import org.seasar.struts.annotation.Execute;

public class IfAction {

	public String hoge;

	@Execute(validator = false)
	public String execute() {
		return "if.jsp";
	}
}