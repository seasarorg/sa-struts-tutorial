package tutorial.action;

import org.seasar.struts.annotation.Execute;

public class TextareaAction {

	public String textarea;

	@Execute(validator = false)
	public String index() {
		textarea = "initial value";
		return "index.jsp";
	}

	@Execute(validator = false)
	public String submit() {
		return "index.jsp";
	}
}