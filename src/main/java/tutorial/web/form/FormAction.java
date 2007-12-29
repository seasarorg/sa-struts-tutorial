package tutorial.web.form;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class FormAction {

	@ActionForm
	public FormDto formDto;

	@Execute(validator = false)
	public String execute() {
		return "first.jsp";
	}

	@Execute(validator = false)
	public String goSecond() {
		return "second.jsp";
	}

	@Execute(validator = false)
	public String goThird() {
		return "third.jsp";
	}
}