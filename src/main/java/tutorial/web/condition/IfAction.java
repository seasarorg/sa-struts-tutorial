package tutorial.web.condition;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Result;

@Result(name = "if", path = "/condition/if.jsp")
public class IfAction {

	public String hoge;

	@Execute(validator = false)
	public String execute() {
		return "if";
	}
}