package tutorial.action;

import org.seasar.struts.annotation.Execute;

public class TextareaAction {

	public String textarea;

	@Execute(validator = false)
	public String index() {
		textarea = "初期値";
		return "textarea.jsp";
	}

	@Execute(validator = false)
	public String submit() {
		return "textarea.jsp";
	}
}