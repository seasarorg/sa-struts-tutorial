package tutorial.action;

import org.seasar.struts.annotation.Execute;

public class SelectAction {

	public String select;

	@Execute(validator = false)
	public String index() {
		select = "3";
		return "index.jsp";
	}

	@Execute(validator = false)
	public String submit() {
		return "index.jsp";
	}
}