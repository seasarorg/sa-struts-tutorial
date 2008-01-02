package tutorial.web.validator;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class ThirdAction {

	@ActionForm
	public ValidatorDto validatorDto;

	@Execute(input = "second.jsp")
	public String goThird() {
		return "third.jsp";
	}

	@Execute(validator = false)
	public String backSecond() {
		return "second.jsp";
	}

	@Execute(validator = false)
	public String backFirst() {
		return "first.jsp";
	}
}