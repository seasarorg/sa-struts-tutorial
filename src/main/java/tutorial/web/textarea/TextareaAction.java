package tutorial.web.textarea;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Result;

@Result(name = "textarea", path = "/textarea/textarea.jsp")
public class TextareaAction {

	public String textarea;

	@Execute(validator = false)
	public String execute() {
		textarea = "初期値";
		return "textarea";
	}

	@Execute(validator = false)
	public String submit() {
		return "textarea";
	}
}