package tutorial.web.validator;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Required;

public class JsValidatorAction {

	@Required
	public String text;

	@Execute(validator = false)
	public String execute() {
		return "jsValidator.jsp";
	}

	@Execute(input = "jsValidator.jsp")
	public String submit() {
		return "jsValidator.jsp";
	}
}