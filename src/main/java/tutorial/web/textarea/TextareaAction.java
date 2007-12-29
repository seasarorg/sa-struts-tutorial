package tutorial.web.textarea;

import org.seasar.struts.annotation.Execute;

public class TextareaAction {

	public String textarea;

	@Execute(validator = false)
	public String execute() {
		textarea = "初期値";
		return "textarea.jsp";
	}

	@Execute(validator = false)
	public String submit() {
		return "textarea.jsp";
	}
}