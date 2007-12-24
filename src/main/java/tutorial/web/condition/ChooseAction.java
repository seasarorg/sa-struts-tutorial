package tutorial.web.condition;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Result;

@Result(path = "/condition/choose.jsp")
public class ChooseAction {

	public String hoge;

	@Execute
	public String execute() {
		return "success";
	}
}