package tutorial.web.condition;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Result;

@Result(name = "choose", path = "/condition/choose.jsp")
public class ChooseAction {

	public String hoge;

	@Execute(validator = false)
	public String execute() {
		return "choose";
	}
}