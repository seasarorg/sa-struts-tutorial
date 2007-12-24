package tutorial.web.textarea;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Result;

@Result(path = "/textarea/textarea.jsp")
public class TextareaAction {

	public String textarea;

	@Execute
	public String execute() {
		textarea = "初期値";
		return "success";
	}

	@Execute
	public String submit() {
		return "success";
	}
}